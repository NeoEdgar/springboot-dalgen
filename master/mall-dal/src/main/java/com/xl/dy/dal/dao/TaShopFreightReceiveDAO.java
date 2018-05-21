package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaShopFreightReceiveDO;
import java.util.List;
import com.xl.dy.dal.mapper.TaShopFreightReceiveDOMapper;

/**
* The Table TA_SHOP_FREIGHT_RECEIVE.
* TA_SHOP_FREIGHT_RECEIVE
*/
@Repository
public class TaShopFreightReceiveDAO{

    @Autowired
    private TaShopFreightReceiveDOMapper taShopFreightReceiveDOMapper;

    /**
     * desc:插入表:TA_SHOP_FREIGHT_RECEIVE.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_SHOP_FREIGHT_RECEIVE( ID ,REMARK ,CONT_UNIT ,ADDR_CODES ,ADDR_NAMES ,ALTER_EMPL ,ALTER_TIME ,FIRST_UNIT ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,CONT_UNIT_FARE ,FIRST_UNIT_FARE ,FREIGHT_COUNT_MODE ,SHOP_FREIGHT_TEMPLET_ID )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{contUnit,jdbcType=DECIMAL} , #{addrCodes,jdbcType=VARCHAR} , #{addrNames,jdbcType=LONGVARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{firstUnit,jdbcType=DECIMAL} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{contUnitFare,jdbcType=DECIMAL} , #{firstUnitFare,jdbcType=DECIMAL} , #{freightCountMode,jdbcType=VARCHAR} , #{shopFreightTempletId,jdbcType=BIGINT} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaShopFreightReceiveDO entity){
        return taShopFreightReceiveDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_SHOP_FREIGHT_RECEIVE.<br/>
     * descSql =  UPDATE TA_SHOP_FREIGHT_RECEIVE SET REMARK = #{remark,jdbcType=VARCHAR} ,CONT_UNIT = #{contUnit,jdbcType=DECIMAL} ,ADDR_CODES = #{addrCodes,jdbcType=VARCHAR} ,ADDR_NAMES = #{addrNames,jdbcType=LONGVARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,FIRST_UNIT = #{firstUnit,jdbcType=DECIMAL} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,CONT_UNIT_FARE = #{contUnitFare,jdbcType=DECIMAL} ,FIRST_UNIT_FARE = #{firstUnitFare,jdbcType=DECIMAL} ,FREIGHT_COUNT_MODE = #{freightCountMode,jdbcType=VARCHAR} ,SHOP_FREIGHT_TEMPLET_ID = #{shopFreightTempletId,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaShopFreightReceiveDO entity){
        return taShopFreightReceiveDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_SHOP_FREIGHT_RECEIVE.<br/>
     * descSql =  DELETE FROM TA_SHOP_FREIGHT_RECEIVE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taShopFreightReceiveDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_FREIGHT_RECEIVE.<br/>
     * descSql =  SELECT * FROM TA_SHOP_FREIGHT_RECEIVE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopFreightReceiveDO
     */
    public TaShopFreightReceiveDO getByPrimary(Long id){
        return taShopFreightReceiveDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_FREIGHT_RECEIVE.<br/>
     * descSql =  SELECT * FROM ta_shop_freight_templet a LEFT JOIN ta_shop_freight_receive b ON a.ID = b.SHOP_FREIGHT_TEMPLET_ID WHERE a.SHOP_ID = #{shopId,jdbcType=BIGINT}
     * @param shopId shopId
     * @return List<TaShopFreightReceiveDO>
     */
    public List<TaShopFreightReceiveDO> getFreightTempletByShopId(Long shopId){
        return taShopFreightReceiveDOMapper.getFreightTempletByShopId(shopId);
    }
    /**
     * desc:根据主键删除数据:TA_SHOP_FREIGHT_RECEIVE.<br/>
     * descSql =  DELETE FROM TA_SHOP_FREIGHT_RECEIVE WHERE SHOP_FREIGHT_TEMPLET_ID = #{shopFreightTempletId,jdbcType=BIGINT}
     * @param shopFreightTempletId shopFreightTempletId
     * @return Long
     */
    public Long deleteByTempletId(Long shopFreightTempletId){
        return taShopFreightReceiveDOMapper.deleteByTempletId(shopFreightTempletId);
    }
}
