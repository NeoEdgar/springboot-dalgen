package com.xl.dy.dal.dataobject;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The table TA_ORDER
 */
public class TaOrderDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * vipId 会员-会员ID(FK).
     */
    private Long vipId;
    /**
     * logiId 邮寄-物流公司ID(FK).
     */
    private Long logiId;
    /**
     * mallId 单位-商场ID（FK）.
     */
    private Long mallId;
    /**
     * payAmt 支付-订单应付金额.
     */
    private BigDecimal payAmt;
    /**
     * remark 备注.
     */
    private String remark;
    /**
     * shopId 单位-店铺ID(FK).
     */
    private Long shopId;
    /**
     * sqCode 自提-提货码.
     */
    private String sqCode;
    /**
     * vipMsg 会员-下单留言.
     */
    private String vipMsg;
    /**
     * groupId 拼团活动ID.
     */
    private Long groupId;
    /**
     * isPoint 是否使用积分.
     */
    private Integer isPoint;
    /**
     * rLogiId 邮寄-物流公司ID(FK).
     */
    private Long rLogiId;
    /**
     * vipName 会员-会员姓名（快照）.
     */
    private String vipName;
    /**
     * alPayAmt 支付-订单已付金额.
     */
    private BigDecimal alPayAmt;
    /**
     * couponId 优惠券ID.
     */
    private Long couponId;
    /**
     * isCanver 自提-是否核销.
     */
    private Integer isCanver;
    /**
     * isCoupon 是否使用优惠券.
     */
    private Integer isCoupon;
    /**
     * isRefund 退单标记（代表是退货单据）.
     */
    private Integer isRefund;
    /**
     * mallName 单位-商场名称.
     */
    private String mallName;
    /**
     * mallType 单位-商场类型（DIC）.
     */
    private String mallType;
    /**
     * parValue 优惠券面值.
     */
    private BigDecimal parValue;
    /**
     * pointAmt 支付-积分抵用金额.
     */
    private BigDecimal pointAmt;
    /**
     * shopName 单位-店铺名称.
     */
    private String shopName;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * companyId 单位-专业公司ID（FK）.
     */
    private Long companyId;
    /**
     * famMemNum 会员-家庭会员人数.
     */
    private Integer famMemNum;
    /**
     * isInvoice 发票-是否需要发票.
     */
    private Integer isInvoice;
    /**
     * mobileTel 会员-会员电话（快照）.
     */
    private String mobileTel;
    /**
     * orderCode 订单号.
     */
    private String orderCode;
    /**
     * orderType 订单类型(DIC).
     */
    private String orderType;
    /**
     * payStatus 支付状态（DIC）.
     */
    private String payStatus;
    /**
     * timestamp 公共-时间戳.
     */
    private Long timestamp;
    /**
     * trackCode 邮寄-物流公司运单号.
     */
    private String trackCode;
    /**
     * createEmpl 公共-创建人.
     */
    private Long createEmpl;
    /**
     * createTime 公共-创建时间.
     */
    private Date createTime;
    /**
     * mallStatus 单位-商场状态（DIC）.
     */
    private String mallStatus;
    /**
     * payComTime 支付-支付完成时间.
     */
    private Date payComTime;
    /**
     * payDiscAmt 支付-订单优惠券金额.
     */
    private BigDecimal payDiscAmt;
    /**
     * rTrackCode 邮寄-物流公司运单号.
     */
    private String rTrackCode;
    /**
     * refundType 退单类型（DIC）.
     */
    private String refundType;
    /**
     * sendAddrId 发货（自提）地址ID.
     */
    private Long sendAddrId;
    /**
     * alRefundAmt 支付-订单已退金额.
     */
    private BigDecimal alRefundAmt;
    /**
     * companyName 单位-专业公司名称（FK）.
     */
    private String companyName;
    /**
     * invoiceType 发票-发票类型(DIC).
     */
    private Integer invoiceType;
    /**
     * isFamilyVip 会员-是否家会员.
     */
    private Integer isFamilyVip;
    /**
     * mallMongoId 单位-商场MONGO_ID.
     */
    private String mallMongoId;
    /**
     * orderStatus 订单状态（DIC）.
     */
    private String orderStatus;
    /**
     * payModeJson 支付-已完成支付方式列表JSON.
     */
    private String payModeJson;
    /**
     * payTotalAmt 支付-订单总金额.
     */
    private BigDecimal payTotalAmt;
    /**
     * refundCause 退单-退款原因.
     */
    private String refundCause;
    /**
     * saleUnitAff 单位-销售单位归属（DIC）.
     */
    private String saleUnitAff;
    /**
     * shopMongoId 单位-店铺MONGO_ID.
     */
    private String shopMongoId;
    /**
     * userGroupId 成团标识ID.
     */
    private Long userGroupId;
    /**
     * validStatus 有效性状态.
     */
    private Integer validStatus;
    /**
     * consumePoint 支付-消耗积分.
     */
    private BigDecimal consumePoint;
    /**
     * couponUserId 用户优惠券ID.
     */
    private Long couponUserId;
    /**
     * dyVipLevelId 会员-会员等级ID.
     */
    private Long dyVipLevelId;
    /**
     * firstPayTime 支付-首次支付时间.
     */
    private Date firstPayTime;
    /**
     * getGoodsMode 订单提货方式（DIC）.
     */
    private String getGoodsMode;
    /**
     * invoiceTitle 发票-发票抬头.
     */
    private String invoiceTitle;
    /**
     * orderComTime 订单完成时间(对应订单完成状态/退款完成状态).
     */
    private Date orderComTime;
    /**
     * orderFundsId 订单款项ID（FK）.
     */
    private Long orderFundsId;
    /**
     * oriOrderCode 原始订单（如果是退单记录原始订单号）.
     */
    private String oriOrderCode;
    /**
     * reciveAddrId 收货地址ID.
     */
    private Long reciveAddrId;
    /**
     * refundAddrId 退货地址ID.
     */
    private Long refundAddrId;
    /**
     * depositPayAmt DEPOSIT_PAY_AMT.
     */
    private BigDecimal depositPayAmt;
    /**
     * invoiceBankNo 发票-专用发票开户行账号.
     */
    private String invoiceBankNo;
    /**
     * lastParagraph LAST_PARAGRAPH.
     */
    private BigDecimal lastParagraph;
    /**
     * payPostageAmt 支付-订单运费金额.
     */
    private BigDecimal payPostageAmt;
    /**
     * companyMongoId 单位-专业公司MONGO_ID.
     */
    private String companyMongoId;
    /**
     * dyVipLevelName 会员-大院会员等级名称.
     */
    private String dyVipLevelName;
    /**
     * isExistsRefund 订单是否存在退单.
     */
    private Integer isExistsRefund;
    /**
     * invoiceBankName 发票-专用发票开户行名称.
     */
    private String invoiceBankName;
    /**
     * ismallagrrefund 商场是否同意退款.
     */
    private Integer ismallagrrefund;
    /**
     * isshopagrrefund 店铺是否同意退款.
     */
    private Integer isshopagrrefund;
    /**
     * sqShipperEmplId 自提-付货人.
     */
    private Long sqShipperEmplId;
    /**
     * evaluationStatus 评价状态（DIC）.
     */
    private String evaluationStatus;
    /**
     * invoiceTaxpayerNo 发票-发票纳税人识别号.
     */
    private String invoiceTaxpayerNo;
    /**
     * orderRefundStatus 订单退款状态.
     */
    private String orderRefundStatus;
    /**
     * sqShipperEmplName 自提-付货人姓名.
     */
    private String sqShipperEmplName;
    /**
     * invoiceRegisteredTel 发票-专有发票注册电话.
     */
    private String invoiceRegisteredTel;
    /**
     * invoiceRegisteredUnit 发票-专有发票注册单位.
     */
    private String invoiceRegisteredUnit;
    /**
     * invoiceRegisteredAddress 发票-专有发票注册详细地址.
     */
    private String invoiceRegisteredAddress;

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
     * Set vipId 会员-会员ID(FK).
     */
    public void setVipId(Long vipId){
        this.vipId = vipId;
    }

    /**
     * Get vipId 会员-会员ID(FK).
     *
     * @return the string
     */
    public Long getVipId(){
        return vipId;
    }

    /**
     * Set logiId 邮寄-物流公司ID(FK).
     */
    public void setLogiId(Long logiId){
        this.logiId = logiId;
    }

    /**
     * Get logiId 邮寄-物流公司ID(FK).
     *
     * @return the string
     */
    public Long getLogiId(){
        return logiId;
    }

    /**
     * Set mallId 单位-商场ID（FK）.
     */
    public void setMallId(Long mallId){
        this.mallId = mallId;
    }

    /**
     * Get mallId 单位-商场ID（FK）.
     *
     * @return the string
     */
    public Long getMallId(){
        return mallId;
    }

    /**
     * Set payAmt 支付-订单应付金额.
     */
    public void setPayAmt(BigDecimal payAmt){
        this.payAmt = payAmt;
    }

    /**
     * Get payAmt 支付-订单应付金额.
     *
     * @return the string
     */
    public BigDecimal getPayAmt(){
        return payAmt;
    }

    /**
     * Set remark 备注.
     */
    public void setRemark(String remark){
        this.remark = remark;
    }

    /**
     * Get remark 备注.
     *
     * @return the string
     */
    public String getRemark(){
        return remark;
    }

    /**
     * Set shopId 单位-店铺ID(FK).
     */
    public void setShopId(Long shopId){
        this.shopId = shopId;
    }

    /**
     * Get shopId 单位-店铺ID(FK).
     *
     * @return the string
     */
    public Long getShopId(){
        return shopId;
    }

    /**
     * Set sqCode 自提-提货码.
     */
    public void setSqCode(String sqCode){
        this.sqCode = sqCode;
    }

    /**
     * Get sqCode 自提-提货码.
     *
     * @return the string
     */
    public String getSqCode(){
        return sqCode;
    }

    /**
     * Set vipMsg 会员-下单留言.
     */
    public void setVipMsg(String vipMsg){
        this.vipMsg = vipMsg;
    }

    /**
     * Get vipMsg 会员-下单留言.
     *
     * @return the string
     */
    public String getVipMsg(){
        return vipMsg;
    }

    /**
     * Set groupId 拼团活动ID.
     */
    public void setGroupId(Long groupId){
        this.groupId = groupId;
    }

    /**
     * Get groupId 拼团活动ID.
     *
     * @return the string
     */
    public Long getGroupId(){
        return groupId;
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
     * Set rLogiId 邮寄-物流公司ID(FK).
     */
    public void setRLogiId(Long rLogiId){
        this.rLogiId = rLogiId;
    }

    /**
     * Get rLogiId 邮寄-物流公司ID(FK).
     *
     * @return the string
     */
    public Long getRLogiId(){
        return rLogiId;
    }

    /**
     * Set vipName 会员-会员姓名（快照）.
     */
    public void setVipName(String vipName){
        this.vipName = vipName;
    }

    /**
     * Get vipName 会员-会员姓名（快照）.
     *
     * @return the string
     */
    public String getVipName(){
        return vipName;
    }

    /**
     * Set alPayAmt 支付-订单已付金额.
     */
    public void setAlPayAmt(BigDecimal alPayAmt){
        this.alPayAmt = alPayAmt;
    }

    /**
     * Get alPayAmt 支付-订单已付金额.
     *
     * @return the string
     */
    public BigDecimal getAlPayAmt(){
        return alPayAmt;
    }

    /**
     * Set couponId 优惠券ID.
     */
    public void setCouponId(Long couponId){
        this.couponId = couponId;
    }

    /**
     * Get couponId 优惠券ID.
     *
     * @return the string
     */
    public Long getCouponId(){
        return couponId;
    }

    /**
     * Set isCanver 自提-是否核销.
     */
    public void setIsCanver(Integer isCanver){
        this.isCanver = isCanver;
    }

    /**
     * Get isCanver 自提-是否核销.
     *
     * @return the string
     */
    public Integer getIsCanver(){
        return isCanver;
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
     * Set isRefund 退单标记（代表是退货单据）.
     */
    public void setIsRefund(Integer isRefund){
        this.isRefund = isRefund;
    }

    /**
     * Get isRefund 退单标记（代表是退货单据）.
     *
     * @return the string
     */
    public Integer getIsRefund(){
        return isRefund;
    }

    /**
     * Set mallName 单位-商场名称.
     */
    public void setMallName(String mallName){
        this.mallName = mallName;
    }

    /**
     * Get mallName 单位-商场名称.
     *
     * @return the string
     */
    public String getMallName(){
        return mallName;
    }

    /**
     * Set mallType 单位-商场类型（DIC）.
     */
    public void setMallType(String mallType){
        this.mallType = mallType;
    }

    /**
     * Get mallType 单位-商场类型（DIC）.
     *
     * @return the string
     */
    public String getMallType(){
        return mallType;
    }

    /**
     * Set parValue 优惠券面值.
     */
    public void setParValue(BigDecimal parValue){
        this.parValue = parValue;
    }

    /**
     * Get parValue 优惠券面值.
     *
     * @return the string
     */
    public BigDecimal getParValue(){
        return parValue;
    }

    /**
     * Set pointAmt 支付-积分抵用金额.
     */
    public void setPointAmt(BigDecimal pointAmt){
        this.pointAmt = pointAmt;
    }

    /**
     * Get pointAmt 支付-积分抵用金额.
     *
     * @return the string
     */
    public BigDecimal getPointAmt(){
        return pointAmt;
    }

    /**
     * Set shopName 单位-店铺名称.
     */
    public void setShopName(String shopName){
        this.shopName = shopName;
    }

    /**
     * Get shopName 单位-店铺名称.
     *
     * @return the string
     */
    public String getShopName(){
        return shopName;
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
     * Set companyId 单位-专业公司ID（FK）.
     */
    public void setCompanyId(Long companyId){
        this.companyId = companyId;
    }

    /**
     * Get companyId 单位-专业公司ID（FK）.
     *
     * @return the string
     */
    public Long getCompanyId(){
        return companyId;
    }

    /**
     * Set famMemNum 会员-家庭会员人数.
     */
    public void setFamMemNum(Integer famMemNum){
        this.famMemNum = famMemNum;
    }

    /**
     * Get famMemNum 会员-家庭会员人数.
     *
     * @return the string
     */
    public Integer getFamMemNum(){
        return famMemNum;
    }

    /**
     * Set isInvoice 发票-是否需要发票.
     */
    public void setIsInvoice(Integer isInvoice){
        this.isInvoice = isInvoice;
    }

    /**
     * Get isInvoice 发票-是否需要发票.
     *
     * @return the string
     */
    public Integer getIsInvoice(){
        return isInvoice;
    }

    /**
     * Set mobileTel 会员-会员电话（快照）.
     */
    public void setMobileTel(String mobileTel){
        this.mobileTel = mobileTel;
    }

    /**
     * Get mobileTel 会员-会员电话（快照）.
     *
     * @return the string
     */
    public String getMobileTel(){
        return mobileTel;
    }

    /**
     * Set orderCode 订单号.
     */
    public void setOrderCode(String orderCode){
        this.orderCode = orderCode;
    }

    /**
     * Get orderCode 订单号.
     *
     * @return the string
     */
    public String getOrderCode(){
        return orderCode;
    }

    /**
     * Set orderType 订单类型(DIC).
     */
    public void setOrderType(String orderType){
        this.orderType = orderType;
    }

    /**
     * Get orderType 订单类型(DIC).
     *
     * @return the string
     */
    public String getOrderType(){
        return orderType;
    }

    /**
     * Set payStatus 支付状态（DIC）.
     */
    public void setPayStatus(String payStatus){
        this.payStatus = payStatus;
    }

    /**
     * Get payStatus 支付状态（DIC）.
     *
     * @return the string
     */
    public String getPayStatus(){
        return payStatus;
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
     * Set trackCode 邮寄-物流公司运单号.
     */
    public void setTrackCode(String trackCode){
        this.trackCode = trackCode;
    }

    /**
     * Get trackCode 邮寄-物流公司运单号.
     *
     * @return the string
     */
    public String getTrackCode(){
        return trackCode;
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
     * Set mallStatus 单位-商场状态（DIC）.
     */
    public void setMallStatus(String mallStatus){
        this.mallStatus = mallStatus;
    }

    /**
     * Get mallStatus 单位-商场状态（DIC）.
     *
     * @return the string
     */
    public String getMallStatus(){
        return mallStatus;
    }

    /**
     * Set payComTime 支付-支付完成时间.
     */
    public void setPayComTime(Date payComTime){
        this.payComTime = payComTime;
    }

    /**
     * Get payComTime 支付-支付完成时间.
     *
     * @return the string
     */
    public Date getPayComTime(){
        return payComTime;
    }

    /**
     * Set payDiscAmt 支付-订单优惠券金额.
     */
    public void setPayDiscAmt(BigDecimal payDiscAmt){
        this.payDiscAmt = payDiscAmt;
    }

    /**
     * Get payDiscAmt 支付-订单优惠券金额.
     *
     * @return the string
     */
    public BigDecimal getPayDiscAmt(){
        return payDiscAmt;
    }

    /**
     * Set rTrackCode 邮寄-物流公司运单号.
     */
    public void setRTrackCode(String rTrackCode){
        this.rTrackCode = rTrackCode;
    }

    /**
     * Get rTrackCode 邮寄-物流公司运单号.
     *
     * @return the string
     */
    public String getRTrackCode(){
        return rTrackCode;
    }

    /**
     * Set refundType 退单类型（DIC）.
     */
    public void setRefundType(String refundType){
        this.refundType = refundType;
    }

    /**
     * Get refundType 退单类型（DIC）.
     *
     * @return the string
     */
    public String getRefundType(){
        return refundType;
    }

    /**
     * Set sendAddrId 发货（自提）地址ID.
     */
    public void setSendAddrId(Long sendAddrId){
        this.sendAddrId = sendAddrId;
    }

    /**
     * Get sendAddrId 发货（自提）地址ID.
     *
     * @return the string
     */
    public Long getSendAddrId(){
        return sendAddrId;
    }

    /**
     * Set alRefundAmt 支付-订单已退金额.
     */
    public void setAlRefundAmt(BigDecimal alRefundAmt){
        this.alRefundAmt = alRefundAmt;
    }

    /**
     * Get alRefundAmt 支付-订单已退金额.
     *
     * @return the string
     */
    public BigDecimal getAlRefundAmt(){
        return alRefundAmt;
    }

    /**
     * Set companyName 单位-专业公司名称（FK）.
     */
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    /**
     * Get companyName 单位-专业公司名称（FK）.
     *
     * @return the string
     */
    public String getCompanyName(){
        return companyName;
    }

    /**
     * Set invoiceType 发票-发票类型(DIC).
     */
    public void setInvoiceType(Integer invoiceType){
        this.invoiceType = invoiceType;
    }

    /**
     * Get invoiceType 发票-发票类型(DIC).
     *
     * @return the string
     */
    public Integer getInvoiceType(){
        return invoiceType;
    }

    /**
     * Set isFamilyVip 会员-是否家会员.
     */
    public void setIsFamilyVip(Integer isFamilyVip){
        this.isFamilyVip = isFamilyVip;
    }

    /**
     * Get isFamilyVip 会员-是否家会员.
     *
     * @return the string
     */
    public Integer getIsFamilyVip(){
        return isFamilyVip;
    }

    /**
     * Set mallMongoId 单位-商场MONGO_ID.
     */
    public void setMallMongoId(String mallMongoId){
        this.mallMongoId = mallMongoId;
    }

    /**
     * Get mallMongoId 单位-商场MONGO_ID.
     *
     * @return the string
     */
    public String getMallMongoId(){
        return mallMongoId;
    }

    /**
     * Set orderStatus 订单状态（DIC）.
     */
    public void setOrderStatus(String orderStatus){
        this.orderStatus = orderStatus;
    }

    /**
     * Get orderStatus 订单状态（DIC）.
     *
     * @return the string
     */
    public String getOrderStatus(){
        return orderStatus;
    }

    /**
     * Set payModeJson 支付-已完成支付方式列表JSON.
     */
    public void setPayModeJson(String payModeJson){
        this.payModeJson = payModeJson;
    }

    /**
     * Get payModeJson 支付-已完成支付方式列表JSON.
     *
     * @return the string
     */
    public String getPayModeJson(){
        return payModeJson;
    }

    /**
     * Set payTotalAmt 支付-订单总金额.
     */
    public void setPayTotalAmt(BigDecimal payTotalAmt){
        this.payTotalAmt = payTotalAmt;
    }

    /**
     * Get payTotalAmt 支付-订单总金额.
     *
     * @return the string
     */
    public BigDecimal getPayTotalAmt(){
        return payTotalAmt;
    }

    /**
     * Set refundCause 退单-退款原因.
     */
    public void setRefundCause(String refundCause){
        this.refundCause = refundCause;
    }

    /**
     * Get refundCause 退单-退款原因.
     *
     * @return the string
     */
    public String getRefundCause(){
        return refundCause;
    }

    /**
     * Set saleUnitAff 单位-销售单位归属（DIC）.
     */
    public void setSaleUnitAff(String saleUnitAff){
        this.saleUnitAff = saleUnitAff;
    }

    /**
     * Get saleUnitAff 单位-销售单位归属（DIC）.
     *
     * @return the string
     */
    public String getSaleUnitAff(){
        return saleUnitAff;
    }

    /**
     * Set shopMongoId 单位-店铺MONGO_ID.
     */
    public void setShopMongoId(String shopMongoId){
        this.shopMongoId = shopMongoId;
    }

    /**
     * Get shopMongoId 单位-店铺MONGO_ID.
     *
     * @return the string
     */
    public String getShopMongoId(){
        return shopMongoId;
    }

    /**
     * Set userGroupId 成团标识ID.
     */
    public void setUserGroupId(Long userGroupId){
        this.userGroupId = userGroupId;
    }

    /**
     * Get userGroupId 成团标识ID.
     *
     * @return the string
     */
    public Long getUserGroupId(){
        return userGroupId;
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
     * Set consumePoint 支付-消耗积分.
     */
    public void setConsumePoint(BigDecimal consumePoint){
        this.consumePoint = consumePoint;
    }

    /**
     * Get consumePoint 支付-消耗积分.
     *
     * @return the string
     */
    public BigDecimal getConsumePoint(){
        return consumePoint;
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
     * Set dyVipLevelId 会员-会员等级ID.
     */
    public void setDyVipLevelId(Long dyVipLevelId){
        this.dyVipLevelId = dyVipLevelId;
    }

    /**
     * Get dyVipLevelId 会员-会员等级ID.
     *
     * @return the string
     */
    public Long getDyVipLevelId(){
        return dyVipLevelId;
    }

    /**
     * Set firstPayTime 支付-首次支付时间.
     */
    public void setFirstPayTime(Date firstPayTime){
        this.firstPayTime = firstPayTime;
    }

    /**
     * Get firstPayTime 支付-首次支付时间.
     *
     * @return the string
     */
    public Date getFirstPayTime(){
        return firstPayTime;
    }

    /**
     * Set getGoodsMode 订单提货方式（DIC）.
     */
    public void setGetGoodsMode(String getGoodsMode){
        this.getGoodsMode = getGoodsMode;
    }

    /**
     * Get getGoodsMode 订单提货方式（DIC）.
     *
     * @return the string
     */
    public String getGetGoodsMode(){
        return getGoodsMode;
    }

    /**
     * Set invoiceTitle 发票-发票抬头.
     */
    public void setInvoiceTitle(String invoiceTitle){
        this.invoiceTitle = invoiceTitle;
    }

    /**
     * Get invoiceTitle 发票-发票抬头.
     *
     * @return the string
     */
    public String getInvoiceTitle(){
        return invoiceTitle;
    }

    /**
     * Set orderComTime 订单完成时间(对应订单完成状态/退款完成状态).
     */
    public void setOrderComTime(Date orderComTime){
        this.orderComTime = orderComTime;
    }

    /**
     * Get orderComTime 订单完成时间(对应订单完成状态/退款完成状态).
     *
     * @return the string
     */
    public Date getOrderComTime(){
        return orderComTime;
    }

    /**
     * Set orderFundsId 订单款项ID（FK）.
     */
    public void setOrderFundsId(Long orderFundsId){
        this.orderFundsId = orderFundsId;
    }

    /**
     * Get orderFundsId 订单款项ID（FK）.
     *
     * @return the string
     */
    public Long getOrderFundsId(){
        return orderFundsId;
    }

    /**
     * Set oriOrderCode 原始订单（如果是退单记录原始订单号）.
     */
    public void setOriOrderCode(String oriOrderCode){
        this.oriOrderCode = oriOrderCode;
    }

    /**
     * Get oriOrderCode 原始订单（如果是退单记录原始订单号）.
     *
     * @return the string
     */
    public String getOriOrderCode(){
        return oriOrderCode;
    }

    /**
     * Set reciveAddrId 收货地址ID.
     */
    public void setReciveAddrId(Long reciveAddrId){
        this.reciveAddrId = reciveAddrId;
    }

    /**
     * Get reciveAddrId 收货地址ID.
     *
     * @return the string
     */
    public Long getReciveAddrId(){
        return reciveAddrId;
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
     * Set depositPayAmt DEPOSIT_PAY_AMT.
     */
    public void setDepositPayAmt(BigDecimal depositPayAmt){
        this.depositPayAmt = depositPayAmt;
    }

    /**
     * Get depositPayAmt DEPOSIT_PAY_AMT.
     *
     * @return the string
     */
    public BigDecimal getDepositPayAmt(){
        return depositPayAmt;
    }

    /**
     * Set invoiceBankNo 发票-专用发票开户行账号.
     */
    public void setInvoiceBankNo(String invoiceBankNo){
        this.invoiceBankNo = invoiceBankNo;
    }

    /**
     * Get invoiceBankNo 发票-专用发票开户行账号.
     *
     * @return the string
     */
    public String getInvoiceBankNo(){
        return invoiceBankNo;
    }

    /**
     * Set lastParagraph LAST_PARAGRAPH.
     */
    public void setLastParagraph(BigDecimal lastParagraph){
        this.lastParagraph = lastParagraph;
    }

    /**
     * Get lastParagraph LAST_PARAGRAPH.
     *
     * @return the string
     */
    public BigDecimal getLastParagraph(){
        return lastParagraph;
    }

    /**
     * Set payPostageAmt 支付-订单运费金额.
     */
    public void setPayPostageAmt(BigDecimal payPostageAmt){
        this.payPostageAmt = payPostageAmt;
    }

    /**
     * Get payPostageAmt 支付-订单运费金额.
     *
     * @return the string
     */
    public BigDecimal getPayPostageAmt(){
        return payPostageAmt;
    }

    /**
     * Set companyMongoId 单位-专业公司MONGO_ID.
     */
    public void setCompanyMongoId(String companyMongoId){
        this.companyMongoId = companyMongoId;
    }

    /**
     * Get companyMongoId 单位-专业公司MONGO_ID.
     *
     * @return the string
     */
    public String getCompanyMongoId(){
        return companyMongoId;
    }

    /**
     * Set dyVipLevelName 会员-大院会员等级名称.
     */
    public void setDyVipLevelName(String dyVipLevelName){
        this.dyVipLevelName = dyVipLevelName;
    }

    /**
     * Get dyVipLevelName 会员-大院会员等级名称.
     *
     * @return the string
     */
    public String getDyVipLevelName(){
        return dyVipLevelName;
    }

    /**
     * Set isExistsRefund 订单是否存在退单.
     */
    public void setIsExistsRefund(Integer isExistsRefund){
        this.isExistsRefund = isExistsRefund;
    }

    /**
     * Get isExistsRefund 订单是否存在退单.
     *
     * @return the string
     */
    public Integer getIsExistsRefund(){
        return isExistsRefund;
    }

    /**
     * Set invoiceBankName 发票-专用发票开户行名称.
     */
    public void setInvoiceBankName(String invoiceBankName){
        this.invoiceBankName = invoiceBankName;
    }

    /**
     * Get invoiceBankName 发票-专用发票开户行名称.
     *
     * @return the string
     */
    public String getInvoiceBankName(){
        return invoiceBankName;
    }

    /**
     * Set ismallagrrefund 商场是否同意退款.
     */
    public void setIsmallagrrefund(Integer ismallagrrefund){
        this.ismallagrrefund = ismallagrrefund;
    }

    /**
     * Get ismallagrrefund 商场是否同意退款.
     *
     * @return the string
     */
    public Integer getIsmallagrrefund(){
        return ismallagrrefund;
    }

    /**
     * Set isshopagrrefund 店铺是否同意退款.
     */
    public void setIsshopagrrefund(Integer isshopagrrefund){
        this.isshopagrrefund = isshopagrrefund;
    }

    /**
     * Get isshopagrrefund 店铺是否同意退款.
     *
     * @return the string
     */
    public Integer getIsshopagrrefund(){
        return isshopagrrefund;
    }

    /**
     * Set sqShipperEmplId 自提-付货人.
     */
    public void setSqShipperEmplId(Long sqShipperEmplId){
        this.sqShipperEmplId = sqShipperEmplId;
    }

    /**
     * Get sqShipperEmplId 自提-付货人.
     *
     * @return the string
     */
    public Long getSqShipperEmplId(){
        return sqShipperEmplId;
    }

    /**
     * Set evaluationStatus 评价状态（DIC）.
     */
    public void setEvaluationStatus(String evaluationStatus){
        this.evaluationStatus = evaluationStatus;
    }

    /**
     * Get evaluationStatus 评价状态（DIC）.
     *
     * @return the string
     */
    public String getEvaluationStatus(){
        return evaluationStatus;
    }

    /**
     * Set invoiceTaxpayerNo 发票-发票纳税人识别号.
     */
    public void setInvoiceTaxpayerNo(String invoiceTaxpayerNo){
        this.invoiceTaxpayerNo = invoiceTaxpayerNo;
    }

    /**
     * Get invoiceTaxpayerNo 发票-发票纳税人识别号.
     *
     * @return the string
     */
    public String getInvoiceTaxpayerNo(){
        return invoiceTaxpayerNo;
    }

    /**
     * Set orderRefundStatus 订单退款状态.
     */
    public void setOrderRefundStatus(String orderRefundStatus){
        this.orderRefundStatus = orderRefundStatus;
    }

    /**
     * Get orderRefundStatus 订单退款状态.
     *
     * @return the string
     */
    public String getOrderRefundStatus(){
        return orderRefundStatus;
    }

    /**
     * Set sqShipperEmplName 自提-付货人姓名.
     */
    public void setSqShipperEmplName(String sqShipperEmplName){
        this.sqShipperEmplName = sqShipperEmplName;
    }

    /**
     * Get sqShipperEmplName 自提-付货人姓名.
     *
     * @return the string
     */
    public String getSqShipperEmplName(){
        return sqShipperEmplName;
    }

    /**
     * Set invoiceRegisteredTel 发票-专有发票注册电话.
     */
    public void setInvoiceRegisteredTel(String invoiceRegisteredTel){
        this.invoiceRegisteredTel = invoiceRegisteredTel;
    }

    /**
     * Get invoiceRegisteredTel 发票-专有发票注册电话.
     *
     * @return the string
     */
    public String getInvoiceRegisteredTel(){
        return invoiceRegisteredTel;
    }

    /**
     * Set invoiceRegisteredUnit 发票-专有发票注册单位.
     */
    public void setInvoiceRegisteredUnit(String invoiceRegisteredUnit){
        this.invoiceRegisteredUnit = invoiceRegisteredUnit;
    }

    /**
     * Get invoiceRegisteredUnit 发票-专有发票注册单位.
     *
     * @return the string
     */
    public String getInvoiceRegisteredUnit(){
        return invoiceRegisteredUnit;
    }

    /**
     * Set invoiceRegisteredAddress 发票-专有发票注册详细地址.
     */
    public void setInvoiceRegisteredAddress(String invoiceRegisteredAddress){
        this.invoiceRegisteredAddress = invoiceRegisteredAddress;
    }

    /**
     * Get invoiceRegisteredAddress 发票-专有发票注册详细地址.
     *
     * @return the string
     */
    public String getInvoiceRegisteredAddress(){
        return invoiceRegisteredAddress;
    }
}
