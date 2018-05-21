package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaErpJinliWarehouseDO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_ERP_JINLI_WAREHOUSE.
 * TA_ERP_JINLI_WAREHOUSE
 */
public interface TaErpJinliWarehouseDOMapper{

    /**
     * desc:插入表:TA_ERP_JINLI_WAREHOUSE.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_ERP_JINLI_WAREHOUSE( ID ,IS_LEAF ,REMARK ,ERP_CODE ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,PARENT_CODE ,VALID_STATUS ,WAREHOUSE_CODE ,WAREHOUSE_NAME ,WAREHOUSE_LEVEL )VALUES( #{id,jdbcType=BIGINT} , #{isLeaf,jdbcType=INTEGER} , #{remark,jdbcType=VARCHAR} , #{erpCode,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{parentCode,jdbcType=VARCHAR} , #{validStatus,jdbcType=INTEGER} , #{warehouseCode,jdbcType=VARCHAR} , #{warehouseName,jdbcType=VARCHAR} , #{warehouseLevel,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaErpJinliWarehouseDO entity);
    /**
     * desc:更新表:TA_ERP_JINLI_WAREHOUSE.<br/>
     * descSql =  UPDATE TA_ERP_JINLI_WAREHOUSE SET IS_LEAF = #{isLeaf,jdbcType=INTEGER} ,REMARK = #{remark,jdbcType=VARCHAR} ,ERP_CODE = #{erpCode,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,PARENT_CODE = #{parentCode,jdbcType=VARCHAR} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,WAREHOUSE_CODE = #{warehouseCode,jdbcType=VARCHAR} ,WAREHOUSE_NAME = #{warehouseName,jdbcType=VARCHAR} ,WAREHOUSE_LEVEL = #{warehouseLevel,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaErpJinliWarehouseDO entity);
    /**
     * desc:根据主键删除数据:TA_ERP_JINLI_WAREHOUSE.<br/>
     * descSql =  DELETE FROM TA_ERP_JINLI_WAREHOUSE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_ERP_JINLI_WAREHOUSE.<br/>
     * descSql =  SELECT * FROM TA_ERP_JINLI_WAREHOUSE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaErpJinliWarehouseDO
     */
    TaErpJinliWarehouseDO getByPrimary(Long id);
    /**
     * desc:根据部门类型获取部门信息.<br/>
     * descSql =  SELECT * FROM TA_ERP_JINLI_WAREHOUSE WHERE ERP_CODE = 'jl' AND WAREHOUSE_LEVEL&gt;1 ORDER BY WAREHOUSE_LEVEL ASC 
     * @return List<TaErpJinliWarehouseDO>
     */
    List<TaErpJinliWarehouseDO> getErpWarehouse();
}
