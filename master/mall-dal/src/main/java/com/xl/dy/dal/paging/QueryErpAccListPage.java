package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import java.util.Map;

/**
 * The table TA_ERP_ACC TA_ERP_ACC
 */
public class QueryErpAccListPage extends BasePage<Map>{

    /**
     * Name .
     */
    private String Name;

    /**
     * Set Name .
     */
    public void setName(String Name){
        this.Name = Name;
    }

    /**
     * Get Name .
     *
     * @return the string
     */
    public String getName(){
        return Name;
    }
}
