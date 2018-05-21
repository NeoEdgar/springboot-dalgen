package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaContractDO;
import java.util.Map;
import java.util.List;
import java.util.Date;
import com.xl.dy.dal.paging.QueryTerminationContractListByMallPage;
import com.xl.dy.dal.mapper.TaContractDOMapper;

/**
* The Table TA_CONTRACT.
* TA_CONTRACT
*/
@Repository
public class TaContractDAO{

    @Autowired
    private TaContractDOMapper taContractDOMapper;

    /**
     * desc:插入表:TA_CONTRACT.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_CONTRACT( ID ,PA_ID ,PB_ID ,REMARK ,END_DATE ,ALTER_EMPL ,ALTER_TIME ,IS_FOREVER ,START_DATE ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,CONTRACT_LEV ,VALID_STATUS ,CONTRACT_NAME ,CONTRACT_TEXT ,CONTRACT_TYPE ,ACCOUNT_UNIT_ID ,CONTRACT_NUMBER ,CONTRACT_STATUS ,MG_CATEGORY_TEXT )VALUES( #{id,jdbcType=BIGINT} , #{paId,jdbcType=BIGINT} , #{pbId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{endDate,jdbcType=DATE} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{isForever,jdbcType=INTEGER} , #{startDate,jdbcType=DATE} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{contractLev,jdbcType=INTEGER} , #{validStatus,jdbcType=INTEGER} , #{contractName,jdbcType=VARCHAR} , #{contractText,jdbcType=LONGVARCHAR} , #{contractType,jdbcType=VARCHAR} , #{accountUnitId,jdbcType=BIGINT} , #{contractNumber,jdbcType=VARCHAR} , #{contractStatus,jdbcType=VARCHAR} , #{mgCategoryText,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaContractDO entity){
        return taContractDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_CONTRACT.<br/>
     * descSql =  UPDATE TA_CONTRACT SET PA_ID = #{paId,jdbcType=BIGINT} ,PB_ID = #{pbId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,END_DATE = #{endDate,jdbcType=DATE} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,IS_FOREVER = #{isForever,jdbcType=INTEGER} ,START_DATE = #{startDate,jdbcType=DATE} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,CONTRACT_LEV = #{contractLev,jdbcType=INTEGER} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,CONTRACT_NAME = #{contractName,jdbcType=VARCHAR} ,CONTRACT_TEXT = #{contractText,jdbcType=LONGVARCHAR} ,CONTRACT_TYPE = #{contractType,jdbcType=VARCHAR} ,ACCOUNT_UNIT_ID = #{accountUnitId,jdbcType=BIGINT} ,CONTRACT_NUMBER = #{contractNumber,jdbcType=VARCHAR} ,CONTRACT_STATUS = #{contractStatus,jdbcType=VARCHAR} ,MG_CATEGORY_TEXT = #{mgCategoryText,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaContractDO entity){
        return taContractDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_CONTRACT.<br/>
     * descSql =  DELETE FROM TA_CONTRACT WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taContractDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_CONTRACT.<br/>
     * descSql =  SELECT * FROM TA_CONTRACT WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaContractDO
     */
    public TaContractDO getByPrimary(Long id){
        return taContractDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据商场id和合同状态获取数据:TA_CONTRACT.<br/>
     * descSql =  SELECT ID contractId,CONTRACT_NUMBER contractNumber,START_DATE startDate,END_DATE endDate,CONTRACT_STATUS status,ACCOUNT_UNIT_ID accountUnitId FROM TA_CONTRACT WHERE PB_ID= #{mallId,jdbcType=BIGINT} and CONTRACT_STATUS= #{contractStatus,jdbcType=VARCHAR} and VALID_STATUS = 1
     * @param mallId mallId
     * @param contractStatus contractStatus
     * @return List<Map>
     */
    public List<Map> getContractByStatus(Long mallId,String contractStatus){
        return taContractDOMapper.getContractByStatus(mallId, contractStatus);
    }
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
    public TaContractDO changeContractStatus(Date alterTime,Long id,Long timeStamp,Long alterEmplId,String contractStatus){
        return taContractDOMapper.changeContractStatus(alterTime, id, timeStamp, alterEmplId, contractStatus);
    }
    /**
     * desc:获取历史合同列表:TA_CONTRACT.<br/>
     * descSql =  SELECT a.ID contractId, a.CONTRACT_NUMBER contractNumber, a.START_DATE startDate, a.END_DATE endDate, a.CONTRACT_STATUS STATUS, a.CREATE_TIME createTime, c.NAME createName FROM TA_CONTRACT a LEFT JOIN TA_EMPL_ROLE_AUTH c ON a.CREATE_EMPL = c.EMPL_ID WHERE a.PB_ID = #{mallId,jdbcType=BIGINT} AND a.CONTRACT_STATUS = 'TERMINATION' AND a.VALID_STATUS = 1 AND date(START_DATE) between #{firstTime,jdbcType=TIMESTAMP} and #{lastTime,jdbcType=TIMESTAMP} 
     * @param queryTerminationContractListByMall queryTerminationContractListByMall
     * @return QueryTerminationContractListByMallPage
     */
    public QueryTerminationContractListByMallPage getContractListByMall(QueryTerminationContractListByMallPage queryTerminationContractListByMall){
        int total = taContractDOMapper.getContractListByMallCount(queryTerminationContractListByMall);
        if(total>0){
            queryTerminationContractListByMall.setDatas(taContractDOMapper.getContractListByMallResult(queryTerminationContractListByMall));
        }
        queryTerminationContractListByMall.setTotal(total);
        return queryTerminationContractListByMall;
    }
}
