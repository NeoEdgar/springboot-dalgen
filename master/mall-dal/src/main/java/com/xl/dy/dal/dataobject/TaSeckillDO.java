package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_SECKILL
 */
public class TaSeckillDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * inx 顺序.
     */
    private Integer inx;
    /**
     * name 优惠卷名称.
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
     * categorySet 参加类目.
     */
    private String categorySet;
    /**
     * perBuyLimit 限买.
     */
    private Integer perBuyLimit;
    /**
     * putawayTime 上架时间.
     */
    private Date putawayTime;
    /**
     * soldoutTime 下架时间.
     */
    private Date soldoutTime;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * seckillStatus 秒杀活动状态（DIC）.
     */
    private String seckillStatus;
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
     * Set perBuyLimit 限买.
     */
    public void setPerBuyLimit(Integer perBuyLimit){
        this.perBuyLimit = perBuyLimit;
    }

    /**
     * Get perBuyLimit 限买.
     *
     * @return the string
     */
    public Integer getPerBuyLimit(){
        return perBuyLimit;
    }

    /**
     * Set putawayTime 上架时间.
     */
    public void setPutawayTime(Date putawayTime){
        this.putawayTime = putawayTime;
    }

    /**
     * Get putawayTime 上架时间.
     *
     * @return the string
     */
    public Date getPutawayTime(){
        return putawayTime;
    }

    /**
     * Set soldoutTime 下架时间.
     */
    public void setSoldoutTime(Date soldoutTime){
        this.soldoutTime = soldoutTime;
    }

    /**
     * Get soldoutTime 下架时间.
     *
     * @return the string
     */
    public Date getSoldoutTime(){
        return soldoutTime;
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
     * Set seckillStatus 秒杀活动状态（DIC）.
     */
    public void setSeckillStatus(String seckillStatus){
        this.seckillStatus = seckillStatus;
    }

    /**
     * Get seckillStatus 秒杀活动状态（DIC）.
     *
     * @return the string
     */
    public String getSeckillStatus(){
        return seckillStatus;
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
