package sz.iecas.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import sz.iecas.model.City;
import sz.iecas.service.CityService;

@Controller
public class GetCityController{
	@Resource
	CityService cityService;
	@RequestMapping("/getCity")
	public ResponseEntity<List<City>> getCity(HttpServletRequest request){
		String id = request.getParameter("id");
		List<City> cityList = cityService.getCitiesByProvinceId(id);
		return new ResponseEntity<List<City>>(cityList,HttpStatus.OK);
	}
	
	
}