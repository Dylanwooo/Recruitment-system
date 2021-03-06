package sz.iecas.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sz.iecas.model.Area;
import sz.iecas.model.AreaExample;

public interface AreaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbggenerated
     */
    int countByExample(AreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbggenerated
     */
    int deleteByExample(AreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbggenerated
     */
    int insert(Area record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbggenerated
     */
    int insertSelective(Area record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbggenerated
     */
    List<Area> selectByExample(AreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbggenerated
     */
    Area selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Area record, @Param("example") AreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Area record, @Param("example") AreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Area record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Area record);
}