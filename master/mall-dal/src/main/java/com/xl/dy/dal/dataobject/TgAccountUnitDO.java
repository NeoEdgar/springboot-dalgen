package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TG_ACCOUNT_UNIT
 */
public class TgAccountUnitDO{

    /**
     * id F_ID.
     */
    private Long id;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * linkman 联系人.
     */
    private String linkman;
    /**
     * linktel 联系电话.
     */
    private String linktel;
    /**
     * settMode 结款方式（DIC）.
     */
    private String settMode;
    /**
     * settType 结款类型（DIC）.
     */
    private String settType;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * settStyle 结款形式（DIC）.
     */
    private String settStyle;
    /**
     * timestamp 公共-时间戳.
     */
    private Long timestamp;
    /**
     * accountDay 账单日.
     */
    private Date accountDay;
    /**
     * clientCode 客户代码.
     */
    private String clientCode;
    /**
     * createEmpl 公共-创建人.
     */
    private Long createEmpl;
    /**
     * createTime 公共-创建时间.
     */
    private Date createTime;
    /**
     * settBankNo 结款-开户行账号.
     */
    private String settBankNo;
    /**
     * invoiceType 发票类型(DIC).
     */
    private String invoiceType;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * invoiceEmail 接收发票联系人邮箱.
     */
    private String invoiceEmail;
    /**
     * invoiceTitle 发票抬头.
     */
    private String invoiceTitle;
    /**
     * isProInvoice 是否专用发票.
     */
    private Integer isProInvoice;
    /**
     * settBankEmpl 结款-开户行姓名.
     */
    private String settBankEmpl;
    /**
     * settBankName 结款-开户行名称.
     */
    private String settBankName;
    /**
     * invoiceBankNo 专用发票开户行账号.
     */
    private String invoiceBankNo;
    /**
     * isOpenInvoice 是否开具发票.
     */
    private Integer isOpenInvoice;
    /**
     * invoiceAddress 接收发票联系人地址.
     */
    private String invoiceAddress;
    /**
     * invoiceLinkman 接收发票联系人姓名.
     */
    private String invoiceLinkman;
    /**
     * invoiceLinktel 接收发票联系人电话.
     */
    private String invoiceLinktel;
    /**
     * settBankCityId 结款-开户行市ID（FK）.
     */
    private Long settBankCityId;
    /**
     * accountUnitName 结算单位名称.
     */
    private String accountUnitName;
    /**
     * invoiceBankName 专用发票开户行名称.
     */
    private String invoiceBankName;
    /**
     * accountUnitSpell 拼音码.
     */
    private String accountUnitSpell;
    /**
     * accountUnitSource 结算单位来源（DIC）.
     */
    private String accountUnitSource;
    /**
     * invoiceTaxpayerNo 发票纳税人识别号.
     */
    private String invoiceTaxpayerNo;
    /**
     * settBankDistrictId 结款-开户行区ID（FK）.
     */
    private Long settBankDistrictId;
    /**
     * settBankProvinceId 结款-开户行省ID（FK）.
     */
    private Long settBankProvinceId;
    /**
     * invoiceRegisteredTel 专有发票注册电话.
     */
    private String invoiceRegisteredTel;
    /**
     * invoiceRegisteredUnit 专有发票注册单位.
     */
    private String invoiceRegisteredUnit;
    /**
     * invoiceRegisteredAddress 专有发票注册详细地址.
     */
    private String invoiceRegisteredAddress;

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
     * Set linkman 联系人.
     */
    public void setLinkman(String linkman){
        this.linkman = linkman;
    }

    /**
     * Get linkman 联系人.
     *
     * @return the string
     */
    public String getLinkman(){
        return linkman;
    }

    /**
     * Set linktel 联系电话.
     */
    public void setLinktel(String linktel){
        this.linktel = linktel;
    }

    /**
     * Get linktel 联系电话.
     *
     * @return the string
     */
    public String getLinktel(){
        return linktel;
    }

    /**
     * Set settMode 结款方式（DIC）.
     */
    public void setSettMode(String settMode){
        this.settMode = settMode;
    }

    /**
     * Get settMode 结款方式（DIC）.
     *
     * @return the string
     */
    public String getSettMode(){
        return settMode;
    }

    /**
     * Set settType 结款类型（DIC）.
     */
    public void setSettType(String settType){
        this.settType = settType;
    }

