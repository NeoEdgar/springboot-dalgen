package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaCouponReviewDO;
import com.xl.dy.dal.paging.QueryCouponReviewListPage;
import java.util.List;
import java.util.Map;
import java.lang.Long;
import java.util.Date;
import java.lang.Integer;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_COUPON_REVIEW.
 * TA_COUPON_REVIEW
 */
public interface TaCouponReviewDOMapper{

    /**
     * desc:插入表:TA_COUPON_REVIEW.<br/>
     * descSql =  INSERT INTO TA_COUPON_REVIEW( ID ,REASON ,REMARK ,SHOP_ID ,GOODS_ID ,COUPON_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,SHOP_GOODS_ID ,VALID_STATUS ,COUPON_REVIEW_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{reason,jdbcType=VARCHAR} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{goodsId,jdbcType=BIGINT} , #{couponId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{shopGoodsId,jdbcType=BIGINT} , #{validStatus,jdbcType=INTEGER} , #{couponReviewStatus,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaCouponReviewDO entity);
    /**
     * desc:更新表:TA_COUPON_REVIEW.<br/>
     * descSql =  UPDATE TA_COUPON_REVIEW SET REASON = #{reason,jdbcType=VARCHAR} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,COUPON_ID = #{couponId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,SHOP_GOODS_ID = #{shopGoodsId,jdbcType=BIGINT} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,COUPON_REVIEW_STATUS = #{couponReviewStatus,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaCouponReviewDO entity);
    /**
     * desc:根据主键删除数据:TA_COUPON_REVIEW.<br/>
     * descSql =  DELETE FROM TA_COUPON_REVIEW WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_COUPON_REVIEW.<br/>
     * descSql =  SELECT * FROM TA_COUPON_REVIEW WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaCouponReviewDO
     */
    TaCouponReviewDO getByPrimary(Long id);
    /**
     * desc:查看审核报名详情:TA_COUPON_REVIEW.<br/>
     * descSql =  SELECT a.ID couponreviewId, a.COUPON_ID couponId, a.COUPON_REVIEW_STATUS couponReviewStatus, a.SHOP_ID shopId, a.REASON reason, a.GOODS_ID goodsId, e.SHOP_NAME shopName, e.MALL_NAME mallName, e.COMPANY_NAME companyName, g.MG_FR_ID mgFrId, b.SHOP_GOODS_NAME shopGoodsName, b.SHOP_PHOTO_URL shopGoodsUrl, ( SELECT GROUP_CONCAT(z. NAME SEPARATOR '/') FROM tg_mg_category z WHERE FIND_IN_SET(z.ID, g.MG_FR_ID) &gt; 0 ) AS frCategory, (SELECT IFNULL(SUM(IFNULL(SALES,0)),0) FROM TA_SHOP_GOODS WHERE GOODS_ID = a.GOODS_ID AND SHOP_ID = a.SHOP_ID AND VALID_STATUS = 1 ) sales FROM ta_coupon_review a LEFT JOIN ta_shop_goods_prop b ON a.GOODS_ID = b.GOODS_ID AND a.SHOP_ID = b.SHOP_ID LEFT JOIN ta_shop e ON e.ID = a.SHOP_ID LEFT JOIN ta_goods g ON g.id = b.GOODS_ID WHERE a.VALID_STATUS = 1 AND b.VALID_STATUS = 1 AND e.VALID_STATUS = 1 AND g.VALID_STATUS = 1 AND a.COUPON_ID = #{couponId,jdbcType=BIGINT} AND a.COUPON_REVIEW_STATUS = #{couponReviewStatus,jdbcType=VARCHAR} AND e.SHOP_NAME LIKE #{shopName,jdbcType=VARCHAR} AND e.MALL_NAME LIKE #{mallName,jdbcType=VARCHAR} AND e.COMPANY_NAME LIKE #{companyName,jdbcType=VARCHAR} AND b.SHOP_GOODS_NAME CONCAT('%',#{shopGoodsName,jdbcType=VARCHAR},'%') 
     * @param queryCouponReviewList queryCouponReviewList
     * @return int
     */
    int findCouponReviewPageCount(QueryCouponReviewListPage queryCouponReviewList);
    /**
     * desc:查看审核报名详情:TA_COUPON_REVIEW.<br/>
     * descSql =  SELECT a.ID couponreviewId, a.COUPON_ID couponId, a.COUPON_REVIEW_STATUS couponReviewStatus, a.SHOP_ID shopId, a.REASON reason, a.GOODS_ID goodsId, e.SHOP_NAME shopName, e.MALL_NAME mallName, e.COMPANY_NAME companyName, g.MG_FR_ID mgFrId, b.SHOP_GOODS_NAME shopGoodsName, b.SHOP_PHOTO_URL shopGoodsUrl, ( SELECT GROUP_CONCAT(z. NAME SEPARATOR '/') FROM tg_mg_category z WHERE FIND_IN_SET(z.ID, g.MG_FR_ID) &gt; 0 ) AS frCategory, (SELECT IFNULL(SUM(IFNULL(SALES,0)),0) FROM TA_SHOP_GOODS WHERE GOODS_ID = a.GOODS_ID AND SHOP_ID = a.SHOP_ID AND VALID_STATUS = 1 ) sales FROM ta_coupon_review a LEFT JOIN ta_shop_goods_prop b ON a.GOODS_ID = b.GOODS_ID AND a.SHOP_ID = b.SHOP_ID LEFT JOIN ta_shop e ON e.ID = a.SHOP_ID LEFT JOIN ta_goods g ON g.id = b.GOODS_ID WHERE a.VALID_STATUS = 1 AND b.VALID_STATUS = 1 AND e.VALID_STATUS = 1 AND g.VALID_STATUS = 1 AND a.COUPON_ID = #{couponId,jdbcType=BIGINT} AND a.COUPON_REVIEW_STATUS = #{couponReviewStatus,jdbcType=VARCHAR} AND e.SHOP_NAME LIKE #{shopName,jdbcType=VARCHAR} AND e.MALL_NAME LIKE #{mallName,jdbcType=VARCHAR} AND e.COMPANY_NAME LIKE #{companyName,jdbcType=VARCHAR} AND b.SHOP_GOODS_NAME CONCAT('%',#{shopGoodsName,jdbcType=VARCHAR},'%') 
     * @param queryCouponReviewList queryCouponReviewList
     * @return List<Map>
     */
    List<Map> findCouponReviewPageResult(QueryCouponReviewListPage queryCouponReviewList);
    /**
     * desc:更新表:TA_COUPON_REVIEW.<br/>
     * descSql =  UPDATE TA_COUPON_REVIEW REASON = #{reason,jdbcType=VARCHAR}, REMARK = #{remark,jdbcType=VARCHAR}, SHOP_ID = #{shopId,jdbcType=BIGINT}, COUPON_ID = #{couponId,jdbcType=BIGINT}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, SHOP_GOODS_ID = #{shopGoodsId,jdbcType=INTEGER}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, COUPON_REVIEW_STATUS = #{couponReviewStatus,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long updateByPrimarySelective(TaCouponReviewDO entity);
    /**
     * desc:根据店铺ID和商品ID获取数据:TA_COUPON_REVIEW.<br/>
     * descSql =  SELECT COUPON_ID FROM TA_COUPON_REVIEW WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND GOODS_ID = #{goodsId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param shopId shopId
     * @param goodsId goodsId
     * @return List<Long>
     */
    List<Long> getCouponReviewByShopIdAndGoodsId(@Param("shopId")Long shopId,@Param("goodsId")Long goodsId);
    /**
     * desc:获得优惠券报名商品:TA_COUPON_REVIEW.<br/>
     * descSql =  SELECT count(0) FROM `ta_coupon_review` WHERE COUPON_ID = #{couponId,jdbcType=BIGINT} AND COUPON_REVIEW_STATUS = "PASS" AND VALID_STATUS = 1 GROUP BY COUPON_ID
     * @param couponId couponId
     * @return Long
     */
    Long getRegisteredByCoupon(Long couponId);
    /**
     * desc:获得商品优惠券使用量:TA_COUPON_REVIEW.<br/>
     * descSql =  SELECT COUNT(0) FROM ta_coupon_review a LEFT JOIN TA_COUPON_USER b ON a.COUPON_ID = b.COUPON_ID WHERE a.VALID_STATUS=1 AND b.VALID_STATUS =1 AND	a.GOODS_ID = #{goodsId,jdbcType=BIGINT} AND b.COUPON_USE_STATUS ="USED"
     * @param goodsId goodsId
     * @return Long
     */
    Long getUsedCoupon(Long goodsId);
    /**
     * desc:通过优惠券审核:TA_COUPON_REVIEW.<br/>
     * descSql =  UPDATE TA_COUPON_REVIEW SET COUPON_REVIEW_STATUS = "PASS" ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} WHERE ID = #{id,jdbcType=BIGINT}
     * @param alterTime alterTime
     * @param id id
     * @param alterEmpl alterEmpl
     * @return Long
     */
    Long passCoupon(@Param("alterTime")Date alterTime,@Param("id")Long id,@Param("alterEmpl")Long alterEmpl);
    /**
     * desc:根据店铺商品id获取数据:TA_COUPON_REVIEW.<br/>
     * descSql =  SELECT count(0) FROM TA_COUPON_REVIEW WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND COUPON_ID = #{couponId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT}
     * @param shopId shopId
     * @param goodsId goodsId
     * @param couponId couponId
     * @return Integer
     */
    Integer getByShopAndGoodsId(@Param("shopId")Long shopId,@Param("goodsId")Long goodsId,@Param("couponId")Long couponId);
    /**
     * desc:重新报名:TA_COUPON_REVIEW.<br/>
     * descSql =  UPDATE ta_coupon_review SET COUPON_REVIEW_STATUS = "UNCHECK" ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} WHERE id = #{id,jdbcType=BIGINT}
     * @param alterTime alterTime
     * @param id id
     * @param alterEmpl alterEmpl
     * @return Long
     */
    Long reEnroll(@Param("alterTime")Date alterTime,@Param("id")Long id,@Param("alterEmpl")Long alterEmpl);
}
