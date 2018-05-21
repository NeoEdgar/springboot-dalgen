package com.xl.dy.dal.paging;

import java.util.Map;

/**
 * The table TA_SHOP_GOODS TA_SHOP_GOODS
 */
public class QueryShopGoodsPage extends BasePage<Map>{
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
     * secondCategory .
     */
    private Long secondCategory;
    /**
     * firstCategory .
     */
    private Long firstCategory;
    /**
     * shopId 店铺ID（FK）.
     */
    private Long shopId;

    /**
     * Set secondCategory .
     */
    public void setSecondCategory(Long secondCategory){
        this.secondCategory = secondCategory;
    }

    /**
     * Get secondCategory .
     *
     * @return the string
     */
    public Long getSecondCategory(){
        return secondCategory;
    }

    /**
     * Set firstCategory .
     */
    public void setFirstCategory(Long firstCategory){
        this.firstCategory = firstCategory;
    }

    /**
     * Get firstCategory .
     *
     * @return the string
     */
    public Long getFirstCategory(){
        return firstCategory;
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