    /**
     * Get settType 结款类型（DIC）.
     *
     * @return the string
     */
    public String getSettType(){
        return settType;
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
     * Set settStyle 结款形式（DIC）.
     */
    public void setSettStyle(String settStyle){
        this.settStyle = settStyle;
    }

    /**
     * Get settStyle 结款形式（DIC）.
     *
     * @return the string
     */
    public String getSettStyle(){
        return settStyle;
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
     * Set accountDay 账单日.
     */
    public void setAccountDay(Date accountDay){
        this.accountDay = accountDay;
    }

    /**
     * Get accountDay 账单日.
     *
     * @return the string
     */
    public Date getAccountDay(){
        return accountDay;
    }

    /**
     * Set clientCode 客户代码.
     */
    public void setClientCode(String clientCode){
        this.clientCode = clientCode;
    }

    /**
     * Get clientCode 客户代码.
     *
     * @return the string
     */
    public String getClientCode(){
        return clientCode;
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
     * Set settBankNo 结款-开户行账号.
     */
    public void setSettBankNo(String settBankNo){
        this.settBankNo = settBankNo;
    }

    /**
     * Get settBankNo 结款-开户行账号.
     *
     * @return the string
     */
    public String getSettBankNo(){
        return settBankNo;
    }

    /**
     * Set invoiceType 发票类型(DIC).
     */
    public void setInvoiceType(String invoiceType){
        this.invoiceType = invoiceType;
    }

    /**
     * Get invoiceType 发票类型(DIC).
     *
     * @return the string
     */
    public String getInvoiceType(){
        return invoiceType;
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
     * Set invoiceEmail 接收发票联系人邮箱.
     */
    public void setInvoiceEmail(String invoiceEmail){
        this.invoiceEmail = invoiceEmail;
    }

    /**
     * Get invoiceEmail 接收发票联系人邮箱.
     *
     * @return the string
     */
    public String getInvoiceEmail(){
        return invoiceEmail;
    }

    /**
     * Set invoiceTitle 发票抬头.
     */
    public void setInvoiceTitle(String invoiceTitle){
        this.invoiceTitle = invoiceTitle;
    }

    /**
     * Get invoiceTitle 发票抬头.
     *
     * @return the string
     */
    public String getInvoiceTitle(){
        return invoiceTitle;
    }

    /**
     * Set isProInvoice 是否专用发票.
     */
    public void setIsProInvoice(Integer isProInvoice){
        this.isProInvoice = isProInvoice;
    }

    /**
     * Get isProInvoice 是否专用发票.
     *
     * @return the string
     */
    public Integer getIsProInvoice(){
        return isProInvoice;
    }

    /**
     * Set settBankEmpl 结款-开户行姓名.
     */
    public void setSettBankEmpl(String settBankEmpl){
        this.settBankEmpl = settBankEmpl;
    }

    /**
     * Get settBankEmpl 结款-开户行姓名.
     *
     * @return the string
     */
    public String getSettBankEmpl(){
        return settBankEmpl;
    }

    /**
     * Set settBankName 结款-开户行名称.
     */
    public void setSettBankName(String settBankName){
        this.settBankName = settBankName;
    }

    /**
     * Get settBankName 结款-开户行名称.
     *
     * @return the string
     */
    public String getSettBankName(){
        return settBankName;
    }

    /**
     * Set invoiceBankNo 专用发票开户行账号.
     */
    public void setInvoiceBankNo(String invoiceBankNo){
        this.invoiceBankNo = invoiceBankNo;
    }

    /**
     * Get invoiceBankNo 专用发票开户行账号.
     *
     * @return the string
     */
    public String getInvoiceBankNo(){
        return invoiceBankNo;
    }

    /**
     * Set isOpenInvoice 是否开具发票.
     */
    public void setIsOpenInvoice(Integer isOpenInvoice){
        this.isOpenInvoice = isOpenInvoice;
    }

    /**
     * Get isOpenInvoice 是否开具发票.
     *
     * @return the string
     */
    public Integer getIsOpenInvoice(){
        return isOpenInvoice;
    }

    /**
     * Set invoiceAddress 接收发票联系人地址.
     */
    public void setInvoiceAddress(String invoiceAddress){
        this.invoiceAddress = invoiceAddress;
    }

    /**
     * Get invoiceAddress 接收发票联系人地址.
     *
     * @return the string
     */
    public String getInvoiceAddress(){
        return invoiceAddress;
    }

    /**
     * Set invoiceLinkman 接收发票联系人姓名.
     */
    public void setInvoiceLinkman(String invoiceLinkman){
        this.invoiceLinkman = invoiceLinkman;
    }

    /**
     * Get invoiceLinkman 接收发票联系人姓名.
     *
     * @return the string
     */
    public String getInvoiceLinkman(){
        return invoiceLinkman;
    }

    /**
     * Set invoiceLinktel 接收发票联系人电话.
     */
    public void setInvoiceLinktel(String invoiceLinktel){
        this.invoiceLinktel = invoiceLinktel;
    }

    /**
     * Get invoiceLinktel 接收发票联系人电话.
     *
     * @return the string
     */
    public String getInvoiceLinktel(){
        return invoiceLinktel;
    }

    /**
     * Set settBankCityId 结款-开户行市ID（FK）.
     */
    public void setSettBankCityId(Long settBankCityId){
        this.settBankCityId = settBankCityId;
    }

    /**
     * Get settBankCityId 结款-开户行市ID（FK）.
     *
     * @return the string
     */
    public Long getSettBankCityId(){
        return settBankCityId;
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
     * Set invoiceBankName 专用发票开户行名称.
     */
    public void setInvoiceBankName(String invoiceBankName){
        this.invoiceBankName = invoiceBankName;
    }

    /**
     * Get invoiceBankName 专用发票开户行名称.
     *
     * @return the string
     */
    public String getInvoiceBankName(){
        return invoiceBankName;
    }

    /**
     * Set accountUnitSpell 拼音码.
     */
    public void setAccountUnitSpell(String accountUnitSpell){
        this.accountUnitSpell = accountUnitSpell;
    }

    /**
     * Get accountUnitSpell 拼音码.
     *
     * @return the string
     */
    public String getAccountUnitSpell(){
        return accountUnitSpell;
    }

    /**
     * Set accountUnitSource 结算单位来源（DIC）.
     */
    public void setAccountUnitSource(String accountUnitSource){
        this.accountUnitSource = accountUnitSource;
    }

    /**
     * Get accountUnitSource 结算单位来源（DIC）.
     *
     * @return the string
     */
    public String getAccountUnitSource(){
        return accountUnitSource;
    }

    /**
     * Set invoiceTaxpayerNo 发票纳税人识别号.
     */
    public void setInvoiceTaxpayerNo(String invoiceTaxpayerNo){
        this.invoiceTaxpayerNo = invoiceTaxpayerNo;
    }

    /**
     * Get invoiceTaxpayerNo 发票纳税人识别号.
     *
     * @return the string
     */
    public String getInvoiceTaxpayerNo(){
        return invoiceTaxpayerNo;
    }

    /**
     * Set settBankDistrictId 结款-开户行区ID（FK）.
     */
    public void setSettBankDistrictId(Long settBankDistrictId){
        this.settBankDistrictId = settBankDistrictId;
    }

    /**
     * Get settBankDistrictId 结款-开户行区ID（FK）.
     *
     * @return the string
     */
    public Long getSettBankDistrictId(){
        return settBankDistrictId;
    }

    /**
     * Set settBankProvinceId 结款-开户行省ID（FK）.
     */
    public void setSettBankProvinceId(Long settBankProvinceId){
        this.settBankProvinceId = settBankProvinceId;
    }

    /**
     * Get settBankProvinceId 结款-开户行省ID（FK）.
     *
     * @return the string
     */
    public Long getSettBankProvinceId(){
        return settBankProvinceId;
    }

    /**
     * Set invoiceRegisteredTel 专有发票注册电话.
     */
    public void setInvoiceRegisteredTel(String invoiceRegisteredTel){
        this.invoiceRegisteredTel = invoiceRegisteredTel;
    }

    /**
     * Get invoiceRegisteredTel 专有发票注册电话.
     *
     * @return the string
     */
    public String getInvoiceRegisteredTel(){
        return invoiceRegisteredTel;
    }

    /**
     * Set invoiceRegisteredUnit 专有发票注册单位.
     */
    public void setInvoiceRegisteredUnit(String invoiceRegisteredUnit){
        this.invoiceRegisteredUnit = invoiceRegisteredUnit;
    }

    /**
     * Get invoiceRegisteredUnit 专有发票注册单位.
     *
     * @return the string
     */
    public String getInvoiceRegisteredUnit(){
        return invoiceRegisteredUnit;
    }

    /**
     * Set invoiceRegisteredAddress 专有发票注册详细地址.
     */
    public void setInvoiceRegisteredAddress(String invoiceRegisteredAddress){
        this.invoiceRegisteredAddress = invoiceRegisteredAddress;
    }

    /**
     * Get invoiceRegisteredAddress 专有发票注册详细地址.
     *
     * @return the string
     */
    public String getInvoiceRegisteredAddress(){
        return invoiceRegisteredAddress;
    }
}
