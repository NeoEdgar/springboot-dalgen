package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import com.xl.dy.dal.dataobject.TgMgCategoryDO;

/**
 * The table TG_MG_CATEGORY TG_MG_CATEGORY
 */
public class QueryMgCategoryListPage extends BasePage<TgMgCategoryDO>{

    /**
     * lev 类目层级.
     */
    private Integer lev;

    /**
     * Set lev 类目层级.
     */
    public void setLev(Integer lev){
        this.lev = lev;
    }

    /**
     * Get lev 类目层级.
     *
     * @return the string
     */
    public Integer getLev(){
        return lev;
    }
}
