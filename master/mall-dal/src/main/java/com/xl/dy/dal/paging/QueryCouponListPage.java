package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import java.util.Map;

/**
 * The table TA_COUPON TA_COUPON
 */
public class QueryCouponListPage extends BasePage<Map>{

    /**
     * condition .
     */
    private String condition;
    /**
     * couponStatus 优惠卷状态（DIC）.
     */
    private String couponStatus;
    /**
     * platformType 发布平台类型.
     */
    private String platformType;
    /**
     * platformId 发布平台ID.
     */
    private Long platformId;

    /**
     * Set condition .
     */
    public void setCondition(String condition){
        this.condition = condition;
    }

    /**
     * Get condition .
     *
     * @return the string
     */
    public String getCondition(){
        return condition;
    }

    /**
     * Set couponStatus 优惠卷状态（DIC）.
     */
    public void setCouponStatus(String couponStatus){
        this.couponStatus = couponStatus;
    }

    /**
     * Get couponStatus 优惠卷状态（DIC）.
     *
     * @return the string
     */
    public String getCouponStatus(){
        return couponStatus;
    }

    /**
     * Set platformType 发布平台类型.
     */
    public void setPlatformType(String platformType){
        this.platformType = platformType;
    }

    /**
     * Get platformType 发布平台类型.
     *
     * @return the string
     */
    public String getPlatformType(){
        return platformType;
    }

    /**
     * Set platformId 发布平台ID.
     */
    public void setPlatformId(Long platformId){
        this.platformId = platformId;
    }

    /**
     * Get platformId 发布平台ID.
     *
     * @return the string
     */
    public Long getPlatformId(){
        return platformId;
    }
}
