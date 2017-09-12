package sz.iecas.controller;

import java.util.List;
/*
 * 简历中心相关controller
 */

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import sz.iecas.model.DepartmentInfo;
import sz.iecas.model.Major;
import sz.iecas.model.ResumeTable;
import sz.iecas.model.User;
import sz.iecas.service.DepartmentSerivce;
import sz.iecas.service.EducationExtendService;
import sz.iecas.service.JobInfoService;
import sz.iecas.service.MajorService;
import sz.iecas.service.ResumeCenterService;

@Controller
public class resumeCenterController {
	@Resource 
	ResumeCenterService resumeCenterService;
	@Resource
	JobInfoService jobInfoService1;
	@Resource
	MajorService majorService;
	@Resource 
	DepartmentSerivce departmentservice;
	@Resource EducationExtendService educationExtendService;
	
	/*
	 * 根据参数不同返回不同的简历list
	 */
	@RequestMapping("/resumeCenter")
	
	public ModelAndView toSelectResume(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("resumeCenter");
		List<ResumeTable> resumeTables=null;
		String major=request.getParameter("major");
		if(major!=null)
		mav.addObject("major",major);
		String sex=request.getParameter("sex");
		if(sex!=null)
		mav.addObject("sex",sex);
		String type=request.getParameter("type");
		if(type!=null)
		mav.addObject("type",type);
		String degree=request.getParameter("degree");
		if(degree!=null)
		mav.addObject("degree",degree);
		String search=request.getParameter("search");
		if(search!=null)
			mav.addObject("search", search);
		String department=request.getParameter("department");
		mav.addObject("department",department);
		String start=request.getParameter("start");
		String end=request.getParameter("end");
		String job=request.getParameter("job");
		String status=request.getParameter("status");
		mav.addObject("status",status);
		mav.addObject("searchjob",job);
		if(sex!=null||major!=null||type!=null||degree!=null||search!=null||department!=null||(start!=null&&end!=null)||job!=null||status!=null)
		{
			
			resumeTables=resumeCenterService.getResumebyall(sex, major, type,degree, search,department, start, end,job,status);
		}	
		else resumeTables=resumeCenterService.getAllResume();
		List<Major> majorList =   majorService.getAllMajor();
		List<DepartmentInfo>  departmentInfos=departmentservice.getAllDepart();
		mav.addObject("departmentList",departmentInfos);
		if(start!=null)
		mav.addObject("start",start);
		if(end!=null)
		mav.addObject("end",end);
		mav.addObject("resumeList",resumeTables);
		mav.addObject("majorList", majorList);
		
		return mav;
	}
	

	/*
	 * 删除简历
	 */
	@RequestMapping(value = "/deleteResume")
	public ResponseEntity<User> deleteResume(HttpServletRequest request) {
		String idStr = request.getParameter("id");
		int id = Integer.parseInt(idStr);

		resumeCenterService.deleteResumeById(id);

		return new ResponseEntity<User>(HttpStatus.OK);
	}
}
