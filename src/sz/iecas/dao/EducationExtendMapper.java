package sz.iecas.dao;

import java.util.List;
import sz.iecas.model.EducationExtend;
import sz.iecas.model.EducationExtendExample;
import org.apache.ibatis.annotations.Param;

public interface EducationExtendMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table education_extend
     *
     * @mbggenerated
     */
    int countByExample(EducationExtendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table education_extend
     *
     * @mbggenerated
     */
    int deleteByExample(EducationExtendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table education_extend
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer eduId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table education_extend
     *
     * @mbggenerated
     */
    int insert(EducationExtend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table education_extend
     *
     * @mbggenerated
     */
    int insertSelective(EducationExtend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table education_extend
     *
     * @mbggenerated
     */
    List<EducationExtend> selectByExample(EducationExtendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table education_extend
     *
     * @mbggenerated
     */
    EducationExtend selectByPrimaryKey(Integer eduId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table education_extend
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") EducationExtend record, @Param("example") EducationExtendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table education_extend
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") EducationExtend record, @Param("example") EducationExtendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table education_extend
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(EducationExtend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table education_extend
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(EducationExtend record);
}