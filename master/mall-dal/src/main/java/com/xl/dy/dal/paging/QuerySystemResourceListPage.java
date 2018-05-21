package com.xl.dy.dal.paging;

import com.xl.dy.dal.dataobject.TaRoleResDO;

/**
 * The table TA_ROLE_RES TA_ROLE_RES
 */
public class QuerySystemResourceListPage extends BasePage<TaRoleResDO>{

    /**
     * res_name .
     */
    private String res_name;

    /**
     * Set res_name .
     */
    public void setRes_name(String res_name){
        this.res_name = res_name;
    }

    /**
     * Get res_name .
     *
     * @return the string
     */
    public String getRes_name(){
        return res_name;
    }
}
