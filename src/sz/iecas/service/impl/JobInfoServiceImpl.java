package sz.iecas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import sz.iecas.dao.JobInfoMapper;
import sz.iecas.model.JobInfo;
import sz.iecas.model.JobInfoExample;
import sz.iecas.model.JobInfoWithBLOBs;
import sz.iecas.service.JobInfoService;

@Service
public class JobInfoServiceImpl implements JobInfoService {

	@Resource 
	JobInfoMapper jobInfoMapper;
	
	@Resource JobInfoMapper jobInforMapper;
	@Override
	public List<JobInfoWithBLOBs> getAllJobInfo(int type) {
		JobInfoExample jobInfoExample=new JobInfoExample();
		jobInfoExample.createCriteria().andTypeEqualTo(type).andJobStatusEqualTo(1);
		List<JobInfoWithBLOBs> jobinfoList=jobInfoMapper.selectByExampleWithBLOBs(jobInfoExample);
		return jobinfoList;
	}
	public List<JobInfoWithBLOBs> getJobInfobyMajor(String name,int type)
	{
		JobInfoExample jobInfoExample=new JobInfoExample();
		jobInfoExample.createCriteria().andMajorNameEqualTo(name).andTypeEqualTo(type).andJobStatusEqualTo(1);
		List<JobInfoWithBLOBs> jobinfoList=jobInfoMapper.selectByExampleWithBLOBs(jobInfoExample);		
		return jobinfoList;
	}

	@Override
	public List<JobInfoWithBLOBs> getJobInfobysearch(String search, int type) {
		JobInfoExample jobInfoExample=new JobInfoExample();
		jobInfoExample.createCriteria().andNameLike("%"+search+"%").andTypeEqualTo(type).andJobStatusEqualTo(1);
		List<JobInfoWithBLOBs> jobinfoList=jobInfoMapper.selectByExampleWithBLOBs(jobInfoExample);		
		return jobinfoList;
	}

	@Override
	public JobInfoWithBLOBs publishJob(String jobName,String workPlace, String major, String publishTime, String jobDesc, 
			String jobRequire, int degreeRequire, String  endTime,int recuitNum,int status,int type,int departmentid,int hot){
		JobInfoWithBLOBs jobInfoWithBLOBs = new JobInfoWithBLOBs();
		
		jobInfoWithBLOBs.setName(jobName);
		jobInfoWithBLOBs.setAddress(workPlace);
		jobInfoWithBLOBs.setMajorName(major);
		jobInfoWithBLOBs.setPublishtime(publishTime);
		jobInfoWithBLOBs.setEndtime(endTime);
		jobInfoWithBLOBs.setJobDesc(jobDesc);
		jobInfoWithBLOBs.setJobRequire(jobRequire);
		jobInfoWithBLOBs.setDegree(degreeRequire);
		jobInfoWithBLOBs.setNum(recuitNum);
		jobInfoWithBLOBs.setJobStatus(status);
		jobInfoWithBLOBs.setType(type);
		jobInfoWithBLOBs.setDepartmentid(departmentid);
		jobInfoWithBLOBs.sethot(hot);
		jobInfoMapper.insertSelective(jobInfoWithBLOBs);
		return jobInfoWithBLOBs;
	}
	
	@Override
	public JobInfoWithBLOBs getJobInfo(int id) {
		
			// TODO Auto-generated method stub
			JobInfoExample jobInfoExample=new JobInfoExample();
			jobInfoExample.createCriteria().andIdEqualTo(id);
			List<JobInfoWithBLOBs>  jobinfoList = jobInfoMapper.selectByExampleWithBLOBs(jobInfoExample);
			JobInfoWithBLOBs jBs = null;
			if (jobinfoList!= null && jobinfoList.size() == 1)
				jBs= jobinfoList.get(0);
			return jBs;
		
	}

	/**
	 * 通过简历的状态查询简历
	 * 发布状态为1，暂存为2，删除为3，过期为4
	 */
	@Override
	public List<JobInfoWithBLOBs>getJobInfobyJobStatus(int type,int JobStatus){
		JobInfoExample jobInfoExample=new JobInfoExample();
		jobInfoExample.createCriteria().andTypeEqualTo(type).andJobStatusEqualTo(JobStatus);
		List<JobInfoWithBLOBs> jobinfoList=jobInfoMapper.selectByExampleWithBLOBs(jobInfoExample);
		return jobinfoList;
	}
	
	@Override
	public JobInfo updateJobStatusById(int id){
		JobInfoExample jobInfoExample=new JobInfoExample();
		jobInfoExample.createCriteria().andIdEqualTo(id);
		JobInfoWithBLOBs job=new JobInfoWithBLOBs();
		job.setJobStatus(3);
		jobInfoMapper.updateByExampleSelective(job, jobInfoExample);
		return job;
	}
	@Override
	public JobInfoWithBLOBs updateJobinfoById(int id,String jobdesc,String jobrequire,int degree,int number,String endtime,int hot) {
		JobInfoExample jobInfoExample=new JobInfoExample();
		jobInfoExample.createCriteria().andIdEqualTo(id);
		JobInfoWithBLOBs job=new JobInfoWithBLOBs();
		job.setDegree(degree);
		job.setEndtime(endtime);
		job.setJobDesc(jobdesc);
		job.setJobRequire(jobrequire);
		job.setNum(number);
		job.setJobStatus(1);
		job.sethot(hot);
		jobInfoMapper.updateByExampleSelective(job, jobInfoExample);
		return job;
	}
	@Override
	public int deleteJobById(int id) {
		return jobInfoMapper.deleteByPrimaryKey(id);
	}
	@Override
	public JobInfoWithBLOBs updateStatusbytime(String time) {
		String now=time.replaceAll("-", "");
		JobInfoExample jobInfoExample=new JobInfoExample();
		jobInfoExample.createCriteria().andJobStatusEqualTo(1);
		List<JobInfoWithBLOBs>  jobinfoList = jobInfoMapper.selectByExampleWithBLOBs(jobInfoExample);	
		for(int i=0;i<jobinfoList.size();i++)
		{
			String endtime=jobinfoList.get(i).getEndtime().replaceAll("-", "");
			if(Integer.parseInt(endtime)<Integer.parseInt(now))
			{
				JobInfoWithBLOBs job=new JobInfoWithBLOBs();
				job.setJobStatus(4);
				jobInfoMapper.updateByPrimaryKeySelective(job);
			}
			
			
			
		}
		return null;
	}
	
	

}
