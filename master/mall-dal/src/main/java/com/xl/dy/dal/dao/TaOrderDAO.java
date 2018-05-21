package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaOrderDO;
import java.util.Map;
import java.util.List;
import com.xl.dy.dal.paging.QueryShopOrderListPage;
import com.xl.dy.dal.mapper.TaOrderDOMapper;

/**
* The Table TA_ORDER.
* TA_ORDER
*/
@Repository
public class TaOrderDAO{

    @Autowired
    private TaOrderDOMapper taOrderDOMapper;

    /**
     * desc:???�表:TA_ORDER.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_ORDER( ID ,ADDR ,VIP_ID ,CITY_ID ,LOGI_ID ,MALL_ID ,PAY_AMT ,REMARK ,SHOP_ID ,SQ_CODE ,VIP_MSG ,VIP_NAME ,AL_PAY_AMT ,CITY_NAME ,IS_CANVER ,IS_REFUND ,MALL_NAME ,MALL_TYPE ,POINT_AMT ,SHOP_NAME ,ALTER_EMPL ,ALTER_TIME ,COMPANY_ID ,FAM_MEM_NUM ,IS_INVOICE ,MOBILE_TEL ,ORDER_CODE ,ORDER_TYPE ,PAY_STATUS ,TIMESTAMP ,TRACK_CODE ,TRACK_TIME ,CREATE_EMPL ,CREATE_TIME ,DISTRICT_ID ,MALL_STATUS ,PAY_COM_TIME ,PAY_DISC_AMT ,PROVINCE_ID ,AL_REFUND_AMT ,COMPANY_NAME ,INVOICE_TYPE ,IS_FAMILY_VIP ,MALL_MONGO_ID ,ORDER_STATUS ,PAY_MODE_JSON ,PAY_TOTAL_AMT ,REFUND_CAUSE ,SALE_UNIT_AFF ,SHOP_MONGO_ID ,CONSUME_POINT ,DISTRICT_NAME ,DY_VIP_LEVEL_ID ,FIRST_PAY_TIME ,GET_GOODS_MODE ,INVOICE_TITLE ,ORDER_FUNDS_ID ,ORI_ORDER_CODE ,PROVINCE_NAME ,SUBDISTICT_ID ,INVOICE_BANK_NO ,PAY_POSTAGE_AMT ,RECEI_EMPL_NAME ,COMPANY_MONGO_ID ,DY_VIP_LEVEL_NAME ,IS_EXISTS_REFUND ,ORDER_CLOSE_TIME ,PICKUP_LOCATION ,RECEI_MOBILE_TEL ,SUBDISTICT_NAME ,INVOICE_BANK_NAME ,SQ_SHIPPER_EMPL_ID ,EVALUATION_STATUS ,INVOICE_TAXPAYER_NO ,SQ_SHIPPER_EMPL_NAME ,SQ_SHIPPER_MOBILE_TEL ,INVOICE_REGISTERED_TEL ,SHOP_PICKUP_LOCATION_ID ,INVOICE_REGISTERED_UNIT ,INVOICE_REGISTERED_ADDRESS )VALUES( #{id,jdbcType=BIGINT} , #{addr,jdbcType=VARCHAR} , #{vipId,jdbcType=BIGINT} , #{cityId,jdbcType=BIGINT} , #{logiId,jdbcType=BIGINT} , #{mallId,jdbcType=BIGINT} , #{payAmt,jdbcType=DECIMAL} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{sqCode,jdbcType=VARCHAR} , #{vipMsg,jdbcType=VARCHAR} , #{vipName,jdbcType=VARCHAR} , #{alPayAmt,jdbcType=DECIMAL} , #{cityName,jdbcType=VARCHAR} , #{isCanver,jdbcType=INTEGER} , #{isRefund,jdbcType=INTEGER} , #{mallName,jdbcType=VARCHAR} , #{mallType,jdbcType=VARCHAR} , #{pointAmt,jdbcType=DECIMAL} , #{shopName,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{companyId,jdbcType=BIGINT} , #{famMemNum,jdbcType=INTEGER} , #{isInvoice,jdbcType=INTEGER} , #{mobileTel,jdbcType=VARCHAR} , #{orderCode,jdbcType=VARCHAR} , #{orderType,jdbcType=VARCHAR} , #{payStatus,jdbcType=VARCHAR} , #{timestamp,jdbcType=BIGINT} , #{trackCode,jdbcType=VARCHAR} , #{trackTime,jdbcType=TIMESTAMP} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{districtId,jdbcType=BIGINT} , #{mallStatus,jdbcType=VARCHAR} , #{payComTime,jdbcType=TIMESTAMP} , #{payDiscAmt,jdbcType=DECIMAL} , #{provinceId,jdbcType=BIGINT} , #{alRefundAmt,jdbcType=DECIMAL} , #{companyName,jdbcType=VARCHAR} , #{invoiceType,jdbcType=INTEGER} , #{isFamilyVip,jdbcType=INTEGER} , #{mallMongoId,jdbcType=VARCHAR} , #{orderStatus,jdbcType=VARCHAR} , #{payModeJson,jdbcType=VARCHAR} , #{payTotalAmt,jdbcType=DECIMAL} , #{refundCause,jdbcType=VARCHAR} , #{saleUnitAff,jdbcType=VARCHAR} , #{shopMongoId,jdbcType=VARCHAR} , #{consumePoint,jdbcType=DECIMAL} , #{districtName,jdbcType=VARCHAR} , #{dyVipLevelId,jdbcType=BIGINT} , #{firstPayTime,jdbcType=TIMESTAMP} , #{getGoodsMode,jdbcType=VARCHAR} , #{invoiceTitle,jdbcType=VARCHAR} , #{orderFundsId,jdbcType=BIGINT} , #{oriOrderCode,jdbcType=VARCHAR} , #{provinceName,jdbcType=VARCHAR} , #{subdistictId,jdbcType=BIGINT} , #{invoiceBankNo,jdbcType=VARCHAR} , #{payPostageAmt,jdbcType=DECIMAL} , #{receiEmplName,jdbcType=VARCHAR} , #{companyMongoId,jdbcType=VARCHAR} , #{dyVipLevelName,jdbcType=VARCHAR} , #{isExistsRefund,jdbcType=INTEGER} , #{orderCloseTime,jdbcType=TIMESTAMP} , #{pickupLocation,jdbcType=VARCHAR} , #{receiMobileTel,jdbcType=VARCHAR} , #{subdistictName,jdbcType=VARCHAR} , #{invoiceBankName,jdbcType=VARCHAR} , #{sqShipperEmplId,jdbcType=BIGINT} , #{evaluationStatus,jdbcType=VARCHAR} , #{invoiceTaxpayerNo,jdbcType=VARCHAR} , #{sqShipperEmplName,jdbcType=VARCHAR} , #{sqShipperMobileTel,jdbcType=VARCHAR} , #{invoiceRegisteredTel,jdbcType=VARCHAR} , #{shopPickupLocationId,jdbcType=BIGINT} , #{invoiceRegisteredUnit,jdbcType=VARCHAR} , #{invoiceRegisteredAddress,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaOrderDO entity){
        return taOrderDOMapper.insert(entity);
    }
    /**
     * desc:?��?�表:TA_ORDER.<br/>
     * descSql =  UPDATE TA_ORDER SET ADDR = #{addr,jdbcType=VARCHAR} ,VIP_ID = #{vipId,jdbcType=BIGINT} ,CITY_ID = #{cityId,jdbcType=BIGINT} ,LOGI_ID = #{logiId,jdbcType=BIGINT} ,MALL_ID = #{mallId,jdbcType=BIGINT} ,PAY_AMT = #{payAmt,jdbcType=DECIMAL} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,SQ_CODE = #{sqCode,jdbcType=VARCHAR} ,VIP_MSG = #{vipMsg,jdbcType=VARCHAR} ,VIP_NAME = #{vipName,jdbcType=VARCHAR} ,AL_PAY_AMT = #{alPayAmt,jdbcType=DECIMAL} ,CITY_NAME = #{cityName,jdbcType=VARCHAR} ,IS_CANVER = #{isCanver,jdbcType=INTEGER} ,IS_REFUND = #{isRefund,jdbcType=INTEGER} ,MALL_NAME = #{mallName,jdbcType=VARCHAR} ,MALL_TYPE = #{mallType,jdbcType=VARCHAR} ,POINT_AMT = #{pointAmt,jdbcType=DECIMAL} ,SHOP_NAME = #{shopName,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,COMPANY_ID = #{companyId,jdbcType=BIGINT} ,FAM_MEM_NUM = #{famMemNum,jdbcType=INTEGER} ,IS_INVOICE = #{isInvoice,jdbcType=INTEGER} ,MOBILE_TEL = #{mobileTel,jdbcType=VARCHAR} ,ORDER_CODE = #{orderCode,jdbcType=VARCHAR} ,ORDER_TYPE = #{orderType,jdbcType=VARCHAR} ,PAY_STATUS = #{payStatus,jdbcType=VARCHAR} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,TRACK_CODE = #{trackCode,jdbcType=VARCHAR} ,TRACK_TIME = #{trackTime,jdbcType=TIMESTAMP} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,DISTRICT_ID = #{districtId,jdbcType=BIGINT} ,MALL_STATUS = #{mallStatus,jdbcType=VARCHAR} ,PAY_COM_TIME = #{payComTime,jdbcType=TIMESTAMP} ,PAY_DISC_AMT = #{payDiscAmt,jdbcType=DECIMAL} ,PROVINCE_ID = #{provinceId,jdbcType=BIGINT} ,AL_REFUND_AMT = #{alRefundAmt,jdbcType=DECIMAL} ,COMPANY_NAME = #{companyName,jdbcType=VARCHAR} ,INVOICE_TYPE = #{invoiceType,jdbcType=INTEGER} ,IS_FAMILY_VIP = #{isFamilyVip,jdbcType=INTEGER} ,MALL_MONGO_ID = #{mallMongoId,jdbcType=VARCHAR} ,ORDER_STATUS = #{orderStatus,jdbcType=VARCHAR} ,PAY_MODE_JSON = #{payModeJson,jdbcType=VARCHAR} ,PAY_TOTAL_AMT = #{payTotalAmt,jdbcType=DECIMAL} ,REFUND_CAUSE = #{refundCause,jdbcType=VARCHAR} ,SALE_UNIT_AFF = #{saleUnitAff,jdbcType=VARCHAR} ,SHOP_MONGO_ID = #{shopMongoId,jdbcType=VARCHAR} ,CONSUME_POINT = #{consumePoint,jdbcType=DECIMAL} ,DISTRICT_NAME = #{districtName,jdbcType=VARCHAR} ,DY_VIP_LEVEL_ID = #{dyVipLevelId,jdbcType=BIGINT} ,FIRST_PAY_TIME = #{firstPayTime,jdbcType=TIMESTAMP} ,GET_GOODS_MODE = #{getGoodsMode,jdbcType=VARCHAR} ,INVOICE_TITLE = #{invoiceTitle,jdbcType=VARCHAR} ,ORDER_FUNDS_ID = #{orderFundsId,jdbcType=BIGINT} ,ORI_ORDER_CODE = #{oriOrderCode,jdbcType=VARCHAR} ,PROVINCE_NAME = #{provinceName,jdbcType=VARCHAR} ,SUBDISTICT_ID = #{subdistictId,jdbcType=BIGINT} ,INVOICE_BANK_NO = #{invoiceBankNo,jdbcType=VARCHAR} ,PAY_POSTAGE_AMT = #{payPostageAmt,jdbcType=DECIMAL} ,RECEI_EMPL_NAME = #{receiEmplName,jdbcType=VARCHAR} ,COMPANY_MONGO_ID = #{companyMongoId,jdbcType=VARCHAR} ,DY_VIP_LEVEL_NAME = #{dyVipLevelName,jdbcType=VARCHAR} ,IS_EXISTS_REFUND = #{isExistsRefund,jdbcType=INTEGER} ,ORDER_CLOSE_TIME = #{orderCloseTime,jdbcType=TIMESTAMP} ,PICKUP_LOCATION = #{pickupLocation,jdbcType=VARCHAR} ,RECEI_MOBILE_TEL = #{receiMobileTel,jdbcType=VARCHAR} ,SUBDISTICT_NAME = #{subdistictName,jdbcType=VARCHAR} ,INVOICE_BANK_NAME = #{invoiceBankName,jdbcType=VARCHAR} ,SQ_SHIPPER_EMPL_ID = #{sqShipperEmplId,jdbcType=BIGINT} ,EVALUATION_STATUS = #{evaluationStatus,jdbcType=VARCHAR} ,INVOICE_TAXPAYER_NO = #{invoiceTaxpayerNo,jdbcType=VARCHAR} ,SQ_SHIPPER_EMPL_NAME = #{sqShipperEmplName,jdbcType=VARCHAR} ,SQ_SHIPPER_MOBILE_TEL = #{sqShipperMobileTel,jdbcType=VARCHAR} ,INVOICE_REGISTERED_TEL = #{invoiceRegisteredTel,jdbcType=VARCHAR} ,SHOP_PICKUP_LOCATION_ID = #{shopPickupLocationId,jdbcType=BIGINT} ,INVOICE_REGISTERED_UNIT = #{invoiceRegisteredUnit,jdbcType=VARCHAR} ,INVOICE_REGISTERED_ADDRESS = #{invoiceRegisteredAddress,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaOrderDO entity){
        return taOrderDOMapper.update(entity);
    }
    /**
     * desc:?��??主�?????��?��??:TA_ORDER.<br/>
     * descSql =  DELETE FROM TA_ORDER WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taOrderDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:?��??主�???��???��??:TA_ORDER.<br/>
     * descSql =  SELECT * FROM TA_ORDER WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaOrderDO
     */
    public TaOrderDO getByPrimary(Long id){
        return taOrderDOMapper.getByPrimary(id);
    }
    /**
     * desc:获取优惠卷订单列表:TA_ORDER.<br/>
     * descSql =  SELECT b.VIP_NAME vipName, b.MOBILE_TEL mobiletel, b.PAY_TOTAL_AMT payTotalAmt, b.CREATE_TIME orderTime FROM ta_order_disc_list a LEFT JOIN TA_ORDER b ON a.ORDER_ID = b.ID WHERE a.COUPON_USER_ID = #{couponUserId,jdbcType=BIGINT}
     * @param couponUserId couponUserId
     * @return List<Map>
     */
    public List<Map> getshopCouponOrder(Long couponUserId){
        return taOrderDOMapper.getshopCouponOrder(couponUserId);
    }
    /**
     * desc:根据ShopId获取不同类型的订单:TA_ORDER.<br/>
     * descSql =  SELECT ID id,VIP_NAME vipName,ORDER_STATUS orderStatus,ORDER_REFUND_STATUS orderRefundStatus,PAY_AMT payAmt,CREATE_TIME createTime FROM TA_ORDER WHERE ORDER_TYPE = #{orderType,jdbcType=VARCHAR} AND SHOP_ID = #{shopId,jdbcType=BIGINT} AND ORDER_STATUS = #{orderStatus,jdbcType=VARCHAR} AND EVALUATION_STATUS = #{evaluationStatus,jdbcType=VARCHAR} ORDER BY CREATE_TIME DESC
     * @param queryShopOrderList queryShopOrderList
     * @return QueryShopOrderListPage
     */
    public QueryShopOrderListPage getShopOrderList(QueryShopOrderListPage queryShopOrderList){
        int total = taOrderDOMapper.getShopOrderListCount(queryShopOrderList);
        if(total>0){
            queryShopOrderList.setDatas(taOrderDOMapper.getShopOrderListResult(queryShopOrderList));
        }
        queryShopOrderList.setTotal(total);
        return queryShopOrderList;
    }
}
