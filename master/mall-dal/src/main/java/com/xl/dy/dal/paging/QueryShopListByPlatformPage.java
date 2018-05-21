package com.xl.dy.dal.paging;

import com.xl.dy.dal.dataobject.TaShopDO;

/**
 * The table TA_SHOP TA_SHOP
 */
public class QueryShopListByPlatformPage extends BasePage<TaShopDO>{

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
