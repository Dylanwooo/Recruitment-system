package sz.iecas.model;

import java.util.ArrayList;
import java.util.List;

public class JobInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table job_info
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table job_info
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table job_info
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_info
     *
     * @mbggenerated
     */
    public JobInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_info
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_info
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_info
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_info
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_info
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_info
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_info
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_info
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_info
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_info
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table job_info
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andMaxsalaryIsNull() {
            addCriterion("maxSalary is null");
            return (Criteria) this;
        }

        public Criteria andMaxsalaryIsNotNull() {
            addCriterion("maxSalary is not null");
            return (Criteria) this;
        }

        public Criteria andMaxsalaryEqualTo(Integer value) {
            addCriterion("maxSalary =", value, "maxsalary");
            return (Criteria) this;
        }

        public Criteria andMaxsalaryNotEqualTo(Integer value) {
            addCriterion("maxSalary <>", value, "maxsalary");
            return (Criteria) this;
        }

        public Criteria andMaxsalaryGreaterThan(Integer value) {
            addCriterion("maxSalary >", value, "maxsalary");
            return (Criteria) this;
        }

        public Criteria andMaxsalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxSalary >=", value, "maxsalary");
            return (Criteria) this;
        }

        public Criteria andMaxsalaryLessThan(Integer value) {
            addCriterion("maxSalary <", value, "maxsalary");
            return (Criteria) this;
        }

        public Criteria andMaxsalaryLessThanOrEqualTo(Integer value) {
            addCriterion("maxSalary <=", value, "maxsalary");
            return (Criteria) this;
        }

        public Criteria andMaxsalaryIn(List<Integer> values) {
            addCriterion("maxSalary in", values, "maxsalary");
            return (Criteria) this;
        }

        public Criteria andMaxsalaryNotIn(List<Integer> values) {
            addCriterion("maxSalary not in", values, "maxsalary");
            return (Criteria) this;
        }

        public Criteria andMaxsalaryBetween(Integer value1, Integer value2) {
            addCriterion("maxSalary between", value1, value2, "maxsalary");
            return (Criteria) this;
        }

        public Criteria andMaxsalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("maxSalary not between", value1, value2, "maxsalary");
            return (Criteria) this;
        }

        public Criteria andMinsalaryIsNull() {
            addCriterion("minSalary is null");
            return (Criteria) this;
        }

        public Criteria andMinsalaryIsNotNull() {
            addCriterion("minSalary is not null");
            return (Criteria) this;
        }

        public Criteria andMinsalaryEqualTo(Integer value) {
            addCriterion("minSalary =", value, "minsalary");
            return (Criteria) this;
        }

        public Criteria andMinsalaryNotEqualTo(Integer value) {
            addCriterion("minSalary <>", value, "minsalary");
            return (Criteria) this;
        }

        public Criteria andMinsalaryGreaterThan(Integer value) {
            addCriterion("minSalary >", value, "minsalary");
            return (Criteria) this;
        }

        public Criteria andMinsalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("minSalary >=", value, "minsalary");
            return (Criteria) this;
        }

        public Criteria andMinsalaryLessThan(Integer value) {
            addCriterion("minSalary <", value, "minsalary");
            return (Criteria) this;
        }

        public Criteria andMinsalaryLessThanOrEqualTo(Integer value) {
            addCriterion("minSalary <=", value, "minsalary");
            return (Criteria) this;
        }

        public Criteria andMinsalaryIn(List<Integer> values) {
            addCriterion("minSalary in", values, "minsalary");
            return (Criteria) this;
        }

        public Criteria andMinsalaryNotIn(List<Integer> values) {
            addCriterion("minSalary not in", values, "minsalary");
            return (Criteria) this;
        }

        public Criteria andMinsalaryBetween(Integer value1, Integer value2) {
            addCriterion("minSalary between", value1, value2, "minsalary");
            return (Criteria) this;
        }

        public Criteria andMinsalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("minSalary not between", value1, value2, "minsalary");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNull() {
            addCriterion("publishTime is null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNotNull() {
            addCriterion("publishTime is not null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeEqualTo(String value) {
            addCriterion("publishTime =", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotEqualTo(String value) {
            addCriterion("publishTime <>", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThan(String value) {
            addCriterion("publishTime >", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThanOrEqualTo(String value) {
            addCriterion("publishTime >=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThan(String value) {
            addCriterion("publishTime <", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThanOrEqualTo(String value) {
            addCriterion("publishTime <=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLike(String value) {
            addCriterion("publishTime like", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotLike(String value) {
            addCriterion("publishTime not like", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIn(List<String> values) {
            addCriterion("publishTime in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotIn(List<String> values) {
            addCriterion("publishTime not in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeBetween(String value1, String value2) {
            addCriterion("publishTime between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotBetween(String value1, String value2) {
            addCriterion("publishTime not between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(String value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(String value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(String value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(String value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(String value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLike(String value) {
            addCriterion("endTime like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotLike(String value) {
            addCriterion("endTime not like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<String> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<String> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(String value1, String value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(String value1, String value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNull() {
            addCriterion("departmentId is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("departmentId is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(Integer value) {
            addCriterion("departmentId =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(Integer value) {
            addCriterion("departmentId <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(Integer value) {
            addCriterion("departmentId >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("departmentId >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(Integer value) {
            addCriterion("departmentId <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(Integer value) {
            addCriterion("departmentId <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<Integer> values) {
            addCriterion("departmentId in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<Integer> values) {
            addCriterion("departmentId not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(Integer value1, Integer value2) {
            addCriterion("departmentId between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("departmentId not between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNull() {
            addCriterion("degree is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("degree is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(Integer value) {
            addCriterion("degree =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(Integer value) {
            addCriterion("degree <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(Integer value) {
            addCriterion("degree >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("degree >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(Integer value) {
            addCriterion("degree <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(Integer value) {
            addCriterion("degree <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<Integer> values) {
            addCriterion("degree in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<Integer> values) {
            addCriterion("degree not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(Integer value1, Integer value2) {
            addCriterion("degree between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(Integer value1, Integer value2) {
            addCriterion("degree not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andJobStatusIsNull() {
            addCriterion("job_status is null");
            return (Criteria) this;
        }

        public Criteria andJobStatusIsNotNull() {
            addCriterion("job_status is not null");
            return (Criteria) this;
        }

        public Criteria andJobStatusEqualTo(Integer value) {
            addCriterion("job_status =", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusNotEqualTo(Integer value) {
            addCriterion("job_status <>", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusGreaterThan(Integer value) {
            addCriterion("job_status >", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_status >=", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusLessThan(Integer value) {
            addCriterion("job_status <", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusLessThanOrEqualTo(Integer value) {
            addCriterion("job_status <=", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusIn(List<Integer> values) {
            addCriterion("job_status in", values, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusNotIn(List<Integer> values) {
            addCriterion("job_status not in", values, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusBetween(Integer value1, Integer value2) {
            addCriterion("job_status between", value1, value2, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("job_status not between", value1, value2, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andMajorNameIsNull() {
            addCriterion("major_name is null");
            return (Criteria) this;
        }

        public Criteria andMajorNameIsNotNull() {
            addCriterion("major_name is not null");
            return (Criteria) this;
        }

        public Criteria andMajorNameEqualTo(String value) {
            addCriterion("major_name =", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotEqualTo(String value) {
            addCriterion("major_name <>", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameGreaterThan(String value) {
            addCriterion("major_name >", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameGreaterThanOrEqualTo(String value) {
            addCriterion("major_name >=", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLessThan(String value) {
            addCriterion("major_name <", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLessThanOrEqualTo(String value) {
            addCriterion("major_name <=", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLike(String value) {
            addCriterion("major_name like", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotLike(String value) {
            addCriterion("major_name not like", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameIn(List<String> values) {
            addCriterion("major_name in", values, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotIn(List<String> values) {
            addCriterion("major_name not in", values, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameBetween(String value1, String value2) {
            addCriterion("major_name between", value1, value2, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotBetween(String value1, String value2) {
            addCriterion("major_name not between", value1, value2, "majorName");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table job_info
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table job_info
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}