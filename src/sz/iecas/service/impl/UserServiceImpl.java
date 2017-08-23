package sz.iecas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import sz.iecas.dao.ResumeTableMapper;
import sz.iecas.dao.UserMapper;
import sz.iecas.model.ResumeTable;
import sz.iecas.model.ResumeTableExample;
import sz.iecas.model.User;
import sz.iecas.model.UserExample;
import sz.iecas.service.UserService;
import sz.iecas.service.resumeService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	UserMapper userMapper;
	@Resource
	ResumeTableMapper resumeTableMapper;

	@Override
	//通过用户名获取用户
	public User getUserByUserName(String userName) {
		UserExample userExample = new UserExample();
		userExample.createCriteria().andUserNameEqualTo(userName);
		List<User> userlist = userMapper.selectByExample(userExample);
		User user = null;
		if (userlist != null && userlist.size() != 0)
			user = userlist.get(0);
		return user;
	}
	//获取所有用户
	@Override
	public List<User> getAllUser() {
		UserExample userExample = new UserExample();
		userExample.createCriteria().andIdIsNotNull();

		List<User> userlist = userMapper.selectByExample(userExample);

		return userlist;
	}
	
	//获取管理用户
		@Override
		public List<User> getManagerUser() {
			UserExample userExample = new UserExample();
			userExample.createCriteria().andRoleCodeIsNotNull();

			List<User> userlist = userMapper.selectByExample(userExample);

			return userlist;
		}

	
	
	
	//添加用户
	@Override
	public User addUser(User user) {
		if (1 != userMapper.insert(user))
			user = null;
		return user;
	}
	
	//注册用户
	@Override
	public User registeUser(String name, String password, String realName,String phoneNumber,String email) {
		User user = new User();
		user.setUserName(name);
		user.setPassword(password);
		user.setRealName(realName);
		user.setPhoneNumber(phoneNumber);
		user.setEmail(email);		
		userMapper.insertSelective(user);
		return user;
		
	}
	//添加用户
	@Override
	public User addUserByNameAndPassword(String name, String password, String realName,String roleCode) {
		User user = new User();
		user.setUserName(name);
		user.setPassword(password);
		user.setRealName(realName);
		user.setRoleCode(roleCode);
		if (null == addUser(user))
			user = null;

		return user;
	}
	
	//更新用户
	@Override
	public User updateUserByNameAndPassword(String name, String password, String realName,int id,String roleCode)
	{
	
		UserExample userExample=new UserExample();
		userExample.createCriteria().andIdEqualTo(id);
		User user = new User();
		user.setId(id);
		user.setUserName(name);
		user.setPassword(password);
		user.setRealName(realName);
		user.setRoleCode(roleCode);
		
		userMapper.updateByExampleSelective(user, userExample);

		return user;
	}
	//删除用户
	@Override
	public int deleteUserById(int id) {
		return userMapper.deleteByPrimaryKey(id);
	}
	//通过用户名查找用户
	@Override
	public List<User> searchUserByName(String name) {
		name = "%" + name + "%";
		UserExample userExample = new UserExample();
		userExample.createCriteria().andUserNameLike(name);

		List<User> userlist = userMapper.selectByExample(userExample);

		return userlist;
	}
	@Override
	public User updateEmployee(int id,String name,String password,String  realName,String phone,String  email) {
		ResumeTableExample resumeTableExample=new ResumeTableExample();
		User user =userMapper.selectByPrimaryKey(id);
		resumeTableExample.createCriteria().andPhoneEqualTo(user.getPhoneNumber());
		
		ResumeTable resumeTable=new ResumeTable();
		resumeTable.setPhone(phone);
		resumeTable.setEmail(email);
		resumeTable.setName(realName);
		resumeTableMapper.updateByExampleSelective(resumeTable, resumeTableExample);
		
		UserExample userExample=new UserExample();
		userExample.createCriteria().andIdEqualTo(id);	
		user.setUserName(name);
		user.setPassword(password);
		user.setRealName(realName);
		user.setPhoneNumber(phone);
		user.setEmail(email);
		
		
		
		userMapper.updateByExampleSelective(user, userExample);

		return user;
	}
	@Override
	public int getUserByPhone(String phoneNumber) {
		UserExample userExample = new UserExample();
		userExample.createCriteria().andPhoneNumberEqualTo(phoneNumber);
		List<User> userList = userMapper.selectByExample(userExample);		
		return userList.size();
	}


}
