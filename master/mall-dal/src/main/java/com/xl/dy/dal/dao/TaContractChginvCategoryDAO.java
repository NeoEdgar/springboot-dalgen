package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaContractChginvCategoryDO;
import com.xl.dy.dal.mapper.TaContractChginvCategoryDOMapper;

/**
* The Table TA_CONTRACT_CHGINV_CATEGORY.
* TA_CONTRACT_CHGINV_CATEGORY
*/
@Repository
public class TaContractChginvCategoryDAO{

    @Autowired
    private TaContractChginvCategoryDOMapper taContractChginvCategoryDOMapper;

    /**
     * desc:插入表:TA_CONTRACT_CHGINV_CATEGORY.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_CONTRACT_CHGINV_CATEGORY( DP ,ID ,REMARK ,ALTER_EMPL ,ALTER_TIME ,POINT_RATE ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,MG_CATEGORY_ID ,CONTRACT_CHG_INVOICES_ID )VALUES( #{dp,jdbcType=DECIMAL} , #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{pointRate,jdbcType=DECIMAL} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{mgCategoryId,jdbcType=BIGINT} , #{contractChgInvoicesId,jdbcType=BIGINT} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaContractChginvCategoryDO entity){
        return taContractChginvCategoryDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_CONTRACT_CHGINV_CATEGORY.<br/>
     * descSql =  UPDATE TA_CONTRACT_CHGINV_CATEGORY SET DP = #{dp,jdbcType=DECIMAL} ,REMARK = #{remark,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,POINT_RATE = #{pointRate,jdbcType=DECIMAL} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,MG_CATEGORY_ID = #{mgCategoryId,jdbcType=BIGINT} ,CONTRACT_CHG_INVOICES_ID = #{contractChgInvoicesId,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaContractChginvCategoryDO entity){
        return taContractChginvCategoryDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_CONTRACT_CHGINV_CATEGORY.<br/>
     * descSql =  DELETE FROM TA_CONTRACT_CHGINV_CATEGORY WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taContractChginvCategoryDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_CONTRACT_CHGINV_CATEGORY.<br/>
     * descSql =  SELECT * FROM TA_CONTRACT_CHGINV_CATEGORY WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaContractChginvCategoryDO
     */
    public TaContractChginvCategoryDO getByPrimary(Long id){
        return taContractChginvCategoryDOMapper.getByPrimary(id);
    }
}
