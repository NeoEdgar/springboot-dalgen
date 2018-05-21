package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaAdvanceDO;
import com.xl.dy.dal.paging.QueryAdvancePage;
import com.xl.dy.dal.mapper.TaAdvanceDOMapper;

/**
* The Table TA_ADVANCE.
* TA_ADVANCE
*/
@Repository
public class TaAdvanceDAO{

    @Autowired
    private TaAdvanceDOMapper taAdvanceDOMapper;

    /**
     * desc:???�表:TA_ADVANCE.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_ADVANCE( ID ,NAME ,NOTICE ,REMARK ,END_TIME ,ALTER_EMPL ,ALTER_TIME ,START_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,CATEGORY_SET ,PER_BUY_LIMIT ,VALID_STATUS ,ADVANCE_STATUS ,PER_REGISTE_LIMIT )VALUES( #{id,jdbcType=BIGINT} , #{name,jdbcType=VARCHAR} , #{notice,jdbcType=VARCHAR} , #{remark,jdbcType=VARCHAR} , #{endTime,jdbcType=TIMESTAMP} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{startTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{categorySet,jdbcType=VARCHAR} , #{perBuyLimit,jdbcType=INTEGER} , #{validStatus,jdbcType=INTEGER} , #{advanceStatus,jdbcType=VARCHAR} , #{perRegisteLimit,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaAdvanceDO entity){
        return taAdvanceDOMapper.insert(entity);
    }
    /**
     * desc:?��?�表:TA_ADVANCE.<br/>
     * descSql =  UPDATE TA_ADVANCE SET NAME = #{name,jdbcType=VARCHAR} ,NOTICE = #{notice,jdbcType=VARCHAR} ,REMARK = #{remark,jdbcType=VARCHAR} ,END_TIME = #{endTime,jdbcType=TIMESTAMP} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,START_TIME = #{startTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,CATEGORY_SET = #{categorySet,jdbcType=VARCHAR} ,PER_BUY_LIMIT = #{perBuyLimit,jdbcType=INTEGER} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,ADVANCE_STATUS = #{advanceStatus,jdbcType=VARCHAR} ,PER_REGISTE_LIMIT = #{perRegisteLimit,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaAdvanceDO entity){
        return taAdvanceDOMapper.update(entity);
    }
    /**
     * desc:?��??主�?????��?��??:TA_ADVANCE.<br/>
     * descSql =  DELETE FROM TA_ADVANCE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taAdvanceDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:?��??主�???��???��??:TA_ADVANCE.<br/>
     * descSql =  SELECT * FROM TA_ADVANCE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaAdvanceDO
     */
    public TaAdvanceDO getByPrimary(Long id){
        return taAdvanceDOMapper.getByPrimary(id);
    }
    /**
     * desc:查询秒杀列表:TA_ADVANCE.<br/>
     * descSql =  SELECT ID advanceId, `NAME` advanceName, START_TIME startTime, END_TIME endTime, NOTICE notice FROM ta_advance WHERE ADVANCE_STATUS = #{advanceStatus,jdbcType=VARCHAR} AND `NAME` LIKE #{searchStr,jdbcType=VARCHAR} AND VALID_STATUS = 1
     * @param queryAdvance queryAdvance
     * @return QueryAdvancePage
     */
    public QueryAdvancePage findAdvancePage(QueryAdvancePage queryAdvance){
        int total = taAdvanceDOMapper.findAdvancePageCount(queryAdvance);
        if(total>0){
            queryAdvance.setDatas(taAdvanceDOMapper.findAdvancePageResult(queryAdvance));
        }
        queryAdvance.setTotal(total);
        return queryAdvance;
    }
}
