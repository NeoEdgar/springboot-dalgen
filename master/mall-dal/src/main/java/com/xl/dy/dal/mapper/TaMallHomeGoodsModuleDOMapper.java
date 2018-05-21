package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaMallHomeGoodsModuleDO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * ?��???�?对�??页�????,请�?��?�使?��?��???DAO�?
 * The Table TA_MALL_HOME_GOODS_MODULE.
 * TA_MALL_HOME_GOODS_MODULE
 */
public interface TaMallHomeGoodsModuleDOMapper{

    /**
     * desc:???�表:TA_MALL_HOME_GOODS_MODULE.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_MALL_HOME_GOODS_MODULE( ID ,MALL_ID ,REMARK ,ALTER_EMPL ,ALTER_TIME ,MODULE_INX ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,MODULE_NAME ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{mallId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{moduleInx,jdbcType=INTEGER} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{moduleName,jdbcType=VARCHAR} , #{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaMallHomeGoodsModuleDO entity);
    /**
     * desc:?��?�表:TA_MALL_HOME_GOODS_MODULE.<br/>
     * descSql =  UPDATE TA_MALL_HOME_GOODS_MODULE SET MALL_ID = #{mallId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,MODULE_INX = #{moduleInx,jdbcType=INTEGER} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,MODULE_NAME = #{moduleName,jdbcType=VARCHAR} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaMallHomeGoodsModuleDO entity);
    /**
     * desc:?��??主�?????��?��??:TA_MALL_HOME_GOODS_MODULE.<br/>
     * descSql =  DELETE FROM TA_MALL_HOME_GOODS_MODULE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:?��??主�???��???��??:TA_MALL_HOME_GOODS_MODULE.<br/>
     * descSql =  SELECT * FROM TA_MALL_HOME_GOODS_MODULE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaMallHomeGoodsModuleDO
     */
    TaMallHomeGoodsModuleDO getByPrimary(Long id);
    /**
     * desc::TA_MALL_HOME_GOODS_MODULE.<br/>
     * descSql =  SELECT * FROM TA_MALL_HOME_GOODS_MODULE WHERE MALL_ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return List<TaMallHomeGoodsModuleDO>
     */
    List<TaMallHomeGoodsModuleDO> getModuleByMall(Long id);
}
