package sz.iecas.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import sz.iecas.model.Area;
import sz.iecas.model.City;
import sz.iecas.model.Province;
import sz.iecas.service.AreaService;
import sz.iecas.service.CityService;
import sz.iecas.service.ProvincesService;
/*
 * 地区相关控制器
 */
@Controller
public class PlaceController {

	@Resource
	ProvincesService provincesService;
	@Resource
	CityService cityService;
	@Resource
	AreaService areaService;


	/*
	 * 根据省份id获取城市列表
	 */
	@RequestMapping("/getCity")
	public ResponseEntity<List<City>> getCity(HttpServletRequest request){
		String id = request.getParameter("id");
		List<City> cityList = cityService.getCitiesByProvinceId(id);
		return new ResponseEntity<List<City>>(cityList,HttpStatus.OK);
	}

	/*
	 * 根据城市id获取地区列表
	 */
	@RequestMapping("/getArea")
	public ResponseEntity<List<Area>> getArea(HttpServletRequest request){
		String id = request.getParameter("id");
		List<Area> areaList = areaService.getAreasByCityId(id);
		return new ResponseEntity<List<Area>>(areaList,HttpStatus.OK);
	}



}
