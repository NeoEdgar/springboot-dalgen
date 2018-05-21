package com.xl.dy.dal.dataobject;


/**
 * The table SHECHEM_ES_COUPON_DETAIL
 */
public class ShechemEsCouponDetailDO{

    /**
     * id 主键ID.
     */
    private Integer id;
    /**
     * mid MID.
     */
    private String mid;
    /**
     * status 是否显示 .0否 1是.
     */
    private Boolean status;
    /**
     * display 启用状态   0：未启用  1：已启用.
     */
    private Boolean display;
    /**
     * saleImg 优惠券售卖图片.
     */
    private String saleImg;
    /**
     * couponId 关联SHECHEM_ES_COUPON表ID.
     */
    private Integer couponId;
    /**
     * isRefund 是否可以随时退  1：是  2：否.
     */
    private Boolean isRefund;
    /**
     * outletId 门店ID    多个时逗号分隔.
     */
    private String outletId;
    /**
     * showCity 	显示的地区编码.
     */
    private String showCity;
    /**
     * limitSale 每人限购数量（-1为不限）.
     */
    private Integer limitSale;
    /**
     * salePrice 优惠券出售价格.
     */
    private Integer salePrice;
    /**
     * shareThumb 优惠券分享图片.
     */
    private String shareThumb;
    /**
     * shareTitle 优惠券分享名称.
     */
    private String shareTitle;
    /**
     * volumePlus 虚拟销量.
     */
    private Integer volumePlus;
    /**
     * saleContent 优惠券售卖介绍.
     */
    private String saleContent;
    /**
     * shelvesBtime 上架时间.
     */
    private Integer shelvesBtime;
    /**
     * shelvesEtime 下架时间.
     */
    private Integer shelvesEtime;
    /**
     * consumePrompt 消费提示的字段（图文）.
     */
    private String consumePrompt;
    /**
     * couponContent 套餐内容字段（图文，券的内容）.
     */
    private String couponContent;
    /**
     * isAppointment 是否免预约   1：否  2：是.
     */
    private Boolean isAppointment;
    /**
     * specialPrompt 特殊提示:（文字，说明是否节假日等通用30个字以内）	.
     */
    private String specialPrompt;
    /**
     * shareDescription 优惠券分享内容.
     */
    private String shareDescription;

    /**
     * Set id 主键ID.
     */
    public void setId(Integer id){
        this.id = id;
    }

    /**
     * Get id 主键ID.
     *
     * @return the string
     */
    public Integer getId(){
        return id;
    }

    /**
     * Set mid MID.
     */
    public void setMid(String mid){
        this.mid = mid;
    }

    /**
     * Get mid MID.
     *
     * @return the string
     */
    public String getMid(){
        return mid;
    }

    /**
     * Set status 是否显示 .0否 1是.
     */
    public void setStatus(Boolean status){
        this.status = status;
    }

    /**
     * Get status 是否显示 .0否 1是.
     *
     * @return the string
     */
    public Boolean getStatus(){
        return status;
    }

    /**
     * Set display 启用状态   0：未启用  1：已启用.
     */
    public void setDisplay(Boolean display){
        this.display = display;
    }

    /**
     * Get display 启用状态   0：未启用  1：已启用.
     *
     * @return the string
     */
    public Boolean getDisplay(){
        return display;
    }

    /**
     * Set saleImg 优惠券售卖图片.
     */
    public void setSaleImg(String saleImg){
        this.saleImg = saleImg;
    }

    /**
     * Get saleImg 优惠券售卖图片.
     *
     * @return the string
     */
    public String getSaleImg(){
        return saleImg;
    }

    /**
     * Set couponId 关联SHECHEM_ES_COUPON表ID.
     */
    public void setCouponId(Integer couponId){
        this.couponId = couponId;
    }

    /**
     * Get couponId 关联SHECHEM_ES_COUPON表ID.
     *
     * @return the string
     */
    public Integer getCouponId(){
        return couponId;
    }

    /**
     * Set isRefund 是否可以随时退  1：是  2：否.
     */
    public void setIsRefund(Boolean isRefund){
        this.isRefund = isRefund;
    }

    /**
     * Get isRefund 是否可以随时退  1：是  2：否.
     *
     * @return the string
     */
    public Boolean getIsRefund(){
        return isRefund;
    }

    /**
     * Set outletId 门店ID    多个时逗号分隔.
     */
    public void setOutletId(String outletId){
        this.outletId = outletId;
    }

    /**
     * Get outletId 门店ID    多个时逗号分隔.
     *
     * @return the string
     */
    public String getOutletId(){
        return outletId;
    }

