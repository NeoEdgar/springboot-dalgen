package com.xl.dy.dal.dataobject;

import java.util.Date;
import java.math.BigDecimal;

/**
 * The table TG_DOS_MERCH
 */
public class TgDosMerchDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * mallId 单位-商场ID（FK）.
     */
    private Long mallId;
    /**
     * remark REMARK.
     */
    private String remark;
    /**
     * shopId 单位-店铺ID(FK).
     */
    private Long shopId;
    /**
     * dosDate 统计日期.
     */
    private Date dosDate;
    /**
     * mallName 单位-商场名称.
     */
    private String mallName;
    /**
     * salesAmt 当日销售额.
     */
    private BigDecimal salesAmt;
    /**
     * shopName 单位-店铺名称.
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
     * companyId 单位-专业公司ID（FK）.
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
     * companyName 单位-专业公司名称（FK）.
     */
    private String companyName;
    /**
     * salesVolume 当日商品销量.
     */
    private BigDecimal salesVolume;
    /**
     * orderQuantity 当日订单量.
     */
    private Integer orderQuantity;
    /**
     * maximumTurnover 单日最高成交额.
     */
    private BigDecimal maximumTurnover;
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
     * Set mallId 单位-商场ID（FK）.
     */
    public void setMallId(Long mallId){
        this.mallId = mallId;
    }

    /**
     * Get mallId 单位-商场ID（FK）.
     *
     * @return the string
     */
    public Long getMallId(){
        return mallId;
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
     * Set shopId 单位-店铺ID(FK).
     */
    public void setShopId(Long shopId){
        this.shopId = shopId;
    }

    /**
     * Get shopId 单位-店铺ID(FK).
     *
     * @return the string
     */
    public Long getShopId(){
        return shopId;
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
     * Set mallName 单位-商场名称.
     */
    public void setMallName(String mallName){
        this.mallName = mallName;
    }

    /**
     * Get mallName 单位-商场名称.
     *
     * @return the string
     */
    public String getMallName(){
        return mallName;
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
     * Set shopName 单位-店铺名称.
     */
    public void setShopName(String shopName){
        this.shopName = shopName;
    }

    /**
     * Get shopName 单位-店铺名称.
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
     * Set companyId 单位-专业公司ID（FK）.
     */
    public void setCompanyId(Long companyId){
        this.companyId = companyId;
    }

    /**
     * Get companyId 单位-专业公司ID（FK）.
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
     * Set companyName 单位-专业公司名称（FK）.
     */
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    /**
     * Get companyName 单位-专业公司名称（FK）.
     *
     * @return the string
     */
    public String getCompanyName(){
        return companyName;
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
     * Set maximumTurnover 单日最高成交额.
     */
    public void setMaximumTurnover(BigDecimal maximumTurnover){
        this.maximumTurnover = maximumTurnover;
    }

    /**
     * Get maximumTurnover 单日最高成交额.
     *
     * @return the string
     */
    public BigDecimal getMaximumTurnover(){
        return maximumTurnover;
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
