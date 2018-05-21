package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import java.util.Map;
import java.util.Date;

/**
 * The table TA_SECKILL_REVIEW TA_SECKILL_REVIEW
 */
public class QuerySeckillReviewListPage extends BasePage<Map>{

    /**
     * mallName .
     */
    private String mallName;
    /**
     * seckillId 优惠卷ID（FK）.
     */
    private Long seckillId;
    /**
     * searchStr .
     */
    private String searchStr;
    /**
     * createTime 公共-创建时间.
     */
    private Date createTime;
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
     * Set createTime 公共-创建时间.
     */
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }

    /**
     * Get createTime 公共-创建时间.
     *
     * @return the string
     */
    public Date getCreateTime(){
        return createTime;
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
