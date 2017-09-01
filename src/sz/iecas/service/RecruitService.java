package sz.iecas.service;

import java.util.List;

import sz.iecas.model.Recruitprocess;

public interface RecruitService {
	Recruitprocess addRecruit(String date,String time,String school,String place);
	List<Recruitprocess> getallprocess();
	int deleteRecruitbyId(int id);
	Recruitprocess updateProcess(int id,String date,String time,String school,String place);
}
