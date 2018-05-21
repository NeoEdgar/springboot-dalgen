package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_MESSAGE
 */
public class TaMessageDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * link 跳转链接.
     */
    private String link;
    /**
     * tags 标签.
     */
    private String tags;
    /**
     * alias 别名.
     */
    private String alias;
    /**
     * isPush 是否推送 0 FALSE 1 TRUE.
     */
    private Integer isPush;
    /**
     * isRead 是否已读 0 FALSE 1 TRUE.
     */
    private Integer isRead;
    /**
     * content 消息内容.
     */
    private String content;
    /**
     * findTime 查找时间.
     */
    private Date findTime;
    /**
     * reciveId 接受人ID.
     */
    private Long reciveId;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * isSuccess 是否推送成功 0 FALSE 1TRUE.
     */
    private Integer isSuccess = 0;
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
     * platformType 平台类型/五端.
     */
    private String platformType;

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
     * Set link 跳转链接.
     */
    public void setLink(String link){
        this.link = link;
    }

    /**
     * Get link 跳转链接.
     *
     * @return the string
     */
    public String getLink(){
        return link;
    }

    /**
     * Set tags 标签.
     */
    public void setTags(String tags){
        this.tags = tags;
    }

    /**
     * Get tags 标签.
     *
     * @return the string
     */
    public String getTags(){
        return tags;
    }

    /**
     * Set alias 别名.
     */
    public void setAlias(String alias){
        this.alias = alias;
    }

    /**
     * Get alias 别名.
     *
     * @return the string
     */
    public String getAlias(){
        return alias;
    }

    /**
     * Set isPush 是否推送 0 FALSE 1 TRUE.
     */
    public void setIsPush(Integer isPush){
        this.isPush = isPush;
    }

    /**
     * Get isPush 是否推送 0 FALSE 1 TRUE.
     *
     * @return the string
     */
    public Integer getIsPush(){
        return isPush;
    }

    /**
     * Set isRead 是否已读 0 FALSE 1 TRUE.
     */
    public void setIsRead(Integer isRead){
        this.isRead = isRead;
    }

    /**
     * Get isRead 是否已读 0 FALSE 1 TRUE.
     *
     * @return the string
     */
    public Integer getIsRead(){
        return isRead;
    }

    /**
     * Set content 消息内容.
     */
    public void setContent(String content){
        this.content = content;
    }

    /**
     * Get content 消息内容.
     *
     * @return the string
     */
    public String getContent(){
        return content;
    }

    /**
     * Set findTime 查找时间.
     */
    public void setFindTime(Date findTime){
        this.findTime = findTime;
    }

    /**
     * Get findTime 查找时间.
     *
     * @return the string
     */
    public Date getFindTime(){
        return findTime;
    }

    /**
     * Set reciveId 接受人ID.
     */
    public void setReciveId(Long reciveId){
        this.reciveId = reciveId;
    }

    /**
     * Get reciveId 接受人ID.
     *
     * @return the string
     */
    public Long getReciveId(){
        return reciveId;
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
     * Set isSuccess 是否推送成功 0 FALSE 1TRUE.
     */
    public void setIsSuccess(Integer isSuccess){
        this.isSuccess = isSuccess;
    }

    /**
     * Get isSuccess 是否推送成功 0 FALSE 1TRUE.
     *
     * @return the string
     */
    public Integer getIsSuccess(){
        return isSuccess;
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
     * Set platformType 平台类型/五端.
     */
    public void setPlatformType(String platformType){
        this.platformType = platformType;
    }

    /**
     * Get platformType 平台类型/五端.
     *
     * @return the string
     */
    public String getPlatformType(){
        return platformType;
    }
}
