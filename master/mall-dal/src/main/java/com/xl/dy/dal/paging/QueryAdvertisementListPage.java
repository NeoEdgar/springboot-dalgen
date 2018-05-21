package com.xl.dy.dal.paging;

import com.xl.dy.dal.dataobject.TaAdvertisementDO;

/**
 * The table TA_ADVERTISEMENT TA_ADVERTISEMENT
 */
public class QueryAdvertisementListPage extends BasePage<TaAdvertisementDO>{

    /**
     * advertiseType 广告位类型（DIC）.
     */
    private String advertiseType;
    /**
     * mallId 商场ID（FK）.
     */
    private Long mallId;

    /**
     * Set advertiseType 广告位类型（DIC）.
     */
    public void setAdvertiseType(String advertiseType){
        this.advertiseType = advertiseType;
    }

    /**
     * Get advertiseType 广告位类型（DIC）.
     *
     * @return the string
     */
    public String getAdvertiseType(){
        return advertiseType;
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
