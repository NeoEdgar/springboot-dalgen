package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import java.util.Map;

/**
 * The table TA_SHOP TA_SHOP
 */
public class QueryShopForMicroPagePage extends BasePage<Map>{

    /**
     * searchStr .
     */
    private String searchStr;
    /**
     * shopId .
     */
    private Long shopId;

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
     * Set shopId .
     */
    public void setShopId(Long shopId){
        this.shopId = shopId;
    }

    /**
     * Get shopId .
     *
     * @return the string
     */
    public Long getShopId(){
        return shopId;
    }
}
