package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import com.xl.dy.dal.dataobject.TaMicroPageDO;

/**
 * The table TA_MICRO_PAGE TA_MICRO_PAGE
 */
public class QueryMicroListPage extends BasePage<TaMicroPageDO>{

    /**
     * microPageType 微页面平台类型(DIC).
     */
    private String microPageType;
    /**
     * mallId 商场ID.
     */
    private Long mallId;

    /**
     * Set microPageType 微页面平台类型(DIC).
     */
    public void setMicroPageType(String microPageType){
        this.microPageType = microPageType;
    }

    /**
     * Get microPageType 微页面平台类型(DIC).
     *
     * @return the string
     */
    public String getMicroPageType(){
        return microPageType;
    }

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
