package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TgDosMerchDO;
import java.util.List;
import java.util.Map;
import java.lang.Integer;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TG_DOS_MERCH.
 * TG_DOS_MERCH
 */
public interface TgDosMerchDOMapper{

    /**
     * desc:插入表:TG_DOS_MERCH.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TG_DOS_MERCH( ID ,MALL_ID ,REMARK ,SHOP_ID ,DOS_DATE ,MALL_NAME ,SALES_AMT ,SHOP_NAME ,ALTER_EMPL ,ALTER_TIME ,COMPANY_ID ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,COMPANY_NAME ,SALES_VOLUME ,ORDER_QUANTITY ,MAXIMUM_TURNOVER ,PURCHASE_USERS_NUMBER ,REFUND_ORDER_QUANTITY )VALUES( #{id,jdbcType=BIGINT} , #{mallId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{dosDate,jdbcType=TIMESTAMP} , #{mallName,jdbcType=VARCHAR} , #{salesAmt,jdbcType=DECIMAL} , #{shopName,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{companyId,jdbcType=BIGINT} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{companyName,jdbcType=VARCHAR} , #{salesVolume,jdbcType=DECIMAL} , #{orderQuantity,jdbcType=INTEGER} , #{maximumTurnover,jdbcType=DECIMAL} , #{purchaseUsersNumber,jdbcType=INTEGER} , #{refundOrderQuantity,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    Long insert(TgDosMerchDO entity);
    /**
     * desc:更新表:TG_DOS_MERCH.<br/>
     * descSql =  UPDATE TG_DOS_MERCH SET MALL_ID = #{mallId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,DOS_DATE = #{dosDate,jdbcType=TIMESTAMP} ,MALL_NAME = #{mallName,jdbcType=VARCHAR} ,SALES_AMT = #{salesAmt,jdbcType=DECIMAL} ,SHOP_NAME = #{shopName,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,COMPANY_ID = #{companyId,jdbcType=BIGINT} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,COMPANY_NAME = #{companyName,jdbcType=VARCHAR} ,SALES_VOLUME = #{salesVolume,jdbcType=DECIMAL} ,ORDER_QUANTITY = #{orderQuantity,jdbcType=INTEGER} ,MAXIMUM_TURNOVER = #{maximumTurnover,jdbcType=DECIMAL} ,PURCHASE_USERS_NUMBER = #{purchaseUsersNumber,jdbcType=INTEGER} ,REFUND_ORDER_QUANTITY = #{refundOrderQuantity,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TgDosMerchDO entity);
    /**
     * desc:根据主键删除数据:TG_DOS_MERCH.<br/>
     * descSql =  DELETE FROM TG_DOS_MERCH WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TG_DOS_MERCH.<br/>
     * descSql =  SELECT * FROM TG_DOS_MERCH WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TgDosMerchDO
     */
    TgDosMerchDO getByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TG_DOS_MERCH.<br/>
     * descSql =  SELECT * FROM TG_DOS_MERCH WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} LIMIT 7
     * @param shopId shopId
     * @return List<TgDosMerchDO>
     */
    List<TgDosMerchDO> getShopWeekSale(Long shopId);
    /**
     * desc:根据主键获取数据:TG_DOS_MERCH.<br/>
     * descSql =  SELECT * FROM TG_DOS_MERCH WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} LIMIT 30
     * @param shopId shopId
     * @return List<TgDosMerchDO>
     */
    List<TgDosMerchDO> getShopMonthSale(Long shopId);
    /**
     * desc:根据主键获取数据:TG_DOS_MERCH.<br/>
     * descSql =  SELECT * FROM TG_DOS_MERCH WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} LIMIT 90
     * @param shopId shopId
     * @return List<TgDosMerchDO>
     */
    List<TgDosMerchDO> getShopQuarterSale(Long shopId);
    /**
     * desc:获取月份时间内求和数据.<br/>
     * descSql =  SELECT SUM(ORDER_QUANTITY) orderQuantity, SUM(REFUND_ORDER_QUANTITY) refundOrderQuantity, SUM(SALES_AMT) salesAmt, SUM(SALES_VOLUME) salesVolume, SUM(PURCHASE_USERS_NUMBER) purchaseUsersNumber, MAX(MAXIMUM_TURNOVER) maximumTurnover FROM tg_dos_merch AND MALL_ID = #{mallId,jdbcType=BIGINT} AND COMPANY_ID = #{companyId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} AND DATE_FORMAT(DOS_DATE,'%Y%m') = DATE_FORMAT(DATE_SUB(curdate(), INTERVAL #{index,jdbcType=INTEGER} MONTH), '%Y%m') 
     * @param mallId mallId
     * @param shopId shopId
     * @param companyId companyId
     * @param index index
     * @return Map
     */
    Map getMonthlyPeriodSaleDate(@Param("mallId")Long mallId,@Param("shopId")Long shopId,@Param("companyId")Long companyId,@Param("index")Integer index);
    /**
     * desc:获取时间段内求和数据,适用于天,周.<br/>
     * descSql =  SELECT SUM(ORDER_QUANTITY) orderQuantity, SUM(REFUND_ORDER_QUANTITY) refundOrderQuantity, SUM(SALES_AMT) salesAmt, SUM(SALES_VOLUME) salesVolume, SUM(PURCHASE_USERS_NUMBER) purchaseUsersNumber, MAX(MAXIMUM_TURNOVER) maximumTurnover FROM tg_dos_merch AND MALL_ID = #{mallId,jdbcType=BIGINT} AND COMPANY_ID = #{companyId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} AND DATE_FORMAT(DOS_DATE,'%Y%m%d') BETWEEN DATE_FORMAT(DATE_SUB(curdate(), INTERVAL #{beginIndex,jdbcType=INTEGER} DAY), '%Y%m%d') AND DATE_FORMAT(DATE_SUB(curdate(), INTERVAL #{endIndex,jdbcType=INTEGER} DAY), '%Y%m%d') 
     * @param mallId mallId
     * @param shopId shopId
     * @param companyId companyId
     * @param endIndex endIndex
     * @param beginIndex beginIndex
     * @return Map
     */
    Map getDailyPeriodSaleDate(@Param("mallId")Long mallId,@Param("shopId")Long shopId,@Param("companyId")Long companyId,@Param("endIndex")Integer endIndex,@Param("beginIndex")Integer beginIndex);
    /**
     * desc:获取专业公司下有效店铺数正常/打烊:TG_DOS_MERCH.<br/>
     * descSql =  SELECT COUNT(*) shopCount FROM ta_shop WHERE COMPANY_ID = #{companyId,jdbcType=BIGINT} AND SHOP_STATUS IN ("NORMAL","CLOSESTORE")
     * @param companyId companyId
     * @return Integer
     */
    Integer getCompanyShopCount(Long companyId);
    /**
     * desc:获取商场下有效店铺数正常/打烊:TG_DOS_MERCH.<br/>
     * descSql =  SELECT COUNT(*) shopCount FROM ta_shop WHERE MALL_ID = #{mallId,jdbcType=BIGINT} AND SHOP_STATUS IN ("NORMAL","CLOSESTORE")
     * @param mallId mallId
     * @return Integer
     */
    Integer getMallShopCount(Long mallId);
    /**
     * desc:获取专业公司下有效店铺数 外部/内部:TG_DOS_MERCH.<br/>
     * descSql =  SELECT COUNT(*) shopCount FROM ta_shop WHERE COMPANY_ID = #{companyId,jdbcType=BIGINT} AND SHOP_TYPE = #{shopType,jdbcType=VARCHAR} AND SHOP_STATUS IN ("NORMAL","CLOSESTORE")
     * @param companyId companyId
     * @param shopType shopType
     * @return Integer
     */
    Integer getCompanyShopCountByType(@Param("companyId")Long companyId,@Param("shopType")String shopType);
}
