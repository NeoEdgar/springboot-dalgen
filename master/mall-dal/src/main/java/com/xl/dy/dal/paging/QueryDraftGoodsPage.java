package com.xl.dy.dal.paging;

import com.xl.dy.dal.resultmap.GoodShowVO;

/**
 * The table TA_GOODS TA_GOODS
 */
public class QueryDraftGoodsPage extends BasePage<GoodShowVO>{

    /**
     * companyId .
     */
    private Long companyId;

    /**
     * Set companyId .
     */
    public void setCompanyId(Long companyId){
        this.companyId = companyId;
    }

    /**
     * Get companyId .
     *
     * @return the string
     */
    public Long getCompanyId(){
        return companyId;
    }
}
