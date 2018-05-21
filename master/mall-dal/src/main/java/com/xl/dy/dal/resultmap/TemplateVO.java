package com.xl.dy.dal.resultmap;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The table TemplateVO
 */
public class TemplateVO implements Serializable {

private static final long serialVersionUID = -1L;

    /**
     * id .
     */
    private Long id;
    /**
     * shopid .
     */
    private Long shopid;
    /**
     * freighttempletname .
     */
    private String freighttempletname;
    /**
     * freecode .
     */
    private String freecode;
    /**
     * freeaddrname .
     */
    private String freeaddrname;
    /**
     * revicecode .
     */
    private String revicecode;
    /**
     * reciveaddrname .
     */
    private String reciveaddrname;
    /**
     * freightcountmode .
     */
    private String freightcountmode;
    /**
     * firstunit .
     */
    private BigDecimal firstunit;
    /**
     * firstunitfare .
     */
    private BigDecimal firstunitfare;
    /**
     * contunit .
     */
    private BigDecimal contunit;
    /**
     * contunitfare .
     */
    private BigDecimal contunitfare;
    /**
     * isdefault .
     */
    private Integer isdefault;
    /**
     * createtime .
     */
    private Date createtime;

    /**
     * Set id .
     */
    public void setId(Long id){
        this.id = id;
    }

    /**
     * Get id .
     *
     * @return the string
     */
    public Long getId(){
        return id;
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
     * Set freighttempletname .
     */
    public void setFreighttempletname(String freighttempletname){
        this.freighttempletname = freighttempletname;
    }

    /**
     * Get freighttempletname .
     *
     * @return the string
     */
    public String getFreighttempletname(){
        return freighttempletname;
    }

    /**
     * Set freecode .
     */
    public void setFreecode(String freecode){
        this.freecode = freecode;
    }

    /**
     * Get freecode .
     *
     * @return the string
     */
    public String getFreecode(){
        return freecode;
    }

    /**
     * Set freeaddrname .
     */
    public void setFreeaddrname(String freeaddrname){
        this.freeaddrname = freeaddrname;
    }

    /**
     * Get freeaddrname .
     *
     * @return the string
     */
    public String getFreeaddrname(){
        return freeaddrname;
    }

    /**
     * Set revicecode .
     */
    public void setRevicecode(String revicecode){
        this.revicecode = revicecode;
    }

    /**
     * Get revicecode .
     *
     * @return the string
     */
    public String getRevicecode(){
        return revicecode;
    }

    /**
     * Set reciveaddrname .
     */
    public void setReciveaddrname(String reciveaddrname){
        this.reciveaddrname = reciveaddrname;
    }

    /**
     * Get reciveaddrname .
     *
     * @return the string
     */
    public String getReciveaddrname(){
        return reciveaddrname;
    }

    /**
     * Set freightcountmode .
     */
    public void setFreightcountmode(String freightcountmode){
        this.freightcountmode = freightcountmode;
    }

    /**
     * Get freightcountmode .
     *
     * @return the string
     */
    public String getFreightcountmode(){
        return freightcountmode;
    }

    /**
     * Set firstunit .
     */
    public void setFirstunit(BigDecimal firstunit){
        this.firstunit = firstunit;
    }

    /**
     * Get firstunit .
     *
     * @return the string
     */
    public BigDecimal getFirstunit(){
        return firstunit;
    }

    /**
     * Set firstunitfare .
     */
    public void setFirstunitfare(BigDecimal firstunitfare){
        this.firstunitfare = firstunitfare;
    }

    /**
     * Get firstunitfare .
     *
     * @return the string
     */
    public BigDecimal getFirstunitfare(){
        return firstunitfare;
    }

    /**
     * Set contunit .
     */
    public void setContunit(BigDecimal contunit){
        this.contunit = contunit;
    }

    /**
     * Get contunit .
     *
     * @return the string
     */
    public BigDecimal getContunit(){
        return contunit;
    }

    /**
     * Set contunitfare .
     */
    public void setContunitfare(BigDecimal contunitfare){
        this.contunitfare = contunitfare;
    }

    /**
     * Get contunitfare .
     *
     * @return the string
     */
    public BigDecimal getContunitfare(){
        return contunitfare;
    }

    /**
     * Set isdefault .
     */
    public void setIsdefault(Integer isdefault){
        this.isdefault = isdefault;
    }

    /**
     * Get isdefault .
     *
     * @return the string
     */
    public Integer getIsdefault(){
        return isdefault;
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
