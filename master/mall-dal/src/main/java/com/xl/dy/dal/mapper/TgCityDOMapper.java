package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TgCityDO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TG_CITY.
 * TG_CITY
 */
public interface TgCityDOMapper{

    /**
     * desc:插入表:TG_CITY.<br/>
     * descSql =  INSERT INTO TG_CITY( ID ,REMARK ,CITY_NAME ,ALTER_EMPL ,ALTER_TIME ,CITY_SPELL ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,PROVINCE_ID ,VALID_STATUS ,PROVINCE_NAME ,PROVINCE_SPELL )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{cityName,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{citySpell,jdbcType=VARCHAR} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{provinceId,jdbcType=BIGINT} , #{validStatus,jdbcType=INTEGER} , #{provinceName,jdbcType=VARCHAR} , #{provinceSpell,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TgCityDO entity);
    /**
     * desc:更新表:TG_CITY.<br/>
     * descSql =  UPDATE TG_CITY SET REMARK = #{remark,jdbcType=VARCHAR} ,CITY_NAME = #{cityName,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,CITY_SPELL = #{citySpell,jdbcType=VARCHAR} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,PROVINCE_ID = #{provinceId,jdbcType=BIGINT} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,PROVINCE_NAME = #{provinceName,jdbcType=VARCHAR} ,PROVINCE_SPELL = #{provinceSpell,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TgCityDO entity);
    /**
     * desc:根据主键删除数据:TG_CITY.<br/>
     * descSql =  DELETE FROM TG_CITY WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TG_CITY.<br/>
     * descSql =  SELECT * FROM TG_CITY WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TgCityDO
     */
    TgCityDO getByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TG_CITY.<br/>
     * descSql =  SELECT * FROM TG_CITY WHERE PROVINCE_ID = #{provinceId,jdbcType=BIGINT}
     * @param provinceId provinceId
     * @return List<TgCityDO>
     */
    List<TgCityDO> getByProvinceId(Long provinceId);
    /**
     * desc:根据主键获取有效性数据:TG_CITY.<br/>
     * descSql =  SELECT * FROM TG_CITY WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TgCityDO
     */
    TgCityDO getByPrimarySelective(Long id);
}
