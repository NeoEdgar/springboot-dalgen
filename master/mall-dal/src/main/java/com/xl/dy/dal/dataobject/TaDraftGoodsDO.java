package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_DRAFT_GOODS
 */
public class TaDraftGoodsDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * goodsId 商品ID.
     */
    private Long goodsId;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * goodsName GOODS_NAME.
     */
    private String goodsName;
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
     * goodsPhoto GOODS_PHOTO.
     */
    private String goodsPhoto;
    /**
     * draftUnitId DRAFT_UNIT_ID.
     */
    private Long draftUnitId;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * goodsCategory GOODS_CATEGORY.
     */
    private String goodsCategory;
    /**
     * draftGoodsJson DRAFT_GOODS_JSON.
     */
    private String draftGoodsJson;

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
     * Set goodsId 商品ID.
     */
    public void setGoodsId(Long goodsId){
        this.goodsId = goodsId;
    }

    /**
     * Get goodsId 商品ID.
     *
     * @return the string
     */
    public Long getGoodsId(){
        return goodsId;
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
     * Set goodsName GOODS_NAME.
     */
    public void setGoodsName(String goodsName){
        this.goodsName = goodsName;
    }

    /**
     * Get goodsName GOODS_NAME.
     *
     * @return the string
     */
    public String getGoodsName(){
        return goodsName;
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
     * Set goodsPhoto GOODS_PHOTO.
     */
    public void setGoodsPhoto(String goodsPhoto){
        this.goodsPhoto = goodsPhoto;
    }

    /**
     * Get goodsPhoto GOODS_PHOTO.
     *
     * @return the string
     */
    public String getGoodsPhoto(){
        return goodsPhoto;
    }

    /**
     * Set draftUnitId DRAFT_UNIT_ID.
     */
    public void setDraftUnitId(Long draftUnitId){
        this.draftUnitId = draftUnitId;
    }

    /**
     * Get draftUnitId DRAFT_UNIT_ID.
     *
     * @return the string
     */
    public Long getDraftUnitId(){
        return draftUnitId;
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
     * Set goodsCategory GOODS_CATEGORY.
     */
    public void setGoodsCategory(String goodsCategory){
        this.goodsCategory = goodsCategory;
    }

    /**
     * Get goodsCategory GOODS_CATEGORY.
     *
     * @return the string
     */
    public String getGoodsCategory(){
        return goodsCategory;
    }

    /**
     * Set draftGoodsJson DRAFT_GOODS_JSON.
     */
    public void setDraftGoodsJson(String draftGoodsJson){
        this.draftGoodsJson = draftGoodsJson;
    }

    /**
     * Get draftGoodsJson DRAFT_GOODS_JSON.
     *
     * @return the string
     */
    public String getDraftGoodsJson(){
        return draftGoodsJson;
    }
}
