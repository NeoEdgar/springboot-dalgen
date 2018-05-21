package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import java.util.Map;

/**
 * The table TA_SHOP TA_SHOP
 */
public class QueryShopListByMallPage extends BasePage<Map>{

    /**
     * shopStatus 店铺状态（DIC）.
     */
    private String shopStatus;
    /**
     * searchStr .
     */
    private String searchStr;

    /**
     * Set shopStatus 店铺状态（DIC）.
     */
    public void setShopStatus(String shopStatus){
        this.shopStatus = shopStatus;
    }

    /**
     * Get shopStatus 店铺状态（DIC）.
     *
     * @return the string
     */
    public String getShopStatus(){
        return shopStatus;
    }

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
