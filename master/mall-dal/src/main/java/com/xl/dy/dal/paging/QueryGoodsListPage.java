package com.xl.dy.dal.paging;

import com.xl.dy.dal.resultmap.GoodsInfoOfPlatformAndCompany;

/**
 * The table TA_SHOP_GOODS_PROP TA_SHOP_GOODS_PROP
 */
public class QueryGoodsListPage extends BasePage<GoodsInfoOfPlatformAndCompany>{
    private String sortColumn;
        private String sortType;

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

    /**

     * companyId .
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
     * companyName .
     */
    private String companyName;
    /**
     * catStr .
     */
    private String catStr;
    /**
     * saleStatus .
     */
    private String saleStatus;
    /**
     * createUnit .
     */
    private String createUnit;

    /**
     * Set companyId .
     */
    public void setCompanyId(Long companyId){
        this.companyId = companyId;
    }

    /**
     * Get companyId .
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
     * Set companyName .
     */
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    /**
     * Get companyName .
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

    /**
     * Set createUnit .
     */
    public void setCreateUnit(String createUnit){
        this.createUnit = createUnit;
    }

    /**
     * Get createUnit .
     *
     * @return the string
     */
    public String getCreateUnit(){
        return createUnit;
    }
}
