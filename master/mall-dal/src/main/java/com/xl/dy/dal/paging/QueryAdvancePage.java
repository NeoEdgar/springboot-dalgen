package com.xl.dy.dal.paging;

import java.util.Map;

/**
 * The table TA_ADVANCE TA_ADVANCE
 */
public class QueryAdvancePage extends BasePage<Map>{

    /**
     * searchStr .
     */
    private String searchStr;
    /**
     * advanceStatus 预售活动状态（DIC）.
     */
    private String advanceStatus;

    /**
     * Set searchStr .
     */
    public void setSearchStr(String searchStr){
        this.searchStr = searchStr;
    }

    /**
     * Get searchStr .
     *
     * @return the string
     */
    public String getSearchStr(){
        return searchStr;
    }

    /**
     * Set advanceStatus 预售活动状态（DIC）.
     */
    public void setAdvanceStatus(String advanceStatus){
        this.advanceStatus = advanceStatus;
    }

    /**
     * Get advanceStatus 预售活动状态（DIC）.
     *
     * @return the string
     */
    public String getAdvanceStatus(){
        return advanceStatus;
    }
}
