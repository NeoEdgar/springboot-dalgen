package com.xl.dy.dal.paging;

import com.xl.dy.dal.dataobject.TaBannerDO;

/**
 * The table TA_BANNER TA_BANNER
 */
public class QueryBannerListPage extends BasePage<TaBannerDO>{

    /**
     * bannerType BANNER类型（DIC）.
     */
    private String bannerType;
    /**
     * mallId 商场ID（FK）.
     */
    private Long mallId;

    /**
     * Set bannerType BANNER类型（DIC）.
     */
    public void setBannerType(String bannerType){
        this.bannerType = bannerType;
    }

    /**
     * Get bannerType BANNER类型（DIC）.
     *
     * @return the string
     */
    public String getBannerType(){
        return bannerType;
    }

    /**
     * Set mallId 商场ID（FK）.
     */
    public void setMallId(Long mallId){
        this.mallId = mallId;
    }

    /**
     * Get mallId 商场ID（FK）.
     *
     * @return the string
     */
    public Long getMallId(){
        return mallId;
    }
}
