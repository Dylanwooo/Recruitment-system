package sz.iecas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import sz.iecas.dao.DepartmentInfoMapper;
import sz.iecas.dao.EducationExtendMapper;
import sz.iecas.dao.ExperienceExtendMapper;
import sz.iecas.dao.LanguageExtendMapper;
import sz.iecas.dao.ProjectExtendMapper;
import sz.iecas.dao.ResumeTableMapper;
import sz.iecas.model.EducationExtendExample;
import sz.iecas.model.ExperienceExtendExample;
import sz.iecas.model.LanguageExtendExample;
import sz.iecas.model.ProjectExtendExample;
import sz.iecas.model.ResumeTable;
import sz.iecas.model.ResumeTableExample;
import sz.iecas.model.ResumeTableExample.Criteria;
import sz.iecas.service.ResumeCenterService;
@Service
public class ResumeCenterServiceImpl implements ResumeCenterService {
@Resource ResumeTableMapper resumeTableMapper;
@Resource DepartmentInfoMapper departmentInfoMapper;

@Resource
EducationExtendMapper educationMapper;

@Resource
ExperienceExtendMapper experienceExtendMapper;
@Resource
LanguageExtendMapper languageExtendMapper;
@Resource
ProjectExtendMapper projectExtendMapper;
	@Override
	public List<ResumeTable> getAllResume() {
		ResumeTableExample resumeTableExample=new ResumeTableExample();
		List<ResumeTable> resumeList=resumeTableMapper.selectmyresume(resumeTableExample);
		return resumeList;
	}

		
	@Override
	//ͨ通过手机号获得简历id
	public int getResumeIdByPhone(String phone){
		ResumeTableExample resumeTableExample=new ResumeTableExample();
		resumeTableExample.createCriteria().andPhoneEqualTo(phone);
		List<ResumeTable> resumeList = resumeTableMapper.selectByExample(resumeTableExample);
		int  id = resumeList.get(0).getResumeId();
		return id;	
	}
	
	@Override
	public void updateResumeUploadPathByresumeId(int id,String workplace){
		ResumeTableExample resumeTableExample = new ResumeTableExample();
		resumeTableExample.createCriteria().andResumeIdEqualTo(id);
		ResumeTable resumeTable = new ResumeTable();
	
		resumeTable.setWorkplace(workplace);
		System.out.println("success!");
		resumeTableMapper.updateByExampleSelective(resumeTable,resumeTableExample);
		
	}
	
	@Override
	public ResumeTable getResumebyphone(String phone) {
		ResumeTableExample resumeTableExample=new ResumeTableExample();
		resumeTableExample.createCriteria().andPhoneEqualTo(phone);
		List<ResumeTable> resumeList=resumeTableMapper.selectByExample(resumeTableExample);
		ResumeTable resumeTable = null;
		if (resumeList!=null && resumeList.size() !=0)
			resumeTable= resumeList.get(0);
		return resumeTable;
	}

	@Override
	public List<ResumeTable> getAllForFile(){
		ResumeTableExample resumeTableExample=new ResumeTableExample();
		resumeTableExample.createCriteria().andWorkplaceIsNotNull().andWorkplaceNotEqualTo("");
		List<ResumeTable> resumeList=resumeTableMapper.selectByExample(resumeTableExample);
		return resumeList;
	}
	
	@Override
	public List<ResumeTable> getResumebytime(String start, String end) {
		ResumeTableExample resumeTableExample=new ResumeTableExample();
		List<ResumeTable> resumeList=resumeTableMapper.selectmyresume(resumeTableExample);
		String  Start=null;
		String  End=null;
		Start=start.replaceAll("-", "");
		End=end.replaceAll("-", "");
		int n=resumeList.size();
		for(int i=0;i<n;i++)
		{
			String submittime = resumeList.get(i).getSubmittime().replaceAll("-", "");
			
			if(Integer.parseInt(submittime)>Integer.parseInt(End)||Integer.parseInt(submittime)<Integer.parseInt(Start))
			{ 
				resumeList.remove(resumeList.get(i));
				i--;
				n--;
			}
		}
		for(ResumeTable r:resumeList)
		{
			System.out.println(r.getName()+r.getSubmittime().replaceAll("-", "")+r.getSchool());
		}		
			return resumeList;
	}
	
	@Override
	public int deleteResumeById(int id) {
		resumeTableMapper.deleteByPrimaryKey(id);
		EducationExtendExample extendExample=new EducationExtendExample();
		extendExample.createCriteria().andResumeIdEqualTo(id);
		educationMapper.deleteByExample(extendExample);
		LanguageExtendExample languageExtendExample=new LanguageExtendExample();
		languageExtendExample.createCriteria().andResumeIdEqualTo(id);
		languageExtendMapper.deleteByExample(languageExtendExample);
		ProjectExtendExample projectExtendExample=new ProjectExtendExample();
		projectExtendExample.createCriteria().andResumeIdEqualTo(id);
		projectExtendMapper.deleteByExample(projectExtendExample);
		ExperienceExtendExample experienceExtendExample=new ExperienceExtendExample();
		experienceExtendExample.createCriteria().andResumeIdEqualTo(id);

		experienceExtendMapper.deleteByExample(experienceExtendExample);			

		return 0;
	}
	@Override
	public List<ResumeTable> getResumebyall(String sex, String majorname, String type, String degree, String search,
			String department, String start, String end,String job,String Status) 
	{
		ResumeTableExample resumeTableExample=new ResumeTableExample();
		Criteria criteria=resumeTableExample.createCriteria();
		if(sex!=null&&sex.length()>0) criteria.andSexEqualTo(sex);
		if(majorname!=null&&majorname.length()>0 )  criteria.andMajorNameEqualTo(majorname);
		if(type!=null&&type.length()>0) criteria.andJobtypeEqualTo(Integer.parseInt(type) );
		if(degree!=null&&degree.length()>0)  criteria.andHighestdegreeEqualTo(Integer.parseInt(degree));
		if(search!=null&&search.length()>0) criteria.andschoolLike("%"+search+"%");
		if(department!=null&&department.length()>0) criteria.anddepartmentidEqualTo(Integer.parseInt(department));
		if(job!=null&&job.length()>0) criteria.andJobnameLike("%"+job+"%");
		if(Status!=null&&Status.length()>0) criteria.andStatusEqualTo(Status);
		List<ResumeTable> resumeList=resumeTableMapper.selectmyresume(resumeTableExample);
		if(start!=null&&end!=null&&start!=""&&end!="")
		{
			int n=resumeList.size();
			if(n==0)  return resumeList;
			else
			{
			String  Start=null;
			String  End=null;
			Start=start.replaceAll("-", "");
			End=end.replaceAll("-", "");
			
			for(int i=0;i<n;i++)
			{
				String submittime = resumeList.get(i).getSubmittime().replaceAll("-", "");
				
				if(Integer.parseInt(submittime)>Integer.parseInt(End)||Integer.parseInt(submittime)<Integer.parseInt(Start))
				{ 
					resumeList.remove(resumeList.get(i));
					i--;
					n--;
				}
			}
			}
		}	
		return resumeList;
	}
	
}
