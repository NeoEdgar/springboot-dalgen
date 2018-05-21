package com.xl.dy.dal.resultmap;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The table GoodShowVO
 */
public class GoodShowVO implements Serializable {

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
     * goodname .
     */
    private String goodname;
    /**
     * goodcode .
     */
    private String goodcode;
    /**
     * goodstype .
     */
    private String goodstype;
    /**
     * price .
     */
    private String price;
    /**
     * totalstore .
     */
    private BigDecimal totalstore;
    /**
     * mgfrid .
     */
    private String mgfrid;
    /**
     * brandname .
     */
    private String brandname;
    /**
     * photourl .
     */
    private String photourl;
    /**
     * createempl .
     */
    private Long createempl;
    /**
     * createtime .
     */
    private Date createtime;
    /**
     * comgoodsalestatus .
     */
    private String comgoodsalestatus;
    /**
     * regcompanyname .
     */
    private String regcompanyname;
    /**
     * regshopname .
     */
    private String regshopname;
    /**
     * audittype .
     */
    private String audittype;
    /**
     * auditstatus .
     */
    private String auditstatus;
    /**
     * rejectreason .
     */
    private String rejectreason;
    /**
     * auditemplname .
     */
    private String auditemplname;
    /**
     * audittime .
     */
    private Date audittime;
    /**
     * companyid .
     */
    private Long companyid;
    /**
     * auditshopid .
     */
    private Long auditshopid;
    /**
     * auditcompanyid .
     */
    private Long auditcompanyid;
    /**
     * draftunitid .
     */
    private Long draftunitid;
    /**
     * isdraft .
     */
    private Integer isdraft;

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
     * Set goodcode .
     */
    public void setGoodcode(String goodcode){
        this.goodcode = goodcode;
    }

    /**
     * Get goodcode .
     *
     * @return the string
     */
    public String getGoodcode(){
        return goodcode;
    }

    /**
     * Set goodstype .
     */
    public void setGoodstype(String goodstype){
        this.goodstype = goodstype;
    }

    /**
     * Get goodstype .
     *
     * @return the string
     */
    public String getGoodstype(){
        return goodstype;
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
     * Set createempl .
     */
    public void setCreateempl(Long createempl){
        this.createempl = createempl;
    }

    /**
     * Get createempl .
     *
     * @return the string
     */
    public Long getCreateempl(){
        return createempl;
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
     * Set audittype .
     */
    public void setAudittype(String audittype){
        this.audittype = audittype;
    }

    /**
     * Get audittype .
     *
     * @return the string
     */
    public String getAudittype(){
        return audittype;
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
     * Set auditshopid .
     */
    public void setAuditshopid(Long auditshopid){
        this.auditshopid = auditshopid;
    }

    /**
     * Get auditshopid .
     *
     * @return the string
     */
    public Long getAuditshopid(){
        return auditshopid;
    }

    /**
     * Set auditcompanyid .
     */
    public void setAuditcompanyid(Long auditcompanyid){
        this.auditcompanyid = auditcompanyid;
    }

    /**
     * Get auditcompanyid .
     *
     * @return the string
     */
    public Long getAuditcompanyid(){
        return auditcompanyid;
    }

    /**
     * Set draftunitid .
     */
    public void setDraftunitid(Long draftunitid){
        this.draftunitid = draftunitid;
    }

    /**
     * Get draftunitid .
     *
     * @return the string
     */
    public Long getDraftunitid(){
        return draftunitid;
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
}
