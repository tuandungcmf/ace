package jp.co.ace.mapper;

import java.util.List;
import jp.co.ace.entities.HouseDetail;
import jp.co.ace.entities.HouseDetailExample;
import org.apache.ibatis.annotations.Param;

public interface HouseDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_detail
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    long countByExample(HouseDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_detail
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    int deleteByExample(HouseDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_detail
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_detail
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    int insert(HouseDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_detail
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    int insertSelective(HouseDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_detail
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    List<HouseDetail> selectByExample(HouseDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_detail
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    HouseDetail selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_detail
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    int updateByExampleSelective(@Param("record") HouseDetail record, @Param("example") HouseDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_detail
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    int updateByExample(@Param("record") HouseDetail record, @Param("example") HouseDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_detail
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    int updateByPrimaryKeySelective(HouseDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_detail
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    int updateByPrimaryKey(HouseDetail record);
}