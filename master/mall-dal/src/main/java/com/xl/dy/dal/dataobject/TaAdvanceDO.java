package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_ADVANCE
 */
public class TaAdvanceDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * name 预售活动名称.
     */
    private String name;
    /**
     * notice 报名须知.
     */
    private String notice;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * endTime 活动结束时间.
     */
    private Date endTime;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * startTime 活动开始时间.
     */
    private Date startTime;
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
     * categorySet 参加类目.
     */
    private String categorySet;
    /**
     * perBuyLimit 每人限购数量.
     */
    private Integer perBuyLimit;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * advanceStatus 预售活动状态（DIC）.
     */
    private String advanceStatus;
    /**
     * perRegisteLimit 限报.
     */
    private Integer perRegisteLimit;

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
     * Set name 预售活动名称.
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Get name 预售活动名称.
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
     * Set endTime 活动结束时间.
     */
    public void setEndTime(Date endTime){
        this.endTime = endTime;
    }

    /**
     * Get endTime 活动结束时间.
     *
     * @return the string
     */
    public Date getEndTime(){
        return endTime;
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
     * Set startTime 活动开始时间.
     */
    public void setStartTime(Date startTime){
        this.startTime = startTime;
    }

    /**
     * Get startTime 活动开始时间.
     *
     * @return the string
     */
    public Date getStartTime(){
        return startTime;
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
     * Set perBuyLimit 每人限购数量.
     */
    public void setPerBuyLimit(Integer perBuyLimit){
        this.perBuyLimit = perBuyLimit;
    }

    /**
     * Get perBuyLimit 每人限购数量.
     *
     * @return the string
     */
    public Integer getPerBuyLimit(){
        return perBuyLimit;
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
     * Set advanceStatus 预售活动状态（DIC）.
     */
    public void setAdvanceStatus(String advanceStatus){
        this.advanceStatus = advanceStatus;
    }

    /**
     * Get advanceStatus 预售活动状态（DIC）.
     *
     * @return the string
     */
    public String getAdvanceStatus(){
        return advanceStatus;
    }

    /**
     * Set perRegisteLimit 限报.
     */
    public void setPerRegisteLimit(Integer perRegisteLimit){
        this.perRegisteLimit = perRegisteLimit;
    }

    /**
     * Get perRegisteLimit 限报.
     *
     * @return the string
     */
    public Integer getPerRegisteLimit(){
        return perRegisteLimit;
    }
}
