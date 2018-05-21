package com.xl.dy.dal.paging;

import java.util.Map;

/**
 * The table TG_ACCOUNT_UNIT TG_ACCOUNT_UNIT
 */
public class QueryAccountUnitPagePage extends BasePage<Map>{

    /**
     * accountName .
     */
    private String accountName;
    /**
     * clientCode 客户代码.
     */
    private String clientCode;

    /**
     * Set accountName .
     */
    public void setAccountName(String accountName){
        this.accountName = accountName;
    }

    /**
     * Get accountName .
     *
     * @return the string
     */
    public String getAccountName(){
        return accountName;
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
}
