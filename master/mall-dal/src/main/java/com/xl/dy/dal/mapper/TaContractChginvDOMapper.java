package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaContractChginvDO;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_CONTRACT_CHGINV.
 * TA_CONTRACT_CHGINV
 */
public interface TaContractChginvDOMapper{

    /**
     * desc:插入表:TA_CONTRACT_CHGINV.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_CONTRACT_CHGINV( ID ,REMARK ,CHG_TIME ,ALTER_EMPL ,ALTER_TIME ,CHG_EMPL_ID ,TIMESTAMP ,CONTRACT_ID ,CREATE_EMPL ,CREATE_TIME ,CHG_EMPL_NAME ,VALID_STATUS ,PLAN_EXEC_TIME ,CONTRACT_CHG_TYPE ,REALITY_EXEC_TIME ,CONTRACT_CHG_EXEC_MODE ,CONTRACT_CHANGE_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{chgTime,jdbcType=TIMESTAMP} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{chgEmplId,jdbcType=BIGINT} , #{timestamp,jdbcType=BIGINT} , #{contractId,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{chgEmplName,jdbcType=VARCHAR} , #{validStatus,jdbcType=INTEGER} , #{planExecTime,jdbcType=TIMESTAMP} , #{contractChgType,jdbcType=VARCHAR} , #{realityExecTime,jdbcType=TIMESTAMP} , #{contractChgExecMode,jdbcType=VARCHAR} , #{contractChangeStatus,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaContractChginvDO entity);
    /**
     * desc:更新表:TA_CONTRACT_CHGINV.<br/>
     * descSql =  UPDATE TA_CONTRACT_CHGINV SET REMARK = #{remark,jdbcType=VARCHAR} ,CHG_TIME = #{chgTime,jdbcType=TIMESTAMP} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,CHG_EMPL_ID = #{chgEmplId,jdbcType=BIGINT} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CONTRACT_ID = #{contractId,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,CHG_EMPL_NAME = #{chgEmplName,jdbcType=VARCHAR} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,PLAN_EXEC_TIME = #{planExecTime,jdbcType=TIMESTAMP} ,CONTRACT_CHG_TYPE = #{contractChgType,jdbcType=VARCHAR} ,REALITY_EXEC_TIME = #{realityExecTime,jdbcType=TIMESTAMP} ,CONTRACT_CHG_EXEC_MODE = #{contractChgExecMode,jdbcType=VARCHAR} ,CONTRACT_CHANGE_STATUS = #{contractChangeStatus,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaContractChginvDO entity);
    /**
     * desc:根据主键删除数据:TA_CONTRACT_CHGINV.<br/>
     * descSql =  DELETE FROM TA_CONTRACT_CHGINV WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_CONTRACT_CHGINV.<br/>
     * descSql =  SELECT * FROM TA_CONTRACT_CHGINV WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaContractChginvDO
     */
    TaContractChginvDO getByPrimary(Long id);
}
