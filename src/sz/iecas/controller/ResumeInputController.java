package sz.iecas.controller;

import java.text.ParseException;
/*
 * 简历输入相关controller
 */
import java.text.SimpleDateFormat;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sz.iecas.model.JobInfoWithBLOBs;
import sz.iecas.model.Province;
import sz.iecas.service.AreaService;
import sz.iecas.service.CityService;
import sz.iecas.service.JobInfoService;
import sz.iecas.service.ProvincesService;
import sz.iecas.service.ResumeCenterService;
import sz.iecas.service.resumeService;

@Controller
public class ResumeInputController {
	@Resource ResumeCenterService resumeCenterService;
	@Resource
	resumeService resumeService;
	@Resource
	JobInfoService jobInfoService;
	@Resource
	ProvincesService provincesService;
	@Resource
	CityService cityService;
	@Resource
	AreaService areaService;
	/*
	 * 简历输入页面
	 */
	@RequestMapping("/resumeInput")
	public ModelAndView toIndex(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("resumeInput");
		JobInfoWithBLOBs jobInfoWithBLOBs=null;
		
		String id = request.getParameter("id");
		if(id!=null)
		{
		jobInfoWithBLOBs=jobInfoService.getJobInfo(Integer.parseInt(id));
		}
		List<Province> provinceList = provincesService.getAllProvince();
		
		mav.addObject("provinceList", provinceList);
		mav.addObject("jobInfo",jobInfoWithBLOBs);
		return mav;
	}
	
