package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TgLogisticsDO;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TG_LOGISTICS.
 * TG_LOGISTICS
 */
public interface TgLogisticsDOMapper{

    /**
     * desc:插入表:TG_LOGISTICS.<br/>
     * descSql =  INSERT INTO TG_LOGISTICS( ID ,CODE ,NAME ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME )VALUES( #{id,jdbcType=BIGINT} , #{code,jdbcType=VARCHAR} , #{name,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} )
     * @param entity entity
     * @return Long
     */
    Long insert(TgLogisticsDO entity);
    /**
     * desc:更新表:TG_LOGISTICS.<br/>
     * descSql =  UPDATE TG_LOGISTICS SET CODE = #{code,jdbcType=VARCHAR} ,NAME = #{name,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TgLogisticsDO entity);
    /**
     * desc:根据主键删除数据:TG_LOGISTICS.<br/>
     * descSql =  DELETE FROM TG_LOGISTICS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TG_LOGISTICS.<br/>
     * descSql =  SELECT * FROM TG_LOGISTICS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TgLogisticsDO
     */
    TgLogisticsDO getByPrimary(Long id);
    /**
     * desc:插入表:TG_LOGISTICS.<br/>
     * descSql =  INSERT INTO TG_LOGISTICS( ID ,CODE ,NAME ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME )VALUES( #{id,jdbcType=BIGINT} , #{code,jdbcType=VARCHAR} , #{name,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} )
     * @param entity entity
     * @return TgLogisticsDO
     */
    TgLogisticsDO add(TgLogisticsDO entity);
}
