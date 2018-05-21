package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import com.xl.dy.dal.dataobject.TgMgCategoryDO;

/**
 * The table TG_MG_CATEGORY TG_MG_CATEGORY
 */
public class QueryCategoryListPage extends BasePage<TgMgCategoryDO>{

    /**
     * catStr .
     */
    private String catStr;

    /**
     * Set catStr .
     */
    public void setCatStr(String catStr){
        this.catStr = catStr;
    }

    /**
     * Get catStr .
     *
     * @return the string
     */
    public String getCatStr(){
        return catStr;
    }
}
