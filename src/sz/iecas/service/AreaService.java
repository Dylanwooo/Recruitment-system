package sz.iecas.service;

import java.util.List;

import sz.iecas.model.Area;

public interface AreaService {

	/**根据省份id获取该市的地区
	 * @param id 城市id
	 * @return 地区列表
	 */
	List<Area> getAreasByCityId(String id);

}
