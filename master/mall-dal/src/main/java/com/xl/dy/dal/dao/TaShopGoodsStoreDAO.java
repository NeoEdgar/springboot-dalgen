package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaShopGoodsStoreDO;
import java.math.BigDecimal;
import java.util.List;
import com.xl.dy.dal.mapper.TaShopGoodsStoreDOMapper;

/**
* The Table TA_SHOP_GOODS_STORE.
* TA_SHOP_GOODS_STORE
*/
@Repository
public class TaShopGoodsStoreDAO{

    @Autowired
    private TaShopGoodsStoreDOMapper taShopGoodsStoreDOMapper;

    /**
     * desc:插入表:TA_SHOP_GOODS_STORE.<br/>
     * descSql =  INSERT INTO TA_SHOP_GOODS_STORE( ID ,SKU_ID ,STORE ,REMARK ,SHOP_ID ,GOODS_ID ,SALE_TYPE ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,SHOP_GOODS_ID ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{skuId,jdbcType=BIGINT} , #{store,jdbcType=DECIMAL} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{goodsId,jdbcType=BIGINT} , #{saleType,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{shopGoodsId,jdbcType=BIGINT} , #{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaShopGoodsStoreDO entity){
        return taShopGoodsStoreDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_SHOP_GOODS_STORE.<br/>
     * descSql =  UPDATE TA_SHOP_GOODS_STORE SET SKU_ID = #{skuId,jdbcType=BIGINT} ,STORE = #{store,jdbcType=DECIMAL} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,SALE_TYPE = #{saleType,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,SHOP_GOODS_ID = #{shopGoodsId,jdbcType=BIGINT} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaShopGoodsStoreDO entity){
        return taShopGoodsStoreDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_SHOP_GOODS_STORE.<br/>
     * descSql =  DELETE FROM TA_SHOP_GOODS_STORE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taShopGoodsStoreDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_GOODS_STORE.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS_STORE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopGoodsStoreDO
     */
    public TaShopGoodsStoreDO getByPrimary(Long id){
        return taShopGoodsStoreDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据skuID获取所有类型的库存:TA_SHOP_GOODS_STORE.<br/>
     * descSql =  SELECT SUM(STORE) totalStore FROM TA_SHOP_GOODS_STORE WHERE SKU_ID = #{skuId,jdbcType=BIGINT}
     * @param skuId skuId
     * @return BigDecimal
     */
    public BigDecimal getTotalStoreBySkuId(Long skuId){
        return taShopGoodsStoreDOMapper.getTotalStoreBySkuId(skuId);
    }
    /**
     * desc:根据某个专业公司下某类商品某个sku的总库存:TA_SHOP_GOODS_STORE.<br/>
     * descSql =  SELECT SUM(TOTAL_STORE) totalStore FROM TA_SHOP_GOODS WHERE COMPANY_ID = #{companyId,jdbcType=BIGINT} AND SKU_ID = #{skuId,jdbcType=BIGINT} AND GOODS_ID = #{goodsId,jdbcType=BIGINT} GROUP BY COMPANY_ID,GOODS_ID,SKU_ID
     * @param skuId skuId
     * @param goodsId goodsId
     * @param companyId companyId
     * @return BigDecimal
     */
    public BigDecimal getTotalStoreForProductDetail(Long skuId,Long goodsId,Long companyId){
        return taShopGoodsStoreDOMapper.getTotalStoreForProductDetail(skuId, goodsId, companyId);
    }
    /**
     * desc:根据主键删除数据:TA_SHOP_GOODS_STORE.<br/>
     * descSql =  DELETE FROM TA_SHOP_GOODS_STORE WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} 
     * @param shopId shopId
     * @param goodsId goodsId
     * @return Long
     */
    public Long deleteShopGoodsStore(Long shopId,Long goodsId){
        return taShopGoodsStoreDOMapper.deleteShopGoodsStore(shopId, goodsId);
    }
    /**
     * desc:根据主键删除数据:TA_SHOP_GOODS_STORE.<br/>
     * descSql =  DELETE FROM TA_SHOP_GOODS_STORE WHERE SKU_ID = #{skuId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} 
     * @param skuId skuId
     * @param shopId shopId
     * @return Long
     */
    public Long deleteShopGoodsStoreBySkuIdAndShopId(Long skuId,Long shopId){
        return taShopGoodsStoreDOMapper.deleteShopGoodsStoreBySkuIdAndShopId(skuId, shopId);
    }
    /**
     * desc:更新表:TA_SHOP_GOODS_STORE.<br/>
     * descSql =  UPDATE TA_SHOP_GOODS_STORE STORE = #{store,jdbcType=DECIMAL}, REMARK = #{remark,jdbcType=VARCHAR}, SALE_TYPE = #{saleType,jdbcType=VARCHAR}, ALTER_EMPL = #{,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, TIMESTAMP = #{timestamp,jdbcType=TIMESTAMP}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, ID = #{id,jdbcType=BIGINT} AND SKU_ID = #{skuId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} 
     * @param entity entity
     * @return Long
     */
    public Long updateSelective(TaShopGoodsStoreDO entity){
        return taShopGoodsStoreDOMapper.updateSelective(entity);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_GOODS_STORE.<br/>
     * descSql =  SELECT SALE_TYPE,STORE FROM TA_SHOP_GOODS_STORE WHERE SKU_ID = #{skuId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT}
     * @param skuId skuId
     * @param shopId shopId
     * @return List<TaShopGoodsStoreDO>
     */
    public List<TaShopGoodsStoreDO> getBySkuIdAndShopId(Long skuId,Long shopId){
        return taShopGoodsStoreDOMapper.getBySkuIdAndShopId(skuId, shopId);
    }
}
