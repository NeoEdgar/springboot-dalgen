package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaRoleResDO;
import java.util.Date;
import com.xl.dy.dal.paging.QuerySystemResourceListPage;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_ROLE_RES.
 * TA_ROLE_RES
 */
public interface TaRoleResDOMapper{

    /**
     * desc:插入表:TA_ROLE_RES.<br/>
     * descSql =  INSERT INTO TA_ROLE_RES( ID ,REMARK ,RES_NAME ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,RES_CONTEXT ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} ,#{remark,jdbcType=VARCHAR} ,#{resName,jdbcType=VARCHAR} ,#{alterEmpl,jdbcType=BIGINT} ,#{alterTime,jdbcType=TIMESTAMP} ,#{timestamp,jdbcType=BIGINT} ,#{createEmpl,jdbcType=BIGINT} ,#{createTime,jdbcType=TIMESTAMP} ,#{resContext,jdbcType=VARCHAR} ,#{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaRoleResDO entity);
    /**
     * desc:更新表:TA_ROLE_RES.<br/>
     * descSql =  UPDATE TA_ROLE_RES SET RES_NAME = #{resName,jdbcType=VARCHAR}, RES_CONTEXT = #{resContext,jdbcType=VARCHAR}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param alterTime alterTime
     * @param id id
     * @param alterEmpl alterEmpl
     * @param resName resName
     * @param resContext resContext
     * @return Long
     */
    Long updateSelective(@Param("alterTime")Date alterTime,@Param("id")Long id,@Param("alterEmpl")Long alterEmpl,@Param("resName")String resName,@Param("resContext")String resContext);
    /**
     * desc:根据主键删除数据:TA_ROLE_RES.<br/>
     * descSql =  DELETE FROM TA_ROLE_RES WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_ROLE_RES.<br/>
     * descSql =  SELECT * FROM TA_ROLE_RES WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaRoleResDO
     */
    TaRoleResDO getByPrimary(Long id);
    /**
     * desc:获取系统资源列表.<br/>
     * descSql =  SELECT ID ,REMARK ,RES_NAME ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,RES_CONTEXT ,VALID_STATUS FROM TA_ROLE_RES WHERE VALID_STATUS = 1 AND RES_NAME = #{res_name,jdbcType=VARCHAR} ORDER BY ALTER_TIME desc
     * @param querySystemResourceList querySystemResourceList
     * @return int
     */
    int listSystemResourceCount(QuerySystemResourceListPage querySystemResourceList);
    /**
     * desc:获取系统资源列表.<br/>
     * descSql =  SELECT ID ,REMARK ,RES_NAME ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,RES_CONTEXT ,VALID_STATUS FROM TA_ROLE_RES WHERE VALID_STATUS = 1 AND RES_NAME = #{res_name,jdbcType=VARCHAR} ORDER BY ALTER_TIME desc
     * @param querySystemResourceList querySystemResourceList
     * @return List<TaRoleResDO>
     */
    List<TaRoleResDO> listSystemResourceResult(QuerySystemResourceListPage querySystemResourceList);
    /**
     * desc:更新有效性状态.<br/>
     * descSql =  UPDATE TA_ROLE_RES SET VALID_STATUS = 0 WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long updateValidStatus(Long id);
}
