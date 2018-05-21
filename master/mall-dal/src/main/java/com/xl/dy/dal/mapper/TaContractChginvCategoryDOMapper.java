package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaContractChginvCategoryDO;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_CONTRACT_CHGINV_CATEGORY.
 * TA_CONTRACT_CHGINV_CATEGORY
 */
public interface TaContractChginvCategoryDOMapper{

    /**
     * desc:插入表:TA_CONTRACT_CHGINV_CATEGORY.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_CONTRACT_CHGINV_CATEGORY( DP ,ID ,REMARK ,ALTER_EMPL ,ALTER_TIME ,POINT_RATE ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,MG_CATEGORY_ID ,CONTRACT_CHG_INVOICES_ID )VALUES( #{dp,jdbcType=DECIMAL} , #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{pointRate,jdbcType=DECIMAL} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{mgCategoryId,jdbcType=BIGINT} , #{contractChgInvoicesId,jdbcType=BIGINT} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaContractChginvCategoryDO entity);
    /**
     * desc:更新表:TA_CONTRACT_CHGINV_CATEGORY.<br/>
     * descSql =  UPDATE TA_CONTRACT_CHGINV_CATEGORY SET DP = #{dp,jdbcType=DECIMAL} ,REMARK = #{remark,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,POINT_RATE = #{pointRate,jdbcType=DECIMAL} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,MG_CATEGORY_ID = #{mgCategoryId,jdbcType=BIGINT} ,CONTRACT_CHG_INVOICES_ID = #{contractChgInvoicesId,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaContractChginvCategoryDO entity);
    /**
     * desc:根据主键删除数据:TA_CONTRACT_CHGINV_CATEGORY.<br/>
     * descSql =  DELETE FROM TA_CONTRACT_CHGINV_CATEGORY WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_CONTRACT_CHGINV_CATEGORY.<br/>
     * descSql =  SELECT * FROM TA_CONTRACT_CHGINV_CATEGORY WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaContractChginvCategoryDO
     */
    TaContractChginvCategoryDO getByPrimary(Long id);
}
