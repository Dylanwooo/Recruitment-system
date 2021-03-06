package sz.iecas.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sz.iecas.model.Zipcode;
import sz.iecas.model.ZipcodeExample;

public interface ZipcodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zipcode
     *
     * @mbggenerated
     */
    int countByExample(ZipcodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zipcode
     *
     * @mbggenerated
     */
    int deleteByExample(ZipcodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zipcode
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zipcode
     *
     * @mbggenerated
     */
    int insert(Zipcode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zipcode
     *
     * @mbggenerated
     */
    int insertSelective(Zipcode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zipcode
     *
     * @mbggenerated
     */
    List<Zipcode> selectByExample(ZipcodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zipcode
     *
     * @mbggenerated
     */
    Zipcode selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zipcode
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Zipcode record, @Param("example") ZipcodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zipcode
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Zipcode record, @Param("example") ZipcodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zipcode
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Zipcode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zipcode
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Zipcode record);
}