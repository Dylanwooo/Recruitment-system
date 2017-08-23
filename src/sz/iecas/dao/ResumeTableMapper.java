package sz.iecas.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sz.iecas.model.ResumeTable;
import sz.iecas.model.ResumeTableExample;

public interface ResumeTableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resumetable
     *
     * @mbggenerated
     */
    int countByExample(ResumeTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resumetable
     *
     * @mbggenerated
     */
    int deleteByExample(ResumeTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resumetable
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer resumeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resumetable
     *
     * @mbggenerated
     */
    int insert(ResumeTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resumetable
     *
     * @mbggenerated
     */
    int insertSelective(ResumeTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resumetable
     *
     * @mbggenerated
     */
    List<ResumeTable> selectByExampleWithBLOBs(ResumeTableExample example);
    List<ResumeTable> selectmyresume(ResumeTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resumetable
     *
     * @mbggenerated
     */
    List<ResumeTable> selectByExample(ResumeTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resumetable
     *
     * @mbggenerated
     */
    ResumeTable selectByPrimaryKey(Integer resumeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resumetable
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ResumeTable record, @Param("example") ResumeTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resumetable
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") ResumeTable record, @Param("example") ResumeTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resumetable
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ResumeTable record, @Param("example") ResumeTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resumetable
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ResumeTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resumetable
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(ResumeTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resumetable
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ResumeTable record);
}