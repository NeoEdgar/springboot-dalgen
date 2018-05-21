package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_SHOP_PAY_MODE
 */
public class TaShopPayModeDO{

    /**
     * id 支付方式ID(FK).
     */
    private Long id;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * shopId 店铺ID（FK）.
     */
    private Long shopId;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * payModeId PAY_MODE_ID.
     */
    private Long payModeId;
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
     * isDefaultPaymode 是否是默认支付方式.
     */
    private Integer isDefaultPaymode;

    /**
     * Set id 支付方式ID(FK).
     */
    public void setId(Long id){
        this.id = id;
    }

    /**
     * Get id 支付方式ID(FK).
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
     * Set shopId 店铺ID（FK）.
     */
    public void setShopId(Long shopId){
        this.shopId = shopId;
    }

    /**
     * Get shopId 店铺ID（FK）.
     *
     * @return the string
     */
    public Long getShopId(){
        return shopId;
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
     * Set payModeId PAY_MODE_ID.
     */
    public void setPayModeId(Long payModeId){
        this.payModeId = payModeId;
    }

    /**
     * Get payModeId PAY_MODE_ID.
     *
     * @return the string
     */
    public Long getPayModeId(){
        return payModeId;
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
     * Set isDefaultPaymode 是否是默认支付方式.
     */
    public void setIsDefaultPaymode(Integer isDefaultPaymode){
        this.isDefaultPaymode = isDefaultPaymode;
    }

    /**
     * Get isDefaultPaymode 是否是默认支付方式.
     *
     * @return the string
     */
    public Integer getIsDefaultPaymode(){
        return isDefaultPaymode;
    }
}
