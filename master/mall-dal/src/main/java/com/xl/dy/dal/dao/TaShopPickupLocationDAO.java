package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaShopPickupLocationDO;
import com.xl.dy.dal.mapper.TaShopPickupLocationDOMapper;

/**
* The Table TA_SHOP_PICKUP_LOCATION.
* TA_SHOP_PICKUP_LOCATION
*/
@Repository
public class TaShopPickupLocationDAO{

    @Autowired
    private TaShopPickupLocationDOMapper taShopPickupLocationDOMapper;

    /**
     * desc:插入表:TA_SHOP_PICKUP_LOCATION.<br/>
     * descSql =  INSERT INTO TA_SHOP_PICKUP_LOCATION( ID ,INX ,REMARK ,SHOP_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,PICKUP_LOCATION )VALUES( #{id,jdbcType=BIGINT} , #{inx,jdbcType=INTEGER} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{pickupLocation,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaShopPickupLocationDO entity){
        return taShopPickupLocationDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_SHOP_PICKUP_LOCATION.<br/>
     * descSql =  UPDATE TA_SHOP_PICKUP_LOCATION SET INX = #{inx,jdbcType=INTEGER} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,PICKUP_LOCATION = #{pickupLocation,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaShopPickupLocationDO entity){
        return taShopPickupLocationDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_SHOP_PICKUP_LOCATION.<br/>
     * descSql =  DELETE FROM TA_SHOP_PICKUP_LOCATION WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taShopPickupLocationDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_PICKUP_LOCATION.<br/>
     * descSql =  SELECT * FROM TA_SHOP_PICKUP_LOCATION WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopPickupLocationDO
     */
    public TaShopPickupLocationDO getByPrimary(Long id){
        return taShopPickupLocationDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_PICKUP_LOCATION.<br/>
     * descSql =  SELECT * FROM TA_SHOP_PICKUP_LOCATION WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaShopPickupLocationDO
     */
    public TaShopPickupLocationDO getByPrimarySelective(Long id){
        return taShopPickupLocationDOMapper.getByPrimarySelective(id);
    }
}
