package com.xl.dy.dal.dataobject;

import java.util.Date;
import java.math.BigDecimal;

/**
 * The table TG_DOS_MERCH_GOODS_DET
 */
public class TgDosMerchGoodsDetDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * dosId ID.
     */
    private Long dosId;
    /**
     * skuId 商品SKU_ID(FK).
     */
    private Long skuId;
    /**
     * remark REMARK.
     */
    private String remark;
    /**
     * dosDate 统计日期.
     */
    private Date dosDate;
    /**
     * goodsId 商品ID.
     */
    private Long goodsId;
    /**
     * salesAmt 当日销售额.
     */
    private BigDecimal salesAmt;
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
     * categoryId 商品一级类目ID.
     */
    private String categoryId;
    /**
     * createEmpl 公共-创建人.
     */
    private Long createEmpl;
    /**
     * createTime 公共-创建时间.
     */
    private Date createTime;
    /**
     * salesVolume 当日商品销量.
     */
    private BigDecimal salesVolume;
    /**
     * categoryName 商品一级类目名称(后台一级类目).
     */
    private String categoryName;
    /**
     * orderQuantity 当日订单量.
     */
    private Integer orderQuantity;
    /**
     * purchaseUsersNumber 当日购买用户数量.
     */
    private Integer purchaseUsersNumber;
    /**
     * refundOrderQuantity 当日退单量.
     */
    private Integer refundOrderQuantity;

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
     * Set dosId ID.
     */
    public void setDosId(Long dosId){
        this.dosId = dosId;
    }

    /**
     * Get dosId ID.
     *
     * @return the string
     */
    public Long getDosId(){
        return dosId;
    }

    /**
     * Set skuId 商品SKU_ID(FK).
     */
    public void setSkuId(Long skuId){
        this.skuId = skuId;
    }

    /**
     * Get skuId 商品SKU_ID(FK).
     *
     * @return the string
     */
    public Long getSkuId(){
        return skuId;
    }

    /**
     * Set remark REMARK.
     */
    public void setRemark(String remark){
        this.remark = remark;
    }

    /**
     * Get remark REMARK.
     *
     * @return the string
     */
    public String getRemark(){
        return remark;
    }

    /**
     * Set dosDate 统计日期.
     */
    public void setDosDate(Date dosDate){
        this.dosDate = dosDate;
    }

    /**
     * Get dosDate 统计日期.
     *
     * @return the string
     */
    public Date getDosDate(){
        return dosDate;
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
     * Set salesAmt 当日销售额.
     */
    public void setSalesAmt(BigDecimal salesAmt){
        this.salesAmt = salesAmt;
    }

    /**
     * Get salesAmt 当日销售额.
     *
     * @return the string
     */
    public BigDecimal getSalesAmt(){
        return salesAmt;
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
     * Set categoryId 商品一级类目ID.
     */
    public void setCategoryId(String categoryId){
        this.categoryId = categoryId;
    }

    /**
     * Get categoryId 商品一级类目ID.
     *
     * @return the string
     */
    public String getCategoryId(){
        return categoryId;
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
     * Set salesVolume 当日商品销量.
     */
    public void setSalesVolume(BigDecimal salesVolume){
        this.salesVolume = salesVolume;
    }

    /**
     * Get salesVolume 当日商品销量.
     *
     * @return the string
     */
    public BigDecimal getSalesVolume(){
        return salesVolume;
    }

    /**
     * Set categoryName 商品一级类目名称(后台一级类目).
     */
    public void setCategoryName(String categoryName){
        this.categoryName = categoryName;
    }

    /**
     * Get categoryName 商品一级类目名称(后台一级类目).
     *
     * @return the string
     */
    public String getCategoryName(){
        return categoryName;
    }

    /**
     * Set orderQuantity 当日订单量.
     */
    public void setOrderQuantity(Integer orderQuantity){
        this.orderQuantity = orderQuantity;
    }

    /**
     * Get orderQuantity 当日订单量.
     *
     * @return the string
     */
    public Integer getOrderQuantity(){
        return orderQuantity;
    }

    /**
     * Set purchaseUsersNumber 当日购买用户数量.
     */
    public void setPurchaseUsersNumber(Integer purchaseUsersNumber){
        this.purchaseUsersNumber = purchaseUsersNumber;
    }

    /**
     * Get purchaseUsersNumber 当日购买用户数量.
     *
     * @return the string
     */
    public Integer getPurchaseUsersNumber(){
        return purchaseUsersNumber;
    }

    /**
     * Set refundOrderQuantity 当日退单量.
     */
    public void setRefundOrderQuantity(Integer refundOrderQuantity){
        this.refundOrderQuantity = refundOrderQuantity;
    }

    /**
     * Get refundOrderQuantity 当日退单量.
     *
     * @return the string
     */
    public Integer getRefundOrderQuantity(){
        return refundOrderQuantity;
    }
}
