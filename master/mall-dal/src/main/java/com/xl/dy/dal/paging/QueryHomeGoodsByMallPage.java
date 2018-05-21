package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import java.util.Map;

/**
 * The table TA_MALL_HOME_GOODS TA_MALL_HOME_GOODS
 */
public class QueryHomeGoodsByMallPage extends BasePage<Map>{

    /**
     * mallId 商场ID.
     */
    private Long mallId;
    /**
     * mouduleNameId .
     */
    private Long mouduleNameId;

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

    /**
     * Set mouduleNameId .
     */
    public void setMouduleNameId(Long mouduleNameId){
        this.mouduleNameId = mouduleNameId;
    }

    /**
     * Get mouduleNameId .
     *
     * @return the string
     */
    public Long getMouduleNameId(){
        return mouduleNameId;
    }
}
