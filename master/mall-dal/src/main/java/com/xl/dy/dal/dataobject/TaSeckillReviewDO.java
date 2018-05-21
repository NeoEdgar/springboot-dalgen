package com.xl.dy.dal.dataobject;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The table TA_SECKILL_REVIEW
 */
public class TaSeckillReviewDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * inx 顺序.
     */
    private Integer inx;
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
     * discount 折扣.
     */
    private BigDecimal discount;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * seckillId 优惠卷ID（FK）.
     */
    private Long seckillId;
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
     * shopGoodsId 店铺商品ID（FK）.
     */
    private Long shopGoodsId;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * seckillPrice 秒杀价格.
     */
    private BigDecimal seckillPrice;
    /**
     * activeInventory 活动库存.
     */
    private BigDecimal activeInventory;
    /**
     * seckillReviewStatus 优惠卷审核状态.
     */
    private String seckillReviewStatus;

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
     * Set seckillId 优惠卷ID（FK）.
     */
    public void setSeckillId(Long seckillId){
        this.seckillId = seckillId;
    }

    /**
     * Get seckillId 优惠卷ID（FK）.
     *
     * @return the string
     */
    public Long getSeckillId(){
        return seckillId;
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
     * Set shopGoodsId 店铺商品ID（FK）.
     */
    public void setShopGoodsId(Long shopGoodsId){
        this.shopGoodsId = shopGoodsId;
    }

    /**
     * Get shopGoodsId 店铺商品ID（FK）.
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

    /**
     * Set seckillPrice 秒杀价格.
     */
    public void setSeckillPrice(BigDecimal seckillPrice){
        this.seckillPrice = seckillPrice;
    }

    /**
     * Get seckillPrice 秒杀价格.
     *
     * @return the string
     */
    public BigDecimal getSeckillPrice(){
        return seckillPrice;
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
     * Set seckillReviewStatus 优惠卷审核状态.
     */
    public void setSeckillReviewStatus(String seckillReviewStatus){
        this.seckillReviewStatus = seckillReviewStatus;
    }

    /**
     * Get seckillReviewStatus 优惠卷审核状态.
     *
     * @return the string
     */
    public String getSeckillReviewStatus(){
        return seckillReviewStatus;
    }
}
