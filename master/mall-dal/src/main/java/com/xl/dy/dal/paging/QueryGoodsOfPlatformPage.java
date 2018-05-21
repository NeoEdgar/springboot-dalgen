package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import com.xl.dy.dal.resultmap.PlatformUniqueGoodsInfo;

/**
 * The table TA_SHOP_GOODS TA_SHOP_GOODS
 */
public class QueryGoodsOfPlatformPage extends BasePage<PlatformUniqueGoodsInfo>{

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
     * catStr .
     */
    private String catStr;
    /**
     * shopId 店铺ID（FK）.
     */
    private Long shopId;
    /**
     * saleStatus .
     */
    private String saleStatus;

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
     * Set shopId 店铺ID（FK）.
     */
    public void setShopId(Long shopId){
        this.shopId = shopId;
    }

    /**
     * Get shopId 店铺ID（FK）.
     *
     * @return the string
     */
    public Long getShopId(){
        return shopId;
    }

    /**
     * Set saleStatus .
     */
    public void setSaleStatus(String saleStatus){
        this.saleStatus = saleStatus;
    }

    /**
     * Get saleStatus .
     *
     * @return the string
     */
    public String getSaleStatus(){
        return saleStatus;
    }
}
