package com.xl.dy.dal.resultmap;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * The table ExamineSeckillGoodsVO
 */
public class ExamineSeckillGoodsVO implements Serializable {

private static final long serialVersionUID = -1L;

    /**
     * seckillid .
     */
    private Long seckillid;
    /**
     * seckillname .
     */
    private String seckillname;
    /**
     * categoryset .
     */
    private Long categoryset;
    /**
     * perregistelimit .
     */
    private Integer perregistelimit;
    /**
     * notice .
     */
    private String notice;
    /**
     * categoryname .
     */
    private String categoryname;
    /**
     * seckillreviewid .
     */
    private Long seckillreviewid;
    /**
     * activeinventory .
     */
    private BigDecimal activeinventory;
    /**
     * reason .
     */
    private String reason;
    /**
     * seckillreviewstatus .
     */
    private String seckillreviewstatus;
    /**
     * shopname .
     */
    private String shopname;
    /**
     * mallname .
     */
    private String mallname;
    /**
     * companyname .
     */
    private String companyname;
    /**
     * skuphotourl .
     */
    private String skuphotourl;
    /**
     * skutitle .
     */
    private String skutitle;
    /**
     * discount .
     */
    private BigDecimal discount;
    /**
     * seckillprice .
     */
    private BigDecimal seckillprice;
    /**
     * goodsprice .
     */
    private BigDecimal goodsprice;

    /**
     * Set seckillid .
     */
    public void setSeckillid(Long seckillid){
        this.seckillid = seckillid;
    }

    /**
     * Get seckillid .
     *
     * @return the string
     */
    public Long getSeckillid(){
        return seckillid;
    }

    /**
     * Set seckillname .
     */
    public void setSeckillname(String seckillname){
        this.seckillname = seckillname;
    }

    /**
     * Get seckillname .
     *
     * @return the string
     */
    public String getSeckillname(){
        return seckillname;
    }

    /**
     * Set categoryset .
     */
    public void setCategoryset(Long categoryset){
        this.categoryset = categoryset;
    }

    /**
     * Get categoryset .
     *
     * @return the string
     */
    public Long getCategoryset(){
        return categoryset;
    }

    /**
     * Set perregistelimit .
     */
    public void setPerregistelimit(Integer perregistelimit){
        this.perregistelimit = perregistelimit;
    }

    /**
     * Get perregistelimit .
     *
     * @return the string
     */
    public Integer getPerregistelimit(){
        return perregistelimit;
    }

    /**
     * Set notice .
     */
    public void setNotice(String notice){
        this.notice = notice;
    }

    /**
     * Get notice .
     *
     * @return the string
     */
    public String getNotice(){
        return notice;
    }

    /**
     * Set categoryname .
     */
    public void setCategoryname(String categoryname){
        this.categoryname = categoryname;
    }

    /**
     * Get categoryname .
     *
     * @return the string
     */
    public String getCategoryname(){
        return categoryname;
    }

    /**
     * Set seckillreviewid .
     */
    public void setSeckillreviewid(Long seckillreviewid){
        this.seckillreviewid = seckillreviewid;
    }

    /**
     * Get seckillreviewid .
     *
     * @return the string
     */
    public Long getSeckillreviewid(){
        return seckillreviewid;
    }

    /**
     * Set activeinventory .
     */
    public void setActiveinventory(BigDecimal activeinventory){
        this.activeinventory = activeinventory;
    }

    /**
     * Get activeinventory .
     *
     * @return the string
     */
    public BigDecimal getActiveinventory(){
        return activeinventory;
    }

    /**
     * Set reason .
     */
    public void setReason(String reason){
        this.reason = reason;
    }

    /**
     * Get reason .
     *
     * @return the string
     */
    public String getReason(){
        return reason;
    }

    /**
     * Set seckillreviewstatus .
     */
    public void setSeckillreviewstatus(String seckillreviewstatus){
        this.seckillreviewstatus = seckillreviewstatus;
    }

    /**
     * Get seckillreviewstatus .
     *
     * @return the string
     */
    public String getSeckillreviewstatus(){
        return seckillreviewstatus;
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
     * Set skuphotourl .
     */
    public void setSkuphotourl(String skuphotourl){
        this.skuphotourl = skuphotourl;
    }

    /**
     * Get skuphotourl .
     *
     * @return the string
     */
    public String getSkuphotourl(){
        return skuphotourl;
    }

    /**
     * Set skutitle .
     */
    public void setSkutitle(String skutitle){
        this.skutitle = skutitle;
    }

    /**
     * Get skutitle .
     *
     * @return the string
     */
    public String getSkutitle(){
        return skutitle;
    }

    /**
     * Set discount .
     */
    public void setDiscount(BigDecimal discount){
        this.discount = discount;
    }

    /**
     * Get discount .
     *
     * @return the string
     */
    public BigDecimal getDiscount(){
        return discount;
    }

    /**
     * Set seckillprice .
     */
    public void setSeckillprice(BigDecimal seckillprice){
        this.seckillprice = seckillprice;
    }

    /**
     * Get seckillprice .
     *
     * @return the string
     */
    public BigDecimal getSeckillprice(){
        return seckillprice;
    }

    /**
     * Set goodsprice .
     */
    public void setGoodsprice(BigDecimal goodsprice){
        this.goodsprice = goodsprice;
    }

    /**
     * Get goodsprice .
     *
     * @return the string
     */
    public BigDecimal getGoodsprice(){
        return goodsprice;
    }
}
