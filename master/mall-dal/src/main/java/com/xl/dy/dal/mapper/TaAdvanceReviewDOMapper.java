package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaAdvanceReviewDO;
import java.lang.Long;
import com.xl.dy.dal.paging.QueryGoodsByAdvanceIdPage;
import java.util.List;
import java.util.Map;
import com.xl.dy.dal.paging.QueryExamineAdvanceGoodsPage;
import com.xl.dy.dal.paging.QueryShowAllowAdvanceListPage;
import com.xl.dy.dal.paging.QueryRegisteredAdvanceListPage;
import org.apache.ibatis.annotations.Param;

/**
 * ?��???�?对�??页�????,请�?��?�使?��?��???DAO�?
 * The Table TA_ADVANCE_REVIEW.
 * TA_ADVANCE_REVIEW
 */
public interface TaAdvanceReviewDOMapper{

    /**
     * desc:???�表:TA_ADVANCE_REVIEW.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_ADVANCE_REVIEW( ID ,INX ,SALES ,SKU_ID ,REASON ,REMARK ,SHOP_ID ,DEPOSIT ,DISCOUNT ,ADVANCE_ID ,ALTER_EMPL ,ALTER_TIME ,RETAINAGE ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,DEPOSIT_END_TIME ,ACTIVE_INVENTORY ,DEPOSIT_START_TIME ,RETAINAGE_END_TIME ,IS_RETAINAGE_CHGINV ,RETAINAGE_START_TIME ,ADVANCE_REVIEW_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{inx,jdbcType=INTEGER} , #{sales,jdbcType=DECIMAL} , #{skuId,jdbcType=BIGINT} , #{reason,jdbcType=VARCHAR} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{deposit,jdbcType=DECIMAL} , #{discount,jdbcType=DECIMAL} , #{advanceId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{retainage,jdbcType=DECIMAL} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{depositEndTime,jdbcType=TIMESTAMP} , #{activeInventory,jdbcType=DECIMAL} , #{depositStartTime,jdbcType=TIMESTAMP} , #{retainageEndTime,jdbcType=TIMESTAMP} , #{isRetainageChginv,jdbcType=INTEGER} , #{retainageStartTime,jdbcType=TIMESTAMP} , #{advanceReviewStatus,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaAdvanceReviewDO entity);
    /**
     * desc:?��?�表:TA_ADVANCE_REVIEW.<br/>
     * descSql =  UPDATE TA_ADVANCE_REVIEW SET INX = #{inx,jdbcType=INTEGER} ,SALES = #{sales,jdbcType=DECIMAL} ,SKU_ID = #{skuId,jdbcType=BIGINT} ,REASON = #{reason,jdbcType=VARCHAR} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,DEPOSIT = #{deposit,jdbcType=DECIMAL} ,DISCOUNT = #{discount,jdbcType=DECIMAL} ,ADVANCE_ID = #{advanceId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,RETAINAGE = #{retainage,jdbcType=DECIMAL} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,DEPOSIT_END_TIME = #{depositEndTime,jdbcType=TIMESTAMP} ,ACTIVE_INVENTORY = #{activeInventory,jdbcType=DECIMAL} ,DEPOSIT_START_TIME = #{depositStartTime,jdbcType=TIMESTAMP} ,RETAINAGE_END_TIME = #{retainageEndTime,jdbcType=TIMESTAMP} ,IS_RETAINAGE_CHGINV = #{isRetainageChginv,jdbcType=INTEGER} ,RETAINAGE_START_TIME = #{retainageStartTime,jdbcType=TIMESTAMP} ,ADVANCE_REVIEW_STATUS = #{advanceReviewStatus,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaAdvanceReviewDO entity);
    /**
     * desc:?��??主�?????��?��??:TA_ADVANCE_REVIEW.<br/>
     * descSql =  DELETE FROM TA_ADVANCE_REVIEW WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:?��??主�???��???��??:TA_ADVANCE_REVIEW.<br/>
     * descSql =  SELECT * FROM TA_ADVANCE_REVIEW WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaAdvanceReviewDO
     */
    TaAdvanceReviewDO getByPrimary(Long id);
    /**
     * desc:获取预售报名数:TA_ADVANCE_REVIEW.<br/>
     * descSql =  SELECT count(*) FROM TA_ADVANCE_REVIEW WHERE ADVANCE_ID = #{advanceId,jdbcType=BIGINT}
     * @param advanceId advanceId
     * @return Long
     */
    Long getCountByAdvence(Long advanceId);
    /**
     * desc:获取拼团报名商品:TA_ADVANCE_REVIEW.<br/>
     * descSql =  SELECT a.ID advanceReviewId, b.SHOP_NAME shopName, c.MALL_NAME mallName, d.COMPANY_NAME companyName, h.PHOTO_URL skuPhotoUrl, f.SKU_TITLE skutitle, a.INX inx, a.ACTIVE_INVENTORY activeInventory, a.SALES sales FROM ta_advance_review a LEFT JOIN ta_shop b ON b.ID = a.SHOP_ID LEFT JOIN ta_mall c ON c.ID = b.MALL_ID LEFT JOIN ta_company d ON d.ID = b.COMPANY_ID LEFT JOIN ta_sku f ON f.ID = a.SKU_ID LEFT JOIN ta_shop_goods_price g ON g.SKU_ID = a.SKU_ID LEFT JOIN ta_goods_photo h on h.SKU_ID = f.ID WHERE a.ADVANCE_ID = #{advanceId,jdbcType=BIGINT} AND ADVANCE_REVIEW_STATUS = "PASS" AND g.SALE_TYPE = "NORMAL" AND g.PRICE_TYPE = "VIPRICE" AND a.VALID_STATUS = 1 AND b.VALID_STATUS = 1 AND c.VALID_STATUS = 1 AND d.VALID_STATUS = 1 AND f.VALID_STATUS = 1 AND g.VALID_STATUS = 1 AND h.VALID_STATUS = 1 ORDER BY a.INX ASC
     * @param queryGoodsByAdvanceId queryGoodsByAdvanceId
     * @return int
     */
    int getGoodsByAdvanceIdCount(QueryGoodsByAdvanceIdPage queryGoodsByAdvanceId);
    /**
     * desc:获取拼团报名商品:TA_ADVANCE_REVIEW.<br/>
     * descSql =  SELECT a.ID advanceReviewId, b.SHOP_NAME shopName, c.MALL_NAME mallName, d.COMPANY_NAME companyName, h.PHOTO_URL skuPhotoUrl, f.SKU_TITLE skutitle, a.INX inx, a.ACTIVE_INVENTORY activeInventory, a.SALES sales FROM ta_advance_review a LEFT JOIN ta_shop b ON b.ID = a.SHOP_ID LEFT JOIN ta_mall c ON c.ID = b.MALL_ID LEFT JOIN ta_company d ON d.ID = b.COMPANY_ID LEFT JOIN ta_sku f ON f.ID = a.SKU_ID LEFT JOIN ta_shop_goods_price g ON g.SKU_ID = a.SKU_ID LEFT JOIN ta_goods_photo h on h.SKU_ID = f.ID WHERE a.ADVANCE_ID = #{advanceId,jdbcType=BIGINT} AND ADVANCE_REVIEW_STATUS = "PASS" AND g.SALE_TYPE = "NORMAL" AND g.PRICE_TYPE = "VIPRICE" AND a.VALID_STATUS = 1 AND b.VALID_STATUS = 1 AND c.VALID_STATUS = 1 AND d.VALID_STATUS = 1 AND f.VALID_STATUS = 1 AND g.VALID_STATUS = 1 AND h.VALID_STATUS = 1 ORDER BY a.INX ASC
     * @param queryGoodsByAdvanceId queryGoodsByAdvanceId
     * @return List<Map>
     */
    List<Map> getGoodsByAdvanceIdResult(QueryGoodsByAdvanceIdPage queryGoodsByAdvanceId);
    /**
     * desc:获取审核商品:TA_ADVANCE_REVIEW.<br/>
     * descSql =  SELECT a.ID advanceReviewId, b.SHOP_NAME shopName, c.MALL_NAME mallName, d.COMPANY_NAME companyName, h.PHOTO_URL skuPhotoUrl, f.SKU_TITLE skutitle, g.GOODS_PRICE goodsPrice, a.DEPOSIT deposit, a.ACTIVE_INVENTORY activeInventory, a.SALES sales, a.IS_RETAINAGE_CHGINV isRetainageChginv, a.ADVANCE_REVIEW_STATUS advanceReviewStatus, a.REASON reason FROM ta_advance_review a LEFT JOIN ta_shop b ON b.ID = a.SHOP_ID LEFT JOIN ta_mall c ON c.ID = b.MALL_ID LEFT JOIN ta_company d ON d.ID = b.COMPANY_ID LEFT JOIN ta_sku f ON f.ID = a.SKU_ID LEFT JOIN ta_shop_goods_price g ON g.SKU_ID = a.SKU_ID LEFT JOIN ta_goods_photo h ON h.SKU_ID = f.ID WHERE a.ADVANCE_ID = #{advanceId,jdbcType=BIGINT} AND ADVANCE_REVIEW_STATUS = #{advanceReviewStatus,jdbcType=VARCHAR} AND g.SALE_TYPE = "NORMAL" AND g.PRICE_TYPE = "VIPRICE" AND a.VALID_STATUS = 1 AND b.VALID_STATUS = 1 AND c.VALID_STATUS = 1 AND d.VALID_STATUS = 1 AND f.VALID_STATUS = 1 AND g.VALID_STATUS = 1 AND h.VALID_STATUS = 1 AND d.COMPANY_NAME LIKE #{companyName,jdbcType=VARCHAR} AND c.MALL_NAME LIKE #{mallName,jdbcType=VARCHAR} AND b.SHOP_NAME LIKE #{shopName,jdbcType=VARCHAR} AND f.SKU_TITLE LIKE #{skutitle,jdbcType=VARCHAR} 
     * @param queryExamineAdvanceGoods queryExamineAdvanceGoods
     * @return int
     */
    int getExamineAdvanceGoodsCount(QueryExamineAdvanceGoodsPage queryExamineAdvanceGoods);
    /**
     * desc:获取审核商品:TA_ADVANCE_REVIEW.<br/>
     * descSql =  SELECT a.ID advanceReviewId, b.SHOP_NAME shopName, c.MALL_NAME mallName, d.COMPANY_NAME companyName, h.PHOTO_URL skuPhotoUrl, f.SKU_TITLE skutitle, g.GOODS_PRICE goodsPrice, a.DEPOSIT deposit, a.ACTIVE_INVENTORY activeInventory, a.SALES sales, a.IS_RETAINAGE_CHGINV isRetainageChginv, a.ADVANCE_REVIEW_STATUS advanceReviewStatus, a.REASON reason FROM ta_advance_review a LEFT JOIN ta_shop b ON b.ID = a.SHOP_ID LEFT JOIN ta_mall c ON c.ID = b.MALL_ID LEFT JOIN ta_company d ON d.ID = b.COMPANY_ID LEFT JOIN ta_sku f ON f.ID = a.SKU_ID LEFT JOIN ta_shop_goods_price g ON g.SKU_ID = a.SKU_ID LEFT JOIN ta_goods_photo h ON h.SKU_ID = f.ID WHERE a.ADVANCE_ID = #{advanceId,jdbcType=BIGINT} AND ADVANCE_REVIEW_STATUS = #{advanceReviewStatus,jdbcType=VARCHAR} AND g.SALE_TYPE = "NORMAL" AND g.PRICE_TYPE = "VIPRICE" AND a.VALID_STATUS = 1 AND b.VALID_STATUS = 1 AND c.VALID_STATUS = 1 AND d.VALID_STATUS = 1 AND f.VALID_STATUS = 1 AND g.VALID_STATUS = 1 AND h.VALID_STATUS = 1 AND d.COMPANY_NAME LIKE #{companyName,jdbcType=VARCHAR} AND c.MALL_NAME LIKE #{mallName,jdbcType=VARCHAR} AND b.SHOP_NAME LIKE #{shopName,jdbcType=VARCHAR} AND f.SKU_TITLE LIKE #{skutitle,jdbcType=VARCHAR} 
     * @param queryExamineAdvanceGoods queryExamineAdvanceGoods
     * @return List<Map>
     */
    List<Map> getExamineAdvanceGoodsResult(QueryExamineAdvanceGoodsPage queryExamineAdvanceGoods);
    /**
     * desc:允许报名列表:TA_ADVANCE_REVIEW.<br/>
     * descSql =  SELECT id advanceId, `NAME` advanceName, START_TIME startTime, END_TIME endTime, PER_REGISTE_LIMIT perRegisteLimit, PER_BUY_LIMIT perBuyLimit, NOTICE NOTICE FROM ta_advance WHERE ADVANCE_STATUS = 'ING' AND VALID_STATUS = 1 AND ID NOT IN ( SELECT ADVANCE_ID FROM ta_advance_review WHERE SHOP_ID = #{shopId,jdbcType=BIGINT})
     * @param queryShowAllowAdvanceList queryShowAllowAdvanceList
     * @return int
     */
    int showAllowAdvanceListCount(QueryShowAllowAdvanceListPage queryShowAllowAdvanceList);
    /**
     * desc:允许报名列表:TA_ADVANCE_REVIEW.<br/>
     * descSql =  SELECT id advanceId, `NAME` advanceName, START_TIME startTime, END_TIME endTime, PER_REGISTE_LIMIT perRegisteLimit, PER_BUY_LIMIT perBuyLimit, NOTICE NOTICE FROM ta_advance WHERE ADVANCE_STATUS = 'ING' AND VALID_STATUS = 1 AND ID NOT IN ( SELECT ADVANCE_ID FROM ta_advance_review WHERE SHOP_ID = #{shopId,jdbcType=BIGINT})
     * @param queryShowAllowAdvanceList queryShowAllowAdvanceList
     * @return List<Map>
     */
    List<Map> showAllowAdvanceListResult(QueryShowAllowAdvanceListPage queryShowAllowAdvanceList);
    /**
     * desc:已报名列表:TA_ADVANCE_REVIEW.<br/>
     * descSql =  SELECT id advanceId, `NAME` advanceName, START_TIME startTime, END_TIME endTime, PER_REGISTE_LIMIT perRegisteLimit, PER_BUY_LIMIT perBuyLimit, NOTICE NOTICE FROM ta_advance WHERE ADVANCE_STATUS = 'ING' AND VALID_STATUS = 1 AND ID IN ( SELECT ADVANCE_ID FROM ta_advance_review WHERE SHOP_ID = #{shopId,jdbcType=BIGINT})
     * @param queryRegisteredAdvanceList queryRegisteredAdvanceList
     * @return int
     */
    int showRegisteredAdvanceListCount(QueryRegisteredAdvanceListPage queryRegisteredAdvanceList);
    /**
     * desc:已报名列表:TA_ADVANCE_REVIEW.<br/>
     * descSql =  SELECT id advanceId, `NAME` advanceName, START_TIME startTime, END_TIME endTime, PER_REGISTE_LIMIT perRegisteLimit, PER_BUY_LIMIT perBuyLimit, NOTICE NOTICE FROM ta_advance WHERE ADVANCE_STATUS = 'ING' AND VALID_STATUS = 1 AND ID IN ( SELECT ADVANCE_ID FROM ta_advance_review WHERE SHOP_ID = #{shopId,jdbcType=BIGINT})
     * @param queryRegisteredAdvanceList queryRegisteredAdvanceList
     * @return List<Map>
     */
    List<Map> showRegisteredAdvanceListResult(QueryRegisteredAdvanceListPage queryRegisteredAdvanceList);
    /**
     * desc:获取已经报名的商品数量:TA_ADVANCE_REVIEW.<br/>
     * descSql =  SELECT IFNULL(SUM(ACTIVE_INVENTORY),0) FROM ta_advance_review WHERE ADVANCE_ID = #{adavnceId,jdbcType=BIGINT} AND SKU_ID = #{skuId,jdbcType=BIGINT}
     * @param skuId skuId
     * @param adavnceId adavnceId
     * @return Long
     */
    Long getAleadyRegisteNum(@Param("skuId")Long skuId,@Param("adavnceId")Long adavnceId);
    /**
     * desc:获得店铺已报名的预售商品:TA_ADVANCE_REVIEW.<br/>
     * descSql =  SELECT a.ID advanceReviewId, a.ADVANCE_REVIEW_STATUS anvanceReviewStatus, a.REASON REASON, c.SKU_TITLE skuTitle FROM ta_advance_review a LEFT JOIN ta_shop_goods b ON a.SKU_ID =b.SKU_ID LEFT JOIN ta_sku c ON a.SKU_ID = c.ID LEFT JOIN ta_goods_photo d on d.SKU_ID = a.SKU_ID WHERE a.ADVANCE_ID = #{advanceId,jdbcType=BIGINT} AND a.SHOP_ID =#{shopId,jdbcType=BIGINT}
     * @param shopId shopId
     * @param advanceId advanceId
     * @return List<Map>
     */
    List<Map> getRegistedAdvanceShopGoods(@Param("shopId")Long shopId,@Param("advanceId")Long advanceId);
}
