package com.xl.dy.dal.dataobject;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The table TA_GOODS_ES_INDEX
 */
public class TaGoodsEsIndexDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * esId ES_ID.
     */
    private String esId;
    /**
     * price 最低价格.
     */
    private BigDecimal price;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * shopId 店铺ID.
     */
    private String shopId;
    /**
     * goodsId 商品ID（FK）.
     */
    private String goodsId;
    /**
     * shopName 店铺名称.
     */
    private String shopName;
    /**
     * alterEmpl 公共-修改人.
     */
    private String alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * shopScore 店铺评分.
     */
    private BigDecimal shopScore;
    /**
     * timestamp 公共-时间戳.
     */
    private String timestamp;
    /**
     * categoryId 商品全类目ID.
     */
    private String categoryId;
    /**
     * createEmpl 创建人.
     */
    private String createEmpl;
    /**
     * createTime 公共-创建时间.
     */
    private Date createTime;
    /**
     * isHaveStore 是否有货.
     */
    private Integer isHaveStore;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * categoryName 商品全类目名称.
     */
    private String categoryName;
    /**
     * isFamilyOnly 是否家庭会员专享.
     */
    private Integer isFamilyOnly;
    /**
     * payManCounts 付款人数.
     */
    private String payManCounts;
    /**
     * shopPhotoUrl 店铺商品个性主图.
     */
    private String shopPhotoUrl;
    /**
     * shopGoodsName 店铺商品个性名称.
     */
    private String shopGoodsName;
    /**
     * isMarketingActivities 是否在活动中.
     */
    private Integer isMarketingActivities;
    /**
     * marketingActivitiesList 活动名称列表.
     */
    private String marketingActivitiesList;

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
     * Set esId ES_ID.
     */
    public void setEsId(String esId){
        this.esId = esId;
    }

    /**
     * Get esId ES_ID.
     *
     * @return the string
     */
    public String getEsId(){
        return esId;
    }

    /**
     * Set price 最低价格.
     */
    public void setPrice(BigDecimal price){
        this.price = price;
    }

    /**
     * Get price 最低价格.
     *
     * @return the string
     */
    public BigDecimal getPrice(){
        return price;
    }

    /**
     * Set remark 公共-备注.
     */
    public void setRemark(String remark){
        this.remark = remark;
    }

    /**
     * Get remark 公共-备注.
     *
     * @return the string
     */
    public String getRemark(){
        return remark;
    }

    /**
     * Set shopId 店铺ID.
     */
    public void setShopId(String shopId){
        this.shopId = shopId;
    }

    /**
     * Get shopId 店铺ID.
     *
     * @return the string
     */
    public String getShopId(){
        return shopId;
    }

    /**
     * Set goodsId 商品ID（FK）.
     */
    public void setGoodsId(String goodsId){
        this.goodsId = goodsId;
    }

    /**
     * Get goodsId 商品ID（FK）.
     *
     * @return the string
     */
    public String getGoodsId(){
        return goodsId;
    }

    /**
     * Set shopName 店铺名称.
     */
    public void setShopName(String shopName){
        this.shopName = shopName;
    }

    /**
     * Get shopName 店铺名称.
     *
     * @return the string
     */
    public String getShopName(){
        return shopName;
    }

    /**
     * Set alterEmpl 公共-修改人.
     */
    public void setAlterEmpl(String alterEmpl){
        this.alterEmpl = alterEmpl;
    }

    /**
     * Get alterEmpl 公共-修改人.
     *
     * @return the string
     */
    public String getAlterEmpl(){
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
     * Set shopScore 店铺评分.
     */
    public void setShopScore(BigDecimal shopScore){
        this.shopScore = shopScore;
    }

    /**
     * Get shopScore 店铺评分.
     *
     * @return the string
     */
    public BigDecimal getShopScore(){
        return shopScore;
    }

    /**
     * Set timestamp 公共-时间戳.
     */
    public void setTimestamp(String timestamp){
        this.timestamp = timestamp;
    }

    /**
     * Get timestamp 公共-时间戳.
     *
     * @return the string
     */
    public String getTimestamp(){
        return timestamp;
    }

    /**
     * Set categoryId 商品全类目ID.
     */
    public void setCategoryId(String categoryId){
        this.categoryId = categoryId;
    }

    /**
     * Get categoryId 商品全类目ID.
     *
     * @return the string
     */
    public String getCategoryId(){
        return categoryId;
    }

    /**
     * Set createEmpl 创建人.
     */
    public void setCreateEmpl(String createEmpl){
        this.createEmpl = createEmpl;
    }

    /**
     * Get createEmpl 创建人.
     *
     * @return the string
     */
    public String getCreateEmpl(){
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
     * Set isHaveStore 是否有货.
     */
    public void setIsHaveStore(Integer isHaveStore){
        this.isHaveStore = isHaveStore;
    }

    /**
     * Get isHaveStore 是否有货.
     *
     * @return the string
     */
    public Integer getIsHaveStore(){
        return isHaveStore;
    }

    /**
     * Set validStatus 公共-有效性状态.
     */
    public void setValidStatus(Integer validStatus){
        this.validStatus = validStatus;
    }

    /**
     * Get validStatus 公共-有效性状态.
     *
     * @return the string
     */
    public Integer getValidStatus(){
        return validStatus;
    }

    /**
     * Set categoryName 商品全类目名称.
     */
    public void setCategoryName(String categoryName){
        this.categoryName = categoryName;
    }

    /**
     * Get categoryName 商品全类目名称.
     *
     * @return the string
     */
    public String getCategoryName(){
        return categoryName;
    }

    /**
     * Set isFamilyOnly 是否家庭会员专享.
     */
    public void setIsFamilyOnly(Integer isFamilyOnly){
        this.isFamilyOnly = isFamilyOnly;
    }

    /**
     * Get isFamilyOnly 是否家庭会员专享.
     *
     * @return the string
     */
    public Integer getIsFamilyOnly(){
        return isFamilyOnly;
    }

    /**
     * Set payManCounts 付款人数.
     */
    public void setPayManCounts(String payManCounts){
        this.payManCounts = payManCounts;
    }

    /**
     * Get payManCounts 付款人数.
     *
     * @return the string
     */
    public String getPayManCounts(){
        return payManCounts;
    }

    /**
     * Set shopPhotoUrl 店铺商品个性主图.
     */
    public void setShopPhotoUrl(String shopPhotoUrl){
        this.shopPhotoUrl = shopPhotoUrl;
    }

    /**
     * Get shopPhotoUrl 店铺商品个性主图.
     *
     * @return the string
     */
    public String getShopPhotoUrl(){
        return shopPhotoUrl;
    }

    /**
     * Set shopGoodsName 店铺商品个性名称.
     */
    public void setShopGoodsName(String shopGoodsName){
        this.shopGoodsName = shopGoodsName;
    }

    /**
     * Get shopGoodsName 店铺商品个性名称.
     *
     * @return the string
     */
    public String getShopGoodsName(){
        return shopGoodsName;
    }

    /**
     * Set isMarketingActivities 是否在活动中.
     */
    public void setIsMarketingActivities(Integer isMarketingActivities){
        this.isMarketingActivities = isMarketingActivities;
    }

    /**
     * Get isMarketingActivities 是否在活动中.
     *
     * @return the string
     */
    public Integer getIsMarketingActivities(){
        return isMarketingActivities;
    }

    /**
     * Set marketingActivitiesList 活动名称列表.
     */
    public void setMarketingActivitiesList(String marketingActivitiesList){
        this.marketingActivitiesList = marketingActivitiesList;
    }

    /**
     * Get marketingActivitiesList 活动名称列表.
     *
     * @return the string
     */
    public String getMarketingActivitiesList(){
        return marketingActivitiesList;
    }
}
