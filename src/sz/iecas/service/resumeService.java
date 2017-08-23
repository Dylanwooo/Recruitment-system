package sz.iecas.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import sz.iecas.model.ResumeTable;

public interface resumeService {
	/**使用用户名和密码添加用户
	 * @param name 用户名
	 * @param password 密码1
	 * @return 成功添加的条数，不为1则表示失败
	 */
	
	ResumeTable getResumeInfo(int id);
	ResumeTable resumeInput(String name, int age, String sex, String birthDate, String phoneNumber, String email,
			String idCard, String address, String awards, String startDate, String graduateDate, int degree,
			String school, String major, String rank, String languageType, int proficiency,String experienceDescription, 
			String projectName, String time, String role, String projectDescription,
			String projectName2, String time2, String role2, String projectDescription2,
			String projectName3, String time3, String role3, String projectDescription3,
			String jobName, int type,String majorName,
			String homeProId,String homeCityId,String schoolProId,String schoolCityId,SimpleDateFormat submitTime,
			String startDate2,String graduateDate2,int degree2,String school2,String major2,String rank2,String languageType2,
			int proficiency2,String experienceDescription2,String schoolProvinceId2,String schoolCityId2,
			String startDate3,String graduateDate3,int degree3,String school3,String major3,String rank3,String languageType3,
			int proficiency3,String experienceDescription3,String schoolProvinceId3,String schoolCityId3,int addEdu,int addPro);	
	public void updateResuemStatusById(int resumeId, String status);
}

