package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import com.xl.dy.dal.dataobject.TgMkCategoryDO;

/**
 * The table TG_MK_CATEGORY TG_MK_CATEGORY
 */
public class QueryMkCategoryListPage extends BasePage<TgMkCategoryDO>{

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
