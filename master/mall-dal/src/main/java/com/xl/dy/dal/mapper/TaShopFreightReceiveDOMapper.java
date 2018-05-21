package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaShopFreightReceiveDO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_SHOP_FREIGHT_RECEIVE.
 * TA_SHOP_FREIGHT_RECEIVE
 */
public interface TaShopFreightReceiveDOMapper{

    /**
     * desc:插入表:TA_SHOP_FREIGHT_RECEIVE.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_SHOP_FREIGHT_RECEIVE( ID ,REMARK ,CONT_UNIT ,ADDR_CODES ,ADDR_NAMES ,ALTER_EMPL ,ALTER_TIME ,FIRST_UNIT ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,CONT_UNIT_FARE ,FIRST_UNIT_FARE ,FREIGHT_COUNT_MODE ,SHOP_FREIGHT_TEMPLET_ID )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{contUnit,jdbcType=DECIMAL} , #{addrCodes,jdbcType=VARCHAR} , #{addrNames,jdbcType=LONGVARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{firstUnit,jdbcType=DECIMAL} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{contUnitFare,jdbcType=DECIMAL} , #{firstUnitFare,jdbcType=DECIMAL} , #{freightCountMode,jdbcType=VARCHAR} , #{shopFreightTempletId,jdbcType=BIGINT} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaShopFreightReceiveDO entity);
    /**
     * desc:更新表:TA_SHOP_FREIGHT_RECEIVE.<br/>
     * descSql =  UPDATE TA_SHOP_FREIGHT_RECEIVE SET REMARK = #{remark,jdbcType=VARCHAR} ,CONT_UNIT = #{contUnit,jdbcType=DECIMAL} ,ADDR_CODES = #{addrCodes,jdbcType=VARCHAR} ,ADDR_NAMES = #{addrNames,jdbcType=LONGVARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,FIRST_UNIT = #{firstUnit,jdbcType=DECIMAL} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,CONT_UNIT_FARE = #{contUnitFare,jdbcType=DECIMAL} ,FIRST_UNIT_FARE = #{firstUnitFare,jdbcType=DECIMAL} ,FREIGHT_COUNT_MODE = #{freightCountMode,jdbcType=VARCHAR} ,SHOP_FREIGHT_TEMPLET_ID = #{shopFreightTempletId,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaShopFreightReceiveDO entity);
    /**
     * desc:根据主键删除数据:TA_SHOP_FREIGHT_RECEIVE.<br/>
     * descSql =  DELETE FROM TA_SHOP_FREIGHT_RECEIVE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_SHOP_FREIGHT_RECEIVE.<br/>
     * descSql =  SELECT * FROM TA_SHOP_FREIGHT_RECEIVE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopFreightReceiveDO
     */
    TaShopFreightReceiveDO getByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_SHOP_FREIGHT_RECEIVE.<br/>
     * descSql =  SELECT * FROM ta_shop_freight_templet a LEFT JOIN ta_shop_freight_receive b ON a.ID = b.SHOP_FREIGHT_TEMPLET_ID WHERE a.SHOP_ID = #{shopId,jdbcType=BIGINT}
     * @param shopId shopId
     * @return List<TaShopFreightReceiveDO>
     */
    List<TaShopFreightReceiveDO> getFreightTempletByShopId(Long shopId);
    /**
     * desc:根据主键删除数据:TA_SHOP_FREIGHT_RECEIVE.<br/>
     * descSql =  DELETE FROM TA_SHOP_FREIGHT_RECEIVE WHERE SHOP_FREIGHT_TEMPLET_ID = #{shopFreightTempletId,jdbcType=BIGINT}
     * @param shopFreightTempletId shopFreightTempletId
     * @return Long
     */
    Long deleteByTempletId(Long shopFreightTempletId);
}
