package sz.iecas.service;

import java.util.List;

import sz.iecas.model.Major;

public interface MajorService {
      Major getMajorbyid(int id);
      List<Major> getAllMajor();
      Major addMajor(String majorName);
      int deleteMajor(int id);
}
