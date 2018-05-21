package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TgSysConfDO;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TG_SYS_CONF.
 * TG_SYS_CONF
 */
public interface TgSysConfDOMapper{

    /**
     * desc:插入表:TG_SYS_CONF.<br/>
     * descSql =  INSERT INTO TG_SYS_CONF( ID ,REMARK ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,F_SYS_CONF_EXP ,VALID_STATUS ,F_SYS_CONF_NAME ,F_SYS_CONF_TYPE ,F_SYS_CONF_VALUE )VALUES( #{id,jdbcType=BIGINT} ,#{remark,jdbcType=VARCHAR} ,#{alterEmpl,jdbcType=BIGINT} ,#{alterTime,jdbcType=TIMESTAMP} ,#{timestamp,jdbcType=BIGINT} ,#{createEmpl,jdbcType=BIGINT} ,#{createTime,jdbcType=TIMESTAMP} ,#{fSysConfExp,jdbcType=VARCHAR} ,#{validStatus,jdbcType=INTEGER} ,#{fSysConfName,jdbcType=VARCHAR} ,#{fSysConfType,jdbcType=INTEGER} ,#{fSysConfValue,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TgSysConfDO entity);
    /**
     * desc:更新表:TG_SYS_CONF.<br/>
     * descSql =  UPDATE TG_SYS_CONF SET REMARK = #{remark,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,F_SYS_CONF_EXP = #{fSysConfExp,jdbcType=VARCHAR} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,F_SYS_CONF_NAME = #{fSysConfName,jdbcType=VARCHAR} ,F_SYS_CONF_TYPE = #{fSysConfType,jdbcType=INTEGER} ,F_SYS_CONF_VALUE = #{fSysConfValue,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TgSysConfDO entity);
    /**
     * desc:根据主键删除数据:TG_SYS_CONF.<br/>
     * descSql =  DELETE FROM TG_SYS_CONF WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TG_SYS_CONF.<br/>
     * descSql =  SELECT * FROM TG_SYS_CONF WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TgSysConfDO
     */
    TgSysConfDO getByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TG_SYS_CONF.<br/>
     * descSql =  SELECT * FROM TG_SYS_CONF WHERE F_SYS_CONF_TYPE = #{fSysConfType,jdbcType=INTEGER}
     * @param fSysConfType fSysConfType
     * @return TgSysConfDO
     */
    TgSysConfDO getBySysConfType(Integer fSysConfType);
    /**
     * desc:根据主键获取数据:TG_SYS_CONF.<br/>
     * descSql =  SELECT * FROM TG_SYS_CONF WHERE F_SYS_CONF_NAME = #{fSysConfName,jdbcType=VARCHAR}
     * @param fSysConfName fSysConfName
     * @return TgSysConfDO
     */
    TgSysConfDO getByConfName(String fSysConfName);
}
