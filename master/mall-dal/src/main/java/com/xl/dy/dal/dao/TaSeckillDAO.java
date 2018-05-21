package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaSeckillDO;
import com.xl.dy.dal.paging.QuerySpikeActivityListPage;
import java.util.Map;
import com.xl.dy.dal.paging.QuerySeckillPage;
import com.xl.dy.dal.mapper.TaSeckillDOMapper;

/**
* The Table TA_SECKILL.
* TA_SECKILL
*/
@Repository
public class TaSeckillDAO{

    @Autowired
    private TaSeckillDOMapper taSeckillDOMapper;

    /**
     * desc:???�表:TA_SECKILL.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_SECKILL( ID ,INX ,NAME ,NOTICE ,REMARK ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,CATEGORY_SET ,PER_BUY_LIMIT ,PUTAWAY_TIME ,SOLDOUT_TIME ,VALID_STATUS ,SECKILL_STATUS ,PER_REGISTE_LIMIT )VALUES( #{id,jdbcType=BIGINT} , #{inx,jdbcType=INTEGER} , #{name,jdbcType=VARCHAR} , #{notice,jdbcType=VARCHAR} , #{remark,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{categorySet,jdbcType=VARCHAR} , #{perBuyLimit,jdbcType=INTEGER} , #{putawayTime,jdbcType=TIMESTAMP} , #{soldoutTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{seckillStatus,jdbcType=VARCHAR} , #{perRegisteLimit,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaSeckillDO entity){
        return taSeckillDOMapper.insert(entity);
    }
    /**
     * desc:?��?�表:TA_SECKILL.<br/>
     * descSql =  UPDATE TA_SECKILL SET INX = #{inx,jdbcType=INTEGER} ,NAME = #{name,jdbcType=VARCHAR} ,NOTICE = #{notice,jdbcType=VARCHAR} ,REMARK = #{remark,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,CATEGORY_SET = #{categorySet,jdbcType=VARCHAR} ,PER_BUY_LIMIT = #{perBuyLimit,jdbcType=INTEGER} ,PUTAWAY_TIME = #{putawayTime,jdbcType=TIMESTAMP} ,SOLDOUT_TIME = #{soldoutTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,SECKILL_STATUS = #{seckillStatus,jdbcType=VARCHAR} ,PER_REGISTE_LIMIT = #{perRegisteLimit,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaSeckillDO entity){
        return taSeckillDOMapper.update(entity);
    }
    /**
     * desc:?��??主�?????��?��??:TA_SECKILL.<br/>
     * descSql =  DELETE FROM TA_SECKILL WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taSeckillDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:?��??主�???��???��??:TA_SECKILL.<br/>
     * descSql =  SELECT * FROM TA_SECKILL WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaSeckillDO
     */
    public TaSeckillDO getByPrimary(Long id){
        return taSeckillDOMapper.getByPrimary(id);
    }
    /**
     * desc:查询店铺列表.<br/>
     * descSql =  SELECT A.ID,A.NAME,A.NOTICE, A.ACTIVITYTIME ,A.CREATE_TIME,B.UNCHECK_NUM,C.CHECK_NUM FROM (SELECT ID,NAME,NOTICE, CONCAT(PUTAWAY_TIME,'/',SOLDOUT_TIME ) ACTIVITYTIME ,CREATE_TIME from ta_seckill CONCAT(IFNULL(NAME,'')) like #{searchStr,jdbcType=VARCHAR} ) A LEFT JOIN (SELECT SECKILL_ID,IFNULL(COUNT(*),0) UNCHECK_NUM from TA_SECKILL_REVIEW WHERE SECKILL_REVIEW_STATUS ='UNCHECK' GROUP BY SECKILL_ID) B ON A.ID = b.SECKILL_ID LEFT JOIN (SELECT SECKILL_ID, IFNULL(COUNT(*),0) CHECK_NUM from TA_SECKILL_REVIEW WHERE SECKILL_REVIEW_STATUS ='PASS' GROUP BY SECKILL_ID) C ON A.ID = C.SECKILL_ID ORDER BY A.CREATE_TIME DESC
     * @param querySpikeActivityList querySpikeActivityList
     * @return QuerySpikeActivityListPage
     */
    public QuerySpikeActivityListPage showSpikeActivityList(QuerySpikeActivityListPage querySpikeActivityList){
        int total = taSeckillDOMapper.showSpikeActivityListCount(querySpikeActivityList);
        if(total>0){
            querySpikeActivityList.setDatas(taSeckillDOMapper.showSpikeActivityListResult(querySpikeActivityList));
        }
        querySpikeActivityList.setTotal(total);
        return querySpikeActivityList;
    }
    /**
     * desc:根据主键获取数据:TA_SECKILL.<br/>
     * descSql =  SELECT C.ID,C.NAME,C.ACTIVITYTIME , C.NOTICE,B.NAMES FROM (SELECT GROUP_CONCAT(A.NAME SEPARATOR ',') NAMES FROM `tg_mg_category` A WHERE find_in_set(A.`ID`,(SELECT CATEGORY_SET FROM TA_SECKILL WHERE ID = #{id,jdbcType=BIGINT})) &gt;0 ) B, (SELECT ID,NAME,CONCAT(PUTAWAY_TIME,'/',SOLDOUT_TIME ) ACTIVITYTIME , NOTICE FROM TA_SECKILL WHERE ID = #{id,jdbcType=BIGINT} ) C
     * @param id id
     * @return Map
     */
    public Map getSpikeActivityInfo(Long id){
        return taSeckillDOMapper.getSpikeActivityInfo(id);
    }
    /**
     * desc:查询秒杀列表:TA_SECKILL.<br/>
     * descSql =  SELECT ID seckillId, `NAME` seckillName, PUTAWAY_TIME putawayTime, SOLDOUT_TIME solDoutTime, NOTICE notice FROM ta_seckill WHERE SECKILL_STATUS = #{seckillStatus,jdbcType=VARCHAR} AND `NAME` LIKE #{searchStr,jdbcType=VARCHAR} AND VALID_STATUS = 1
     * @param querySeckill querySeckill
     * @return QuerySeckillPage
     */
    public QuerySeckillPage findSeckillPage(QuerySeckillPage querySeckill){
        int total = taSeckillDOMapper.findSeckillPageCount(querySeckill);
        if(total>0){
            querySeckill.setDatas(taSeckillDOMapper.findSeckillPageResult(querySeckill));
        }
        querySeckill.setTotal(total);
        return querySeckill;
    }
}
