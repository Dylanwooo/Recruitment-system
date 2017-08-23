package sz.iecas.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import sz.iecas.dao.FeedbackMapper;
import sz.iecas.model.Feedback;
import sz.iecas.service.FeedbackService;
@Service
public class FeedbackServiceImpl implements FeedbackService {
@Resource FeedbackMapper feedbackmapper;
	@Override
	public Feedback insertfeedback(String text) {
		// TODO Auto-generated method stub
		Feedback feedback=new Feedback();
		
		feedback.setFeedbackText(text);
		feedbackmapper.insertSelective(feedback);
		return feedback;
	}

}
