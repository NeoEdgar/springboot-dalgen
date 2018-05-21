package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaContractDO;
import java.util.Map;
import java.util.List;
import java.util.Date;
import com.xl.dy.dal.paging.QueryTerminationContractListByMallPage;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_CONTRACT.
 * TA_CONTRACT
 */
public interface TaContractDOMapper{

    /**
     * desc:插入表:TA_CONTRACT.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_CONTRACT( ID ,PA_ID ,PB_ID ,REMARK ,END_DATE ,ALTER_EMPL ,ALTER_TIME ,IS_FOREVER ,START_DATE ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,CONTRACT_LEV ,VALID_STATUS ,CONTRACT_NAME ,CONTRACT_TEXT ,CONTRACT_TYPE ,ACCOUNT_UNIT_ID ,CONTRACT_NUMBER ,CONTRACT_STATUS ,MG_CATEGORY_TEXT )VALUES( #{id,jdbcType=BIGINT} , #{paId,jdbcType=BIGINT} , #{pbId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{endDate,jdbcType=DATE} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{isForever,jdbcType=INTEGER} , #{startDate,jdbcType=DATE} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{contractLev,jdbcType=INTEGER} , #{validStatus,jdbcType=INTEGER} , #{contractName,jdbcType=VARCHAR} , #{contractText,jdbcType=LONGVARCHAR} , #{contractType,jdbcType=VARCHAR} , #{accountUnitId,jdbcType=BIGINT} , #{contractNumber,jdbcType=VARCHAR} , #{contractStatus,jdbcType=VARCHAR} , #{mgCategoryText,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaContractDO entity);
    /**
     * desc:更新表:TA_CONTRACT.<br/>
     * descSql =  UPDATE TA_CONTRACT SET PA_ID = #{paId,jdbcType=BIGINT} ,PB_ID = #{pbId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,END_DATE = #{endDate,jdbcType=DATE} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,IS_FOREVER = #{isForever,jdbcType=INTEGER} ,START_DATE = #{startDate,jdbcType=DATE} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,CONTRACT_LEV = #{contractLev,jdbcType=INTEGER} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,CONTRACT_NAME = #{contractName,jdbcType=VARCHAR} ,CONTRACT_TEXT = #{contractText,jdbcType=LONGVARCHAR} ,CONTRACT_TYPE = #{contractType,jdbcType=VARCHAR} ,ACCOUNT_UNIT_ID = #{accountUnitId,jdbcType=BIGINT} ,CONTRACT_NUMBER = #{contractNumber,jdbcType=VARCHAR} ,CONTRACT_STATUS = #{contractStatus,jdbcType=VARCHAR} ,MG_CATEGORY_TEXT = #{mgCategoryText,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaContractDO entity);
    /**
     * desc:根据主键删除数据:TA_CONTRACT.<br/>
     * descSql =  DELETE FROM TA_CONTRACT WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_CONTRACT.<br/>
     * descSql =  SELECT * FROM TA_CONTRACT WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaContractDO
     */
    TaContractDO getByPrimary(Long id);
    /**
     * desc:根据商场id和合同状态获取数据:TA_CONTRACT.<br/>
     * descSql =  SELECT ID contractId,CONTRACT_NUMBER contractNumber,START_DATE startDate,END_DATE endDate,CONTRACT_STATUS status,ACCOUNT_UNIT_ID accountUnitId FROM TA_CONTRACT WHERE PB_ID= #{mallId,jdbcType=BIGINT} and CONTRACT_STATUS= #{contractStatus,jdbcType=VARCHAR} and VALID_STATUS = 1
     * @param mallId mallId
     * @param contractStatus contractStatus
     * @return List<Map>
     */
    List<Map> getContractByStatus(@Param("mallId")Long mallId,@Param("contractStatus")String contractStatus);
    /**
     * desc:改变合同状态:TA_CONTRACT.<br/>
     * descSql =  UPDATE TA_CONTRACT SET CONTRACT_STATUS = #{contractStatus,jdbcType=VARCHAR}, ALTER_EMPL= #{alterEmplId,jdbcType=BIGINT}, ALTER_TIME= #{alterTime,jdbcType=TIMESTAMP}, TIMESTAMP= #{timeStamp,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT} and VALID_STATUS = 1
     * @param alterTime alterTime
     * @param id id
     * @param timeStamp timeStamp
     * @param alterEmplId alterEmplId
     * @param contractStatus contractStatus
     * @return TaContractDO
     */
    TaContractDO changeContractStatus(@Param("alterTime")Date alterTime,@Param("id")Long id,@Param("timeStamp")Long timeStamp,@Param("alterEmplId")Long alterEmplId,@Param("contractStatus")String contractStatus);
    /**
     * desc:获取历史合同列表:TA_CONTRACT.<br/>
     * descSql =  SELECT a.ID contractId, a.CONTRACT_NUMBER contractNumber, a.START_DATE startDate, a.END_DATE endDate, a.CONTRACT_STATUS STATUS, a.CREATE_TIME createTime, c.NAME createName FROM TA_CONTRACT a LEFT JOIN TA_EMPL_ROLE_AUTH c ON a.CREATE_EMPL = c.EMPL_ID WHERE a.PB_ID = #{mallId,jdbcType=BIGINT} AND a.CONTRACT_STATUS = 'TERMINATION' AND a.VALID_STATUS = 1 AND date(START_DATE) between #{firstTime,jdbcType=TIMESTAMP} and #{lastTime,jdbcType=TIMESTAMP} 
     * @param queryTerminationContractListByMall queryTerminationContractListByMall
     * @return int
     */
    int getContractListByMallCount(QueryTerminationContractListByMallPage queryTerminationContractListByMall);
    /**
     * desc:获取历史合同列表:TA_CONTRACT.<br/>
     * descSql =  SELECT a.ID contractId, a.CONTRACT_NUMBER contractNumber, a.START_DATE startDate, a.END_DATE endDate, a.CONTRACT_STATUS STATUS, a.CREATE_TIME createTime, c.NAME createName FROM TA_CONTRACT a LEFT JOIN TA_EMPL_ROLE_AUTH c ON a.CREATE_EMPL = c.EMPL_ID WHERE a.PB_ID = #{mallId,jdbcType=BIGINT} AND a.CONTRACT_STATUS = 'TERMINATION' AND a.VALID_STATUS = 1 AND date(START_DATE) between #{firstTime,jdbcType=TIMESTAMP} and #{lastTime,jdbcType=TIMESTAMP} 
     * @param queryTerminationContractListByMall queryTerminationContractListByMall
     * @return List<Map>
     */
    List<Map> getContractListByMallResult(QueryTerminationContractListByMallPage queryTerminationContractListByMall);
}
