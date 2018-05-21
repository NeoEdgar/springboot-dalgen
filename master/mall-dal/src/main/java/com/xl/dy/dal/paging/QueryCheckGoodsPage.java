package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import com.xl.dy.dal.dataobject.TaGoodsAuditDO;
import java.util.Date;

/**
 * The table TA_GOODS_AUDIT TA_GOODS_AUDIT
 */
public class QueryCheckGoodsPage extends BasePage<TaGoodsAuditDO>{

    /**
     * auditEmplName 审核-专业公司审核人姓名.
     */
    private String auditEmplName;
    /**
     * auditSubmitTime AUDIT_SUBMIT_TIME.
     */
    private Date auditSubmitTime;
    /**
     * goodsId 商品ID.
     */
    private Long goodsId;
    /**
     * auditEndTime .
     */
    private Date auditEndTime;
    /**
     * auditStartTime .
     */
    private Date auditStartTime;
    /**
     * auditType AUDIT_TYPE.
     */
    private String auditType;
    /**
     * auditShopId AUDIT_SHOP_ID.
     */
    private Long auditShopId;
    /**
     * auditCompanyId AUDIT_COMPANY_ID.
     */
    private Long auditCompanyId;
    /**
     * goodsAuditStatus 审核-店铺提交商品信息的审核状态（DIC）.
     */
    private String goodsAuditStatus;

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
     * Set auditEndTime .
     */
    public void setAuditEndTime(Date auditEndTime){
        this.auditEndTime = auditEndTime;
    }

    /**
     * Get auditEndTime .
     *
     * @return the string
     */
    public Date getAuditEndTime(){
        return auditEndTime;
    }

    /**
     * Set auditStartTime .
     */
    public void setAuditStartTime(Date auditStartTime){
        this.auditStartTime = auditStartTime;
    }

    /**
     * Get auditStartTime .
     *
     * @return the string
     */
    public Date getAuditStartTime(){
        return auditStartTime;
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
