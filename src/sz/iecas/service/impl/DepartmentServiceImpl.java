package sz.iecas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import sz.iecas.dao.DepartmentInfoMapper;
import sz.iecas.model.DepartmentInfo;
import sz.iecas.model.DepartmentInfoExample;
import sz.iecas.service.DepartmentSerivce;
@Service
public class DepartmentServiceImpl implements DepartmentSerivce {
@Resource DepartmentInfoMapper departmentservice;
	@Override
	public List<DepartmentInfo> getAllDepart() {
		DepartmentInfoExample departmentInfoExample=new DepartmentInfoExample();
		List<DepartmentInfo> departmentInfos=departmentservice.selectByExample(departmentInfoExample);
		return departmentInfos;
	}

}
