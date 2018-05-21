package com.xl.dy.dal.resultmap;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * The table PriceRangeInfoOfShop
 */
public class PriceRangeInfoOfShop implements Serializable {

private static final long serialVersionUID = -1L;

    /**
     * minprice .
     */
    private BigDecimal minprice;
    /**
     * maxprice .
     */
    private BigDecimal maxprice;

    /**
     * Set minprice .
     */
    public void setMinprice(BigDecimal minprice){
        this.minprice = minprice;
    }

    /**
     * Get minprice .
     *
     * @return the string
     */
    public BigDecimal getMinprice(){
        return minprice;
    }

    /**
     * Set maxprice .
     */
    public void setMaxprice(BigDecimal maxprice){
        this.maxprice = maxprice;
    }

    /**
     * Get maxprice .
     *
     * @return the string
     */
    public BigDecimal getMaxprice(){
        return maxprice;
    }
}
