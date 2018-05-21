package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaShopGoodsPropDO;
import com.xl.dy.dal.paging.QueryShopGoodListPage;
import java.util.List;
import com.xl.dy.dal.paging.QueryGoodsListPage;
import com.xl.dy.dal.resultmap.GoodsInfoOfPlatformAndCompany;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_SHOP_GOODS_PROP.
 * TA_SHOP_GOODS_PROP
 */
public interface TaShopGoodsPropDOMapper{

    /**
     * desc:插入表:TA_SHOP_GOODS_PROP.<br/>
     * descSql =  INSERT INTO TA_SHOP_GOODS_PROP( ID ,IS_ERP ,REMARK ,SHOP_ID ,ERP_TYPE ,GOODS_ID ,ERP_ACC_ID ,ALTER_EMPL ,ALTER_TIME ,CLAIM_TIME ,IS_OWN_LOGI ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,TOTAL_SALES ,TOTAL_STORE ,ERP_SALE_DEPT ,GOODS_WEIGHT ,VALID_STATUS ,IS_FAMVIP_ONLY ,IS_VALID_GOODS ,SHOP_PHOTO_URL ,UNSHELVE_TIME ,VALID_END_DATE ,SHOP_GOODS_CODE ,SHOP_GOODS_NAME ,IS_FOREVER_VALID ,IS_SHIPPING_FREE ,UNSHELVE_REASON ,VALID_START_DATE ,IS_ANYTIME_REFUND ,PACK_GOODS_WEIGHT ,SHOP_REFUND_ADDR_ID ,UNSHELVE_OPERATOR ,SHOP_GOODS_SALE_STATUS ,SHOP_GOODS_BUSINESS_MODEL )VALUES( #{id,jdbcType=BIGINT} , #{isErp,jdbcType=INTEGER} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{erpType,jdbcType=VARCHAR} , #{goodsId,jdbcType=BIGINT} , #{erpAccId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{claimTime,jdbcType=TIMESTAMP} , #{isOwnLogi,jdbcType=INTEGER} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{totalSales,jdbcType=BIGINT} , #{totalStore,jdbcType=DECIMAL} , #{erpSaleDept,jdbcType=VARCHAR} , #{goodsWeight,jdbcType=DECIMAL} , #{validStatus,jdbcType=INTEGER} , #{isFamvipOnly,jdbcType=INTEGER} , #{isValidGoods,jdbcType=INTEGER} , #{shopPhotoUrl,jdbcType=VARCHAR} , #{unshelveTime,jdbcType=TIMESTAMP} , #{validEndDate,jdbcType=TIMESTAMP} , #{shopGoodsCode,jdbcType=VARCHAR} , #{shopGoodsName,jdbcType=VARCHAR} , #{isForeverValid,jdbcType=INTEGER} , #{isShippingFree,jdbcType=INTEGER} , #{unshelveReason,jdbcType=VARCHAR} , #{validStartDate,jdbcType=TIMESTAMP} , #{isAnytimeRefund,jdbcType=INTEGER} , #{packGoodsWeight,jdbcType=DECIMAL} , #{shopRefundAddrId,jdbcType=BIGINT} , #{unshelveOperator,jdbcType=VARCHAR} , #{shopGoodsSaleStatus,jdbcType=VARCHAR} , #{shopGoodsBusinessModel,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaShopGoodsPropDO entity);
    /**
     * desc:更新表:TA_SHOP_GOODS_PROP.<br/>
     * descSql =  UPDATE TA_SHOP_GOODS_PROP SET IS_ERP = #{isErp,jdbcType=INTEGER} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,ERP_TYPE = #{erpType,jdbcType=VARCHAR} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,ERP_ACC_ID = #{erpAccId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,CLAIM_TIME = #{claimTime,jdbcType=TIMESTAMP} ,IS_OWN_LOGI = #{isOwnLogi,jdbcType=INTEGER} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,TOTAL_SALES = #{totalSales,jdbcType=BIGINT} ,TOTAL_STORE = #{totalStore,jdbcType=DECIMAL} ,ERP_SALE_DEPT = #{erpSaleDept,jdbcType=VARCHAR} ,GOODS_WEIGHT = #{goodsWeight,jdbcType=DECIMAL} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,IS_FAMVIP_ONLY = #{isFamvipOnly,jdbcType=INTEGER} ,IS_VALID_GOODS = #{isValidGoods,jdbcType=INTEGER} ,SHOP_PHOTO_URL = #{shopPhotoUrl,jdbcType=VARCHAR} ,UNSHELVE_TIME = #{unshelveTime,jdbcType=TIMESTAMP} ,VALID_END_DATE = #{validEndDate,jdbcType=TIMESTAMP} ,SHOP_GOODS_CODE = #{shopGoodsCode,jdbcType=VARCHAR} ,SHOP_GOODS_NAME = #{shopGoodsName,jdbcType=VARCHAR} ,IS_FOREVER_VALID = #{isForeverValid,jdbcType=INTEGER} ,IS_SHIPPING_FREE = #{isShippingFree,jdbcType=INTEGER} ,UNSHELVE_REASON = #{unshelveReason,jdbcType=VARCHAR} ,VALID_START_DATE = #{validStartDate,jdbcType=TIMESTAMP} ,IS_ANYTIME_REFUND = #{isAnytimeRefund,jdbcType=INTEGER} ,PACK_GOODS_WEIGHT = #{packGoodsWeight,jdbcType=DECIMAL} ,SHOP_REFUND_ADDR_ID = #{shopRefundAddrId,jdbcType=BIGINT} ,UNSHELVE_OPERATOR = #{unshelveOperator,jdbcType=VARCHAR} ,SHOP_GOODS_SALE_STATUS = #{shopGoodsSaleStatus,jdbcType=VARCHAR} ,SHOP_GOODS_BUSINESS_MODEL = #{shopGoodsBusinessModel,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaShopGoodsPropDO entity);
    /**
     * desc:根据主键删除数据:TA_SHOP_GOODS_PROP.<br/>
     * descSql =  DELETE FROM TA_SHOP_GOODS_PROP WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_SHOP_GOODS_PROP.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS_PROP WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopGoodsPropDO
     */
    TaShopGoodsPropDO getByPrimary(Long id);
    /**
     * desc:更新表:TA_SHOP_GOODS_PROP.<br/>
     * descSql =  UPDATE TA_SHOP_GOODS_PROP REMARK = #{remark,jdbcType=VARCHAR}, CLAIM_TIME = #{claimTime,jdbcType=TIMESTAMP}, SHOP_ID = #{shopId,jdbcType=BIGINT}, GOODS_ID = #{goodsId,jdbcType=BIGINT}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, GOODS_WEIGHT = #{goodsWeight,jdbcType=DECIMAL}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, IS_FAMVIP_ONLY = #{isFamvipOnly,jdbcType=INTEGER}, SHOP_PHOTO_URL = #{shopPhotoUrl,jdbcType=VARCHAR}, IS_VALID_GOODS = #{isValidGoods,jdbcType=INTEGER}, VALID_END_DATE = #{validEndDate,jdbcType=TIMESTAMP}, SHOP_GOODS_NAME = #{shopGoodsName,jdbcType=VARCHAR}, IS_FOREVER_VALID = #{isForeverValid,jdbcType=INTEGER}, VALID_START_DATE = #{validStartDate,jdbcType=TIMESTAMP}, IS_ANYTIME_REFUND = #{isAnytimeRefund,jdbcType=INTEGER}, PACK_GOODS_WEIGHT = #{packGoodsWeight,jdbcType=DECIMAL}, UNSHELVE_OPERATOR = #{unshelveOperator,jdbcType=VARCHAR}, UNSHELVE_TIME = #{unshelveTime,jdbcType=TIMESTAMP}, UNSHELVE_REASON = #{unshelveReason,jdbcType=VARCHAR}, SHOP_GOODS_SALE_STATUS = #{shopGoodsSaleStatus,jdbcType=VARCHAR}, IS_OWN_LOGI = #{isOwnLogi,jdbcType=INTEGER}, IS_SHIPPING_FREE = #{isShippingFree,jdbcType=INTEGER}, SHOP_GOODS_BUSINESS_MODEL = #{shopGoodsBusinessModel,jdbcType=VARCHAR}, ERP_TYPE = #{erpType,jdbcType=VARCHAR}, IS_ERP = #{isErp,jdbcType=INTEGER}, ERP_ACC_ID = #{erpAccId,jdbcType=BIGINT}, ERP_SALE_DEPT = #{erpSaleDept,jdbcType=VARCHAR}, SHOP_REFUND_ADDR_ID = #{shopRefundAddrId,jdbcType=BIGINT}, TOTAL_SALES = #{totalSales,jdbcType=BIGINT}, TOTAL_STORE = #{totalStore,jdbcType=DECIMAL}, VALID_STATUS = 1 AND ID = #{id,jdbcType=BIGINT} AND GOODS_ID = #{goodsId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} 
     * @param entity entity
     * @return Long
     */
    Long updateSelective(TaShopGoodsPropDO entity);
    /**
     * desc:根据主键获取有效数据:TA_SHOP_GOODS_PROP.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS_PROP VALID_STATUS = 1 AND ID = #{id,jdbcType=BIGINT} AND GOODS_ID = #{goodsId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} 
     * @param id id
     * @param shopId shopId
     * @param goodsId goodsId
     * @return TaShopGoodsPropDO
     */
    TaShopGoodsPropDO getByPrimarySelective(@Param("id")Long id,@Param("shopId")Long shopId,@Param("goodsId")Long goodsId);
    /**
     * desc:根据主键获取有效数据:TA_SHOP_GOODS_PROP.<br/>
     * descSql =  SELECT COUNT(*) FROM TA_SHOP_GOODS_PROP VALID_STATUS = 1 AND ID = #{id,jdbcType=BIGINT} AND GOODS_ID = #{goodsId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} 
     * @param id id
     * @param shopId shopId
     * @param goodsId goodsId
     * @return Integer
     */
    Integer getCountByPrimarySelective(@Param("id")Long id,@Param("shopId")Long shopId,@Param("goodsId")Long goodsId);
    /**
     * desc:根据主键获取数据:TA_SHOP_GOODS_PROP.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS_PROP WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param queryShopGoodList queryShopGoodList
     * @return int
     */
    int getShopGoodsPropByGoodsIdCount(QueryShopGoodListPage queryShopGoodList);
    /**
     * desc:根据主键获取数据:TA_SHOP_GOODS_PROP.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS_PROP WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param queryShopGoodList queryShopGoodList
     * @return List<TaShopGoodsPropDO>
     */
    List<TaShopGoodsPropDO> getShopGoodsPropByGoodsIdResult(QueryShopGoodListPage queryShopGoodList);
    /**
     * desc:根据主键删除数据:TA_SHOP_GOODS_PROP.<br/>
     * descSql =  DELETE FROM TA_SHOP_GOODS_PROP WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} 
     * @param shopId shopId
     * @param goodsId goodsId
     * @return Long
     */
    Long deleteShopGoodsProp(@Param("shopId")Long shopId,@Param("goodsId")Long goodsId);
    /**
     * desc:根据主键删除数据:TA_SHOP_GOODS_PROP.<br/>
     * descSql =  DELETE FROM TA_SHOP_GOODS_PROP WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param shopId shopId
     * @param goodsId goodsId
     * @return Long
     */
    Long deleteShopGoodsPropByShopIdAndGoodsId(@Param("shopId")Long shopId,@Param("goodsId")Long goodsId);
    /**
     * desc:根据主键获取数据:TA_SHOP_GOODS_PROP.<br/>
     * descSql =  SELECT shopId,sales FROM( SELECT SHOP_ID shopId,SUM(SALES) sales FROM ta_shop_goods WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} GROUP BY SHOP_ID) F WHERE F.shopId = #{shopId,jdbcType=BIGINT}
     * @param shopId shopId
     * @param goodsId goodsId
     * @return Long
     */
    Long getSalesByGoodsIdAndShopId(@Param("shopId")Long shopId,@Param("goodsId")Long goodsId);
    /**
     * desc:删除店铺商品:TA_SHOP_GOODS.<br/>
     * descSql =  DELETE FROM TA_SHOP_GOODS WHERE SKU_ID = #{skuId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT}
     * @param skuId skuId
     * @param shopId shopId
     * @return Long
     */
    Long deleteShopGoodsBySkuIdAndShopId(@Param("skuId")Long skuId,@Param("shopId")Long shopId);
    /**
     * desc:getGoodsPageCount.<br/>
     * descSql =  SELECT companyName,goodsId,companyId ,goodsCode,goodsName,mgFrId,regCompanyName,regShopName,shopId ,alterTime,createEmpl,createTime ,mallName,entityMallName ,sales,totalStore FROM ( SELECT CGP.GOODS_ID goodsId,CGP.COMPANY_ID companyId,CGP.COMPANY_NAME companyName ,G.GOODS_CODE goodsCode,G.GOODS_NAME goodsName,G.MG_FR_ID mgFrId ,G.REG_COMPANY_NAME regCompanyName,G.REG_SHOP_NAME regShopName,G.REG_SHOP_ID shopId,G.CREATE_TIME createTime ,G.ALTER_TIME alterTime,G.REG_EMPL_NAME createEmpl ,S.MALL_NAME mallName,S.ENTITY_MALL_NAME entityMallName ,T.sales,T.totalStore FROM TA_COMPANY_GOODS_PROP CGP LEFT JOIN TA_GOODS G ON G.ID = CGP.GOODS_ID LEFT JOIN TA_SHOP S ON G.REG_SHOP_ID = S.ID LEFT JOIN (SELECT COMPANY_ID companyId,GOODS_ID goodsId,SUM(SALES) sales,SUM(TOTAL_STORE) totalStore from ta_shop_goods GROUP BY COMPANY_ID ,GOODS_ID) T ON (CGP.COMPANY_ID = T.companyId AND CGP.GOODS_ID = T.goodsId) )F AND CONCAT(IFNULL(F.goodsCode,''),IFNULL(F.goodsName,'')) like #{searchStr,jdbcType=VARCHAR} 
     * @param queryGoodsList queryGoodsList
     * @return int
     */
    int getGoodsPageCount(QueryGoodsListPage queryGoodsList);
    /**
     * desc:getGoodsPageResult.<br/>
     * descSql =  SELECT companyName,goodsId,companyId ,goodsCode,goodsName,mgFrId,regCompanyName,regShopName,shopId ,alterTime,createEmpl,createTime ,mallName,entityMallName ,sales,totalStore FROM ( SELECT CGP.GOODS_ID goodsId,CGP.COMPANY_ID companyId,CGP.COMPANY_NAME companyName ,G.GOODS_CODE goodsCode,G.GOODS_NAME goodsName,G.MG_FR_ID mgFrId ,G.REG_COMPANY_NAME regCompanyName,G.REG_SHOP_NAME regShopName,G.REG_SHOP_ID shopId,G.CREATE_TIME createTime ,G.ALTER_TIME alterTime,G.REG_EMPL_NAME createEmpl ,S.MALL_NAME mallName,S.ENTITY_MALL_NAME entityMallName ,T.sales,T.totalStore FROM TA_COMPANY_GOODS_PROP CGP LEFT JOIN TA_GOODS G ON G.ID = CGP.GOODS_ID LEFT JOIN TA_SHOP S ON G.REG_SHOP_ID = S.ID LEFT JOIN (SELECT COMPANY_ID companyId,GOODS_ID goodsId,SUM(SALES) sales,SUM(TOTAL_STORE) totalStore from ta_shop_goods GROUP BY COMPANY_ID ,GOODS_ID) T ON (CGP.COMPANY_ID = T.companyId AND CGP.GOODS_ID = T.goodsId) )F AND CONCAT(IFNULL(F.goodsCode,''),IFNULL(F.goodsName,'')) like #{searchStr,jdbcType=VARCHAR} 
     * @param queryGoodsList queryGoodsList
     * @return List<GoodsInfoOfPlatformAndCompany>
     */
    List<GoodsInfoOfPlatformAndCompany> getGoodsPageResult(QueryGoodsListPage queryGoodsList);
}
