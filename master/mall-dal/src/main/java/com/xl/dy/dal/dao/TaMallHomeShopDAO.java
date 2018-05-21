package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaMallHomeShopDO;
import com.xl.dy.dal.paging.QueryHomeShopByMallPage;
import com.xl.dy.dal.mapper.TaMallHomeShopDOMapper;

/**
* The Table TA_MALL_HOME_SHOP.
* TA_MALL_HOME_SHOP
*/
@Repository
public class TaMallHomeShopDAO{

    @Autowired
    private TaMallHomeShopDOMapper taMallHomeShopDOMapper;

    /**
     * desc:???�表:TA_MALL_HOME_SHOP.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_MALL_HOME_SHOP( ID ,INX ,BRAND ,MALL_ID ,REMARK ,SHOP_ID ,END_TIME ,PHOTO_URL ,ALTER_EMPL ,ALTER_TIME ,START_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_NAME ,CREATE_TIME ,SHOW_STATUS ,VALID_STATUS ,INTRODUCTION )VALUES( #{id,jdbcType=BIGINT} , #{inx,jdbcType=INTEGER} , #{brand,jdbcType=VARCHAR} , #{mallId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{endTime,jdbcType=DATE} , #{photoUrl,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{startTime,jdbcType=DATE} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createName,jdbcType=VARCHAR} , #{createTime,jdbcType=TIMESTAMP} , #{showStatus,jdbcType=VARCHAR} , #{validStatus,jdbcType=INTEGER} , #{introduction,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaMallHomeShopDO entity){
        return taMallHomeShopDOMapper.insert(entity);
    }
    /**
     * desc:?��?�表:TA_MALL_HOME_SHOP.<br/>
     * descSql =  UPDATE TA_MALL_HOME_SHOP SET INX = #{inx,jdbcType=INTEGER} ,BRAND = #{brand,jdbcType=VARCHAR} ,MALL_ID = #{mallId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,END_TIME = #{endTime,jdbcType=DATE} ,PHOTO_URL = #{photoUrl,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,START_TIME = #{startTime,jdbcType=DATE} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_NAME = #{createName,jdbcType=VARCHAR} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,SHOW_STATUS = #{showStatus,jdbcType=VARCHAR} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,INTRODUCTION = #{introduction,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaMallHomeShopDO entity){
        return taMallHomeShopDOMapper.update(entity);
    }
    /**
     * desc:?��??主�?????��?��??:TA_MALL_HOME_SHOP.<br/>
     * descSql =  DELETE FROM TA_MALL_HOME_SHOP WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taMallHomeShopDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:?��??主�???��???��??:TA_MALL_HOME_SHOP.<br/>
     * descSql =  SELECT * FROM TA_MALL_HOME_SHOP WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaMallHomeShopDO
     */
    public TaMallHomeShopDO getByPrimary(Long id){
        return taMallHomeShopDOMapper.getByPrimary(id);
    }
    /**
     * desc:获得商场首页商品管理:TA_MALL_HOME_SHOP.<br/>
     * descSql =  SELECT * FROM TA_MALL_HOME_SHOP WHERE MALL_ID = #{mallId,jdbcType=BIGINT} AND VALID_STATUS = 1 ORDER BY INX DESC
     * @param queryHomeShopByMall queryHomeShopByMall
     * @return QueryHomeShopByMallPage
     */
    public QueryHomeShopByMallPage getHomeShopByMall(QueryHomeShopByMallPage queryHomeShopByMall){
        int total = taMallHomeShopDOMapper.getHomeShopByMallCount(queryHomeShopByMall);
        if(total>0){
            queryHomeShopByMall.setDatas(taMallHomeShopDOMapper.getHomeShopByMallResult(queryHomeShopByMall));
        }
        queryHomeShopByMall.setTotal(total);
        return queryHomeShopByMall;
    }
}
