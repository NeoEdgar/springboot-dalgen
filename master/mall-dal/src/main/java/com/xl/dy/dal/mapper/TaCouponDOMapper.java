package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaCouponDO;
import com.xl.dy.dal.paging.QueryCouponListPage;
import java.util.List;
import java.util.Map;
import com.xl.dy.dal.paging.QueryNoSignUpCouponActivityListPage;
import com.xl.dy.dal.paging.QueryAlreadyCouponActivityListPage;
import com.xl.dy.dal.paging.QueryShopCouponPageListPage;
import java.lang.Integer;
import com.xl.dy.dal.paging.QueryEnrolledCrossCouponPage;
import com.xl.dy.dal.paging.QueryEnrollCrossCouponPage;
import com.xl.dy.dal.paging.QueryCouponForMicroPagePage;
import org.apache.ibatis.annotations.Param;

/**
 * ?��???�?对�??页�????,请�?��?�使?��?��???DAO�?
 * The Table TA_COUPON.
 * TA_COUPON
 */
public interface TaCouponDOMapper{

    /**
     * desc:???�表:TA_COUPON.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_COUPON( ID ,NAME ,NOTICE ,PRE_DAY ,REMARK ,PAR_VALUE ,QUANTITY ,ALTER_EMPL ,ALTER_TIME ,IS_LIMITED ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,EFFECT_TIME ,EXPIRY_TIME ,PLATFORM_ID ,CATEGORY_SET ,RECEIVE_TIME ,VALID_STATUS ,COUPON_STATUS ,DISCOUNT_FORM ,DISCOUNT_RATE ,INSTRUCTIONS ,IS_OVERLAP_USE ,PLATFORM_TYPE ,LIMITED_AMOUNT ,MEMBER_LEVEL_SET ,PER_RECEIVE_LIMIT ,IS_EXPIRATION_REMIND )VALUES( #{id,jdbcType=BIGINT} , #{name,jdbcType=VARCHAR} , #{notice,jdbcType=VARCHAR} , #{preDay,jdbcType=INTEGER} , #{remark,jdbcType=VARCHAR} , #{parValue,jdbcType=DECIMAL} , #{quantity,jdbcType=INTEGER} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{isLimited,jdbcType=INTEGER} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{effectTime,jdbcType=TIMESTAMP} , #{expiryTime,jdbcType=TIMESTAMP} , #{platformId,jdbcType=BIGINT} , #{categorySet,jdbcType=VARCHAR} , #{receiveTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{couponStatus,jdbcType=VARCHAR} , #{discountForm,jdbcType=VARCHAR} , #{discountRate,jdbcType=DECIMAL} , #{instructions,jdbcType=VARCHAR} , #{isOverlapUse,jdbcType=INTEGER} , #{platformType,jdbcType=VARCHAR} , #{limitedAmount,jdbcType=DECIMAL} , #{memberLevelSet,jdbcType=VARCHAR} , #{perReceiveLimit,jdbcType=INTEGER} , #{isExpirationRemind,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaCouponDO entity);
    /**
     * desc:?��?�表:TA_COUPON.<br/>
     * descSql =  UPDATE TA_COUPON SET NAME = #{name,jdbcType=VARCHAR} ,NOTICE = #{notice,jdbcType=VARCHAR} ,PRE_DAY = #{preDay,jdbcType=INTEGER} ,REMARK = #{remark,jdbcType=VARCHAR} ,PAR_VALUE = #{parValue,jdbcType=DECIMAL} ,QUANTITY = #{quantity,jdbcType=INTEGER} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,IS_LIMITED = #{isLimited,jdbcType=INTEGER} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,EFFECT_TIME = #{effectTime,jdbcType=TIMESTAMP} ,EXPIRY_TIME = #{expiryTime,jdbcType=TIMESTAMP} ,PLATFORM_ID = #{platformId,jdbcType=BIGINT} ,CATEGORY_SET = #{categorySet,jdbcType=VARCHAR} ,RECEIVE_TIME = #{receiveTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,COUPON_STATUS = #{couponStatus,jdbcType=VARCHAR} ,DISCOUNT_FORM = #{discountForm,jdbcType=VARCHAR} ,DISCOUNT_RATE = #{discountRate,jdbcType=DECIMAL} ,INSTRUCTIONS = #{instructions,jdbcType=VARCHAR} ,IS_OVERLAP_USE = #{isOverlapUse,jdbcType=INTEGER} ,PLATFORM_TYPE = #{platformType,jdbcType=VARCHAR} ,LIMITED_AMOUNT = #{limitedAmount,jdbcType=DECIMAL} ,MEMBER_LEVEL_SET = #{memberLevelSet,jdbcType=VARCHAR} ,PER_RECEIVE_LIMIT = #{perReceiveLimit,jdbcType=INTEGER} ,IS_EXPIRATION_REMIND = #{isExpirationRemind,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaCouponDO entity);
    /**
     * desc:获取优惠卷列表:TA_COUPON.<br/>
     * descSql =  SELECT ID couponId, `NAME` couponName, PAR_VALUE parvalue, RECEIVE_TIME receiveTime, EFFECT_TIME effectTime, EXPIRY_TIME expiryTime, QUANTITY quantity FROM ta_coupon where VALID_STATUS = 1 AND COUPON_STATUS = #{couponStatus,jdbcType=VARCHAR} AND PLATFORM_TYPE = #{platformType,jdbcType=VARCHAR} AND PLATFORM_ID = #{platformId,jdbcType=BIGINT} AND NAME like #{condition,jdbcType=VARCHAR} 
     * @param queryCouponList queryCouponList
     * @return int
     */
    int findCouponPageCount(QueryCouponListPage queryCouponList);
    /**
     * desc:获取优惠卷列表:TA_COUPON.<br/>
     * descSql =  SELECT ID couponId, `NAME` couponName, PAR_VALUE parvalue, RECEIVE_TIME receiveTime, EFFECT_TIME effectTime, EXPIRY_TIME expiryTime, QUANTITY quantity FROM ta_coupon where VALID_STATUS = 1 AND COUPON_STATUS = #{couponStatus,jdbcType=VARCHAR} AND PLATFORM_TYPE = #{platformType,jdbcType=VARCHAR} AND PLATFORM_ID = #{platformId,jdbcType=BIGINT} AND NAME like #{condition,jdbcType=VARCHAR} 
     * @param queryCouponList queryCouponList
     * @return List<Map>
     */
    List<Map> findCouponPageResult(QueryCouponListPage queryCouponList);
    /**
     * desc:根据主键删除数据:TA_COUPON.<br/>
     * descSql =  DELETE FROM TA_COUPON WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_COUPON.<br/>
     * descSql =  SELECT * FROM TA_COUPON WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaCouponDO
     */
    TaCouponDO getByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_COUPON.<br/>
     * descSql =  SELECT * FROM TA_COUPON WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = #{validStatus,jdbcType=INTEGER}
     * @param id id
     * @param validStatus validStatus
     * @return TaCouponDO
     */
    TaCouponDO getByPrimaryAndValidStatus(@Param("id")Long id,@Param("validStatus")Integer validStatus);
    /**
     * desc:拼接类目、会员等级等详情.<br/>
     * descSql =  SELECT NAME name, PER_RECEIVE_LIMIT perReceiveLimit, EFFECT_TIME effectTime, EXPIRY_TIME expiryTime, DISCOUNT_FORM discountForm, PAR_VALUE parValue, QUANTITY quantity, IS_LIMITED isLimited, LIMITED_AMOUNT limitedAmount ,catName FROM (SELECT * FROM TA_COUPON WHERE ID = #{id,jdbcType=BIGINT}) a, (SELECT GROUP_CONCAT(NAME) catName FROM tg_mg_category WHERE FIND_IN_SET(ID,(SELECT CATEGORY_SET FROM ta_coupon WHERE ID = #{id,jdbcType=BIGINT}))) b
     * @param id id
     * @return Map
     */
    Map getCouponDetailByPrimary(Long id);
    /**
     * desc:店铺获取未报名可报名的优惠卷活动.<br/>
     * descSql =  SELECT * FROM ta_coupon WHERE PLATFORM_TYPE != "SHOPPLATFORM" AND COUPON_STATUS = "ING" AND ID NOT IN ( SELECT COUPON_ID FROM TA_COUPON_REVIEW WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} GROUP BY COUPON_ID) ORDER BY CREATE_TIME DESC
     * @param queryNoSignUpCouponActivityList queryNoSignUpCouponActivityList
     * @return int
     */
    int findNoSignUpCouponActivityPageCount(QueryNoSignUpCouponActivityListPage queryNoSignUpCouponActivityList);
    /**
     * desc:店铺获取未报名可报名的优惠卷活动.<br/>
     * descSql =  SELECT * FROM ta_coupon WHERE PLATFORM_TYPE != "SHOPPLATFORM" AND COUPON_STATUS = "ING" AND ID NOT IN ( SELECT COUPON_ID FROM TA_COUPON_REVIEW WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} GROUP BY COUPON_ID) ORDER BY CREATE_TIME DESC
     * @param queryNoSignUpCouponActivityList queryNoSignUpCouponActivityList
     * @return List<Map>
     */
    List<Map> findNoSignUpCouponActivityPageResult(QueryNoSignUpCouponActivityListPage queryNoSignUpCouponActivityList);
    /**
     * desc:店铺获取已经报名可报名的优惠卷活动.<br/>
     * descSql =  SELECT * FROM ta_coupon WHERE PLATFORM_TYPE != "SHOPPLATFORM" AND COUPON_STATUS != "INIT" AND ID IN ( SELECT COUPON_ID FROM TA_COUPON_REVIEW WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} GROUP BY COUPON_ID) LEFT JOIN ta_company c ON c.id = p.platform_id ORDER BY CREATE_TIME DESC
     * @param queryAlreadyCouponActivityList queryAlreadyCouponActivityList
     * @return int
     */
    int findAlreadySignUpCouponActivityPageCount(QueryAlreadyCouponActivityListPage queryAlreadyCouponActivityList);
    /**
     * desc:店铺获取已经报名可报名的优惠卷活动.<br/>
     * descSql =  SELECT * FROM ta_coupon WHERE PLATFORM_TYPE != "SHOPPLATFORM" AND COUPON_STATUS != "INIT" AND ID IN ( SELECT COUPON_ID FROM TA_COUPON_REVIEW WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} GROUP BY COUPON_ID) LEFT JOIN ta_company c ON c.id = p.platform_id ORDER BY CREATE_TIME DESC
     * @param queryAlreadyCouponActivityList queryAlreadyCouponActivityList
     * @return List<Map>
     */
    List<Map> findAlreadySignUpCouponActivityPageResult(QueryAlreadyCouponActivityListPage queryAlreadyCouponActivityList);
    /**
     * desc:更新表:TA_COUPON.<br/>
     * descSql =  UPDATE TA_COUPON NAME = #{name,jdbcType=VARCHAR}, NOTICE = #{notice,jdbcType=VARCHAR}, PRE_DAY = #{preDay,jdbcType=INTEGER}, REMARK = #{remark,jdbcType=VARCHAR}, PAR_VALUE = #{parValue,jdbcType=DECIMAL}, QUANTITY = #{quantity,jdbcType=INTEGER}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, IS_LIMITED = #{isLimited,jdbcType=INTEGER}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, EFFECT_TIME = #{effectTime,jdbcType=TIMESTAMP}, EXPIRY_TIME = #{expiryTime,jdbcType=TIMESTAMP}, PLATFORM_ID = #{platformId,jdbcType=BIGINT}, CATEGORY_SET = #{categorySet,jdbcType=VARCHAR}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, COUPON_STATUS = #{couponStatus,jdbcType=VARCHAR}, DISCOUNT_FORM = #{discountForm,jdbcType=VARCHAR}, DISCOUNT_RATE = #{discountRate,jdbcType=DECIMAL}, INSTRUCTIONS = #{instructions,jdbcType=VARCHAR}, IS_OVERLAP_USE = #{isOverlapUse,jdbcType=INTEGER}, PLATFORM_TYPE = #{platformType,jdbcType=VARCHAR}, LIMITED_AMOUNT = #{limitedAmount,jdbcType=DECIMAL}, MEMBER_LEVEL_SET = #{memberLevelSet,jdbcType=VARCHAR}, PER_RECEIVE_LIMIT = #{perReceiveLimit,jdbcType=INTEGER}, IS_EXPIRATION_REMIND = #{isExpirationRemind,jdbcType=INTEGER}, RECEIVE_TIME = #{receiveTime,jdbcType=TIMESTAMP}, WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long updateByPrimarySelective(TaCouponDO entity);
    /**
     * desc:根据主键获取有效数据:TA_COUPON.<br/>
     * descSql =  SELECT * FROM TA_COUPON WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaCouponDO
     */
    TaCouponDO getByPrimarySelective(Long id);
    /**
     * desc:获取店铺优惠券:TA_COUPON.<br/>
     * descSql =  SELECT id couponId, `NAME` couponName, PLATFORM_TYPE platformType, PAR_VALUE parValue, PLATFORM_TYPE platformType, PLATFORM_ID platformId, LIMITED_AMOUNT limitAmount, EFFECT_TIME effectTime, EXPIRY_TIME expiryTime, CATEGORY_SET categorySet, QUANTITY quantity, INSTRUCTIONS instructions FROM ta_coupon WHERE VALID_STATUS = 1 AND PLATFORM_ID = #{shopId,jdbcType=BIGINT} AND PLATFORM_TYPE != #{platformType,jdbcType=VARCHAR} AND COUPON_STATUS = #{couponStatus,jdbcType=VARCHAR} 
     * @param queryShopCouponPageList queryShopCouponPageList
     * @return int
     */
    int findShopCouponPageCount(QueryShopCouponPageListPage queryShopCouponPageList);
    /**
     * desc:获取店铺优惠券:TA_COUPON.<br/>
     * descSql =  SELECT id couponId, `NAME` couponName, PLATFORM_TYPE platformType, PAR_VALUE parValue, PLATFORM_TYPE platformType, PLATFORM_ID platformId, LIMITED_AMOUNT limitAmount, EFFECT_TIME effectTime, EXPIRY_TIME expiryTime, CATEGORY_SET categorySet, QUANTITY quantity, INSTRUCTIONS instructions FROM ta_coupon WHERE VALID_STATUS = 1 AND PLATFORM_ID = #{shopId,jdbcType=BIGINT} AND PLATFORM_TYPE != #{platformType,jdbcType=VARCHAR} AND COUPON_STATUS = #{couponStatus,jdbcType=VARCHAR} 
     * @param queryShopCouponPageList queryShopCouponPageList
     * @return List<Map>
     */
    List<Map> findShopCouponPageResult(QueryShopCouponPageListPage queryShopCouponPageList);
    /**
     * desc:根据主键获取优惠券数量:TA_COUPON.<br/>
     * descSql =  SELECT QUANTITY quantity FROM TA_COUPON WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Integer
     */
    Integer getQuantityByPrimary(Long id);
    /**
     * desc:获取已报名第三方优惠券:TA_COUPON.<br/>
     * descSql =  SELECT ID couponId, `NAME` couponName, CATEGORY_SET categorySet, PER_RECEIVE_LIMIT perReceivelimit, RECEIVE_TIME receiveTime, PLATFORM_TYPE platformType, PLATFORM_ID platformId, EFFECT_TIME effectTime, EXPIRY_TIME expiryTime, PAR_VALUE parvalue, LIMITED_AMOUNT limitedAmount, INSTRUCTIONS instructions FROM ta_coupon WHERE VALID_STATUS =1 AND PLATFORM_TYPE !="SHOPPLATFORM" AND	ID IN (SELECT COUPON_ID FROM ta_coupon_review WHERE SHOP_ID =#{shopId,jdbcType=BIGINT})
     * @param queryEnrolledCrossCoupon queryEnrolledCrossCoupon
     * @return int
     */
    int findEnrolledCrossCouponPageCount(QueryEnrolledCrossCouponPage queryEnrolledCrossCoupon);
    /**
     * desc:获取已报名第三方优惠券:TA_COUPON.<br/>
     * descSql =  SELECT ID couponId, `NAME` couponName, CATEGORY_SET categorySet, PER_RECEIVE_LIMIT perReceivelimit, RECEIVE_TIME receiveTime, PLATFORM_TYPE platformType, PLATFORM_ID platformId, EFFECT_TIME effectTime, EXPIRY_TIME expiryTime, PAR_VALUE parvalue, LIMITED_AMOUNT limitedAmount, INSTRUCTIONS instructions FROM ta_coupon WHERE VALID_STATUS =1 AND PLATFORM_TYPE !="SHOPPLATFORM" AND	ID IN (SELECT COUPON_ID FROM ta_coupon_review WHERE SHOP_ID =#{shopId,jdbcType=BIGINT})
     * @param queryEnrolledCrossCoupon queryEnrolledCrossCoupon
     * @return List<Map>
     */
    List<Map> findEnrolledCrossCouponPageResult(QueryEnrolledCrossCouponPage queryEnrolledCrossCoupon);
    /**
     * desc:获取可报名第三方优惠券:TA_COUPON.<br/>
     * descSql =  SELECT ID couponId, `NAME` couponName, CATEGORY_SET categorySet, PER_RECEIVE_LIMIT perReceivelimit, RECEIVE_TIME receiveTime, PLATFORM_TYPE platformType, PLATFORM_ID platformId, EFFECT_TIME effectTime, EXPIRY_TIME expiryTime, PAR_VALUE parvalue, LIMITED_AMOUNT limitedAmount, INSTRUCTIONS instructions FROM ta_coupon WHERE VALID_STATUS =1 AND (PLATFORM_TYPE = "PLATFORM" OR PLATFORM_ID = (SELECT MALL_ID FROM ta_shop WHERE ID = #{shopId,jdbcType=BIGINT}) OR PLATFORM_ID = (SELECT COMPANY_ID FROM ta_shop WHERE ID = #{shopId,jdbcType=BIGINT}) ) AND ID NOT IN (SELECT COUPON_ID FROM ta_coupon_review WHERE SHOP_ID = #{shopId,jdbcType=BIGINT}) AND COUPON_STATUS !="INIT"
     * @param queryEnrollCrossCoupon queryEnrollCrossCoupon
     * @return int
     */
    int findEnrollCrossCouponPageCount(QueryEnrollCrossCouponPage queryEnrollCrossCoupon);
    /**
     * desc:获取可报名第三方优惠券:TA_COUPON.<br/>
     * descSql =  SELECT ID couponId, `NAME` couponName, CATEGORY_SET categorySet, PER_RECEIVE_LIMIT perReceivelimit, RECEIVE_TIME receiveTime, PLATFORM_TYPE platformType, PLATFORM_ID platformId, EFFECT_TIME effectTime, EXPIRY_TIME expiryTime, PAR_VALUE parvalue, LIMITED_AMOUNT limitedAmount, INSTRUCTIONS instructions FROM ta_coupon WHERE VALID_STATUS =1 AND (PLATFORM_TYPE = "PLATFORM" OR PLATFORM_ID = (SELECT MALL_ID FROM ta_shop WHERE ID = #{shopId,jdbcType=BIGINT}) OR PLATFORM_ID = (SELECT COMPANY_ID FROM ta_shop WHERE ID = #{shopId,jdbcType=BIGINT}) ) AND ID NOT IN (SELECT COUPON_ID FROM ta_coupon_review WHERE SHOP_ID = #{shopId,jdbcType=BIGINT}) AND COUPON_STATUS !="INIT"
     * @param queryEnrollCrossCoupon queryEnrollCrossCoupon
     * @return List<Map>
     */
    List<Map> findEnrollCrossCouponPageResult(QueryEnrollCrossCouponPage queryEnrollCrossCoupon);
    /**
     * desc:微页面获取优惠券信息:TA_COUPON.<br/>
     * descSql =  SELECT ID couponId, `NAME` couponName, IS_LIMITED isLimited, LIMITED_AMOUNT limitedAmount, PAR_VALUE parValue, EFFECT_TIME effectTime, EXPIRY_TIME expiryTime FROM ta_coupon WHERE VALID_STATUS = 1 AND COUPON_STATUS = "ING" AND (ID = #{couponId,jdbcType=BIGINT} OR `NAME` LIKE #{couponName,jdbcType=VARCHAR})
     * @param queryCouponForMicroPage queryCouponForMicroPage
     * @return int
     */
    int getCouponForMicroPageCount(QueryCouponForMicroPagePage queryCouponForMicroPage);
    /**
     * desc:微页面获取优惠券信息:TA_COUPON.<br/>
     * descSql =  SELECT ID couponId, `NAME` couponName, IS_LIMITED isLimited, LIMITED_AMOUNT limitedAmount, PAR_VALUE parValue, EFFECT_TIME effectTime, EXPIRY_TIME expiryTime FROM ta_coupon WHERE VALID_STATUS = 1 AND COUPON_STATUS = "ING" AND (ID = #{couponId,jdbcType=BIGINT} OR `NAME` LIKE #{couponName,jdbcType=VARCHAR})
     * @param queryCouponForMicroPage queryCouponForMicroPage
     * @return List<Map>
     */
    List<Map> getCouponForMicroPageResult(QueryCouponForMicroPagePage queryCouponForMicroPage);
}
