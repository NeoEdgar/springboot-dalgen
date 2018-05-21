package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaShopGoodsPriceDO;
import java.util.List;
import com.xl.dy.dal.resultmap.PriceInfo;
import com.xl.dy.dal.resultmap.PriceRangeInfoOfShop;
import com.xl.dy.dal.mapper.TaShopGoodsPriceDOMapper;

/**
* The Table TA_SHOP_GOODS_PRICE.
* TA_SHOP_GOODS_PRICE
*/
@Repository
public class TaShopGoodsPriceDAO{

    @Autowired
    private TaShopGoodsPriceDOMapper taShopGoodsPriceDOMapper;

    /**
     * desc:???�表:TA_SHOP_GOODS_PRICE.<br/>
     * descSql =  INSERT INTO TA_SHOP_GOODS_PRICE( ID ,SKU_ID ,REMARK ,SHOP_ID ,GOODS_ID ,IS_COUPON ,SALE_TYPE ,ALTER_EMPL ,ALTER_TIME ,PRICE_TYPE ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,GOODS_PRICE ,SHOP_GOODS_ID ,VALID_STATUS ,IS_VIPLEV_UNIFY ,VIPLEV_PRICE_JSON ,MARKETING_ACTIVITIES )VALUES( #{id,jdbcType=BIGINT} , #{skuId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{goodsId,jdbcType=BIGINT} , #{isCoupon,jdbcType=INTEGER} , #{saleType,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{priceType,jdbcType=VARCHAR} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{goodsPrice,jdbcType=DECIMAL} , #{shopGoodsId,jdbcType=BIGINT} , #{validStatus,jdbcType=INTEGER} , #{isViplevUnify,jdbcType=INTEGER} , #{viplevPriceJson,jdbcType=VARCHAR} , #{marketingActivities,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaShopGoodsPriceDO entity){
        return taShopGoodsPriceDOMapper.insert(entity);
    }
    /**
     * desc:?��?�表:TA_SHOP_GOODS_PRICE.<br/>
     * descSql =  UPDATE TA_SHOP_GOODS_PRICE SET SKU_ID = #{skuId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,IS_COUPON = #{isCoupon,jdbcType=INTEGER} ,SALE_TYPE = #{saleType,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,PRICE_TYPE = #{priceType,jdbcType=VARCHAR} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,GOODS_PRICE = #{goodsPrice,jdbcType=DECIMAL} ,SHOP_GOODS_ID = #{shopGoodsId,jdbcType=BIGINT} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,IS_VIPLEV_UNIFY = #{isViplevUnify,jdbcType=INTEGER} ,VIPLEV_PRICE_JSON = #{viplevPriceJson,jdbcType=VARCHAR} ,MARKETING_ACTIVITIES = #{marketingActivities,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaShopGoodsPriceDO entity){
        return taShopGoodsPriceDOMapper.update(entity);
    }
    /**
     * desc:更新表:TA_SHOP_GOODS_PRICE.<br/>
     * descSql =  UPDATE TA_SHOP_GOODS_PRICE SKU_ID = #{skuId,jdbcType=BIGINT}, REMARK = #{remark,jdbcType=VARCHAR}, SHOP_ID = #{shopId,jdbcType=BIGINT}, GOODS_ID = #{goodsId,jdbcType=BIGINT}, SALE_TYPE = #{saleType,jdbcType=VARCHAR}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, PRICE_TYPE = #{priceType,jdbcType=VARCHAR}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, GOODS_PRICE = #{goodsPrice,jdbcType=DECIMAL}, SHOP_GOODS_ID = #{shopGoodsId,jdbcType=BIGINT}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, IS_VIPLEV_UNIFY = #{isViplevUnify,jdbcType=INTEGER}, VIPLEV_PRICE_JSON = #{viplevPriceJson,jdbcType=VARCHAR}, ID = #{id,jdbcType=BIGINT} AND SKU_ID = #{skuId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} 
     * @param entity entity
     * @return Long
     */
    public Long updateSelective(TaShopGoodsPriceDO entity){
        return taShopGoodsPriceDOMapper.updateSelective(entity);
    }
    /**
     * desc:根据主键删除数据:TA_SHOP_GOODS_PRICE.<br/>
     * descSql =  DELETE FROM TA_SHOP_GOODS_PRICE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taShopGoodsPriceDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_GOODS_PRICE.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS_PRICE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopGoodsPriceDO
     */
    public TaShopGoodsPriceDO getByPrimary(Long id){
        return taShopGoodsPriceDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据店铺商品信息ID获取价格列表:TA_SHOP_GOODS_PRICE.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS_PRICE WHERE SHOP_GOODS_ID = #{shopGoodsId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param shopGoodsId shopGoodsId
     * @return List<TaShopGoodsPriceDO>
     */
    public List<TaShopGoodsPriceDO> getShopGoodsPriceByShopGoodsId(Long shopGoodsId){
        return taShopGoodsPriceDOMapper.getShopGoodsPriceByShopGoodsId(shopGoodsId);
    }
    /**
     * desc:根据店铺SKUID获取价格:TA_SHOP_GOODS_PRICE.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS_PRICE WHERE SKU_ID = #{skuId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param skuId skuId
     * @param shopId shopId
     * @return List<TaShopGoodsPriceDO>
     */
    public List<TaShopGoodsPriceDO> getShopGoodsPriceBySkuId(Long skuId,Long shopId){
        return taShopGoodsPriceDOMapper.getShopGoodsPriceBySkuId(skuId, shopId);
    }
    /**
     * desc:根据主键删除数据:TA_SHOP_GOODS_PRICE.<br/>
     * descSql =  DELETE FROM TA_SHOP_GOODS_PRICE WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} 
     * @param shopId shopId
     * @param goodsId goodsId
     * @return Long
     */
    public Long deleteShopGoodsPrice(Long shopId,Long goodsId){
        return taShopGoodsPriceDOMapper.deleteShopGoodsPrice(shopId, goodsId);
    }
    /**
     * desc:根据主键删除数据:TA_SHOP_GOODS_PRICE.<br/>
     * descSql =  DELETE FROM TA_SHOP_GOODS_PRICE WHERE SKU_ID = #{skuId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} 
     * @param skuId skuId
     * @param shopId shopId
     * @return Long
     */
    public Long deleteShopGoodsPriceBySkuIdAndShopId(Long skuId,Long shopId){
        return taShopGoodsPriceDOMapper.deleteShopGoodsPriceBySkuIdAndShopId(skuId, shopId);
    }
    /**
     * desc:根据商场ID,店铺ID和产品ID获取某个商场某个店铺某类产品的的价格区间.<br/>
     * descSql =  SELECT MIN(GOODS_PRICE) minPrice,MAX(GOODS_PRICE) maxPrice FROM TA_SHOP_GOODS_PRICE WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param shopId shopId
     * @param goodsId goodsId
     * @return PriceInfo
     */
    public PriceInfo getPriceByShopGoodsId(Long shopId,Long goodsId){
        return taShopGoodsPriceDOMapper.getPriceByShopGoodsId(shopId, goodsId);
    }
    /**
     * desc:根据shopsAndGoods:TA_SHOP_GOODS_PRICE.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS_PRICE WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param shopId shopId
     * @param goodsId goodsId
     * @return List<TaShopGoodsPriceDO>
     */
    public List<TaShopGoodsPriceDO> getByShopGoodsId(Long shopId,Long goodsId){
        return taShopGoodsPriceDOMapper.getByShopGoodsId(shopId, goodsId);
    }
    /**
     * desc:根据skuId和参加的活动获得数据:TA_SHOP_GOODS_PRICE.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS_PRICE WHERE SKU_ID = #{skuId,jdbcType=BIGINT} AND MARKETING_ACTIVITIES IS NOT NULL
     * @param skuId skuId
     * @return List<TaShopGoodsPriceDO>
     */
    public List<TaShopGoodsPriceDO> getActivityGoods(Long skuId){
        return taShopGoodsPriceDOMapper.getActivityGoods(skuId);
    }
    /**
     * desc:获得原价时商品信息:TA_SHOP_GOODS_PRICE.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS_PRICE WHERE SHOP_GOODS_ID = #{shopGoodsId,jdbcType=BIGINT} AND SALE_TYPE = "NORMAL" AND PRICE_TYPE = "VIPRICE"
     * @param shopGoodsId shopGoodsId
     * @return TaShopGoodsPriceDO
     */
    public TaShopGoodsPriceDO getNormalPriceMeg(Long shopGoodsId){
        return taShopGoodsPriceDOMapper.getNormalPriceMeg(shopGoodsId);
    }
    /**
     * desc:根据goodsId获取指导价范围:TA_COMPANY_GOODS.<br/>
     * descSql =  SELECT T.minPrice,T.maxPrice FROM(SELECT SHOP_ID shopId,GOODS_ID goodsId,MIN(GOODS_PRICE) minPrice,MAX(GOODS_PRICE) maxPrice FROM TA_SHOP_GOODS_PRICE GROUP BY SHOP_ID,GOODS_ID) T WHERE T.shopId = #{shopId,jdbcType=BIGINT} AND T.goodsId = #{goodsId,jdbcType=BIGINT}
     * @param shopId shopId
     * @param goodsId goodsId
     * @return PriceRangeInfoOfShop
     */
    public PriceRangeInfoOfShop getDirectPriceRangeByGoodsId(Long shopId,Long goodsId){
        return taShopGoodsPriceDOMapper.getDirectPriceRangeByGoodsId(shopId, goodsId);
    }
}
