package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaCompanyMcCategoryDO;
import java.util.Map;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_COMPANY_MC_CATEGORY.
 * TA_COMPANY_MC_CATEGORY
 */
public interface TaCompanyMcCategoryDOMapper{

    /**
     * desc:插入表:TA_COMPANY_MC_CATEGORY.<br/>
     * descSql =  INSERT INTO TA_COMPANY_MC_CATEGORY( ID ,REMARK ,ALTER_EMPL ,ALTER_TIME ,COMPANY_ID ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,MG_CATEGORY_ID )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{companyId,jdbcType=BIGINT} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{mgCategoryId,jdbcType=BIGINT} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaCompanyMcCategoryDO entity);
    /**
     * desc:更新表:TA_COMPANY_MC_CATEGORY.<br/>
     * descSql =  UPDATE TA_COMPANY_MC_CATEGORY SET REMARK = #{remark,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,COMPANY_ID = #{companyId,jdbcType=BIGINT} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,MG_CATEGORY_ID = #{mgCategoryId,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaCompanyMcCategoryDO entity);
    /**
     * desc:根据主键删除数据:TA_COMPANY_MC_CATEGORY.<br/>
     * descSql =  DELETE FROM TA_COMPANY_MC_CATEGORY WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键删除数据:TA_COMPANY_MC_CATEGORY.<br/>
     * descSql =  DELETE FROM TA_COMPANY_MC_CATEGORY WHERE COMPANY_ID = #{companyId,jdbcType=BIGINT}
     * @param companyId companyId
     * @return Long
     */
    Long deleteByCompanyId(Long companyId);
    /**
     * desc:根据主键获取数据:TA_COMPANY_MC_CATEGORY.<br/>
     * descSql =  SELECT * FROM TA_COMPANY_MC_CATEGORY WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaCompanyMcCategoryDO
     */
    TaCompanyMcCategoryDO getByPrimary(Long id);
    /**
     * desc:查找专业公司主营类目.<br/>
     * descSql =  SELECT ID categoryId,NAME name FROM tg_mg_category WHERE id IN (SELECT MG_CATEGORY_ID FROM ta_company_mc_category where COMPANY_ID = #{companyId,jdbcType=BIGINT})
     * @param companyId companyId
     * @return List<Map>
     */
    List<Map> findCompanyMcCategoryList(Long companyId);
}
