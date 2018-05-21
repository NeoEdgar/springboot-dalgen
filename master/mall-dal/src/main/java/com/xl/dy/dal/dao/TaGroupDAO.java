package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaGroupDO;
import com.xl.dy.dal.paging.QueryGroupActivityPage;
import com.xl.dy.dal.mapper.TaGroupDOMapper;

/**
* The Table TA_GROUP.
* TA_GROUP
*/
@Repository
public class TaGroupDAO{

    @Autowired
    private TaGroupDOMapper taGroupDOMapper;

    /**
     * desc:???�表:TA_GROUP.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_GROUP( ID ,INX ,NAME ,NOTICE ,REMARK ,GROUPNUM ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,CATEGORY_SET ,GROUP_STATUS ,PER_BUY_LIMIT ,PUTAWAY_TIME ,SOLDOUT_TIME ,VALID_STATUS ,PER_REGISTE_LIMIT ,SIMULATION_GROUP )VALUES( #{id,jdbcType=BIGINT} , #{inx,jdbcType=INTEGER} , #{name,jdbcType=VARCHAR} , #{notice,jdbcType=VARCHAR} , #{remark,jdbcType=VARCHAR} , #{groupnum,jdbcType=INTEGER} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{categorySet,jdbcType=VARCHAR} , #{groupStatus,jdbcType=VARCHAR} , #{perBuyLimit,jdbcType=INTEGER} , #{putawayTime,jdbcType=TIMESTAMP} , #{soldoutTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{perRegisteLimit,jdbcType=INTEGER} , #{simulationGroup,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaGroupDO entity){
        return taGroupDOMapper.insert(entity);
    }
    /**
     * desc:?��?�表:TA_GROUP.<br/>
     * descSql =  UPDATE TA_GROUP SET INX = #{inx,jdbcType=INTEGER} ,NAME = #{name,jdbcType=VARCHAR} ,NOTICE = #{notice,jdbcType=VARCHAR} ,REMARK = #{remark,jdbcType=VARCHAR} ,GROUPNUM = #{groupnum,jdbcType=INTEGER} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,CATEGORY_SET = #{categorySet,jdbcType=VARCHAR} ,GROUP_STATUS = #{groupStatus,jdbcType=VARCHAR} ,PER_BUY_LIMIT = #{perBuyLimit,jdbcType=INTEGER} ,PUTAWAY_TIME = #{putawayTime,jdbcType=TIMESTAMP} ,SOLDOUT_TIME = #{soldoutTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,PER_REGISTE_LIMIT = #{perRegisteLimit,jdbcType=INTEGER} ,SIMULATION_GROUP = #{simulationGroup,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaGroupDO entity){
        return taGroupDOMapper.update(entity);
    }
    /**
     * desc:?��??主�?????��?��??:TA_GROUP.<br/>
     * descSql =  DELETE FROM TA_GROUP WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taGroupDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:?��??主�???��???��??:TA_GROUP.<br/>
     * descSql =  SELECT * FROM TA_GROUP WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaGroupDO
     */
    public TaGroupDO getByPrimary(Long id){
        return taGroupDOMapper.getByPrimary(id);
    }
    /**
     * desc:查询拼团列表:TA_GROUP.<br/>
     * descSql =  SELECT ID groupId, GROUPNUM groupNum, `NAME` groupName, PUTAWAY_TIME putawayTime, SOLDOUT_TIME solDoutTime, NOTICE notice FROM `ta_group` WHERE GROUP_STATUS = #{groupStatus,jdbcType=VARCHAR} AND `NAME` LIKE #{searchStr,jdbcType=VARCHAR} AND VALID_STATUS = 1
     * @param queryGroupActivity queryGroupActivity
     * @return QueryGroupActivityPage
     */
    public QueryGroupActivityPage showGroupActivity(QueryGroupActivityPage queryGroupActivity){
        int total = taGroupDOMapper.showGroupActivityCount(queryGroupActivity);
        if(total>0){
            queryGroupActivity.setDatas(taGroupDOMapper.showGroupActivityResult(queryGroupActivity));
        }
        queryGroupActivity.setTotal(total);
        return queryGroupActivity;
    }
}
