package sz.iecas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import sz.iecas.dao.AreaMapper;
import sz.iecas.model.Area;
import sz.iecas.model.AreaExample;
import sz.iecas.model.Area;
import sz.iecas.model.AreaExample;
import sz.iecas.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService {
	
	@Resource
	AreaMapper AreaMapper;

	@Override
	public List<Area> getAreasByCityId(String id) {
		AreaExample AreaExample = new AreaExample();
		AreaExample.createCriteria().andCityidEqualTo(id);
		
		List<Area> AreaList = AreaMapper.selectByExample(AreaExample);
		
		return AreaList;
	}

	@Override
	public String getAreaName(String id) {
		AreaExample AreaExample = new AreaExample();
		AreaExample.createCriteria().andAreaidEqualTo(id);
		List<Area> AreaList = AreaMapper.selectByExample(AreaExample);
		Area Area = new Area();
		if(AreaList.size() == 0){
			Area = null;
		}else {
			Area = AreaList.get(0);
		}
		return Area.getArea();
	}

	

}
