package sz.iecas.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import sz.iecas.dao.MajorMapper;
import sz.iecas.model.JobInfo;
import sz.iecas.model.JobInfoWithBLOBs;
import sz.iecas.model.Major;
import sz.iecas.service.JobInfoService;
import sz.iecas.service.MajorService;

@Controller
public class JobInfoController {

	@Resource JobInfoService jobInfoService;
	@Resource MajorService majorService;
	@RequestMapping("/jobinfo")

	public ModelAndView toJobinfo(HttpServletRequest request) throws ParseException {
		ModelAndView mav = new ModelAndView();

		List<JobInfoWithBLOBs> jobInfos=null;
		Date now=new Date();
	  SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
	  String publishtime=simpleDateFormat.format(now);

		mav.setViewName("jobinfo");
		mav.addObject("publishtime",publishtime);
		
		String type=request.getParameter("type");
		if(type.equals("1"))
		{
			mav.addObject("title", "校园招聘");
		}
		else if(type.equals("2"))
		{
			mav.addObject("title", "社会招聘");
		}
		else mav.addObject("title", "实习生招聘");
		
		mav.addObject("jobtype",type);
		String major=request.getParameter("major");
		String search=request.getParameter("search");
		String status=request.getParameter("status");

		if(search!=null)
		{				
			jobInfos=jobInfoService.getJobInfobysearch(search, Integer.parseInt(type));			
		}
		else if(major!=null)  
			{
			mav.addObject("major",major);
			jobInfos=jobInfoService.getJobInfobyMajor(major,Integer.parseInt(type));
			}
		else if (status!=null) {
			jobInfos=jobInfoService.getJobInfobyJobStatus(Integer.parseInt(type),Integer.parseInt(status));
		}
		else jobInfos=jobInfoService.getAllJobInfo(Integer.parseInt(type));
		int size=jobInfos.size();
		List<Major> majorList = majorService.getAllMajor();
		mav.addObject("majorList", majorList);		
		mav.addObject("jobsize",size);	
		mav.addObject("jobinfolist",jobInfos);
		return mav;
	}
	
	@RequestMapping("/updatejobinfo")
	public ResponseEntity<JobInfo> toEmployee(HttpServletRequest request) {
		String id=request.getParameter("id");
		if(id==null) System.out.println("nimazhale");
		String jobdesc = request.getParameter("jobdesc");
		String jobrequire = request.getParameter("jobrequire");
		String  degree=request.getParameter("degree");
		
		int jobdegree=1;
		if(degree.equals("研究生"))
			jobdegree=2;
		if(degree.equals("博士生"))
			jobdegree=3;
		String number = request.getParameter("number");
		String endtime=request.getParameter("endtime");
		JobInfo jobInfo = jobInfoService.updateJobinfoById(Integer.parseInt(id), jobdesc,jobrequire,jobdegree , Integer.parseInt(number),  endtime);
		return new ResponseEntity<JobInfo>(jobInfo,HttpStatus.OK);
	}
	@RequestMapping("/jobDescribtion")
	public ModelAndView toDescribtion(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("jobDescribtion");
		String id = request.getParameter("id");
		JobInfoWithBLOBs jobInfoWithBLOBs=jobInfoService.getJobInfo(Integer.parseInt(id));
		mav.addObject("jobinfo",jobInfoWithBLOBs);	
		return mav;
	}

	
	@RequestMapping(value = "/deleteJob")
	
	public ResponseEntity<JobInfo> deleteJob(HttpServletRequest request) {
		String idStr = request.getParameter("id");
		int id = Integer.parseInt(idStr);

		jobInfoService.updateJobStatusById(id);

		return new ResponseEntity<JobInfo>(HttpStatus.OK);
	}
	
@RequestMapping(value = "/deletehrJob")
	
	public ResponseEntity<JobInfo> deletehrJob(HttpServletRequest request) {
		String idStr = request.getParameter("id");
		int id = Integer.parseInt(idStr);

		jobInfoService.deleteJobById(id);

		return new ResponseEntity<JobInfo>(HttpStatus.OK);
	}
	@RequestMapping("/addMajor")
	public ResponseEntity<Major> addMajor(HttpServletRequest request){
		String name = request.getParameter("majorName");
		Major major = majorService.addMajor(name);
		return new ResponseEntity<Major>(major,HttpStatus.OK);
	}
	@RequestMapping("/deleteMajor")
	public ResponseEntity<Major> deleteMajor(HttpServletRequest request){
		int id =Integer.parseInt(request.getParameter("majorId"));
		majorService.deleteMajor(id);
		Major major = new Major();
		return new ResponseEntity<Major>(major,HttpStatus.OK);
	}
	
		
}
