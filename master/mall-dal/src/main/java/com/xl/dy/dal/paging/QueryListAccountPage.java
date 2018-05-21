package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import java.util.Map;

/**
 * The table TA_EMPL TA_EMPL
 */
public class QueryListAccountPage extends BasePage<Map>{

    /**
     * emplStatus 管理员状态（DIC）.
     */
    private String emplStatus;
    /**
     * platformType 平台类型（DIC）.
     */
    private String platformType;
    /**
     * value .
     */
    private String value;

    /**
     * Set emplStatus 管理员状态（DIC）.
     */
    public void setEmplStatus(String emplStatus){
        this.emplStatus = emplStatus;
    }

    /**
     * Get emplStatus 管理员状态（DIC）.
     *
     * @return the string
     */
    public String getEmplStatus(){
        return emplStatus;
    }

    /**
     * Set platformType 平台类型（DIC）.
     */
    public void setPlatformType(String platformType){
        this.platformType = platformType;
    }

    /**
     * Get platformType 平台类型（DIC）.
     *
     * @return the string
     */
    public String getPlatformType(){
        return platformType;
    }

    /**
     * Set value .
     */
    public void setValue(String value){
        this.value = value;
    }

    /**
     * Get value .
     *
     * @return the string
     */
    public String getValue(){
        return value;
    }
}
