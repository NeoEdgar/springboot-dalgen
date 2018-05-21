package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import com.xl.dy.dal.resultmap.ExamineGroupGoodsVO;

/**
 * The table TA_GROUP_REVIEW TA_GROUP_REVIEW
 */
public class QueryExamineGroupGoodsPage extends BasePage<ExamineGroupGoodsVO>{
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
     * mallName .
     */
    private String mallName;
    /**
     * groupReviewStatus 拼团活动审核状态（DIC）.
     */
    private String groupReviewStatus;
    /**
     * skutitle .
     */
    private String skutitle;
    /**
     * groupId 拼团ID（FK）.
     */
    private Long groupId;
    /**
     * companyName .
     */
    private String companyName;
    /**
     * shopName .
     */
    private String shopName;

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
     * Set groupReviewStatus 拼团活动审核状态（DIC）.
     */
    public void setGroupReviewStatus(String groupReviewStatus){
        this.groupReviewStatus = groupReviewStatus;
    }

    /**
     * Get groupReviewStatus 拼团活动审核状态（DIC）.
     *
     * @return the string
     */
    public String getGroupReviewStatus(){
        return groupReviewStatus;
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
     * Set groupId 拼团ID（FK）.
     */
    public void setGroupId(Long groupId){
        this.groupId = groupId;
    }

    /**
     * Get groupId 拼团ID（FK）.
     *
     * @return the string
     */
    public Long getGroupId(){
        return groupId;
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
}
