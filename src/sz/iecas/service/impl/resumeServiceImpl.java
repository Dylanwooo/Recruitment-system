package sz.iecas.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import sz.iecas.dao.EducationExtendMapper;
import sz.iecas.dao.ExperienceExtendMapper;
import sz.iecas.dao.LanguageExtendMapper;
import sz.iecas.dao.ProjectExtendMapper;
import sz.iecas.dao.ResumeTableMapper;
import sz.iecas.model.EducationExtend;
import sz.iecas.model.ExperienceExtend;
import sz.iecas.model.JobInfo;
import sz.iecas.model.JobInfoWithBLOBs;
import sz.iecas.model.LanguageExtend;
import sz.iecas.model.ProjectExtendWithBLOBs;
import sz.iecas.model.ResumeTable;
import sz.iecas.model.ResumeTableExample;
import sz.iecas.service.JobInfoService;
import sz.iecas.service.resumeService;

@Service
public class resumeServiceImpl implements resumeService {
	@Resource
	JobInfoService jobinfoService;
	@Resource
	ResumeTableMapper resumeTableMapper;
	@Resource
	EducationExtendMapper educationExtendMapper;
	@Resource
	ExperienceExtendMapper experienceExtendMapper;
	@Resource
	LanguageExtendMapper languageExtendMapper;
	@Resource
	ProjectExtendMapper projectExtendMapper;
	
	@Override
	public 	ResumeTable resumeInput(String name, int age, String sex, String birthDate, String phoneNumber, String email,
			String idCard, String address, String awards, String startDate, String graduateDate, int degree,
			String school, String major, String rank, String languageType, int proficiency,String experienceDescription,
			String projectName2, String time2, String role2, String projectDescription2,
			String projectName3, String time3, String role3, String projectDescription3,
			String projectName, String time, String role, String projectDescription,String jobName, int jobType,String majorName,
			String homePro,String homeCity,String homeArea,String schoolProId,String schoolCityId,SimpleDateFormat submitTime,
			String startDate2,String graduateDate2,int degree2,String school2,String major2,String rank2,String languageType2,
			int proficiency2,String experienceDescription2,String schoolProId2,String schoolCityId2,
			String startDate3,String graduateDate3,int degree3,String school3,String major3,String rank3,String languageType3,
			int proficiency3,String experienceDescription3,String schoolProId3,String schoolCityId3,int addEdu,int addPro)	{
		
		ResumeTable resumeTable = new ResumeTable();
		EducationExtend educationExtend = new EducationExtend();
		EducationExtend educationExtend2 = new EducationExtend();
		EducationExtend educationExtend3 = new EducationExtend();
		LanguageExtend languageExtend = new LanguageExtend();
		LanguageExtend languageExtend2 = new LanguageExtend();
		LanguageExtend languageExtend3 = new LanguageExtend();
		ExperienceExtend experienceExtend = new ExperienceExtend();
		ProjectExtendWithBLOBs projectExtendWithBLOBs = new ProjectExtendWithBLOBs();
		ProjectExtendWithBLOBs projectExtendWithBLOBs2 = new ProjectExtendWithBLOBs();
		ProjectExtendWithBLOBs projectExtendWithBLOBs3 = new ProjectExtendWithBLOBs();
		SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-MM-dd");
		String publishtime=dateFormat.format(new Date());
		resumeTable.setSubmittime(publishtime);
		resumeTable.setName(name);
		resumeTable.setAge(age);
		resumeTable.setSex(sex);
		resumeTable.setBirthdate(birthDate);
		resumeTable.setPhone(phoneNumber);
		resumeTable.setEmail(email);
		resumeTable.setId(idCard);
		resumeTable.setAddress(address);
		resumeTable.setAwards(awards);
		resumeTable.setJobname(jobName);
		resumeTable.setJobtype(jobType);
		resumeTable.setMajorName(majorName);
		resumeTable.setStatus("简历投递成功");
		resumeTable.setHighestdegree(addEdu);
		resumeTable.setProvince(homePro);
		resumeTable.setCity(homeCity);
		resumeTable.setArea(homeArea);
		resumeTableMapper.insertSelective(resumeTable);

		educationExtend.setStartdate(startDate);
		educationExtend.setGraduatedate(graduateDate);
		educationExtend.setSchool(school);
		educationExtend.setDegree(degree);
		educationExtend.setMajor(major);
		educationExtend.setRank(rank);
		educationExtend.setResumeId(resumeTable.getResumeId());
		educationExtend.setProvinceId(Integer.parseInt(schoolProId));
		educationExtend.setCityId(Integer.parseInt(schoolCityId));
		educationExtendMapper.insertSelective(educationExtend);	
		

		languageExtend.setLanguageType(languageType);
		languageExtend.setProficiency(proficiency);
		languageExtend.setResumeId(resumeTable.getResumeId());
		languageExtendMapper.insertSelective(languageExtend);
		
		
		experienceExtend.setExperienceDescription(experienceDescription);
		experienceExtend.setResumeId(resumeTable.getResumeId());
		experienceExtendMapper.insertSelective(experienceExtend);
	
		projectExtendWithBLOBs.setProjectsName(projectName);
		projectExtendWithBLOBs.setTime(time);
		projectExtendWithBLOBs.setResumeId(resumeTable.getResumeId());
		projectExtendWithBLOBs.setDescription(projectDescription);
		projectExtendWithBLOBs.setRole(role);
		projectExtendMapper.insertSelective(projectExtendWithBLOBs);
		projectExtendWithBLOBs2.setProjectsName(projectName2);
		projectExtendWithBLOBs2.setTime(time2);
		projectExtendWithBLOBs2.setResumeId(resumeTable.getResumeId());
		projectExtendWithBLOBs2.setDescription(projectDescription2);
		projectExtendWithBLOBs2.setRole(role2);
		projectExtendWithBLOBs3.setProjectsName(projectName3);
		projectExtendWithBLOBs3.setTime(time3);
		projectExtendWithBLOBs3.setResumeId(resumeTable.getResumeId());
		projectExtendWithBLOBs3.setDescription(projectDescription3);
		projectExtendWithBLOBs3.setRole(role3);

		if(addEdu == 2){
			educationExtend2.setStartdate(startDate2);
			educationExtend2.setGraduatedate(graduateDate2);
			educationExtend2.setSchool(school2);
			educationExtend2.setDegree(degree2);
			educationExtend2.setMajor(major2);
			educationExtend2.setRank(rank2);
			educationExtend2.setResumeId(resumeTable.getResumeId());
			educationExtend2.setProvinceId(Integer.parseInt(schoolProId2));
			educationExtend2.setCityId(Integer.parseInt(schoolCityId2));
			educationExtendMapper.insertSelective(educationExtend2);
			languageExtend2.setLanguageType(languageType2);
			languageExtend2.setProficiency(proficiency2);
			languageExtend2.setResumeId(resumeTable.getResumeId());
			languageExtendMapper.insertSelective(languageExtend2);
		}else if (addEdu == 3) {
			educationExtend2.setStartdate(startDate2);
			educationExtend2.setGraduatedate(graduateDate2);
			educationExtend2.setSchool(school2);
			educationExtend2.setDegree(degree2);
			educationExtend2.setMajor(major2);
			educationExtend2.setRank(rank2);
			educationExtend2.setResumeId(resumeTable.getResumeId());
			educationExtend2.setProvinceId(Integer.parseInt(schoolProId2));
			educationExtend2.setCityId(Integer.parseInt(schoolCityId2));
			educationExtend3.setStartdate(startDate3);
			educationExtend3.setGraduatedate(graduateDate3);
			educationExtend3.setSchool(school3);
			educationExtend3.setDegree(degree3);
			educationExtend3.setMajor(major3);
			educationExtend3.setRank(rank3);
			educationExtend3.setResumeId(resumeTable.getResumeId());
			educationExtend3.setProvinceId(Integer.parseInt(schoolProId3));
			educationExtend3.setCityId(Integer.parseInt(schoolCityId3));
			educationExtendMapper.insertSelective(educationExtend2);
			educationExtendMapper.insertSelective(educationExtend3);
			
			languageExtend3.setLanguageType(languageType3);
			languageExtend3.setProficiency(proficiency3);
			languageExtend3.setResumeId(resumeTable.getResumeId());
			languageExtendMapper.insertSelective(languageExtend2);
			languageExtendMapper.insertSelective(languageExtend3);
		}
		if(addPro == 2){
			projectExtendMapper.insertSelective(projectExtendWithBLOBs2);
		}else if (addPro == 3) {
			projectExtendMapper.insertSelective(projectExtendWithBLOBs2);
			projectExtendMapper.insertSelective(projectExtendWithBLOBs3);
		}
		
		return resumeTable;
	}
	