    /**
     * Set showCity 	显示的地区编码.
     */
    public void setShowCity(String showCity){
        this.showCity = showCity;
    }

    /**
     * Get showCity 	显示的地区编码.
     *
     * @return the string
     */
    public String getShowCity(){
        return showCity;
    }

    /**
     * Set limitSale 每人限购数量（-1为不限）.
     */
    public void setLimitSale(Integer limitSale){
        this.limitSale = limitSale;
    }

    /**
     * Get limitSale 每人限购数量（-1为不限）.
     *
     * @return the string
     */
    public Integer getLimitSale(){
        return limitSale;
    }

    /**
     * Set salePrice 优惠券出售价格.
     */
    public void setSalePrice(Integer salePrice){
        this.salePrice = salePrice;
    }

    /**
     * Get salePrice 优惠券出售价格.
     *
     * @return the string
     */
    public Integer getSalePrice(){
        return salePrice;
    }

    /**
     * Set shareThumb 优惠券分享图片.
     */
    public void setShareThumb(String shareThumb){
        this.shareThumb = shareThumb;
    }

    /**
     * Get shareThumb 优惠券分享图片.
     *
     * @return the string
     */
    public String getShareThumb(){
        return shareThumb;
    }

    /**
     * Set shareTitle 优惠券分享名称.
     */
    public void setShareTitle(String shareTitle){
        this.shareTitle = shareTitle;
    }

    /**
     * Get shareTitle 优惠券分享名称.
     *
     * @return the string
     */
    public String getShareTitle(){
        return shareTitle;
    }

    /**
     * Set volumePlus 虚拟销量.
     */
    public void setVolumePlus(Integer volumePlus){
        this.volumePlus = volumePlus;
    }

    /**
     * Get volumePlus 虚拟销量.
     *
     * @return the string
     */
    public Integer getVolumePlus(){
        return volumePlus;
    }

    /**
     * Set saleContent 优惠券售卖介绍.
     */
    public void setSaleContent(String saleContent){
        this.saleContent = saleContent;
    }

    /**
     * Get saleContent 优惠券售卖介绍.
     *
     * @return the string
     */
    public String getSaleContent(){
        return saleContent;
    }

    /**
     * Set shelvesBtime 上架时间.
     */
    public void setShelvesBtime(Integer shelvesBtime){
        this.shelvesBtime = shelvesBtime;
    }

    /**
     * Get shelvesBtime 上架时间.
     *
     * @return the string
     */
    public Integer getShelvesBtime(){
        return shelvesBtime;
    }

    /**
     * Set shelvesEtime 下架时间.
     */
    public void setShelvesEtime(Integer shelvesEtime){
        this.shelvesEtime = shelvesEtime;
    }

    /**
     * Get shelvesEtime 下架时间.
     *
     * @return the string
     */
    public Integer getShelvesEtime(){
        return shelvesEtime;
    }

    /**
     * Set consumePrompt 消费提示的字段（图文）.
     */
    public void setConsumePrompt(String consumePrompt){
        this.consumePrompt = consumePrompt;
    }

    /**
     * Get consumePrompt 消费提示的字段（图文）.
     *
     * @return the string
     */
    public String getConsumePrompt(){
        return consumePrompt;
    }

    /**
     * Set couponContent 套餐内容字段（图文，券的内容）.
     */
    public void setCouponContent(String couponContent){
        this.couponContent = couponContent;
    }

    /**
     * Get couponContent 套餐内容字段（图文，券的内容）.
     *
     * @return the string
     */
    public String getCouponContent(){
        return couponContent;
    }

    /**
     * Set isAppointment 是否免预约   1：否  2：是.
     */
    public void setIsAppointment(Boolean isAppointment){
        this.isAppointment = isAppointment;
    }

    /**
     * Get isAppointment 是否免预约   1：否  2：是.
     *
     * @return the string
     */
    public Boolean getIsAppointment(){
        return isAppointment;
    }

    /**
     * Set specialPrompt 特殊提示:（文字，说明是否节假日等通用30个字以内）	.
     */
    public void setSpecialPrompt(String specialPrompt){
        this.specialPrompt = specialPrompt;
    }

    /**
     * Get specialPrompt 特殊提示:（文字，说明是否节假日等通用30个字以内）	.
     *
     * @return the string
     */
    public String getSpecialPrompt(){
        return specialPrompt;
    }

    /**
     * Set shareDescription 优惠券分享内容.
     */
    public void setShareDescription(String shareDescription){
        this.shareDescription = shareDescription;
    }

    /**
     * Get shareDescription 优惠券分享内容.
     *
     * @return the string
     */
    public String getShareDescription(){
        return shareDescription;
    }
}
