package sz.iecas.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import sz.iecas.service.JobInfoService;

@Controller
public class IndexController {

	@Resource JobInfoService jobInfoService;
	@RequestMapping("/index")
	public ModelAndView toIndex(HttpServletRequest request) {
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
