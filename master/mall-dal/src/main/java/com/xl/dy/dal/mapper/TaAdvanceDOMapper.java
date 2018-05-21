package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaAdvanceDO;
import com.xl.dy.dal.paging.QueryAdvancePage;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

/**
 * ?��???�?对�??页�????,请�?��?�使?��?��???DAO�?
 * The Table TA_ADVANCE.
 * TA_ADVANCE
 */
public interface TaAdvanceDOMapper{

    /**
     * desc:???�表:TA_ADVANCE.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_ADVANCE( ID ,NAME ,NOTICE ,REMARK ,END_TIME ,ALTER_EMPL ,ALTER_TIME ,START_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,CATEGORY_SET ,PER_BUY_LIMIT ,VALID_STATUS ,ADVANCE_STATUS ,PER_REGISTE_LIMIT )VALUES( #{id,jdbcType=BIGINT} , #{name,jdbcType=VARCHAR} , #{notice,jdbcType=VARCHAR} , #{remark,jdbcType=VARCHAR} , #{endTime,jdbcType=TIMESTAMP} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{startTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{categorySet,jdbcType=VARCHAR} , #{perBuyLimit,jdbcType=INTEGER} , #{validStatus,jdbcType=INTEGER} , #{advanceStatus,jdbcType=VARCHAR} , #{perRegisteLimit,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaAdvanceDO entity);
    /**
     * desc:?��?�表:TA_ADVANCE.<br/>
     * descSql =  UPDATE TA_ADVANCE SET NAME = #{name,jdbcType=VARCHAR} ,NOTICE = #{notice,jdbcType=VARCHAR} ,REMARK = #{remark,jdbcType=VARCHAR} ,END_TIME = #{endTime,jdbcType=TIMESTAMP} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,START_TIME = #{startTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,CATEGORY_SET = #{categorySet,jdbcType=VARCHAR} ,PER_BUY_LIMIT = #{perBuyLimit,jdbcType=INTEGER} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,ADVANCE_STATUS = #{advanceStatus,jdbcType=VARCHAR} ,PER_REGISTE_LIMIT = #{perRegisteLimit,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaAdvanceDO entity);
    /**
     * desc:?��??主�?????��?��??:TA_ADVANCE.<br/>
     * descSql =  DELETE FROM TA_ADVANCE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:?��??主�???��???��??:TA_ADVANCE.<br/>
     * descSql =  SELECT * FROM TA_ADVANCE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaAdvanceDO
     */
    TaAdvanceDO getByPrimary(Long id);
    /**
     * desc:查询秒杀列表:TA_ADVANCE.<br/>
     * descSql =  SELECT ID advanceId, `NAME` advanceName, START_TIME startTime, END_TIME endTime, NOTICE notice FROM ta_advance WHERE ADVANCE_STATUS = #{advanceStatus,jdbcType=VARCHAR} AND `NAME` LIKE #{searchStr,jdbcType=VARCHAR} AND VALID_STATUS = 1
     * @param queryAdvance queryAdvance
     * @return int
     */
    int findAdvancePageCount(QueryAdvancePage queryAdvance);
    /**
     * desc:查询秒杀列表:TA_ADVANCE.<br/>
     * descSql =  SELECT ID advanceId, `NAME` advanceName, START_TIME startTime, END_TIME endTime, NOTICE notice FROM ta_advance WHERE ADVANCE_STATUS = #{advanceStatus,jdbcType=VARCHAR} AND `NAME` LIKE #{searchStr,jdbcType=VARCHAR} AND VALID_STATUS = 1
     * @param queryAdvance queryAdvance
     * @return List<Map>
     */
    List<Map> findAdvancePageResult(QueryAdvancePage queryAdvance);
}
