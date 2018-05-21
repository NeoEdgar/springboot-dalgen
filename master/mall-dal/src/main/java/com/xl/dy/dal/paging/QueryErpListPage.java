package com.xl.dy.dal.paging;

import java.util.Map;

/**
 * The table TA_ERP_REG TA_ERP_REG
 */
public class QueryErpListPage extends BasePage<Map>{

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
