package sz.iecas.model;

public class DepartmentInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department_info.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department_info.departmentId
     *
     * @mbggenerated
     */
    private Integer departmentid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department_info.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department_info.departmentDesc
     *
     * @mbggenerated
     */
    private String departmentdesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department_info.id
     *
     * @return the value of department_info.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department_info.id
     *
     * @param id the value for department_info.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department_info.departmentId
     *
     * @return the value of department_info.departmentId
     *
     * @mbggenerated
     */
    public Integer getDepartmentid() {
        return departmentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department_info.departmentId
     *
     * @param departmentid the value for department_info.departmentId
     *
     * @mbggenerated
     */
    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department_info.name
     *
     * @return the value of department_info.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department_info.name
     *
     * @param name the value for department_info.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department_info.departmentDesc
     *
     * @return the value of department_info.departmentDesc
     *
     * @mbggenerated
     */
    public String getDepartmentdesc() {
        return departmentdesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department_info.departmentDesc
     *
     * @param departmentdesc the value for department_info.departmentDesc
     *
     * @mbggenerated
     */
    public void setDepartmentdesc(String departmentdesc) {
        this.departmentdesc = departmentdesc == null ? null : departmentdesc.trim();
    }
}