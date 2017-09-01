package sz.iecas.service;

import java.util.List;

import sz.iecas.model.ResumeTable;

public interface ResumeCenterService {
	
	
	List<ResumeTable> getAllResume(); //获取所有简历
	List<ResumeTable> getResumebyall(String sex,String majorname,String type,String degree,String search,String department,String start,String end,String job,String status);

	List<ResumeTable> getResumebytime(String start,String end );
	int getResumeIdByPhone(String phone); //通过登录用户的联系方式获取该用户的简历
	
	void updateResumeUploadPathByresumeId(int id,String path);
	
	
	
	ResumeTable getResumebyphone(String phone); //通过联系方式获取简历
	
	List<ResumeTable> getAllForFile(); 
	
	
	int deleteResumeById(int id);


}
