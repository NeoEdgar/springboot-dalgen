package com.xl.dy.dal.dataobject;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The table TA_ORDER_DET
 */
public class TaOrderDetDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * paId 合同-甲方ID（FK）.
     */
    private Long paId;
    /**
     * pbId 合同-乙方ID（FK）.
     */
    private Long pbId;
    /**
     * isErp 业务系统-是否对接业务系统.
     */
    private Integer isErp;
    /**
     * point 积分-应得积分.
     */
    private BigDecimal point;
    /**
     * skuId 商品-SKU_ID（FK）.
     */
    private Long skuId;
    /**
     * remark 备注信息.
     */
    private String remark;
    /**
     * brandId 商品-品牌ID（FK）.
     */
    private Long brandId;
    /**
     * goodsId 商品-商品ID（FK）.
     */
    private Long goodsId;
    /**
     * isPoint 是否使用积分.
     */
    private Integer isPoint;
    /**
     * orderId 订单ID(FK).
     */
    private Long orderId;
    /**
     * saleQty 销售数量.
     */
    private BigDecimal saleQty;
    /**
     * erpAccId 业务系统-账户ID（FK）.
     */
    private Long erpAccId;
    /**
     * isCoupon 是否使用优惠券.
     */
    private Integer isCoupon;
    /**
     * isRefund 退货标记（代表是退货）.
     */
    private Integer isRefund;
    /**
     * parValue PAR_VALUE.
     */
    private BigDecimal parValue;
    /**
     * saleType 价格-商品售卖类型（DIC）.
     */
    private String saleType;
    /**
     * skuTitle 商品-SKU标题名称.
     */
    private String skuTitle;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * brandName 商品-品牌名称（快照）.
     */
    private String brandName;
    /**
     * goodsCode 商品-商品编号.
     */
    private String goodsCode;
    /**
     * goodsType 商品类型（DIC）.
     */
    private String goodsType;
    /**
     * orderCode 订单号(快照).
     */
    private String orderCode;
    /**
     * pointRate 积分-比率.
     */
    private BigDecimal pointRate;
    /**
     * priceType 价格-价格类型（DIC）.
     */
    private String priceType;
    /**
     * seckillId 秒杀ID.
     */
    private Long seckillId;
    /**
     * timestamp 公共-时间戳.
     */
    private Long timestamp;
    /**
     * contractDp 合同-平台扣点.
     */
    private BigDecimal contractDp;
    /**
     * contractId 合同-ID（FK）.
     */
    private Long contractId;
    /**
     * createEmpl 公共-创建人.
     */
    private Long createEmpl;
    /**
     * createTime 公共-创建时间.
     */
    private Date createTime;
    /**
     * erpGoodsId 业务系统-商品ID.
     */
    private String erpGoodsId;
    /**
     * goodsPrice 价格-单价.
     */
    private BigDecimal goodsPrice;
    /**
     * oriOrderId 原始订单ID.
     */
    private Long oriOrderId;
    /**
     * alRefundAmt 价格-商品已退金额.
     */
    private BigDecimal alRefundAmt;
    /**
     * consumeCode 电子券消费码.
     */
    private String consumeCode;
    /**
     * erpLockCode 业务系统-锁库存单据号.
     */
    private String erpLockCode;
    /**
     * erpSaleCode 业务系统-销售编码.
     */
    private String erpSaleCode;
    /**
     * erpSaleDept 业务系统-销售部门编码.
     */
    private String erpSaleDept;
    /**
     * maPointRule 积分-活动积分比例（相当于积分倍数）.
     */
    private Integer maPointRule;
    /**
     * pointAmtDet 积分明细.
     */
    private BigDecimal pointAmtDet;
    /**
     * skuPropJson 商品-SKU属性信息（JSON）.
     */
    private String skuPropJson;
    /**
     * validStatus 有效性状态.
     */
    private Integer validStatus;
    /**
     * brokerageAmt 合同-平台返佣.
     */
    private BigDecimal brokerageAmt;
    /**
     * canverStatus 核销状态(DIC).
     */
    private String canverStatus;
    /**
     * contractType 合同-合同类型（DIC）.
     */
    private String contractType;
    /**
     * couponAmtDet 优惠券明细.
     */
    private BigDecimal couponAmtDet;
    /**
     * couponUserId 用户优惠券ID.
     */
    private Long couponUserId;
    /**
     * erpTradeCode 业务系统-交易单号（业务系统生成的单号）.
     */
    private String erpTradeCode;
    /**
     * erpWriteTime 业务系统-写入时间.
     */
    private Date erpWriteTime;
    /**
     * oriOrderCode 原始订单号（如果是退单记录原始订单号）.
     */
    private String oriOrderCode;
    /**
     * accountUnitId 合同-结算单位（FK）.
     */
    private Long accountUnitId;
    /**
     * erpLockStatus 业务系统-锁库存状态（DIC）.
     */
    private String erpLockStatus;
    /**
     * erpWriteError 业务系统-写入异常信息.
     */
    private String erpWriteError;
    /**
     * oriOrderDetId 原始订单明细ID（如果是退单记录原始订单明细ID）.
     */
    private Long oriOrderDetId;
    /**
     * payPostageAmt 订单运费明细.
     */
    private BigDecimal payPostageAmt;
    /**
     * shopGoodsCode SHOP_GOODS_CODE.
     */
    private String shopGoodsCode;
    /**
     * shopGoodsName 商品-店铺商品名称.
     */
    private String shopGoodsName;
    /**
     * contractNumber 合同-编号.
     */
    private String contractNumber;
    /**
     * erpWriteStatus 业务系统-写入状态（DIC）.
     */
    private String erpWriteStatus;
    /**
     * perPayTotalAmt 价格-商品总金额.
     */
    private BigDecimal perPayTotalAmt;
    /**
     * pointTradeCode 积分-交易单号（会员系统生成的单号）.
     */
    private String pointTradeCode;
    /**
     * pointWriteTime 积分-写入时间.
     */
    private Date pointWriteTime;
    /**
     * pointWriteError 积分-写入异常信息.
     */
    private String pointWriteError;
    /**
     * pointWriteStatus 积分-入账状态（DIC）.
     */
    private String pointWriteStatus;
    /**
     * shopGoodsPhotoUrl 商品-店铺商品主图.
     */
    private String shopGoodsPhotoUrl;

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
     * Set paId 合同-甲方ID（FK）.
     */
    public void setPaId(Long paId){
        this.paId = paId;
    }

    /**
     * Get paId 合同-甲方ID（FK）.
     *
     * @return the string
     */
    public Long getPaId(){
        return paId;
    }

    /**
     * Set pbId 合同-乙方ID（FK）.
     */
    public void setPbId(Long pbId){
        this.pbId = pbId;
    }

    /**
     * Get pbId 合同-乙方ID（FK）.
     *
     * @return the string
     */
    public Long getPbId(){
        return pbId;
    }

    /**
     * Set isErp 业务系统-是否对接业务系统.
     */
    public void setIsErp(Integer isErp){
        this.isErp = isErp;
    }

    /**
     * Get isErp 业务系统-是否对接业务系统.
     *
     * @return the string
     */
    public Integer getIsErp(){
        return isErp;
    }

    /**
     * Set point 积分-应得积分.
     */
    public void setPoint(BigDecimal point){
        this.point = point;
    }

    /**
     * Get point 积分-应得积分.
     *
     * @return the string
     */
    public BigDecimal getPoint(){
        return point;
    }

    /**
     * Set skuId 商品-SKU_ID（FK）.
     */
    public void setSkuId(Long skuId){
        this.skuId = skuId;
    }

    /**
     * Get skuId 商品-SKU_ID（FK）.
     *
     * @return the string
     */
    public Long getSkuId(){
        return skuId;
    }

    /**
     * Set remark 备注信息.
     */
    public void setRemark(String remark){
        this.remark = remark;
    }

    /**
     * Get remark 备注信息.
     *
     * @return the string
     */
    public String getRemark(){
        return remark;
    }

    /**
     * Set brandId 商品-品牌ID（FK）.
     */
    public void setBrandId(Long brandId){
        this.brandId = brandId;
    }

    /**
     * Get brandId 商品-品牌ID（FK）.
     *
     * @return the string
     */
    public Long getBrandId(){
        return brandId;
    }

    /**
     * Set goodsId 商品-商品ID（FK）.
     */
    public void setGoodsId(Long goodsId){
        this.goodsId = goodsId;
    }

    /**
     * Get goodsId 商品-商品ID（FK）.
     *
     * @return the string
     */
    public Long getGoodsId(){
        return goodsId;
    }

    /**
     * Set isPoint 是否使用积分.
     */
    public void setIsPoint(Integer isPoint){
        this.isPoint = isPoint;
    }

    /**
     * Get isPoint 是否使用积分.
     *
     * @return the string
     */
    public Integer getIsPoint(){
        return isPoint;
    }

    /**
     * Set orderId 订单ID(FK).
     */
    public void setOrderId(Long orderId){
        this.orderId = orderId;
    }

    /**
     * Get orderId 订单ID(FK).
     *
     * @return the string
     */
    public Long getOrderId(){
        return orderId;
    }

    /**
     * Set saleQty 销售数量.
     */
    public void setSaleQty(BigDecimal saleQty){
        this.saleQty = saleQty;
    }

    /**
     * Get saleQty 销售数量.
     *
     * @return the string
     */
    public BigDecimal getSaleQty(){
        return saleQty;
    }

    /**
     * Set erpAccId 业务系统-账户ID（FK）.
     */
    public void setErpAccId(Long erpAccId){
        this.erpAccId = erpAccId;
    }

    /**
     * Get erpAccId 业务系统-账户ID（FK）.
     *
     * @return the string
     */
    public Long getErpAccId(){
        return erpAccId;
    }

    /**
     * Set isCoupon 是否使用优惠券.
     */
    public void setIsCoupon(Integer isCoupon){
        this.isCoupon = isCoupon;
    }

    /**
     * Get isCoupon 是否使用优惠券.
     *
     * @return the string
     */
    public Integer getIsCoupon(){
        return isCoupon;
    }

    /**
     * Set isRefund 退货标记（代表是退货）.
     */
    public void setIsRefund(Integer isRefund){
        this.isRefund = isRefund;
    }

    /**
     * Get isRefund 退货标记（代表是退货）.
     *
     * @return the string
     */
    public Integer getIsRefund(){
        return isRefund;
    }

    /**
     * Set parValue PAR_VALUE.
     */
    public void setParValue(BigDecimal parValue){
        this.parValue = parValue;
    }

    /**
     * Get parValue PAR_VALUE.
     *
     * @return the string
     */
    public BigDecimal getParValue(){
        return parValue;
    }

    /**
     * Set saleType 价格-商品售卖类型（DIC）.
     */
    public void setSaleType(String saleType){
        this.saleType = saleType;
    }

    /**
     * Get saleType 价格-商品售卖类型（DIC）.
     *
     * @return the string
     */
    public String getSaleType(){
        return saleType;
    }

    /**
     * Set skuTitle 商品-SKU标题名称.
     */
    public void setSkuTitle(String skuTitle){
        this.skuTitle = skuTitle;
    }

    /**
     * Get skuTitle 商品-SKU标题名称.
     *
     * @return the string
     */
    public String getSkuTitle(){
        return skuTitle;
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
     * Set brandName 商品-品牌名称（快照）.
     */
    public void setBrandName(String brandName){
        this.brandName = brandName;
    }

    /**
     * Get brandName 商品-品牌名称（快照）.
     *
     * @return the string
     */
    public String getBrandName(){
        return brandName;
    }

    /**
     * Set goodsCode 商品-商品编号.
     */
    public void setGoodsCode(String goodsCode){
        this.goodsCode = goodsCode;
    }

    /**
     * Get goodsCode 商品-商品编号.
     *
     * @return the string
     */
    public String getGoodsCode(){
        return goodsCode;
    }

    /**
     * Set goodsType 商品类型（DIC）.
     */
    public void setGoodsType(String goodsType){
        this.goodsType = goodsType;
    }

    /**
     * Get goodsType 商品类型（DIC）.
     *
     * @return the string
     */
    public String getGoodsType(){
        return goodsType;
    }

    /**
     * Set orderCode 订单号(快照).
     */
    public void setOrderCode(String orderCode){
        this.orderCode = orderCode;
    }

    /**
     * Get orderCode 订单号(快照).
     *
     * @return the string
     */
    public String getOrderCode(){
        return orderCode;
    }

    /**
     * Set pointRate 积分-比率.
     */
    public void setPointRate(BigDecimal pointRate){
        this.pointRate = pointRate;
    }

    /**
     * Get pointRate 积分-比率.
     *
     * @return the string
     */
    public BigDecimal getPointRate(){
        return pointRate;
    }

    /**
     * Set priceType 价格-价格类型（DIC）.
     */
    public void setPriceType(String priceType){
        this.priceType = priceType;
    }

    /**
     * Get priceType 价格-价格类型（DIC）.
     *
     * @return the string
     */
    public String getPriceType(){
        return priceType;
    }

    /**
     * Set seckillId 秒杀ID.
     */
    public void setSeckillId(Long seckillId){
        this.seckillId = seckillId;
    }

    /**
     * Get seckillId 秒杀ID.
     *
     * @return the string
     */
    public Long getSeckillId(){
        return seckillId;
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
     * Set contractDp 合同-平台扣点.
     */
    public void setContractDp(BigDecimal contractDp){
        this.contractDp = contractDp;
    }

    /**
     * Get contractDp 合同-平台扣点.
     *
     * @return the string
     */
    public BigDecimal getContractDp(){
        return contractDp;
    }

    /**
     * Set contractId 合同-ID（FK）.
     */
    public void setContractId(Long contractId){
        this.contractId = contractId;
    }

    /**
     * Get contractId 合同-ID（FK）.
     *
     * @return the string
     */
    public Long getContractId(){
        return contractId;
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
     * Set erpGoodsId 业务系统-商品ID.
     */
    public void setErpGoodsId(String erpGoodsId){
        this.erpGoodsId = erpGoodsId;
    }

    /**
     * Get erpGoodsId 业务系统-商品ID.
     *
     * @return the string
     */
    public String getErpGoodsId(){
        return erpGoodsId;
    }

    /**
     * Set goodsPrice 价格-单价.
     */
    public void setGoodsPrice(BigDecimal goodsPrice){
        this.goodsPrice = goodsPrice;
    }

    /**
     * Get goodsPrice 价格-单价.
     *
     * @return the string
     */
    public BigDecimal getGoodsPrice(){
        return goodsPrice;
    }

    /**
     * Set oriOrderId 原始订单ID.
     */
    public void setOriOrderId(Long oriOrderId){
        this.oriOrderId = oriOrderId;
    }

    /**
     * Get oriOrderId 原始订单ID.
     *
     * @return the string
     */
    public Long getOriOrderId(){
        return oriOrderId;
    }

    /**
     * Set alRefundAmt 价格-商品已退金额.
     */
    public void setAlRefundAmt(BigDecimal alRefundAmt){
        this.alRefundAmt = alRefundAmt;
    }

    /**
     * Get alRefundAmt 价格-商品已退金额.
     *
     * @return the string
     */
    public BigDecimal getAlRefundAmt(){
        return alRefundAmt;
    }

    /**
     * Set consumeCode 电子券消费码.
     */
    public void setConsumeCode(String consumeCode){
        this.consumeCode = consumeCode;
    }

    /**
     * Get consumeCode 电子券消费码.
     *
     * @return the string
     */
    public String getConsumeCode(){
        return consumeCode;
    }

    /**
     * Set erpLockCode 业务系统-锁库存单据号.
     */
    public void setErpLockCode(String erpLockCode){
        this.erpLockCode = erpLockCode;
    }

    /**
     * Get erpLockCode 业务系统-锁库存单据号.
     *
     * @return the string
     */
    public String getErpLockCode(){
        return erpLockCode;
    }

    /**
     * Set erpSaleCode 业务系统-销售编码.
     */
    public void setErpSaleCode(String erpSaleCode){
        this.erpSaleCode = erpSaleCode;
    }

    /**
     * Get erpSaleCode 业务系统-销售编码.
     *
     * @return the string
     */
    public String getErpSaleCode(){
        return erpSaleCode;
    }

    /**
     * Set erpSaleDept 业务系统-销售部门编码.
     */
    public void setErpSaleDept(String erpSaleDept){
        this.erpSaleDept = erpSaleDept;
    }

    /**
     * Get erpSaleDept 业务系统-销售部门编码.
     *
     * @return the string
     */
    public String getErpSaleDept(){
        return erpSaleDept;
    }

    /**
     * Set maPointRule 积分-活动积分比例（相当于积分倍数）.
     */
    public void setMaPointRule(Integer maPointRule){
        this.maPointRule = maPointRule;
    }

    /**
     * Get maPointRule 积分-活动积分比例（相当于积分倍数）.
     *
     * @return the string
     */
    public Integer getMaPointRule(){
        return maPointRule;
    }

    /**
     * Set pointAmtDet 积分明细.
     */
    public void setPointAmtDet(BigDecimal pointAmtDet){
        this.pointAmtDet = pointAmtDet;
    }

    /**
     * Get pointAmtDet 积分明细.
     *
     * @return the string
     */
    public BigDecimal getPointAmtDet(){
        return pointAmtDet;
    }

    /**
     * Set skuPropJson 商品-SKU属性信息（JSON）.
     */
    public void setSkuPropJson(String skuPropJson){
        this.skuPropJson = skuPropJson;
    }

    /**
     * Get skuPropJson 商品-SKU属性信息（JSON）.
     *
     * @return the string
     */
    public String getSkuPropJson(){
        return skuPropJson;
    }

    /**
     * Set validStatus 有效性状态.
     */
    public void setValidStatus(Integer validStatus){
        this.validStatus = validStatus;
    }

    /**
     * Get validStatus 有效性状态.
     *
     * @return the string
     */
    public Integer getValidStatus(){
        return validStatus;
    }

    /**
     * Set brokerageAmt 合同-平台返佣.
     */
    public void setBrokerageAmt(BigDecimal brokerageAmt){
        this.brokerageAmt = brokerageAmt;
    }

    /**
     * Get brokerageAmt 合同-平台返佣.
     *
     * @return the string
     */
    public BigDecimal getBrokerageAmt(){
        return brokerageAmt;
    }

    /**
     * Set canverStatus 核销状态(DIC).
     */
    public void setCanverStatus(String canverStatus){
        this.canverStatus = canverStatus;
    }

    /**
     * Get canverStatus 核销状态(DIC).
     *
     * @return the string
     */
    public String getCanverStatus(){
        return canverStatus;
    }

    /**
     * Set contractType 合同-合同类型（DIC）.
     */
    public void setContractType(String contractType){
        this.contractType = contractType;
    }

    /**
     * Get contractType 合同-合同类型（DIC）.
     *
     * @return the string
     */
    public String getContractType(){
        return contractType;
    }

    /**
     * Set couponAmtDet 优惠券明细.
     */
    public void setCouponAmtDet(BigDecimal couponAmtDet){
        this.couponAmtDet = couponAmtDet;
    }

    /**
     * Get couponAmtDet 优惠券明细.
     *
     * @return the string
     */
    public BigDecimal getCouponAmtDet(){
        return couponAmtDet;
    }

    /**
     * Set couponUserId 用户优惠券ID.
     */
    public void setCouponUserId(Long couponUserId){
        this.couponUserId = couponUserId;
    }

    /**
     * Get couponUserId 用户优惠券ID.
     *
     * @return the string
     */
    public Long getCouponUserId(){
        return couponUserId;
    }

    /**
     * Set erpTradeCode 业务系统-交易单号（业务系统生成的单号）.
     */
    public void setErpTradeCode(String erpTradeCode){
        this.erpTradeCode = erpTradeCode;
    }

    /**
     * Get erpTradeCode 业务系统-交易单号（业务系统生成的单号）.
     *
     * @return the string
     */
    public String getErpTradeCode(){
        return erpTradeCode;
    }

    /**
     * Set erpWriteTime 业务系统-写入时间.
     */
    public void setErpWriteTime(Date erpWriteTime){
        this.erpWriteTime = erpWriteTime;
    }

    /**
     * Get erpWriteTime 业务系统-写入时间.
     *
     * @return the string
     */
    public Date getErpWriteTime(){
        return erpWriteTime;
    }

    /**
     * Set oriOrderCode 原始订单号（如果是退单记录原始订单号）.
     */
    public void setOriOrderCode(String oriOrderCode){
        this.oriOrderCode = oriOrderCode;
    }

    /**
     * Get oriOrderCode 原始订单号（如果是退单记录原始订单号）.
     *
     * @return the string
     */
    public String getOriOrderCode(){
        return oriOrderCode;
    }

    /**
     * Set accountUnitId 合同-结算单位（FK）.
     */
    public void setAccountUnitId(Long accountUnitId){
        this.accountUnitId = accountUnitId;
    }

    /**
     * Get accountUnitId 合同-结算单位（FK）.
     *
     * @return the string
     */
    public Long getAccountUnitId(){
        return accountUnitId;
    }

    /**
     * Set erpLockStatus 业务系统-锁库存状态（DIC）.
     */
    public void setErpLockStatus(String erpLockStatus){
        this.erpLockStatus = erpLockStatus;
    }

    /**
     * Get erpLockStatus 业务系统-锁库存状态（DIC）.
     *
     * @return the string
     */
    public String getErpLockStatus(){
        return erpLockStatus;
    }

    /**
     * Set erpWriteError 业务系统-写入异常信息.
     */
    public void setErpWriteError(String erpWriteError){
        this.erpWriteError = erpWriteError;
    }

    /**
     * Get erpWriteError 业务系统-写入异常信息.
     *
     * @return the string
     */
    public String getErpWriteError(){
        return erpWriteError;
    }

    /**
     * Set oriOrderDetId 原始订单明细ID（如果是退单记录原始订单明细ID）.
     */
    public void setOriOrderDetId(Long oriOrderDetId){
        this.oriOrderDetId = oriOrderDetId;
    }

    /**
     * Get oriOrderDetId 原始订单明细ID（如果是退单记录原始订单明细ID）.
     *
     * @return the string
     */
    public Long getOriOrderDetId(){
        return oriOrderDetId;
    }

    /**
     * Set payPostageAmt 订单运费明细.
     */
    public void setPayPostageAmt(BigDecimal payPostageAmt){
        this.payPostageAmt = payPostageAmt;
    }

    /**
     * Get payPostageAmt 订单运费明细.
     *
     * @return the string
     */
    public BigDecimal getPayPostageAmt(){
        return payPostageAmt;
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
     * Set shopGoodsName 商品-店铺商品名称.
     */
    public void setShopGoodsName(String shopGoodsName){
        this.shopGoodsName = shopGoodsName;
    }

    /**
     * Get shopGoodsName 商品-店铺商品名称.
     *
     * @return the string
     */
    public String getShopGoodsName(){
        return shopGoodsName;
    }

    /**
     * Set contractNumber 合同-编号.
     */
    public void setContractNumber(String contractNumber){
        this.contractNumber = contractNumber;
    }

    /**
     * Get contractNumber 合同-编号.
     *
     * @return the string
     */
    public String getContractNumber(){
        return contractNumber;
    }

    /**
     * Set erpWriteStatus 业务系统-写入状态（DIC）.
     */
    public void setErpWriteStatus(String erpWriteStatus){
        this.erpWriteStatus = erpWriteStatus;
    }

    /**
     * Get erpWriteStatus 业务系统-写入状态（DIC）.
     *
     * @return the string
     */
    public String getErpWriteStatus(){
        return erpWriteStatus;
    }

    /**
     * Set perPayTotalAmt 价格-商品总金额.
     */
    public void setPerPayTotalAmt(BigDecimal perPayTotalAmt){
        this.perPayTotalAmt = perPayTotalAmt;
    }

    /**
     * Get perPayTotalAmt 价格-商品总金额.
     *
     * @return the string
     */
    public BigDecimal getPerPayTotalAmt(){
        return perPayTotalAmt;
    }

    /**
     * Set pointTradeCode 积分-交易单号（会员系统生成的单号）.
     */
    public void setPointTradeCode(String pointTradeCode){
        this.pointTradeCode = pointTradeCode;
    }

    /**
     * Get pointTradeCode 积分-交易单号（会员系统生成的单号）.
     *
     * @return the string
     */
    public String getPointTradeCode(){
        return pointTradeCode;
    }

    /**
     * Set pointWriteTime 积分-写入时间.
     */
    public void setPointWriteTime(Date pointWriteTime){
        this.pointWriteTime = pointWriteTime;
    }

    /**
     * Get pointWriteTime 积分-写入时间.
     *
     * @return the string
     */
    public Date getPointWriteTime(){
        return pointWriteTime;
    }

    /**
     * Set pointWriteError 积分-写入异常信息.
     */
    public void setPointWriteError(String pointWriteError){
        this.pointWriteError = pointWriteError;
    }

    /**
     * Get pointWriteError 积分-写入异常信息.
     *
     * @return the string
     */
    public String getPointWriteError(){
        return pointWriteError;
    }

    /**
     * Set pointWriteStatus 积分-入账状态（DIC）.
     */
    public void setPointWriteStatus(String pointWriteStatus){
        this.pointWriteStatus = pointWriteStatus;
    }

    /**
     * Get pointWriteStatus 积分-入账状态（DIC）.
     *
     * @return the string
     */
    public String getPointWriteStatus(){
        return pointWriteStatus;
    }

    /**
     * Set shopGoodsPhotoUrl 商品-店铺商品主图.
     */
    public void setShopGoodsPhotoUrl(String shopGoodsPhotoUrl){
        this.shopGoodsPhotoUrl = shopGoodsPhotoUrl;
    }

    /**
     * Get shopGoodsPhotoUrl 商品-店铺商品主图.
     *
     * @return the string
     */
    public String getShopGoodsPhotoUrl(){
        return shopGoodsPhotoUrl;
    }
}
