package com.xl.dy.dal.resultmap;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The table GoodsInfoOfShopLevel
 */
public class GoodsInfoOfShopLevel implements Serializable {

private static final long serialVersionUID = -1L;

    /**
     * goodsid .
     */
    private Long goodsid;
    /**
     * shopid .
     */
    private Long shopid;
    /**
     * companyid .
     */
    private Long companyid;
    /**
     * mallid .
     */
    private Long mallid;
    /**
     * sales .
     */
    private Long sales;
    /**
     * companyname .
     */
    private String companyname;
    /**
     * salestatus .
     */
    private String salestatus;
    /**
     * mallname .
     */
    private String mallname;
    /**
     * goodsname .
     */
    private String goodsname;
    /**
     * shopname .
     */
    private String shopname;
    /**
     * unshelvereason .
     */
    private String unshelvereason;
    /**
     * totalstore .
     */
    private BigDecimal totalstore;
    /**
     * claimtime .
     */
    private Date claimtime;

    /**
     * Set goodsid .
     */
    public void setGoodsid(Long goodsid){
        this.goodsid = goodsid;
    }

    /**
     * Get goodsid .
     *
     * @return the string
     */
    public Long getGoodsid(){
        return goodsid;
    }

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
     * Set companyid .
     */
    public void setCompanyid(Long companyid){
        this.companyid = companyid;
    }

    /**
     * Get companyid .
     *
     * @return the string
     */
    public Long getCompanyid(){
        return companyid;
    }

    /**
     * Set mallid .
     */
    public void setMallid(Long mallid){
        this.mallid = mallid;
    }

    /**
     * Get mallid .
     *
     * @return the string
     */
    public Long getMallid(){
        return mallid;
    }

    /**
     * Set sales .
     */
    public void setSales(Long sales){
        this.sales = sales;
    }

    /**
     * Get sales .
     *
     * @return the string
     */
    public Long getSales(){
        return sales;
    }

    /**
     * Set companyname .
     */
    public void setCompanyname(String companyname){
        this.companyname = companyname;
    }

    /**
     * Get companyname .
     *
     * @return the string
     */
    public String getCompanyname(){
        return companyname;
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

    /**
     * Set mallname .
     */
    public void setMallname(String mallname){
        this.mallname = mallname;
    }

    /**
     * Get mallname .
     *
     * @return the string
     */
    public String getMallname(){
        return mallname;
    }

    /**
     * Set goodsname .
     */
    public void setGoodsname(String goodsname){
        this.goodsname = goodsname;
    }

    /**
     * Get goodsname .
     *
     * @return the string
     */
    public String getGoodsname(){
        return goodsname;
    }

    /**
     * Set shopname .
     */
    public void setShopname(String shopname){
        this.shopname = shopname;
    }

    /**
     * Get shopname .
     *
     * @return the string
     */
    public String getShopname(){
        return shopname;
    }

    /**
     * Set unshelvereason .
     */
    public void setUnshelvereason(String unshelvereason){
        this.unshelvereason = unshelvereason;
    }

    /**
     * Get unshelvereason .
     *
     * @return the string
     */
    public String getUnshelvereason(){
        return unshelvereason;
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
     * Set claimtime .
     */
    public void setClaimtime(Date claimtime){
        this.claimtime = claimtime;
    }

    /**
     * Get claimtime .
     *
     * @return the string
     */
    public Date getClaimtime(){
        return claimtime;
    }
}
