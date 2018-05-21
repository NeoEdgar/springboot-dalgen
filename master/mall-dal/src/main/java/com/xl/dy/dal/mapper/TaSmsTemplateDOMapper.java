package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaSmsTemplateDO;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_SMS_TEMPLATE.
 * TA_SMS_TEMPLATE
 */
public interface TaSmsTemplateDOMapper{

    /**
     * desc:插入表:TA_SMS_TEMPLATE.<br/>
     * descSql =  INSERT INTO TA_SMS_TEMPLATE( ID ,CODE ,FILED ,REMARK ,CONTENT ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,VALID_TIME ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{code,jdbcType=VARCHAR} , #{filed,jdbcType=VARCHAR} , #{remark,jdbcType=VARCHAR} , #{content,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{validTime,jdbcType=INTEGER} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaSmsTemplateDO entity);
    /**
     * desc:更新表:TA_SMS_TEMPLATE.<br/>
     * descSql =  UPDATE TA_SMS_TEMPLATE SET CODE = #{code,jdbcType=VARCHAR} ,FILED = #{filed,jdbcType=VARCHAR} ,REMARK = #{remark,jdbcType=VARCHAR} ,CONTENT = #{content,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,VALID_TIME = #{validTime,jdbcType=INTEGER} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaSmsTemplateDO entity);
    /**
     * desc:根据主键删除数据:TA_SMS_TEMPLATE.<br/>
     * descSql =  DELETE FROM TA_SMS_TEMPLATE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_SMS_TEMPLATE.<br/>
     * descSql =  SELECT * FROM TA_SMS_TEMPLATE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaSmsTemplateDO
     */
    TaSmsTemplateDO getByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_SMS_TEMPLATE.<br/>
     * descSql =  SELECT * FROM TA_SMS_TEMPLATE WHERE CODE = #{code,jdbcType=VARCHAR}
     * @param code code
     * @return TaSmsTemplateDO
     */
    TaSmsTemplateDO getBySmsCode(String code);
}
