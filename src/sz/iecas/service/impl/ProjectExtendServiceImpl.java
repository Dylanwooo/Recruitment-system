package sz.iecas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import sz.iecas.dao.ProjectExtendMapper;
import sz.iecas.dao.ProjectExtendMapper;
import sz.iecas.model.ProjectExtend;
import sz.iecas.model.ProjectExtendExample;
import sz.iecas.model.ProjectExtendWithBLOBs;
import sz.iecas.model.Major;
import sz.iecas.service.ProjectExtendService;

@Service
public class ProjectExtendServiceImpl implements ProjectExtendService {
@Resource ProjectExtendMapper projectmapper;
	@Override
	public List<ProjectExtendWithBLOBs> getProjectExtend(int resumeid) {
		ProjectExtendExample ProjectExtendExample=new ProjectExtendExample();
		ProjectExtendExample.createCriteria().andResumeIdEqualTo(resumeid);
		List<ProjectExtendWithBLOBs>  projectlist = projectmapper.selectByExampleWithBLOBs(ProjectExtendExample);
		return projectlist;
	}


}