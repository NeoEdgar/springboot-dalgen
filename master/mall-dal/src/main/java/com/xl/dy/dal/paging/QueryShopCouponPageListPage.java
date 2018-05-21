package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import java.util.Map;

/**
 * The table TA_COUPON TA_COUPON
 */
public class QueryShopCouponPageListPage extends BasePage<Map>{
    private String sortColumn;
    public String getSortColumn() {
        return sortColumn;
    }

    public void setSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
    }

    private String sortType;
    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    /**
     * platformType 发布平台类型.
     */
    private String platformType;
    /**
     * couponStatus 优惠卷状态（DIC）.
     */
    private String couponStatus;
    /**
     * shopId .
     */
    private Long shopId;

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
     * Set shopId .
     */
    public void setShopId(Long shopId){
        this.shopId = shopId;
    }

    /**
     * Get shopId .
     *
     * @return the string
     */
    public Long getShopId(){
        return shopId;
    }
}
