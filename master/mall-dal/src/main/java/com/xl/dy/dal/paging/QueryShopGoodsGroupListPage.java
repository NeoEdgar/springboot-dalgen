package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import com.xl.dy.dal.dataobject.TaShopGoodsGroupDO;

/**
 * The table TA_SHOP_GOODS_GROUP TA_SHOP_GOODS_GROUP
 */
public class QueryShopGoodsGroupListPage extends BasePage<TaShopGoodsGroupDO>{

    /**
     * shopId 店铺ID（FK）.
     */
    private Long shopId;
    /**
     * isHide 是否隐藏属性的分组.
     */
    private Integer isHide;

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
     * Set isHide 是否隐藏属性的分组.
     */
    public void setIsHide(Integer isHide){
        this.isHide = isHide;
    }

    /**
     * Get isHide 是否隐藏属性的分组.
     *
     * @return the string
     */
    public Integer getIsHide(){
        return isHide;
    }
}
