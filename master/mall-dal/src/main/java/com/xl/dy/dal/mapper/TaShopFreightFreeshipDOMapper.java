package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaShopFreightFreeshipDO;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_SHOP_FREIGHT_FREESHIP.
 * TA_SHOP_FREIGHT_FREESHIP
 */
public interface TaShopFreightFreeshipDOMapper{

    /**
     * desc:插入表:TA_SHOP_FREIGHT_FREESHIP.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_SHOP_FREIGHT_FREESHIP( ID ,REMARK ,ADDR_CODES ,ADDR_NAMES ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,SHOP_FREIGHT_TEMPLET_ID )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{addrCodes,jdbcType=VARCHAR} , #{addrNames,jdbcType=LONGVARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{shopFreightTempletId,jdbcType=BIGINT} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaShopFreightFreeshipDO entity);
    /**
     * desc:更新表:TA_SHOP_FREIGHT_FREESHIP.<br/>
     * descSql =  UPDATE TA_SHOP_FREIGHT_FREESHIP SET REMARK = #{remark,jdbcType=VARCHAR} ,ADDR_CODES = #{addrCodes,jdbcType=VARCHAR} ,ADDR_NAMES = #{addrNames,jdbcType=LONGVARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,SHOP_FREIGHT_TEMPLET_ID = #{shopFreightTempletId,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaShopFreightFreeshipDO entity);
    /**
     * desc:根据主键删除数据:TA_SHOP_FREIGHT_FREESHIP.<br/>
     * descSql =  DELETE FROM TA_SHOP_FREIGHT_FREESHIP WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_SHOP_FREIGHT_FREESHIP.<br/>
     * descSql =  SELECT * FROM TA_SHOP_FREIGHT_FREESHIP WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopFreightFreeshipDO
     */
    TaShopFreightFreeshipDO getByPrimary(Long id);
    /**
     * desc:根据主键删除数据:TA_SHOP_FREIGHT_FREESHIP.<br/>
     * descSql =  DELETE FROM TA_SHOP_FREIGHT_FREESHIP WHERE SHOP_FREIGHT_TEMPLET_ID = #{shopFreightTempletId,jdbcType=BIGINT}
     * @param shopFreightTempletId shopFreightTempletId
     * @return Long
     */
    Long deleteByTempletId(Long shopFreightTempletId);
}
