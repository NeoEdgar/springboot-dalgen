package com.xl.dy.dal.dataobject;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The table TA_CONTRACT_CHGINV_CATEGORY
 */
public class TaContractChginvCategoryDO{

    /**
     * dp 扣点.
     */
    private BigDecimal dp;
    /**
     * id ID.
     */
    private Long id;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * pointRate 积分比率.
     */
    private BigDecimal pointRate;
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
     * mgCategoryId 管理类目ID（FK）.
     */
    private Long mgCategoryId;
    /**
     * contractChgInvoicesId 合同变更申请单ID（FK）.
     */
    private Long contractChgInvoicesId;

    /**
     * Set dp 扣点.
     */
    public void setDp(BigDecimal dp){
        this.dp = dp;
    }

    /**
     * Get dp 扣点.
     *
     * @return the string
     */
    public BigDecimal getDp(){
        return dp;
    }

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
     * Set pointRate 积分比率.
     */
    public void setPointRate(BigDecimal pointRate){
        this.pointRate = pointRate;
    }

    /**
     * Get pointRate 积分比率.
     *
     * @return the string
     */
    public BigDecimal getPointRate(){
        return pointRate;
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
     * Set mgCategoryId 管理类目ID（FK）.
     */
    public void setMgCategoryId(Long mgCategoryId){
        this.mgCategoryId = mgCategoryId;
    }

    /**
     * Get mgCategoryId 管理类目ID（FK）.
     *
     * @return the string
     */
    public Long getMgCategoryId(){
        return mgCategoryId;
    }

    /**
     * Set contractChgInvoicesId 合同变更申请单ID（FK）.
     */
    public void setContractChgInvoicesId(Long contractChgInvoicesId){
        this.contractChgInvoicesId = contractChgInvoicesId;
    }

    /**
     * Get contractChgInvoicesId 合同变更申请单ID（FK）.
     *
     * @return the string
     */
    public Long getContractChgInvoicesId(){
        return contractChgInvoicesId;
    }
}
