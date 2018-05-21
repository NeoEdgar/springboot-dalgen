package com.xl.dy.dal.dataobject;

import java.util.Date;
import java.math.BigDecimal;

/**
 * The table TA_ACCOUNT_AMOUNT
 */
public class TaAccountAmountDO{

    /**
     * id F_ID.
     */
    private Long id;
    /**
     * mallId 商场ID.
     */
    private Long mallId;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * shopId 店铺ID.
     */
    private Long shopId;
    /**
     * goodsId 商品ID.
     */
    private Long goodsId;
    /**
     * mallName 商场名称.
     */
    private String mallName;
    /**
     * shopName 店铺名称.
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
     * companyId 专业公司ID.
     */
    private Long companyId;
    /**
     * goodsName 商品名称.
     */
    private String goodsName;
    /**
     * goodsType 商品属性.
     */
    private String goodsType;
    /**
     * orderCode 销售单号(订单号).
     */
    private String orderCode;
    /**
     * saleUnion 销售通联.
     */
    private BigDecimal saleUnion;
    /**
     * timestamp 公共-时间戳.
     */
    private Date timestamp;
    /**
     * createEmpl 公共-创建人.
     */
    private Long createEmpl;
    /**
     * createTime 公共-创建时间.
     */
    private Date createTime;
    /**
     * erpAccName ERP类型.
     */
    private String erpAccName;
    /**
     * orderDetId 订单明细ID.
     */
    private Long orderDetId;
    /**
     * saleAlipay 销售支付宝.
     */
    private BigDecimal saleAlipay;
    /**
     * saleAmount 销售部分合计.
     */
    private BigDecimal saleAmount;
    /**
     * saleNumber 销售数量.
     */
    private BigDecimal saleNumber;
    /**
     * saleWechat 销售微信.
     */
    private BigDecimal saleWechat;
    /**
     * accountDate 记账日期.
     */
    private Date accountDate;
    /**
     * companyName 专业公司名称.
     */
    private String companyName;
    /**
     * erpSaleCode ERP编码.
     */
    private String erpSaleCode;
    /**
     * erpSaleDept ERP部门编码.
     */
    private String erpSaleDept;
    /**
     * saleFreigjt 销售运费.
     */
    private BigDecimal saleFreigjt;
    /**
     * salePayment 销售货款.
     */
    private BigDecimal salePayment;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * erpTradeCode 交易单号.
     */
    private String erpTradeCode;
    /**
     * erpWriteTime ERP记账日期(写入日期).
     */
    private Date erpWriteTime;
    /**
     * saleHipayacc 销售HIPAYACC.
     */
    private BigDecimal saleHipayacc;
    /**
     * accountUnitId 结算单位ID.
     */
    private Long accountUnitId;
    /**
     * erpWriteStatus ERP记账状态.
     */
    private String erpWriteStatus;
    /**
     * saletotalUnion 销售合计通联.
     */
    private BigDecimal saletotalUnion;
    /**
     * accountUnitName 结算单位名称.
     */
    private String accountUnitName;
    /**
     * saletotalAlipay 销售合计支付宝.
     */
    private BigDecimal saletotalAlipay;
    /**
     * saletotalAmount 销售合计部分合计.
     */
    private BigDecimal saletotalAmount;
    /**
     * saletotalNumber 销售合计数量.
     */
    private BigDecimal saletotalNumber;
    /**
     * saletotalWechat 销售合计微信.
     */
    private BigDecimal saletotalWechat;
    /**
     * returnGoodsUnion 退货通联.
     */
    private BigDecimal returnGoodsUnion;
    /**
     * saleHipayBalance 销售HIPAY余额.
     */
    private BigDecimal saleHipayBalance;
    /**
     * saleXinglongcart 销售兴隆卡.
     */
    private BigDecimal saleXinglongcart;
    /**
     * saletotalFreight 销售合计运费.
     */
    private BigDecimal saletotalFreight;
    /**
     * saletotalPayment 销售合计货款.
     */
    private BigDecimal saletotalPayment;
    /**
     * returnGoodsAlipay 退货支付宝.
     */
    private BigDecimal returnGoodsAlipay;
    /**
     * returnGoodsAmount 退货部分合计.
     */
    private BigDecimal returnGoodsAmount;
    /**
     * returnGoodsNumber 退货数量.
     */
    private BigDecimal returnGoodsNumber;
    /**
     * returnGoodsWechat 退货微信.
     */
    private BigDecimal returnGoodsWechat;
    /**
     * saletotalHipaiacc 销售合计HIPAYACC.
     */
    private BigDecimal saletotalHipaiacc;
    /**
     * returnGoodsFreight 退货运费.
     */
    private BigDecimal returnGoodsFreight;
    /**
     * returnGoodsPayment 退货货款.
     */
    private BigDecimal returnGoodsPayment;
    /**
     * returnGoodsHipayacc 退货HIPAYACC.
     */
    private BigDecimal returnGoodsHipayacc;
    /**
     * settementTotalUnion 结算合计通联.
     */
    private BigDecimal settementTotalUnion;
    /**
     * returnGoodsOrderCode 退货单号.
     */
    private String returnGoodsOrderCode;
    /**
     * saletotalXinlongcart 销售合计兴隆卡.
     */
    private BigDecimal saletotalXinlongcart;
    /**
     * settementTotalAlipay 结算合计支付宝.
     */
    private BigDecimal settementTotalAlipay;
    /**
     * settementTotalAmount 结算合计部分合计.
     */
    private BigDecimal settementTotalAmount;
    /**
     * settementTotalNumber 结算合计数量.
     */
    private BigDecimal settementTotalNumber;
    /**
     * settementTotalWechat 结算合计微信.
     */
    private BigDecimal settementTotalWechat;
    /**
     * settkementSalesUnion 结算销售通联.
     */
    private BigDecimal settkementSalesUnion;
    /**
     * saletotalHipayBalance 销售合计HIPAY余额.
     */
    private BigDecimal saletotalHipayBalance;
    /**
     * settementTotalFreight 结算合计运费.
     */
    private BigDecimal settementTotalFreight;
    /**
     * settementTotalPayment 结算合计货款.
     */
    private BigDecimal settementTotalPayment;
    /**
     * settkementSalesAlipay 结算销售支付宝.
     */
    private BigDecimal settkementSalesAlipay;
    /**
     * settkementSalesAmount 结算销售部分合计.
     */
    private BigDecimal settkementSalesAmount;
    /**
     * settkementSalesNumber 结算销售数量.
     */
    private BigDecimal settkementSalesNumber;
    /**
     * settkementSalesWechat 结算销售微信.
     */
    private BigDecimal settkementSalesWechat;
    /**
     * settementTotalHipayacc 结算合计HIPAYACC.
     */
    private BigDecimal settementTotalHipayacc;
    /**
     * settkementSalesFreight 结算销售运费.
     */
    private BigDecimal settkementSalesFreight;
    /**
     * settkementSalesPayment 结算销售货款.
     */
    private BigDecimal settkementSalesPayment;
    /**
     * returnGoodsErpTradeCode 退货交易单号.
     */
    private String returnGoodsErpTradeCode;
    /**
     * returnGoodsErpWriteTime ERP退单日期.
     */
    private String returnGoodsErpWriteTime;
    /**
     * returnGoodsHipayBalance 退货HIPAY余额.
     */
    private BigDecimal returnGoodsHipayBalance;
    /**
     * returnGoodsXinglongcart 退货兴隆卡.
     */
    private BigDecimal returnGoodsXinglongcart;
    /**
     * settkementSalesHipayacc 结算销售HIPAYACC.
     */
    private BigDecimal settkementSalesHipayacc;
    /**
     * returnGoodsErpWriteStatus ERP退单状态.
     */
    private String returnGoodsErpWriteStatus;
    /**
     * settementReturnGoodsAount 结算退货部分合计.
     */
    private BigDecimal settementReturnGoodsAount;
    /**
     * settementReturnGoodsUnion 结算退货通联.
     */
    private BigDecimal settementReturnGoodsUnion;
    /**
     * settementReturnGoodsAlipay 结算退货支付宝.
     */
    private BigDecimal settementReturnGoodsAlipay;
    /**
     * settementReturnGoodsNumber 结算退货数量.
     */
    private BigDecimal settementReturnGoodsNumber;
    /**
     * settementReturnGoodsWechat 结算退货微信.
     */
    private BigDecimal settementReturnGoodsWechat;
    /**
     * settementTotalHipayBalance 结算合计HIPAY余额.
     */
    private BigDecimal settementTotalHipayBalance;
    /**
     * settementTotalXinglongcart 结算合计兴隆卡.
     */
    private BigDecimal settementTotalXinglongcart;
    /**
     * settementReturnGoodsFreight 结算退货运费.
     */
    private BigDecimal settementReturnGoodsFreight;
    /**
     * settementReturnGoodsPayment 结算退货货款.
     */
    private BigDecimal settementReturnGoodsPayment;
    /**
     * settkementSalesHipayBalance 结算销售HIPAY余额.
     */
    private BigDecimal settkementSalesHipayBalance;
    /**
     * settkementSalesXinglongcart 结算销售兴隆卡.
     */
    private BigDecimal settkementSalesXinglongcart;
    /**
     * settementReturnGoodsHipayacc 结算退货HIPAYACC.
     */
    private BigDecimal settementReturnGoodsHipayacc;
    /**
     * settementReturnGoodsHipayBalance 结算退货HIPAY余额.
     */
    private BigDecimal settementReturnGoodsHipayBalance;
    /**
     * settementReturnGoodsXinglongcart 结算退货兴隆卡.
     */
    private BigDecimal settementReturnGoodsXinglongcart;

