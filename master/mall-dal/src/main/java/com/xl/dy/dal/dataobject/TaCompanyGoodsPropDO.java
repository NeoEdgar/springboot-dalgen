package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_COMPANY_GOODS_PROP
 */
public class TaCompanyGoodsPropDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * goodsId 商品ID（FK）.
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
     * companyId 专业公司ID.
     */
    private Long companyId;
    /**
     * isClaimed 是否被认领过.
     */
    private Integer isClaimed;
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
     * companyName 专业公司名称.
     */
    private String companyName;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * isValidGoods 是否虚拟商品.
     */
    private Integer isValidGoods;
    /**
     * unshelveTime 下架时间.
     */
    private Date unshelveTime;
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
     * isAnytimeRefund 是否支持未消费随时退.
     */
    private Integer isAnytimeRefund;
    /**
     * comGoodsSaleStatus 专业公司产品售卖状态（DIC）.
     */
    private String comGoodsSaleStatus;

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
     * Set companyId 专业公司ID.
     */
    public void setCompanyId(Long companyId){
        this.companyId = companyId;
    }

    /**
     * Get companyId 专业公司ID.
     *
     * @return the string
     */
    public Long getCompanyId(){
        return companyId;
    }

    /**
     * Set isClaimed 是否被认领过.
     */
    public void setIsClaimed(Integer isClaimed){
        this.isClaimed = isClaimed;
    }

    /**
     * Get isClaimed 是否被认领过.
     *
     * @return the string
     */
    public Integer getIsClaimed(){
        return isClaimed;
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
     * Set companyName 专业公司名称.
     */
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    /**
     * Get companyName 专业公司名称.
     *
     * @return the string
     */
    public String getCompanyName(){
        return companyName;
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
     * Set isValidGoods 是否虚拟商品.
     */
    public void setIsValidGoods(Integer isValidGoods){
        this.isValidGoods = isValidGoods;
    }

    /**
     * Get isValidGoods 是否虚拟商品.
     *
     * @return the string
     */
    public Integer getIsValidGoods(){
        return isValidGoods;
    }

    /**
     * Set unshelveTime 下架时间.
     */
    public void setUnshelveTime(Date unshelveTime){
        this.unshelveTime = unshelveTime;
    }

    /**
     * Get unshelveTime 下架时间.
     *
     * @return the string
     */
    public Date getUnshelveTime(){
        return unshelveTime;
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
     * Set isAnytimeRefund 是否支持未消费随时退.
     */
    public void setIsAnytimeRefund(Integer isAnytimeRefund){
        this.isAnytimeRefund = isAnytimeRefund;
    }

    /**
     * Get isAnytimeRefund 是否支持未消费随时退.
     *
     * @return the string
     */
    public Integer getIsAnytimeRefund(){
        return isAnytimeRefund;
    }

    /**
     * Set comGoodsSaleStatus 专业公司产品售卖状态（DIC）.
     */
    public void setComGoodsSaleStatus(String comGoodsSaleStatus){
        this.comGoodsSaleStatus = comGoodsSaleStatus;
    }

    /**
     * Get comGoodsSaleStatus 专业公司产品售卖状态（DIC）.
     *
     * @return the string
     */
    public String getComGoodsSaleStatus(){
        return comGoodsSaleStatus;
    }
}
