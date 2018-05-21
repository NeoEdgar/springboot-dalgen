package com.xl.dy.dal.resultmap;

import java.io.Serializable;

/**
 * The table OldCouponShowVO
 */
public class OldCouponShowVO implements Serializable {

private static final long serialVersionUID = -1L;

    /**
     * id .
     */
    private Integer id;
    /**
     * storeid .
     */
    private Integer storeid;
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
     * price .
     */
    private Integer price;

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
     * Set storeid .
     */
    public void setStoreid(Integer storeid){
        this.storeid = storeid;
    }

    /**
     * Get storeid .
     *
     * @return the string
     */
    public Integer getStoreid(){
        return storeid;
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
     * Set price .
     */
    public void setPrice(Integer price){
        this.price = price;
    }

    /**
     * Get price .
     *
     * @return the string
     */
    public Integer getPrice(){
        return price;
    }
}
