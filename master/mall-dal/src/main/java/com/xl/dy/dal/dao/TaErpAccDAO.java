package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaErpAccDO;
import java.util.Map;
import com.xl.dy.dal.paging.QueryErpAccListPage;
import com.xl.dy.dal.mapper.TaErpAccDOMapper;

/**
* The Table TA_ERP_ACC.
* TA_ERP_ACC
*/
@Repository
public class TaErpAccDAO{

    @Autowired
    private TaErpAccDOMapper taErpAccDOMapper;

    /**
     * desc:插入表:TA_ERP_ACC.<br/>
     * descSql =  INSERT INTO TA_ERP_ACC( ID ,REMARK ,ERP_REG_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,ERP_ACC_NAME ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{erpRegId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{erpAccName,jdbcType=VARCHAR} , #{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaErpAccDO entity){
        return taErpAccDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_ERP_ACC.<br/>
     * descSql =  UPDATE TA_ERP_ACC SET REMARK = #{remark,jdbcType=VARCHAR} ,ERP_REG_ID = #{erpRegId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,ERP_ACC_NAME = #{erpAccName,jdbcType=VARCHAR} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaErpAccDO entity){
        return taErpAccDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_ERP_ACC.<br/>
     * descSql =  DELETE FROM TA_ERP_ACC WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taErpAccDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_ERP_ACC.<br/>
     * descSql =  SELECT * FROM TA_ERP_ACC WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaErpAccDO
     */
    public TaErpAccDO getByPrimary(Long id){
        return taErpAccDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_ERP_ACC.<br/>
     * descSql =  SELECT * FROM TA_ERP_ACC VALID_STATUS = 1 
     * @param id id
     * @param erpRegId erpRegId
     * @param erpAccName erpAccName
     * @return TaErpAccDO
     */
    public TaErpAccDO getByPrimarySelective(Long id,Long erpRegId,String erpAccName){
        return taErpAccDOMapper.getByPrimarySelective(id, erpRegId, erpAccName);
    }
    /**
     * desc:根据主键获取数据:TA_ERP_ACC.<br/>
     * descSql =  SELECT a.ERP_ACC_NAME AS erpAccName ,b.ERP_REG_NAME AS erpRegName ,b.INIT_PARAM AS initParam ,b.DRIVE AS drive ,b.ERP_TYPE AS erpType FROM TA_ERP_ACC a left JOIN TA_ERP_REG b on a.ERP_REG_ID = b.ID WHERE a.ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Map
     */
    public Map getResultByPrimary(Long id){
        return taErpAccDOMapper.getResultByPrimary(id);
    }
    /**
     * desc:获取业务系统账号分页列表.<br/>
     * descSql =  SELECT a.ID AS id ,a.ERP_ACC_NAME AS erpAccName ,b.ERP_REG_NAME AS erpRegName ,b.ERP_TYPE AS erpType ,b.DRIVE AS drive FROM TA_ERP_ACC a left JOIN TA_ERP_REG b on a.ERP_REG_ID = b.ID WHERE a.VALID_STATUS = 1 AND b.VALID_STATUS = 1 AND a.ERP_ACC_NAME LIKE CONCAT('%',(#{Name,jdbcType=VARCHAR}),'%') ORDER BY a.CREATE_TIME DESC
     * @param queryErpAccList queryErpAccList
     * @return QueryErpAccListPage
     */
    public QueryErpAccListPage getErpAccPage(QueryErpAccListPage queryErpAccList){
        int total = taErpAccDOMapper.getErpAccPageCount(queryErpAccList);
        if(total>0){
            queryErpAccList.setDatas(taErpAccDOMapper.getErpAccPageResult(queryErpAccList));
        }
        queryErpAccList.setTotal(total);
        return queryErpAccList;
    }
}
