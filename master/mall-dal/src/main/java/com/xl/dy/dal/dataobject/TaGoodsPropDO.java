package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_GOODS_PROP
 */
public class TaGoodsPropDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * skuId SKU_ID（FK）.
     */
    private Long skuId;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * goodsId 商品ID（FK）.
     */
    private Long goodsId;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
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
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * goodsPropName 经营属性名称.
     */
    private String goodsPropName;
    /**
     * goodsPropTypeId 商品属性类型ID（FK）.
     */
    private Long goodsPropTypeId;
    /**
     * goodsPropTypeName 商品属性类型名称（快照）.
     */
    private String goodsPropTypeName;

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
     * Set skuId SKU_ID（FK）.
     */
    public void setSkuId(Long skuId){
        this.skuId = skuId;
    }

    /**
     * Get skuId SKU_ID（FK）.
     *
     * @return the string
     */
    public Long getSkuId(){
        return skuId;
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
     * Set goodsPropName 经营属性名称.
     */
    public void setGoodsPropName(String goodsPropName){
        this.goodsPropName = goodsPropName;
    }

    /**
     * Get goodsPropName 经营属性名称.
     *
     * @return the string
     */
    public String getGoodsPropName(){
        return goodsPropName;
    }

    /**
     * Set goodsPropTypeId 商品属性类型ID（FK）.
     */
    public void setGoodsPropTypeId(Long goodsPropTypeId){
        this.goodsPropTypeId = goodsPropTypeId;
    }

    /**
     * Get goodsPropTypeId 商品属性类型ID（FK）.
     *
     * @return the string
     */
    public Long getGoodsPropTypeId(){
        return goodsPropTypeId;
    }

    /**
     * Set goodsPropTypeName 商品属性类型名称（快照）.
     */
    public void setGoodsPropTypeName(String goodsPropTypeName){
        this.goodsPropTypeName = goodsPropTypeName;
    }

    /**
     * Get goodsPropTypeName 商品属性类型名称（快照）.
     *
     * @return the string
     */
    public String getGoodsPropTypeName(){
        return goodsPropTypeName;
    }
}
