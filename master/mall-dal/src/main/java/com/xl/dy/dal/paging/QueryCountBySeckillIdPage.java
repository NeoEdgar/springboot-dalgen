package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import java.util.Map;

/**
 * The table TA_SECKILL_REVIEW TA_SECKILL_REVIEW
 */
public class QueryCountBySeckillIdPage extends BasePage<Map>{

    /**
     * seckillId 优惠卷ID（FK）.
     */
    private Long seckillId;

    /**
     * Set seckillId 优惠卷ID（FK）.
     */
    public void setSeckillId(Long seckillId){
        this.seckillId = seckillId;
    }

    /**
     * Get seckillId 优惠卷ID（FK）.
     *
     * @return the string
     */
    public Long getSeckillId(){
        return seckillId;
    }
}
