package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaShopPickupLocationDO;
import org.springframework.stereotype.Repository;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_SHOP_PICKUP_LOCATION.
 * TA_SHOP_PICKUP_LOCATION
 */
@Repository
public interface TaShopPickupLocationDOMapper{

    /**
     * desc:插入表:TA_SHOP_PICKUP_LOCATION.<br/>
     * descSql =  INSERT INTO TA_SHOP_PICKUP_LOCATION( ID ,INX ,REMARK ,SHOP_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,PICKUP_LOCATION )VALUES( #{id,jdbcType=BIGINT} , #{inx,jdbcType=INTEGER} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{pickupLocation,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaShopPickupLocationDO entity);
    /**
     * desc:更新表:TA_SHOP_PICKUP_LOCATION.<br/>
     * descSql =  UPDATE TA_SHOP_PICKUP_LOCATION SET INX = #{inx,jdbcType=INTEGER} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,PICKUP_LOCATION = #{pickupLocation,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaShopPickupLocationDO entity);
    /**
     * desc:根据主键删除数据:TA_SHOP_PICKUP_LOCATION.<br/>
     * descSql =  DELETE FROM TA_SHOP_PICKUP_LOCATION WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_SHOP_PICKUP_LOCATION.<br/>
     * descSql =  SELECT * FROM TA_SHOP_PICKUP_LOCATION WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopPickupLocationDO
     */
    TaShopPickupLocationDO getByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_SHOP_PICKUP_LOCATION.<br/>
     * descSql =  SELECT * FROM TA_SHOP_PICKUP_LOCATION WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaShopPickupLocationDO
     */
    TaShopPickupLocationDO getByPrimarySelective(Long id);
}
