package sz.iecas.service;

import java.util.List;


import sz.iecas.model.ProjectExtendWithBLOBs;

public interface ProjectExtendService {
	List<ProjectExtendWithBLOBs> getProjectExtend (int resumeId);
}