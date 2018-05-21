package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaShopFreightFreeshipDO;
import com.xl.dy.dal.mapper.TaShopFreightFreeshipDOMapper;

/**
* The Table TA_SHOP_FREIGHT_FREESHIP.
* TA_SHOP_FREIGHT_FREESHIP
*/
@Repository
public class TaShopFreightFreeshipDAO{

    @Autowired
    private TaShopFreightFreeshipDOMapper taShopFreightFreeshipDOMapper;

    /**
     * desc:插入表:TA_SHOP_FREIGHT_FREESHIP.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_SHOP_FREIGHT_FREESHIP( ID ,REMARK ,ADDR_CODES ,ADDR_NAMES ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,SHOP_FREIGHT_TEMPLET_ID )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{addrCodes,jdbcType=VARCHAR} , #{addrNames,jdbcType=LONGVARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{shopFreightTempletId,jdbcType=BIGINT} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaShopFreightFreeshipDO entity){
        return taShopFreightFreeshipDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_SHOP_FREIGHT_FREESHIP.<br/>
     * descSql =  UPDATE TA_SHOP_FREIGHT_FREESHIP SET REMARK = #{remark,jdbcType=VARCHAR} ,ADDR_CODES = #{addrCodes,jdbcType=VARCHAR} ,ADDR_NAMES = #{addrNames,jdbcType=LONGVARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,SHOP_FREIGHT_TEMPLET_ID = #{shopFreightTempletId,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaShopFreightFreeshipDO entity){
        return taShopFreightFreeshipDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_SHOP_FREIGHT_FREESHIP.<br/>
     * descSql =  DELETE FROM TA_SHOP_FREIGHT_FREESHIP WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taShopFreightFreeshipDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_FREIGHT_FREESHIP.<br/>
     * descSql =  SELECT * FROM TA_SHOP_FREIGHT_FREESHIP WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopFreightFreeshipDO
     */
    public TaShopFreightFreeshipDO getByPrimary(Long id){
        return taShopFreightFreeshipDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据主键删除数据:TA_SHOP_FREIGHT_FREESHIP.<br/>
     * descSql =  DELETE FROM TA_SHOP_FREIGHT_FREESHIP WHERE SHOP_FREIGHT_TEMPLET_ID = #{shopFreightTempletId,jdbcType=BIGINT}
     * @param shopFreightTempletId shopFreightTempletId
     * @return Long
     */
    public Long deleteByTempletId(Long shopFreightTempletId){
        return taShopFreightFreeshipDOMapper.deleteByTempletId(shopFreightTempletId);
    }
}
