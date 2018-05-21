package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaContractMcCategoryDO;
import java.util.Map;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_CONTRACT_MC_CATEGORY.
 * TA_CONTRACT_MC_CATEGORY
 */
public interface TaContractMcCategoryDOMapper{

    /**
     * desc:插入表:TA_CONTRACT_MC_CATEGORY.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_CONTRACT_MC_CATEGORY( DP ,ID ,REMARK ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CONTRACT_ID ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,MG_CATEGORY_ID )VALUES( #{dp,jdbcType=DECIMAL} , #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{contractId,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{mgCategoryId,jdbcType=BIGINT} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaContractMcCategoryDO entity);
    /**
     * desc:更新表:TA_CONTRACT_MC_CATEGORY.<br/>
     * descSql =  UPDATE TA_CONTRACT_MC_CATEGORY SET DP = #{dp,jdbcType=DECIMAL} ,REMARK = #{remark,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CONTRACT_ID = #{contractId,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,MG_CATEGORY_ID = #{mgCategoryId,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaContractMcCategoryDO entity);
    /**
     * desc:根据主键删除数据:TA_CONTRACT_MC_CATEGORY.<br/>
     * descSql =  DELETE FROM TA_CONTRACT_MC_CATEGORY WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_CONTRACT_MC_CATEGORY.<br/>
     * descSql =  SELECT * FROM TA_CONTRACT_MC_CATEGORY WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaContractMcCategoryDO
     */
    TaContractMcCategoryDO getByPrimary(Long id);
    /**
     * desc:根据合同ID获取数据:TA_CONTRACT_MC_CATEGORY.<br/>
     * descSql =  SELECT A.DP dp, B.NAME name,B.FR fr FROM TA_CONTRACT_MC_CATEGORY A LEFT JOIN TG_MG_CATEGORY B ON A.MG_CATEGORY_ID = B.ID WHERE A.CONTRACT_ID = #{contractId,jdbcType=BIGINT}
     * @param contractId contractId
     * @return List<Map>
     */
    List<Map> findListByContractId(Long contractId);
}
