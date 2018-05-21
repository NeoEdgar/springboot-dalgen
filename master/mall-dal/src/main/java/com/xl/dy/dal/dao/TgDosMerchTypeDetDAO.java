package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TgDosMerchTypeDetDO;
import java.util.Map;
import java.util.List;
import com.xl.dy.dal.mapper.TgDosMerchTypeDetDOMapper;

/**
* The Table TG_DOS_MERCH_TYPE_DET.
* TG_DOS_MERCH_TYPE_DET
*/
@Repository
public class TgDosMerchTypeDetDAO{

    @Autowired
    private TgDosMerchTypeDetDOMapper tgDosMerchTypeDetDOMapper;

    /**
     * desc:插入表:TG_DOS_MERCH_TYPE_DET.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TG_DOS_MERCH_TYPE_DET( ID ,DOS_ID ,REMARK ,DOS_DATE ,SALES_AMT ,ALTER_EMPL ,ALTER_TIME ,ORDER_TYPE ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,SALES_VOLUME ,ORDER_QUANTITY ,COUPONS_USE_NUMBER ,COUPON_DISCOUNT_AMT ,PURCHASE_USERS_NUMBER ,REFUND_ORDER_QUANTITY )VALUES( #{id,jdbcType=BIGINT} , #{dosId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{dosDate,jdbcType=TIMESTAMP} , #{salesAmt,jdbcType=DECIMAL} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{orderType,jdbcType=VARCHAR} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{salesVolume,jdbcType=DECIMAL} , #{orderQuantity,jdbcType=INTEGER} , #{couponsUseNumber,jdbcType=INTEGER} , #{couponDiscountAmt,jdbcType=DECIMAL} , #{purchaseUsersNumber,jdbcType=INTEGER} , #{refundOrderQuantity,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TgDosMerchTypeDetDO entity){
        return tgDosMerchTypeDetDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TG_DOS_MERCH_TYPE_DET.<br/>
     * descSql =  UPDATE TG_DOS_MERCH_TYPE_DET SET DOS_ID = #{dosId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,DOS_DATE = #{dosDate,jdbcType=TIMESTAMP} ,SALES_AMT = #{salesAmt,jdbcType=DECIMAL} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,ORDER_TYPE = #{orderType,jdbcType=VARCHAR} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,SALES_VOLUME = #{salesVolume,jdbcType=DECIMAL} ,ORDER_QUANTITY = #{orderQuantity,jdbcType=INTEGER} ,COUPONS_USE_NUMBER = #{couponsUseNumber,jdbcType=INTEGER} ,COUPON_DISCOUNT_AMT = #{couponDiscountAmt,jdbcType=DECIMAL} ,PURCHASE_USERS_NUMBER = #{purchaseUsersNumber,jdbcType=INTEGER} ,REFUND_ORDER_QUANTITY = #{refundOrderQuantity,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TgDosMerchTypeDetDO entity){
        return tgDosMerchTypeDetDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TG_DOS_MERCH_TYPE_DET.<br/>
     * descSql =  DELETE FROM TG_DOS_MERCH_TYPE_DET WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return tgDosMerchTypeDetDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TG_DOS_MERCH_TYPE_DET.<br/>
     * descSql =  SELECT * FROM TG_DOS_MERCH_TYPE_DET WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TgDosMerchTypeDetDO
     */
    public TgDosMerchTypeDetDO getByPrimary(Long id){
        return tgDosMerchTypeDetDOMapper.getByPrimary(id);
    }
    /**
     * desc:获取月度各类型的订单数据:TG_DOS_MERCH_TYPE_DET.<br/>
     * descSql =  SELECT ORDER_TYPE orderType, SUM(ORDER_QUANTITY) orderQuantity, SUM(REFUND_ORDER_QUANTITY) refundOrderQuantity, SUM(SALES_AMT) salesAmt, SUM(SALES_VOLUME) salesVolume, SUM(PURCHASE_USERS_NUMBER) purchaseUsersNumber, SUM(COUPONS_USE_NUMBER) couponsUseNumber, SUM(COUPON_DISCOUNT_AMT) couponDiscountAmt FROM TG_DOS_MERCH_TYPE_DET WHERE DATE_FORMAT(DOS_DATE,'%Y%m') = DATE_FORMAT(DATE_SUB(curdate(), INTERVAL #{index,jdbcType=INTEGER} MONTH), '%Y%m') GROUP BY ORDER_TYPE
     * @param index index
     * @return List<Map>
     */
    public List<Map> getMonthlySalesByOrderType(Integer index){
        return tgDosMerchTypeDetDOMapper.getMonthlySalesByOrderType(index);
    }
}
