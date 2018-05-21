package com.xl.dy.dal.resultmap;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * The table GoodDetailVO
 */
public class GoodDetailVO implements Serializable {

private static final long serialVersionUID = -1L;

    /**
     * skuid .
     */
    private Long skuid;
    /**
     * skupropjson .
     */
    private String skupropjson;
    /**
     * totalstore .
     */
    private BigDecimal totalstore;
    /**
     * comdirectprice .
     */
    private BigDecimal comdirectprice;
    /**
     * price .
     */
    private BigDecimal price;
    /**
     * salestatus .
     */
    private String salestatus;

    /**
     * Set skuid .
     */
    public void setSkuid(Long skuid){
        this.skuid = skuid;
    }

    /**
     * Get skuid .
     *
     * @return the string
     */
    public Long getSkuid(){
        return skuid;
    }

    /**
     * Set skupropjson .
     */
    public void setSkupropjson(String skupropjson){
        this.skupropjson = skupropjson;
    }

    /**
     * Get skupropjson .
     *
     * @return the string
     */
    public String getSkupropjson(){
        return skupropjson;
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

    /**
     * Set comdirectprice .
     */
    public void setComdirectprice(BigDecimal comdirectprice){
        this.comdirectprice = comdirectprice;
    }

    /**
     * Get comdirectprice .
     *
     * @return the string
     */
    public BigDecimal getComdirectprice(){
        return comdirectprice;
    }

    /**
     * Set price .
     */
    public void setPrice(BigDecimal price){
        this.price = price;
    }

    /**
     * Get price .
     *
     * @return the string
     */
    public BigDecimal getPrice(){
        return price;
    }

    /**
     * Set salestatus .
     */
    public void setSalestatus(String salestatus){
        this.salestatus = salestatus;
    }

    /**
     * Get salestatus .
     *
     * @return the string
     */
    public String getSalestatus(){
        return salestatus;
    }
}
