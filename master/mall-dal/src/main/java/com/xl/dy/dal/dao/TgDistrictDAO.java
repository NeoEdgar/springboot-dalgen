package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TgDistrictDO;
import java.util.List;
import com.xl.dy.dal.mapper.TgDistrictDOMapper;

/**
* The Table TG_DISTRICT.
* TG_DISTRICT
*/
@Repository
public class TgDistrictDAO{

    @Autowired
    private TgDistrictDOMapper tgDistrictDOMapper;

    /**
     * desc:插入表:TG_DISTRICT.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TG_DISTRICT( ID ,C_CODE ,D_CODE ,P_CODE ,CITY_ID ,REMARK ,CITY_NAME ,ALTER_EMPL ,ALTER_TIME ,CITY_SPELL ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,PROVINCE_ID ,VALID_STATUS ,DISTRICT_NAME ,PROVINCE_NAME ,DISTRICT_SPELL ,PROVINCE_SPELL )VALUES( #{id,jdbcType=BIGINT} , #{cCode,jdbcType=VARCHAR} , #{dCode,jdbcType=VARCHAR} , #{pCode,jdbcType=VARCHAR} , #{cityId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{cityName,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{citySpell,jdbcType=VARCHAR} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{provinceId,jdbcType=BIGINT} , #{validStatus,jdbcType=INTEGER} , #{districtName,jdbcType=VARCHAR} , #{provinceName,jdbcType=VARCHAR} , #{districtSpell,jdbcType=VARCHAR} , #{provinceSpell,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TgDistrictDO entity){
        return tgDistrictDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TG_DISTRICT.<br/>
     * descSql =  UPDATE TG_DISTRICT SET C_CODE = #{cCode,jdbcType=VARCHAR} ,D_CODE = #{dCode,jdbcType=VARCHAR} ,P_CODE = #{pCode,jdbcType=VARCHAR} ,CITY_ID = #{cityId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,CITY_NAME = #{cityName,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,CITY_SPELL = #{citySpell,jdbcType=VARCHAR} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,PROVINCE_ID = #{provinceId,jdbcType=BIGINT} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,DISTRICT_NAME = #{districtName,jdbcType=VARCHAR} ,PROVINCE_NAME = #{provinceName,jdbcType=VARCHAR} ,DISTRICT_SPELL = #{districtSpell,jdbcType=VARCHAR} ,PROVINCE_SPELL = #{provinceSpell,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TgDistrictDO entity){
        return tgDistrictDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TG_DISTRICT.<br/>
     * descSql =  DELETE FROM TG_DISTRICT WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return tgDistrictDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TG_DISTRICT.<br/>
     * descSql =  SELECT * FROM TG_DISTRICT WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TgDistrictDO
     */
    public TgDistrictDO getByPrimary(Long id){
        return tgDistrictDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TG_DISTRICT.<br/>
     * descSql =  SELECT * FROM TG_DISTRICT WHERE CITY_ID = #{cityId,jdbcType=BIGINT}
     * @param cityId cityId
     * @return List<TgDistrictDO>
     */
    public List<TgDistrictDO> showDistrictListByPid(Long cityId){
        return tgDistrictDOMapper.showDistrictListByPid(cityId);
    }
    /**
     * desc:根据主键获取有效性数据:TG_DISTRICT.<br/>
     * descSql =  SELECT * FROM TG_DISTRICT WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TgDistrictDO
     */
    public TgDistrictDO getByPrimarySelective(Long id){
        return tgDistrictDOMapper.getByPrimarySelective(id);
    }
}
