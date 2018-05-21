package com.xl.dy.dal.paging;

import java.util.Map;

/**
 * The table TA_ADVANCE_REVIEW TA_ADVANCE_REVIEW
 */
public class QueryExamineAdvanceGoodsPage extends BasePage<Map>{
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
     * mallName .
     */
    private String mallName;
    /**
     * skutitle .
     */
    private String skutitle;
    /**
     * companyName .
     */
    private String companyName;
    /**
     * advanceId 预售活动ID（FK）.
     */
    private Long advanceId;
    /**
     * shopName .
     */
    private String shopName;
    /**
     * advanceReviewStatus 预售活动审核状态（DIC）.
     */
    private String advanceReviewStatus;

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
     * Set skutitle .
     */
    public void setSkutitle(String skutitle){
        this.skutitle = skutitle;
    }

    /**
     * Get skutitle .
     *
     * @return the string
     */
    public String getSkutitle(){
        return skutitle;
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
     * Set advanceId 预售活动ID（FK）.
     */
    public void setAdvanceId(Long advanceId){
        this.advanceId = advanceId;
    }

    /**
     * Get advanceId 预售活动ID（FK）.
     *
     * @return the string
     */
    public Long getAdvanceId(){
        return advanceId;
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
     * Set advanceReviewStatus 预售活动审核状态（DIC）.
     */
    public void setAdvanceReviewStatus(String advanceReviewStatus){
        this.advanceReviewStatus = advanceReviewStatus;
    }

    /**
     * Get advanceReviewStatus 预售活动审核状态（DIC）.
     *
     * @return the string
     */
    public String getAdvanceReviewStatus(){
        return advanceReviewStatus;
    }
}
