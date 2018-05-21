package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_GOODS_AUDIT
 */
public class TaGoodsAuditDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * isShow 是否显示审核记录.
     */
    private Integer isShow;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * goodsId 商品ID.
     */
    private Long goodsId;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * auditTime 审核-专业公司审核时间.
     */
    private Date auditTime;
    /**
     * auditType AUDIT_TYPE.
     */
    private String auditType;
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
     * auditEmplId 审核-专业公司审核人ID（FK）.
     */
    private Long auditEmplId;
    /**
     * auditShopId AUDIT_SHOP_ID.
     */
    private Long auditShopId;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * rejectReason 审核-店铺提交商品审核被拒绝原因.
     */
    private String rejectReason;
    /**
     * auditEmplName 审核-专业公司审核人姓名.
     */
    private String auditEmplName;
    /**
     * auditInfoJson 审核信息JSON.
     */
    private String auditInfoJson;
    /**
     * auditCompanyId AUDIT_COMPANY_ID.
     */
    private Long auditCompanyId;
    /**
     * auditSubmitTime AUDIT_SUBMIT_TIME.
     */
    private Date auditSubmitTime;
    /**
     * goodsAuditStatus 审核-店铺提交商品信息的审核状态（DIC）.
     */
    private String goodsAuditStatus;

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
     * Set isShow 是否显示审核记录.
     */
    public void setIsShow(Integer isShow){
        this.isShow = isShow;
    }

    /**
     * Get isShow 是否显示审核记录.
     *
     * @return the string
     */
    public Integer getIsShow(){
        return isShow;
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
     * Set auditTime 审核-专业公司审核时间.
     */
    public void setAuditTime(Date auditTime){
        this.auditTime = auditTime;
    }

    /**
     * Get auditTime 审核-专业公司审核时间.
     *
     * @return the string
     */
    public Date getAuditTime(){
        return auditTime;
    }

    /**
     * Set auditType AUDIT_TYPE.
     */
    public void setAuditType(String auditType){
        this.auditType = auditType;
    }

    /**
     * Get auditType AUDIT_TYPE.
     *
     * @return the string
     */
    public String getAuditType(){
        return auditType;
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
     * Set auditEmplId 审核-专业公司审核人ID（FK）.
     */
    public void setAuditEmplId(Long auditEmplId){
        this.auditEmplId = auditEmplId;
    }

    /**
     * Get auditEmplId 审核-专业公司审核人ID（FK）.
     *
     * @return the string
     */
    public Long getAuditEmplId(){
        return auditEmplId;
    }

    /**
     * Set auditShopId AUDIT_SHOP_ID.
     */
    public void setAuditShopId(Long auditShopId){
        this.auditShopId = auditShopId;
    }

    /**
     * Get auditShopId AUDIT_SHOP_ID.
     *
     * @return the string
     */
    public Long getAuditShopId(){
        return auditShopId;
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
     * Set rejectReason 审核-店铺提交商品审核被拒绝原因.
     */
    public void setRejectReason(String rejectReason){
        this.rejectReason = rejectReason;
    }

    /**
     * Get rejectReason 审核-店铺提交商品审核被拒绝原因.
     *
     * @return the string
     */
    public String getRejectReason(){
        return rejectReason;
    }

    /**
     * Set auditEmplName 审核-专业公司审核人姓名.
     */
    public void setAuditEmplName(String auditEmplName){
        this.auditEmplName = auditEmplName;
    }

    /**
     * Get auditEmplName 审核-专业公司审核人姓名.
     *
     * @return the string
     */
    public String getAuditEmplName(){
        return auditEmplName;
    }

    /**
     * Set auditInfoJson 审核信息JSON.
     */
    public void setAuditInfoJson(String auditInfoJson){
        this.auditInfoJson = auditInfoJson;
    }

    /**
     * Get auditInfoJson 审核信息JSON.
     *
     * @return the string
     */
    public String getAuditInfoJson(){
        return auditInfoJson;
    }

    /**
     * Set auditCompanyId AUDIT_COMPANY_ID.
     */
    public void setAuditCompanyId(Long auditCompanyId){
        this.auditCompanyId = auditCompanyId;
    }

    /**
     * Get auditCompanyId AUDIT_COMPANY_ID.
     *
     * @return the string
     */
    public Long getAuditCompanyId(){
        return auditCompanyId;
    }

    /**
     * Set auditSubmitTime AUDIT_SUBMIT_TIME.
     */
    public void setAuditSubmitTime(Date auditSubmitTime){
        this.auditSubmitTime = auditSubmitTime;
    }

    /**
     * Get auditSubmitTime AUDIT_SUBMIT_TIME.
     *
     * @return the string
     */
    public Date getAuditSubmitTime(){
        return auditSubmitTime;
    }

    /**
     * Set goodsAuditStatus 审核-店铺提交商品信息的审核状态（DIC）.
     */
    public void setGoodsAuditStatus(String goodsAuditStatus){
        this.goodsAuditStatus = goodsAuditStatus;
    }

    /**
     * Get goodsAuditStatus 审核-店铺提交商品信息的审核状态（DIC）.
     *
     * @return the string
     */
    public String getGoodsAuditStatus(){
        return goodsAuditStatus;
    }
}