	@Resource
	ResumeTableMapper resumeInfo;
	public ResumeTable getResumeInfo(int id){
		ResumeTable resumeTable = new ResumeTable();
		resumeTable = resumeInfo.selectByPrimaryKey(id);
		
		return resumeTable;
		
	}
	
	@Override
	public void updateResuemStatusById(int resumeId, String status) {
		// TODO Auto-generated method stub
		ResumeTableExample resumeTableExample = new ResumeTableExample();
		resumeTableExample.createCriteria().andResumeIdEqualTo(resumeId);

		ResumeTable resumeTable = new ResumeTable();

		resumeTable.setStatus(status);
	

		resumeTableMapper.updateByExampleSelective(resumeTable, resumeTableExample);

	}

	@Override
	public ResumeTable resumeUpdate(int jobid, int resumeid) {
		ResumeTableExample resumeTableExample=new ResumeTableExample();
		resumeTableExample.createCriteria().andResumeIdEqualTo(resumeid);
		ResumeTable resumeTable=new ResumeTable();
		JobInfoWithBLOBs jobInfo=jobinfoService.getJobInfo(jobid);
		resumeTable.setJobname(jobInfo.getName());
		resumeTable.setJobtype(jobInfo.getType());
		resumeTable.setMajorName(jobInfo.getMajorName());
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("YYYY-MM-dd");
		String submittime=simpleDateFormat.format(new Date());
		resumeTable.setSubmittime(submittime);
		resumeTable.setStatus("简历投递成功");
		resumeTableMapper.updateByExampleSelective(resumeTable, resumeTableExample);
		return resumeTable;
	}

}