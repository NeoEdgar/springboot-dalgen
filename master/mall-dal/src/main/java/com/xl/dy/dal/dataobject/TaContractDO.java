package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_CONTRACT
 */
public class TaContractDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * paId 甲方ID（FK）.
     */
    private Long paId;
    /**
     * pbId 乙方ID（FK）.
     */
    private Long pbId;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * endDate 合同结束日期.
     */
    private Date endDate;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * isForever 是否永久生效.
     */
    private Integer isForever;
    /**
     * startDate 合同生效日期.
     */
    private Date startDate;
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
     * contractLev 合同优先级.
     */
    private Integer contractLev;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * contractName 合同名称.
     */
    private String contractName;
    /**
     * contractText 合同文本.
     */
    private String contractText;
    /**
     * contractType 合同类型（DIC）.
     */
    private String contractType;
    /**
     * accountUnitId 结算单位（FK）.
     */
    private Long accountUnitId;
    /**
     * contractNumber 合同编号.
     */
    private String contractNumber;
    /**
     * contractStatus 合同状态（DIC）.
     */
    private String contractStatus;
    /**
     * mgCategoryText 主营类目文本.
     */
    private String mgCategoryText;

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
     * Set paId 甲方ID（FK）.
     */
    public void setPaId(Long paId){
        this.paId = paId;
    }

    /**
     * Get paId 甲方ID（FK）.
     *
     * @return the string
     */
    public Long getPaId(){
        return paId;
    }

    /**
     * Set pbId 乙方ID（FK）.
     */
    public void setPbId(Long pbId){
        this.pbId = pbId;
    }

    /**
     * Get pbId 乙方ID（FK）.
     *
     * @return the string
     */
    public Long getPbId(){
        return pbId;
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
     * Set endDate 合同结束日期.
     */
    public void setEndDate(Date endDate){
        this.endDate = endDate;
    }

    /**
     * Get endDate 合同结束日期.
     *
     * @return the string
     */
    public Date getEndDate(){
        return endDate;
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
     * Set isForever 是否永久生效.
     */
    public void setIsForever(Integer isForever){
        this.isForever = isForever;
    }

    /**
     * Get isForever 是否永久生效.
     *
     * @return the string
     */
    public Integer getIsForever(){
        return isForever;
    }

    /**
     * Set startDate 合同生效日期.
     */
    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }

    /**
     * Get startDate 合同生效日期.
     *
     * @return the string
     */
    public Date getStartDate(){
        return startDate;
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
     * Set contractLev 合同优先级.
     */
    public void setContractLev(Integer contractLev){
        this.contractLev = contractLev;
    }

    /**
     * Get contractLev 合同优先级.
     *
     * @return the string
     */
    public Integer getContractLev(){
        return contractLev;
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
     * Set contractName 合同名称.
     */
    public void setContractName(String contractName){
        this.contractName = contractName;
    }

    /**
     * Get contractName 合同名称.
     *
     * @return the string
     */
    public String getContractName(){
        return contractName;
    }

    /**
     * Set contractText 合同文本.
     */
    public void setContractText(String contractText){
        this.contractText = contractText;
    }

    /**
     * Get contractText 合同文本.
     *
     * @return the string
     */
    public String getContractText(){
        return contractText;
    }

    /**
     * Set contractType 合同类型（DIC）.
     */
    public void setContractType(String contractType){
        this.contractType = contractType;
    }

    /**
     * Get contractType 合同类型（DIC）.
     *
     * @return the string
     */
    public String getContractType(){
        return contractType;
    }

    /**
     * Set accountUnitId 结算单位（FK）.
     */
    public void setAccountUnitId(Long accountUnitId){
        this.accountUnitId = accountUnitId;
    }

    /**
     * Get accountUnitId 结算单位（FK）.
     *
     * @return the string
     */
    public Long getAccountUnitId(){
        return accountUnitId;
    }

    /**
     * Set contractNumber 合同编号.
     */
    public void setContractNumber(String contractNumber){
        this.contractNumber = contractNumber;
    }

    /**
     * Get contractNumber 合同编号.
     *
     * @return the string
     */
    public String getContractNumber(){
        return contractNumber;
    }

    /**
     * Set contractStatus 合同状态（DIC）.
     */
    public void setContractStatus(String contractStatus){
        this.contractStatus = contractStatus;
    }

    /**
     * Get contractStatus 合同状态（DIC）.
     *
     * @return the string
     */
    public String getContractStatus(){
        return contractStatus;
    }

    /**
     * Set mgCategoryText 主营类目文本.
     */
    public void setMgCategoryText(String mgCategoryText){
        this.mgCategoryText = mgCategoryText;
    }

    /**
     * Get mgCategoryText 主营类目文本.
     *
     * @return the string
     */
    public String getMgCategoryText(){
        return mgCategoryText;
    }
}
