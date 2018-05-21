package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import com.xl.dy.dal.dataobject.TaDraftGoodsDO;

/**
 * The table TA_DRAFT_GOODS TA_DRAFT_GOODS
 */
public class QueryDraftGoodsListPage extends BasePage<TaDraftGoodsDO>{

    /**
     * draftUnitId DRAFT_UNIT_ID.
     */
    private Long draftUnitId;

    /**
     * Set draftUnitId DRAFT_UNIT_ID.
     */
    public void setDraftUnitId(Long draftUnitId){
        this.draftUnitId = draftUnitId;
    }

    /**
     * Get draftUnitId DRAFT_UNIT_ID.
     *
     * @return the string
     */
    public Long getDraftUnitId(){
        return draftUnitId;
    }
}
