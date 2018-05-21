package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import java.util.Map;

/**
 * The table TA_ORDER TA_ORDER
 */
public class QueryShopOrderListPage extends BasePage<Map>{

    /**
     * orderType 订单类型(DIC).
     */
    private String orderType;
    /**
     * orderStatus 订单状态（DIC）.
     */
    private String orderStatus;
    /**
     * shopId 单位-店铺ID(FK).
     */
    private Long shopId;
    /**
     * evaluationStatus 评价状态（DIC）.
     */
    private String evaluationStatus;

    /**
     * Set orderType 订单类型(DIC).
     */
    public void setOrderType(String orderType){
        this.orderType = orderType;
    }

    /**
     * Get orderType 订单类型(DIC).
     *
     * @return the string
     */
    public String getOrderType(){
        return orderType;
    }

    /**
     * Set orderStatus 订单状态（DIC）.
     */
    public void setOrderStatus(String orderStatus){
        this.orderStatus = orderStatus;
    }

    /**
     * Get orderStatus 订单状态（DIC）.
     *
     * @return the string
     */
    public String getOrderStatus(){
        return orderStatus;
    }

    /**
     * Set shopId 单位-店铺ID(FK).
     */
    public void setShopId(Long shopId){
        this.shopId = shopId;
    }

    /**
     * Get shopId 单位-店铺ID(FK).
     *
     * @return the string
     */
    public Long getShopId(){
        return shopId;
    }

    /**
     * Set evaluationStatus 评价状态（DIC）.
     */
    public void setEvaluationStatus(String evaluationStatus){
        this.evaluationStatus = evaluationStatus;
    }

    /**
     * Get evaluationStatus 评价状态（DIC）.
     *
     * @return the string
     */
    public String getEvaluationStatus(){
        return evaluationStatus;
    }
}
