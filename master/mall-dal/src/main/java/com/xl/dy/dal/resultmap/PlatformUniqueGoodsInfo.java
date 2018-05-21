package com.xl.dy.dal.resultmap;

import java.io.Serializable;
import java.util.Date;

/**
 * The table PlatformUniqueGoodsInfo
 */
public class PlatformUniqueGoodsInfo implements Serializable {

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
     * shopname .
     */
    private String shopname;
    /**
     * companyname .
     */
    private String companyname;
    /**
     * goodscode .
     */
    private String goodscode;
    /**
     * mgfrid .
     */
    private String mgfrid;
    /**
     * goodsname .
     */
    private String goodsname;
    /**
     * regcompanyname .
     */
    private String regcompanyname;
    /**
     * regshopname .
     */
    private String regshopname;
    /**
     * salestatus .
     */
    private String salestatus;
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
     * Set goodscode .
     */
    public void setGoodscode(String goodscode){
        this.goodscode = goodscode;
    }

    /**
     * Get goodscode .
     *
     * @return the string
     */
    public String getGoodscode(){
        return goodscode;
    }

    /**
     * Set mgfrid .
     */
    public void setMgfrid(String mgfrid){
        this.mgfrid = mgfrid;
    }

    /**
     * Get mgfrid .
     *
     * @return the string
     */
    public String getMgfrid(){
        return mgfrid;
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
     * Set regcompanyname .
     */
    public void setRegcompanyname(String regcompanyname){
        this.regcompanyname = regcompanyname;
    }

    /**
     * Get regcompanyname .
     *
     * @return the string
     */
    public String getRegcompanyname(){
        return regcompanyname;
    }

    /**
     * Set regshopname .
     */
    public void setRegshopname(String regshopname){
        this.regshopname = regshopname;
    }

    /**
     * Get regshopname .
     *
     * @return the string
     */
    public String getRegshopname(){
        return regshopname;
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
