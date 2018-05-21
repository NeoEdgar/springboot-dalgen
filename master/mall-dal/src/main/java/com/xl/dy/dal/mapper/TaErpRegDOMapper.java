package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaErpRegDO;
import java.util.List;
import com.xl.dy.dal.paging.QueryErpListPage;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_ERP_REG.
 * TA_ERP_REG
 */
public interface TaErpRegDOMapper{

    /**
     * desc:插入表:TA_ERP_REG.<br/>
     * descSql =  INSERT INTO TA_ERP_REG( ID ,DRIVE ,REMARK ,ERP_TYPE ,ALTER_EMPL ,ALTER_TIME ,INIT_PARAM ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,ERP_REG_NAME ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{drive,jdbcType=VARCHAR} , #{remark,jdbcType=VARCHAR} , #{erpType,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{initParam,jdbcType=VARCHAR} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{erpRegName,jdbcType=VARCHAR} , #{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaErpRegDO entity);
    /**
     * desc:更新表:TA_ERP_REG.<br/>
     * descSql =  UPDATE TA_ERP_REG SET DRIVE = #{drive,jdbcType=VARCHAR} ,REMARK = #{remark,jdbcType=VARCHAR} ,ERP_TYPE = #{erpType,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,INIT_PARAM = #{initParam,jdbcType=VARCHAR} ,ERP_REG_NAME = #{erpRegName,jdbcType=VARCHAR} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaErpRegDO entity);
    /**
     * desc:根据主键删除数据:TA_ERP_REG.<br/>
     * descSql =  DELETE FROM TA_ERP_REG WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_ERP_REG.<br/>
     * descSql =  SELECT * FROM TA_ERP_REG WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaErpRegDO
     */
    TaErpRegDO getByPrimary(Long id);
    /**
     * desc:根据主键获取有效数据:TA_ERP_REG.<br/>
     * descSql =  SELECT * FROM TA_ERP_REG WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaErpRegDO
     */
    TaErpRegDO getByPrimarySelective(Long id);
    /**
     * desc:根据主键获取数据:TA_ERP_REG.<br/>
     * descSql =  SELECT * FROM TA_ERP_REG WHERE VALID_STATUS = 1
     * @return List<TaErpRegDO>
     */
    List<TaErpRegDO> findErpList();
    /**
     * desc:获取业务系统分页列表.<br/>
     * descSql =  SELECT a.ID AS id ,b.DIC_VALUE AS dicValue ,a.ERP_TYPE AS erpType ,a.ERP_REG_NAME AS ErpRegName ,a.INIT_PARAM AS initParam ,a.DRIVE AS drive FROM TA_ERP_REG a LEFT JOIN TG_DIC b on a.ERP_TYPE = b.DIC_KEY WHERE a.VALID_STATUS = 1 AND b.VALID_STATUS = 1 AND a.ERP_REG_NAME LIKE CONCAT('%',(#{Name,jdbcType=VARCHAR}),'%') ORDER BY a.CREATE_TIME DESC
     * @param queryErpList queryErpList
     * @return int
     */
    int findErpPageCount(QueryErpListPage queryErpList);
    /**
     * desc:获取业务系统分页列表.<br/>
     * descSql =  SELECT a.ID AS id ,b.DIC_VALUE AS dicValue ,a.ERP_TYPE AS erpType ,a.ERP_REG_NAME AS ErpRegName ,a.INIT_PARAM AS initParam ,a.DRIVE AS drive FROM TA_ERP_REG a LEFT JOIN TG_DIC b on a.ERP_TYPE = b.DIC_KEY WHERE a.VALID_STATUS = 1 AND b.VALID_STATUS = 1 AND a.ERP_REG_NAME LIKE CONCAT('%',(#{Name,jdbcType=VARCHAR}),'%') ORDER BY a.CREATE_TIME DESC
     * @param queryErpList queryErpList
     * @return List<Map>
     */
    List<Map> findErpPageResult(QueryErpListPage queryErpList);
}
