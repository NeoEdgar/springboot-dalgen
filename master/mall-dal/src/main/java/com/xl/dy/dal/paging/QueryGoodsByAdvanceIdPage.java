package com.xl.dy.dal.paging;

import java.util.Map;

/**
 * The table TA_ADVANCE_REVIEW TA_ADVANCE_REVIEW
 */
public class QueryGoodsByAdvanceIdPage extends BasePage<Map>{

    /**
     * advanceId 预售活动ID（FK）.
     */
    private Long advanceId;

    /**
     * Set advanceId 预售活动ID（FK）.
     */
    public void setAdvanceId(Long advanceId){
        this.advanceId = advanceId;
    }

    /**
     * Get advanceId 预售活动ID（FK）.
     *
     * @return the string
     */
    public Long getAdvanceId(){
        return advanceId;
    }
}
