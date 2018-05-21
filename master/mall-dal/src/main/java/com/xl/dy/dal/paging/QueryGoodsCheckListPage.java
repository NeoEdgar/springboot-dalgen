package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import com.xl.dy.dal.resultmap.GoodCheckVO;
import java.util.Date;

/**
 * The table TA_SHOP_GOODS TA_SHOP_GOODS
 */
public class QueryGoodsCheckListPage extends BasePage<GoodCheckVO>{

    /**
     * auditEmplName .
     */
    private String auditEmplName;
    /**
     * companyId 专业公司ID（FK）.
     */
    private Long companyId;
    /**
     * auditTime .
     */
    private Date auditTime;
    /**
     * auditStatus .
     */
    private String auditStatus;

    /**
     * Set auditEmplName .
     */
    public void setAuditEmplName(String auditEmplName){
        this.auditEmplName = auditEmplName;
    }

    /**
     * Get auditEmplName .
     *
     * @return the string
     */
    public String getAuditEmplName(){
        return auditEmplName;
    }

    /**
     * Set companyId 专业公司ID（FK）.
     */
    public void setCompanyId(Long companyId){
        this.companyId = companyId;
    }

    /**
     * Get companyId 专业公司ID（FK）.
     *
     * @return the string
     */
    public Long getCompanyId(){
        return companyId;
    }

    /**
     * Set auditTime .
     */
    public void setAuditTime(Date auditTime){
        this.auditTime = auditTime;
    }

    /**
     * Get auditTime .
     *
     * @return the string
     */
    public Date getAuditTime(){
        return auditTime;
    }

    /**
     * Set auditStatus .
     */
    public void setAuditStatus(String auditStatus){
        this.auditStatus = auditStatus;
    }

    /**
     * Get auditStatus .
     *
     * @return the string
     */
    public String getAuditStatus(){
        return auditStatus;
    }
}
