package sz.iecas.model;

public class ResumeTable {
//by wty
	int departmentid;
	public int getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}

	int degree;
	public int getDegree() {
		return degree;
	}

	public void setDegree(int degree) {
		this.degree = degree;
	}

	private String school;
	private String major;
    public String getSchool() {
		return school;
    }

	public void setSchool(String school) {
		this.school = school;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resumetable.Resume_id
     *
     * @mbggenerated
     */
    private Integer resumeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resumetable.Name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resumetable.Age
     *
     * @mbggenerated
     */
    private Integer age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resumetable.Sex
     *
     * @mbggenerated
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resumetable.BirthDate
     *
     * @mbggenerated
     */
    private String birthdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resumetable.Phone
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resumetable.Email
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resumetable.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resumetable.Address
     *
     * @mbggenerated
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resumetable.Status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resumetable.Comment
     *
     * @mbggenerated
     */
    private String comment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resumetable.Employer
     *
     * @mbggenerated
     */
    private String employer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resumetable.SubmitTime
     *
     * @mbggenerated
     */
    private String submittime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resumetable.UpdateTime
     *
     * @mbggenerated
     */
    private String updatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resumetable.jobname
     *
     * @mbggenerated
     */
    private String jobname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resumetable.jobtype
     *
     * @mbggenerated
     */
    private Integer jobtype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resumetable.HighestDegree
     *
     * @mbggenerated
     */
    private Integer highestdegree;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resumetable.WorkPlace
     *
     * @mbggenerated
     */
    private String workplace;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resumetable.Major_name
     *
     * @mbggenerated
     */
    private String majorName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resumetable.Provinceid
     *
     * @mbggenerated
     */
    private String province;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resumetable.City
     *
     * @mbggenerated
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resumetable.Area
     *
     * @mbggenerated
     */
    private String area;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resumetable.other
     *
     * @mbggenerated
     */
    private String other;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resumetable.Awards
     *
     * @mbggenerated
     */
    private String awards;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resumetable.Resume_id
     *
     * @return the value of resumetable.Resume_id
     *
     * @mbggenerated
     */
    public Integer getResumeId() {
        return resumeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resumetable.Resume_id
     *
     * @param resumeId the value for resumetable.Resume_id
     *
     * @mbggenerated
     */
    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resumetable.Name
     *
     * @return the value of resumetable.Name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resumetable.Name
     *
     * @param name the value for resumetable.Name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resumetable.Age
     *
     * @return the value of resumetable.Age
     *
     * @mbggenerated
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resumetable.Age
     *
     * @param age the value for resumetable.Age
     *
     * @mbggenerated
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resumetable.Sex
     *
     * @return the value of resumetable.Sex
     *
     * @mbggenerated
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resumetable.Sex
     *
     * @param sex the value for resumetable.Sex
     *
     * @mbggenerated
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resumetable.BirthDate
     *
     * @return the value of resumetable.BirthDate
     *
     * @mbggenerated
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resumetable.BirthDate
     *
     * @param birthdate the value for resumetable.BirthDate
     *
     * @mbggenerated
     */
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate == null ? null : birthdate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resumetable.Phone
     *
     * @return the value of resumetable.Phone
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resumetable.Phone
     *
     * @param phone the value for resumetable.Phone
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resumetable.Email
     *
     * @return the value of resumetable.Email
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resumetable.Email
     *
     * @param email the value for resumetable.Email
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resumetable.ID
     *
     * @return the value of resumetable.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resumetable.ID
     *
     * @param id the value for resumetable.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resumetable.Address
     *
     * @return the value of resumetable.Address
     *
     * @mbggenerated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resumetable.Address
     *
     * @param address the value for resumetable.Address
     *
     * @mbggenerated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resumetable.Status
     *
     * @return the value of resumetable.Status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resumetable.Status
     *
     * @param status the value for resumetable.Status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resumetable.Comment
     *
     * @return the value of resumetable.Comment
     *
     * @mbggenerated
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resumetable.Comment
     *
     * @param comment the value for resumetable.Comment
     *
     * @mbggenerated
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resumetable.Employer
     *
     * @return the value of resumetable.Employer
     *
     * @mbggenerated
     */
    public String getEmployer() {
        return employer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resumetable.Employer
     *
     * @param employer the value for resumetable.Employer
     *
     * @mbggenerated
     */
    public void setEmployer(String employer) {
        this.employer = employer == null ? null : employer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resumetable.SubmitTime
     *
     * @return the value of resumetable.SubmitTime
     *
     * @mbggenerated
     */
    public String getSubmittime() {
        return submittime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resumetable.SubmitTime
     *
     * @param submittime the value for resumetable.SubmitTime
     *
     * @mbggenerated
     */
    public void setSubmittime(String submittime) {
        this.submittime = submittime == null ? null : submittime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resumetable.UpdateTime
     *
     * @return the value of resumetable.UpdateTime
     *
     * @mbggenerated
     */
    public String getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resumetable.UpdateTime
     *
     * @param updatetime the value for resumetable.UpdateTime
     *
     * @mbggenerated
     */
    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime == null ? null : updatetime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resumetable.jobname
     *
     * @return the value of resumetable.jobname
     *
     * @mbggenerated
     */
    public String getJobname() {
        return jobname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resumetable.jobname
     *
     * @param jobname the value for resumetable.jobname
     *
     * @mbggenerated
     */
    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resumetable.jobtype
     *
     * @return the value of resumetable.jobtype
     *
     * @mbggenerated
     */
    public Integer getJobtype() {
        return jobtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resumetable.jobtype
     *
     * @param jobtype the value for resumetable.jobtype
     *
     * @mbggenerated
     */
    public void setJobtype(Integer jobtype) {
        this.jobtype = jobtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resumetable.HighestDegree
     *
     * @return the value of resumetable.HighestDegree
     *
     * @mbggenerated
     */
    public Integer getHighestdegree() {
        return highestdegree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resumetable.HighestDegree
     *
     * @param highestdegree the value for resumetable.HighestDegree
     *
     * @mbggenerated
     */
    public void setHighestdegree(Integer highestdegree) {
        this.highestdegree = highestdegree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resumetable.WorkPlace
     *
     * @return the value of resumetable.WorkPlace
     *
     * @mbggenerated
     */
    public String getWorkplace() {
        return workplace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resumetable.WorkPlace
     *
     * @param workplace the value for resumetable.WorkPlace
     *
     * @mbggenerated
     */
    public void setWorkplace(String workplace) {
        this.workplace = workplace == null ? null : workplace.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resumetable.Major_name
     *
     * @return the value of resumetable.Major_name
     *
     * @mbggenerated
     */
    public String getMajorName() {
        return majorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resumetable.Major_name
     *
     * @param majorName the value for resumetable.Major_name
     *
     * @mbggenerated
     */
    public void setMajorName(String majorName) {
        this.majorName = majorName == null ? null : majorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resumetable.Provinceid
     *
     * @return the value of resumetable.Provinceid
     *
     * @mbggenerated
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resumetable.Provinceid
     *
     * @param provinceid the value for resumetable.Provinceid
     *
     * @mbggenerated
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resumetable.Cityid
     *
     * @return the value of resumetable.Cityid
     *
     * @mbggenerated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resumetable.Cityid
     *
     * @param cityid the value for resumetable.Cityid
     *
     * @mbggenerated
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resumetable.Areaid
     *
     * @return the value of resumetable.Areaid
     *
     * @mbggenerated
     */
    public String getArea() {
        return area;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resumetable.Areaid
     *
     * @param areaid the value for resumetable.Areaid
     *
     * @mbggenerated
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resumetable.other
     *
     * @return the value of resumetable.other
     *
     * @mbggenerated
     */
    public String getOther() {
        return other;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resumetable.other
     *
     * @param other the value for resumetable.other
     *
     * @mbggenerated
     */
    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resumetable.Awards
     *
     * @return the value of resumetable.Awards
     *
     * @mbggenerated
     */
    public String getAwards() {
        return awards;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resumetable.Awards
     *
     * @param awards the value for resumetable.Awards
     *
     * @mbggenerated
     */
    public void setAwards(String awards) {
        this.awards = awards == null ? null : awards.trim();
    }
}