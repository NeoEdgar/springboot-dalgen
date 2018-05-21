package com.xl.dy.dal.paging;

import java.util.Map;
import java.util.Date;

/**
 * The table TA_CONTRACT TA_CONTRACT
 */
public class QueryTerminationContractListByMallPage extends BasePage<Map>{

    /**
     * firstTime .
     */
    private Date firstTime;
    /**
     * lastTime .
     */
    private Date lastTime;
    /**
     * mallId .
     */
    private Long mallId;

    /**
     * Set firstTime .
     */
    public void setFirstTime(Date firstTime){
        this.firstTime = firstTime;
    }

    /**
     * Get firstTime .
     *
     * @return the string
     */
    public Date getFirstTime(){
        return firstTime;
    }

    /**
     * Set lastTime .
     */
    public void setLastTime(Date lastTime){
        this.lastTime = lastTime;
    }

    /**
     * Get lastTime .
     *
     * @return the string
     */
    public Date getLastTime(){
        return lastTime;
    }

    /**
     * Set mallId .
     */
    public void setMallId(Long mallId){
        this.mallId = mallId;
    }

    /**
     * Get mallId .
     *
     * @return the string
     */
    public Long getMallId(){
        return mallId;
    }
}
