package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaMallAuthDO;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_MALL_AUTH.
 * TA_MALL_AUTH
 */
public interface TaMallAuthDOMapper{

    /**
     * desc:插入表:TA_MALL_AUTH.<br/>
     * descSql =  INSERT INTO TA_MALL_AUTH( ID ,MALL_ID ,REMARK ,ERP_ACC_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{mallId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{erpAccId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaMallAuthDO entity);
    /**
     * desc:更新表:TA_MALL_AUTH.<br/>
     * descSql =  UPDATE TA_MALL_AUTH SET MALL_ID = #{mallId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,ERP_ACC_ID = #{erpAccId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaMallAuthDO entity);
    /**
     * desc:根据主键删除数据:TA_MALL_AUTH.<br/>
     * descSql =  DELETE FROM TA_MALL_AUTH WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_MALL_AUTH.<br/>
     * descSql =  SELECT * FROM TA_MALL_AUTH WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaMallAuthDO
     */
    TaMallAuthDO getByPrimary(Long id);
    /**
     * desc:根据商场ID获取数据:TA_MALL_AUTH.<br/>
     * descSql =  SELECT ERP_ACC_ID FROM TA_MALL_AUTH WHERE MALL_ID = #{mallId,jdbcType=BIGINT}
     * @param mallId mallId
     * @return Long
     */
    Long getMallAuthByMallId(Long mallId);
}
