package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import java.util.Map;

/**
 * The table TA_SECKILL TA_SECKILL
 */
public class QuerySeckillPage extends BasePage<Map>{

    /**
     * searchStr .
     */
    private String searchStr;
    /**
     * seckillStatus 秒杀活动状态（DIC）.
     */
    private String seckillStatus;

    /**
     * Set searchStr .
     */
    public void setSearchStr(String searchStr){
        this.searchStr = searchStr;
    }

    /**
     * Get searchStr .
     *
     * @return the string
     */
    public String getSearchStr(){
        return searchStr;
    }

    /**
     * Set seckillStatus 秒杀活动状态（DIC）.
     */
    public void setSeckillStatus(String seckillStatus){
        this.seckillStatus = seckillStatus;
    }

    /**
     * Get seckillStatus 秒杀活动状态（DIC）.
     *
     * @return the string
     */
    public String getSeckillStatus(){
        return seckillStatus;
    }
}
