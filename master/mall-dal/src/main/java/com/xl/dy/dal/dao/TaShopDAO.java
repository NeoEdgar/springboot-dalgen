package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaShopDO;
import java.util.List;
import com.xl.dy.dal.paging.QueryShopListByMallPage;
import com.xl.dy.dal.paging.QueryShopListPage;
import java.util.Map;
import java.util.Date;
import com.xl.dy.dal.paging.QueryShopForMicroPagePage;
import com.xl.dy.dal.mapper.TaShopDOMapper;

/**
* The Table TA_SHOP.
* TA_SHOP
*/
@Repository
public class TaShopDAO{

    @Autowired
    private TaShopDOMapper taShopDOMapper;

    /**
     * desc:插入表:TA_SHOP.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_SHOP( ID ,POINT ,SALES ,CITY_ID ,ERP_SUP ,MALL_ID ,REMARK ,ERP_TYPE ,ERP_ACC_ID ,ERP_STORE ,LATITUDE ,MALL_NAME ,SHOP_NAME ,SHOP_TYPE ,ALTER_EMPL ,ALTER_TIME ,COMPANY_ID ,LONGITUDE ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,DISTRICT_ID ,FREEZE_TIME ,PROVINCE_ID ,SHOP_STATUS ,COMPANY_NAME ,ERP_SALE_DEPT ,SHOP_ADDRESS ,SHOP_LOGO_URL ,VALID_STATUS ,ENTITY_MALL_ID ,FREEZE_EMPL_ID ,SUBDISTICT_ID ,CLOSESTORE_TIME ,ENTITY_MALL_NAME ,FREEZE_EMPL_NAME ,MG_CATEGORY_TEXT ,ERP_PURCHASE_DEPT ,CLOSESTORE_EMPL_ID ,CLOSESTORE_EMPL_NAME )VALUES( #{id,jdbcType=BIGINT} , #{point,jdbcType=DECIMAL} , #{sales,jdbcType=BIGINT} , #{cityId,jdbcType=BIGINT} , #{erpSup,jdbcType=VARCHAR} , #{mallId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{erpType,jdbcType=VARCHAR} , #{erpAccId,jdbcType=BIGINT} , #{erpStore,jdbcType=VARCHAR} , #{latitude,jdbcType=DECIMAL} , #{mallName,jdbcType=VARCHAR} , #{shopName,jdbcType=VARCHAR} , #{shopType,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{companyId,jdbcType=BIGINT} , #{longitude,jdbcType=DECIMAL} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{districtId,jdbcType=BIGINT} , #{freezeTime,jdbcType=TIMESTAMP} , #{provinceId,jdbcType=BIGINT} , #{shopStatus,jdbcType=VARCHAR} , #{companyName,jdbcType=VARCHAR} , #{erpSaleDept,jdbcType=VARCHAR} , #{shopAddress,jdbcType=VARCHAR} , #{shopLogoUrl,jdbcType=VARCHAR} , #{validStatus,jdbcType=INTEGER} , #{entityMallId,jdbcType=BIGINT} , #{freezeEmplId,jdbcType=BIGINT} , #{subdistictId,jdbcType=BIGINT} , #{closestoreTime,jdbcType=TIMESTAMP} , #{entityMallName,jdbcType=VARCHAR} , #{freezeEmplName,jdbcType=VARCHAR} , #{mgCategoryText,jdbcType=VARCHAR} , #{erpPurchaseDept,jdbcType=VARCHAR} , #{closestoreEmplId,jdbcType=BIGINT} , #{closestoreEmplName,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaShopDO entity){
        return taShopDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_SHOP.<br/>
     * descSql =  UPDATE TA_SHOP SET POINT = #{point,jdbcType=DECIMAL} ,SALES = #{sales,jdbcType=BIGINT} ,CITY_ID = #{cityId,jdbcType=BIGINT} ,ERP_SUP = #{erpSup,jdbcType=VARCHAR} ,MALL_ID = #{mallId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,ERP_TYPE = #{erpType,jdbcType=VARCHAR} ,ERP_ACC_ID = #{erpAccId,jdbcType=BIGINT} ,ERP_STORE = #{erpStore,jdbcType=VARCHAR} ,LATITUDE = #{latitude,jdbcType=DECIMAL} ,MALL_NAME = #{mallName,jdbcType=VARCHAR} ,SHOP_NAME = #{shopName,jdbcType=VARCHAR} ,SHOP_TYPE = #{shopType,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,COMPANY_ID = #{companyId,jdbcType=BIGINT} ,LONGITUDE = #{longitude,jdbcType=DECIMAL} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,DISTRICT_ID = #{districtId,jdbcType=BIGINT} ,FREEZE_TIME = #{freezeTime,jdbcType=TIMESTAMP} ,PROVINCE_ID = #{provinceId,jdbcType=BIGINT} ,SHOP_STATUS = #{shopStatus,jdbcType=VARCHAR} ,COMPANY_NAME = #{companyName,jdbcType=VARCHAR} ,ERP_SALE_DEPT = #{erpSaleDept,jdbcType=VARCHAR} ,SHOP_ADDRESS = #{shopAddress,jdbcType=VARCHAR} ,SHOP_LOGO_URL = #{shopLogoUrl,jdbcType=VARCHAR} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,ENTITY_MALL_ID = #{entityMallId,jdbcType=BIGINT} ,FREEZE_EMPL_ID = #{freezeEmplId,jdbcType=BIGINT} ,SUBDISTICT_ID = #{subdistictId,jdbcType=BIGINT} ,CLOSESTORE_TIME = #{closestoreTime,jdbcType=TIMESTAMP} ,ENTITY_MALL_NAME = #{entityMallName,jdbcType=VARCHAR} ,FREEZE_EMPL_NAME = #{freezeEmplName,jdbcType=VARCHAR} ,MG_CATEGORY_TEXT = #{mgCategoryText,jdbcType=VARCHAR} ,ERP_PURCHASE_DEPT = #{erpPurchaseDept,jdbcType=VARCHAR} ,CLOSESTORE_EMPL_ID = #{closestoreEmplId,jdbcType=BIGINT} ,CLOSESTORE_EMPL_NAME = #{closestoreEmplName,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaShopDO entity){
        return taShopDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_SHOP.<br/>
     * descSql =  DELETE FROM TA_SHOP WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taShopDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP.<br/>
     * descSql =  SELECT * FROM TA_SHOP WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopDO
     */
    public TaShopDO getByPrimary(Long id){
        return taShopDOMapper.getByPrimary(id);
    }
    /**
     * desc:查询该账号所关联的店铺:TA_SHOP.<br/>
     * descSql =  SELECT a.SHOP_NAME ,a.ID FROM ta_shop a LEFT JOIN TA_EMPL_SHOP b ON a.ID = b.SHOP_ID LEFT JOIN TA_EMPL c ON c.ID = b.EMPL_ID WHERE c.ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return List<TaShopDO>
     */
    public List<TaShopDO> showEmplShop(Long id){
        return taShopDOMapper.showEmplShop(id);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP.<br/>
     * descSql =  SELECT ID,SHOP_NAME FROM TA_SHOP WHERE MALL_ID= #{mallId,jdbcType=BIGINT}
     * @param mallId mallId
     * @return List<TaShopDO>
     */
    public List<TaShopDO> showAllShops(Long mallId){
        return taShopDOMapper.showAllShops(mallId);
    }
    /**
     * desc:查询店铺列表.<br/>
     * descSql =  SELECT f.ID,f.SHOP_NAME,f.COMPANY_NAME,f.SHOP_TYPE ,f.SHOP_STATUS,f.CREATE_TIME,g.CATEGORY_NAME from (SELECT a.ID,a.SHOP_NAME,b.COMPANY_NAME,a.CREATE_TIME,a.SHOP_TYPE,a.SHOP_STATUS FROM ta_shop a LEFT JOIN ta_company b ON a.COMPANY_ID=b.id) f LEFT JOIN (SELECT D.ID, GROUP_CONCAT(e.name SEPARATOR ',') CATEGORY_NAME FROM TA_SHOP_MC_CATEGORY c LEFT JOIN ta_shop d ON c.SHOP_ID=d.ID LEFT JOIN TG_MG_CATEGORY e ON c.MG_CATEGORY_ID = e.id GROUP BY d.id) g ON f.ID = g.ID f.SHOP_NAME like #{searchStr,jdbcType=VARCHAR} ORDER BY f.CREATE_TIME desc
     * @param queryShopListByMall queryShopListByMall
     * @return QueryShopListByMallPage
     */
    public QueryShopListByMallPage getShopListByMall(QueryShopListByMallPage queryShopListByMall){
        int total = taShopDOMapper.getShopListByMallCount(queryShopListByMall);
        if(total>0){
            queryShopListByMall.setDatas(taShopDOMapper.getShopListByMallResult(queryShopListByMall));
        }
        queryShopListByMall.setTotal(total);
        return queryShopListByMall;
    }
    /**
     * desc:根据主键获取数据:TA_SHOP.<br/>
     * descSql =  SELECT c.name FROM ta_shop a LEFT JOIN TA_SHOP_MC_CATEGORY b ON a.ID = b.SHOP_ID LEFT JOIN tg_mg_category c ON b.MG_CATEGORY_ID = c.ID WHERE a.ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return List<String>
     */
    public List<String> getCategoryList(Long id){
        return taShopDOMapper.getCategoryList(id);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP.<br/>
     * descSql =  SELECT a.id FROM ta_empl a LEFT JOIN ta_shop b ON a.PLATFORM_TYPE='SHOPPLATFORM' AND a.PLATFORM_ID = b.ID AND IS_ADMIN=1 WHERE b.ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long getEmplAdminById(Long id){
        return taShopDOMapper.getEmplAdminById(id);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP.<br/>
     * descSql =  SELECT a.ERP_SALE_DEPT ,a.ID FROM ta_shop a LEFT JOIN `ta_empl` b on a.`ID` = b.`PLATFORM_ID` and b.`PLATFORM_TYPE` ='SHOPPLATFORM' WHERE B.`ID` =#{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopDO
     */
    public TaShopDO findErpSaleDept(Long id){
        return taShopDOMapper.findErpSaleDept(id);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP.<br/>
     * descSql =  SELECT LONGITUDE,LATITUDE FROM TA_SHOP WHERE ID =#{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopDO
     */
    public TaShopDO getShopAreaById(Long id){
        return taShopDOMapper.getShopAreaById(id);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP.<br/>
     * descSql =  SELECT ID FROM TA_SHOP WHERE SHOP_NAME =#{shopName,jdbcType=VARCHAR}
     * @param shopName shopName
     * @return TaShopDO
     */
    public TaShopDO findShopByShopName(String shopName){
        return taShopDOMapper.findShopByShopName(shopName);
    }
    /**
     * desc:修改有效性.<br/>
     * descSql =  UPDATE TA_SHOP SET VALID_STATUS = 0 WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long updateValidStatus(Long id){
        return taShopDOMapper.updateValidStatus(id);
    }
    /**
     * desc:根据专业公司ID获取所有旗下店铺.<br/>
     * descSql =  SELECT * FROM TA_SHOP WHERE COMPANY_ID = #{companyId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param companyId companyId
     * @return List<TaShopDO>
     */
    public List<TaShopDO> getShopByCompanyId(Long companyId){
        return taShopDOMapper.getShopByCompanyId(companyId);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP.<br/>
     * descSql =  SELECT * FROM TA_SHOP WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaShopDO
     */
    public TaShopDO getByPrimarySelective(Long id){
        return taShopDOMapper.getByPrimarySelective(id);
    }
    /**
     * desc:查询店铺列表.<br/>
     * descSql =  SELECT * FROM TA_SHOP WHERE VALID_STATUS = 1 AND SHOP_NAME like #{shopName,jdbcType=VARCHAR} 
     * @param queryShopList queryShopList
     * @return QueryShopListPage
     */
    public QueryShopListPage getShopList(QueryShopListPage queryShopList){
        int total = taShopDOMapper.getShopListCount(queryShopList);
        if(total>0){
            queryShopList.setDatas(taShopDOMapper.getShopListResult(queryShopList));
        }
        queryShopList.setTotal(total);
        return queryShopList;
    }
    /**
     * desc:选择性更新表:TA_EMPL.<br/>
     * descSql =  UPDATE TA_SHOP CITY_ID = #{cityId,jdbcType=BIGINT}, MALL_ID = #{mallId,jdbcType=BIGINT}, REMARK = #{remark,jdbcType=VARCHAR}, LATITUDE = #{latitude,jdbcType=DECIMAL}, SHOP_NAME = #{shopName,jdbcType=VARCHAR}, SHOP_TYPE = #{shopType,jdbcType=VARCHAR}, ERP_SUP = #{erpSup,jdbcType=VARCHAR}, ERP_TYPE = #{erpType,jdbcType=VARCHAR}, ERP_ACC_ID = #{erpAccId,jdbcType=BIGINT}, ERP_STORE = #{erpStore,jdbcType=VARCHAR}, ERP_PURCHASE_DEPT = #{erpPurchaseDept,jdbcType=VARCHAR}, ERP_SALE_DEPT = #{erpSaleDept,jdbcType=VARCHAR}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, COMPANY_ID = #{companyId,jdbcType=BIGINT}, LONGITUDE = #{longitude,jdbcType=DECIMAL}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, LONGITUDE = #{longitude,jdbcType=DECIMAL}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, DISTRICT_ID = #{districtId,jdbcType=BIGINT}, PROVINCE_ID = #{provinceId,jdbcType=BIGINT}, SHOP_STATUS = #{shopStatus,jdbcType=VARCHAR}, SHOP_ADDRESS = #{shopAddress,jdbcType=VARCHAR}, SHOP_LOGO_URL = #{shopLogoUrl,jdbcType=VARCHAR}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, SUBDISTICT_ID = #{subdistictId,jdbcType=BIGINT}, CLOSESTORE_TIME = #{closestoreTime,jdbcType=TIMESTAMP}, MG_CATEGORY_TEXT = #{mgCategoryText,jdbcType=VARCHAR}, CLOSESTORE_EMPL_ID = #{closestoreEmplId,jdbcType=BIGINT}, CLOSESTORE_EMPL_NAME = #{closestoreEmplName,jdbcType=VARCHAR}, ENTITY_MALL_ID = #{entityMallId,jdbcType=BIGINT}, ENTITY_MALL_NAME = #{entityMallName,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long updateByPrimarySelective(TaShopDO entity){
        return taShopDOMapper.updateByPrimarySelective(entity);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP.<br/>
     * descSql =  SELECT a.id,a.SHOP_NAME,a.SHOP_LOGO_URL,a.SHOP_TYPE,a.ENTITY_MALL_NAME ,c.MALL_NAME ,d.COMPANY_NAME,a.SHOP_ADDRESS,a.SHOP_STATUS,a.CREATE_TIME,b.EMPL_NAME ,b.MOBILE_TEL,b.MAIL,b.PAPER_NO FROM ta_shop a LEFT JOIN ta_empl b ON b.PLATFORM_TYPE='SHOPPLATFORM' AND a.ID=b.PLATFORM_ID LEFT JOIN ta_mall c ON a.MALL_ID=c.ID LEFT JOIN ta_company d ON a.COMPANY_ID = d.ID LEFT JOIN ta_empl e ON a.CREATE_EMPL=e.ID WHERE a.ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Map
     */
    public Map getShopInfoById(Long id){
        return taShopDOMapper.getShopInfoById(id);
    }
    /**
     * desc:根据商场店铺打烊:TA_SHOP.<br/>
     * descSql =  UPDATE TA_SHOP SET SHOP_STATUS = #{shopStatus,jdbcType=VARCHAR}, CLOSESTORE_EMPL_ID = #{emplId,jdbcType=BIGINT}, CLOSESTORE_EMPL_NAME= #{closeEmplName,jdbcType=VARCHAR}, CLOSESTORE_TIME= #{closeTime,jdbcType=TIMESTAMP}, ALTER_EMPL= #{alterEmplId,jdbcType=BIGINT}, ALTER_TIME= #{alterTime,jdbcType=TIMESTAMP}, TIMESTAMP= #{timeStamp,jdbcType=BIGINT} WHERE MALL_ID = #{mallId,jdbcType=BIGINT}
     * @param alterTime alterTime
     * @param closeTime closeTime
     * @param emplId emplId
     * @param mallId mallId
     * @param timeStamp timeStamp
     * @param alterEmplId alterEmplId
     * @param shopStatus shopStatus
     * @param closeEmplName closeEmplName
     * @return Long
     */
    public Long changeShopStatusByMall(Date alterTime,Date closeTime,Long emplId,Long mallId,Long timeStamp,Long alterEmplId,String shopStatus,String closeEmplName){
        return taShopDOMapper.changeShopStatusByMall(alterTime, closeTime, emplId, mallId, timeStamp, alterEmplId, shopStatus, closeEmplName);
    }
    /**
     * desc:微页面获取店铺信息:TA_SHOP.<br/>
     * descSql =  SELECT id shopId, SHOP_LOGO_URL shopLogoUrl, SHOP_NAME shopName, COMPANY_NAME companyName, MALL_NAME mallName FROM ta_shop WHERE (id = #{shopId,jdbcType=BIGINT} OR SHOP_NAME LIKE #{searchStr,jdbcType=VARCHAR})
     * @param queryShopForMicroPage queryShopForMicroPage
     * @return QueryShopForMicroPagePage
     */
    public QueryShopForMicroPagePage getShopForMicroPage(QueryShopForMicroPagePage queryShopForMicroPage){
        int total = taShopDOMapper.getShopForMicroPageCount(queryShopForMicroPage);
        if(total>0){
            queryShopForMicroPage.setDatas(taShopDOMapper.getShopForMicroPageResult(queryShopForMicroPage));
        }
        queryShopForMicroPage.setTotal(total);
        return queryShopForMicroPage;
    }
    /**
     * desc:根据商场获得店铺信息:TA_SHOP.<br/>
     * descSql =  SELECT ID shopId, SHOP_NAME shopName FROM ta_shop WHERE MALL_ID = #{mallId,jdbcType=BIGINT}
     * @param mallId mallId
     * @return List<Map>
     */
    public List<Map> findShopmessageByMall(Long mallId){
        return taShopDOMapper.findShopmessageByMall(mallId);
    }
}
