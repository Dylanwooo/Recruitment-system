package sz.iecas.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sz.iecas.model.Recruitprocess;
import sz.iecas.model.RecruitprocessExample;

public interface RecruitprocessMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recruitprocess
     *
     * @mbggenerated
     */
    int countByExample(RecruitprocessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recruitprocess
     *
     * @mbggenerated
     */
    int deleteByExample(RecruitprocessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recruitprocess
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recruitprocess
     *
     * @mbggenerated
     */
    int insert(Recruitprocess record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recruitprocess
     *
     * @mbggenerated
     */
    int insertSelective(Recruitprocess record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recruitprocess
     *
     * @mbggenerated
     */
    List<Recruitprocess> selectByExample(RecruitprocessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recruitprocess
     *
     * @mbggenerated
     */
    Recruitprocess selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recruitprocess
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Recruitprocess record, @Param("example") RecruitprocessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recruitprocess
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Recruitprocess record, @Param("example") RecruitprocessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recruitprocess
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Recruitprocess record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recruitprocess
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Recruitprocess record);
}