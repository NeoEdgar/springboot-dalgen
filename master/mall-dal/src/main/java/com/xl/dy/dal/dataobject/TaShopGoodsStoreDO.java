package com.xl.dy.dal.dataobject;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The table TA_SHOP_GOODS_STORE
 */
public class TaShopGoodsStoreDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * skuId SKUID（FK）.
     */
    private Long skuId;
    /**
     * store 库存.
     */
    private BigDecimal store;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * shopId 店铺ID.
     */
    private Long shopId;
    /**
     * goodsId 商品ID.
     */
    private Long goodsId;
    /**
     * saleType 商品售卖类型（DIC）.
     */
    private String saleType;
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
     * shopGoodsId 店铺商品信息ID.
     */
    private Long shopGoodsId;
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
     * Set skuId SKUID（FK）.
     */
    public void setSkuId(Long skuId){
        this.skuId = skuId;
    }

    /**
     * Get skuId SKUID（FK）.
     *
     * @return the string
     */
    public Long getSkuId(){
        return skuId;
    }

    /**
     * Set store 库存.
     */
    public void setStore(BigDecimal store){
        this.store = store;
    }

    /**
     * Get store 库存.
     *
     * @return the string
     */
    public BigDecimal getStore(){
        return store;
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
     * Set goodsId 商品ID.
     */
    public void setGoodsId(Long goodsId){
        this.goodsId = goodsId;
    }

    /**
     * Get goodsId 商品ID.
     *
     * @return the string
     */
    public Long getGoodsId(){
        return goodsId;
    }

    /**
     * Set saleType 商品售卖类型（DIC）.
     */
    public void setSaleType(String saleType){
        this.saleType = saleType;
    }

    /**
     * Get saleType 商品售卖类型（DIC）.
     *
     * @return the string
     */
    public String getSaleType(){
        return saleType;
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
     * Set shopGoodsId 店铺商品信息ID.
     */
    public void setShopGoodsId(Long shopGoodsId){
        this.shopGoodsId = shopGoodsId;
    }

    /**
     * Get shopGoodsId 店铺商品信息ID.
     *
     * @return the string
     */
    public Long getShopGoodsId(){
        return shopGoodsId;
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
