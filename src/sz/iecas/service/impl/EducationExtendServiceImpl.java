package sz.iecas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import sz.iecas.dao.EducationExtendMapper;
import sz.iecas.model.EducationExtend;
import sz.iecas.model.Major;
import sz.iecas.model.EducationExtendExample;
import sz.iecas.service.EducationExtendService;
@Service
public class EducationExtendServiceImpl implements EducationExtendService {
@Resource EducationExtendMapper educationmapper;
	@Override
	public List<EducationExtend> getEducationExtend(int resumeid) {
		EducationExtendExample EducationExtendExample=new EducationExtendExample();
		EducationExtendExample.createCriteria().andResumeIdEqualTo(resumeid);
		List<EducationExtend>  educationlist = educationmapper.selectByExample(EducationExtendExample);
		
		return educationlist;
	}


}
