package sz.iecas.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import sz.iecas.model.EducationExtend;
import sz.iecas.model.ExperienceExtend;
import sz.iecas.model.ProjectExtendWithBLOBs;
import sz.iecas.model.ResumeTable;
import sz.iecas.model.User;
import sz.iecas.service.EducationExtendService;
import sz.iecas.service.ExperienceExtendService;
import sz.iecas.service.ProjectExtendService;
import sz.iecas.service.UserService;
import sz.iecas.service.resumeService;
/*
 * 简历预览
 */
@Controller
public class resumePreviewController {
	@Resource
	resumeService resumeService;
	@Resource
	EducationExtendService educationExtendService;
	@Resource
	ExperienceExtendService experienceExtendService;
	@Resource
	ProjectExtendService projectExtendService;
	@Resource
	UserService userservice;
/*
 * 从数据库读取简历信息
 * 根据用户角色以及是否有上传附件显示不同的底部
 */
	@RequestMapping("/resumePreview")
	public ModelAndView topreview(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("resumePreview");
		String requestid=request.getParameter("id");
		int id=Integer.parseInt(requestid);		
		ResumeTable resumeTable = new ResumeTable();
		List<EducationExtend> educationExtend = null;
		List<ExperienceExtend> experienceExtend = null;
		List<ProjectExtendWithBLOBs> projectExtendWithBLOBs = null;
		resumeTable=resumeService.getResumeInfo(id);	
		String workplace=resumeTable.getWorkplace();
		boolean flag=true;
		if(workplace!=null&&workplace.length()>0)
			{
			mav.addObject("flag",flag);
			
			}
		else{
			flag=false;
			mav.addObject("flag",flag);
		}

		educationExtend = educationExtendService.getEducationExtend(id);
		experienceExtend = experienceExtendService.getExperienceExtend(id);
		projectExtendWithBLOBs = projectExtendService.getProjectExtend(id);
		mav.addObject("resumeInfo",resumeTable);
		mav.addObject("educationExtend",educationExtend);
		mav.addObject("experienceExtend",experienceExtend);
		mav.addObject("projectExtend",projectExtendWithBLOBs);
		return mav;
	}
	/*
	 * 根据jobid 和resumeid 来转投简历
	 */
	@RequestMapping("/updateresumetable")

	public ResponseEntity<Integer> updateresume(HttpServletRequest request) {
		String resumeid=request.getParameter("id");
		String jobid=request.getParameter("jobid");
		resumeService.resumeUpdate(Integer.parseInt(jobid), Integer.parseInt(resumeid));
		
		return new ResponseEntity<Integer>(Integer.parseInt(resumeid),HttpStatus.OK);
		
		
		
	}
	
	/*
	 * 根据角色 让这份简历通过不同的状态
	 */
	
	@RequestMapping("/pass")
	public ResponseEntity<String> isPass(HttpServletRequest request) {
		String info=null;
		String id = request.getParameter("id");
		String role=request.getParameter("role");
		String status=request.getParameter("status");
		if("interviewer".equals(role))
		{
			info="通过专业面试";
			resumeService.updateResuemStatusById(Integer.parseInt(id),"通过专业面试");
		}
		if("hr".equals(role))
		{
			if("通过简历筛选".equals(status))
			{
				info=status;
			resumeService.updateResuemStatusById(Integer.parseInt(id), status);
			}
			if("通过综合面试".equals(status))
			{
				info=status;
				resumeService.updateResuemStatusById(Integer.parseInt(id), status);
			}
		}
		return new ResponseEntity<String>(info, HttpStatus.OK);
		
		
	}
	/*
	 * 回绝这份简历
	 */
	@RequestMapping("/deny")
	public ResponseEntity<String> isdeny(HttpServletRequest request) {
		String info="已储备";
		String id = request.getParameter("id");
		resumeService.updateResuemStatusById(Integer.parseInt(id), "已储备");
		return new ResponseEntity<String>(info, HttpStatus.OK);
		
		
	}
	
	/*
	 * 下载简历
	 */
	@RequestMapping("/download_successful")
	public ResponseEntity<byte[]> getdownloadpath(HttpServletRequest request)throws IOException{
		String downloadpath = request.getParameter("workplace");
			
		 String filepath = downloadpath;
		
		 File file = new File(filepath);
		 String filename = file.getName();
		 HttpHeaders headers = new HttpHeaders();
		 String fileName= new String(filename.getBytes("UTF-8"),"iso-8859-1");
		 
		 headers.setContentDispositionFormData("attachment", fileName);
		 headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		 return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers,HttpStatus.CREATED);
	}
		

}
