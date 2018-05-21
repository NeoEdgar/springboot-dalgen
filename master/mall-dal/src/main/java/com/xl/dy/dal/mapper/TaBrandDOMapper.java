package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaBrandDO;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_BRAND.
 * TA_BRAND
 */
public interface TaBrandDOMapper{

    /**
     * desc:插入表:TA_BRAND.<br/>
     * descSql =  INSERT INTO TA_BRAND( ID ,REMARK ,ALTER_EMPL ,ALTER_TIME ,BRAND_ICON ,TIMESTAMP ,BRAND_SPELL ,CREATE_EMPL ,CREATE_TIME ,BRAND_NAME_CN ,BRAND_NAME_EN ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{brandIcon,jdbcType=VARCHAR} , #{timestamp,jdbcType=BIGINT} , #{brandSpell,jdbcType=VARCHAR} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{brandNameCn,jdbcType=VARCHAR} , #{brandNameEn,jdbcType=VARCHAR} , #{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaBrandDO entity);
    /**
     * desc:更新表:TA_BRAND.<br/>
     * descSql =  UPDATE TA_BRAND SET REMARK = #{remark,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,BRAND_ICON = #{brandIcon,jdbcType=VARCHAR} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,BRAND_SPELL = #{brandSpell,jdbcType=VARCHAR} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,BRAND_NAME_CN = #{brandNameCn,jdbcType=VARCHAR} ,BRAND_NAME_EN = #{brandNameEn,jdbcType=VARCHAR} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaBrandDO entity);
    /**
     * desc:根据主键删除数据:TA_BRAND.<br/>
     * descSql =  DELETE FROM TA_BRAND WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_BRAND.<br/>
     * descSql =  SELECT * FROM TA_BRAND WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaBrandDO
     */
    TaBrandDO getByPrimary(Long id);
    /**
     * desc:根据主键获取有效数据:TA_BRAND.<br/>
     * descSql =  SELECT * FROM TA_BRAND WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaBrandDO
     */
    TaBrandDO getByPrimarySelective(Long id);
}
