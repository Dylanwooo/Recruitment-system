package sz.iecas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import sz.iecas.dao.ExperienceExtendMapper;
import sz.iecas.dao.ExperienceExtendMapper;
import sz.iecas.model.ExperienceExtend;
import sz.iecas.model.ExperienceExtendExample;
import sz.iecas.model.ExperienceExtend;
import sz.iecas.model.Major;
import sz.iecas.model.ExperienceExtendExample;
import sz.iecas.service.ExperienceExtendService;
import sz.iecas.service.ExperienceExtendService;

@Service
public class ExperienceExtendServiceImpl implements ExperienceExtendService {
@Resource ExperienceExtendMapper Experiencemapper;
	@Override
	public List<ExperienceExtend> getExperienceExtend(int resumeid) {
		ExperienceExtendExample ExperienceExtendExample=new ExperienceExtendExample();
		ExperienceExtendExample.createCriteria().andResumeIdEqualTo(resumeid);
		List<ExperienceExtend>  Experiencelist = Experiencemapper.selectByExampleWithBLOBs(ExperienceExtendExample);

		return Experiencelist;
	}


}