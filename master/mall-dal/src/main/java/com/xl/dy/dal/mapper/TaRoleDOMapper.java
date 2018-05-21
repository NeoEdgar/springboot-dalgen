package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaRoleDO;
import java.lang.String;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_ROLE.
 * TA_ROLE
 */
public interface TaRoleDOMapper{

    /**
     * desc:插入表:TA_ROLE.<br/>
     * descSql =  INSERT INTO TA_ROLE( FR ,ID ,LEV ,PID ,CODE ,NAME ,REMARK ,UNIT_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,ROLE_STATUS ,VALID_STATUS ,PLATFORM_TYPE )VALUES( #{fr,jdbcType=VARCHAR} , #{id,jdbcType=BIGINT} , #{lev,jdbcType=INTEGER} , #{pid,jdbcType=BIGINT} , #{code,jdbcType=VARCHAR} , #{name,jdbcType=VARCHAR} , #{remark,jdbcType=VARCHAR} , #{unitId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{roleStatus,jdbcType=INTEGER} , #{validStatus,jdbcType=INTEGER} , #{platformType,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaRoleDO entity);
    /**
     * desc:更新表:TA_ROLE.<br/>
     * descSql =  UPDATE TA_ROLE SET FR = #{fr,jdbcType=VARCHAR} ,LEV = #{lev,jdbcType=INTEGER} ,PID = #{pid,jdbcType=BIGINT} ,CODE = #{code,jdbcType=VARCHAR} ,NAME = #{name,jdbcType=VARCHAR} ,REMARK = #{remark,jdbcType=VARCHAR} ,UNIT_ID = #{unitId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,ROLE_STATUS = #{roleStatus,jdbcType=INTEGER} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,PLATFORM_TYPE = #{platformType,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaRoleDO entity);
    /**
     * desc:根据主键删除数据:TA_ROLE.<br/>
     * descSql =  DELETE FROM TA_ROLE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_ROLE.<br/>
     * descSql =  SELECT * FROM TA_ROLE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaRoleDO
     */
    TaRoleDO getByPrimary(Long id);
    /**
     * desc:获取全路径:FR.<br/>
     * descSql =  call P_GET_TREE_PARENT_IDS(#{argChildId,jdbcType=BIGINT},#{argTableName,jdbcType=VARCHAR},#{argIdColName,jdbcType=VARCHAR},#{argPidColName,jdbcType=VARCHAR})
     * @param argChildId argChildId
     * @param argIdColName argIdColName
     * @param argTableName argTableName
     * @param argPidColName argPidColName
     * @return String
     */
    String getFr(@Param("argChildId")Long argChildId,@Param("argIdColName")String argIdColName,@Param("argTableName")String argTableName,@Param("argPidColName")String argPidColName);
    /**
     * desc:根据主键获取数据:TA_ROLE.<br/>
     * descSql =  SELECT * FROM TA_ROLE WHERE VALID_STATUS = 1 AND FR	like #{fr,jdbcType=VARCHAR}
     * @param fr fr
     * @return List<TaRoleDO>
     */
    List<TaRoleDO> getChildRoleList(String fr);
    /**
     * desc:根据父级ID找子角色.<br/>
     * descSql =  SELECT ID ,NAME,LEV,ROLE_STATUS FROM TA_ROLE WHERE VALID_STATUS = 1 AND PID = #{pid,jdbcType=BIGINT}
     * @param pid pid
     * @return List<TaRoleDO>
     */
    List<TaRoleDO> getChildRoleListByFrId(Long pid);
    /**
     * desc:获取同级中最大code.<br/>
     * descSql =  SELECT MAX(CODE) FROM TA_ROLE WHERE VALID_STATUS = 1 AND LEV = #{lev,jdbcType=INTEGER}
     * @param lev lev
     * @return String
     */
    String getMaxCodeOfOneLev(Integer lev);
    /**
     * desc:根据主键获取数据:TA_ROLE.<br/>
     * descSql =  SELECT * FROM TA_ROLE WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return Map
     */
    Map getByPrimarySelective(Long id);
    /**
     * desc:更新表:TA_ROLE.<br/>
     * descSql =  UPDATE TA_ROLE WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long updateSelective(TaRoleDO entity);
    /**
     * desc:根据单位Id获取数据:TA_ROLE.<br/>
     * descSql =  SELECT FR ,ID ,LEV ,PID ,CODE ,NAME ,REMARK ,UNIT_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,ROLE_STATUS ,VALID_STATUS ,PLATFORM_TYPE FROM TA_ROLE WHERE UNIT_ID = #{unitId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param unitId unitId
     * @return List<TaRoleDO>
     */
    List<TaRoleDO> getByUnitId(Long unitId);
    /**
     * desc:根据平台类型获取数据:TA_ROLE.<br/>
     * descSql =  SELECT FR ,ID ,LEV ,PID ,CODE ,NAME ,REMARK ,UNIT_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,ROLE_STATUS ,VALID_STATUS ,PLATFORM_TYPE FROM TA_ROLE WHERE PLATFORM_TYPE = #{platformType,jdbcType=VARCHAR} AND VALID_STATUS = 1
     * @param platformType platformType
     * @return List<TaRoleDO>
     */
    List<TaRoleDO> getByPlatformType(String platformType);
    /**
     * desc:根据单位ID和角色等级获取该单位的管理员信息:TA_ROLE.<br/>
     * descSql =  SELECT FR ,ID ,LEV ,PID ,CODE ,NAME ,REMARK ,UNIT_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,ROLE_STATUS ,VALID_STATUS ,PLATFORM_TYPE FROM TA_ROLE WHERE UNIT_ID = #{unitId,jdbcType=BIGINT} AND LEV = 1 AND VALID_STATUS = 1
     * @param unitId unitId
     * @return TaRoleDO
     */
    TaRoleDO getManagerInfoByLevAndUnitId(Long unitId);
}
