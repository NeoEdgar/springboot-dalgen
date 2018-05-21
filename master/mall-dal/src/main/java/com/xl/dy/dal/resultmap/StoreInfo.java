package com.xl.dy.dal.resultmap;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * The table StoreInfo
 */
public class StoreInfo implements Serializable {

private static final long serialVersionUID = -1L;

    /**
     * shopid .
     */
    private Long shopid;
    /**
     * totalstore .
     */
    private BigDecimal totalstore;

    /**
     * Set shopid .
     */
    public void setShopid(Long shopid){
        this.shopid = shopid;
    }

    /**
     * Get shopid .
     *
     * @return the string
     */
    public Long getShopid(){
        return shopid;
    }

    /**
     * Set totalstore .
     */
    public void setTotalstore(BigDecimal totalstore){
        this.totalstore = totalstore;
    }

    /**
     * Get totalstore .
     *
     * @return the string
     */
    public BigDecimal getTotalstore(){
        return totalstore;
    }
}
