package sz.iecas.model;

import java.util.ArrayList;
import java.util.List;

public class LanguageExtendExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table language_extend
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table language_extend
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table language_extend
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language_extend
     *
     * @mbggenerated
     */
    public LanguageExtendExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language_extend
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language_extend
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language_extend
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language_extend
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language_extend
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language_extend
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language_extend
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
     * This method corresponds to the database table language_extend
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
     * This method corresponds to the database table language_extend
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language_extend
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
     * This class corresponds to the database table language_extend
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

        public Criteria andLanguageIdIsNull() {
            addCriterion("Language_id is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIdIsNotNull() {
            addCriterion("Language_id is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageIdEqualTo(Integer value) {
            addCriterion("Language_id =", value, "languageId");
            return (Criteria) this;
        }

        public Criteria andLanguageIdNotEqualTo(Integer value) {
            addCriterion("Language_id <>", value, "languageId");
            return (Criteria) this;
        }

        public Criteria andLanguageIdGreaterThan(Integer value) {
            addCriterion("Language_id >", value, "languageId");
            return (Criteria) this;
        }

        public Criteria andLanguageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Language_id >=", value, "languageId");
            return (Criteria) this;
        }

        public Criteria andLanguageIdLessThan(Integer value) {
            addCriterion("Language_id <", value, "languageId");
            return (Criteria) this;
        }

        public Criteria andLanguageIdLessThanOrEqualTo(Integer value) {
            addCriterion("Language_id <=", value, "languageId");
            return (Criteria) this;
        }

        public Criteria andLanguageIdIn(List<Integer> values) {
            addCriterion("Language_id in", values, "languageId");
            return (Criteria) this;
        }

        public Criteria andLanguageIdNotIn(List<Integer> values) {
            addCriterion("Language_id not in", values, "languageId");
            return (Criteria) this;
        }

        public Criteria andLanguageIdBetween(Integer value1, Integer value2) {
            addCriterion("Language_id between", value1, value2, "languageId");
            return (Criteria) this;
        }

        public Criteria andLanguageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Language_id not between", value1, value2, "languageId");
            return (Criteria) this;
        }

        public Criteria andResumeIdIsNull() {
            addCriterion("Resume_id is null");
            return (Criteria) this;
        }

        public Criteria andResumeIdIsNotNull() {
            addCriterion("Resume_id is not null");
            return (Criteria) this;
        }

        public Criteria andResumeIdEqualTo(Integer value) {
            addCriterion("Resume_id =", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdNotEqualTo(Integer value) {
            addCriterion("Resume_id <>", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdGreaterThan(Integer value) {
            addCriterion("Resume_id >", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Resume_id >=", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdLessThan(Integer value) {
            addCriterion("Resume_id <", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdLessThanOrEqualTo(Integer value) {
            addCriterion("Resume_id <=", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdIn(List<Integer> values) {
            addCriterion("Resume_id in", values, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdNotIn(List<Integer> values) {
            addCriterion("Resume_id not in", values, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdBetween(Integer value1, Integer value2) {
            addCriterion("Resume_id between", value1, value2, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Resume_id not between", value1, value2, "resumeId");
            return (Criteria) this;
        }

        public Criteria andLanguageTypeIsNull() {
            addCriterion("Language_type is null");
            return (Criteria) this;
        }

        public Criteria andLanguageTypeIsNotNull() {
            addCriterion("Language_type is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageTypeEqualTo(String value) {
            addCriterion("Language_type =", value, "languageType");
            return (Criteria) this;
        }

        public Criteria andLanguageTypeNotEqualTo(String value) {
            addCriterion("Language_type <>", value, "languageType");
            return (Criteria) this;
        }

        public Criteria andLanguageTypeGreaterThan(String value) {
            addCriterion("Language_type >", value, "languageType");
            return (Criteria) this;
        }

        public Criteria andLanguageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Language_type >=", value, "languageType");
            return (Criteria) this;
        }

        public Criteria andLanguageTypeLessThan(String value) {
            addCriterion("Language_type <", value, "languageType");
            return (Criteria) this;
        }

        public Criteria andLanguageTypeLessThanOrEqualTo(String value) {
            addCriterion("Language_type <=", value, "languageType");
            return (Criteria) this;
        }

        public Criteria andLanguageTypeLike(String value) {
            addCriterion("Language_type like", value, "languageType");
            return (Criteria) this;
        }

        public Criteria andLanguageTypeNotLike(String value) {
            addCriterion("Language_type not like", value, "languageType");
            return (Criteria) this;
        }

        public Criteria andLanguageTypeIn(List<String> values) {
            addCriterion("Language_type in", values, "languageType");
            return (Criteria) this;
        }

        public Criteria andLanguageTypeNotIn(List<String> values) {
            addCriterion("Language_type not in", values, "languageType");
            return (Criteria) this;
        }

        public Criteria andLanguageTypeBetween(String value1, String value2) {
            addCriterion("Language_type between", value1, value2, "languageType");
            return (Criteria) this;
        }

        public Criteria andLanguageTypeNotBetween(String value1, String value2) {
            addCriterion("Language_type not between", value1, value2, "languageType");
            return (Criteria) this;
        }

        public Criteria andProficiencyIsNull() {
            addCriterion("Proficiency is null");
            return (Criteria) this;
        }

        public Criteria andProficiencyIsNotNull() {
            addCriterion("Proficiency is not null");
            return (Criteria) this;
        }

        public Criteria andProficiencyEqualTo(Integer value) {
            addCriterion("Proficiency =", value, "proficiency");
            return (Criteria) this;
        }

        public Criteria andProficiencyNotEqualTo(Integer value) {
            addCriterion("Proficiency <>", value, "proficiency");
            return (Criteria) this;
        }

        public Criteria andProficiencyGreaterThan(Integer value) {
            addCriterion("Proficiency >", value, "proficiency");
            return (Criteria) this;
        }

        public Criteria andProficiencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("Proficiency >=", value, "proficiency");
            return (Criteria) this;
        }

        public Criteria andProficiencyLessThan(Integer value) {
            addCriterion("Proficiency <", value, "proficiency");
            return (Criteria) this;
        }

        public Criteria andProficiencyLessThanOrEqualTo(Integer value) {
            addCriterion("Proficiency <=", value, "proficiency");
            return (Criteria) this;
        }

        public Criteria andProficiencyIn(List<Integer> values) {
            addCriterion("Proficiency in", values, "proficiency");
            return (Criteria) this;
        }

        public Criteria andProficiencyNotIn(List<Integer> values) {
            addCriterion("Proficiency not in", values, "proficiency");
            return (Criteria) this;
        }

        public Criteria andProficiencyBetween(Integer value1, Integer value2) {
            addCriterion("Proficiency between", value1, value2, "proficiency");
            return (Criteria) this;
        }

        public Criteria andProficiencyNotBetween(Integer value1, Integer value2) {
            addCriterion("Proficiency not between", value1, value2, "proficiency");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table language_extend
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
     * This class corresponds to the database table language_extend
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