package sz.iecas.model;

public class Major {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column major.Major_id
     *
     * @mbggenerated
     */
    private Integer majorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column major.Major_name
     *
     * @mbggenerated
     */
    private String majorName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column major.Major_id
     *
     * @return the value of major.Major_id
     *
     * @mbggenerated
     */
    public Integer getMajorId() {
        return majorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column major.Major_id
     *
     * @param majorId the value for major.Major_id
     *
     * @mbggenerated
     */
    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column major.Major_name
     *
     * @return the value of major.Major_name
     *
     * @mbggenerated
     */
    public String getMajorName() {
        return majorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column major.Major_name
     *
     * @param majorName the value for major.Major_name
     *
     * @mbggenerated
     */
    public void setMajorName(String majorName) {
        this.majorName = majorName == null ? null : majorName.trim();
    }
}