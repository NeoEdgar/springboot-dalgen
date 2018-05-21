package com.xl.dy.dal.dataobject;

import java.util.Date;
import java.math.BigDecimal;

/**
 * The table TA_EXTRA_GOODS
 */
public class TaExtraGoodsDO{

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
     * goodsWeight 商品重量.
     */
    private BigDecimal goodsWeight;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * validEndDate 虚拟商品有效性-有效结束日期.
     */
    private Date validEndDate;
    /**
     * isForeverValid 虚拟商品有效性-是否永久有效.
     */
    private Integer isForeverValid;
    /**
     * validStartDate 虚拟商品有效性-有效开始日期.
     */
    private Date validStartDate;
    /**
     * packGoodsWeight 商品重量（含包装，用于计算运费）.
     */
    private BigDecimal packGoodsWeight;

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
     * Set goodsWeight 商品重量.
     */
    public void setGoodsWeight(BigDecimal goodsWeight){
        this.goodsWeight = goodsWeight;
    }

    /**
     * Get goodsWeight 商品重量.
     *
     * @return the string
     */
    public BigDecimal getGoodsWeight(){
        return goodsWeight;
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
     * Set validEndDate 虚拟商品有效性-有效结束日期.
     */
    public void setValidEndDate(Date validEndDate){
        this.validEndDate = validEndDate;
    }

    /**
     * Get validEndDate 虚拟商品有效性-有效结束日期.
     *
     * @return the string
     */
    public Date getValidEndDate(){
        return validEndDate;
    }

    /**
     * Set isForeverValid 虚拟商品有效性-是否永久有效.
     */
    public void setIsForeverValid(Integer isForeverValid){
        this.isForeverValid = isForeverValid;
    }

    /**
     * Get isForeverValid 虚拟商品有效性-是否永久有效.
     *
     * @return the string
     */
    public Integer getIsForeverValid(){
        return isForeverValid;
    }

    /**
     * Set validStartDate 虚拟商品有效性-有效开始日期.
     */
    public void setValidStartDate(Date validStartDate){
        this.validStartDate = validStartDate;
    }

    /**
     * Get validStartDate 虚拟商品有效性-有效开始日期.
     *
     * @return the string
     */
    public Date getValidStartDate(){
        return validStartDate;
    }

    /**
     * Set packGoodsWeight 商品重量（含包装，用于计算运费）.
     */
    public void setPackGoodsWeight(BigDecimal packGoodsWeight){
        this.packGoodsWeight = packGoodsWeight;
    }

    /**
     * Get packGoodsWeight 商品重量（含包装，用于计算运费）.
     *
     * @return the string
     */
    public BigDecimal getPackGoodsWeight(){
        return packGoodsWeight;
    }
}
