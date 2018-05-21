package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import com.xl.dy.dal.dataobject.TaSeckillDO;

/**
 * The table TA_SECKILL TA_SECKILL
 */
public class QuerySpikeActivityListPage extends BasePage<TaSeckillDO>{

    /**
     * searchStr .
     */
    private String searchStr;

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
}
