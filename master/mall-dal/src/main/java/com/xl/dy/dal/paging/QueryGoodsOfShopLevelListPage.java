package com.xl.dy.dal.paging;

import com.xl.dy.dal.resultmap.GoodsInfoOfShopLevel;

/**
 * The table TA_COMPANY_GOODS_PROP TA_COMPANY_GOODS_PROP
 */
public class QueryGoodsOfShopLevelListPage extends BasePage<GoodsInfoOfShopLevel>{
    public String getSortColumn() {
        return sortColumn;
    }

    public void setSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
    }

    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    private String sortColumn;
        private String sortType;
    /**
     * mallName .
     */
    private String mallName;
    /**
     * companyId 专业公司ID.
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
     * mallId .
     */
    private Long mallId;
    /**
     * companyName 专业公司名称.
     */
    private String companyName;
    /**
     * shopName .
     */
    private String shopName;
    /**
     * shopId .
     */
    private Long shopId;

    /**
     * Set mallName .
     */
    public void setMallName(String mallName){
        this.mallName = mallName;
    }

    /**
     * Get mallName .
     *
     * @return the string
     */
    public String getMallName(){
        return mallName;
    }

    /**
     * Set companyId 专业公司ID.
     */
    public void setCompanyId(Long companyId){
        this.companyId = companyId;
    }

    /**
     * Get companyId 专业公司ID.
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
     * Set mallId .
     */
    public void setMallId(Long mallId){
        this.mallId = mallId;
    }

    /**
     * Get mallId .
     *
     * @return the string
     */
    public Long getMallId(){
        return mallId;
    }

    /**
     * Set companyName 专业公司名称.
     */
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    /**
     * Get companyName 专业公司名称.
     *
     * @return the string
     */
    public String getCompanyName(){
        return companyName;
    }

    /**
     * Set shopName .
     */
    public void setShopName(String shopName){
        this.shopName = shopName;
    }

    /**
     * Get shopName .
     *
     * @return the string
     */
    public String getShopName(){
        return shopName;
    }

    /**
     * Set shopId .
     */
    public void setShopId(Long shopId){
        this.shopId = shopId;
    }

    /**
     * Get shopId .
     *
     * @return the string
     */
    public Long getShopId(){
        return shopId;
    }
}
