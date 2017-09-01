package sz.iecas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import sz.iecas.dao.ProvinceMapper;
import sz.iecas.model.Province;
import sz.iecas.model.ProvinceExample;
import sz.iecas.service.ProvincesService;

@Service
public class ProvincesServiceImpl implements ProvincesService {
	
	@Resource
	ProvinceMapper provinceMapper;

	@Override
	public List<Province> getAllProvince() {
		ProvinceExample provinceExample = new ProvinceExample();
		provinceExample.createCriteria().andIdIsNotNull();
		List<Province> provincesList = provinceMapper.selectByExample(provinceExample);
		return provincesList;
	}
	public String getProvinceName(String id) {
		ProvinceExample ProvinceExample = new ProvinceExample();
		ProvinceExample.createCriteria().andProvinceidEqualTo(id);
		List<Province> ProvinceList = provinceMapper.selectByExample(ProvinceExample);
		Province Province = new Province();
		if(ProvinceList.size() == 0){
			Province = null;
		}else {
			Province = ProvinceList.get(0);
		}
		return Province.getProvince();
	}


}
