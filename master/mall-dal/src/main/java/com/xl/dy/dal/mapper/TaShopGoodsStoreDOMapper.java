package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaShopGoodsStoreDO;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_SHOP_GOODS_STORE.
 * TA_SHOP_GOODS_STORE
 */
public interface TaShopGoodsStoreDOMapper{

    /**
     * desc:插入表:TA_SHOP_GOODS_STORE.<br/>
     * descSql =  INSERT INTO TA_SHOP_GOODS_STORE( ID ,SKU_ID ,STORE ,REMARK ,SHOP_ID ,GOODS_ID ,SALE_TYPE ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,SHOP_GOODS_ID ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{skuId,jdbcType=BIGINT} , #{store,jdbcType=DECIMAL} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{goodsId,jdbcType=BIGINT} , #{saleType,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{shopGoodsId,jdbcType=BIGINT} , #{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaShopGoodsStoreDO entity);
    /**
     * desc:更新表:TA_SHOP_GOODS_STORE.<br/>
     * descSql =  UPDATE TA_SHOP_GOODS_STORE SET SKU_ID = #{skuId,jdbcType=BIGINT} ,STORE = #{store,jdbcType=DECIMAL} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,SALE_TYPE = #{saleType,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,SHOP_GOODS_ID = #{shopGoodsId,jdbcType=BIGINT} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaShopGoodsStoreDO entity);
    /**
     * desc:根据主键删除数据:TA_SHOP_GOODS_STORE.<br/>
     * descSql =  DELETE FROM TA_SHOP_GOODS_STORE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_SHOP_GOODS_STORE.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS_STORE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopGoodsStoreDO
     */
    TaShopGoodsStoreDO getByPrimary(Long id);
    /**
     * desc:根据skuID获取所有类型的库存:TA_SHOP_GOODS_STORE.<br/>
     * descSql =  SELECT SUM(STORE) totalStore FROM TA_SHOP_GOODS_STORE WHERE SKU_ID = #{skuId,jdbcType=BIGINT}
     * @param skuId skuId
     * @return BigDecimal
     */
    BigDecimal getTotalStoreBySkuId(Long skuId);
    /**
     * desc:根据某个专业公司下某类商品某个sku的总库存:TA_SHOP_GOODS_STORE.<br/>
     * descSql =  SELECT SUM(TOTAL_STORE) totalStore FROM TA_SHOP_GOODS WHERE COMPANY_ID = #{companyId,jdbcType=BIGINT} AND SKU_ID = #{skuId,jdbcType=BIGINT} AND GOODS_ID = #{goodsId,jdbcType=BIGINT} GROUP BY COMPANY_ID,GOODS_ID,SKU_ID
     * @param skuId skuId
     * @param goodsId goodsId
     * @param companyId companyId
     * @return BigDecimal
     */
    BigDecimal getTotalStoreForProductDetail(@Param("skuId")Long skuId,@Param("goodsId")Long goodsId,@Param("companyId")Long companyId);
    /**
     * desc:根据主键删除数据:TA_SHOP_GOODS_STORE.<br/>
     * descSql =  DELETE FROM TA_SHOP_GOODS_STORE WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} 
     * @param shopId shopId
     * @param goodsId goodsId
     * @return Long
     */
    Long deleteShopGoodsStore(@Param("shopId")Long shopId,@Param("goodsId")Long goodsId);
    /**
     * desc:根据主键删除数据:TA_SHOP_GOODS_STORE.<br/>
     * descSql =  DELETE FROM TA_SHOP_GOODS_STORE WHERE SKU_ID = #{skuId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} 
     * @param skuId skuId
     * @param shopId shopId
     * @return Long
     */
    Long deleteShopGoodsStoreBySkuIdAndShopId(@Param("skuId")Long skuId,@Param("shopId")Long shopId);
    /**
     * desc:更新表:TA_SHOP_GOODS_STORE.<br/>
     * descSql =  UPDATE TA_SHOP_GOODS_STORE STORE = #{store,jdbcType=DECIMAL}, REMARK = #{remark,jdbcType=VARCHAR}, SALE_TYPE = #{saleType,jdbcType=VARCHAR}, ALTER_EMPL = #{,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, TIMESTAMP = #{timestamp,jdbcType=TIMESTAMP}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, ID = #{id,jdbcType=BIGINT} AND SKU_ID = #{skuId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} 
     * @param entity entity
     * @return Long
     */
    Long updateSelective(TaShopGoodsStoreDO entity);
    /**
     * desc:根据主键获取数据:TA_SHOP_GOODS_STORE.<br/>
     * descSql =  SELECT SALE_TYPE,STORE FROM TA_SHOP_GOODS_STORE WHERE SKU_ID = #{skuId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT}
     * @param skuId skuId
     * @param shopId shopId
     * @return List<TaShopGoodsStoreDO>
     */
    List<TaShopGoodsStoreDO> getBySkuIdAndShopId(@Param("skuId")Long skuId,@Param("shopId")Long shopId);
}
