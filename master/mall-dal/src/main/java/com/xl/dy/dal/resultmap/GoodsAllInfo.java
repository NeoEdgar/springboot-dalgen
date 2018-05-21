package com.xl.dy.dal.resultmap;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

/**
 * The table GoodsAllInfo
 */
public class GoodsAllInfo implements Serializable {

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
     * createtime .
     */
    private Date createtime;
    /**
     * isdraft .
     */
    private Integer isdraft;
    /**
     * totalstore .
     */
    private BigDecimal totalstore;

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

    /**
     * Set isdraft .
     */
    public void setIsdraft(Integer isdraft){
        this.isdraft = isdraft;
    }

    /**
     * Get isdraft .
     *
     * @return the string
     */
    public Integer getIsdraft(){
        return isdraft;
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
