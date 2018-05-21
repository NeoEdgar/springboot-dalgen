package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import com.xl.dy.dal.resultmap.ShopGoodsVO;

/**
 * The table TA_SHOP_GOODS TA_SHOP_GOODS
 */
public class QueryShopGoodsListPage extends BasePage<ShopGoodsVO>{

    /**
     * companyId 专业公司ID（FK）.
     */
    private Long companyId;
    /**
     * goodsId 商品ID（FK）.
     */
    private Long goodsId;
    /**
     * mallId 商场ID（FK）.
     */
    private Long mallId;
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
