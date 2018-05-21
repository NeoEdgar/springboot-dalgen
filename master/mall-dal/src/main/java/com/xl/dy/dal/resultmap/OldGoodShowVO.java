package com.xl.dy.dal.resultmap;

import java.io.Serializable;

/**
 * The table OldGoodShowVO
 */
public class OldGoodShowVO implements Serializable {

private static final long serialVersionUID = -1L;

    /**
     * id .
     */
    private Integer id;
    /**
     * storeId .
     */
    private Integer storeId;
    /**
     * title .
     */
    private String title;
    /**
     * thumb .
     */
    private String thumb;
    /**
     * content .
     */
    private String content;
    /**
     * isReal .
     */
    private Boolean isReal;
    /**
     * eshopPrice .
     */
    private Integer eshopPrice;

    /**
     * Set id .
     */
    public void setId(Integer id){
        this.id = id;
    }

    /**
     * Get id .
     *
     * @return the string
     */
    public Integer getId(){
        return id;
    }

    /**
     * Set storeId .
     */
    public void setStoreId(Integer storeId){
        this.storeId = storeId;
    }

    /**
     * Get storeId .
     *
     * @return the string
     */
    public Integer getStoreId(){
        return storeId;
    }

    /**
     * Set title .
     */
    public void setTitle(String title){
        this.title = title;
    }

    /**
     * Get title .
     *
     * @return the string
     */
    public String getTitle(){
        return title;
    }

    /**
     * Set thumb .
     */
    public void setThumb(String thumb){
        this.thumb = thumb;
    }

    /**
     * Get thumb .
     *
     * @return the string
     */
    public String getThumb(){
        return thumb;
    }

    /**
     * Set content .
     */
    public void setContent(String content){
        this.content = content;
    }

    /**
     * Get content .
     *
     * @return the string
     */
    public String getContent(){
        return content;
    }

    /**
     * Set isReal .
     */
    public void setIsReal(Boolean isReal){
        this.isReal = isReal;
    }

    /**
     * Get isReal .
     *
     * @return the string
     */
    public Boolean getIsReal(){
        return isReal;
    }

    /**
     * Set eshopPrice .
     */
    public void setEshopPrice(Integer eshopPrice){
        this.eshopPrice = eshopPrice;
    }

    /**
     * Get eshopPrice .
     *
     * @return the string
     */
    public Integer getEshopPrice(){
        return eshopPrice;
    }
}
