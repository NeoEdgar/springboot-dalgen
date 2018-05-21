package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.ShechemEsCouponDetailDO;
import com.xl.dy.dal.mapper.ShechemEsCouponDetailDOMapper;

/**
* The Table SHECHEM_ES_COUPON_DETAIL.
* SHECHEM_ES_COUPON_DETAIL
*/
@Repository
public class ShechemEsCouponDetailDAO{

    @Autowired
    private ShechemEsCouponDetailDOMapper shechemEsCouponDetailDOMapper;

    /**
     * desc:插入表:SHECHEM_ES_COUPON_DETAIL.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO SHECHEM_ES_COUPON_DETAIL( ID ,MID ,STATUS ,DISPLAY ,SALE_IMG ,COUPON_ID ,IS_REFUND ,OUTLET_ID ,SHOW_CITY ,LIMIT_SALE ,SALE_PRICE ,SHARE_THUMB ,SHARE_TITLE ,VOLUME_PLUS ,SALE_CONTENT ,SHELVES_BTIME ,SHELVES_ETIME ,CONSUME_PROMPT ,COUPON_CONTENT ,IS_APPOINTMENT ,SPECIAL_PROMPT ,SHARE_DESCRIPTION )VALUES( #{id,jdbcType=INTEGER} , #{mid,jdbcType=VARCHAR} , #{status,jdbcType=BIT} , #{display,jdbcType=BIT} , #{saleImg,jdbcType=VARCHAR} , #{couponId,jdbcType=INTEGER} , #{isRefund,jdbcType=BIT} , #{outletId,jdbcType=VARCHAR} , #{showCity,jdbcType=VARCHAR} , #{limitSale,jdbcType=INTEGER} , #{salePrice,jdbcType=INTEGER} , #{shareThumb,jdbcType=VARCHAR} , #{shareTitle,jdbcType=VARCHAR} , #{volumePlus,jdbcType=INTEGER} , #{saleContent,jdbcType=LONGVARCHAR} , #{shelvesBtime,jdbcType=INTEGER} , #{shelvesEtime,jdbcType=INTEGER} , #{consumePrompt,jdbcType=LONGVARCHAR} , #{couponContent,jdbcType=LONGVARCHAR} , #{isAppointment,jdbcType=BIT} , #{specialPrompt,jdbcType=VARCHAR} , #{shareDescription,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(ShechemEsCouponDetailDO entity){
        return shechemEsCouponDetailDOMapper.insert(entity);
    }
    /**
     * desc:更新表:SHECHEM_ES_COUPON_DETAIL.<br/>
     * descSql =  UPDATE SHECHEM_ES_COUPON_DETAIL SET MID = #{mid,jdbcType=VARCHAR} ,STATUS = #{status,jdbcType=BIT} ,DISPLAY = #{display,jdbcType=BIT} ,SALE_IMG = #{saleImg,jdbcType=VARCHAR} ,COUPON_ID = #{couponId,jdbcType=INTEGER} ,IS_REFUND = #{isRefund,jdbcType=BIT} ,OUTLET_ID = #{outletId,jdbcType=VARCHAR} ,SHOW_CITY = #{showCity,jdbcType=VARCHAR} ,LIMIT_SALE = #{limitSale,jdbcType=INTEGER} ,SALE_PRICE = #{salePrice,jdbcType=INTEGER} ,SHARE_THUMB = #{shareThumb,jdbcType=VARCHAR} ,SHARE_TITLE = #{shareTitle,jdbcType=VARCHAR} ,VOLUME_PLUS = #{volumePlus,jdbcType=INTEGER} ,SALE_CONTENT = #{saleContent,jdbcType=LONGVARCHAR} ,SHELVES_BTIME = #{shelvesBtime,jdbcType=INTEGER} ,SHELVES_ETIME = #{shelvesEtime,jdbcType=INTEGER} ,CONSUME_PROMPT = #{consumePrompt,jdbcType=LONGVARCHAR} ,COUPON_CONTENT = #{couponContent,jdbcType=LONGVARCHAR} ,IS_APPOINTMENT = #{isAppointment,jdbcType=BIT} ,SPECIAL_PROMPT = #{specialPrompt,jdbcType=VARCHAR} ,SHARE_DESCRIPTION = #{shareDescription,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=INTEGER}
     * @param entity entity
     * @return Long
     */
    public Long update(ShechemEsCouponDetailDO entity){
        return shechemEsCouponDetailDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:SHECHEM_ES_COUPON_DETAIL.<br/>
     * descSql =  DELETE FROM SHECHEM_ES_COUPON_DETAIL WHERE ID = #{id,jdbcType=INTEGER}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Integer id){
        return shechemEsCouponDetailDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:SHECHEM_ES_COUPON_DETAIL.<br/>
     * descSql =  SELECT * FROM SHECHEM_ES_COUPON_DETAIL WHERE ID = #{id,jdbcType=INTEGER}
     * @param id id
     * @return ShechemEsCouponDetailDO
     */
    public ShechemEsCouponDetailDO getByPrimary(Integer id){
        return shechemEsCouponDetailDOMapper.getByPrimary(id);
    }
}
