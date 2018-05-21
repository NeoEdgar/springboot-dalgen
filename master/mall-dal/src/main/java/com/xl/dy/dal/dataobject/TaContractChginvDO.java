package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_CONTRACT_CHGINV
 */
public class TaContractChginvDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * chgTime 变更申请时间.
     */
    private Date chgTime;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * chgEmplId 变更申请人ID(FK).
     */
    private Long chgEmplId;
    /**
     * timestamp 公共-时间戳.
     */
    private Long timestamp;
    /**
     * contractId 合同列表ID(FK).
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
     * chgEmplName 变更申请人姓名.
     */
    private String chgEmplName;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * planExecTime 计划执行时间.
     */
    private Date planExecTime;
    /**
     * contractChgType 合同变更类型(DIC).
     */
    private String contractChgType;
    /**
     * realityExecTime 实际执行时间.
     */
    private Date realityExecTime;
    /**
     * contractChgExecMode 合同变更执行方式（DIC）.
     */
    private String contractChgExecMode;
    /**
     * contractChangeStatus 单据状态(DIC).
     */
    private String contractChangeStatus;

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
     * Set chgTime 变更申请时间.
     */
    public void setChgTime(Date chgTime){
        this.chgTime = chgTime;
    }

    /**
     * Get chgTime 变更申请时间.
     *
     * @return the string
     */
    public Date getChgTime(){
        return chgTime;
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
     * Set chgEmplId 变更申请人ID(FK).
     */
    public void setChgEmplId(Long chgEmplId){
        this.chgEmplId = chgEmplId;
    }

    /**
     * Get chgEmplId 变更申请人ID(FK).
     *
     * @return the string
     */
    public Long getChgEmplId(){
        return chgEmplId;
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
     * Set contractId 合同列表ID(FK).
     */
    public void setContractId(Long contractId){
        this.contractId = contractId;
    }

    /**
     * Get contractId 合同列表ID(FK).
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
     * Set chgEmplName 变更申请人姓名.
     */
    public void setChgEmplName(String chgEmplName){
        this.chgEmplName = chgEmplName;
    }

    /**
     * Get chgEmplName 变更申请人姓名.
     *
     * @return the string
     */
    public String getChgEmplName(){
        return chgEmplName;
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
     * Set planExecTime 计划执行时间.
     */
    public void setPlanExecTime(Date planExecTime){
        this.planExecTime = planExecTime;
    }

    /**
     * Get planExecTime 计划执行时间.
     *
     * @return the string
     */
    public Date getPlanExecTime(){
        return planExecTime;
    }

    /**
     * Set contractChgType 合同变更类型(DIC).
     */
    public void setContractChgType(String contractChgType){
        this.contractChgType = contractChgType;
    }

    /**
     * Get contractChgType 合同变更类型(DIC).
     *
     * @return the string
     */
    public String getContractChgType(){
        return contractChgType;
    }

    /**
     * Set realityExecTime 实际执行时间.
     */
    public void setRealityExecTime(Date realityExecTime){
        this.realityExecTime = realityExecTime;
    }

    /**
     * Get realityExecTime 实际执行时间.
     *
     * @return the string
     */
    public Date getRealityExecTime(){
        return realityExecTime;
    }

    /**
     * Set contractChgExecMode 合同变更执行方式（DIC）.
     */
    public void setContractChgExecMode(String contractChgExecMode){
        this.contractChgExecMode = contractChgExecMode;
    }

    /**
     * Get contractChgExecMode 合同变更执行方式（DIC）.
     *
     * @return the string
     */
    public String getContractChgExecMode(){
        return contractChgExecMode;
    }

    /**
     * Set contractChangeStatus 单据状态(DIC).
     */
    public void setContractChangeStatus(String contractChangeStatus){
        this.contractChangeStatus = contractChangeStatus;
    }

    /**
     * Get contractChangeStatus 单据状态(DIC).
     *
     * @return the string
     */
    public String getContractChangeStatus(){
        return contractChangeStatus;
    }
}
