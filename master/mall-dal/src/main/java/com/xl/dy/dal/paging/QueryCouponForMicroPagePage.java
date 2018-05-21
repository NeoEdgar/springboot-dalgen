package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import java.util.Map;

/**
 * The table TA_COUPON TA_COUPON
 */
public class QueryCouponForMicroPagePage extends BasePage<Map>{

    /**
     * couponName .
     */
    private String couponName;
    /**
     * couponId .
     */
    private Long couponId;

    /**
     * Set couponName .
     */
    public void setCouponName(String couponName){
        this.couponName = couponName;
    }

    /**
     * Get couponName .
     *
     * @return the string
     */
    public String getCouponName(){
        return couponName;
    }

    /**
     * Set couponId .
     */
    public void setCouponId(Long couponId){
        this.couponId = couponId;
    }

    /**
     * Get couponId .
     *
     * @return the string
     */
    public Long getCouponId(){
        return couponId;
    }
}
