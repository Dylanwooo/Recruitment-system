package sz.iecas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import sz.iecas.dao.JobInfoMapper;
import sz.iecas.dao.MajorMapper;
import sz.iecas.model.JobInfo;
import sz.iecas.model.JobInfoExample;
import sz.iecas.model.JobInfoWithBLOBs;
import sz.iecas.model.Major;
import sz.iecas.model.MajorExample;
import sz.iecas.service.JobInfoService;
import sz.iecas.service.MajorService;
@Service

public class MajorServiceImpl implements MajorService {
	@Resource 
	MajorMapper majorMapper;
	@Resource 
	JobInfoMapper jobInfoMapper;
	@Override
	public Major getMajorbyid(int id) {
		MajorExample majorExample=new MajorExample();
		majorExample.createCriteria().andMajorIdEqualTo(id);
		List<Major>  majorList = majorMapper.selectByExample(majorExample);
		Major major = null;
		if (majorList!= null && majorList.size() == 1)
			major= majorList.get(0);
		return major;
	}
	@Override
	public List<Major> getAllMajor(){
		MajorExample majorExample = new MajorExample();
		List<Major> majorList = majorMapper.selectByExample(majorExample);
		return majorList;
	}
	@Override
	public Major addMajor(String majorName) {
		Major major = new Major();
		major.setMajorName(majorName);
		System.out.println(majorName);
		majorMapper.insertSelective(major);
		return major;
	}
	@Override
	
	public int deleteMajor(int id) {
		Major major = majorMapper.selectByPrimaryKey(id);
		String name = major.getMajorName();
		JobInfoExample jobInfoExample = new JobInfoExample();
		jobInfoExample.createCriteria().andMajorNameEqualTo(name);
		List<JobInfoWithBLOBs> jobInfoWithBLOBs = jobInfoMapper.selectByExampleWithBLOBs(jobInfoExample);
		for(int i=0;i<jobInfoWithBLOBs.size();i++){
			jobInfoMapper.deleteByPrimaryKey(jobInfoWithBLOBs.get(i).getId());
		}
		
		return majorMapper.deleteByPrimaryKey(id);
	}

}
