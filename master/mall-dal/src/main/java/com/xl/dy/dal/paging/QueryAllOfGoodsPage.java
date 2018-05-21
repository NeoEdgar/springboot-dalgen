package com.xl.dy.dal.paging;

import com.xl.dy.dal.resultmap.GoodsAllInfo;

/**
 * The table TA_SHOP_GOODS TA_SHOP_GOODS
 */
public class QueryAllOfGoodsPage extends BasePage<GoodsAllInfo>{

    /**
     * goodsId 商品ID（FK）.
     */
    private Long goodsId;
    /**
     * mallId 商场ID（FK）.
     */
    private Long mallId;
    /**
     * shopName 店铺名称（快照）.
     */
    private String shopName;
    /**
     * saleStatus 售卖状态（DIC）.
     */
    private String saleStatus;

    /**
     * Set goodsId 商品ID（FK）.
     */
    public void setGoodsId(Long goodsId){
        this.goodsId = goodsId;
    }

    /**
     * Get goodsId 商品ID（FK）.
     *
     * @return the string
     */
    public Long getGoodsId(){
        return goodsId;
    }

    /**
     * Set mallId 商场ID（FK）.
     */
    public void setMallId(Long mallId){
        this.mallId = mallId;
    }

    /**
     * Get mallId 商场ID（FK）.
     *
     * @return the string
     */
    public Long getMallId(){
        return mallId;
    }

    /**
     * Set shopName 店铺名称（快照）.
     */
    public void setShopName(String shopName){
        this.shopName = shopName;
    }

    /**
     * Get shopName 店铺名称（快照）.
     *
     * @return the string
     */
    public String getShopName(){
        return shopName;
    }

    /**
     * Set saleStatus 售卖状态（DIC）.
     */
    public void setSaleStatus(String saleStatus){
        this.saleStatus = saleStatus;
    }

    /**
     * Get saleStatus 售卖状态（DIC）.
     *
     * @return the string
     */
    public String getSaleStatus(){
        return saleStatus;
    }
}
