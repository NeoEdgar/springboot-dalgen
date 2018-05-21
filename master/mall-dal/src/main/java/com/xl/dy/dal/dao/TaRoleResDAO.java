package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaRoleResDO;
import java.util.Date;
import com.xl.dy.dal.paging.QuerySystemResourceListPage;
import com.xl.dy.dal.mapper.TaRoleResDOMapper;

/**
* The Table TA_ROLE_RES.
* TA_ROLE_RES
*/
@Repository
public class TaRoleResDAO{

    @Autowired
    private TaRoleResDOMapper taRoleResDOMapper;

    /**
     * desc:插入表:TA_ROLE_RES.<br/>
     * descSql =  INSERT INTO TA_ROLE_RES( ID ,REMARK ,RES_NAME ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,RES_CONTEXT ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} ,#{remark,jdbcType=VARCHAR} ,#{resName,jdbcType=VARCHAR} ,#{alterEmpl,jdbcType=BIGINT} ,#{alterTime,jdbcType=TIMESTAMP} ,#{timestamp,jdbcType=BIGINT} ,#{createEmpl,jdbcType=BIGINT} ,#{createTime,jdbcType=TIMESTAMP} ,#{resContext,jdbcType=VARCHAR} ,#{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaRoleResDO entity){
        return taRoleResDOMapper.insert(entity);
    }
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
    public Long updateSelective(Date alterTime,Long id,Long alterEmpl,String resName,String resContext){
        return taRoleResDOMapper.updateSelective(alterTime, id, alterEmpl, resName, resContext);
    }
    /**
     * desc:根据主键删除数据:TA_ROLE_RES.<br/>
     * descSql =  DELETE FROM TA_ROLE_RES WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taRoleResDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_ROLE_RES.<br/>
     * descSql =  SELECT * FROM TA_ROLE_RES WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaRoleResDO
     */
    public TaRoleResDO getByPrimary(Long id){
        return taRoleResDOMapper.getByPrimary(id);
    }
    /**
     * desc:获取系统资源列表.<br/>
     * descSql =  SELECT ID ,REMARK ,RES_NAME ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,RES_CONTEXT ,VALID_STATUS FROM TA_ROLE_RES WHERE VALID_STATUS = 1 AND RES_NAME = #{res_name,jdbcType=VARCHAR} ORDER BY ALTER_TIME desc
     * @param querySystemResourceList querySystemResourceList
     * @return QuerySystemResourceListPage
     */
    public QuerySystemResourceListPage listSystemResource(QuerySystemResourceListPage querySystemResourceList){
        int total = taRoleResDOMapper.listSystemResourceCount(querySystemResourceList);
        if(total>0){
            querySystemResourceList.setDatas(taRoleResDOMapper.listSystemResourceResult(querySystemResourceList));
        }
        querySystemResourceList.setTotal(total);
        return querySystemResourceList;
    }
    /**
     * desc:更新有效性状态.<br/>
     * descSql =  UPDATE TA_ROLE_RES SET VALID_STATUS = 0 WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long updateValidStatus(Long id){
        return taRoleResDOMapper.updateValidStatus(id);
    }
}
