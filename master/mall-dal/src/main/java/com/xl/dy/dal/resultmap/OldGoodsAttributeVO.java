package com.xl.dy.dal.resultmap;

import java.io.Serializable;

/**
 * The table OldGoodsAttributeVO
 */
public class OldGoodsAttributeVO implements Serializable {

private static final long serialVersionUID = -1L;

    /**
     * attributetext .
     */
    private String attributetext;
    /**
     * title .
     */
    private String title;

    /**
     * Set attributetext .
     */
    public void setAttributetext(String attributetext){
        this.attributetext = attributetext;
    }

    /**
     * Get attributetext .
     *
     * @return the string
     */
    public String getAttributetext(){
        return attributetext;
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
}
