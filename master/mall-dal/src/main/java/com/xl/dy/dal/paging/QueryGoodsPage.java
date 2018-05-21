package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import com.xl.dy.dal.resultmap.GoodsInfo;

/**
 * The table TA_SHOP_GOODS TA_SHOP_GOODS
 */
public class QueryGoodsPage extends BasePage<GoodsInfo>{

    /**
     * mallName 商场名称（快照）.
     */
    private String mallName;
    /**
     * companyId 专业公司ID（FK）.
     */
    private Long companyId;
    /**
     * searchStr .
     */
    private String searchStr;
    /**
     * goodsId 商品ID（FK）.
     */
    private Long goodsId;
    /**
     * mallId 商场ID（FK）.
     */
    private Long mallId;
    /**
     * companyName 专业公司名称（快照）.
     */
    private String companyName;
    /**
     * catStr .
     */
    private String catStr;
    /**
     * shopName 店铺名称（快照）.
     */
    private String shopName;

    /**
     * Set mallName 商场名称（快照）.
     */
    public void setMallName(String mallName){
        this.mallName = mallName;
    }

    /**
     * Get mallName 商场名称（快照）.
     *
     * @return the string
     */
    public String getMallName(){
        return mallName;
    }

    /**
     * Set companyId 专业公司ID（FK）.
     */
    public void setCompanyId(Long companyId){
        this.companyId = companyId;
    }

    /**
     * Get companyId 专业公司ID（FK）.
     *
     * @return the string
     */
    public Long getCompanyId(){
        return companyId;
    }

    /**
     * Set searchStr .
     */
    public void setSearchStr(String searchStr){
        this.searchStr = searchStr;
    }

    /**
     * Get searchStr .
     *
     * @return the string
     */
    public String getSearchStr(){
        return searchStr;
    }

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
     * Set companyName 专业公司名称（快照）.
     */
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    /**
     * Get companyName 专业公司名称（快照）.
     *
     * @return the string
     */
    public String getCompanyName(){
        return companyName;
    }

    /**
     * Set catStr .
     */
    public void setCatStr(String catStr){
        this.catStr = catStr;
    }

    /**
     * Get catStr .
     *
     * @return the string
     */
    public String getCatStr(){
        return catStr;
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
}
