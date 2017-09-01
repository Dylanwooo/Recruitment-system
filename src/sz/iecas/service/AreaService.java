package sz.iecas.service;

import java.util.List;

import sz.iecas.model.Area;

public interface AreaService {

	/**����ʡ��id��ȡ���еĵ���
	 * @param id ����id
	 * @return �����б�
	 */
	List<Area> getAreasByCityId(String id);
	public String getAreaName(String id);

}
