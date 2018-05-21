package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TgProvinceDO;
import java.util.Map;
import java.util.List;
import com.xl.dy.dal.mapper.TgProvinceDOMapper;

/**
* The Table TG_PROVINCE.
* TG_PROVINCE
*/
@Repository
public class TgProvinceDAO{

    @Autowired
    private TgProvinceDOMapper tgProvinceDOMapper;

    /**
     * desc:插入表:TG_PROVINCE.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TG_PROVINCE( ID ,REMARK ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,PROVINCE_NAME ,PROVINCE_SPELL )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{provinceName,jdbcType=VARCHAR} , #{provinceSpell,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TgProvinceDO entity){
        return tgProvinceDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TG_PROVINCE.<br/>
     * descSql =  UPDATE TG_PROVINCE SET REMARK = #{remark,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,PROVINCE_NAME = #{provinceName,jdbcType=VARCHAR} ,PROVINCE_SPELL = #{provinceSpell,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TgProvinceDO entity){
        return tgProvinceDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TG_PROVINCE.<br/>
     * descSql =  DELETE FROM TG_PROVINCE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return tgProvinceDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TG_PROVINCE.<br/>
     * descSql =  SELECT * FROM TG_PROVINCE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TgProvinceDO
     */
    public TgProvinceDO getByPrimary(Long id){
        return tgProvinceDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TG_PROVINCE.<br/>
     * descSql =  SELECT ID,PROVINCE_NAME,PROVINCE_SPELL FROM TG_PROVINCE
     * @return List<Map>
     */
    public List<Map> showProvinceList(){
        return tgProvinceDOMapper.showProvinceList();
    }
}
