package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import java.util.Map;

/**
 * The table TA_ORDER TA_ORDER
 */
public class QueryshopCouponOrderPage extends BasePage<Map>{

    /**
     * couponUserId 用户优惠券ID.
     */
    private Long couponUserId;

    /**
     * Set couponUserId 用户优惠券ID.
     */
    public void setCouponUserId(Long couponUserId){
        this.couponUserId = couponUserId;
    }

    /**
     * Get couponUserId 用户优惠券ID.
     *
     * @return the string
     */
    public Long getCouponUserId(){
        return couponUserId;
    }
}
