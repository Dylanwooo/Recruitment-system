package sz.iecas.service;

import java.util.List;

import sz.iecas.model.Province;

public interface ProvincesService {
	
	/**获取全部省份
	 * @return 省份列表
	 */
	List<Province> getAllProvince();
	public String getProvinceName(String id);

}
