package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_MALL_HOME_GOODS
 */
public class TaMallHomeGoodsDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * inx 权重.
     */
    private Integer inx;
    /**
     * brand 品牌.
     */
    private String brand;
    /**
     * mallId 商场ID.
     */
    private Long mallId;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * endTime 展示结束时间.
     */
    private Date endTime;
    /**
     * photoUrl 图片.
     */
    private String photoUrl;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * goodsCode 商品编码.
     */
    private String goodsCode;
    /**
     * startTime 展示开始时间.
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
     * createName 创建人.
     */
    private String createName;
    /**
     * createTime 公共-创建时间.
     */
    private Date createTime;
    /**
     * moduleName 模块名称.
     */
    private String moduleName;
    /**
     * showStatus 展示状态.
     */
    private String showStatus;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * introduction 简介.
     */
    private String introduction;
    /**
     * moduleNameId 商场模块名称ID.
     */
    private Long moduleNameId;

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
     * Set inx 权重.
     */
    public void setInx(Integer inx){
        this.inx = inx;
    }

    /**
     * Get inx 权重.
     *
     * @return the string
     */
    public Integer getInx(){
        return inx;
    }

    /**
     * Set brand 品牌.
     */
    public void setBrand(String brand){
        this.brand = brand;
    }

    /**
     * Get brand 品牌.
     *
     * @return the string
     */
    public String getBrand(){
        return brand;
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
     * Set endTime 展示结束时间.
     */
    public void setEndTime(Date endTime){
        this.endTime = endTime;
    }

    /**
     * Get endTime 展示结束时间.
     *
     * @return the string
     */
    public Date getEndTime(){
        return endTime;
    }

    /**
     * Set photoUrl 图片.
     */
    public void setPhotoUrl(String photoUrl){
        this.photoUrl = photoUrl;
    }

    /**
     * Get photoUrl 图片.
     *
     * @return the string
     */
    public String getPhotoUrl(){
        return photoUrl;
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
     * Set goodsCode 商品编码.
     */
    public void setGoodsCode(String goodsCode){
        this.goodsCode = goodsCode;
    }

    /**
     * Get goodsCode 商品编码.
     *
     * @return the string
     */
    public String getGoodsCode(){
        return goodsCode;
    }

    /**
     * Set startTime 展示开始时间.
     */
    public void setStartTime(Date startTime){
        this.startTime = startTime;
    }

    /**
     * Get startTime 展示开始时间.
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
     * Set createName 创建人.
     */
    public void setCreateName(String createName){
        this.createName = createName;
    }

    /**
     * Get createName 创建人.
     *
     * @return the string
     */
    public String getCreateName(){
        return createName;
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
     * Set moduleName 模块名称.
     */
    public void setModuleName(String moduleName){
        this.moduleName = moduleName;
    }

    /**
     * Get moduleName 模块名称.
     *
     * @return the string
     */
    public String getModuleName(){
        return moduleName;
    }

    /**
     * Set showStatus 展示状态.
     */
    public void setShowStatus(String showStatus){
        this.showStatus = showStatus;
    }

    /**
     * Get showStatus 展示状态.
     *
     * @return the string
     */
    public String getShowStatus(){
        return showStatus;
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
     * Set introduction 简介.
     */
    public void setIntroduction(String introduction){
        this.introduction = introduction;
    }

    /**
     * Get introduction 简介.
     *
     * @return the string
     */
    public String getIntroduction(){
        return introduction;
    }

    /**
     * Set moduleNameId 商场模块名称ID.
     */
    public void setModuleNameId(Long moduleNameId){
        this.moduleNameId = moduleNameId;
    }

    /**
     * Get moduleNameId 商场模块名称ID.
     *
     * @return the string
     */
    public Long getModuleNameId(){
        return moduleNameId;
    }
}
