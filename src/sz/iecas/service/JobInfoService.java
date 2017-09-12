package sz.iecas.service;



import java.util.Date;
import java.util.List;

import sz.iecas.model.JobInfo;
import sz.iecas.model.JobInfoWithBLOBs;

public interface JobInfoService {

	List<JobInfoWithBLOBs> getAllJobInfo(int type);
	List<JobInfoWithBLOBs> getJobInfobyMajor(String major,int type);
	List<JobInfoWithBLOBs>  getJobInfobysearch(String search,int type);
	//通过岗位状态来搜索发布的简历
	List<JobInfoWithBLOBs> getJobInfobyJobStatus(int type,int JobStatus);
	JobInfoWithBLOBs  updateStatusbytime(String time);
	
	
	JobInfoWithBLOBs updateJobinfoById(int id,String jobdesc,String jobrequire,int degree,int number,String endtime,int hot,String majorNamne);
	//通过id删除岗位信息
	int deleteJobById(int id);
	JobInfo updateJobStatusById(int id);

	JobInfoWithBLOBs getJobInfo(int id);
	 JobInfoWithBLOBs publishJob(String jobName,String workPlace, String major, String publishTime, String jobDesc, 
				String jobRequire, int degreeRequire, String endTime,int recuitNum,int status,int type,int departmentid,int hot);
}
