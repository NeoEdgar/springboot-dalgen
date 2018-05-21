package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import java.util.Map;

/**
 * The table TA_GROUP_REVIEW TA_GROUP_REVIEW
 */
public class QueryGoodsByGroupPage extends BasePage<Map>{

    /**
     * groupId 拼团ID（FK）.
     */
    private Long groupId;

    /**
     * Set groupId 拼团ID（FK）.
     */
    public void setGroupId(Long groupId){
        this.groupId = groupId;
    }

    /**
     * Get groupId 拼团ID（FK）.
     *
     * @return the string
     */
    public Long getGroupId(){
        return groupId;
    }
}
