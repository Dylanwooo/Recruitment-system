package sz.iecas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import sz.iecas.dao.RecruitprocessMapper;
import sz.iecas.model.Recruitprocess;
import sz.iecas.model.RecruitprocessExample;
import sz.iecas.service.RecruitService;
@Service
public class RecruitImpl implements RecruitService {
@Resource RecruitprocessMapper recruitprocessmapper;
	@Override
	public Recruitprocess addRecruit(String date,String time,String school,String place) {
		Recruitprocess recruitprocess=new Recruitprocess();
		recruitprocess.setDate(date);
		recruitprocess.setTime(time);
		recruitprocess.setSchool(school);
		recruitprocess.setPlace(place);
		recruitprocessmapper.insertSelective(recruitprocess);
		return recruitprocess;

	}
	@Override
	public List<Recruitprocess> getallprocess() {
		RecruitprocessExample recruitprocessExample=new RecruitprocessExample();
		recruitprocessExample.createCriteria().andIdIsNotNull();
		List<Recruitprocess> recruitprocesses=recruitprocessmapper.selectByExample(recruitprocessExample);
		return recruitprocesses;
	}
	@Override
	public int deleteRecruitbyId(int id) {
		return recruitprocessmapper.deleteByPrimaryKey(id);
	}
	@Override
	public Recruitprocess updateProcess(int id, String date, String time, String school, String place) {
		RecruitprocessExample recruitprocessExample=new RecruitprocessExample();
		recruitprocessExample.createCriteria().andIdEqualTo(id);
		Recruitprocess recruitprocess=new Recruitprocess();
		recruitprocess.setDate(date);
		recruitprocess.setPlace(place);
		recruitprocess.setSchool(school);
		recruitprocess.setTime(time);
		recruitprocessmapper.updateByExampleSelective(recruitprocess, recruitprocessExample);
		return recruitprocess;
	}

}
