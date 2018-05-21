package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.ShechemEsCouponDO;
import com.xl.dy.dal.resultmap.OldCouponShowVO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table SHECHEM_ES_COUPON.
 * SHECHEM_ES_COUPON
 */
public interface ShechemEsCouponDOMapper{

    /**
     * desc:插入表:SHECHEM_ES_COUPON.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO SHECHEM_ES_COUPON( ID ,_UID ,MID ,UID ,TURN ,TYPE ,BTIME ,ETIME ,ISGET ,PRICE ,THUMB ,TITLE ,IS_GIVE ,IS_SALE ,STATUS ,TAGSTR ,DISPLAY ,GROUP_ID ,STORE_ID ,IS_FAMILY ,IS_REFUND ,LIMIT_GET ,LIMIT_NUM ,SHOW_IN_WX ,INPUTTIME ,IS_RECEIVE ,LIMIT_USER ,RECOMMEND ,SHOW_IN_APP ,CATEGORY_ID ,IS_ACTIVITY ,LIMIT_BTIME ,LIMIT_ETIME ,LIMIT_PRICE ,RATE_PRAISE ,UPDATETIME ,DAY_LIMIT_GET ,DESCRIPTION ,IS_PREPAYCARD ,COUPON_CATEGORY ,NO_DISCOUNT_GROUP )VALUES( #{id,jdbcType=INTEGER} , #{Uid,jdbcType=INTEGER} , #{mid,jdbcType=VARCHAR} , #{uid,jdbcType=INTEGER} , #{turn,jdbcType=INTEGER} , #{type,jdbcType=BIT} , #{btime,jdbcType=INTEGER} , #{etime,jdbcType=INTEGER} , #{isget,jdbcType=BIT} , #{price,jdbcType=INTEGER} , #{thumb,jdbcType=VARCHAR} , #{title,jdbcType=VARCHAR} , #{isGive,jdbcType=BIT} , #{isSale,jdbcType=BIT} , #{status,jdbcType=BIT} , #{tagstr,jdbcType=LONGVARCHAR} , #{display,jdbcType=BIT} , #{groupId,jdbcType=VARCHAR} , #{storeId,jdbcType=INTEGER} , #{isFamily,jdbcType=BIT} , #{isRefund,jdbcType=BIT} , #{limitGet,jdbcType=INTEGER} , #{limitNum,jdbcType=INTEGER} , #{showInWx,jdbcType=BIT} , #{inputtime,jdbcType=INTEGER} , #{isReceive,jdbcType=BIT} , #{limitUser,jdbcType=VARCHAR} , #{recommend,jdbcType=BIT} , #{showInApp,jdbcType=BIT} , #{categoryId,jdbcType=INTEGER} , #{isActivity,jdbcType=BIT} , #{limitBtime,jdbcType=INTEGER} , #{limitEtime,jdbcType=INTEGER} , #{limitPrice,jdbcType=INTEGER} , #{ratePraise,jdbcType=REAL} , #{updatetime,jdbcType=INTEGER} , #{dayLimitGet,jdbcType=INTEGER} , #{description,jdbcType=LONGVARCHAR} , #{isPrepaycard,jdbcType=TINYINT} , #{couponCategory,jdbcType=INTEGER} , #{noDiscountGroup,jdbcType=BIT} )
     * @param entity entity
     * @return Long
     */
    Long insert(ShechemEsCouponDO entity);
    /**
     * desc:更新表:SHECHEM_ES_COUPON.<br/>
     * descSql =  UPDATE SHECHEM_ES_COUPON SET _UID = #{Uid,jdbcType=INTEGER} ,MID = #{mid,jdbcType=VARCHAR} ,UID = #{uid,jdbcType=INTEGER} ,TURN = #{turn,jdbcType=INTEGER} ,TYPE = #{type,jdbcType=BIT} ,BTIME = #{btime,jdbcType=INTEGER} ,ETIME = #{etime,jdbcType=INTEGER} ,ISGET = #{isget,jdbcType=BIT} ,PRICE = #{price,jdbcType=INTEGER} ,THUMB = #{thumb,jdbcType=VARCHAR} ,TITLE = #{title,jdbcType=VARCHAR} ,IS_GIVE = #{isGive,jdbcType=BIT} ,IS_SALE = #{isSale,jdbcType=BIT} ,STATUS = #{status,jdbcType=BIT} ,TAGSTR = #{tagstr,jdbcType=LONGVARCHAR} ,DISPLAY = #{display,jdbcType=BIT} ,GROUP_ID = #{groupId,jdbcType=VARCHAR} ,STORE_ID = #{storeId,jdbcType=INTEGER} ,IS_FAMILY = #{isFamily,jdbcType=BIT} ,IS_REFUND = #{isRefund,jdbcType=BIT} ,LIMIT_GET = #{limitGet,jdbcType=INTEGER} ,LIMIT_NUM = #{limitNum,jdbcType=INTEGER} ,SHOW_IN_WX = #{showInWx,jdbcType=BIT} ,INPUTTIME = #{inputtime,jdbcType=INTEGER} ,IS_RECEIVE = #{isReceive,jdbcType=BIT} ,LIMIT_USER = #{limitUser,jdbcType=VARCHAR} ,RECOMMEND = #{recommend,jdbcType=BIT} ,SHOW_IN_APP = #{showInApp,jdbcType=BIT} ,CATEGORY_ID = #{categoryId,jdbcType=INTEGER} ,IS_ACTIVITY = #{isActivity,jdbcType=BIT} ,LIMIT_BTIME = #{limitBtime,jdbcType=INTEGER} ,LIMIT_ETIME = #{limitEtime,jdbcType=INTEGER} ,LIMIT_PRICE = #{limitPrice,jdbcType=INTEGER} ,RATE_PRAISE = #{ratePraise,jdbcType=REAL} ,UPDATETIME = #{updatetime,jdbcType=INTEGER} ,DAY_LIMIT_GET = #{dayLimitGet,jdbcType=INTEGER} ,DESCRIPTION = #{description,jdbcType=LONGVARCHAR} ,IS_PREPAYCARD = #{isPrepaycard,jdbcType=TINYINT} ,COUPON_CATEGORY = #{couponCategory,jdbcType=INTEGER} ,NO_DISCOUNT_GROUP = #{noDiscountGroup,jdbcType=BIT} WHERE ID = #{id,jdbcType=INTEGER}
     * @param entity entity
     * @return Long
     */
    Long update(ShechemEsCouponDO entity);
    /**
     * desc:根据主键删除数据:SHECHEM_ES_COUPON.<br/>
     * descSql =  DELETE FROM SHECHEM_ES_COUPON WHERE ID = #{id,jdbcType=INTEGER}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Integer id);
    /**
     * desc:根据主键获取数据:SHECHEM_ES_COUPON.<br/>
     * descSql =  SELECT * FROM SHECHEM_ES_COUPON WHERE ID = #{id,jdbcType=INTEGER}
     * @param id id
     * @return ShechemEsCouponDO
     */
    ShechemEsCouponDO getByPrimary(Integer id);
    /**
     * desc:SHECHEM_ES_COUPON.<br/>
     * descSql =  SELECT a.id AS id ,a.store_id AS storeId ,a.title AS title ,b.sale_img AS thumb ,b.sale_content AS content ,a.price AS price FROM SHECHEM_ES_COUPON a left JOIN SHECHEM_ES_COUPON_DETAIL b on a.id = b.coupon_id WHERE a.mid = 'DJEHBSUAAY' ORDER BY a.id DESC LIMIT #{pageSize,jdbcType=INTEGER}
     * @param pageSize pageSize
     * @return List<OldCouponShowVO>
     */
    List<OldCouponShowVO> getCouponListByNum(Integer pageSize);
}
