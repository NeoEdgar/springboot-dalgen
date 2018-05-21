package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import com.xl.dy.dal.dataobject.TaShopGoodsPropDO;

/**
 * The table TA_SHOP_GOODS_PROP TA_SHOP_GOODS_PROP
 */
public class QueryShopGoodListPage extends BasePage<TaShopGoodsPropDO>{

    /**
     * goodsId 商品ID（FK）.
     */
    private Long goodsId;

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
}
