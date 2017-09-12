package sz.iecas.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sz.iecas.dao.MajorMapper;
import sz.iecas.dao.RecruitprocessMapper;
import sz.iecas.model.DepartmentInfo;
import sz.iecas.model.JobInfo;
import sz.iecas.model.JobInfoWithBLOBs;
import sz.iecas.model.Major;
import sz.iecas.model.Recruitprocess;
import sz.iecas.model.User;
import sz.iecas.service.DepartmentSerivce;
import sz.iecas.service.JobInfoService;
import sz.iecas.service.MajorService;
import sz.iecas.service.RecruitService;

@Controller
public class JobInfoController {

	@Resource JobInfoService jobInfoService;
	@Resource MajorService majorService;
	@Resource RecruitService recruitservice;
	@Resource DepartmentSerivce departmentservice;
	@RequestMapping("/jobinfoselect")
	public ResponseEntity<List<JobInfoWithBLOBs>> tojobInfo(HttpServletRequest request) {
		String major=request.getParameter("major");
		String search=request.getParameter("search");
		String status=request.getParameter("status");
		String type=request.getParameter("type");
		List<JobInfoWithBLOBs> jobInfos=null;
		if(search!=null)
			
		{			
			jobInfos=jobInfoService.getJobInfobysearch(search, Integer.parseInt(type));			
		}
		else if(major!=null)  
			{
		
			jobInfos=jobInfoService.getJobInfobyMajor(major,Integer.parseInt(type));
			}
		else if (status!=null) {
			jobInfos=jobInfoService.getJobInfobyJobStatus(Integer.parseInt(type),Integer.parseInt(status));
		}
		else jobInfos=jobInfoService.getAllJobInfo(Integer.parseInt(type));
		return new ResponseEntity<List<JobInfoWithBLOBs>>(jobInfos,HttpStatus.OK);
	}

	@RequestMapping("/jobinfo")
	public ModelAndView toJobinfo(HttpServletRequest request) throws ParseException {
		ModelAndView mav = new ModelAndView();
		List<Recruitprocess> recruitprocesses=recruitService.getallprocess();
		mav.addObject("recruitlist",recruitprocesses);
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
		
			jobInfos=jobInfoService.getJobInfobyMajor(major,Integer.parseInt(type));
			}
		else if (status!=null) {
			jobInfos=jobInfoService.getJobInfobyJobStatus(Integer.parseInt(type),Integer.parseInt(status));
		}
		else jobInfos=jobInfoService.getAllJobInfo(Integer.parseInt(type));

		List<Major> majorList =   majorService.getAllMajor();
		List<DepartmentInfo>  departmentInfos=departmentservice.getAllDepart();
		mav.addObject("departmentList",departmentInfos);
		mav.addObject("majorList", majorList);		
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
		String hot=request.getParameter("hot");
		String majorName = request.getParameter("majorName");
		int jobdegree=1;
		if(degree.equals("研究生"))
			jobdegree=2;
		if(degree.equals("博士生"))
			jobdegree=3;
		String number = request.getParameter("number");
		String endtime=request.getParameter("endtime");
		JobInfo jobInfo = jobInfoService.updateJobinfoById(Integer.parseInt(id), jobdesc,jobrequire,jobdegree , Integer.parseInt(number),  endtime,Integer.parseInt(hot),majorName);
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
		String hot=request.getParameter("hot");
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
					jobRequire,degreeRequire,endTime,recuitNum,1,type,department,Integer.parseInt(hot));
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
		String hot=request.getParameter("hot");
		int degreeRequire = 1;
		String endTime = request.getParameter("endTime");
		int recuitNum = Integer.parseInt(request.getParameter("recuitNum"));
		String typer = request.getParameter("type");
		if(strdegreeRequire.equals("本科")){
			degreeRequire = 1;
		}else if (strdegreeRequire.equals("硕士")) {
			degreeRequire = 2;
		}else degreeRequire = 3;
		int type=Integer.parseInt(typer);
		int department=Integer.parseInt(departmentid);
		JobInfo jobInfo = jobInfoService.publishJob(jobName,workPlace,major,publishTime,jobDesc, 
				jobRequire,degreeRequire,endTime,recuitNum,2,type,department,Integer.parseInt(hot));
		return new ResponseEntity<JobInfo>(jobInfo,HttpStatus.OK);
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
	public ResponseEntity<String> addMajor(HttpServletRequest request){
		String name = request.getParameter("majorName");
		String info = "";
		if(name.equals("")){
			info = "分类名称不能为空!";
			return new ResponseEntity<String>(info,HttpStatus.BAD_REQUEST);
		}
		else{
			majorService.addMajor(name);		
			return new ResponseEntity<String>(info,HttpStatus.OK);
		}		
	}
	@RequestMapping("/deleteMajor")
	public ResponseEntity<Major> deleteMajor(HttpServletRequest request){
		int id =Integer.parseInt(request.getParameter("majorId"));
		majorService.deleteMajor(id);
		Major major = new Major();
		return new ResponseEntity<Major>(major,HttpStatus.OK);
	}
	
	
	@Resource RecruitService recruitService;
	@RequestMapping("/RecruitProcess")
	public ModelAndView toProcess(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("RecruitProcess");
		List<Recruitprocess> recruitprocesses=recruitService.getallprocess();
		mav.addObject("recruitlist",recruitprocesses);
		return mav;
	}
	@RequestMapping("/addSchedule")
	public ResponseEntity<Integer> addschedule(HttpServletRequest request){
		String date=request.getParameter("date");
		String time=request.getParameter("time");
		String school=request.getParameter("school");
		String place=request.getParameter("place");
		Recruitprocess recruitprocess=recruitService.addRecruit(date, time, school, place);
		return new ResponseEntity<Integer>(recruitprocess.getId(),HttpStatus.OK);
	}
	
	@RequestMapping("/delSchedule")
	public ResponseEntity<Integer> delschedule(HttpServletRequest request){
		
		String id=request.getParameter("id");
		recruitService.deleteRecruitbyId(Integer.parseInt(id));
		return new ResponseEntity<Integer>(HttpStatus.OK);
	}
	
	@RequestMapping("/updateProcess")
	public ResponseEntity<Recruitprocess> updateProcess(HttpServletRequest request){
	
		
		String id=request.getParameter("id");
		String date=request.getParameter("date");
		String time=request.getParameter("time");
		String school=request.getParameter("school");
		String place=request.getParameter("place");
		Recruitprocess recruitprocess=recruitService.updateProcess(Integer.parseInt(id), date, time, school, place);		
		return new ResponseEntity<Recruitprocess>(recruitprocess,HttpStatus.OK);
	}
	
	
	
		
}
