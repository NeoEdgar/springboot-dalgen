package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_SHOP_GOODS_LOGI
 */
public class TaShopGoodsLogiDO{

    /**
     * id ID.
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
     * goodsId 商品ID.
     */
    private Long goodsId;
    /**
     * logiMode 配送方式（DIC）.
     */
    private String logiMode;
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
     * sendAddrId 发货地址ID.
     */
    private Long sendAddrId;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * refundAddrId 退货地址ID.
     */
    private Long refundAddrId;
    /**
     * shopFreightTempletId 运费模板ID（FK）.
     */
    private Long shopFreightTempletId;
    /**
     * shopPickupLocationId 自提地点ID（FK）.
     */
    private Long shopPickupLocationId;

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
     * Set logiMode 配送方式（DIC）.
     */
    public void setLogiMode(String logiMode){
        this.logiMode = logiMode;
    }

    /**
     * Get logiMode 配送方式（DIC）.
     *
     * @return the string
     */
    public String getLogiMode(){
        return logiMode;
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
     * Set sendAddrId 发货地址ID.
     */
    public void setSendAddrId(Long sendAddrId){
        this.sendAddrId = sendAddrId;
    }

    /**
     * Get sendAddrId 发货地址ID.
     *
     * @return the string
     */
    public Long getSendAddrId(){
        return sendAddrId;
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
     * Set refundAddrId 退货地址ID.
     */
    public void setRefundAddrId(Long refundAddrId){
        this.refundAddrId = refundAddrId;
    }

    /**
     * Get refundAddrId 退货地址ID.
     *
     * @return the string
     */
    public Long getRefundAddrId(){
        return refundAddrId;
    }

    /**
     * Set shopFreightTempletId 运费模板ID（FK）.
     */
    public void setShopFreightTempletId(Long shopFreightTempletId){
        this.shopFreightTempletId = shopFreightTempletId;
    }

    /**
     * Get shopFreightTempletId 运费模板ID（FK）.
     *
     * @return the string
     */
    public Long getShopFreightTempletId(){
        return shopFreightTempletId;
    }

    /**
     * Set shopPickupLocationId 自提地点ID（FK）.
     */
    public void setShopPickupLocationId(Long shopPickupLocationId){
        this.shopPickupLocationId = shopPickupLocationId;
    }

    /**
     * Get shopPickupLocationId 自提地点ID（FK）.
     *
     * @return the string
     */
    public Long getShopPickupLocationId(){
        return shopPickupLocationId;
    }
}
