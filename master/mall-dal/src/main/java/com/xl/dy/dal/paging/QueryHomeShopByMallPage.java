package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import java.util.Map;

/**
 * The table TA_MALL_HOME_SHOP TA_MALL_HOME_SHOP
 */
public class QueryHomeShopByMallPage extends BasePage<Map>{

    /**
     * mallId 商场ID.
     */
    private Long mallId;

    /**
     * Set mallId 商场ID.
     */
    public void setMallId(Long mallId){
        this.mallId = mallId;
    }

    /**
     * Get mallId 商场ID.
     *
     * @return the string
     */
    public Long getMallId(){
        return mallId;
    }
}
