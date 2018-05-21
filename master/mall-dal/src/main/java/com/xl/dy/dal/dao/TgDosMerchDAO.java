package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TgDosMerchDO;
import java.util.List;
import java.util.Map;
import java.lang.Integer;
import com.xl.dy.dal.mapper.TgDosMerchDOMapper;

/**
* The Table TG_DOS_MERCH.
* TG_DOS_MERCH
*/
@Repository
public class TgDosMerchDAO{

    @Autowired
    private TgDosMerchDOMapper tgDosMerchDOMapper;

    /**
     * desc:插入表:TG_DOS_MERCH.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TG_DOS_MERCH( ID ,MALL_ID ,REMARK ,SHOP_ID ,DOS_DATE ,MALL_NAME ,SALES_AMT ,SHOP_NAME ,ALTER_EMPL ,ALTER_TIME ,COMPANY_ID ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,COMPANY_NAME ,SALES_VOLUME ,ORDER_QUANTITY ,MAXIMUM_TURNOVER ,PURCHASE_USERS_NUMBER ,REFUND_ORDER_QUANTITY )VALUES( #{id,jdbcType=BIGINT} , #{mallId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{dosDate,jdbcType=TIMESTAMP} , #{mallName,jdbcType=VARCHAR} , #{salesAmt,jdbcType=DECIMAL} , #{shopName,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{companyId,jdbcType=BIGINT} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{companyName,jdbcType=VARCHAR} , #{salesVolume,jdbcType=DECIMAL} , #{orderQuantity,jdbcType=INTEGER} , #{maximumTurnover,jdbcType=DECIMAL} , #{purchaseUsersNumber,jdbcType=INTEGER} , #{refundOrderQuantity,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TgDosMerchDO entity){
        return tgDosMerchDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TG_DOS_MERCH.<br/>
     * descSql =  UPDATE TG_DOS_MERCH SET MALL_ID = #{mallId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,DOS_DATE = #{dosDate,jdbcType=TIMESTAMP} ,MALL_NAME = #{mallName,jdbcType=VARCHAR} ,SALES_AMT = #{salesAmt,jdbcType=DECIMAL} ,SHOP_NAME = #{shopName,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,COMPANY_ID = #{companyId,jdbcType=BIGINT} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,COMPANY_NAME = #{companyName,jdbcType=VARCHAR} ,SALES_VOLUME = #{salesVolume,jdbcType=DECIMAL} ,ORDER_QUANTITY = #{orderQuantity,jdbcType=INTEGER} ,MAXIMUM_TURNOVER = #{maximumTurnover,jdbcType=DECIMAL} ,PURCHASE_USERS_NUMBER = #{purchaseUsersNumber,jdbcType=INTEGER} ,REFUND_ORDER_QUANTITY = #{refundOrderQuantity,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TgDosMerchDO entity){
        return tgDosMerchDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TG_DOS_MERCH.<br/>
     * descSql =  DELETE FROM TG_DOS_MERCH WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return tgDosMerchDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TG_DOS_MERCH.<br/>
     * descSql =  SELECT * FROM TG_DOS_MERCH WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TgDosMerchDO
     */
    public TgDosMerchDO getByPrimary(Long id){
        return tgDosMerchDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TG_DOS_MERCH.<br/>
     * descSql =  SELECT * FROM TG_DOS_MERCH WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} LIMIT 7
     * @param shopId shopId
     * @return List<TgDosMerchDO>
     */
    public List<TgDosMerchDO> getShopWeekSale(Long shopId){
        return tgDosMerchDOMapper.getShopWeekSale(shopId);
    }
    /**
     * desc:根据主键获取数据:TG_DOS_MERCH.<br/>
     * descSql =  SELECT * FROM TG_DOS_MERCH WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} LIMIT 30
     * @param shopId shopId
     * @return List<TgDosMerchDO>
     */
    public List<TgDosMerchDO> getShopMonthSale(Long shopId){
        return tgDosMerchDOMapper.getShopMonthSale(shopId);
    }
    /**
     * desc:根据主键获取数据:TG_DOS_MERCH.<br/>
     * descSql =  SELECT * FROM TG_DOS_MERCH WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} LIMIT 90
     * @param shopId shopId
     * @return List<TgDosMerchDO>
     */
    public List<TgDosMerchDO> getShopQuarterSale(Long shopId){
        return tgDosMerchDOMapper.getShopQuarterSale(shopId);
    }
    /**
     * desc:获取月份时间内求和数据.<br/>
     * descSql =  SELECT SUM(ORDER_QUANTITY) orderQuantity, SUM(REFUND_ORDER_QUANTITY) refundOrderQuantity, SUM(SALES_AMT) salesAmt, SUM(SALES_VOLUME) salesVolume, SUM(PURCHASE_USERS_NUMBER) purchaseUsersNumber, MAX(MAXIMUM_TURNOVER) maximumTurnover FROM tg_dos_merch AND MALL_ID = #{mallId,jdbcType=BIGINT} AND COMPANY_ID = #{companyId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} AND DATE_FORMAT(DOS_DATE,'%Y%m') = DATE_FORMAT(DATE_SUB(curdate(), INTERVAL #{index,jdbcType=INTEGER} MONTH), '%Y%m') 
     * @param mallId mallId
     * @param shopId shopId
     * @param companyId companyId
     * @param index index
     * @return Map
     */
    public Map getMonthlyPeriodSaleDate(Long mallId,Long shopId,Long companyId,Integer index){
        return tgDosMerchDOMapper.getMonthlyPeriodSaleDate(mallId, shopId, companyId, index);
    }
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
    public Map getDailyPeriodSaleDate(Long mallId,Long shopId,Long companyId,Integer endIndex,Integer beginIndex){
        return tgDosMerchDOMapper.getDailyPeriodSaleDate(mallId, shopId, companyId, endIndex, beginIndex);
    }
    /**
     * desc:获取专业公司下有效店铺数正常/打烊:TG_DOS_MERCH.<br/>
     * descSql =  SELECT COUNT(*) shopCount FROM ta_shop WHERE COMPANY_ID = #{companyId,jdbcType=BIGINT} AND SHOP_STATUS IN ("NORMAL","CLOSESTORE")
     * @param companyId companyId
     * @return Integer
     */
    public Integer getCompanyShopCount(Long companyId){
        return tgDosMerchDOMapper.getCompanyShopCount(companyId);
    }
    /**
     * desc:获取商场下有效店铺数正常/打烊:TG_DOS_MERCH.<br/>
     * descSql =  SELECT COUNT(*) shopCount FROM ta_shop WHERE MALL_ID = #{mallId,jdbcType=BIGINT} AND SHOP_STATUS IN ("NORMAL","CLOSESTORE")
     * @param mallId mallId
     * @return Integer
     */
    public Integer getMallShopCount(Long mallId){
        return tgDosMerchDOMapper.getMallShopCount(mallId);
    }
    /**
     * desc:获取专业公司下有效店铺数 外部/内部:TG_DOS_MERCH.<br/>
     * descSql =  SELECT COUNT(*) shopCount FROM ta_shop WHERE COMPANY_ID = #{companyId,jdbcType=BIGINT} AND SHOP_TYPE = #{shopType,jdbcType=VARCHAR} AND SHOP_STATUS IN ("NORMAL","CLOSESTORE")
     * @param companyId companyId
     * @param shopType shopType
     * @return Integer
     */
    public Integer getCompanyShopCountByType(Long companyId,String shopType){
        return tgDosMerchDOMapper.getCompanyShopCountByType(companyId, shopType);
    }
}
