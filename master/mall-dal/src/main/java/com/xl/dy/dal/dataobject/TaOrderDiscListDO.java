package com.xl.dy.dal.dataobject;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The table TA_ORDER_DISC_LIST
 */
public class TaOrderDiscListDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * amt 优惠抵值.
     */
    private BigDecimal amt;
    /**
     * faceAmt 优惠面值.
     */
    private BigDecimal faceAmt;
    /**
     * orderId 订单ID(FK).
     */
    private Long orderId;
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
     * couponUserId 用户优惠券ID(FK).
     */
    private Long couponUserId;

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
     * Set amt 优惠抵值.
     */
    public void setAmt(BigDecimal amt){
        this.amt = amt;
    }

    /**
     * Get amt 优惠抵值.
     *
     * @return the string
     */
    public BigDecimal getAmt(){
        return amt;
    }

    /**
     * Set faceAmt 优惠面值.
     */
    public void setFaceAmt(BigDecimal faceAmt){
        this.faceAmt = faceAmt;
    }

    /**
     * Get faceAmt 优惠面值.
     *
     * @return the string
     */
    public BigDecimal getFaceAmt(){
        return faceAmt;
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
     * Set couponUserId 用户优惠券ID(FK).
     */
    public void setCouponUserId(Long couponUserId){
        this.couponUserId = couponUserId;
    }

    /**
     * Get couponUserId 用户优惠券ID(FK).
     *
     * @return the string
     */
    public Long getCouponUserId(){
        return couponUserId;
    }
}
