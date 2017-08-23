package sz.iecas.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.jdbc.Null;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import sz.iecas.model.JobInfo;
import sz.iecas.model.Major;
import sz.iecas.model.ResumeTable;
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
	@Resource EducationExtendService educationExtendService;
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
		String department=request.getParameter("department");
		mav.addObject("department",department);
		String start=request.getParameter("start");
		String end=request.getParameter("end");
		if(sex!=null||major!=null||type!=null||degree!=null||search!=null||department!=null||(start!=null&&end!=null))
		{
			
			resumeTables=resumeCenterService.getResumebyall(sex, major, type,degree, search,department, start, end);
		}
		
		else resumeTables=resumeCenterService.getAllResume();
		List<Major> majorList = majorService.getAllMajor();
		if(search!=null)
		mav.addObject("search", search);
		if(start!=null)
		mav.addObject("start",start);
		if(end!=null)
		mav.addObject("end",end);
		mav.addObject("resumeList",resumeTables);
		mav.addObject("majorList", majorList);
		
		return mav;
	}
	
	@Resource
	JobInfoService jobInfoService;
	
	@RequestMapping(value = "/publishJob", method = RequestMethod.POST)
	public ResponseEntity<String> publishJob(HttpServletRequest request) throws ParseException, java.text.ParseException{
		String jobName = request.getParameter("jobName");
		String workPlace = request.getParameter("workPlace");
		String major = request.getParameter("major");
		String publishTime = request.getParameter("publishTime");
		String jobDesc = request.getParameter("jobDesc");
		String jobRequire = request.getParameter("jobRequire");
		String strdegreeRequire = request.getParameter("degreeRequire");
		String departmentid=request.getParameter("departmentid");
		int degreeRequire = 1;
		String endTime = request.getParameter("endTime");		
		String typer = request.getParameter("type");			
		String info = null;
		if(strdegreeRequire.equals("本科")){
			degreeRequire = 1;
		}else if (strdegreeRequire.equals("硕士")) {
			degreeRequire = 2;
		}else degreeRequire = 3;
		
		if(jobName.equals("")){
			info = "岗位名不能为空!";
			return new ResponseEntity<String>(info,HttpStatus.BAD_REQUEST);
		}else if (request.getParameter("recuitNum").equals("")) {
			info = "招聘人数不能为空!";
			return new ResponseEntity<String>(info,HttpStatus.BAD_REQUEST);
		}else if (endTime.equals("")) {
			info = "截止时间不能为空!";
			return new ResponseEntity<String>(info,HttpStatus.BAD_REQUEST);
		}else {
			int recuitNum = Integer.parseInt(request.getParameter("recuitNum"));
			int type=Integer.parseInt(typer);
			int department=Integer.parseInt(departmentid);
			JobInfo jobInfo = jobInfoService.publishJob(jobName,workPlace,major,publishTime,jobDesc, 
					jobRequire,degreeRequire,endTime,recuitNum,1,type,department);
			return new ResponseEntity<String>(info,HttpStatus.OK);
		}
		
	}
	
	@RequestMapping(value = "/tempJob", method = RequestMethod.POST)
	public ResponseEntity<JobInfo> tempJob(HttpServletRequest request) throws ParseException, java.text.ParseException{
		String jobName = request.getParameter("jobName");
		String workPlace = request.getParameter("workPlace");
		String major = request.getParameter("major");
		String publishTime = request.getParameter("publishTime");
		String jobDesc = request.getParameter("jobDesc");
		String jobRequire = request.getParameter("jobRequire");
		String strdegreeRequire = request.getParameter("degreeRequire");
		String departmentid=request.getParameter("departmentid");
		int degreeRequire = 1;
		String endTime = request.getParameter("endTime");
		int recuitNum = Integer.parseInt(request.getParameter("recuitNum"));
		String typer = request.getParameter("type");
		if(strdegreeRequire.equals("本科")){
			degreeRequire = 1;
		}else if (strdegreeRequire.equals("硕士")) {
			degreeRequire = 2;
		}else degreeRequire = 3;
		
		JobInfo jobInfo = jobInfoService.publishJob(jobName,workPlace,major,publishTime,jobDesc, 
				jobRequire,degreeRequire,endTime,recuitNum,2,Integer.parseInt(typer),Integer.parseInt(departmentid));
		return new ResponseEntity<JobInfo>(jobInfo,HttpStatus.OK);
	}
	

}
