package sz.iecas.controller;

import java.io.File;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import sz.iecas.model.EducationExtend;
import sz.iecas.model.ExperienceExtend;
import sz.iecas.model.ProjectExtendWithBLOBs;
import sz.iecas.model.ResumeTable;
import sz.iecas.model.User;
import sz.iecas.service.EducationExtendService;
import sz.iecas.service.ExperienceExtendService;
import sz.iecas.service.ProjectExtendService;
import sz.iecas.service.ResumeCenterService;
import sz.iecas.service.UserService;
import sz.iecas.service.resumeService;
/*
 *  上传简历相关控制器
 */
@Controller
public class FileUploadController {
	@Resource
	resumeService resumeService;
	@Resource UserService userService;
	@Resource ResumeCenterService resumeCenterservice;
	@Resource
	EducationExtendService educationExtendService;
	@Resource
	ExperienceExtendService experienceExtendService;
	@Resource
	ProjectExtendService projectExtendService;
	String path;
	@RequestMapping("fileUpload")
	/*
	 * 获取到上传的文件，按照系统时间为每个文件命名，将路径保存到数据库中
	 * 默认保存在服务器的E盘下面的download文件夹中，请在E盘下新建该文件夹
	 * 保存完简历后，返回预览简历的界面
	 */
	public ModelAndView topersonal(@RequestParam("file") CommonsMultipartFile file,
		HttpServletRequest request)throws IOException{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("resumePreview");
		int resumeId=0;
		String userName = request.getParameter("username");
		User user=userService.getUserByUserName(userName);		
		if(user.getPhoneNumber()!=null){
			 resumeId = resumeCenterservice.getResumeIdByPhone(user.getPhoneNumber());			
			}
		if(file.getOriginalFilename()!="")			
			{
			
			path="E:/download/"+new Date().getTime()+file.getOriginalFilename();		
			File newFile = new File(path);
			//通过CommonsMulitipartFile的方法直接写文件
			file.transferTo(newFile);
			 resumeCenterservice.updateResumeUploadPathByresumeId(resumeId, path);
			//将文件名字写入数据库			
			}
		
		ResumeTable resumeTable = new ResumeTable();
		List<EducationExtend> educationExtend = null;
		List<ExperienceExtend> experienceExtend = null;
		List<ProjectExtendWithBLOBs> projectExtendWithBLOBs = null;	
		resumeTable=resumeService.getResumeInfo(resumeId);		  
		educationExtend = educationExtendService.getEducationExtend(resumeId);
		experienceExtend = experienceExtendService.getExperienceExtend(resumeId);
		projectExtendWithBLOBs = projectExtendService.getProjectExtend(resumeId);
		
		mav.addObject("resumeInfo",resumeTable);
		mav.addObject("educationExtend",educationExtend);
		mav.addObject("experienceExtend",experienceExtend);
		mav.addObject("projectExtend",projectExtendWithBLOBs);
		return mav;
	}
		
	}

