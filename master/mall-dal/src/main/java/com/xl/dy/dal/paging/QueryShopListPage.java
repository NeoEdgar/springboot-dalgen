package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import com.xl.dy.dal.dataobject.TaShopDO;

/**
 * The table TA_SHOP TA_SHOP
 */
public class QueryShopListPage extends BasePage<TaShopDO>{

    /**
     * shopName 店铺名称.
     */
    private String shopName;

    /**
     * Set shopName 店铺名称.
     */
    public void setShopName(String shopName){
        this.shopName = shopName;
    }

    /**
     * Get shopName 店铺名称.
     *
     * @return the string
     */
    public String getShopName(){
        return shopName;
    }
}