    /**
     * Set id F_ID.
     */
    public void setId(Long id){
        this.id = id;
    }

    /**
     * Get id F_ID.
     *
     * @return the string
     */
    public Long getId(){
        return id;
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
     * Set mallName 商场名称.
     */
    public void setMallName(String mallName){
        this.mallName = mallName;
    }

    /**
     * Get mallName 商场名称.
     *
     * @return the string
     */
    public String getMallName(){
        return mallName;
    }

    /**
     * Set shopName 店铺名称.
     */
    public void setShopName(String shopName){
        this.shopName = shopName;
    }

    /**
     * Get shopName 店铺名称.
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
     * Set goodsName 商品名称.
     */
    public void setGoodsName(String goodsName){
        this.goodsName = goodsName;
    }

    /**
     * Get goodsName 商品名称.
     *
     * @return the string
     */
    public String getGoodsName(){
        return goodsName;
    }

    /**
     * Set goodsType 商品属性.
     */
    public void setGoodsType(String goodsType){
        this.goodsType = goodsType;
    }

    /**
     * Get goodsType 商品属性.
     *
     * @return the string
     */
    public String getGoodsType(){
        return goodsType;
    }

    /**
     * Set orderCode 销售单号(订单号).
     */
    public void setOrderCode(String orderCode){
        this.orderCode = orderCode;
    }

    /**
     * Get orderCode 销售单号(订单号).
     *
     * @return the string
     */
    public String getOrderCode(){
        return orderCode;
    }

    /**
     * Set saleUnion 销售通联.
     */
    public void setSaleUnion(BigDecimal saleUnion){
        this.saleUnion = saleUnion;
    }

    /**
     * Get saleUnion 销售通联.
     *
     * @return the string
     */
    public BigDecimal getSaleUnion(){
        return saleUnion;
    }

    /**
     * Set timestamp 公共-时间戳.
     */
    public void setTimestamp(Date timestamp){
        this.timestamp = timestamp;
    }

    /**
     * Get timestamp 公共-时间戳.
     *
     * @return the string
     */
    public Date getTimestamp(){
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
     * Set erpAccName ERP类型.
     */
    public void setErpAccName(String erpAccName){
        this.erpAccName = erpAccName;
    }

    /**
     * Get erpAccName ERP类型.
     *
     * @return the string
     */
    public String getErpAccName(){
        return erpAccName;
    }

    /**
     * Set orderDetId 订单明细ID.
     */
    public void setOrderDetId(Long orderDetId){
        this.orderDetId = orderDetId;
    }

    /**
     * Get orderDetId 订单明细ID.
     *
     * @return the string
     */
    public Long getOrderDetId(){
        return orderDetId;
    }

    /**
     * Set saleAlipay 销售支付宝.
     */
    public void setSaleAlipay(BigDecimal saleAlipay){
        this.saleAlipay = saleAlipay;
    }

    /**
     * Get saleAlipay 销售支付宝.
     *
     * @return the string
     */
    public BigDecimal getSaleAlipay(){
        return saleAlipay;
    }

    /**
     * Set saleAmount 销售部分合计.
     */
    public void setSaleAmount(BigDecimal saleAmount){
        this.saleAmount = saleAmount;
    }

    /**
     * Get saleAmount 销售部分合计.
     *
     * @return the string
     */
    public BigDecimal getSaleAmount(){
        return saleAmount;
    }

    /**
     * Set saleNumber 销售数量.
     */
    public void setSaleNumber(BigDecimal saleNumber){
        this.saleNumber = saleNumber;
    }

    /**
     * Get saleNumber 销售数量.
     *
     * @return the string
     */
    public BigDecimal getSaleNumber(){
        return saleNumber;
    }

    /**
     * Set saleWechat 销售微信.
     */
    public void setSaleWechat(BigDecimal saleWechat){
        this.saleWechat = saleWechat;
    }

    /**
     * Get saleWechat 销售微信.
     *
     * @return the string
     */
    public BigDecimal getSaleWechat(){
        return saleWechat;
    }

    /**
     * Set accountDate 记账日期.
     */
    public void setAccountDate(Date accountDate){
        this.accountDate = accountDate;
    }

    /**
     * Get accountDate 记账日期.
     *
     * @return the string
     */
    public Date getAccountDate(){
        return accountDate;
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
     * Set erpSaleCode ERP编码.
     */
    public void setErpSaleCode(String erpSaleCode){
        this.erpSaleCode = erpSaleCode;
    }

    /**
     * Get erpSaleCode ERP编码.
     *
     * @return the string
     */
    public String getErpSaleCode(){
        return erpSaleCode;
    }

    /**
     * Set erpSaleDept ERP部门编码.
     */
    public void setErpSaleDept(String erpSaleDept){
        this.erpSaleDept = erpSaleDept;
    }

    /**
     * Get erpSaleDept ERP部门编码.
     *
     * @return the string
     */
    public String getErpSaleDept(){
        return erpSaleDept;
    }

    /**
     * Set saleFreigjt 销售运费.
     */
    public void setSaleFreigjt(BigDecimal saleFreigjt){
        this.saleFreigjt = saleFreigjt;
    }

    /**
     * Get saleFreigjt 销售运费.
     *
     * @return the string
     */
    public BigDecimal getSaleFreigjt(){
        return saleFreigjt;
    }

    /**
     * Set salePayment 销售货款.
     */
    public void setSalePayment(BigDecimal salePayment){
        this.salePayment = salePayment;
    }

    /**
     * Get salePayment 销售货款.
     *
     * @return the string
     */
    public BigDecimal getSalePayment(){
        return salePayment;
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
     * Set erpTradeCode 交易单号.
     */
    public void setErpTradeCode(String erpTradeCode){
        this.erpTradeCode = erpTradeCode;
    }

    /**
     * Get erpTradeCode 交易单号.
     *
     * @return the string
     */
    public String getErpTradeCode(){
        return erpTradeCode;
    }

    /**
     * Set erpWriteTime ERP记账日期(写入日期).
     */
    public void setErpWriteTime(Date erpWriteTime){
        this.erpWriteTime = erpWriteTime;
    }

    /**
     * Get erpWriteTime ERP记账日期(写入日期).
     *
     * @return the string
     */
    public Date getErpWriteTime(){
        return erpWriteTime;
    }

    /**
     * Set saleHipayacc 销售HIPAYACC.
     */
    public void setSaleHipayacc(BigDecimal saleHipayacc){
        this.saleHipayacc = saleHipayacc;
    }

    /**
     * Get saleHipayacc 销售HIPAYACC.
     *
     * @return the string
     */
    public BigDecimal getSaleHipayacc(){
        return saleHipayacc;
    }

    /**
     * Set accountUnitId 结算单位ID.
     */
    public void setAccountUnitId(Long accountUnitId){
        this.accountUnitId = accountUnitId;
    }

    /**
     * Get accountUnitId 结算单位ID.
     *
     * @return the string
     */
    public Long getAccountUnitId(){
        return accountUnitId;
    }

    /**
     * Set erpWriteStatus ERP记账状态.
     */
    public void setErpWriteStatus(String erpWriteStatus){
        this.erpWriteStatus = erpWriteStatus;
    }

    /**
     * Get erpWriteStatus ERP记账状态.
     *
     * @return the string
     */
    public String getErpWriteStatus(){
        return erpWriteStatus;
    }

    /**
     * Set saletotalUnion 销售合计通联.
     */
    public void setSaletotalUnion(BigDecimal saletotalUnion){
        this.saletotalUnion = saletotalUnion;
    }

    /**
     * Get saletotalUnion 销售合计通联.
     *
     * @return the string
     */
    public BigDecimal getSaletotalUnion(){
        return saletotalUnion;
    }

    /**
     * Set accountUnitName 结算单位名称.
     */
    public void setAccountUnitName(String accountUnitName){
        this.accountUnitName = accountUnitName;
    }

    /**
     * Get accountUnitName 结算单位名称.
     *
     * @return the string
     */
    public String getAccountUnitName(){
        return accountUnitName;
    }

    /**
     * Set saletotalAlipay 销售合计支付宝.
     */
    public void setSaletotalAlipay(BigDecimal saletotalAlipay){
        this.saletotalAlipay = saletotalAlipay;
    }

    /**
     * Get saletotalAlipay 销售合计支付宝.
     *
     * @return the string
     */
    public BigDecimal getSaletotalAlipay(){
        return saletotalAlipay;
    }

    /**
     * Set saletotalAmount 销售合计部分合计.
     */
    public void setSaletotalAmount(BigDecimal saletotalAmount){
        this.saletotalAmount = saletotalAmount;
    }

    /**
     * Get saletotalAmount 销售合计部分合计.
     *
     * @return the string
     */
    public BigDecimal getSaletotalAmount(){
        return saletotalAmount;
    }

    /**
     * Set saletotalNumber 销售合计数量.
     */
    public void setSaletotalNumber(BigDecimal saletotalNumber){
        this.saletotalNumber = saletotalNumber;
    }

    /**
     * Get saletotalNumber 销售合计数量.
     *
     * @return the string
     */
    public BigDecimal getSaletotalNumber(){
        return saletotalNumber;
    }

    /**
     * Set saletotalWechat 销售合计微信.
     */
    public void setSaletotalWechat(BigDecimal saletotalWechat){
        this.saletotalWechat = saletotalWechat;
    }

    /**
     * Get saletotalWechat 销售合计微信.
     *
     * @return the string
     */
    public BigDecimal getSaletotalWechat(){
        return saletotalWechat;
    }

    /**
     * Set returnGoodsUnion 退货通联.
     */
    public void setReturnGoodsUnion(BigDecimal returnGoodsUnion){
        this.returnGoodsUnion = returnGoodsUnion;
    }

    /**
     * Get returnGoodsUnion 退货通联.
     *
     * @return the string
     */
    public BigDecimal getReturnGoodsUnion(){
        return returnGoodsUnion;
    }

    /**
     * Set saleHipayBalance 销售HIPAY余额.
     */
    public void setSaleHipayBalance(BigDecimal saleHipayBalance){
        this.saleHipayBalance = saleHipayBalance;
    }

    /**
     * Get saleHipayBalance 销售HIPAY余额.
     *
     * @return the string
     */
    public BigDecimal getSaleHipayBalance(){
        return saleHipayBalance;
    }

    /**
     * Set saleXinglongcart 销售兴隆卡.
     */
    public void setSaleXinglongcart(BigDecimal saleXinglongcart){
        this.saleXinglongcart = saleXinglongcart;
    }

    /**
     * Get saleXinglongcart 销售兴隆卡.
     *
     * @return the string
     */
    public BigDecimal getSaleXinglongcart(){
        return saleXinglongcart;
    }

    /**
     * Set saletotalFreight 销售合计运费.
     */
    public void setSaletotalFreight(BigDecimal saletotalFreight){
        this.saletotalFreight = saletotalFreight;
    }

    /**
     * Get saletotalFreight 销售合计运费.
     *
     * @return the string
     */
    public BigDecimal getSaletotalFreight(){
        return saletotalFreight;
    }

    /**
     * Set saletotalPayment 销售合计货款.
     */
    public void setSaletotalPayment(BigDecimal saletotalPayment){
        this.saletotalPayment = saletotalPayment;
    }

    /**
     * Get saletotalPayment 销售合计货款.
     *
     * @return the string
     */
    public BigDecimal getSaletotalPayment(){
        return saletotalPayment;
    }

    /**
     * Set returnGoodsAlipay 退货支付宝.
     */
    public void setReturnGoodsAlipay(BigDecimal returnGoodsAlipay){
        this.returnGoodsAlipay = returnGoodsAlipay;
    }

    /**
     * Get returnGoodsAlipay 退货支付宝.
     *
     * @return the string
     */
    public BigDecimal getReturnGoodsAlipay(){
        return returnGoodsAlipay;
    }

    /**
     * Set returnGoodsAmount 退货部分合计.
     */
    public void setReturnGoodsAmount(BigDecimal returnGoodsAmount){
        this.returnGoodsAmount = returnGoodsAmount;
    }

    /**
     * Get returnGoodsAmount 退货部分合计.
     *
     * @return the string
     */
    public BigDecimal getReturnGoodsAmount(){
        return returnGoodsAmount;
    }

    /**
     * Set returnGoodsNumber 退货数量.
     */
    public void setReturnGoodsNumber(BigDecimal returnGoodsNumber){
        this.returnGoodsNumber = returnGoodsNumber;
    }

    /**
     * Get returnGoodsNumber 退货数量.
     *
     * @return the string
     */
    public BigDecimal getReturnGoodsNumber(){
        return returnGoodsNumber;
    }

    /**
     * Set returnGoodsWechat 退货微信.
     */
    public void setReturnGoodsWechat(BigDecimal returnGoodsWechat){
        this.returnGoodsWechat = returnGoodsWechat;
    }

    /**
     * Get returnGoodsWechat 退货微信.
     *
     * @return the string
     */
    public BigDecimal getReturnGoodsWechat(){
        return returnGoodsWechat;
    }

    /**
     * Set saletotalHipaiacc 销售合计HIPAYACC.
     */
    public void setSaletotalHipaiacc(BigDecimal saletotalHipaiacc){
        this.saletotalHipaiacc = saletotalHipaiacc;
    }

    /**
     * Get saletotalHipaiacc 销售合计HIPAYACC.
     *
     * @return the string
     */
    public BigDecimal getSaletotalHipaiacc(){
        return saletotalHipaiacc;
    }

    /**
     * Set returnGoodsFreight 退货运费.
     */
    public void setReturnGoodsFreight(BigDecimal returnGoodsFreight){
        this.returnGoodsFreight = returnGoodsFreight;
    }

    /**
     * Get returnGoodsFreight 退货运费.
     *
     * @return the string
     */
    public BigDecimal getReturnGoodsFreight(){
        return returnGoodsFreight;
    }

    /**
     * Set returnGoodsPayment 退货货款.
     */
    public void setReturnGoodsPayment(BigDecimal returnGoodsPayment){
        this.returnGoodsPayment = returnGoodsPayment;
    }

    /**
     * Get returnGoodsPayment 退货货款.
     *
     * @return the string
     */
    public BigDecimal getReturnGoodsPayment(){
        return returnGoodsPayment;
    }

    /**
     * Set returnGoodsHipayacc 退货HIPAYACC.
     */
    public void setReturnGoodsHipayacc(BigDecimal returnGoodsHipayacc){
        this.returnGoodsHipayacc = returnGoodsHipayacc;
    }

    /**
     * Get returnGoodsHipayacc 退货HIPAYACC.
     *
     * @return the string
     */
    public BigDecimal getReturnGoodsHipayacc(){
        return returnGoodsHipayacc;
    }

    /**
     * Set settementTotalUnion 结算合计通联.
     */
    public void setSettementTotalUnion(BigDecimal settementTotalUnion){
        this.settementTotalUnion = settementTotalUnion;
    }

    /**
     * Get settementTotalUnion 结算合计通联.
     *
     * @return the string
     */
    public BigDecimal getSettementTotalUnion(){
        return settementTotalUnion;
    }

    /**
     * Set returnGoodsOrderCode 退货单号.
     */
    public void setReturnGoodsOrderCode(String returnGoodsOrderCode){
        this.returnGoodsOrderCode = returnGoodsOrderCode;
    }

    /**
     * Get returnGoodsOrderCode 退货单号.
     *
     * @return the string
     */
    public String getReturnGoodsOrderCode(){
        return returnGoodsOrderCode;
    }

    /**
     * Set saletotalXinlongcart 销售合计兴隆卡.
     */
    public void setSaletotalXinlongcart(BigDecimal saletotalXinlongcart){
        this.saletotalXinlongcart = saletotalXinlongcart;
    }

    /**
     * Get saletotalXinlongcart 销售合计兴隆卡.
     *
     * @return the string
     */
    public BigDecimal getSaletotalXinlongcart(){
        return saletotalXinlongcart;
    }

    /**
     * Set settementTotalAlipay 结算合计支付宝.
     */
    public void setSettementTotalAlipay(BigDecimal settementTotalAlipay){
        this.settementTotalAlipay = settementTotalAlipay;
    }

    /**
     * Get settementTotalAlipay 结算合计支付宝.
     *
     * @return the string
     */
    public BigDecimal getSettementTotalAlipay(){
        return settementTotalAlipay;
    }

    /**
     * Set settementTotalAmount 结算合计部分合计.
     */
    public void setSettementTotalAmount(BigDecimal settementTotalAmount){
        this.settementTotalAmount = settementTotalAmount;
    }

    /**
     * Get settementTotalAmount 结算合计部分合计.
     *
     * @return the string
     */
    public BigDecimal getSettementTotalAmount(){
        return settementTotalAmount;
    }

    /**
     * Set settementTotalNumber 结算合计数量.
     */
    public void setSettementTotalNumber(BigDecimal settementTotalNumber){
        this.settementTotalNumber = settementTotalNumber;
    }

    /**
     * Get settementTotalNumber 结算合计数量.
     *
     * @return the string
     */
    public BigDecimal getSettementTotalNumber(){
        return settementTotalNumber;
    }

    /**
     * Set settementTotalWechat 结算合计微信.
     */
    public void setSettementTotalWechat(BigDecimal settementTotalWechat){
        this.settementTotalWechat = settementTotalWechat;
    }

    /**
     * Get settementTotalWechat 结算合计微信.
     *
     * @return the string
     */
    public BigDecimal getSettementTotalWechat(){
        return settementTotalWechat;
    }

    /**
     * Set settkementSalesUnion 结算销售通联.
     */
    public void setSettkementSalesUnion(BigDecimal settkementSalesUnion){
        this.settkementSalesUnion = settkementSalesUnion;
    }

    /**
     * Get settkementSalesUnion 结算销售通联.
     *
     * @return the string
     */
    public BigDecimal getSettkementSalesUnion(){
        return settkementSalesUnion;
    }

    /**
     * Set saletotalHipayBalance 销售合计HIPAY余额.
     */
    public void setSaletotalHipayBalance(BigDecimal saletotalHipayBalance){
        this.saletotalHipayBalance = saletotalHipayBalance;
    }

    /**
     * Get saletotalHipayBalance 销售合计HIPAY余额.
     *
     * @return the string
     */
    public BigDecimal getSaletotalHipayBalance(){
        return saletotalHipayBalance;
    }

    /**
     * Set settementTotalFreight 结算合计运费.
     */
    public void setSettementTotalFreight(BigDecimal settementTotalFreight){
        this.settementTotalFreight = settementTotalFreight;
    }

    /**
     * Get settementTotalFreight 结算合计运费.
     *
     * @return the string
     */
    public BigDecimal getSettementTotalFreight(){
        return settementTotalFreight;
    }

    /**
     * Set settementTotalPayment 结算合计货款.
     */
    public void setSettementTotalPayment(BigDecimal settementTotalPayment){
        this.settementTotalPayment = settementTotalPayment;
    }

    /**
     * Get settementTotalPayment 结算合计货款.
     *
     * @return the string
     */
    public BigDecimal getSettementTotalPayment(){
        return settementTotalPayment;
    }

    /**
     * Set settkementSalesAlipay 结算销售支付宝.
     */
    public void setSettkementSalesAlipay(BigDecimal settkementSalesAlipay){
        this.settkementSalesAlipay = settkementSalesAlipay;
    }

    /**
     * Get settkementSalesAlipay 结算销售支付宝.
     *
     * @return the string
     */
    public BigDecimal getSettkementSalesAlipay(){
        return settkementSalesAlipay;
    }

    /**
     * Set settkementSalesAmount 结算销售部分合计.
     */
    public void setSettkementSalesAmount(BigDecimal settkementSalesAmount){
        this.settkementSalesAmount = settkementSalesAmount;
    }

    /**
     * Get settkementSalesAmount 结算销售部分合计.
     *
     * @return the string
     */
    public BigDecimal getSettkementSalesAmount(){
        return settkementSalesAmount;
    }

    /**
     * Set settkementSalesNumber 结算销售数量.
     */
    public void setSettkementSalesNumber(BigDecimal settkementSalesNumber){
        this.settkementSalesNumber = settkementSalesNumber;
    }

    /**
     * Get settkementSalesNumber 结算销售数量.
     *
     * @return the string
     */
    public BigDecimal getSettkementSalesNumber(){
        return settkementSalesNumber;
    }

    /**
     * Set settkementSalesWechat 结算销售微信.
     */
    public void setSettkementSalesWechat(BigDecimal settkementSalesWechat){
        this.settkementSalesWechat = settkementSalesWechat;
    }

    /**
     * Get settkementSalesWechat 结算销售微信.
     *
     * @return the string
     */
    public BigDecimal getSettkementSalesWechat(){
        return settkementSalesWechat;
    }

    /**
     * Set settementTotalHipayacc 结算合计HIPAYACC.
     */
    public void setSettementTotalHipayacc(BigDecimal settementTotalHipayacc){
        this.settementTotalHipayacc = settementTotalHipayacc;
    }

    /**
     * Get settementTotalHipayacc 结算合计HIPAYACC.
     *
     * @return the string
     */
    public BigDecimal getSettementTotalHipayacc(){
        return settementTotalHipayacc;
    }

    /**
     * Set settkementSalesFreight 结算销售运费.
     */
    public void setSettkementSalesFreight(BigDecimal settkementSalesFreight){
        this.settkementSalesFreight = settkementSalesFreight;
    }

    /**
     * Get settkementSalesFreight 结算销售运费.
     *
     * @return the string
     */
    public BigDecimal getSettkementSalesFreight(){
        return settkementSalesFreight;
    }

    /**
     * Set settkementSalesPayment 结算销售货款.
     */
    public void setSettkementSalesPayment(BigDecimal settkementSalesPayment){
        this.settkementSalesPayment = settkementSalesPayment;
    }

    /**
     * Get settkementSalesPayment 结算销售货款.
     *
     * @return the string
     */
    public BigDecimal getSettkementSalesPayment(){
        return settkementSalesPayment;
    }

    /**
     * Set returnGoodsErpTradeCode 退货交易单号.
     */
    public void setReturnGoodsErpTradeCode(String returnGoodsErpTradeCode){
        this.returnGoodsErpTradeCode = returnGoodsErpTradeCode;
    }

    /**
     * Get returnGoodsErpTradeCode 退货交易单号.
     *
     * @return the string
     */
    public String getReturnGoodsErpTradeCode(){
        return returnGoodsErpTradeCode;
    }

    /**
     * Set returnGoodsErpWriteTime ERP退单日期.
     */
    public void setReturnGoodsErpWriteTime(String returnGoodsErpWriteTime){
        this.returnGoodsErpWriteTime = returnGoodsErpWriteTime;
    }

    /**
     * Get returnGoodsErpWriteTime ERP退单日期.
     *
     * @return the string
     */
    public String getReturnGoodsErpWriteTime(){
        return returnGoodsErpWriteTime;
    }

    /**
     * Set returnGoodsHipayBalance 退货HIPAY余额.
     */
    public void setReturnGoodsHipayBalance(BigDecimal returnGoodsHipayBalance){
        this.returnGoodsHipayBalance = returnGoodsHipayBalance;
    }

    /**
     * Get returnGoodsHipayBalance 退货HIPAY余额.
     *
     * @return the string
     */
    public BigDecimal getReturnGoodsHipayBalance(){
        return returnGoodsHipayBalance;
    }

    /**
     * Set returnGoodsXinglongcart 退货兴隆卡.
     */
    public void setReturnGoodsXinglongcart(BigDecimal returnGoodsXinglongcart){
        this.returnGoodsXinglongcart = returnGoodsXinglongcart;
    }

    /**
     * Get returnGoodsXinglongcart 退货兴隆卡.
     *
     * @return the string
     */
    public BigDecimal getReturnGoodsXinglongcart(){
        return returnGoodsXinglongcart;
    }

    /**
     * Set settkementSalesHipayacc 结算销售HIPAYACC.
     */
    public void setSettkementSalesHipayacc(BigDecimal settkementSalesHipayacc){
        this.settkementSalesHipayacc = settkementSalesHipayacc;
    }

    /**
     * Get settkementSalesHipayacc 结算销售HIPAYACC.
     *
     * @return the string
     */
    public BigDecimal getSettkementSalesHipayacc(){
        return settkementSalesHipayacc;
    }

    /**
     * Set returnGoodsErpWriteStatus ERP退单状态.
     */
    public void setReturnGoodsErpWriteStatus(String returnGoodsErpWriteStatus){
        this.returnGoodsErpWriteStatus = returnGoodsErpWriteStatus;
    }

    /**
     * Get returnGoodsErpWriteStatus ERP退单状态.
     *
     * @return the string
     */
    public String getReturnGoodsErpWriteStatus(){
        return returnGoodsErpWriteStatus;
    }

    /**
     * Set settementReturnGoodsAount 结算退货部分合计.
     */
    public void setSettementReturnGoodsAount(BigDecimal settementReturnGoodsAount){
        this.settementReturnGoodsAount = settementReturnGoodsAount;
    }

    /**
     * Get settementReturnGoodsAount 结算退货部分合计.
     *
     * @return the string
     */
    public BigDecimal getSettementReturnGoodsAount(){
        return settementReturnGoodsAount;
    }

    /**
     * Set settementReturnGoodsUnion 结算退货通联.
     */
    public void setSettementReturnGoodsUnion(BigDecimal settementReturnGoodsUnion){
        this.settementReturnGoodsUnion = settementReturnGoodsUnion;
    }

    /**
     * Get settementReturnGoodsUnion 结算退货通联.
     *
     * @return the string
     */
    public BigDecimal getSettementReturnGoodsUnion(){
        return settementReturnGoodsUnion;
    }

    /**
     * Set settementReturnGoodsAlipay 结算退货支付宝.
     */
    public void setSettementReturnGoodsAlipay(BigDecimal settementReturnGoodsAlipay){
        this.settementReturnGoodsAlipay = settementReturnGoodsAlipay;
    }

    /**
     * Get settementReturnGoodsAlipay 结算退货支付宝.
     *
     * @return the string
     */
    public BigDecimal getSettementReturnGoodsAlipay(){
        return settementReturnGoodsAlipay;
    }

    /**
     * Set settementReturnGoodsNumber 结算退货数量.
     */
    public void setSettementReturnGoodsNumber(BigDecimal settementReturnGoodsNumber){
        this.settementReturnGoodsNumber = settementReturnGoodsNumber;
    }

    /**
     * Get settementReturnGoodsNumber 结算退货数量.
     *
     * @return the string
     */
    public BigDecimal getSettementReturnGoodsNumber(){
        return settementReturnGoodsNumber;
    }

    /**
     * Set settementReturnGoodsWechat 结算退货微信.
     */
    public void setSettementReturnGoodsWechat(BigDecimal settementReturnGoodsWechat){
        this.settementReturnGoodsWechat = settementReturnGoodsWechat;
    }

    /**
     * Get settementReturnGoodsWechat 结算退货微信.
     *
     * @return the string
     */
    public BigDecimal getSettementReturnGoodsWechat(){
        return settementReturnGoodsWechat;
    }

    /**
     * Set settementTotalHipayBalance 结算合计HIPAY余额.
     */
    public void setSettementTotalHipayBalance(BigDecimal settementTotalHipayBalance){
        this.settementTotalHipayBalance = settementTotalHipayBalance;
    }

    /**
     * Get settementTotalHipayBalance 结算合计HIPAY余额.
     *
     * @return the string
     */
    public BigDecimal getSettementTotalHipayBalance(){
        return settementTotalHipayBalance;
    }

    /**
     * Set settementTotalXinglongcart 结算合计兴隆卡.
     */
    public void setSettementTotalXinglongcart(BigDecimal settementTotalXinglongcart){
        this.settementTotalXinglongcart = settementTotalXinglongcart;
    }

    /**
     * Get settementTotalXinglongcart 结算合计兴隆卡.
     *
     * @return the string
     */
    public BigDecimal getSettementTotalXinglongcart(){
        return settementTotalXinglongcart;
    }

    /**
     * Set settementReturnGoodsFreight 结算退货运费.
     */
    public void setSettementReturnGoodsFreight(BigDecimal settementReturnGoodsFreight){
        this.settementReturnGoodsFreight = settementReturnGoodsFreight;
    }

    /**
     * Get settementReturnGoodsFreight 结算退货运费.
     *
     * @return the string
     */
    public BigDecimal getSettementReturnGoodsFreight(){
        return settementReturnGoodsFreight;
    }

    /**
     * Set settementReturnGoodsPayment 结算退货货款.
     */
    public void setSettementReturnGoodsPayment(BigDecimal settementReturnGoodsPayment){
        this.settementReturnGoodsPayment = settementReturnGoodsPayment;
    }

    /**
     * Get settementReturnGoodsPayment 结算退货货款.
     *
     * @return the string
     */
    public BigDecimal getSettementReturnGoodsPayment(){
        return settementReturnGoodsPayment;
    }

    /**
     * Set settkementSalesHipayBalance 结算销售HIPAY余额.
     */
    public void setSettkementSalesHipayBalance(BigDecimal settkementSalesHipayBalance){
        this.settkementSalesHipayBalance = settkementSalesHipayBalance;
    }

    /**
     * Get settkementSalesHipayBalance 结算销售HIPAY余额.
     *
     * @return the string
     */
    public BigDecimal getSettkementSalesHipayBalance(){
        return settkementSalesHipayBalance;
    }

    /**
     * Set settkementSalesXinglongcart 结算销售兴隆卡.
     */
    public void setSettkementSalesXinglongcart(BigDecimal settkementSalesXinglongcart){
        this.settkementSalesXinglongcart = settkementSalesXinglongcart;
    }

    /**
     * Get settkementSalesXinglongcart 结算销售兴隆卡.
     *
     * @return the string
     */
    public BigDecimal getSettkementSalesXinglongcart(){
        return settkementSalesXinglongcart;
    }

    /**
     * Set settementReturnGoodsHipayacc 结算退货HIPAYACC.
     */
    public void setSettementReturnGoodsHipayacc(BigDecimal settementReturnGoodsHipayacc){
        this.settementReturnGoodsHipayacc = settementReturnGoodsHipayacc;
    }

    /**
     * Get settementReturnGoodsHipayacc 结算退货HIPAYACC.
     *
     * @return the string
     */
    public BigDecimal getSettementReturnGoodsHipayacc(){
        return settementReturnGoodsHipayacc;
    }

    /**
     * Set settementReturnGoodsHipayBalance 结算退货HIPAY余额.
     */
    public void setSettementReturnGoodsHipayBalance(BigDecimal settementReturnGoodsHipayBalance){
        this.settementReturnGoodsHipayBalance = settementReturnGoodsHipayBalance;
    }

    /**
     * Get settementReturnGoodsHipayBalance 结算退货HIPAY余额.
     *
     * @return the string
     */
    public BigDecimal getSettementReturnGoodsHipayBalance(){
        return settementReturnGoodsHipayBalance;
    }

    /**
     * Set settementReturnGoodsXinglongcart 结算退货兴隆卡.
     */
    public void setSettementReturnGoodsXinglongcart(BigDecimal settementReturnGoodsXinglongcart){
        this.settementReturnGoodsXinglongcart = settementReturnGoodsXinglongcart;
    }

    /**
     * Get settementReturnGoodsXinglongcart 结算退货兴隆卡.
     *
     * @return the string
     */
    public BigDecimal getSettementReturnGoodsXinglongcart(){
        return settementReturnGoodsXinglongcart;
    }
}
