package sz.iecas.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import sz.iecas.model.Major;
import sz.iecas.model.User;
import sz.iecas.service.JobInfoService;
import sz.iecas.service.MajorService;
import sz.iecas.service.UserService;

@Controller
public class IndexController {
	
	@Resource UserService userService;
	@Resource JobInfoService jobInfoService;
	@Resource MajorService majorService;
	@RequestMapping("/index")
	public ModelAndView toIndex(HttpServletRequest request) {
		//进入首页更新岗位是否过期
		String username=request.getParameter("username");
		HttpSession session=request.getSession();
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("YYYY-MM-dd");
		String date=simpleDateFormat.format(new Date());		
		  jobInfoService.updateStatusbytime(date);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	}

	@RequestMapping("/aboutme")
	public ModelAndView toAboutme(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("aboutme");

		return mav;
	}
	
	
	@RequestMapping("/feedback")
	public ModelAndView toFeedBack(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("feedback");

		return mav;
	}

}
