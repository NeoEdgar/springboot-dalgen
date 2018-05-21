package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_ORDER_EVALUATE
 */
public class TaOrderEvaluateDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * star 评分星级.
     */
    private Integer star;
    /**
     * skuId 商品-SKU_ID（FK）.
     */
    private Long skuId;
    /**
     * vipId 会员ID.
     */
    private Long vipId;
    /**
     * images 评价图片.
     */
    private String images;
    /**
     * mallId 商场ID.
     */
    private Long mallId;
    /**
     * shopId 店铺ID.
     */
    private Long shopId;
    /**
     * vipTxt 会员评价内容.
     */
    private String vipTxt;
    /**
     * goodsId 商品-商品ID（FK）.
     */
    private Long goodsId;
    /**
     * isImage 是否有图片.
     */
    private Integer isImage;
    /**
     * orderId 订单ID(FK).
     */
    private Long orderId;
    /**
     * shopTxt 店铺回复内容.
     */
    private String shopTxt;
    /**
     * shopEmpl 店铺回复人ID.
     */
    private Long shopEmpl;
    /**
     * shopName 店铺名字.
     */
    private String shopName;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * companyId 专业公司ID.
     */
    private Long companyId;
    /**
     * timestamp 公共-时间戳.
     */
    private Long timestamp;
    /**
     * createEmpl 公共-创建人.
     */
    private Long createEmpl;
    /**
     * createTime 公共-创建时间.
     */
    private Date createTime;
    /**
     * isResponse 店铺是否回复.
     */
    private Integer isResponse;
    /**
     * orderDeptId 订单明细ID.
     */
    private Long orderDeptId;
    /**
     * evaluateTime 会员评价时间.
     */
    private Date evaluateTime;
    /**
     * responseTime 回复时间.
     */
    private Date responseTime;
    /**
     * shopEmplName 店铺回复人名字.
     */
    private String shopEmplName;

    /**
     * Set id ID.
     */
    public void setId(Long id){
        this.id = id;
    }

    /**
     * Get id ID.
     *
     * @return the string
     */
    public Long getId(){
        return id;
    }

    /**
     * Set star 评分星级.
     */
    public void setStar(Integer star){
        this.star = star;
    }

    /**
     * Get star 评分星级.
     *
     * @return the string
     */
    public Integer getStar(){
        return star;
    }

    /**
     * Set skuId 商品-SKU_ID（FK）.
     */
    public void setSkuId(Long skuId){
        this.skuId = skuId;
    }

    /**
     * Get skuId 商品-SKU_ID（FK）.
     *
     * @return the string
     */
    public Long getSkuId(){
        return skuId;
    }

    /**
     * Set vipId 会员ID.
     */
    public void setVipId(Long vipId){
        this.vipId = vipId;
    }

    /**
     * Get vipId 会员ID.
     *
     * @return the string
     */
    public Long getVipId(){
        return vipId;
    }

    /**
     * Set images 评价图片.
     */
    public void setImages(String images){
        this.images = images;
    }

    /**
     * Get images 评价图片.
     *
     * @return the string
     */
    public String getImages(){
        return images;
    }

    /**
     * Set mallId 商场ID.
     */
    public void setMallId(Long mallId){
        this.mallId = mallId;
    }

    /**
     * Get mallId 商场ID.
     *
     * @return the string
     */
    public Long getMallId(){
        return mallId;
    }

    /**
     * Set shopId 店铺ID.
     */
    public void setShopId(Long shopId){
        this.shopId = shopId;
    }

    /**
     * Get shopId 店铺ID.
     *
     * @return the string
     */
    public Long getShopId(){
        return shopId;
    }

    /**
     * Set vipTxt 会员评价内容.
     */
    public void setVipTxt(String vipTxt){
        this.vipTxt = vipTxt;
    }

    /**
     * Get vipTxt 会员评价内容.
     *
     * @return the string
     */
    public String getVipTxt(){
        return vipTxt;
    }

    /**
     * Set goodsId 商品-商品ID（FK）.
     */
    public void setGoodsId(Long goodsId){
        this.goodsId = goodsId;
    }

    /**
     * Get goodsId 商品-商品ID（FK）.
     *
     * @return the string
     */
    public Long getGoodsId(){
        return goodsId;
    }

    /**
     * Set isImage 是否有图片.
     */
    public void setIsImage(Integer isImage){
        this.isImage = isImage;
    }

    /**
     * Get isImage 是否有图片.
     *
     * @return the string
     */
    public Integer getIsImage(){
        return isImage;
    }

    /**
     * Set orderId 订单ID(FK).
     */
    public void setOrderId(Long orderId){
        this.orderId = orderId;
    }

    /**
     * Get orderId 订单ID(FK).
     *
     * @return the string
     */
    public Long getOrderId(){
        return orderId;
    }

    /**
     * Set shopTxt 店铺回复内容.
     */
    public void setShopTxt(String shopTxt){
        this.shopTxt = shopTxt;
    }

    /**
     * Get shopTxt 店铺回复内容.
     *
     * @return the string
     */
    public String getShopTxt(){
        return shopTxt;
    }

    /**
     * Set shopEmpl 店铺回复人ID.
     */
    public void setShopEmpl(Long shopEmpl){
        this.shopEmpl = shopEmpl;
    }

    /**
     * Get shopEmpl 店铺回复人ID.
     *
     * @return the string
     */
    public Long getShopEmpl(){
        return shopEmpl;
    }

    /**
     * Set shopName 店铺名字.
     */
    public void setShopName(String shopName){
        this.shopName = shopName;
    }

    /**
     * Get shopName 店铺名字.
     *
     * @return the string
     */
    public String getShopName(){
        return shopName;
    }

    /**
     * Set alterEmpl 公共-修改人.
     */
    public void setAlterEmpl(Long alterEmpl){
        this.alterEmpl = alterEmpl;
    }

    /**
     * Get alterEmpl 公共-修改人.
     *
     * @return the string
     */
    public Long getAlterEmpl(){
        return alterEmpl;
    }

    /**
     * Set alterTime 公共-修改时间.
     */
    public void setAlterTime(Date alterTime){
        this.alterTime = alterTime;
    }

    /**
     * Get alterTime 公共-修改时间.
     *
     * @return the string
     */
    public Date getAlterTime(){
        return alterTime;
    }

    /**
     * Set companyId 专业公司ID.
     */
    public void setCompanyId(Long companyId){
        this.companyId = companyId;
    }

    /**
     * Get companyId 专业公司ID.
     *
     * @return the string
     */
    public Long getCompanyId(){
        return companyId;
    }

    /**
     * Set timestamp 公共-时间戳.
     */
    public void setTimestamp(Long timestamp){
        this.timestamp = timestamp;
    }

    /**
     * Get timestamp 公共-时间戳.
     *
     * @return the string
     */
    public Long getTimestamp(){
        return timestamp;
    }

    /**
     * Set createEmpl 公共-创建人.
     */
    public void setCreateEmpl(Long createEmpl){
        this.createEmpl = createEmpl;
    }

    /**
     * Get createEmpl 公共-创建人.
     *
     * @return the string
     */
    public Long getCreateEmpl(){
        return createEmpl;
    }

    /**
     * Set createTime 公共-创建时间.
     */
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }

    /**
     * Get createTime 公共-创建时间.
     *
     * @return the string
     */
    public Date getCreateTime(){
        return createTime;
    }

    /**
     * Set isResponse 店铺是否回复.
     */
    public void setIsResponse(Integer isResponse){
        this.isResponse = isResponse;
    }

    /**
     * Get isResponse 店铺是否回复.
     *
     * @return the string
     */
    public Integer getIsResponse(){
        return isResponse;
    }

    /**
     * Set orderDeptId 订单明细ID.
     */
    public void setOrderDeptId(Long orderDeptId){
        this.orderDeptId = orderDeptId;
    }

    /**
     * Get orderDeptId 订单明细ID.
     *
     * @return the string
     */
    public Long getOrderDeptId(){
        return orderDeptId;
    }

    /**
     * Set evaluateTime 会员评价时间.
     */
    public void setEvaluateTime(Date evaluateTime){
        this.evaluateTime = evaluateTime;
    }

    /**
     * Get evaluateTime 会员评价时间.
     *
     * @return the string
     */
    public Date getEvaluateTime(){
        return evaluateTime;
    }

    /**
     * Set responseTime 回复时间.
     */
    public void setResponseTime(Date responseTime){
        this.responseTime = responseTime;
    }

    /**
     * Get responseTime 回复时间.
     *
     * @return the string
     */
    public Date getResponseTime(){
        return responseTime;
    }

    /**
     * Set shopEmplName 店铺回复人名字.
     */
    public void setShopEmplName(String shopEmplName){
        this.shopEmplName = shopEmplName;
    }

    /**
     * Get shopEmplName 店铺回复人名字.
     *
     * @return the string
     */
    public String getShopEmplName(){
        return shopEmplName;
    }
}
