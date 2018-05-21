package com.xl.dy.dal.dataobject;

import java.util.Date;
import java.math.BigDecimal;

/**
 * The table TA_SHOP_GOODS_PROP
 */
public class TaShopGoodsPropDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * isErp IS_ERP.
     */
    private Integer isErp;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * shopId 店铺ID.
     */
    private Long shopId;
    /**
     * erpType ERP_TYPE.
     */
    private String erpType;
    /**
     * goodsId 商品ID（FK）.
     */
    private Long goodsId;
    /**
     * erpAccId 业务系统账户ID（FK）.
     */
    private Long erpAccId;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * claimTime 认领时间.
     */
    private Date claimTime;
    /**
     * isOwnLogi IS_OWN_LOGI.
     */
    private Integer isOwnLogi;
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
     * totalSales 总销量.
     */
    private Long totalSales;
    /**
     * totalStore 总库存.
     */
    private BigDecimal totalStore;
    /**
     * erpSaleDept 业务系统销售部门编码.
     */
    private String erpSaleDept;
    /**
     * goodsWeight 商品重量.
     */
    private BigDecimal goodsWeight;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * isFamvipOnly 是否家庭会员独享商品.
     */
    private Integer isFamvipOnly;
    /**
     * isValidGoods 是否虚拟商品.
     */
    private Integer isValidGoods;
    /**
     * shopPhotoUrl SHOP_PHOTO_URL.
     */
    private String shopPhotoUrl;
    /**
     * unshelveTime UNSHELVE_TIME.
     */
    private Date unshelveTime;
    /**
     * validEndDate 虚拟商品有效性-有效结束日期.
     */
    private Date validEndDate;
    /**
     * shopGoodsCode SHOP_GOODS_CODE.
     */
    private String shopGoodsCode;
    /**
     * shopGoodsName SHOP_GOODS_NAME.
     */
    private String shopGoodsName;
    /**
     * isForeverValid 虚拟商品有效性-是否永久有效.
     */
    private Integer isForeverValid;
    /**
     * isShippingFree IS_SHIPPING_FREE.
     */
    private Integer isShippingFree;
    /**
     * unshelveReason UNSHELVE_REASON.
     */
    private String unshelveReason;
    /**
     * validStartDate 虚拟商品有效性-有效开始日期.
     */
    private Date validStartDate;
    /**
     * isAnytimeRefund IS_ANYTIME_REFUND.
     */
    private Integer isAnytimeRefund;
    /**
     * packGoodsWeight 商品重量（含包装，用于计算运费）.
     */
    private BigDecimal packGoodsWeight;
    /**
     * shopRefundAddrId 店铺退货地址ID.
     */
    private Long shopRefundAddrId;
    /**
     * unshelveOperator UNSHELVE_OPERATOR.
     */
    private String unshelveOperator;
    /**
     * shopGoodsSaleStatus SHOP_GOODS_SALE_STATUS.
     */
    private String shopGoodsSaleStatus;
    /**
     * shopGoodsBusinessModel SHOP_GOODS_BUSINESS_MODEL.
     */
    private String shopGoodsBusinessModel;

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
     * Set isErp IS_ERP.
     */
    public void setIsErp(Integer isErp){
        this.isErp = isErp;
    }

    /**
     * Get isErp IS_ERP.
     *
     * @return the string
     */
    public Integer getIsErp(){
        return isErp;
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
     * Set shopId 店铺ID.
     */
    public void setShopId(Long shopId){
        this.shopId = shopId;
    }

    /**
     * Get shopId 店铺ID.
     *
     * @return the string
     */
    public Long getShopId(){
        return shopId;
    }

    /**
     * Set erpType ERP_TYPE.
     */
    public void setErpType(String erpType){
        this.erpType = erpType;
    }

    /**
     * Get erpType ERP_TYPE.
     *
     * @return the string
     */
    public String getErpType(){
        return erpType;
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
     * Set erpAccId 业务系统账户ID（FK）.
     */
    public void setErpAccId(Long erpAccId){
        this.erpAccId = erpAccId;
    }

    /**
     * Get erpAccId 业务系统账户ID（FK）.
     *
     * @return the string
     */
    public Long getErpAccId(){
        return erpAccId;
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
     * Set claimTime 认领时间.
     */
    public void setClaimTime(Date claimTime){
        this.claimTime = claimTime;
    }

    /**
     * Get claimTime 认领时间.
     *
     * @return the string
     */
    public Date getClaimTime(){
        return claimTime;
    }

    /**
     * Set isOwnLogi IS_OWN_LOGI.
     */
    public void setIsOwnLogi(Integer isOwnLogi){
        this.isOwnLogi = isOwnLogi;
    }

    /**
     * Get isOwnLogi IS_OWN_LOGI.
     *
     * @return the string
     */
    public Integer getIsOwnLogi(){
        return isOwnLogi;
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
     * Set totalSales 总销量.
     */
    public void setTotalSales(Long totalSales){
        this.totalSales = totalSales;
    }

    /**
     * Get totalSales 总销量.
     *
     * @return the string
     */
    public Long getTotalSales(){
        return totalSales;
    }

    /**
     * Set totalStore 总库存.
     */
    public void setTotalStore(BigDecimal totalStore){
        this.totalStore = totalStore;
    }

    /**
     * Get totalStore 总库存.
     *
     * @return the string
     */
    public BigDecimal getTotalStore(){
        return totalStore;
    }

    /**
     * Set erpSaleDept 业务系统销售部门编码.
     */
    public void setErpSaleDept(String erpSaleDept){
        this.erpSaleDept = erpSaleDept;
    }

    /**
     * Get erpSaleDept 业务系统销售部门编码.
     *
     * @return the string
     */
    public String getErpSaleDept(){
        return erpSaleDept;
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
     * Set isFamvipOnly 是否家庭会员独享商品.
     */
    public void setIsFamvipOnly(Integer isFamvipOnly){
        this.isFamvipOnly = isFamvipOnly;
    }

    /**
     * Get isFamvipOnly 是否家庭会员独享商品.
     *
     * @return the string
     */
    public Integer getIsFamvipOnly(){
        return isFamvipOnly;
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
     * Set shopPhotoUrl SHOP_PHOTO_URL.
     */
    public void setShopPhotoUrl(String shopPhotoUrl){
        this.shopPhotoUrl = shopPhotoUrl;
    }

    /**
     * Get shopPhotoUrl SHOP_PHOTO_URL.
     *
     * @return the string
     */
    public String getShopPhotoUrl(){
        return shopPhotoUrl;
    }

    /**
     * Set unshelveTime UNSHELVE_TIME.
     */
    public void setUnshelveTime(Date unshelveTime){
        this.unshelveTime = unshelveTime;
    }

    /**
     * Get unshelveTime UNSHELVE_TIME.
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
     * Set shopGoodsCode SHOP_GOODS_CODE.
     */
    public void setShopGoodsCode(String shopGoodsCode){
        this.shopGoodsCode = shopGoodsCode;
    }

    /**
     * Get shopGoodsCode SHOP_GOODS_CODE.
     *
     * @return the string
     */
    public String getShopGoodsCode(){
        return shopGoodsCode;
    }

    /**
     * Set shopGoodsName SHOP_GOODS_NAME.
     */
    public void setShopGoodsName(String shopGoodsName){
        this.shopGoodsName = shopGoodsName;
    }

    /**
     * Get shopGoodsName SHOP_GOODS_NAME.
     *
     * @return the string
     */
    public String getShopGoodsName(){
        return shopGoodsName;
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
     * Set isShippingFree IS_SHIPPING_FREE.
     */
    public void setIsShippingFree(Integer isShippingFree){
        this.isShippingFree = isShippingFree;
    }

    /**
     * Get isShippingFree IS_SHIPPING_FREE.
     *
     * @return the string
     */
    public Integer getIsShippingFree(){
        return isShippingFree;
    }

    /**
     * Set unshelveReason UNSHELVE_REASON.
     */
    public void setUnshelveReason(String unshelveReason){
        this.unshelveReason = unshelveReason;
    }

    /**
     * Get unshelveReason UNSHELVE_REASON.
     *
     * @return the string
     */
    public String getUnshelveReason(){
        return unshelveReason;
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
     * Set isAnytimeRefund IS_ANYTIME_REFUND.
     */
    public void setIsAnytimeRefund(Integer isAnytimeRefund){
        this.isAnytimeRefund = isAnytimeRefund;
    }

    /**
     * Get isAnytimeRefund IS_ANYTIME_REFUND.
     *
     * @return the string
     */
    public Integer getIsAnytimeRefund(){
        return isAnytimeRefund;
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

    /**
     * Set shopRefundAddrId 店铺退货地址ID.
     */
    public void setShopRefundAddrId(Long shopRefundAddrId){
        this.shopRefundAddrId = shopRefundAddrId;
    }

    /**
     * Get shopRefundAddrId 店铺退货地址ID.
     *
     * @return the string
     */
    public Long getShopRefundAddrId(){
        return shopRefundAddrId;
    }

    /**
     * Set unshelveOperator UNSHELVE_OPERATOR.
     */
    public void setUnshelveOperator(String unshelveOperator){
        this.unshelveOperator = unshelveOperator;
    }

    /**
     * Get unshelveOperator UNSHELVE_OPERATOR.
     *
     * @return the string
     */
    public String getUnshelveOperator(){
        return unshelveOperator;
    }

    /**
     * Set shopGoodsSaleStatus SHOP_GOODS_SALE_STATUS.
     */
    public void setShopGoodsSaleStatus(String shopGoodsSaleStatus){
        this.shopGoodsSaleStatus = shopGoodsSaleStatus;
    }

    /**
     * Get shopGoodsSaleStatus SHOP_GOODS_SALE_STATUS.
     *
     * @return the string
     */
    public String getShopGoodsSaleStatus(){
        return shopGoodsSaleStatus;
    }

    /**
     * Set shopGoodsBusinessModel SHOP_GOODS_BUSINESS_MODEL.
     */
    public void setShopGoodsBusinessModel(String shopGoodsBusinessModel){
        this.shopGoodsBusinessModel = shopGoodsBusinessModel;
    }

    /**
     * Get shopGoodsBusinessModel SHOP_GOODS_BUSINESS_MODEL.
     *
     * @return the string
     */
    public String getShopGoodsBusinessModel(){
        return shopGoodsBusinessModel;
    }
}
