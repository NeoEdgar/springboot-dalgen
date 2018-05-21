package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_MICRO_PAGE
 */
public class TaMicroPageDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * inx 顺序.
     */
    private Integer inx;
    /**
     * mallId 商场ID.
     */
    private Long mallId;
    /**
     * remark 公共-备注.
     */
    private String remark;
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
     * isEnabled 是否启用.
     */
    private Integer isEnabled;
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
     * quickViewUrl 预览图.
     */
    private String quickViewUrl;
    /**
     * extensionName 推广标题.
     */
    private String extensionName;
    /**
     * extensionType 推广对象.
     */
    private String extensionType;
    /**
     * microPageLink 微页面链接.
     */
    private String microPageLink;
    /**
     * microPageName 微页面名称.
     */
    private String microPageName;
    /**
     * microPageType 微页面平台类型(DIC).
     */
    private String microPageType;
    /**
     * extensionDescription 推广描述.
     */
    private String extensionDescription;

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
     * Set mallId 商场ID.
     */
    public void setMallId(Long mallId){
        this.mallId = mallId;
    }

    /**
     * Get mallId 商场ID.
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
     * Set isEnabled 是否启用.
     */
    public void setIsEnabled(Integer isEnabled){
        this.isEnabled = isEnabled;
    }

    /**
     * Get isEnabled 是否启用.
     *
     * @return the string
     */
    public Integer getIsEnabled(){
        return isEnabled;
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
     * Set quickViewUrl 预览图.
     */
    public void setQuickViewUrl(String quickViewUrl){
        this.quickViewUrl = quickViewUrl;
    }

    /**
     * Get quickViewUrl 预览图.
     *
     * @return the string
     */
    public String getQuickViewUrl(){
        return quickViewUrl;
    }

    /**
     * Set extensionName 推广标题.
     */
    public void setExtensionName(String extensionName){
        this.extensionName = extensionName;
    }

    /**
     * Get extensionName 推广标题.
     *
     * @return the string
     */
    public String getExtensionName(){
        return extensionName;
    }

    /**
     * Set extensionType 推广对象.
     */
    public void setExtensionType(String extensionType){
        this.extensionType = extensionType;
    }

    /**
     * Get extensionType 推广对象.
     *
     * @return the string
     */
    public String getExtensionType(){
        return extensionType;
    }

    /**
     * Set microPageLink 微页面链接.
     */
    public void setMicroPageLink(String microPageLink){
        this.microPageLink = microPageLink;
    }

    /**
     * Get microPageLink 微页面链接.
     *
     * @return the string
     */
    public String getMicroPageLink(){
        return microPageLink;
    }

    /**
     * Set microPageName 微页面名称.
     */
    public void setMicroPageName(String microPageName){
        this.microPageName = microPageName;
    }

    /**
     * Get microPageName 微页面名称.
     *
     * @return the string
     */
    public String getMicroPageName(){
        return microPageName;
    }

    /**
     * Set microPageType 微页面平台类型(DIC).
     */
    public void setMicroPageType(String microPageType){
        this.microPageType = microPageType;
    }

    /**
     * Get microPageType 微页面平台类型(DIC).
     *
     * @return the string
     */
    public String getMicroPageType(){
        return microPageType;
    }

    /**
     * Set extensionDescription 推广描述.
     */
    public void setExtensionDescription(String extensionDescription){
        this.extensionDescription = extensionDescription;
    }

    /**
     * Get extensionDescription 推广描述.
     *
     * @return the string
     */
    public String getExtensionDescription(){
        return extensionDescription;
    }
}
