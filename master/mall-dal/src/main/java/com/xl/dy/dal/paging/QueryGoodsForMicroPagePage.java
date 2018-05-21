package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import java.util.Map;

/**
 * The table TA_GOODS TA_GOODS
 */
public class QueryGoodsForMicroPagePage extends BasePage<Map>{

    /**
     * goodsId .
     */
    private Long goodsId;
    /**
     * goodsName 商品名称.
     */
    private String goodsName;

    /**
     * Set goodsId .
     */
    public void setGoodsId(Long goodsId){
        this.goodsId = goodsId;
    }

    /**
     * Get goodsId .
     *
     * @return the string
     */
    public Long getGoodsId(){
        return goodsId;
    }

    /**
     * Set goodsName 商品名称.
     */
    public void setGoodsName(String goodsName){
        this.goodsName = goodsName;
    }

    /**
     * Get goodsName 商品名称.
     *
     * @return the string
     */
    public String getGoodsName(){
        return goodsName;
    }
}
