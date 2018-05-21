package com.xl.dy.dal.resultmap;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * The table StoreInfo2
 */
public class StoreInfo2 implements Serializable {

private static final long serialVersionUID = -1L;

    /**
     * totalstore .
     */
    private BigDecimal totalstore;

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
