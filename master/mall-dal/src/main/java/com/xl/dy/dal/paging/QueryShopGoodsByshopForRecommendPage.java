package com.xl.dy.dal.paging;

import java.util.Map;

/**
 * The table TA_SHOP_GOODS_PROP TA_SHOP_GOODS_PROP
 */
public class QueryShopGoodsByshopForRecommendPage extends BasePage<Map>{
    private String sortColumn;
    public String getSortColumn() {
        return sortColumn;
    }

    public void setSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
    }

    private String sortType;
    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }


    /**
     * searchStr .
     */
    private String searchStr;
    /**
     * shopId 店铺ID.
     */
    private Long shopId;

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
     * Set shopId 店铺ID.
     */
    public void setShopId(Long shopId){
        this.shopId = shopId;
    }

    /**
     * Get shopId 店铺ID.
     *
     * @return the string
     */
    public Long getShopId(){
        return shopId;
    }
}
