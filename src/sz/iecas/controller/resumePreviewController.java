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
import sz.iecas.service.EducationExtendService;
import sz.iecas.service.ExperienceExtendService;
import sz.iecas.service.ProjectExtendService;
import sz.iecas.service.UserService;
import sz.iecas.service.resumeService;

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

	@RequestMapping("/resumePreview")
	public ModelAndView topreview(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("resumePreview");
		String requestid=request.getParameter("id");
		int id=Integer.parseInt(requestid);		
		String role=request.getParameter("rolecode");
		ResumeTable resumeTable = new ResumeTable();
		List<EducationExtend> educationExtend = null;
		List<ExperienceExtend> experienceExtend = null;
		List<ProjectExtendWithBLOBs> projectExtendWithBLOBs = null;
	  
		
		resumeTable=resumeService.getResumeInfo(id);		 
		String workplace=resumeTable.getWorkplace();
		boolean flag=true;
		if(workplace!=null&&workplace!="")
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
		
		// 设置简历状态为已查看 1.待查看 2.已查看
		if(role.equals("hr"))
				{
				resumeService.updateResuemStatusById(id, "2");		
				}
		
		mav.addObject("resumeInfo",resumeTable);
		mav.addObject("educationExtend",educationExtend);
		mav.addObject("experienceExtend",experienceExtend);
		mav.addObject("projectExtend",projectExtendWithBLOBs);
		return mav;
	}
	@RequestMapping("/download_successful")
	public ResponseEntity<byte[]> getdownloadpath(HttpServletRequest request)throws IOException{
		String downloadpath = request.getParameter("workplace");
		
		System.out.println(downloadpath+"111");
		
		 String filepath = downloadpath;
		 System.out.println("start");
		 File file = new File(filepath);
		 String filename = file.getName();
		 HttpHeaders headers = new HttpHeaders();
		 String fileName= new String(filename.getBytes("UTF-8"),"iso-8859-1");
		 
		 headers.setContentDispositionFormData("attachment", fileName);
		 headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		 return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers,HttpStatus.CREATED);
	}
		

}
