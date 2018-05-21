package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import java.util.Map;

/**
 * The table TA_COMPANY TA_COMPANY
 */
public class QueryCompanyListPage extends BasePage<Map>{

    /**
     * companyName 专业公司名称.
     */
    private String companyName;
    /**
     * companyStatus 专业公司状态（DIC）.
     */
    private String companyStatus;

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
     * Set companyStatus 专业公司状态（DIC）.
     */
    public void setCompanyStatus(String companyStatus){
        this.companyStatus = companyStatus;
    }

    /**
     * Get companyStatus 专业公司状态（DIC）.
     *
     * @return the string
     */
    public String getCompanyStatus(){
        return companyStatus;
    }
}
