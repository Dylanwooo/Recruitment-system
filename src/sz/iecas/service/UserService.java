package sz.iecas.service;

import java.util.List;

import sz.iecas.model.User;

public interface UserService {
	
	//更新个人中心资料
	User updateEmployee(int id,String username,String password,String realname,String phone,String email);
	/** 根据用户名获取用户
	 * @param userName 用户名
	 * @return 
	 */
	User getUserByUserName(String userName);
	
	int getUserByPhone(String phoneNumber);

	
	/**获取所有的用户
	 * @return 所有用户
	 */
	List<User> getAllUser();
	
	/**
	 * 获得应聘者用户
	 */
	List<User> getManagerUser();
	
	/**添加用户
	 * @param user 需要添加的用户信息
	 * @return 成功添加的条数，不为1则表示失败
	 */
	User addUser(User user);
	
	/**使用用户名和密码添加用户
	 * @param name 用户名
	 * @param password 密码1
	 * @return 成功添加的条数，不为1则表示失败
	 */
	User addUserByNameAndPassword(String name, String password, String realName,String roleCode);
	
	/**注册用户
	 * @param name 用户名
	 * @param password 密码
	 * @param realName 真实姓名
	 * @param phoneNumber 手机号
	 * @param email 邮箱
	 * @return 成功添加的条数，不为1则表示失败
	 */
	User registeUser(String name, String password, String realName,String phoneNumber,String email);


	
	/**使用用户名和密码更新用户
	 * @param name 用户名
	 * @param password 密码1
	 * @return 成功添加的条数，不为1则表示失败
	 */
	User updateUserByNameAndPassword(String name, String password, String realName,int id,String roleCode);
	
	/** 根据id删除用户
	 * @param id 用户序号
	 * @return 成功删除的条数，不为1则表示失败
	 */
	int deleteUserById(int id);
	
	/**根据用户名关键字搜索用户
	 * @param name 用户名关键字
	 * @return 符合的用户列表
	 */
	List<User> searchUserByName(String name);

}
