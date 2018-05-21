package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaMallHomeGoodsDO;
import com.xl.dy.dal.paging.QueryHomeGoodsByMallPage;
import com.xl.dy.dal.mapper.TaMallHomeGoodsDOMapper;

/**
* The Table TA_MALL_HOME_GOODS.
* TA_MALL_HOME_GOODS
*/
@Repository
public class TaMallHomeGoodsDAO{

    @Autowired
    private TaMallHomeGoodsDOMapper taMallHomeGoodsDOMapper;

    /**
     * desc:???�表:TA_MALL_HOME_GOODS.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_MALL_HOME_GOODS( ID ,INX ,BRAND ,MALL_ID ,REMARK ,END_TIME ,PHOTO_URL ,ALTER_EMPL ,ALTER_TIME ,GOODS_CODE ,START_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_NAME ,CREATE_TIME ,MODULE_NAME ,SHOW_STATUS ,VALID_STATUS ,INTRODUCTION ,MODULE_NAME_ID )VALUES( #{id,jdbcType=BIGINT} , #{inx,jdbcType=INTEGER} , #{brand,jdbcType=VARCHAR} , #{mallId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{endTime,jdbcType=DATE} , #{photoUrl,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{goodsCode,jdbcType=VARCHAR} , #{startTime,jdbcType=DATE} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createName,jdbcType=VARCHAR} , #{createTime,jdbcType=TIMESTAMP} , #{moduleName,jdbcType=VARCHAR} , #{showStatus,jdbcType=VARCHAR} , #{validStatus,jdbcType=INTEGER} , #{introduction,jdbcType=VARCHAR} , #{moduleNameId,jdbcType=BIGINT} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaMallHomeGoodsDO entity){
        return taMallHomeGoodsDOMapper.insert(entity);
    }
    /**
     * desc:?��?�表:TA_MALL_HOME_GOODS.<br/>
     * descSql =  UPDATE TA_MALL_HOME_GOODS SET INX = #{inx,jdbcType=INTEGER} ,BRAND = #{brand,jdbcType=VARCHAR} ,MALL_ID = #{mallId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,END_TIME = #{endTime,jdbcType=DATE} ,PHOTO_URL = #{photoUrl,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,GOODS_CODE = #{goodsCode,jdbcType=VARCHAR} ,START_TIME = #{startTime,jdbcType=DATE} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_NAME = #{createName,jdbcType=VARCHAR} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,MODULE_NAME = #{moduleName,jdbcType=VARCHAR} ,SHOW_STATUS = #{showStatus,jdbcType=VARCHAR} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,INTRODUCTION = #{introduction,jdbcType=VARCHAR} ,MODULE_NAME_ID = #{moduleNameId,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaMallHomeGoodsDO entity){
        return taMallHomeGoodsDOMapper.update(entity);
    }
    /**
     * desc:?��??主�?????��?��??:TA_MALL_HOME_GOODS.<br/>
     * descSql =  DELETE FROM TA_MALL_HOME_GOODS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taMallHomeGoodsDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:?��??主�???��???��??:TA_MALL_HOME_GOODS.<br/>
     * descSql =  SELECT * FROM TA_MALL_HOME_GOODS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaMallHomeGoodsDO
     */
    public TaMallHomeGoodsDO getByPrimary(Long id){
        return taMallHomeGoodsDOMapper.getByPrimary(id);
    }
    /**
     * desc:获得商场首页商品管理:TA_MALL_HOME_GOODS.<br/>
     * descSql =  SELECT * FROM ta_mall_home_goods WHERE MALL_ID = #{mallId,jdbcType=BIGINT} AND MODULE_NAME_ID = #{mouduleNameId,jdbcType=BIGINT} AND VALID_STATUS = 1 ORDER BY INX DESC
     * @param queryHomeGoodsByMall queryHomeGoodsByMall
     * @return QueryHomeGoodsByMallPage
     */
    public QueryHomeGoodsByMallPage getHomeGoodsByMallAndMoudle(QueryHomeGoodsByMallPage queryHomeGoodsByMall){
        int total = taMallHomeGoodsDOMapper.getHomeGoodsByMallAndMoudleCount(queryHomeGoodsByMall);
        if(total>0){
            queryHomeGoodsByMall.setDatas(taMallHomeGoodsDOMapper.getHomeGoodsByMallAndMoudleResult(queryHomeGoodsByMall));
        }
        queryHomeGoodsByMall.setTotal(total);
        return queryHomeGoodsByMall;
    }
}