	/*
	 * 提交简历，向数据库中插入简历记录
	 */
	@RequestMapping(value = "/resumeInputer", method = RequestMethod.POST)
	public ResponseEntity<String> resumeInput(HttpServletRequest request) throws ParseException{		
		SimpleDateFormat submitTime = new SimpleDateFormat("yyyy-MM-dd");
		
		int addEdu = Integer.parseInt(request.getParameter("addEdu"));
		int addPro = Integer.parseInt(request.getParameter("addPro"));
//个人信息		

		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String phoneNumber = request.getParameter("phoneNumber");
		String email = request.getParameter("email");
		String idCard = request.getParameter("idCard");
		String address = request.getParameter("address");
		String awards = request.getParameter("awards");
		String birthDate = request.getParameter("birthDate");
//教育经历1		
		String school = request.getParameter("school");
		String major = request.getParameter("major");
		String rank = request.getParameter("rank");
		String languageType = request.getParameter("languageType");
		String experienceDescription = request.getParameter("experienceDescription");
		String graduateDate = request.getParameter("graduateDate");
		String startDate = request.getParameter("startDate");
		int degree = 0;
		int proficiency = 0;
//教育经历2		
		String school2 = request.getParameter("school1");
		String major2 = request.getParameter("major1");
		String rank2 = request.getParameter("rank1");
		String languageType2 = request.getParameter("languageType1");
		String experienceDescription2 = request.getParameter("experienceDescription1");
		String graduateDate2 = request.getParameter("graduateDate1");
		String startDate2 = request.getParameter("startDate1");
		int degree2 = 0;
		int proficiency2 = 0;
//教育经历3		
		String school3 = request.getParameter("school2");
		String major3 = request.getParameter("major2");
		String rank3 = request.getParameter("rank2");
		String languageType3 = request.getParameter("languageType2");
		String experienceDescription3 = request.getParameter("experienceDescription2");
		String graduateDate3 = request.getParameter("graduateDate2");
		String startDate3 = request.getParameter("startDate2");
		int degree3 = 0;
		int proficiency3 = 0;
//项目经历1		
		String projectName = request.getParameter("projectName");
		String time = request.getParameter("time");
		String role = request.getParameter("role");
		String projectDescription = request.getParameter("projectDescription");
//项目经历2		
		String projectName2 = request.getParameter("projectName2");
		String time2 = request.getParameter("time2");
		String role2 = request.getParameter("role2");
		String projectDescription2 = request.getParameter("projectDescription2");
//项目经历3		
		String projectName3 = request.getParameter("projectName3");
		String time3 = request.getParameter("time3");
		String role3 = request.getParameter("role3");
		String projectDescription3 = request.getParameter("projectDescription3");
//岗位信息		
		String jobName = request.getParameter("jobName");	
		String majorName = request.getParameter("majorName");
		int type = Integer.parseInt(request.getParameter("type"));
		
		
		String info = null;
		if (request.getParameter("degree").equals("本科") ){
				degree = 1;	
		}
		else if (request.getParameter("degree").equals("硕士")) {
		 		degree = 2;
		}
		 else {
		 	 degree = 3;
		}
		if(request.getParameter("proficiency").equals("一般")){
			 proficiency = 1;
		}
		else if (request.getParameter("proficiency").equals("熟练")) {
			 proficiency = 2;
		}
		else  {
				proficiency = 3;
		}
		if( addEdu == 2){
			if (request.getParameter("degree1").equals("本科") ){
				degree2 = 1;	
			}
			else if (request.getParameter("degree1").equals("硕士")) {
			 		degree2 = 2;
			}
			 else {
			 	 degree2 = 3;
			}
			if(request.getParameter("proficiency1").equals("一般")){
				 proficiency2 = 1;
			}
			else if (request.getParameter("proficiency1").equals("熟练")) {
				 proficiency2 = 2;
			}
			else  {
					proficiency2 = 3;
			}
		}
		
		if( addEdu == 3){
			if (request.getParameter("degree1").equals("本科") ){
				degree2 = 1;	
			}
			else if (request.getParameter("degree1").equals("硕士")) {
			 		degree2 = 2;
			}
			 else {
			 	 degree2 = 3;
			}
			if(request.getParameter("proficiency1").equals("一般")){
				 proficiency2 = 1;
			}
			else if (request.getParameter("proficiency1").equals("熟练")) {
				 proficiency2 = 2;
			}
			else  {
					proficiency2 = 3;
			}
			
			if (request.getParameter("degree2").equals("本科") ){
				degree3 = 1;	
			}
			else if (request.getParameter("degree2").equals("硕士")) {
			 		degree3 = 2;
			}
			 else {
			 	 degree3 = 3;
			}
			if(request.getParameter("proficiency2").equals("一般")){
				 proficiency3 = 1;
			}
			else if (request.getParameter("proficiency2").equals("熟练")) {
				 proficiency3 = 2;
			}
			else  {
					proficiency3 = 3;
			}
		}
		String homeProvinceId = request.getParameter("homePro");

		String schoolProvinceId = request.getParameter("schoolPro");
		String schoolProvinceId2 = request.getParameter("schoolPro1");
		String schoolProvinceId3 = request.getParameter("schoolPro2");
		
		if(homeProvinceId.equals("请选择")){
			info = "请选择籍贯!";
			return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);
		}
		if(schoolProvinceId.equals("请选择")){
			info = "请选择学校地区!";
			return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);
		}
		if(name.equals("")){
			info = "姓名不能为空!";
			return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);
		}else if (sex==null) {
			info = "性别不能为空!";
			return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);
		}else if (phoneNumber.equals("")) {
			info = "联系方式不能为空!";
			return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);
		}else if (idCard.equals("")) {
			info = "身份证号不能为空!";
			return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);
		}else if (school.equals("")) {
			info = "学校不能为空!";
			return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);
		}else if (major.equals("")) {
			info = "专业不能为空!";
			return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);
		} else if (graduateDate.equals("")) {
			info = "毕业时间不能为空!";
			return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);}
		else if (startDate.equals("")) {
				info = "入学时间不能为空!";
				return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);
		}else if (request.getParameter("age").equals("")) {
			info = "年龄不能为空!";
			return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);
		}else if (idCard.length() != 18) {
			info = "身份证号格式错误!";
			return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);
		}else {
			String homeCityId = request.getParameter("homeCity");
			String homeCity=cityService.getCityName(homeCityId);
			String homeAreaId=request.getParameter("homeArea");
			String homeArea=areaService.getAreaName(homeAreaId);
			String schoolCityId = request.getParameter("schoolCity");			
			String schoolCity2 = null;
			String schoolCity3 = null;
			String schoolCityId2 = null;
			String schoolCityId3 = null;
			if(addEdu == 2 ){
				if(!schoolProvinceId2.equals("请选择")){
					schoolCityId2 = request.getParameter("schoolCity1");		
				
				}
			}else if (addEdu == 3) {
				if(!schoolProvinceId2.equals("请选择")){
					schoolCityId2 = request.getParameter("schoolCity1");		
					
				}
				if(!schoolProvinceId3.equals("请选择")){		
					schoolCityId3 = request.getParameter("schoolCity2");
					
				}
			}
			int age = Integer.parseInt(request.getParameter("age"));
			String homeProvince=provincesService.getProvinceName(homeProvinceId);
			resumeService.resumeInput(name,age,sex,birthDate,phoneNumber,email,idCard,
					address,awards,startDate,graduateDate,degree,school,major,rank,languageType,proficiency,
					experienceDescription,
					projectName2,time2,role2,projectDescription2,projectName3,time3,role3,projectDescription3,
					projectName,time,role,projectDescription,
					jobName,type,majorName,
					homeProvince,homeCity,homeArea,schoolProvinceId,schoolCityId,submitTime,startDate2,graduateDate2,degree2,school2,
					major2,rank2,languageType2,proficiency2,experienceDescription2,schoolProvinceId2,schoolCityId2,
					startDate3,graduateDate3,degree3,school3,major3,rank3,languageType3,proficiency3,experienceDescription3,
					schoolProvinceId3,schoolCityId3,addEdu,addPro);
			
			info = "提交成功";
			return new ResponseEntity<>(info,HttpStatus.OK);
		}
	}
	
}
