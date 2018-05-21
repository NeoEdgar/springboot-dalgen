package com.xl.dy.dal.resultmap;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

/**
 * The table GoodCheckVO
 */
public class GoodCheckVO implements Serializable {

private static final long serialVersionUID = -1L;

    /**
     * goodid .
     */
    private Long goodid;
    /**
     * mallid .
     */
    private Long mallid;
    /**
     * shopid .
     */
    private Long shopid;
    /**
     * goodname .
     */
    private String goodname;
    /**
     * mgfrid .
     */
    private String mgfrid;
    /**
     * createtime .
     */
    private Date createtime;
    /**
     * companyname .
     */
    private String companyname;
    /**
     * shopname .
     */
    private String shopname;
    /**
     * totalstore .
     */
    private BigDecimal totalstore;
    /**
     * price .
     */
    private String price;
    /**
     * photourl .
     */
    private String photourl;
    /**
     * brandname .
     */
    private String brandname;
    /**
     * auditstatus .
     */
    private String auditstatus;
    /**
     * comgoodsalestatus .
     */
    private String comgoodsalestatus;
    /**
     * audittime .
     */
    private Date audittime;
    /**
     * auditemplname .
     */
    private String auditemplname;
    /**
     * rejectreason .
     */
    private String rejectreason;

    /**
     * Set goodid .
     */
    public void setGoodid(Long goodid){
        this.goodid = goodid;
    }

    /**
     * Get goodid .
     *
     * @return the string
     */
    public Long getGoodid(){
        return goodid;
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
     * Set goodname .
     */
    public void setGoodname(String goodname){
        this.goodname = goodname;
    }

    /**
     * Get goodname .
     *
     * @return the string
     */
    public String getGoodname(){
        return goodname;
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
     * Set price .
     */
    public void setPrice(String price){
        this.price = price;
    }

    /**
     * Get price .
     *
     * @return the string
     */
    public String getPrice(){
        return price;
    }

    /**
     * Set photourl .
     */
    public void setPhotourl(String photourl){
        this.photourl = photourl;
    }

    /**
     * Get photourl .
     *
     * @return the string
     */
    public String getPhotourl(){
        return photourl;
    }

    /**
     * Set brandname .
     */
    public void setBrandname(String brandname){
        this.brandname = brandname;
    }

    /**
     * Get brandname .
     *
     * @return the string
     */
    public String getBrandname(){
        return brandname;
    }

    /**
     * Set auditstatus .
     */
    public void setAuditstatus(String auditstatus){
        this.auditstatus = auditstatus;
    }

    /**
     * Get auditstatus .
     *
     * @return the string
     */
    public String getAuditstatus(){
        return auditstatus;
    }

    /**
     * Set comgoodsalestatus .
     */
    public void setComgoodsalestatus(String comgoodsalestatus){
        this.comgoodsalestatus = comgoodsalestatus;
    }

    /**
     * Get comgoodsalestatus .
     *
     * @return the string
     */
    public String getComgoodsalestatus(){
        return comgoodsalestatus;
    }

    /**
     * Set audittime .
     */
    public void setAudittime(Date audittime){
        this.audittime = audittime;
    }

    /**
     * Get audittime .
     *
     * @return the string
     */
    public Date getAudittime(){
        return audittime;
    }

    /**
     * Set auditemplname .
     */
    public void setAuditemplname(String auditemplname){
        this.auditemplname = auditemplname;
    }

    /**
     * Get auditemplname .
     *
     * @return the string
     */
    public String getAuditemplname(){
        return auditemplname;
    }

    /**
     * Set rejectreason .
     */
    public void setRejectreason(String rejectreason){
        this.rejectreason = rejectreason;
    }

    /**
     * Get rejectreason .
     *
     * @return the string
     */
    public String getRejectreason(){
        return rejectreason;
    }
}
