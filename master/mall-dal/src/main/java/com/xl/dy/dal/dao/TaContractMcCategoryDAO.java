package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaContractMcCategoryDO;
import java.util.Map;
import java.util.List;
import com.xl.dy.dal.mapper.TaContractMcCategoryDOMapper;

/**
* The Table TA_CONTRACT_MC_CATEGORY.
* TA_CONTRACT_MC_CATEGORY
*/
@Repository
public class TaContractMcCategoryDAO{

    @Autowired
    private TaContractMcCategoryDOMapper taContractMcCategoryDOMapper;

    /**
     * desc:插入表:TA_CONTRACT_MC_CATEGORY.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_CONTRACT_MC_CATEGORY( DP ,ID ,REMARK ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CONTRACT_ID ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,MG_CATEGORY_ID )VALUES( #{dp,jdbcType=DECIMAL} , #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{contractId,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{mgCategoryId,jdbcType=BIGINT} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaContractMcCategoryDO entity){
        return taContractMcCategoryDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_CONTRACT_MC_CATEGORY.<br/>
     * descSql =  UPDATE TA_CONTRACT_MC_CATEGORY SET DP = #{dp,jdbcType=DECIMAL} ,REMARK = #{remark,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CONTRACT_ID = #{contractId,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,MG_CATEGORY_ID = #{mgCategoryId,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaContractMcCategoryDO entity){
        return taContractMcCategoryDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_CONTRACT_MC_CATEGORY.<br/>
     * descSql =  DELETE FROM TA_CONTRACT_MC_CATEGORY WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taContractMcCategoryDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_CONTRACT_MC_CATEGORY.<br/>
     * descSql =  SELECT * FROM TA_CONTRACT_MC_CATEGORY WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaContractMcCategoryDO
     */
    public TaContractMcCategoryDO getByPrimary(Long id){
        return taContractMcCategoryDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据合同ID获取数据:TA_CONTRACT_MC_CATEGORY.<br/>
     * descSql =  SELECT A.DP dp, B.NAME name,B.FR fr FROM TA_CONTRACT_MC_CATEGORY A LEFT JOIN TG_MG_CATEGORY B ON A.MG_CATEGORY_ID = B.ID WHERE A.CONTRACT_ID = #{contractId,jdbcType=BIGINT}
     * @param contractId contractId
     * @return List<Map>
     */
    public List<Map> findListByContractId(Long contractId){
        return taContractMcCategoryDOMapper.findListByContractId(contractId);
    }
}
