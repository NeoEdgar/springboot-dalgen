package com.xl.dy.dal.paging;

import java.util.Map;

/**
 * The table TA_COUPON_REVIEW TA_COUPON_REVIEW
 */
public class QueryCouponReviewListPage extends BasePage<Map>{

    private String sortColumn;
    private String sortType;
    /**
     * mallName .
     */
    private String mallName;

    public String getSortColumn() {
        return sortColumn;
    }

    public void setSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
    }

    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    /**

     * companyName .
     */
    private String companyName;
    /**
     * shopName .
     */
    private String shopName;
    /**
     * shopGoodsName .
     */
    private String shopGoodsName;
    /**
     * couponId 优惠卷ID（FK）.
     */
    private Long couponId;
    /**
     * couponReviewStatus 优惠卷审核状态.
     */
    private String couponReviewStatus;

    /**
     * Set mallName .
     */
    public void setMallName(String mallName){
        this.mallName = mallName;
    }

    /**
     * Get mallName .
     *
     * @return the string
     */
    public String getMallName(){
        return mallName;
    }

    /**
     * Set companyName .
     */
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    /**
     * Get companyName .
     *
     * @return the string
     */
    public String getCompanyName(){
        return companyName;
    }

    /**
     * Set shopName .
     */
    public void setShopName(String shopName){
        this.shopName = shopName;
    }

    /**
     * Get shopName .
     *
     * @return the string
     */
    public String getShopName(){
        return shopName;
    }

    /**
     * Set shopGoodsName .
     */
    public void setShopGoodsName(String shopGoodsName){
        this.shopGoodsName = shopGoodsName;
    }

    /**
     * Get shopGoodsName .
     *
     * @return the string
     */
    public String getShopGoodsName(){
        return shopGoodsName;
    }

    /**
     * Set couponId 优惠卷ID（FK）.
     */
    public void setCouponId(Long couponId){
        this.couponId = couponId;
    }

    /**
     * Get couponId 优惠卷ID（FK）.
     *
     * @return the string
     */
    public Long getCouponId(){
        return couponId;
    }

    /**
     * Set couponReviewStatus 优惠卷审核状态.
     */
    public void setCouponReviewStatus(String couponReviewStatus){
        this.couponReviewStatus = couponReviewStatus;
    }

    /**
     * Get couponReviewStatus 优惠卷审核状态.
     *
     * @return the string
     */
    public String getCouponReviewStatus(){
        return couponReviewStatus;
    }
}
