package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_ADVERTISEMENT
 */
public class TaAdvertisementDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * inx 顺序.
     */
    private Integer inx;
    /**
     * mallId 商场ID（FK）.
     */
    private Long mallId;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * linkUrl 链接.
     */
    private String linkUrl;
    /**
     * htmlData HTML文本.
     */
    private String htmlData;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * isDisplay 是否展示.
     */
    private Integer isDisplay;
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
     * advertiseName 广告位名称.
     */
    private String advertiseName;
    /**
     * advertiseType 广告位类型（DIC）.
     */
    private String advertiseType;

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
     * Set mallId 商场ID（FK）.
     */
    public void setMallId(Long mallId){
        this.mallId = mallId;
    }

    /**
     * Get mallId 商场ID（FK）.
     *
     * @return the string
     */
    public Long getMallId(){
        return mallId;
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
     * Set linkUrl 链接.
     */
    public void setLinkUrl(String linkUrl){
        this.linkUrl = linkUrl;
    }

    /**
     * Get linkUrl 链接.
     *
     * @return the string
     */
    public String getLinkUrl(){
        return linkUrl;
    }

    /**
     * Set htmlData HTML文本.
     */
    public void setHtmlData(String htmlData){
        this.htmlData = htmlData;
    }

    /**
     * Get htmlData HTML文本.
     *
     * @return the string
     */
    public String getHtmlData(){
        return htmlData;
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
     * Set isDisplay 是否展示.
     */
    public void setIsDisplay(Integer isDisplay){
        this.isDisplay = isDisplay;
    }

    /**
     * Get isDisplay 是否展示.
     *
     * @return the string
     */
    public Integer getIsDisplay(){
        return isDisplay;
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
     * Set advertiseName 广告位名称.
     */
    public void setAdvertiseName(String advertiseName){
        this.advertiseName = advertiseName;
    }

    /**
     * Get advertiseName 广告位名称.
     *
     * @return the string
     */
    public String getAdvertiseName(){
        return advertiseName;
    }

    /**
     * Set advertiseType 广告位类型（DIC）.
     */
    public void setAdvertiseType(String advertiseType){
        this.advertiseType = advertiseType;
    }

    /**
     * Get advertiseType 广告位类型（DIC）.
     *
     * @return the string
     */
    public String getAdvertiseType(){
        return advertiseType;
    }
}
