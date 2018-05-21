package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaErpJinliDeptDO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_ERP_JINLI_DEPT.
 * TA_ERP_JINLI_DEPT
 */
public interface TaErpJinliDeptDOMapper{

    /**
     * desc:插入表:TA_ERP_JINLI_DEPT.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_ERP_JINLI_DEPT( ID ,DEPT_ID ,IS_LEAF ,REMARK ,ERP_CODE ,DEPT_NAME ,DEPT_TYPE ,PARENT_ID ,ALTER_EMPL ,ALTER_TIME ,DEPT_LEVEL ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{deptId,jdbcType=VARCHAR} , #{isLeaf,jdbcType=INTEGER} , #{remark,jdbcType=VARCHAR} , #{erpCode,jdbcType=VARCHAR} , #{deptName,jdbcType=VARCHAR} , #{deptType,jdbcType=INTEGER} , #{parentId,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{deptLevel,jdbcType=INTEGER} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaErpJinliDeptDO entity);
    /**
     * desc:更新表:TA_ERP_JINLI_DEPT.<br/>
     * descSql =  UPDATE TA_ERP_JINLI_DEPT SET DEPT_ID = #{deptId,jdbcType=VARCHAR} ,IS_LEAF = #{isLeaf,jdbcType=INTEGER} ,REMARK = #{remark,jdbcType=VARCHAR} ,ERP_CODE = #{erpCode,jdbcType=VARCHAR} ,DEPT_NAME = #{deptName,jdbcType=VARCHAR} ,DEPT_TYPE = #{deptType,jdbcType=INTEGER} ,PARENT_ID = #{parentId,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,DEPT_LEVEL = #{deptLevel,jdbcType=INTEGER} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaErpJinliDeptDO entity);
    /**
     * desc:根据主键删除数据:TA_ERP_JINLI_DEPT.<br/>
     * descSql =  DELETE FROM TA_ERP_JINLI_DEPT WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_ERP_JINLI_DEPT.<br/>
     * descSql =  SELECT * FROM TA_ERP_JINLI_DEPT WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaErpJinliDeptDO
     */
    TaErpJinliDeptDO getByPrimary(Long id);
    /**
     * desc:根据部门类型获取部门信息.<br/>
     * descSql =  SELECT * FROM TA_ERP_JINLI_DEPT WHERE ERP_CODE = 'jl' AND DEPT_TYPE=#{deptType,jdbcType=INTEGER} ORDER BY DEPT_LEVEL ASC 
     * @param deptType deptType
     * @return List<TaErpJinliDeptDO>
     */
    List<TaErpJinliDeptDO> getErpDeptByType(Integer deptType);
}
