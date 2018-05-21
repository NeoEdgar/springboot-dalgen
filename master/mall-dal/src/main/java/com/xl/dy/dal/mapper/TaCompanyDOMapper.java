package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaCompanyDO;
import java.util.Map;
import com.xl.dy.dal.paging.QueryCompanyListPage;
import java.util.List;
import java.lang.String;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_COMPANY.
 * TA_COMPANY
 */
public interface TaCompanyDOMapper{

    /**
     * desc:插入表:TA_COMPANY.<br/>
     * descSql =  INSERT INTO TA_COMPANY( ID ,REMARK ,MONGO_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,COMPANY_NAME ,VALID_STATUS ,COMPANY_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{mongoId,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{companyName,jdbcType=VARCHAR} , #{validStatus,jdbcType=INTEGER} , #{companyStatus,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaCompanyDO entity);
    /**
     * desc:更新表:TA_COMPANY.<br/>
     * descSql =  UPDATE TA_COMPANY SET REMARK = #{remark,jdbcType=VARCHAR} ,MONGO_ID = #{mongoId,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,COMPANY_NAME = #{companyName,jdbcType=VARCHAR} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,COMPANY_STATUS = #{companyStatus,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaCompanyDO entity);
    /**
     * desc:根据主键删除数据:TA_COMPANY.<br/>
     * descSql =  DELETE FROM TA_COMPANY WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_COMPANY.<br/>
     * descSql =  SELECT * FROM TA_COMPANY WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaCompanyDO
     */
    TaCompanyDO getByPrimary(Long id);
    /**
     * desc:获取专业公司信息.<br/>
     * descSql =  SELECT a.ID AS id ,a.CREATE_EMPL AS createEmpl ,a.CREATE_TIME AS createTime ,a.COMPANY_NAME AS companyName ,a.COMPANY_STATUS AS companyStatus ,a.REMARK AS remark ,b.ID AS emplId ,b.MAIL AS mail ,b.IS_ADMIN AS isAdmin ,b.PAPER_NO AS paperNo ,b.EMPL_NAME AS emplName ,b.USER_NAME AS userName ,b.MOBILE_TEL AS mobileTel ,b.EMPL_STATUS AS emplStatus ,b.PLATFORM_ID AS platformId ,b.PLATFORM_TYPE AS platformType, c.EMPL_NAME createEmplName, (SELECT GROUP_CONCAT(NAME) FROM tg_mg_category WHERE id in(SELECT MG_CATEGORY_ID FROM ta_company_mc_category where COMPANY_ID = a.ID)) mainCat FROM TA_COMPANY a LEFT JOIN TA_EMPL b ON a.ID = b.PLATFORM_ID LEFT JOIN TA_EMPL c ON a.CREATE_EMPL = c.ID WHERE a.ID = #{id,jdbcType=BIGINT} and b.PLATFORM_TYPE = 'COMPANYPLATFORM' and b.IS_ADMIN = 1 and b.EMPL_STATUS = 'NORMAL'
     * @param id id
     * @return Map
     */
    Map getCompanyDetail(Long id);
    /**
     * desc:获取专业公司分页列表.<br/>
     * descSql =  SELECT a.ID AS id ,a.CREATE_EMPL AS createEmpl ,a.CREATE_TIME AS createTime ,a.COMPANY_NAME AS companyName ,a.COMPANY_STATUS AS companyStatus ,a.REMARK AS remark ,b.ID AS emplId ,b.MAIL AS mail ,b.IS_ADMIN AS isAdmin ,b.PAPER_NO AS paperNo ,b.EMPL_NAME AS emplName ,b.USER_NAME AS userName ,b.MOBILE_TEL AS mobileTel ,b.EMPL_STATUS AS emplStatus ,b.PLATFORM_ID AS platformId ,b.PLATFORM_TYPE AS platformType, (SELECT GROUP_CONCAT(NAME) FROM tg_mg_category WHERE id in(SELECT MG_CATEGORY_ID FROM ta_company_mc_category where COMPANY_ID = a.ID)) mainCat FROM TA_COMPANY a LEFT JOIN TA_EMPL b ON a.ID = b.PLATFORM_ID WHERE b.PLATFORM_TYPE = 'COMPANYPLATFORM' and b.IS_ADMIN = 1 and b.EMPL_STATUS = 'NORMAL' AND a.COMPANY_NAME LIKE CONCAT('%',(#{companyName,jdbcType=VARCHAR}),'%') AND a.COMPANY_STATUS = #{companyStatus,jdbcType=VARCHAR} ORDER BY a.CREATE_TIME DESC
     * @param queryCompanyList queryCompanyList
     * @return int
     */
    int findCompanyPageCount(QueryCompanyListPage queryCompanyList);
    /**
     * desc:获取专业公司分页列表.<br/>
     * descSql =  SELECT a.ID AS id ,a.CREATE_EMPL AS createEmpl ,a.CREATE_TIME AS createTime ,a.COMPANY_NAME AS companyName ,a.COMPANY_STATUS AS companyStatus ,a.REMARK AS remark ,b.ID AS emplId ,b.MAIL AS mail ,b.IS_ADMIN AS isAdmin ,b.PAPER_NO AS paperNo ,b.EMPL_NAME AS emplName ,b.USER_NAME AS userName ,b.MOBILE_TEL AS mobileTel ,b.EMPL_STATUS AS emplStatus ,b.PLATFORM_ID AS platformId ,b.PLATFORM_TYPE AS platformType, (SELECT GROUP_CONCAT(NAME) FROM tg_mg_category WHERE id in(SELECT MG_CATEGORY_ID FROM ta_company_mc_category where COMPANY_ID = a.ID)) mainCat FROM TA_COMPANY a LEFT JOIN TA_EMPL b ON a.ID = b.PLATFORM_ID WHERE b.PLATFORM_TYPE = 'COMPANYPLATFORM' and b.IS_ADMIN = 1 and b.EMPL_STATUS = 'NORMAL' AND a.COMPANY_NAME LIKE CONCAT('%',(#{companyName,jdbcType=VARCHAR}),'%') AND a.COMPANY_STATUS = #{companyStatus,jdbcType=VARCHAR} ORDER BY a.CREATE_TIME DESC
     * @param queryCompanyList queryCompanyList
     * @return List<Map>
     */
    List<Map> findCompanyPageResult(QueryCompanyListPage queryCompanyList);
    /**
     * desc:选择性更新表:TA_COMPANY.<br/>
     * descSql =  UPDATE TA_COMPANY REMARK = #{remark,jdbcType=VARCHAR}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, COMPANY_NAME = #{companyName,jdbcType=VARCHAR}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, COMPANY_STATUS = #{companyStatus,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long updateByPrimarySelective(TaCompanyDO entity);
    /**
     * desc:根据主键获取数据:TA_COMPANY.<br/>
     * descSql =  SELECT a.COMPANY_NAME,a.COMPANY_STATUS,b.EMPL_NAME,b.MOBILE_TEL,b.MAIL ,a.CREATE_TIME FROM TA_EMPL b LEFT JOIN TA_COMPANY a on a.ID=b.PLATFORM_ID AND b.PLATFORM_TYPE='COMPANYPLATFORM' WHERE a.ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Map
     */
    Map getCompanyInfoByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_COMPANY.<br/>
     * descSql =  SELECT A.`NAME` from TA_COMPANY_MC_CATEGORY b LEFT JOIN TG_MG_CATEGORY a on b.MG_CATEGORY_ID = a.ID WHERE b.COMPANY_ID=#{companyId,jdbcType=BIGINT}
     * @param companyId companyId
     * @return List<String>
     */
    List<String> getCompanyCategory(Long companyId);
    /**
     * desc:根据主键获取数据:TA_COMPANY.<br/>
     * descSql =  SELECT * FROM TA_COMPANY WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaCompanyDO
     */
    TaCompanyDO getByPrimarySelective(Long id);
    /**
     * desc:根据主键获取数据:TA_COMPANY.<br/>
     * descSql =  SELECT COMPANY_NAME companyName FROM TA_COMPANY WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return String
     */
    String getNameByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_COMPANY.<br/>
     * descSql =  SELECT ID id, COMPANY_NAME companyName FROM TA_COMPANY WHERE VALID_STATUS = 1
     * @return List<Map>
     */
    List<Map> getAllCompanyInfo();
}
