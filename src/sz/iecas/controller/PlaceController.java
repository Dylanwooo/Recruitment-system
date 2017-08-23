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

@Controller
public class PlaceController {

	@Resource
	ProvincesService provincesService;
	@Resource
	CityService cityService;
	@Resource
	AreaService areaService;

	@RequestMapping("/province")
	public ModelAndView toProvince(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("province");

		mav.addObject("title", "省份列表");
		List<Province> provinceList = provincesService.getAllProvince();
		mav.addObject("provinceList", provinceList);

		return mav;

	}

	@RequestMapping("/city")
	public ModelAndView toCity(HttpServletRequest request) {
		String provinceid = request.getParameter("provinceid");

		ModelAndView mav = new ModelAndView();
		mav.setViewName("city");

		mav.addObject("title", "城市列表");
		List<City> cityList = cityService.getCitiesByProvinceId(provinceid);
		mav.addObject("cityList", cityList);

		return mav;

	}
	
	@RequestMapping("/area")
	public ModelAndView toArea(HttpServletRequest request) {
		String cityid = request.getParameter("cityid");

		ModelAndView mav = new ModelAndView();
		mav.setViewName("area");

		mav.addObject("title", "地区列表");
		List<Area> areaList = areaService.getAreasByCityId(cityid);
		mav.addObject("areaList", areaList);

		return mav;

	}

	@ResponseBody
	@RequestMapping(value = "/city_json", method = RequestMethod.GET)
	public ResponseEntity<List<City>> getCityJson(HttpServletRequest request) throws Exception {
		String provinceid = request.getParameter("provinceid");

		List<City> cityList = cityService.getCitiesByProvinceId(provinceid);

		return new ResponseEntity<List<City>>(cityList, HttpStatus.OK);
	}
	@RequestMapping(value = "/area_json", method = RequestMethod.GET)
	public ResponseEntity<List<Area>> getAreaJson(HttpServletRequest request) throws Exception {
		String cityid = request.getParameter("cityid");

		List<Area> areaList = areaService.getAreasByCityId(cityid);

		return new ResponseEntity<List<Area>>(areaList, HttpStatus.OK);
	}

}
