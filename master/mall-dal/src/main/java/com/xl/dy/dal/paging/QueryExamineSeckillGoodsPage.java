package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import com.xl.dy.dal.resultmap.ExamineSeckillGoodsVO;

/**
 * The table TA_SECKILL_REVIEW TA_SECKILL_REVIEW
 */
public class QueryExamineSeckillGoodsPage extends BasePage<ExamineSeckillGoodsVO>{
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
     * seckillId 优惠卷ID（FK）.
     */
    private Long seckillId;
    /**
     * skutitle .
     */
    private String skutitle;
    /**
     * companyName .
     */
    private String companyName;
    /**
     * shopName .
     */
    private String shopName;
    /**
     * seckillReviewStatus 优惠卷审核状态.
     */
    private String seckillReviewStatus;

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
     * Set seckillId 优惠卷ID（FK）.
     */
    public void setSeckillId(Long seckillId){
        this.seckillId = seckillId;
    }

    /**
     * Get seckillId 优惠卷ID（FK）.
     *
     * @return the string
     */
    public Long getSeckillId(){
        return seckillId;
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
     * Set seckillReviewStatus 优惠卷审核状态.
     */
    public void setSeckillReviewStatus(String seckillReviewStatus){
        this.seckillReviewStatus = seckillReviewStatus;
    }

    /**
     * Get seckillReviewStatus 优惠卷审核状态.
     *
     * @return the string
     */
    public String getSeckillReviewStatus(){
        return seckillReviewStatus;
    }
}
