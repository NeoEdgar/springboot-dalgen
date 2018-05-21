package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TgAccountUnitDO;
import java.util.Map;
import com.xl.dy.dal.paging.QueryAccountUnitPagePage;
import com.xl.dy.dal.paging.QueryMallDetailPagePage;
import com.xl.dy.dal.mapper.TgAccountUnitDOMapper;

/**
* The Table TG_ACCOUNT_UNIT.
* TG_ACCOUNT_UNIT
*/
@Repository
public class TgAccountUnitDAO{

    @Autowired
    private TgAccountUnitDOMapper tgAccountUnitDOMapper;

    /**
     * desc:插入表:TG_ACCOUNT_UNIT.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TG_ACCOUNT_UNIT( ID ,REMARK ,LINKMAN ,LINKTEL ,SETT_MODE ,SETT_TYPE ,ALTER_EMPL ,ALTER_TIME ,SETT_STYLE ,TIMESTAMP ,ACCOUNT_DAY ,CLIENT_CODE ,CREATE_EMPL ,CREATE_TIME ,SETT_BANK_NO ,INVOICE_TYPE ,VALID_STATUS ,INVOICE_EMAIL ,INVOICE_TITLE ,IS_PRO_INVOICE ,SETT_BANK_EMPL ,SETT_BANK_NAME ,INVOICE_BANK_NO ,IS_OPEN_INVOICE ,INVOICE_ADDRESS ,INVOICE_LINKMAN ,INVOICE_LINKTEL ,SETT_BANK_CITY_ID ,ACCOUNT_UNIT_NAME ,INVOICE_BANK_NAME ,ACCOUNT_UNIT_SPELL ,ACCOUNT_UNIT_SOURCE ,INVOICE_TAXPAYER_NO ,SETT_BANK_DISTRICT_ID ,SETT_BANK_PROVINCE_ID ,INVOICE_REGISTERED_TEL ,INVOICE_REGISTERED_UNIT ,INVOICE_REGISTERED_ADDRESS )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{linkman,jdbcType=VARCHAR} , #{linktel,jdbcType=VARCHAR} , #{settMode,jdbcType=VARCHAR} , #{settType,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{settStyle,jdbcType=VARCHAR} , #{timestamp,jdbcType=BIGINT} , #{accountDay,jdbcType=DATE} , #{clientCode,jdbcType=VARCHAR} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{settBankNo,jdbcType=VARCHAR} , #{invoiceType,jdbcType=VARCHAR} , #{validStatus,jdbcType=INTEGER} , #{invoiceEmail,jdbcType=VARCHAR} , #{invoiceTitle,jdbcType=VARCHAR} , #{isProInvoice,jdbcType=INTEGER} , #{settBankEmpl,jdbcType=VARCHAR} , #{settBankName,jdbcType=VARCHAR} , #{invoiceBankNo,jdbcType=VARCHAR} , #{isOpenInvoice,jdbcType=INTEGER} , #{invoiceAddress,jdbcType=VARCHAR} , #{invoiceLinkman,jdbcType=VARCHAR} , #{invoiceLinktel,jdbcType=VARCHAR} , #{settBankCityId,jdbcType=BIGINT} , #{accountUnitName,jdbcType=VARCHAR} , #{invoiceBankName,jdbcType=VARCHAR} , #{accountUnitSpell,jdbcType=VARCHAR} , #{accountUnitSource,jdbcType=VARCHAR} , #{invoiceTaxpayerNo,jdbcType=VARCHAR} , #{settBankDistrictId,jdbcType=BIGINT} , #{settBankProvinceId,jdbcType=BIGINT} , #{invoiceRegisteredTel,jdbcType=VARCHAR} , #{invoiceRegisteredUnit,jdbcType=VARCHAR} , #{invoiceRegisteredAddress,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TgAccountUnitDO entity){
        return tgAccountUnitDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TG_ACCOUNT_UNIT.<br/>
     * descSql =  UPDATE TG_ACCOUNT_UNIT SET REMARK = #{remark,jdbcType=VARCHAR} ,LINKMAN = #{linkman,jdbcType=VARCHAR} ,LINKTEL = #{linktel,jdbcType=VARCHAR} ,SETT_MODE = #{settMode,jdbcType=VARCHAR} ,SETT_TYPE = #{settType,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,SETT_STYLE = #{settStyle,jdbcType=VARCHAR} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,ACCOUNT_DAY = #{accountDay,jdbcType=DATE} ,CLIENT_CODE = #{clientCode,jdbcType=VARCHAR} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,SETT_BANK_NO = #{settBankNo,jdbcType=VARCHAR} ,INVOICE_TYPE = #{invoiceType,jdbcType=VARCHAR} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,INVOICE_EMAIL = #{invoiceEmail,jdbcType=VARCHAR} ,INVOICE_TITLE = #{invoiceTitle,jdbcType=VARCHAR} ,IS_PRO_INVOICE = #{isProInvoice,jdbcType=INTEGER} ,SETT_BANK_EMPL = #{settBankEmpl,jdbcType=VARCHAR} ,SETT_BANK_NAME = #{settBankName,jdbcType=VARCHAR} ,INVOICE_BANK_NO = #{invoiceBankNo,jdbcType=VARCHAR} ,IS_OPEN_INVOICE = #{isOpenInvoice,jdbcType=INTEGER} ,INVOICE_ADDRESS = #{invoiceAddress,jdbcType=VARCHAR} ,INVOICE_LINKMAN = #{invoiceLinkman,jdbcType=VARCHAR} ,INVOICE_LINKTEL = #{invoiceLinktel,jdbcType=VARCHAR} ,SETT_BANK_CITY_ID = #{settBankCityId,jdbcType=BIGINT} ,ACCOUNT_UNIT_NAME = #{accountUnitName,jdbcType=VARCHAR} ,INVOICE_BANK_NAME = #{invoiceBankName,jdbcType=VARCHAR} ,ACCOUNT_UNIT_SPELL = #{accountUnitSpell,jdbcType=VARCHAR} ,ACCOUNT_UNIT_SOURCE = #{accountUnitSource,jdbcType=VARCHAR} ,INVOICE_TAXPAYER_NO = #{invoiceTaxpayerNo,jdbcType=VARCHAR} ,SETT_BANK_DISTRICT_ID = #{settBankDistrictId,jdbcType=BIGINT} ,SETT_BANK_PROVINCE_ID = #{settBankProvinceId,jdbcType=BIGINT} ,INVOICE_REGISTERED_TEL = #{invoiceRegisteredTel,jdbcType=VARCHAR} ,INVOICE_REGISTERED_UNIT = #{invoiceRegisteredUnit,jdbcType=VARCHAR} ,INVOICE_REGISTERED_ADDRESS = #{invoiceRegisteredAddress,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TgAccountUnitDO entity){
        return tgAccountUnitDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TG_ACCOUNT_UNIT.<br/>
     * descSql =  DELETE FROM TG_ACCOUNT_UNIT WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return tgAccountUnitDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TG_ACCOUNT_UNIT.<br/>
     * descSql =  SELECT * FROM TG_ACCOUNT_UNIT WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TgAccountUnitDO
     */
    public TgAccountUnitDO getByPrimary(Long id){
        return tgAccountUnitDOMapper.getByPrimary(id);
    }
    /**
     * desc:获取商场详情.<br/>
     * descSql =  SELECT b.ACCOUNT_UNIT_NAME accountUnitName, b.SETT_TYPE settType, b.SETT_MODE settMode, b.CLIENT_CODE clientCode, b.LINKMAN linkman, b.LINKTEL linktel, b.SETT_BANK_CITY_ID settBankCityId, b.SETT_BANK_DISTRICT_ID settBankDistrictId, b.SETT_BANK_NO settBankNo, b.SETT_BANK_EMPL settBankEmpl, b.SETT_BANK_NAME settBankName, b.IS_OPEN_INVOICE isOpenInvoice, b.INVOICE_TYPE invoiceType, b.INVOICE_TITLE invoiceTitle, b.INVOICE_LINKMAN invoiceLinkman, b.INVOICE_LINKTEL invoiceLinktel, b.INVOICE_EMAIL invoiceEmail, b.INVOICE_ADDRESS invoiceAddress, b.INVOICE_TAXPAYER_NO invoiceTaxpayerNo, b.INVOICE_BANK_NAME invoiceBankName, b.INVOICE_BANK_NO invoiceBankNo, b.INVOICE_REGISTERED_ADDRESS invoiceRegisteredAddress, b.INVOICE_REGISTERED_TEL invoiceRegisteredTel, b.INVOICE_REGISTERED_UNIT invoiceRegisteredUnit, r.DISTRICT_NAME settBankDistrictName, r.CITY_NAME settBankCityName FROM tg_account_unit b LEFT JOIN tg_district r ON r.ID = b.SETT_BANK_DISTRICT_ID WHERE b.ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Map
     */
    public Map getAccountUnitDetail(Long id){
        return tgAccountUnitDOMapper.getAccountUnitDetail(id);
    }
    /**
     * desc:获取结算单位列表:TG_ACCOUNT_UNIT.<br/>
     * descSql =  SELECT ID accountId, ACCOUNT_UNIT_NAME accountName, CLIENT_CODE clientCode FROM TG_ACCOUNT_UNIT ACCOUNT_UNIT_NAME LIKE #{accountName,jdbcType=VARCHAR} AND CLIENT_CODE = #{clientCode,jdbcType=VARCHAR} 
     * @param queryAccountUnitPage queryAccountUnitPage
     * @return QueryAccountUnitPagePage
     */
    public QueryAccountUnitPagePage getAccountUnitPage(QueryAccountUnitPagePage queryAccountUnitPage){
        int total = tgAccountUnitDOMapper.getAccountUnitPageCount(queryAccountUnitPage);
        if(total>0){
            queryAccountUnitPage.setDatas(tgAccountUnitDOMapper.getAccountUnitPageResult(queryAccountUnitPage));
        }
        queryAccountUnitPage.setTotal(total);
        return queryAccountUnitPage;
    }
    /**
     * desc:获取商场详情列表:TG_ACCOUNT_UNIT.<br/>
     * descSql =  SELECT a.PB_ID mallId, b.mall_name mallName, b.MALL_TYPE mallType, b.MALL_STATUS mallStatus, b.CREATE_TIME createTime, c.PROVINCE_NAME provinceName, c.DISTRICT_NAME districtName, d.EMPL_NAME emplName, d.MOBILE_TEL mobileTel, d.MAIL mail FROM ta_contract a LEFT JOIN ta_mall b ON b.id = a.pb_id LEFT JOIN tg_district c ON b.DISTRICT_ID = c.ID LEFT JOIN ta_empl d ON b.id = d.PLATFORM_ID WHERE a.ACCOUNT_UNIT_ID = #{accountId,jdbcType=BIGINT} AND a.CONTRACT_STATUS = 'NORMAL' AND a.VALID_STATUS = 1 AND d.IS_ADMIN = 1
     * @param queryMallDetailPage queryMallDetailPage
     * @return QueryMallDetailPagePage
     */
    public QueryMallDetailPagePage getMallDetailPage(QueryMallDetailPagePage queryMallDetailPage){
        int total = tgAccountUnitDOMapper.getMallDetailPageCount(queryMallDetailPage);
        if(total>0){
            queryMallDetailPage.setDatas(tgAccountUnitDOMapper.getMallDetailPageResult(queryMallDetailPage));
        }
        queryMallDetailPage.setTotal(total);
        return queryMallDetailPage;
    }
    /**
     * desc:根据客户代码获取结算单位信息.<br/>
     * descSql =  SELECT * FROM TG_ACCOUNT_UNIT WHERE CLIENT_CODE = #{clientCode,jdbcType=VARCHAR}
     * @param clientCode clientCode
     * @return TgAccountUnitDO
     */
    public TgAccountUnitDO getAccountUnitByClientCode(String clientCode){
        return tgAccountUnitDOMapper.getAccountUnitByClientCode(clientCode);
    }
}
