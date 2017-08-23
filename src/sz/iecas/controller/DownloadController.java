package sz.iecas.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jdk.nashorn.internal.ir.RuntimeNode.Request;
import sz.iecas.model.JobInfo;
import sz.iecas.model.ResumeTable;
import sz.iecas.model.User;
import sz.iecas.service.JobInfoService;
import sz.iecas.service.ResumeCenterService;
import sz.iecas.service.resumeService;

@Controller
public class DownloadController {
 @RequestMapping("download_success")
 public ResponseEntity<byte[]> downloadFile(HttpServletRequest request)throws IOException{
	 String filepath = request.getParameter("person_name");
	 System.out.println("start");
	 File file = new File(filepath);
	 String filename = file.getName();
	 HttpHeaders headers = new HttpHeaders();
	 String fileName= new String(filename.getBytes("UTF-8"),"iso-8859-1");
	 
	 headers.setContentDispositionFormData("attachment", fileName);
	 headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
	 return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers,HttpStatus.CREATED);
	 
 }
@Resource
 ResumeCenterService resumeCenterService;
 
 @RequestMapping("/download")

 public ModelAndView getFileFormResume(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("download");
		List<ResumeTable> resumeList = resumeCenterService.getAllForFile();
		System.out.println("success!");
		mav.addObject("resumeList", resumeList);
		return mav;
	}
	
}
