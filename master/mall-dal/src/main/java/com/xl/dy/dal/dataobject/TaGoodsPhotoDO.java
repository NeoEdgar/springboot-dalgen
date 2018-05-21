package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_GOODS_PHOTO
 */
public class TaGoodsPhotoDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * inx 顺序.
     */
    private Integer inx;
    /**
     * skuId SKUID（FK）.
     */
    private Long skuId;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * goodsId 商品ID（FK）.
     */
    private Long goodsId;
    /**
     * photoUrl 图片资源URL.
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
     * isSpuPhoto 是否是SPU的图片.
     */
    private Integer isSpuPhoto;
    /**
     * isMastPhoto 是否主图.
     */
    private Integer isMastPhoto;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * displayPlatform 显示平台（DIC）.
     */
    private String displayPlatform;

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
     * Set skuId SKUID（FK）.
     */
    public void setSkuId(Long skuId){
        this.skuId = skuId;
    }

    /**
     * Get skuId SKUID（FK）.
     *
     * @return the string
     */
    public Long getSkuId(){
        return skuId;
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
     * Set goodsId 商品ID（FK）.
     */
    public void setGoodsId(Long goodsId){
        this.goodsId = goodsId;
    }

    /**
     * Get goodsId 商品ID（FK）.
     *
     * @return the string
     */
    public Long getGoodsId(){
        return goodsId;
    }

    /**
     * Set photoUrl 图片资源URL.
     */
    public void setPhotoUrl(String photoUrl){
        this.photoUrl = photoUrl;
    }

    /**
     * Get photoUrl 图片资源URL.
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
     * Set isSpuPhoto 是否是SPU的图片.
     */
    public void setIsSpuPhoto(Integer isSpuPhoto){
        this.isSpuPhoto = isSpuPhoto;
    }

    /**
     * Get isSpuPhoto 是否是SPU的图片.
     *
     * @return the string
     */
    public Integer getIsSpuPhoto(){
        return isSpuPhoto;
    }

    /**
     * Set isMastPhoto 是否主图.
     */
    public void setIsMastPhoto(Integer isMastPhoto){
        this.isMastPhoto = isMastPhoto;
    }

    /**
     * Get isMastPhoto 是否主图.
     *
     * @return the string
     */
    public Integer getIsMastPhoto(){
        return isMastPhoto;
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
     * Set displayPlatform 显示平台（DIC）.
     */
    public void setDisplayPlatform(String displayPlatform){
        this.displayPlatform = displayPlatform;
    }

    /**
     * Get displayPlatform 显示平台（DIC）.
     *
     * @return the string
     */
    public String getDisplayPlatform(){
        return displayPlatform;
    }
}
