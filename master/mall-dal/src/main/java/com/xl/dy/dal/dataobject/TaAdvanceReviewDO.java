package com.xl.dy.dal.dataobject;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The table TA_ADVANCE_REVIEW
 */
public class TaAdvanceReviewDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * inx 顺序.
     */
    private Integer inx;
    /**
     * sales 销量.
     */
    private BigDecimal sales;
    /**
     * skuId 店铺商品ID（FK）.
     */
    private Long skuId;
    /**
     * reason 未通过理由.
     */
    private String reason;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * shopId 店铺ID（FK）.
     */
    private Long shopId;
    /**
     * deposit 定金.
     */
    private BigDecimal deposit;
    /**
     * discount 折扣.
     */
    private BigDecimal discount;
    /**
     * advanceId 预售活动ID（FK）.
     */
    private Long advanceId;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * retainage 尾款.
     */
    private BigDecimal retainage;
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
     * depositEndTime 定金结束时间.
     */
    private Date depositEndTime;
    /**
     * activeInventory 活动库存.
     */
    private BigDecimal activeInventory;
    /**
     * depositStartTime 定金开始时间.
     */
    private Date depositStartTime;
    /**
     * retainageEndTime 尾款结束时间.
     */
    private Date retainageEndTime;
    /**
     * isRetainageChginv 是否开启尾款变价.
     */
    private Integer isRetainageChginv;
    /**
     * retainageStartTime 尾款开始时间.
     */
    private Date retainageStartTime;
    /**
     * advanceReviewStatus 预售活动审核状态（DIC）.
     */
    private String advanceReviewStatus;

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
     * Set inx 顺序.
     */
    public void setInx(Integer inx){
        this.inx = inx;
    }

    /**
     * Get inx 顺序.
     *
     * @return the string
     */
    public Integer getInx(){
        return inx;
    }

    /**
     * Set sales 销量.
     */
    public void setSales(BigDecimal sales){
        this.sales = sales;
    }

    /**
     * Get sales 销量.
     *
     * @return the string
     */
    public BigDecimal getSales(){
        return sales;
    }

    /**
     * Set skuId 店铺商品ID（FK）.
     */
    public void setSkuId(Long skuId){
        this.skuId = skuId;
    }

    /**
     * Get skuId 店铺商品ID（FK）.
     *
     * @return the string
     */
    public Long getSkuId(){
        return skuId;
    }

    /**
     * Set reason 未通过理由.
     */
    public void setReason(String reason){
        this.reason = reason;
    }

    /**
     * Get reason 未通过理由.
     *
     * @return the string
     */
    public String getReason(){
        return reason;
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
     * Set shopId 店铺ID（FK）.
     */
    public void setShopId(Long shopId){
        this.shopId = shopId;
    }

    /**
     * Get shopId 店铺ID（FK）.
     *
     * @return the string
     */
    public Long getShopId(){
        return shopId;
    }

    /**
     * Set deposit 定金.
     */
    public void setDeposit(BigDecimal deposit){
        this.deposit = deposit;
    }

    /**
     * Get deposit 定金.
     *
     * @return the string
     */
    public BigDecimal getDeposit(){
        return deposit;
    }

    /**
     * Set discount 折扣.
     */
    public void setDiscount(BigDecimal discount){
        this.discount = discount;
    }

    /**
     * Get discount 折扣.
     *
     * @return the string
     */
    public BigDecimal getDiscount(){
        return discount;
    }

    /**
     * Set advanceId 预售活动ID（FK）.
     */
    public void setAdvanceId(Long advanceId){
        this.advanceId = advanceId;
    }

    /**
     * Get advanceId 预售活动ID（FK）.
     *
     * @return the string
     */
    public Long getAdvanceId(){
        return advanceId;
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
     * Set retainage 尾款.
     */
    public void setRetainage(BigDecimal retainage){
        this.retainage = retainage;
    }

    /**
     * Get retainage 尾款.
     *
     * @return the string
     */
    public BigDecimal getRetainage(){
        return retainage;
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
     * Set depositEndTime 定金结束时间.
     */
    public void setDepositEndTime(Date depositEndTime){
        this.depositEndTime = depositEndTime;
    }

    /**
     * Get depositEndTime 定金结束时间.
     *
     * @return the string
     */
    public Date getDepositEndTime(){
        return depositEndTime;
    }

    /**
     * Set activeInventory 活动库存.
     */
    public void setActiveInventory(BigDecimal activeInventory){
        this.activeInventory = activeInventory;
    }

    /**
     * Get activeInventory 活动库存.
     *
     * @return the string
     */
    public BigDecimal getActiveInventory(){
        return activeInventory;
    }

    /**
     * Set depositStartTime 定金开始时间.
     */
    public void setDepositStartTime(Date depositStartTime){
        this.depositStartTime = depositStartTime;
    }

    /**
     * Get depositStartTime 定金开始时间.
     *
     * @return the string
     */
    public Date getDepositStartTime(){
        return depositStartTime;
    }

    /**
     * Set retainageEndTime 尾款结束时间.
     */
    public void setRetainageEndTime(Date retainageEndTime){
        this.retainageEndTime = retainageEndTime;
    }

    /**
     * Get retainageEndTime 尾款结束时间.
     *
     * @return the string
     */
    public Date getRetainageEndTime(){
        return retainageEndTime;
    }

    /**
     * Set isRetainageChginv 是否开启尾款变价.
     */
    public void setIsRetainageChginv(Integer isRetainageChginv){
        this.isRetainageChginv = isRetainageChginv;
    }

    /**
     * Get isRetainageChginv 是否开启尾款变价.
     *
     * @return the string
     */
    public Integer getIsRetainageChginv(){
        return isRetainageChginv;
    }

    /**
     * Set retainageStartTime 尾款开始时间.
     */
    public void setRetainageStartTime(Date retainageStartTime){
        this.retainageStartTime = retainageStartTime;
    }

    /**
     * Get retainageStartTime 尾款开始时间.
     *
     * @return the string
     */
    public Date getRetainageStartTime(){
        return retainageStartTime;
    }

    /**
     * Set advanceReviewStatus 预售活动审核状态（DIC）.
     */
    public void setAdvanceReviewStatus(String advanceReviewStatus){
        this.advanceReviewStatus = advanceReviewStatus;
    }

    /**
     * Get advanceReviewStatus 预售活动审核状态（DIC）.
     *
     * @return the string
     */
    public String getAdvanceReviewStatus(){
        return advanceReviewStatus;
    }
}
