package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import com.xl.dy.dal.dataobject.TaOrderDetDO;
import java.util.Date;

/**
 * The table TA_ORDER_DET TA_ORDER_DET
 */
public class QueryMallOrderListPage extends BasePage<TaOrderDetDO>{

    /**
     * orderType .
     */
    private String orderType;
    /**
     * orderRefundStatus .
     */
    private String orderRefundStatus;
    /**
     * shopGoodsCode SHOP_GOODS_CODE.
     */
    private String shopGoodsCode;
    /**
     * eTime .
     */
    private Date eTime;
    /**
     * mallId .
     */
    private Long mallId;
    /**
     * orderStatus .
     */
    private String orderStatus;
    /**
     * shopName .
     */
    private String shopName;
    /**
     * getGoodsMode .
     */
    private String getGoodsMode;
    /**
     * orderCode 订单号(快照).
     */
    private String orderCode;
    /**
     * goodsCode 商品-商品编号.
     */
    private String goodsCode;
    /**
     * sTime .
     */
    private Date sTime;

    /**
     * Set orderType .
     */
    public void setOrderType(String orderType){
        this.orderType = orderType;
    }

    /**
     * Get orderType .
     *
     * @return the string
     */
    public String getOrderType(){
        return orderType;
    }

    /**
     * Set orderRefundStatus .
     */
    public void setOrderRefundStatus(String orderRefundStatus){
        this.orderRefundStatus = orderRefundStatus;
    }

    /**
     * Get orderRefundStatus .
     *
     * @return the string
     */
    public String getOrderRefundStatus(){
        return orderRefundStatus;
    }

    /**
     * Set shopGoodsCode SHOP_GOODS_CODE.
     */
    public void setShopGoodsCode(String shopGoodsCode){
        this.shopGoodsCode = shopGoodsCode;
    }

    /**
     * Get shopGoodsCode SHOP_GOODS_CODE.
     *
     * @return the string
     */
    public String getShopGoodsCode(){
        return shopGoodsCode;
    }

    /**
     * Set eTime .
     */
    public void setETime(Date eTime){
        this.eTime = eTime;
    }

    /**
     * Get eTime .
     *
     * @return the string
     */
    public Date getETime(){
        return eTime;
    }

    /**
     * Set mallId .
     */
    public void setMallId(Long mallId){
        this.mallId = mallId;
    }

    /**
     * Get mallId .
     *
     * @return the string
     */
    public Long getMallId(){
        return mallId;
    }

    /**
     * Set orderStatus .
     */
    public void setOrderStatus(String orderStatus){
        this.orderStatus = orderStatus;
    }

    /**
     * Get orderStatus .
     *
     * @return the string
     */
    public String getOrderStatus(){
        return orderStatus;
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
     * Set getGoodsMode .
     */
    public void setGetGoodsMode(String getGoodsMode){
        this.getGoodsMode = getGoodsMode;
    }

    /**
     * Get getGoodsMode .
     *
     * @return the string
     */
    public String getGetGoodsMode(){
        return getGoodsMode;
    }

    /**
     * Set orderCode 订单号(快照).
     */
    public void setOrderCode(String orderCode){
        this.orderCode = orderCode;
    }

    /**
     * Get orderCode 订单号(快照).
     *
     * @return the string
     */
    public String getOrderCode(){
        return orderCode;
    }

    /**
     * Set goodsCode 商品-商品编号.
     */
    public void setGoodsCode(String goodsCode){
        this.goodsCode = goodsCode;
    }

    /**
     * Get goodsCode 商品-商品编号.
     *
     * @return the string
     */
    public String getGoodsCode(){
        return goodsCode;
    }

    /**
     * Set sTime .
     */
    public void setSTime(Date sTime){
        this.sTime = sTime;
    }

    /**
     * Get sTime .
     *
     * @return the string
     */
    public Date getSTime(){
        return sTime;
    }
}
