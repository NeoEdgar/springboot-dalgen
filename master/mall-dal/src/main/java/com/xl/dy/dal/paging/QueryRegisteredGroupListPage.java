package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import java.util.Map;

/**
 * The table TA_GROUP_REVIEW TA_GROUP_REVIEW
 */
public class QueryRegisteredGroupListPage extends BasePage<Map>{

    /**
     * shopId 店铺ID（FK）.
     */
    private Long shopId;

    /**
     * Set shopId 店铺ID（FK）.
     */
    public void setShopId(Long shopId){
        this.shopId = shopId;
    }

    /**
     * Get shopId 店铺ID（FK）.
     *
     * @return the string
     */
    public Long getShopId(){
        return shopId;
    }
}
