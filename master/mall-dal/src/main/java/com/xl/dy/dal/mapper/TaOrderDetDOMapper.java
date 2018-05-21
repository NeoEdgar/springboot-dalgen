package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaOrderDetDO;
import java.util.List;
import com.xl.dy.dal.paging.QueryCompanyOrderListPage;
import com.xl.dy.dal.paging.QueryMallOrderListPage;
import com.xl.dy.dal.resultmap.GroupVO;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_ORDER_DET.
 * TA_ORDER_DET
 */
public interface TaOrderDetDOMapper{

    /**
     * desc:???�表:TA_ORDER_DET.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_ORDER_DET( ID ,PA_ID ,PB_ID ,IS_ERP ,POINT ,SKU_ID ,REMARK ,BRAND_ID ,GOODS_ID ,IS_POINT ,ORDER_ID ,SALE_QTY ,ERP_ACC_ID ,IS_COUPON ,IS_REFUND ,PAR_VALUE ,SALE_TYPE ,SKU_TITLE ,ALTER_EMPL ,ALTER_TIME ,BRAND_NAME ,GOODS_CODE ,GOODS_TYPE ,ORDER_CODE ,POINT_RATE ,PRICE_TYPE ,SECKILL_ID ,TIMESTAMP ,CONTRACT_DP ,CONTRACT_ID ,CREATE_EMPL ,CREATE_TIME ,ERP_GOODS_ID ,GOODS_PRICE ,ORI_ORDER_ID ,AL_REFUND_AMT ,CONSUME_CODE ,ERP_LOCK_CODE ,ERP_SALE_CODE ,ERP_SALE_DEPT ,MA_POINT_RULE ,POINT_AMT_DET ,SKU_PROP_JSON ,VALID_STATUS ,BROKERAGE_AMT ,CANVER_STATUS ,CONTRACT_TYPE ,COUPON_AMT_DET ,COUPON_USER_ID ,ERP_TRADE_CODE ,ERP_WRITE_TIME ,ORI_ORDER_CODE ,ACCOUNT_UNIT_ID ,ERP_LOCK_STATUS ,ERP_WRITE_ERROR ,ORI_ORDER_DET_ID ,PAY_POSTAGE_AMT ,SHOP_GOODS_CODE ,SHOP_GOODS_NAME ,CONTRACT_NUMBER ,ERP_WRITE_STATUS ,PER_PAY_TOTAL_AMT ,POINT_TRADE_CODE ,POINT_WRITE_TIME ,POINT_WRITE_ERROR ,POINT_WRITE_STATUS ,SHOP_GOODS_PHOTO_URL )VALUES( #{id,jdbcType=BIGINT} , #{paId,jdbcType=BIGINT} , #{pbId,jdbcType=BIGINT} , #{isErp,jdbcType=INTEGER} , #{point,jdbcType=DECIMAL} , #{skuId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{brandId,jdbcType=BIGINT} , #{goodsId,jdbcType=BIGINT} , #{isPoint,jdbcType=INTEGER} , #{orderId,jdbcType=BIGINT} , #{saleQty,jdbcType=DECIMAL} , #{erpAccId,jdbcType=BIGINT} , #{isCoupon,jdbcType=INTEGER} , #{isRefund,jdbcType=INTEGER} , #{parValue,jdbcType=DECIMAL} , #{saleType,jdbcType=VARCHAR} , #{skuTitle,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{brandName,jdbcType=VARCHAR} , #{goodsCode,jdbcType=VARCHAR} , #{goodsType,jdbcType=VARCHAR} , #{orderCode,jdbcType=VARCHAR} , #{pointRate,jdbcType=DECIMAL} , #{priceType,jdbcType=VARCHAR} , #{seckillId,jdbcType=BIGINT} , #{timestamp,jdbcType=BIGINT} , #{contractDp,jdbcType=DECIMAL} , #{contractId,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{erpGoodsId,jdbcType=VARCHAR} , #{goodsPrice,jdbcType=DECIMAL} , #{oriOrderId,jdbcType=BIGINT} , #{alRefundAmt,jdbcType=DECIMAL} , #{consumeCode,jdbcType=VARCHAR} , #{erpLockCode,jdbcType=VARCHAR} , #{erpSaleCode,jdbcType=VARCHAR} , #{erpSaleDept,jdbcType=VARCHAR} , #{maPointRule,jdbcType=INTEGER} , #{pointAmtDet,jdbcType=DECIMAL} , #{skuPropJson,jdbcType=VARCHAR} , #{validStatus,jdbcType=INTEGER} , #{brokerageAmt,jdbcType=DECIMAL} , #{canverStatus,jdbcType=VARCHAR} , #{contractType,jdbcType=VARCHAR} , #{couponAmtDet,jdbcType=DECIMAL} , #{couponUserId,jdbcType=BIGINT} , #{erpTradeCode,jdbcType=VARCHAR} , #{erpWriteTime,jdbcType=TIMESTAMP} , #{oriOrderCode,jdbcType=VARCHAR} , #{accountUnitId,jdbcType=BIGINT} , #{erpLockStatus,jdbcType=VARCHAR} , #{erpWriteError,jdbcType=VARCHAR} , #{oriOrderDetId,jdbcType=BIGINT} , #{payPostageAmt,jdbcType=DECIMAL} , #{shopGoodsCode,jdbcType=VARCHAR} , #{shopGoodsName,jdbcType=VARCHAR} , #{contractNumber,jdbcType=VARCHAR} , #{erpWriteStatus,jdbcType=VARCHAR} , #{perPayTotalAmt,jdbcType=DECIMAL} , #{pointTradeCode,jdbcType=VARCHAR} , #{pointWriteTime,jdbcType=TIMESTAMP} , #{pointWriteError,jdbcType=VARCHAR} , #{pointWriteStatus,jdbcType=VARCHAR} , #{shopGoodsPhotoUrl,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaOrderDetDO entity);
    /**
     * desc:?��?�表:TA_ORDER_DET.<br/>
     * descSql =  UPDATE TA_ORDER_DET SET PA_ID = #{paId,jdbcType=BIGINT} ,PB_ID = #{pbId,jdbcType=BIGINT} ,IS_ERP = #{isErp,jdbcType=INTEGER} ,POINT = #{point,jdbcType=DECIMAL} ,SKU_ID = #{skuId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,BRAND_ID = #{brandId,jdbcType=BIGINT} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,IS_POINT = #{isPoint,jdbcType=INTEGER} ,ORDER_ID = #{orderId,jdbcType=BIGINT} ,SALE_QTY = #{saleQty,jdbcType=DECIMAL} ,ERP_ACC_ID = #{erpAccId,jdbcType=BIGINT} ,IS_COUPON = #{isCoupon,jdbcType=INTEGER} ,IS_REFUND = #{isRefund,jdbcType=INTEGER} ,PAR_VALUE = #{parValue,jdbcType=DECIMAL} ,SALE_TYPE = #{saleType,jdbcType=VARCHAR} ,SKU_TITLE = #{skuTitle,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,BRAND_NAME = #{brandName,jdbcType=VARCHAR} ,GOODS_CODE = #{goodsCode,jdbcType=VARCHAR} ,GOODS_TYPE = #{goodsType,jdbcType=VARCHAR} ,ORDER_CODE = #{orderCode,jdbcType=VARCHAR} ,POINT_RATE = #{pointRate,jdbcType=DECIMAL} ,PRICE_TYPE = #{priceType,jdbcType=VARCHAR} ,SECKILL_ID = #{seckillId,jdbcType=BIGINT} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CONTRACT_DP = #{contractDp,jdbcType=DECIMAL} ,CONTRACT_ID = #{contractId,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,ERP_GOODS_ID = #{erpGoodsId,jdbcType=VARCHAR} ,GOODS_PRICE = #{goodsPrice,jdbcType=DECIMAL} ,ORI_ORDER_ID = #{oriOrderId,jdbcType=BIGINT} ,AL_REFUND_AMT = #{alRefundAmt,jdbcType=DECIMAL} ,CONSUME_CODE = #{consumeCode,jdbcType=VARCHAR} ,ERP_LOCK_CODE = #{erpLockCode,jdbcType=VARCHAR} ,ERP_SALE_CODE = #{erpSaleCode,jdbcType=VARCHAR} ,ERP_SALE_DEPT = #{erpSaleDept,jdbcType=VARCHAR} ,MA_POINT_RULE = #{maPointRule,jdbcType=INTEGER} ,POINT_AMT_DET = #{pointAmtDet,jdbcType=DECIMAL} ,SKU_PROP_JSON = #{skuPropJson,jdbcType=VARCHAR} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,BROKERAGE_AMT = #{brokerageAmt,jdbcType=DECIMAL} ,CANVER_STATUS = #{canverStatus,jdbcType=VARCHAR} ,CONTRACT_TYPE = #{contractType,jdbcType=VARCHAR} ,COUPON_AMT_DET = #{couponAmtDet,jdbcType=DECIMAL} ,COUPON_USER_ID = #{couponUserId,jdbcType=BIGINT} ,ERP_TRADE_CODE = #{erpTradeCode,jdbcType=VARCHAR} ,ERP_WRITE_TIME = #{erpWriteTime,jdbcType=TIMESTAMP} ,ORI_ORDER_CODE = #{oriOrderCode,jdbcType=VARCHAR} ,ACCOUNT_UNIT_ID = #{accountUnitId,jdbcType=BIGINT} ,ERP_LOCK_STATUS = #{erpLockStatus,jdbcType=VARCHAR} ,ERP_WRITE_ERROR = #{erpWriteError,jdbcType=VARCHAR} ,ORI_ORDER_DET_ID = #{oriOrderDetId,jdbcType=BIGINT} ,PAY_POSTAGE_AMT = #{payPostageAmt,jdbcType=DECIMAL} ,SHOP_GOODS_CODE = #{shopGoodsCode,jdbcType=VARCHAR} ,SHOP_GOODS_NAME = #{shopGoodsName,jdbcType=VARCHAR} ,CONTRACT_NUMBER = #{contractNumber,jdbcType=VARCHAR} ,ERP_WRITE_STATUS = #{erpWriteStatus,jdbcType=VARCHAR} ,PER_PAY_TOTAL_AMT = #{perPayTotalAmt,jdbcType=DECIMAL} ,POINT_TRADE_CODE = #{pointTradeCode,jdbcType=VARCHAR} ,POINT_WRITE_TIME = #{pointWriteTime,jdbcType=TIMESTAMP} ,POINT_WRITE_ERROR = #{pointWriteError,jdbcType=VARCHAR} ,POINT_WRITE_STATUS = #{pointWriteStatus,jdbcType=VARCHAR} ,SHOP_GOODS_PHOTO_URL = #{shopGoodsPhotoUrl,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaOrderDetDO entity);
    /**
     * desc:?��??主�?????��?��??:TA_ORDER_DET.<br/>
     * descSql =  DELETE FROM TA_ORDER_DET WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:?��??主�???��???��??:TA_ORDER_DET.<br/>
     * descSql =  SELECT * FROM TA_ORDER_DET WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaOrderDetDO
     */
    TaOrderDetDO getByPrimary(Long id);
    /**
     * desc:?��??主�???��???��??:TA_ORDER_DET.<br/>
     * descSql =  SELECT b.IS_REFUND isRefund, b.ORI_ORDER_CODE oriOrderCode, b.ORDER_STATUS orderStatus, b.COMPANY_ID companyId, b.COMPANY_NAME companyName, b.MALL_ID mallId, b.MALL_NAME mallName, b.SHOP_ID shopId, b.SHOP_NAME shopName, a.GOODS_ID goodsId, a.SHOP_GOODS_NAME shopGoodsName, a.SKU_PROP_JSON skuPropJson, c.ERP_ACC_NAME erpAccName, a.ERP_SALE_CODE erpSaleCode, a.ERP_SALE_DEPT erpSaleDept, a.ID orderDetId, a.ORDER_CODE orderCode, a.ERP_TRADE_CODE erpTradeCode, a.ERP_WRITE_TIME erpWriteTime, a.ERP_WRITE_STATUS erpWriteStatus, a.SALE_QTY saleQty, a.PER_PAY_TOTAL_AMT-IFNULL(a.COUPON_AMT_DET,0)-IFNULL(a.POINT_AMT_DET,0) salePayment, a.AL_REFUND_AMT alRefunAmt, d.PAY_MODE_NAME payModeName, a.PAY_POSTAGE_AMT payPostageAmt FROM ta_order_det a LEFT JOIN ta_order b ON a.ORDER_CODE = b.ORDER_CODE LEFT JOIN ta_erp_acc c ON c.ID = a.ERP_ACC_ID LEFT JOIN ta_order_funds d on d.ORDER_ID = b.ID WHERE a.VALID_STATUS IS NULL AND b.VALID_STATUS IS NULL AND date_format(b.CREATE_TIME,'%Y-%m-%d %H') BETWEEN date_format(DATE_ADD(NOW(),INTERVAL -3 HOUR),'%Y-%m-%d %H') AND date_format(now(),'%Y-%m-%d %H')
     * @return TaOrderDetDO
     */
    TaOrderDetDO getOrderPrimary();
    /**
     * desc:根据主键获取数据:TA_ORDER_DET.<br/>
     * descSql =  SELECT * FROM TA_ORDER_DET WHERE IS_REFUND = 0 AND ORDER_ID = #{orderId,jdbcType=BIGINT}
     * @param orderId orderId
     * @return List<TaOrderDetDO>
     */
    List<TaOrderDetDO> getByOrderId(Long orderId);
    /**
     * desc:根据主键获取数据:TA_ORDER_DET.<br/>
     * descSql =  SELECT ID,SKU_TITLE,SKU_PROP_JSON,SALE_QTY,GOODS_PRICE,PAY_POSTAGE_AMT FROM TA_ORDER_DET WHERE IS_REFUND = 0 AND ORDER_ID = #{orderId,jdbcType=BIGINT}
     * @param orderId orderId
     * @return List<TaOrderDetDO>
     */
    List<TaOrderDetDO> getInfoByOrderId(Long orderId);
    /**
     * desc:根据主键更新数据:TA_ORDER_DET.<br/>
     * descSql =  UPDATE TA_ORDER_DET PA_ID = #{paId,jdbcType=BIGINT}, PB_ID = #{pbId,jdbcType=BIGINT}, IS_ERP = #{isErp,jdbcType=INTEGER}, POINT = #{point,jdbcType=DECIMAL}, SKU_ID = #{skuId,jdbcType=BIGINT}, BRAND_ID = #{brandId,jdbcType=BIGINT}, GOODS_ID = #{goodsId,jdbcType=BIGINT}, ORDER_ID = #{orderId,jdbcType=BIGINT}, SALE_QTY = #{saleQty,jdbcType=DECIMAL}, ERP_ACC_ID = #{erpAccId,jdbcType=BIGINT}, IS_REFUND = #{isRefund,jdbcType=INTEGER}, SALE_TYPE = #{saleType,jdbcType=VARCHAR}, GOODS_TYPE = #{goodsType,jdbcType=VARCHAR}, SKU_TITLE = #{skuTitle,jdbcType=VARCHAR}, BRAND_NAME = #{brandName,jdbcType=VARCHAR}, GOODS_CODE = #{goodsCode,jdbcType=VARCHAR}, SHOP_GOODS_CODE = #{shopGoodsCode,jdbcType=VARCHAR}, ORDER_CODE = #{orderCode,jdbcType=VARCHAR}, POINT_RATE = #{pointRate,jdbcType=DECIMAL}, PRICE_TYPE = #{priceType,jdbcType=VARCHAR}, CONSUME_CODE = #{consumeCode,jdbcType=VARCHAR}, CONTRACT_DP = #{contractDp,jdbcType=DECIMAL}, CONTRACT_ID = #{contractId,jdbcType=BIGINT}, ERP_GOODS_ID = #{erpGoodsId,jdbcType=VARCHAR}, GOODS_PRICE = #{goodsPrice,jdbcType=DECIMAL}, ORI_ORDER_ID = #{oriOrderId,jdbcType=BIGINT}, AL_REFUND_AMT = #{alRefundAmt,jdbcType=DECIMAL}, ERP_LOCK_CODE = #{erpLockCode,jdbcType=VARCHAR}, ERP_SALE_CODE = #{erpSaleCode,jdbcType=VARCHAR}, ERP_SALE_DEPT = #{erpSaleDept,jdbcType=VARCHAR}, MA_POINT_RULE = #{maPointRule,jdbcType=INTEGER}, SECKILL_ID = #{seckillId,jdbcType=BIGINT}, PER_PAY_TOTAL_AMT = #{perPayTotalAmt,jdbcType=DECIMAL}, PER_PAY_TOTAL_AMT = #{perPayTotalAmt,jdbcType=DECIMAL}, PAY_POSTAGE_AMT = #{payPostageAmt,jdbcType=DECIMAL}, POINT_AMT_DET = #{pointAmtDet,jdbcType=DECIMAL}, SKU_PROP_JSON = #{skuPropJson,jdbcType=VARCHAR}, BROKERAGE_AMT = #{brokerageAmt,jdbcType=DECIMAL} CANVER_STATUS = #{canverStatus,jdbcType=VARCHAR}, CONTRACT_TYPE = #{contractType,jdbcType=VARCHAR}, COUPON_AMT_DET = #{couponAmtDet,jdbcType=DECIMAL}, IS_COUPON = #{isCoupon,jdbcType=INTEGER}, IS_POINT = #{isPoint,jdbcType=INTEGER}, PAR_VALUE = = #{parValue,jdbcType=DECIMAL}, COUPON_USER_ID = #{couponUserId,jdbcType=BIGINT}, ERP_TRADE_CODE = #{erpTradeCode,jdbcType=VARCHAR}, ERP_WRITE_TIME = #{erpWriteTime,jdbcType=TIMESTAMP}, ORI_ORDER_CODE = #{oriOrderCode,jdbcType=VARCHAR}, SHOP_GOODS_PHOTO_URL = #{shopGoodsPhotoUrl,jdbcType=VARCHAR}, ACCOUNT_UNIT_ID = #{accountUnitId,jdbcType=BIGINT}, ERP_LOCK_STATUS = #{erpLockStatus,jdbcType=VARCHAR}, ERP_WRITE_ERROR = #{erpWriteError,jdbcType=VARCHAR}, ORI_ORDER_DET_ID = #{oriOrderDetId,jdbcType=BIGINT}, SHOP_GOODS_NAME = #{shopGoodsName,jdbcType=VARCHAR}, CONTRACT_NUMBER = #{contractNumber,jdbcType=VARCHAR}, ERP_WRITE_STATUS = #{erpWriteStatus,jdbcType=VARCHAR}, POINT_TRADE_CODE = #{pointTradeCode,jdbcType=VARCHAR}, POINT_WRITE_TIME = #{pointWriteTime,jdbcType=TIMESTAMP}, POINT_WRITE_ERROR = #{pointWriteError,jdbcType=VARCHAR}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long updateByPrimarySelective(TaOrderDetDO entity);
    /**
     * desc:根据主键获取数据:TA_ORDER_DET.<br/>
     * descSql =  SELECT * FROM TA_ORDER_DET WHERE IS_REFUND = 0 AND ORDER_CODE = #{orderCode,jdbcType=VARCHAR}
     * @param orderCode orderCode
     * @return List<TaOrderDetDO>
     */
    List<TaOrderDetDO> getByOrderCode(String orderCode);
    /**
     * desc:根据mallId获取不同类型的订单:TA_ORDER.<br/>
     * descSql =  SELECT b.SHOP_GOODS_NAME,b.SHOP_GOODS_PHOTO_URL,b.SKU_TITLE,b.GOODS_PRICE,b.SALE_QTY,b.ORDER_ID,b.SKU_PROP_JSON FROM TA_ORDER a LEFT JOIN TA_ORDER_DET b ON a.ID = b.ORDER_ID WHERE a.ORDER_TYPE = #{orderType,jdbcType=VARCHAR} AND IS_REFUND = 0 AND COMPANY_ID = #{companyId,jdbcType=BIGINT} AND a.ORDER_CODE = #{orderCode,jdbcType=VARCHAR} a.AND MALL_NAME = #{mallName,jdbcType=VARCHAR} AND a.ORDER_STATUS = #{orderStatus,jdbcType=VARCHAR} AND a.SHOP_NAME = #{shopName,jdbcType=VARCHAR} AND a.ORDER_REFUND_STATUS = #{orderRefundStatus,jdbcType=VARCHAR} AND a.GET_GOODS_MODE = #{getGoodsMode,jdbcType=VARCHAR} AND a.CREATE_TIME &gt;= #{sTime,jdbcType=TIMESTAMP} AND a.CREATE_TIME &lt;= #{eTime,jdbcType=TIMESTAMP} AND b.GOODS_CODE = #{goodsCode,jdbcType=VARCHAR} AND b.SHOP_GOODS_CODE = #{shopGoodsCode,jdbcType=VARCHAR} ORDER_BY a.ORDER_ID,a.CREATE_TIME DESC
     * @param queryCompanyOrderList queryCompanyOrderList
     * @return int
     */
    int getCompanyOrderListCount(QueryCompanyOrderListPage queryCompanyOrderList);
    /**
     * desc:根据mallId获取不同类型的订单:TA_ORDER.<br/>
     * descSql =  SELECT b.SHOP_GOODS_NAME,b.SHOP_GOODS_PHOTO_URL,b.SKU_TITLE,b.GOODS_PRICE,b.SALE_QTY,b.ORDER_ID,b.SKU_PROP_JSON FROM TA_ORDER a LEFT JOIN TA_ORDER_DET b ON a.ID = b.ORDER_ID WHERE a.ORDER_TYPE = #{orderType,jdbcType=VARCHAR} AND IS_REFUND = 0 AND COMPANY_ID = #{companyId,jdbcType=BIGINT} AND a.ORDER_CODE = #{orderCode,jdbcType=VARCHAR} a.AND MALL_NAME = #{mallName,jdbcType=VARCHAR} AND a.ORDER_STATUS = #{orderStatus,jdbcType=VARCHAR} AND a.SHOP_NAME = #{shopName,jdbcType=VARCHAR} AND a.ORDER_REFUND_STATUS = #{orderRefundStatus,jdbcType=VARCHAR} AND a.GET_GOODS_MODE = #{getGoodsMode,jdbcType=VARCHAR} AND a.CREATE_TIME &gt;= #{sTime,jdbcType=TIMESTAMP} AND a.CREATE_TIME &lt;= #{eTime,jdbcType=TIMESTAMP} AND b.GOODS_CODE = #{goodsCode,jdbcType=VARCHAR} AND b.SHOP_GOODS_CODE = #{shopGoodsCode,jdbcType=VARCHAR} ORDER_BY a.ORDER_ID,a.CREATE_TIME DESC
     * @param queryCompanyOrderList queryCompanyOrderList
     * @return List<TaOrderDetDO>
     */
    List<TaOrderDetDO> getCompanyOrderListResult(QueryCompanyOrderListPage queryCompanyOrderList);
    /**
     * desc:根据mallId获取不同类型的订单:TA_ORDER.<br/>
     * descSql =  SELECT * FROM TA_ORDER WHERE ORDER_TYPE = #{orderType,jdbcType=VARCHAR} AND MALL_ID = #{mallId,jdbcType=BIGINT} AND ORDER_CODE = #{orderCode,jdbcType=VARCHAR} AND ORDER_STATUS = #{orderStatus,jdbcType=VARCHAR} AND SHOP_NAME = #{shopName,jdbcType=VARCHAR} AND ORDER_REFUND_STATUS = #{orderRefundStatus,jdbcType=VARCHAR} AND GET_GOODS_MODE = #{getGoodsMode,jdbcType=VARCHAR} AND CREATE_TIME &gt;= #{sTime,jdbcType=TIMESTAMP} AND CREATE_TIME &lt;= #{eTime,jdbcType=TIMESTAMP} AND b.GOODS_CODE = #{goodsCode,jdbcType=VARCHAR} AND b.SHOP_GOODS_CODE = #{shopGoodsCode,jdbcType=VARCHAR} ORDER_BY a.ORDER_ID,a.CREATE_TIME DESC
     * @param queryMallOrderList queryMallOrderList
     * @return int
     */
    int getMallOrderListCount(QueryMallOrderListPage queryMallOrderList);
    /**
     * desc:根据mallId获取不同类型的订单:TA_ORDER.<br/>
     * descSql =  SELECT * FROM TA_ORDER WHERE ORDER_TYPE = #{orderType,jdbcType=VARCHAR} AND MALL_ID = #{mallId,jdbcType=BIGINT} AND ORDER_CODE = #{orderCode,jdbcType=VARCHAR} AND ORDER_STATUS = #{orderStatus,jdbcType=VARCHAR} AND SHOP_NAME = #{shopName,jdbcType=VARCHAR} AND ORDER_REFUND_STATUS = #{orderRefundStatus,jdbcType=VARCHAR} AND GET_GOODS_MODE = #{getGoodsMode,jdbcType=VARCHAR} AND CREATE_TIME &gt;= #{sTime,jdbcType=TIMESTAMP} AND CREATE_TIME &lt;= #{eTime,jdbcType=TIMESTAMP} AND b.GOODS_CODE = #{goodsCode,jdbcType=VARCHAR} AND b.SHOP_GOODS_CODE = #{shopGoodsCode,jdbcType=VARCHAR} ORDER_BY a.ORDER_ID,a.CREATE_TIME DESC
     * @param queryMallOrderList queryMallOrderList
     * @return List<TaOrderDetDO>
     */
    List<TaOrderDetDO> getMallOrderListResult(QueryMallOrderListPage queryMallOrderList);
    /**
     * desc:根据主键获取数据:TA_ORDER_DET.<br/>
     * descSql =  SELECT COUNT(*) FROM TA_ORDER_DET WHERE ORDER_ID = #{orderId,jdbcType=BIGINT}
     * @param orderId orderId
     * @return Integer
     */
    Integer getOrderDetCountByOrderId(Long orderId);
    /**
     * desc:根据主键获取数据:TA_ORDER_DET.<br/>
     * descSql =  SELECT b.`VIP_ID` vipId ,a.`SKU_ID` skuId ,b.`GROUP_ID` groupId ,b.`USER_GROUP_ID` userGroupId FROM `ta_order_det` a LEFT JOIN `ta_order` b on a.`ORDER_ID` =b.`ID` WHERE b.`ID` = = #{id,jdbcType=BIGINT}
     * @param id id
     * @return GroupVO
     */
    GroupVO getOrderDetByOrderId(Long id);
    /**
     * desc:根据电子券消费码和店铺id获取订单明细:TA_ORDER_DET.<br/>
     * descSql =  SELECT a.ID ,a.ORDER_CODE,a.CANVER_STATUS FROM ta_order_det a LEFT JOIN ta_order b ON a.ORDER_CODE = b.ORDER_CODE WHERE b.SHOP_ID = #{shopId,jdbcType=BIGINT} AND a.CONSUME_CODE = #{consumeCode,jdbcType=VARCHAR}
     * @param shopId shopId
     * @param consumeCode consumeCode
     * @return TaOrderDetDO
     */
    TaOrderDetDO getOrderDetByCodeAndShopId(@Param("shopId")Long shopId,@Param("consumeCode")String consumeCode);
    /**
     * desc:根据电子券消费码和核销状态获取订单明细统计个数:TA_ORDER_DET.<br/>
     * descSql =  SELECT COUNT(*) FROM TA_ORDER_DET WHERE CONSUME_CODE = 'NONECANVER' AND ORDER_CODE = #{orderCode,jdbcType=VARCHAR}
     * @param orderCode orderCode
     * @return Integer
     */
    Integer getConveredOrderDetByCode(String orderCode);
    /**
     * desc:根据主键获取数据:TA_ORDER_DET.<br/>
     * descSql =  SELECT b.SHOP_ID shopId,a.GOODS_ID goodsId FROM ta_order_det a LEFT JOIN ta_order b ON a.ORDER_ID = b.ID LEFT JOIN ta_funds_order c ON c.ORDER_ID = b.ID LEFT JOIN ta_pay_funds d ON d.ID = c.PAY_FUNDS_ID WHERE a.VALID_STATUS IS NOT NULL AND d.PAY_ID = #{payId,jdbcType=BIGINT}
     * @param payId payId
     * @return List<Map>
     */
    List<Map> getShopIdAndGoodsIdByPayId(Long payId);
    /**
     * desc:根据主键删除数据:TA_ORDER_DET.<br/>
     * descSql =  DELETE FROM TA_ORDER_DET WHERE ,ORI_ORDER_CODE = #{oriOrderCode,jdbcType=VARCHAR}
     * @param oriOrderCode oriOrderCode
     * @return Long
     */
    Long deleteByOriOrderCode(String oriOrderCode);
}
