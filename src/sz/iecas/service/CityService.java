package sz.iecas.service;

import java.util.List;

import sz.iecas.model.City;

public interface CityService {

	/**鏍规嵁鐪佷唤id鑾峰彇璇ョ渷鐨勫煄甯�
	 * @param id 鐪佷唤id
	 * @return 鍩庡競鍒楄〃
	 */
	List<City> getCitiesByProvinceId(String id);
	String getCityId(String cityname);
	public String getCityName(String id);

}
