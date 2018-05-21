package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaCompanyGoodsPropDO;
import com.xl.dy.dal.paging.QueryClaimGoodsListPage;
import java.util.List;
import java.util.Map;
import com.xl.dy.dal.paging.QueryGoodsOfShopLevelListPage;
import com.xl.dy.dal.resultmap.GoodsInfoOfShopLevel;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_COMPANY_GOODS_PROP.
 * TA_COMPANY_GOODS_PROP
 */
public interface TaCompanyGoodsPropDOMapper{

    /**
     * desc:插入表:TA_COMPANY_GOODS_PROP.<br/>
     * descSql =  INSERT INTO TA_COMPANY_GOODS_PROP( ID ,REMARK ,GOODS_ID ,ALTER_EMPL ,ALTER_TIME ,COMPANY_ID ,IS_CLAIMED ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,COMPANY_NAME ,VALID_STATUS ,IS_VALID_GOODS ,UNSHELVE_TIME ,VALID_END_DATE ,IS_FOREVER_VALID ,VALID_START_DATE ,IS_ANYTIME_REFUND ,COM_GOODS_SALE_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{goodsId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{companyId,jdbcType=BIGINT} , #{isClaimed,jdbcType=INTEGER} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{companyName,jdbcType=VARCHAR} , #{validStatus,jdbcType=INTEGER} , #{isValidGoods,jdbcType=INTEGER} , #{unshelveTime,jdbcType=TIMESTAMP} , #{validEndDate,jdbcType=TIMESTAMP} , #{isForeverValid,jdbcType=INTEGER} , #{validStartDate,jdbcType=TIMESTAMP} , #{isAnytimeRefund,jdbcType=INTEGER} , #{comGoodsSaleStatus,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaCompanyGoodsPropDO entity);
    /**
     * desc:更新表:TA_COMPANY_GOODS_PROP.<br/>
     * descSql =  UPDATE TA_COMPANY_GOODS_PROP SET REMARK = #{remark,jdbcType=VARCHAR} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,COMPANY_ID = #{companyId,jdbcType=BIGINT} ,IS_CLAIMED = #{isClaimed,jdbcType=INTEGER} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,COMPANY_NAME = #{companyName,jdbcType=VARCHAR} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,IS_VALID_GOODS = #{isValidGoods,jdbcType=INTEGER} ,UNSHELVE_TIME = #{unshelveTime,jdbcType=TIMESTAMP} ,VALID_END_DATE = #{validEndDate,jdbcType=TIMESTAMP} ,IS_FOREVER_VALID = #{isForeverValid,jdbcType=INTEGER} ,VALID_START_DATE = #{validStartDate,jdbcType=TIMESTAMP} ,IS_ANYTIME_REFUND = #{isAnytimeRefund,jdbcType=INTEGER} ,COM_GOODS_SALE_STATUS = #{comGoodsSaleStatus,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaCompanyGoodsPropDO entity);
    /**
     * desc:根据主键删除数据:TA_COMPANY_GOODS_PROP.<br/>
     * descSql =  DELETE FROM TA_COMPANY_GOODS_PROP WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_COMPANY_GOODS_PROP.<br/>
     * descSql =  SELECT * FROM TA_COMPANY_GOODS_PROP WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaCompanyGoodsPropDO
     */
    TaCompanyGoodsPropDO getByPrimary(Long id);
    /**
     * desc:根据主键删除数据:TA_COMPANY_GOODS_PROP.<br/>
     * descSql =  DELETE FROM TA_COMPANY_GOODS_PROP WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param goodsId goodsId
     * @return Long
     */
    Long deleteByGoodsId(Long goodsId);
    /**
     * desc:更新表:TA_COMPANY_GOODS_PROP.<br/>
     * descSql =  UPDATE TA_COMPANY_GOODS_PROP REMARK = #{remark,jdbcType=VARCHAR}, GOODS_ID = #{goodsId,jdbcType=BIGINT}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, COMPANY_ID = #{companyId,jdbcType=BIGINT}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, IS_VALID_GOODS = #{isValidGoods,jdbcType=INTEGER}, VALID_END_DATE = #{validEndDate,jdbcType=TIMESTAMP}, IS_FOREVER_VALID = #{isForeverValid,jdbcType=INTEGER}, IS_CLAIMED = #{isClaimed,jdbcType=INTEGER}, VALID_START_DATE = #{validStartDate,jdbcType=TIMESTAMP}, IS_ANYTIME_REFUND = #{isAnytimeRefund,jdbcType=INTEGER}, COM_GOODS_SALE_STATUS = #{comGoodsSaleStatus,jdbcType=VARCHAR}, UNSHELVE_TIME = #{unshelveTime,jdbcType=TIMESTAMP}, VALID_STATUS = 1 AND ID = #{id,jdbcType=BIGINT} AND GOODS_ID = #{goodsId,jdbcType=BIGINT} AND COMPANY_ID = #{companyId,jdbcType=BIGINT} 
     * @param entity entity
     * @return Long
     */
    Long updateSelective(TaCompanyGoodsPropDO entity);
    /**
     * desc:根据主键获取数据:TA_COMPANY_GOODS_PROP.<br/>
     * descSql =  SELECT * FROM TA_COMPANY_GOODS_PROP WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param goodsId goodsId
     * @return TaCompanyGoodsPropDO
     */
    TaCompanyGoodsPropDO getCompanyGoodsPropByGoodsId(Long goodsId);
    /**
     * desc:根据主键获取数据:TA_COMPANY_GOODS_PROP.<br/>
     * descSql =  SELECT COUNT(*) FROM TA_COMPANY_GOODS_PROP WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param goodsId goodsId
     * @return int
     */
    int getCompanyGoodsPropCountByGoodsId(Long goodsId);
    /**
     * desc:获取待认领的商品列表:TA_COMPANY_GOODS_PROP.<br/>
     * descSql =  SELECT CGP.COMPANY_ID companyId,CGP.GOODS_ID goodsId,CGP.COM_GOODS_SALE_STATUS saleStatus,G.GOODS_NAME goodsName, G.GOODS_TYPE goodsType,G.MG_CATEGORY_ID category,GP.PHOTO_URL photoUrl,GP.IS_MAST_PHOTO isMastPhoto FROM TA_COMPANY_GOODS_PROP CGP LEFT JOIN TA_GOODS G ON CGP.GOODS_ID = G.ID LEFT JOIN TA_GOODS_PHOTO GP ON G.ID = GP.GOODS_ID WHERE CGP.COMPANY_ID = #{companyId,jdbcType=BIGINT} AND CGP.COM_GOODS_SALE_STATUS = #{comGoodsSaleStatus,jdbcType=VARCHAR} AND G.MG_CATEGORY_ID = #{category,jdbcType=BIGINT} AND GP.IS_MAST_PHOTO = 1 AND CGP.VALID_STATUS = 1
     * @param queryClaimGoodsList queryClaimGoodsList
     * @return int
     */
    int getClaimGoodsListCount(QueryClaimGoodsListPage queryClaimGoodsList);
    /**
     * desc:获取待认领的商品列表:TA_COMPANY_GOODS_PROP.<br/>
     * descSql =  SELECT CGP.COMPANY_ID companyId,CGP.GOODS_ID goodsId,CGP.COM_GOODS_SALE_STATUS saleStatus,G.GOODS_NAME goodsName, G.GOODS_TYPE goodsType,G.MG_CATEGORY_ID category,GP.PHOTO_URL photoUrl,GP.IS_MAST_PHOTO isMastPhoto FROM TA_COMPANY_GOODS_PROP CGP LEFT JOIN TA_GOODS G ON CGP.GOODS_ID = G.ID LEFT JOIN TA_GOODS_PHOTO GP ON G.ID = GP.GOODS_ID WHERE CGP.COMPANY_ID = #{companyId,jdbcType=BIGINT} AND CGP.COM_GOODS_SALE_STATUS = #{comGoodsSaleStatus,jdbcType=VARCHAR} AND G.MG_CATEGORY_ID = #{category,jdbcType=BIGINT} AND GP.IS_MAST_PHOTO = 1 AND CGP.VALID_STATUS = 1
     * @param queryClaimGoodsList queryClaimGoodsList
     * @return List<Map>
     */
    List<Map> getClaimGoodsListResult(QueryClaimGoodsListPage queryClaimGoodsList);
    /**
     * desc:getGoodsOfShopLevelCount.<br/>
     * descSql =  SELECT shopName,companyName,mallName,goodsId,shopId,companyId,mallId ,claimTime,unshelveReason,saleStatus,goodsName ,sales,totalStore FROM ( SELECT T.shopName,T.mallName,T.shopId,T.mallId,T.companyName,T.companyId,T.goodsId ,SGP.CLAIM_TIME claimTime,SGP.UNSHELVE_REASON unshelveReason,SGP.SHOP_GOODS_SALE_STATUS saleStatus,SGP.SHOP_GOODS_NAME goodsName ,H.sales,H.totalStore FROM TA_SHOP_GOODS_PROP SGP LEFT JOIN (SELECT SHOP_NAME shopName,COMPANY_NAME companyName,MALL_NAME mallName,GOODS_ID goodsId,SHOP_ID shopId ,COMPANY_ID companyId,MALL_ID mallId FROM(SELECT DISTINCT GOODS_ID,SHOP_ID,COMPANY_ID,MALL_ID,SHOP_NAME,COMPANY_NAME,MALL_NAME FROM ta_shop_goods )X )T ON SGP.GOODS_ID = T.goodsId LEFT JOIN (SELECT SHOP_ID shopId,GOODS_ID goodsId,SUM(SALES) sales,SUM(TOTAL_STORE) totalStore from ta_shop_goods GROUP BY SHOP_ID ,GOODS_ID) H ON (T.shopId = H.shopId AND T.goodsId = H.goodsId ) )F AND F.goodsName like #{searchStr,jdbcType=VARCHAR} 
     * @param queryGoodsOfShopLevelList queryGoodsOfShopLevelList
     * @return int
     */
    int getGoodsOfShopLevelCount(QueryGoodsOfShopLevelListPage queryGoodsOfShopLevelList);
    /**
     * desc:getGoodsOfShopLevelResult.<br/>
     * descSql =  SELECT shopName,companyName,mallName,goodsId,shopId,companyId,mallId ,claimTime,unshelveReason,saleStatus,goodsName ,sales,totalStore FROM ( SELECT T.shopName,T.mallName,T.shopId,T.mallId,T.companyName,T.companyId,T.goodsId ,SGP.CLAIM_TIME claimTime,SGP.UNSHELVE_REASON unshelveReason,SGP.SHOP_GOODS_SALE_STATUS saleStatus,SGP.SHOP_GOODS_NAME goodsName ,H.sales,H.totalStore FROM TA_SHOP_GOODS_PROP SGP LEFT JOIN (SELECT SHOP_NAME shopName,COMPANY_NAME companyName,MALL_NAME mallName,GOODS_ID goodsId,SHOP_ID shopId ,COMPANY_ID companyId,MALL_ID mallId FROM(SELECT DISTINCT GOODS_ID,SHOP_ID,COMPANY_ID,MALL_ID,SHOP_NAME,COMPANY_NAME,MALL_NAME FROM ta_shop_goods )X )T ON SGP.GOODS_ID = T.goodsId LEFT JOIN (SELECT SHOP_ID shopId,GOODS_ID goodsId,SUM(SALES) sales,SUM(TOTAL_STORE) totalStore from ta_shop_goods GROUP BY SHOP_ID ,GOODS_ID) H ON (T.shopId = H.shopId AND T.goodsId = H.goodsId ) )F AND F.goodsName like #{searchStr,jdbcType=VARCHAR} 
     * @param queryGoodsOfShopLevelList queryGoodsOfShopLevelList
     * @return List<GoodsInfoOfShopLevel>
     */
    List<GoodsInfoOfShopLevel> getGoodsOfShopLevelResult(QueryGoodsOfShopLevelListPage queryGoodsOfShopLevelList);
}
