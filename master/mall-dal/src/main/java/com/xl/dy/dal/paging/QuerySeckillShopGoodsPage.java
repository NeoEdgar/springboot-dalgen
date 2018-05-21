package com.xl.dy.dal.paging;

import java.util.Map;

/**
 * The table TA_SHOP_GOODS TA_SHOP_GOODS
 */
public class QuerySeckillShopGoodsPage extends BasePage<Map>{
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
     * searchStr .
     */
    private String searchStr;
    /**
     * shopId 店铺ID（FK）.
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
}
