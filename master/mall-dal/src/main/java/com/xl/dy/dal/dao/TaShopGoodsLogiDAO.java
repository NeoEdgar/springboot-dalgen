package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaShopGoodsLogiDO;
import java.util.List;
import com.xl.dy.dal.mapper.TaShopGoodsLogiDOMapper;

/**
* The Table TA_SHOP_GOODS_LOGI.
* TA_SHOP_GOODS_LOGI
*/
@Repository
public class TaShopGoodsLogiDAO{

    @Autowired
    private TaShopGoodsLogiDOMapper taShopGoodsLogiDOMapper;

    /**
     * desc:插入表:TA_SHOP_GOODS_LOGI.<br/>
     * descSql =  INSERT INTO TA_SHOP_GOODS_LOGI( ID ,REMARK ,SHOP_ID ,GOODS_ID ,LOGI_MODE ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,SEND_ADDR_ID ,VALID_STATUS ,REFUND_ADDR_ID ,SHOP_FREIGHT_TEMPLET_ID ,SHOP_PICKUP_LOCATION_ID )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{goodsId,jdbcType=BIGINT} , #{logiMode,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{sendAddrId,jdbcType=BIGINT} , #{validStatus,jdbcType=INTEGER} , #{refundAddrId,jdbcType=BIGINT} , #{shopFreightTempletId,jdbcType=BIGINT} , #{shopPickupLocationId,jdbcType=BIGINT} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaShopGoodsLogiDO entity){
        return taShopGoodsLogiDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_SHOP_GOODS_LOGI.<br/>
     * descSql =  UPDATE TA_SHOP_GOODS_LOGI SET REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,LOGI_MODE = #{logiMode,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,SEND_ADDR_ID = #{sendAddrId,jdbcType=BIGINT} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,REFUND_ADDR_ID = #{refundAddrId,jdbcType=BIGINT} ,SHOP_FREIGHT_TEMPLET_ID = #{shopFreightTempletId,jdbcType=BIGINT} ,SHOP_PICKUP_LOCATION_ID = #{shopPickupLocationId,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaShopGoodsLogiDO entity){
        return taShopGoodsLogiDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_SHOP_GOODS_LOGI.<br/>
     * descSql =  DELETE FROM TA_SHOP_GOODS_LOGI WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taShopGoodsLogiDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_GOODS_LOGI.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS_LOGI WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopGoodsLogiDO
     */
    public TaShopGoodsLogiDO getByPrimary(Long id){
        return taShopGoodsLogiDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据商品ID和店铺Id获取数据:TA_SHOP_GOODS_LOGI.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS_LOGI VALID_STATUS = 1 AND GOODS_ID = #{goodsId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} 
     * @param shopId shopId
     * @param goodsId goodsId
     * @return List<TaShopGoodsLogiDO>
     */
    public List<TaShopGoodsLogiDO> getLogiBySelective(Long shopId,Long goodsId){
        return taShopGoodsLogiDOMapper.getLogiBySelective(shopId, goodsId);
    }
    /**
     * desc:根据主键删除数据:TA_SHOP_GOODS_LOGI.<br/>
     * descSql =  DELETE FROM TA_SHOP_GOODS_LOGI WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} 
     * @param shopId shopId
     * @param goodsId goodsId
     * @return Long
     */
    public Long deleteShopGoodsLogi(Long shopId,Long goodsId){
        return taShopGoodsLogiDOMapper.deleteShopGoodsLogi(shopId, goodsId);
    }
}
