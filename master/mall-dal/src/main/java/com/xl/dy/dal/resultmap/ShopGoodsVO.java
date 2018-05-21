package com.xl.dy.dal.resultmap;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The table ShopGoodsVO
 */
public class ShopGoodsVO implements Serializable {

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
     * shopname .
     */
    private String shopname;
    /**
     * mallname .
     */
    private String mallname;
    /**
     * salestatus .
     */
    private String salestatus;
    /**
     * totalstorage .
     */
    private BigDecimal totalstorage;
    /**
     * createtime .
     */
    private Date createtime;

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
     * Set totalstorage .
     */
    public void setTotalstorage(BigDecimal totalstorage){
        this.totalstorage = totalstorage;
    }

    /**
     * Get totalstorage .
     *
     * @return the string
     */
    public BigDecimal getTotalstorage(){
        return totalstorage;
    }

    /**
     * Set createtime .
     */
    public void setCreatetime(Date createtime){
        this.createtime = createtime;
    }

    /**
     * Get createtime .
     *
     * @return the string
     */
    public Date getCreatetime(){
        return createtime;
    }
}
