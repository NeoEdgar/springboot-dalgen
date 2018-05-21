package com.xl.dy.dal.paging;

import java.util.Map;

/**
 * The table TA_GROUP TA_GROUP
 */
public class QueryGroupActivityPage extends BasePage<Map>{

    /**
     * searchStr .
     */
    private String searchStr;
    /**
     * groupStatus 秒杀活动状态（DIC）.
     */
    private String groupStatus;

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
     * Set groupStatus 秒杀活动状态（DIC）.
     */
    public void setGroupStatus(String groupStatus){
        this.groupStatus = groupStatus;
    }

    /**
     * Get groupStatus 秒杀活动状态（DIC）.
     *
     * @return the string
     */
    public String getGroupStatus(){
        return groupStatus;
    }
}
