package sz.iecas.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.remoting.RemoteTimeoutException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sz.iecas.dao.UserMapper;
import sz.iecas.model.JobInfoWithBLOBs;
import sz.iecas.model.Major;
import sz.iecas.model.ResumeTable;
import sz.iecas.model.User;
import sz.iecas.service.JobInfoService;
//import sz.iecas.service.MajorService;
import sz.iecas.service.ResumeCenterService;
import sz.iecas.service.UserService;

@Controller
public class UserController {

	@Resource
	UserService userService;
	@Resource
	JobInfoService jobinfoservice;
	@Resource ResumeCenterService resumeCenterservice;
/*
 * 登录页面
 */
	@RequestMapping("/login")
	public ModelAndView toIndex(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		return mav;
	}
	/*
	 * 注册页面
	 */
	@RequestMapping("/register")
	public ModelAndView toRegister(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("RegisterPage");
		return mav;
	}
	
	/*
	 * 个人中心
	 */
	@RequestMapping("/center")
	public ModelAndView toCenter(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("personalCenter");

		String username=request.getParameter("username");
		User user=userService.getUserByUserName(username);

		mav.addObject("user", user);
		ResumeTable resumeTable=null;
		if(user.getPhoneNumber()!=null)
			{
			
			resumeTable=resumeCenterservice.getResumebyphone(user.getPhoneNumber());
			
			}                  
		if(resumeTable==null)
		{
			System.out.println("没有简历序号");
		}
		mav.addObject("resume",resumeTable);
		return mav;
	}
	/*
	 * 投递简历时根据用户电话判断是否已有简历，以及简历是否被回绝
	 * 如果没有简历就可以投递
	 * 如果回绝就可以转投
	 * 否则不能申请第二个岗位
	 */
	@RequestMapping("/isExist")
	public ResponseEntity<String> isExist(HttpServletRequest request) {
		String info = null;
		String userPhone = request.getParameter("phone");
		ResumeTable resumeTable = resumeCenterservice.getResumebyphone(userPhone);
		
		if(resumeTable!=null&&!resumeTable.getStatus().equals("已储备")){
			
			return new ResponseEntity<String>(info, HttpStatus.BAD_REQUEST);
		}
	
		else if (resumeTable == null)  {
			info="可以申请";
			return new ResponseEntity<String>(info, HttpStatus.OK);
		}		
		else {
			String id=resumeTable.getResumeId().toString();
			return new ResponseEntity<String>(id, HttpStatus.OK);
		}
	}
	
	/*
	 * 更新个人中心用户信息
	 */
	@RequestMapping("/updateEmployee")
	public ResponseEntity<User> toEmployee(HttpServletRequest request) {
		String id=request.getParameter("id");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String realname = request.getParameter("realname");
		String phone=request.getParameter("phone");
		String email = request.getParameter("email");
		User user = userService.updateEmployee(Integer.parseInt(id), username, password, realname,phone , email);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}

	/*
	 * 检验登录
	 */
	@RequestMapping(value = "/logincheck", method = RequestMethod.POST)
	public ModelAndView loginCheck(String username, String password, String remember, HttpSession httpSession) {
		ModelAndView mv = new ModelAndView();
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		if (remember != null && remember.equals("on"))
			token.setRememberMe(true);
		else
			remember = "off";
		Subject subject = SecurityUtils.getSubject();
		try {
			// 登录，即身份验证，不需要开发者实现登录检测
			subject.login(token);
			if (subject.isAuthenticated()) {
				User user = userService.getUserByUserName(username);
				httpSession.setAttribute("user", user);
				mv.setViewName("redirect:index?username="+username);
			}
		} catch (IncorrectCredentialsException e) {
			mv.setViewName("login");
			mv.addObject("info", "登录密码错误");
		} catch (UnknownAccountException e) {
			mv.setViewName("login");
			mv.addObject("info", "用户名不存在");
		}
		return mv;
	}

	/*
	 * 注册用户，将数据插入数据库
	 */
	@RequestMapping(value = "/registeUser", method = RequestMethod.POST)
	public ResponseEntity<String> registeUser(HttpServletRequest request,HttpSession httpSession) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String password2 = request.getParameter("password2");
		String realname = request.getParameter("realname");
		String phoneNumber = request.getParameter("phonenumber");
		String email = request.getParameter("email");
		String info = null;
		User userTemp = userService.getUserByUserName(username);
		int phoneUser = userService.getUserByPhone(phoneNumber);
		if(userTemp != null){
			info = "用户名已注册";
			return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);
		}else if (username.equals("")) {
			info = "用户名不能为空!";
			return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);
		}else if (!password.equals(password2) ) {
			info = "密码不一致";
			return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);
		}else if (!email.contains("@")) {
			info = "邮箱格式错误";
			return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);
		}else if (phoneUser != 0) {
			info = "该手机号已注册";
			return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);
		}else if (phoneNumber.length() != 11) {
			info = "手机号格式错误";
			return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);
		}else if (password.equals("")) {
			info = "密码不能为空!";
			return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);
		}else if (realname.equals("")) {
			info = "真实姓名不能为空!";
			return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);
		}else {
			info = "注册成功";
			userService.registeUser(username, password, realname, phoneNumber, email);
			loginCheck(username, password, "off", httpSession);
		}
		return new ResponseEntity<String>(info,HttpStatus.OK); 

	}
	
	@RequiresRoles("manager")
	@RequestMapping("/user")
	//获取所有有角色的用户
	public ModelAndView toManager(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user");
		List<User> userList = userService.getManagerUser();
		mav.addObject("userList", userList);
		return mav;
	}
	

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public ResponseEntity<User> addUser(HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String realname = request.getParameter("realname");
		String roleCode = request.getParameter("roleCode");
		User user = userService.addUserByNameAndPassword(username, password, realname,roleCode);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	@RequestMapping(value = "/updateUser", method = RequestMethod.POST)
	public ResponseEntity<User> updateUser(HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String realname = request.getParameter("realname");
		String roleCode = request.getParameter("roleCode");
		int id=Integer.parseInt(request.getParameter("id"));
		User user = userService.updateUserByNameAndPassword(username, password, realname,id,roleCode);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/deleteUser")
	public ResponseEntity<User> deleteUser(HttpServletRequest request) {
		String idStr = request.getParameter("id");
		int id = Integer.parseInt(idStr);

		userService.deleteUserById(id);

		return new ResponseEntity<User>(HttpStatus.OK);
	}
}
