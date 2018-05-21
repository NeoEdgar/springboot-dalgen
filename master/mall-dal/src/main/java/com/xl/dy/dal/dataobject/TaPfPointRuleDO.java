package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_PF_POINT_RULE
 */
public class TaPfPointRuleDO{

    /**
     * id F_ID.
     */
    private Long id;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * maEndTime 按活动时间段-结束时间.
     */
    private Date maEndTime;
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
     * maPointRule 活动积分比例（相当于积分倍数）.
     */
    private Integer maPointRule;
    /**
     * maStartTime 按活动时间段-开始时间.
     */
    private Date maStartTime;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * monthFixedDay 每月固定日期.
     */
    private Integer monthFixedDay;
    /**
     * pointRuleType 平台积分规则类型（DIC）.
     */
    private String pointRuleType;

    /**
     * Set id F_ID.
     */
    public void setId(Long id){
        this.id = id;
    }

    /**
     * Get id F_ID.
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
     * Set maEndTime 按活动时间段-结束时间.
     */
    public void setMaEndTime(Date maEndTime){
        this.maEndTime = maEndTime;
    }

    /**
     * Get maEndTime 按活动时间段-结束时间.
     *
     * @return the string
     */
    public Date getMaEndTime(){
        return maEndTime;
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
     * Set maPointRule 活动积分比例（相当于积分倍数）.
     */
    public void setMaPointRule(Integer maPointRule){
        this.maPointRule = maPointRule;
    }

    /**
     * Get maPointRule 活动积分比例（相当于积分倍数）.
     *
     * @return the string
     */
    public Integer getMaPointRule(){
        return maPointRule;
    }

    /**
     * Set maStartTime 按活动时间段-开始时间.
     */
    public void setMaStartTime(Date maStartTime){
        this.maStartTime = maStartTime;
    }

    /**
     * Get maStartTime 按活动时间段-开始时间.
     *
     * @return the string
     */
    public Date getMaStartTime(){
        return maStartTime;
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
     * Set monthFixedDay 每月固定日期.
     */
    public void setMonthFixedDay(Integer monthFixedDay){
        this.monthFixedDay = monthFixedDay;
    }

    /**
     * Get monthFixedDay 每月固定日期.
     *
     * @return the string
     */
    public Integer getMonthFixedDay(){
        return monthFixedDay;
    }

    /**
     * Set pointRuleType 平台积分规则类型（DIC）.
     */
    public void setPointRuleType(String pointRuleType){
        this.pointRuleType = pointRuleType;
    }

    /**
     * Get pointRuleType 平台积分规则类型（DIC）.
     *
     * @return the string
     */
    public String getPointRuleType(){
        return pointRuleType;
    }
}
