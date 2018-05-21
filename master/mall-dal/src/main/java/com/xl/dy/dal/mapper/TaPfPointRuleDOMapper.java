package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaPfPointRuleDO;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_PF_POINT_RULE.
 * TA_PF_POINT_RULE
 */
public interface TaPfPointRuleDOMapper{

    /**
     * desc:插入表:TA_PF_POINT_RULE.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_PF_POINT_RULE( ID ,REMARK ,ALTER_EMPL ,ALTER_TIME ,MA_END_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,MA_POINT_RULE ,MA_START_TIME ,VALID_STATUS ,MONTH_FIXED_DAY ,POINT_RULE_TYPE )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{maEndTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{maPointRule,jdbcType=INTEGER} , #{maStartTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{monthFixedDay,jdbcType=INTEGER} , #{pointRuleType,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaPfPointRuleDO entity);
    /**
     * desc:更新表:TA_PF_POINT_RULE.<br/>
     * descSql =  UPDATE TA_PF_POINT_RULE SET REMARK = #{remark,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,MA_END_TIME = #{maEndTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,MA_POINT_RULE = #{maPointRule,jdbcType=INTEGER} ,MA_START_TIME = #{maStartTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,MONTH_FIXED_DAY = #{monthFixedDay,jdbcType=INTEGER} ,POINT_RULE_TYPE = #{pointRuleType,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaPfPointRuleDO entity);
    /**
     * desc:根据主键删除数据:TA_PF_POINT_RULE.<br/>
     * descSql =  DELETE FROM TA_PF_POINT_RULE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_PF_POINT_RULE.<br/>
     * descSql =  SELECT * FROM TA_PF_POINT_RULE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaPfPointRuleDO
     */
    TaPfPointRuleDO getByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_PF_POINT_RULE.<br/>
     * descSql =  SELECT ID,MA_POINT_RULE,POINT_RULE_TYPE,MONTH_FIXED_DAY,MA_START_TIME,MA_END_TIME FROM TA_PF_POINT_RULE WHERE VALID_STATUS = 1
     * @return Map
     */
    Map getPointRule();
    /**
     * desc:根据主键获取数据:TA_PF_POINT_RULE.<br/>
     * descSql =  SELECT * FROM TA_PF_POINT_RULE WHERE VALID_STATUS = 1 AND MONTH_FIXED_DAY = #{monthDay,jdbcType=INTEGER}
     * @param monthDay monthDay
     * @return TaPfPointRuleDO
     */
    TaPfPointRuleDO getPointRuleByMonthDay(Integer monthDay);
    /**
     * desc:根据主键获取数据:TA_PF_POINT_RULE.<br/>
     * descSql =  SELECT * FROM TA_PF_POINT_RULE WHERE VALID_STATUS = 1 AND UNIX_TIMESTAMP(MA_START_TIME) &lt;= #{maTime,jdbcType=BIGINT} AND UNIX_TIMESTAMP(MA_END_TIME) &gt;= #{maTime,jdbcType=BIGINT} 
     * @param maTime maTime
     * @return TaPfPointRuleDO
     */
    TaPfPointRuleDO getPointRuleTime(Long maTime);
}
