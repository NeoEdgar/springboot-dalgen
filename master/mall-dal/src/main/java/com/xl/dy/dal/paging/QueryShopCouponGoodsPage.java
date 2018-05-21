package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import java.util.Map;

/**
 * The table TA_SHOP_GOODS TA_SHOP_GOODS
 */
public class QueryShopCouponGoodsPage extends BasePage<Map>{

    /**
     * shopId 店铺ID（FK）.
     */
    private Long shopId;
    /**
     * couponId .
     */
    private Long couponId;

    /**
     * Set shopId 店铺ID（FK）.
     */
    public void setShopId(Long shopId){
        this.shopId = shopId;
    }

    /**
     * Get shopId 店铺ID（FK）.
     *
     * @return the string
     */
    public Long getShopId(){
        return shopId;
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
