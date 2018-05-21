package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import java.util.Map;

/**
 * The table TA_MALL TA_MALL
 */
public class QueryMallListPage extends BasePage<Map>{

    /**
     * mallName 商场名称.
     */
    private String mallName;
    /**
     * mallStatus 商场状态（DIC）.
     */
    private String mallStatus;
    /**
     * cityId 所在市(FK).
     */
    private Long cityId;
    /**
     * mallType 商场类型（DIC）.
     */
    private String mallType;

    /**
     * Set mallName 商场名称.
     */
    public void setMallName(String mallName){
        this.mallName = mallName;
    }

    /**
     * Get mallName 商场名称.
     *
     * @return the string
     */
    public String getMallName(){
        return mallName;
    }

    /**
     * Set mallStatus 商场状态（DIC）.
     */
    public void setMallStatus(String mallStatus){
        this.mallStatus = mallStatus;
    }

    /**
     * Get mallStatus 商场状态（DIC）.
     *
     * @return the string
     */
    public String getMallStatus(){
        return mallStatus;
    }

    /**
     * Set cityId 所在市(FK).
     */
    public void setCityId(Long cityId){
        this.cityId = cityId;
    }

    /**
     * Get cityId 所在市(FK).
     *
     * @return the string
     */
    public Long getCityId(){
        return cityId;
    }

    /**
     * Set mallType 商场类型（DIC）.
     */
    public void setMallType(String mallType){
        this.mallType = mallType;
    }

    /**
     * Get mallType 商场类型（DIC）.
     *
     * @return the string
     */
    public String getMallType(){
        return mallType;
    }
}
