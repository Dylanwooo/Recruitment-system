package sz.iecas.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.swing.plaf.synth.SynthSpinnerUI;

import org.springframework.stereotype.Service;

import sz.iecas.dao.DepartmentInfoMapper;
import sz.iecas.dao.ResumeTableMapper;
import sz.iecas.model.ResumeTable;
import sz.iecas.model.ResumeTableExample;
import sz.iecas.model.ResumeTableExample.Criteria;
import sz.iecas.service.ResumeCenterService;
@Service
public class ResumeCenterServiceImpl implements ResumeCenterService {
@Resource ResumeTableMapper resumeTableMapper;
@Resource DepartmentInfoMapper departmentInfoMapper;
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
	public List<ResumeTable> getResumebyall(String sex, String majorname, String type, String degree, String search,
			String department, String start, String end) 
	{
		ResumeTableExample resumeTableExample=new ResumeTableExample();
		Criteria criteria=resumeTableExample.createCriteria();
		if(sex!=null&&sex!="") criteria.andSexEqualTo(sex);
		if(majorname!=null&&majorname!="" )  criteria.andMajorNameEqualTo(majorname);
		if(type!=null&&type!="") criteria.andJobtypeEqualTo(Integer.parseInt(type) );
		if(degree!=null&&degree!="")  criteria.andHighestdegreeEqualTo(Integer.parseInt(degree));
		if(search!=null&&search!="") criteria.andschoolLike("%"+search+"%");
		if(department!=null&department!="") criteria.anddepartmentidEqualTo(Integer.parseInt(department));
		List<ResumeTable> resumeList=resumeTableMapper.selectmyresume(resumeTableExample);
		if(start!=null&&end!=null&&start!=""&&end!="")
		{
			int n=resumeList.size();
			System.out.println("n="+n);
			if(n==0)  resumeList=getResumebytime(start, end);
			else
			{
			String  Start=null;
			String  End=null;
			Start=start.replaceAll("-", "");
			End=end.replaceAll("-", "");
			
			for(int i=0;i<n;i++)
			{
			System.out.println(resumeList.get(i).getSubmittime());
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
