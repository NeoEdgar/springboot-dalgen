package com.xl.dy.dal.resultmap;

import java.io.Serializable;

/**
 * The table ErpTypeVO
 */
public class ErpTypeVO implements Serializable {

private static final long serialVersionUID = -1L;

    /**
     * dickey .
     */
    private String dickey;
    /**
     * dicvalue .
     */
    private String dicvalue;
    /**
     * remark .
     */
    private String remark;

    /**
     * Set dickey .
     */
    public void setDickey(String dickey){
        this.dickey = dickey;
    }

    /**
     * Get dickey .
     *
     * @return the string
     */
    public String getDickey(){
        return dickey;
    }

    /**
     * Set dicvalue .
     */
    public void setDicvalue(String dicvalue){
        this.dicvalue = dicvalue;
    }

    /**
     * Get dicvalue .
     *
     * @return the string
     */
    public String getDicvalue(){
        return dicvalue;
    }

    /**
     * Set remark .
     */
    public void setRemark(String remark){
        this.remark = remark;
    }

    /**
     * Get remark .
     *
     * @return the string
     */
    public String getRemark(){
        return remark;
    }
}
