package sz.iecas.controller;

import javax.annotation.Resource;
/*
 * 反馈模块
 */
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
import sz.iecas.service.FeedbackService;

@Controller
public class FeedbackController {
	@Resource FeedbackService feedbackService;
	 @RequestMapping(value = "/feedback", method = RequestMethod.POST)
	/*
	 * 根据用户输入的内容保存反馈到数据库，反馈不能为空
	 */
		public ResponseEntity<String> publishfeedback(HttpServletRequest request) throws ParseException, java.text.ParseException{
			
			String feedbacktext=request.getParameter("text");
			String info = "提交成功";
			System.out.println(feedbacktext);
			if(feedbacktext.equals("")){
				info = "反馈不能为空!";
				return new ResponseEntity<String>(info,HttpStatus.BAD_REQUEST);
			
			}else {
				feedbackService.insertfeedback( feedbacktext);
				return new ResponseEntity<String>(info,HttpStatus.OK);
			}
			
		}
}
