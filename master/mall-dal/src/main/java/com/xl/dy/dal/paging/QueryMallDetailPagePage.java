package com.xl.dy.dal.paging;

import java.util.Map;

/**
 * The table TG_ACCOUNT_UNIT TG_ACCOUNT_UNIT
 */
public class QueryMallDetailPagePage extends BasePage<Map>{

    /**
     * accountId .
     */
    private Long accountId;

    /**
     * Set accountId .
     */
    public void setAccountId(Long accountId){
        this.accountId = accountId;
    }

    /**
     * Get accountId .
     *
     * @return the string
     */
    public Long getAccountId(){
        return accountId;
    }
}
