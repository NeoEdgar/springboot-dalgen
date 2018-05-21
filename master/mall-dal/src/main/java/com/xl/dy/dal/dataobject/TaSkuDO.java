package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_SKU
 */
public class TaSkuDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * brandId 品牌ID（快照）（FK）.
     */
    private Long brandId;
    /**
     * goodsId 商品ID（FK）.
     */
    private Long goodsId;
    /**
     * skuTitle SKU标题名称.
     */
    private String skuTitle;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * goodsCode 商品编号（快照）.
     */
    private String goodsCode;
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
     * skuPropJson SKU属性信息（JSON）.
     */
    private String skuPropJson;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;

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
     * Set brandId 品牌ID（快照）（FK）.
     */
    public void setBrandId(Long brandId){
        this.brandId = brandId;
    }

    /**
     * Get brandId 品牌ID（快照）（FK）.
     *
     * @return the string
     */
    public Long getBrandId(){
        return brandId;
    }

    /**
     * Set goodsId 商品ID（FK）.
     */
    public void setGoodsId(Long goodsId){
        this.goodsId = goodsId;
    }

    /**
     * Get goodsId 商品ID（FK）.
     *
     * @return the string
     */
    public Long getGoodsId(){
        return goodsId;
    }

    /**
     * Set skuTitle SKU标题名称.
     */
    public void setSkuTitle(String skuTitle){
        this.skuTitle = skuTitle;
    }

    /**
     * Get skuTitle SKU标题名称.
     *
     * @return the string
     */
    public String getSkuTitle(){
        return skuTitle;
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
     * Set goodsCode 商品编号（快照）.
     */
    public void setGoodsCode(String goodsCode){
        this.goodsCode = goodsCode;
    }

    /**
     * Get goodsCode 商品编号（快照）.
     *
     * @return the string
     */
    public String getGoodsCode(){
        return goodsCode;
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
     * Set skuPropJson SKU属性信息（JSON）.
     */
    public void setSkuPropJson(String skuPropJson){
        this.skuPropJson = skuPropJson;
    }

    /**
     * Get skuPropJson SKU属性信息（JSON）.
     *
     * @return the string
     */
    public String getSkuPropJson(){
        return skuPropJson;
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
}
