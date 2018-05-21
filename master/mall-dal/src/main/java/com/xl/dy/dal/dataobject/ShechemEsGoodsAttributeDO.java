package com.xl.dy.dal.dataobject;


/**
 * The table SHECHEM_ES_GOODS_ATTRIBUTE
 */
public class ShechemEsGoodsAttributeDO{

    /**
     * id ID.
     */
    private Integer id;
    /**
     * mid MID.
     */
    private String mid;
    /**
     * uid UID.
     */
    private Integer uid;
    /**
     * status STATUS.
     */
    private Boolean status;
    /**
     * display DISPLAY.
     */
    private Boolean display;
    /**
     * goodsId GOODS_ID.
     */
    private Integer goodsId;
    /**
     * inputtime INPUTTIME.
     */
    private Integer inputtime;
    /**
     * updatetime UPDATETIME.
     */
    private Integer updatetime;
    /**
     * attributeId ATTRIBUTE_ID.
     */
    private Integer attributeId;
    /**
     * attributeText 属性文字.
     */
    private String attributeText;
    /**
     * attributeType 属性类型 0唯一  1可选.
     */
    private Boolean attributeType;
    /**
     * attributePrice ATTRIBUTE_PRICE.
     */
    private Integer attributePrice;
    /**
     * attributeThumb 属性图片.
     */
    private String attributeThumb;
    /**
     * attributePackagePrice 组合商品时的价格.
     */
    private Integer attributePackagePrice;

    /**
     * Set id ID.
     */
    public void setId(Integer id){
        this.id = id;
    }

    /**
     * Get id ID.
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
     * Set uid UID.
     */
    public void setUid(Integer uid){
        this.uid = uid;
    }

    /**
     * Get uid UID.
     *
     * @return the string
     */
    public Integer getUid(){
        return uid;
    }

    /**
     * Set status STATUS.
     */
    public void setStatus(Boolean status){
        this.status = status;
    }

    /**
     * Get status STATUS.
     *
     * @return the string
     */
    public Boolean getStatus(){
        return status;
    }

    /**
     * Set display DISPLAY.
     */
    public void setDisplay(Boolean display){
        this.display = display;
    }

    /**
     * Get display DISPLAY.
     *
     * @return the string
     */
    public Boolean getDisplay(){
        return display;
    }

    /**
     * Set goodsId GOODS_ID.
     */
    public void setGoodsId(Integer goodsId){
        this.goodsId = goodsId;
    }

    /**
     * Get goodsId GOODS_ID.
     *
     * @return the string
     */
    public Integer getGoodsId(){
        return goodsId;
    }

    /**
     * Set inputtime INPUTTIME.
     */
    public void setInputtime(Integer inputtime){
        this.inputtime = inputtime;
    }

    /**
     * Get inputtime INPUTTIME.
     *
     * @return the string
     */
    public Integer getInputtime(){
        return inputtime;
    }

    /**
     * Set updatetime UPDATETIME.
     */
    public void setUpdatetime(Integer updatetime){
        this.updatetime = updatetime;
    }

    /**
     * Get updatetime UPDATETIME.
     *
     * @return the string
     */
    public Integer getUpdatetime(){
        return updatetime;
    }

    /**
     * Set attributeId ATTRIBUTE_ID.
     */
    public void setAttributeId(Integer attributeId){
        this.attributeId = attributeId;
    }

    /**
     * Get attributeId ATTRIBUTE_ID.
     *
     * @return the string
     */
    public Integer getAttributeId(){
        return attributeId;
    }

    /**
     * Set attributeText 属性文字.
     */
    public void setAttributeText(String attributeText){
        this.attributeText = attributeText;
    }

    /**
     * Get attributeText 属性文字.
     *
     * @return the string
     */
    public String getAttributeText(){
        return attributeText;
    }

    /**
     * Set attributeType 属性类型 0唯一  1可选.
     */
    public void setAttributeType(Boolean attributeType){
        this.attributeType = attributeType;
    }

    /**
     * Get attributeType 属性类型 0唯一  1可选.
     *
     * @return the string
     */
    public Boolean getAttributeType(){
        return attributeType;
    }

    /**
     * Set attributePrice ATTRIBUTE_PRICE.
     */
    public void setAttributePrice(Integer attributePrice){
        this.attributePrice = attributePrice;
    }

    /**
     * Get attributePrice ATTRIBUTE_PRICE.
     *
     * @return the string
     */
    public Integer getAttributePrice(){
        return attributePrice;
    }

    /**
     * Set attributeThumb 属性图片.
     */
    public void setAttributeThumb(String attributeThumb){
        this.attributeThumb = attributeThumb;
    }

    /**
     * Get attributeThumb 属性图片.
     *
     * @return the string
     */
    public String getAttributeThumb(){
        return attributeThumb;
    }

    /**
     * Set attributePackagePrice 组合商品时的价格.
     */
    public void setAttributePackagePrice(Integer attributePackagePrice){
        this.attributePackagePrice = attributePackagePrice;
    }

    /**
     * Get attributePackagePrice 组合商品时的价格.
     *
     * @return the string
     */
    public Integer getAttributePackagePrice(){
        return attributePackagePrice;
    }
}
