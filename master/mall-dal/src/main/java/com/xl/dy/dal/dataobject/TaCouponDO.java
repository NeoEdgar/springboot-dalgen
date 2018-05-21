package com.xl.dy.dal.dataobject;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The table TA_COUPON
 */
public class TaCouponDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * name 优惠卷名称.
     */
    private String name;
    /**
     * notice 报名须知.
     */
    private String notice;
    /**
     * preDay 到期前提醒天数.
     */
    private Integer preDay;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * parValue 票面价值.
     */
    private BigDecimal parValue;
    /**
     * quantity 发放总量.
     */
    private Integer quantity;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * isLimited 是否有使用金额限制.
     */
    private Integer isLimited;
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
     * effectTime 用户使用生效时间.
     */
    private Date effectTime;
    /**
     * expiryTime 用户使用过期时间.
     */
    private Date expiryTime;
    /**
     * platformId 发布平台ID.
     */
    private Long platformId;
    /**
     * categorySet 参加类目.
     */
    private String categorySet;
    /**
     * receiveTime 可领取时间.
     */
    private Date receiveTime;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * couponStatus 优惠卷状态（DIC）.
     */
    private String couponStatus;
    /**
     * discountForm 折扣形式.
     */
    private String discountForm;
    /**
     * discountRate 折扣值.
     */
    private BigDecimal discountRate;
    /**
     * instructions 使用说明.
     */
    private String instructions;
    /**
     * isOverlapUse 是否重叠使用(否则仅原价时使用).
     */
    private Integer isOverlapUse;
    /**
     * platformType 发布平台类型.
     */
    private String platformType;
    /**
     * limitedAmount 限制金额.
     */
    private BigDecimal limitedAmount;
    /**
     * memberLevelSet 参与会员等级限制.
     */
    private String memberLevelSet;
    /**
     * perReceiveLimit 每人限领张数.
     */
    private Integer perReceiveLimit;
    /**
     * isExpirationRemind 是否到期提醒.
     */
    private Integer isExpirationRemind;

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
     * Set name 优惠卷名称.
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Get name 优惠卷名称.
     *
     * @return the string
     */
    public String getName(){
        return name;
    }

    /**
     * Set notice 报名须知.
     */
    public void setNotice(String notice){
        this.notice = notice;
    }

    /**
     * Get notice 报名须知.
     *
     * @return the string
     */
    public String getNotice(){
        return notice;
    }

    /**
     * Set preDay 到期前提醒天数.
     */
    public void setPreDay(Integer preDay){
        this.preDay = preDay;
    }

    /**
     * Get preDay 到期前提醒天数.
     *
     * @return the string
     */
    public Integer getPreDay(){
        return preDay;
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
     * Set parValue 票面价值.
     */
    public void setParValue(BigDecimal parValue){
        this.parValue = parValue;
    }

    /**
     * Get parValue 票面价值.
     *
     * @return the string
     */
    public BigDecimal getParValue(){
        return parValue;
    }

    /**
     * Set quantity 发放总量.
     */
    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

    /**
     * Get quantity 发放总量.
     *
     * @return the string
     */
    public Integer getQuantity(){
        return quantity;
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
     * Set isLimited 是否有使用金额限制.
     */
    public void setIsLimited(Integer isLimited){
        this.isLimited = isLimited;
    }

    /**
     * Get isLimited 是否有使用金额限制.
     *
     * @return the string
     */
    public Integer getIsLimited(){
        return isLimited;
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
     * Set effectTime 用户使用生效时间.
     */
    public void setEffectTime(Date effectTime){
        this.effectTime = effectTime;
    }

    /**
     * Get effectTime 用户使用生效时间.
     *
     * @return the string
     */
    public Date getEffectTime(){
        return effectTime;
    }

    /**
     * Set expiryTime 用户使用过期时间.
     */
    public void setExpiryTime(Date expiryTime){
        this.expiryTime = expiryTime;
    }

    /**
     * Get expiryTime 用户使用过期时间.
     *
     * @return the string
     */
    public Date getExpiryTime(){
        return expiryTime;
    }

    /**
     * Set platformId 发布平台ID.
     */
    public void setPlatformId(Long platformId){
        this.platformId = platformId;
    }

    /**
     * Get platformId 发布平台ID.
     *
     * @return the string
     */
    public Long getPlatformId(){
        return platformId;
    }

    /**
     * Set categorySet 参加类目.
     */
    public void setCategorySet(String categorySet){
        this.categorySet = categorySet;
    }

    /**
     * Get categorySet 参加类目.
     *
     * @return the string
     */
    public String getCategorySet(){
        return categorySet;
    }

    /**
     * Set receiveTime 可领取时间.
     */
    public void setReceiveTime(Date receiveTime){
        this.receiveTime = receiveTime;
    }

    /**
     * Get receiveTime 可领取时间.
     *
     * @return the string
     */
    public Date getReceiveTime(){
        return receiveTime;
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
     * Set couponStatus 优惠卷状态（DIC）.
     */
    public void setCouponStatus(String couponStatus){
        this.couponStatus = couponStatus;
    }

    /**
     * Get couponStatus 优惠卷状态（DIC）.
     *
     * @return the string
     */
    public String getCouponStatus(){
        return couponStatus;
    }

    /**
     * Set discountForm 折扣形式.
     */
    public void setDiscountForm(String discountForm){
        this.discountForm = discountForm;
    }

    /**
     * Get discountForm 折扣形式.
     *
     * @return the string
     */
    public String getDiscountForm(){
        return discountForm;
    }

    /**
     * Set discountRate 折扣值.
     */
    public void setDiscountRate(BigDecimal discountRate){
        this.discountRate = discountRate;
    }

    /**
     * Get discountRate 折扣值.
     *
     * @return the string
     */
    public BigDecimal getDiscountRate(){
        return discountRate;
    }

    /**
     * Set instructions 使用说明.
     */
    public void setInstructions(String instructions){
        this.instructions = instructions;
    }

    /**
     * Get instructions 使用说明.
     *
     * @return the string
     */
    public String getInstructions(){
        return instructions;
    }

    /**
     * Set isOverlapUse 是否重叠使用(否则仅原价时使用).
     */
    public void setIsOverlapUse(Integer isOverlapUse){
        this.isOverlapUse = isOverlapUse;
    }

    /**
     * Get isOverlapUse 是否重叠使用(否则仅原价时使用).
     *
     * @return the string
     */
    public Integer getIsOverlapUse(){
        return isOverlapUse;
    }

    /**
     * Set platformType 发布平台类型.
     */
    public void setPlatformType(String platformType){
        this.platformType = platformType;
    }

    /**
     * Get platformType 发布平台类型.
     *
     * @return the string
     */
    public String getPlatformType(){
        return platformType;
    }

    /**
     * Set limitedAmount 限制金额.
     */
    public void setLimitedAmount(BigDecimal limitedAmount){
        this.limitedAmount = limitedAmount;
    }

    /**
     * Get limitedAmount 限制金额.
     *
     * @return the string
     */
    public BigDecimal getLimitedAmount(){
        return limitedAmount;
    }

    /**
     * Set memberLevelSet 参与会员等级限制.
     */
    public void setMemberLevelSet(String memberLevelSet){
        this.memberLevelSet = memberLevelSet;
    }

    /**
     * Get memberLevelSet 参与会员等级限制.
     *
     * @return the string
     */
    public String getMemberLevelSet(){
        return memberLevelSet;
    }

    /**
     * Set perReceiveLimit 每人限领张数.
     */
    public void setPerReceiveLimit(Integer perReceiveLimit){
        this.perReceiveLimit = perReceiveLimit;
    }

    /**
     * Get perReceiveLimit 每人限领张数.
     *
     * @return the string
     */
    public Integer getPerReceiveLimit(){
        return perReceiveLimit;
    }

    /**
     * Set isExpirationRemind 是否到期提醒.
     */
    public void setIsExpirationRemind(Integer isExpirationRemind){
        this.isExpirationRemind = isExpirationRemind;
    }

    /**
     * Get isExpirationRemind 是否到期提醒.
     *
     * @return the string
     */
    public Integer getIsExpirationRemind(){
        return isExpirationRemind;
    }
}
