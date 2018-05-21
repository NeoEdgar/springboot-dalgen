package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaMallDO;
import com.xl.dy.dal.paging.QueryMallListPage;
import java.util.Map;
import java.util.Date;
import java.util.List;
import com.xl.dy.dal.mapper.TaMallDOMapper;

/**
* The Table TA_MALL.
* TA_MALL
*/
@Repository
public class TaMallDAO{

    @Autowired
    private TaMallDOMapper taMallDOMapper;

    /**
     * desc:插入表:TA_MALL.<br/>
     * descSql =  INSERT INTO TA_MALL( ID ,CITY_ID ,REMARK ,MONGO_ID ,LATITUDE ,MALL_NAME ,MALL_TYPE ,ALTER_EMPL ,ALTER_TIME ,COMPANY_ID ,LONGITUDE ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,DISTRICT_ID ,FREEZE_TIME ,MALL_STATUS ,PROVINCE_ID ,MALL_ADDRESS ,SALE_UNIT_AFF ,VALID_STATUS ,FREEZE_EMPL_ID ,SUBDISTICT_ID ,FREEZE_EMPL_NAME ,MALL_CONTRACT_ID ,IS_TARGET_COMPANY )VALUES( #{id,jdbcType=BIGINT} , #{cityId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{mongoId,jdbcType=VARCHAR} , #{latitude,jdbcType=DECIMAL} , #{mallName,jdbcType=VARCHAR} , #{mallType,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{companyId,jdbcType=BIGINT} , #{longitude,jdbcType=DECIMAL} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{districtId,jdbcType=BIGINT} , #{freezeTime,jdbcType=TIMESTAMP} , #{mallStatus,jdbcType=VARCHAR} , #{provinceId,jdbcType=BIGINT} , #{mallAddress,jdbcType=VARCHAR} , #{saleUnitAff,jdbcType=VARCHAR} , #{validStatus,jdbcType=INTEGER} , #{freezeEmplId,jdbcType=BIGINT} , #{subdistictId,jdbcType=BIGINT} , #{freezeEmplName,jdbcType=VARCHAR} , #{mallContractId,jdbcType=BIGINT} , #{isTargetCompany,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaMallDO entity){
        return taMallDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_MALL.<br/>
     * descSql =  UPDATE TA_MALL SET CITY_ID = #{cityId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,MONGO_ID = #{mongoId,jdbcType=VARCHAR} ,LATITUDE = #{latitude,jdbcType=DECIMAL} ,MALL_NAME = #{mallName,jdbcType=VARCHAR} ,MALL_TYPE = #{mallType,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,COMPANY_ID = #{companyId,jdbcType=BIGINT} ,LONGITUDE = #{longitude,jdbcType=DECIMAL} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,DISTRICT_ID = #{districtId,jdbcType=BIGINT} ,FREEZE_TIME = #{freezeTime,jdbcType=TIMESTAMP} ,MALL_STATUS = #{mallStatus,jdbcType=VARCHAR} ,PROVINCE_ID = #{provinceId,jdbcType=BIGINT} ,MALL_ADDRESS = #{mallAddress,jdbcType=VARCHAR} ,SALE_UNIT_AFF = #{saleUnitAff,jdbcType=VARCHAR} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,FREEZE_EMPL_ID = #{freezeEmplId,jdbcType=BIGINT} ,SUBDISTICT_ID = #{subdistictId,jdbcType=BIGINT} ,FREEZE_EMPL_NAME = #{freezeEmplName,jdbcType=VARCHAR} ,MALL_CONTRACT_ID = #{mallContractId,jdbcType=BIGINT} ,IS_TARGET_COMPANY = #{isTargetCompany,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaMallDO entity){
        return taMallDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_MALL.<br/>
     * descSql =  DELETE FROM TA_MALL WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taMallDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_MALL.<br/>
     * descSql =  SELECT * FROM TA_MALL WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaMallDO
     */
    public TaMallDO getByPrimary(Long id){
        return taMallDOMapper.getByPrimary(id);
    }
    /**
     * desc:获取商场分页列表.<br/>
     * descSql =  SELECT a.ID AS id ,a.CITY_ID AS cityId ,a.REMARK AS remark ,a.MALL_NAME AS mallName ,a.CREATE_EMPL AS createEmpl ,a.CREATE_TIME AS createTime ,a.DISTRICT_ID AS districtId ,a.MALL_STATUS AS mallStatus ,a.PROVINCE_ID AS provinceId ,a.MALL_ADDRESS AS mallAddress ,a.SUBDISTICT_ID AS subdistictId ,a.MALL_TYPE AS mallType ,b.ID AS emplId ,b.MAIL AS mail ,b.IS_ADMIN AS isAdmin ,b.PAPER_NO AS paperNo ,b.EMPL_NAME AS emplName ,b.USER_NAME AS userName ,b.MOBILE_TEL AS mobileTel ,b.EMPL_STATUS AS emplStatus ,b.PLATFORM_ID AS platformId ,b.PLATFORM_TYPE AS platformType ,c.CITY_NAME AS cityName ,d.DISTRICT_NAME AS districtName FROM TA_MALL a LEFT JOIN TA_EMPL b ON a.ID = b.PLATFORM_ID LEFT JOIN tg_city c ON a.CITY_ID = c.ID LEFT JOIN tg_district d ON a.DISTRICT_ID = d.ID WHERE b.PLATFORM_TYPE = 'MALLPLATFORM' and b.IS_ADMIN = 1 and b.EMPL_STATUS = 'NORMAL' AND a.MALL_NAME LIKE CONCAT('%',(#{mallName,jdbcType=VARCHAR}),'%') AND a.MALL_STATUS = #{mallStatus,jdbcType=VARCHAR} AND a.MALL_TYPE = #{mallType,jdbcType=VARCHAR} AND a.CITY_ID = #{cityId,jdbcType=BIGINT} ORDER BY a.CREATE_TIME DESC
     * @param queryMallList queryMallList
     * @return QueryMallListPage
     */
    public QueryMallListPage findMallPage(QueryMallListPage queryMallList){
        int total = taMallDOMapper.findMallPageCount(queryMallList);
        if(total>0){
            queryMallList.setDatas(taMallDOMapper.findMallPageResult(queryMallList));
        }
        queryMallList.setTotal(total);
        return queryMallList;
    }
    /**
     * desc:选择性更新表:TA_MALL.<br/>
     * descSql =  UPDATE TA_MALL CITY_ID = #{cityId,jdbcType=BIGINT}, REMARK = #{remark,jdbcType=VARCHAR}, MONGO_ID = #{mongoId,jdbcType=VARCHAR}, LATITUDE = #{latitude,jdbcType=DECIMAL}, MALL_NAME = #{mallName,jdbcType=VARCHAR}, MALL_TYPE = #{mallType,jdbcType=VARCHAR}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, COMPANY_ID = #{companyId,jdbcType=BIGINT}, LONGITUDE = #{longitude,jdbcType=DECIMAL}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, DISTRICT_ID = #{districtId,jdbcType=BIGINT}, MALL_STATUS = #{mallStatus,jdbcType=VARCHAR}, PROVINCE_ID = #{provinceId,jdbcType=BIGINT}, MALL_ADDRESS = #{mallAddress,jdbcType=VARCHAR}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, SALE_UNIT_AFF = #{saleUnitAff,jdbcType=VARCHAR}, SUBDISTICT_ID = #{subdistictId,jdbcType=BIGINT}, MALL_CONTRACT_ID = #{mallContractId,jdbcType=BIGINT}, IS_TARGET_COMPANY = #{isTargetCompany,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long updateByPrimarySelective(TaMallDO entity){
        return taMallDOMapper.updateByPrimarySelective(entity);
    }
    /**
     * desc:根据主键获取数据:TA_COMPANY.<br/>
     * descSql =  SELECT a.MALL_NAME,a.MALL_STATUS,a.MALL_ADDRESS ,a.CITY_ID,a.CREATE_TIME,a.CREATE_EMPL,b.EMPL_NAME,b.MOBILE_TEL,b.MAIL FROM ta_mall a LEFT JOIN ta_empl b ON a.ID=b.PLATFORM_ID AND b.PLATFORM_TYPE='MALLPLATFORM' WHERE a.ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Map
     */
    public Map getMallInfoByPrimary(Long id){
        return taMallDOMapper.getMallInfoByPrimary(id);
    }
    /**
     * desc:根据主键获取有效数据:TA_MALL.<br/>
     * descSql =  SELECT * FROM TA_MALL WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaMallDO
     */
    public TaMallDO getByPrimarySelective(Long id){
        return taMallDOMapper.getByPrimarySelective(id);
    }
    /**
     * desc:获取商场详情.<br/>
     * descSql =  SELECT m.ID mallId, m.MALL_NAME mallName, m.MALL_TYPE mallType, m.CITY_ID cityId, m.DISTRICT_ID districtId, m.MALL_ADDRESS mallAddress, m.CREATE_TIME createTime, m.ALTER_TIME alterTime, m.MALL_STATUS mallStatus, c.EMPL_NAME emplName, c.EMPL_STATUS emplStatus, c.USER_NAME userName, c.MOBILE_TEL mobileTel, c.PAPER_NO paperNo, c.MAIL mail, t.CITY_NAME cityName, t.DISTRICT_NAME districtName, d.EMPL_NAME createEmplName, e.EMPL_NAME alterEmplName FROM ta_mall m LEFT JOIN ta_empl c ON c.PLATFORM_ID = m.ID LEFT JOIN ta_empl d ON d.ID = m.CREATE_EMPL LEFT JOIN ta_empl e ON e.ID = m.ALTER_EMPL LEFT JOIN tg_district t ON t.ID = m.DISTRICT_ID WHERE m.ID = #{id,jdbcType=BIGINT} AND c.EMPL_STATUS = "NORMAL" AND c.IS_ADMIN = 1 AND c.PLATFORM_TYPE = "MALLPLATFORM"
     * @param id id
     * @return Map
     */
    public Map getMallDetail(Long id){
        return taMallDOMapper.getMallDetail(id);
    }
    /**
     * desc:根据主键获取结算单位:TA_MALL.<br/>
     * descSql =  SELECT b.ACCOUNT_UNIT_ID accountId FROM TA_MALL a LEFT JOIN TA_CONTRACT b ON a.MALL_CONTRACT_ID = b.ID WHERE a.ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Map
     */
    public Map getAccountIdByMallid(Long id){
        return taMallDOMapper.getAccountIdByMallid(id);
    }
    /**
     * desc:根据主键修改合同Id:TA_MALL.<br/>
     * descSql =  UPDATE TA_MALL SET MALL_CONTRACT_ID = #{ContractId,jdbcType=BIGINT}, ALTER_EMPL= #{alterEmplId,jdbcType=BIGINT}, ALTER_TIME= #{alterTime,jdbcType=TIMESTAMP}, TIMESTAMP= #{timeStamp,jdbcType=BIGINT} WHERE ID = #{mallId,jdbcType=BIGINT}
     * @param alterTime alterTime
     * @param mallId mallId
     * @param timeStamp timeStamp
     * @param ContractId ContractId
     * @param alterEmplId alterEmplId
     * @return Long
     */
    public Long updateContractId(Date alterTime,Long mallId,Long timeStamp,Long ContractId,Long alterEmplId){
        return taMallDOMapper.updateContractId(alterTime, mallId, timeStamp, ContractId, alterEmplId);
    }
    /**
     * desc:根据主键修改合同Id:TA_MALL.<br/>
     * descSql =  SELECT ID mallId, MALL_CONTRACT_ID normalContractId FROM TA_MALL
     * @return List<Map>
     */
    public List<Map> getAllMallIdAndNormalContractId(){
        return taMallDOMapper.getAllMallIdAndNormalContractId();
    }
    /**
     * desc:全部详情之商场:TA_MALL.<br/>
     * descSql =  SELECT a.id mallId, a.MALL_NAME mallName, a.MALL_TYPE mallType, a.MALL_ADDRESS mallAddress, a.CREATE_TIME createTime, a.ALTER_TIME alterTime, a.MALL_STATUS mallStatus, b.CITY_NAME cityName, b.DISTRICT_NAME districtName, c.NAME createName, d.NAME alterName FROM ta_mall a LEFT JOIN tg_district b ON a.DISTRICT_ID = b.id LEFT JOIN ta_empl_role_auth c ON a.CREATE_EMPL = c.EMPL_ID LEFT JOIN ta_empl_role_auth d ON a.ALTER_EMPL = d.EMPL_ID WHERE a.id = #{mallId,jdbcType=BIGINT} and a.VALID_STATUS = 1
     * @param mallId mallId
     * @return List<Map>
     */
    public List<Map> getAllDetailOfMall(Long mallId){
        return taMallDOMapper.getAllDetailOfMall(mallId);
    }
    /**
     * desc:根据专业公司获得商场信息:TA_MALL.<br/>
     * descSql =  SELECT a.ID mallId, a.MALL_NAME mallName FROM ta_mall a WHERE a.COMPANY_ID = #{companyId,jdbcType=BIGINT}
     * @param companyId companyId
     * @return List<Map>
     */
    public List<Map> findMallmessageByCompany(Long companyId){
        return taMallDOMapper.findMallmessageByCompany(companyId);
    }
}
