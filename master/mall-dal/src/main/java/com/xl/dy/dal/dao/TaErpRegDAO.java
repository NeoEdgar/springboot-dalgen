package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaErpRegDO;
import java.util.List;
import com.xl.dy.dal.paging.QueryErpListPage;
import com.xl.dy.dal.mapper.TaErpRegDOMapper;

/**
* The Table TA_ERP_REG.
* TA_ERP_REG
*/
@Repository
public class TaErpRegDAO{

    @Autowired
    private TaErpRegDOMapper taErpRegDOMapper;

    /**
     * desc:插入表:TA_ERP_REG.<br/>
     * descSql =  INSERT INTO TA_ERP_REG( ID ,DRIVE ,REMARK ,ERP_TYPE ,ALTER_EMPL ,ALTER_TIME ,INIT_PARAM ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,ERP_REG_NAME ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{drive,jdbcType=VARCHAR} , #{remark,jdbcType=VARCHAR} , #{erpType,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{initParam,jdbcType=VARCHAR} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{erpRegName,jdbcType=VARCHAR} , #{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaErpRegDO entity){
        return taErpRegDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_ERP_REG.<br/>
     * descSql =  UPDATE TA_ERP_REG SET DRIVE = #{drive,jdbcType=VARCHAR} ,REMARK = #{remark,jdbcType=VARCHAR} ,ERP_TYPE = #{erpType,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,INIT_PARAM = #{initParam,jdbcType=VARCHAR} ,ERP_REG_NAME = #{erpRegName,jdbcType=VARCHAR} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaErpRegDO entity){
        return taErpRegDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_ERP_REG.<br/>
     * descSql =  DELETE FROM TA_ERP_REG WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taErpRegDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_ERP_REG.<br/>
     * descSql =  SELECT * FROM TA_ERP_REG WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaErpRegDO
     */
    public TaErpRegDO getByPrimary(Long id){
        return taErpRegDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据主键获取有效数据:TA_ERP_REG.<br/>
     * descSql =  SELECT * FROM TA_ERP_REG WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaErpRegDO
     */
    public TaErpRegDO getByPrimarySelective(Long id){
        return taErpRegDOMapper.getByPrimarySelective(id);
    }
    /**
     * desc:根据主键获取数据:TA_ERP_REG.<br/>
     * descSql =  SELECT * FROM TA_ERP_REG WHERE VALID_STATUS = 1
     * @return List<TaErpRegDO>
     */
    public List<TaErpRegDO> findErpList(){
        return taErpRegDOMapper.findErpList();
    }
    /**
     * desc:获取业务系统分页列表.<br/>
     * descSql =  SELECT a.ID AS id ,b.DIC_VALUE AS dicValue ,a.ERP_TYPE AS erpType ,a.ERP_REG_NAME AS ErpRegName ,a.INIT_PARAM AS initParam ,a.DRIVE AS drive FROM TA_ERP_REG a LEFT JOIN TG_DIC b on a.ERP_TYPE = b.DIC_KEY WHERE a.VALID_STATUS = 1 AND b.VALID_STATUS = 1 AND a.ERP_REG_NAME LIKE CONCAT('%',(#{Name,jdbcType=VARCHAR}),'%') ORDER BY a.CREATE_TIME DESC
     * @param queryErpList queryErpList
     * @return QueryErpListPage
     */
    public QueryErpListPage findErpPage(QueryErpListPage queryErpList){
        int total = taErpRegDOMapper.findErpPageCount(queryErpList);
        if(total>0){
            queryErpList.setDatas(taErpRegDOMapper.findErpPageResult(queryErpList));
        }
        queryErpList.setTotal(total);
        return queryErpList;
    }
}
