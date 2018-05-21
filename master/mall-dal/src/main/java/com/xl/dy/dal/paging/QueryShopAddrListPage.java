package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import com.xl.dy.dal.dataobject.TaShopSendAddrDO;

/**
 * The table TA_SHOP_SEND_ADDR TA_SHOP_SEND_ADDR
 */
public class QueryShopAddrListPage extends BasePage<TaShopSendAddrDO>{

    /**
     * shopId 店铺信息ID（FK）.
     */
    private Long shopId;

    /**
     * Set shopId 店铺信息ID（FK）.
     */
    public void setShopId(Long shopId){
        this.shopId = shopId;
    }

    /**
     * Get shopId 店铺信息ID（FK）.
     *
     * @return the string
     */
    public Long getShopId(){
        return shopId;
    }
}
