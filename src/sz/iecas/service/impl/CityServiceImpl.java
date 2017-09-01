package sz.iecas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import sz.iecas.dao.CityMapper;
import sz.iecas.model.City;
import sz.iecas.model.CityExample;
import sz.iecas.model.City;
import sz.iecas.model.CityExample;
import sz.iecas.service.CityService;

@Service
public class CityServiceImpl implements CityService {
	
	@Resource
	CityMapper cityMapper;

	@Override
	public List<City> getCitiesByProvinceId(String id) {
		CityExample cityExample = new CityExample();
		cityExample.createCriteria().andProvinceidEqualTo(id);
		List<City> cityList = cityMapper.selectByExample(cityExample);
		
		return cityList;
	}

	@Override
	public String getCityId(String cityname) {
		CityExample cityExample = new CityExample();
		cityExample.createCriteria().andCityEqualTo(cityname);
		List<City> cityList = cityMapper.selectByExample(cityExample);
		City city = new City();
		if(cityList.size() == 0){
			city = null;
		}else {
			city = cityList.get(0);
		}
		return city.getCityid();
	}

	@Override
	public String getCityName(String id) {
		CityExample CityExample = new CityExample();
		CityExample.createCriteria().andCityidEqualTo(id);
		List<City> CityList = cityMapper.selectByExample(CityExample);
		City City = new City();
		if(CityList.size() == 0){
			City = null;
		}else {
			City = CityList.get(0);
		}
		return City.getCity();
	}

}
