package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaMallHomeShopDO;
import com.xl.dy.dal.paging.QueryHomeShopByMallPage;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

/**
 * ?��???�?对�??页�????,请�?��?�使?��?��???DAO�?
 * The Table TA_MALL_HOME_SHOP.
 * TA_MALL_HOME_SHOP
 */
public interface TaMallHomeShopDOMapper{

    /**
     * desc:???�表:TA_MALL_HOME_SHOP.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_MALL_HOME_SHOP( ID ,INX ,BRAND ,MALL_ID ,REMARK ,SHOP_ID ,END_TIME ,PHOTO_URL ,ALTER_EMPL ,ALTER_TIME ,START_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_NAME ,CREATE_TIME ,SHOW_STATUS ,VALID_STATUS ,INTRODUCTION )VALUES( #{id,jdbcType=BIGINT} , #{inx,jdbcType=INTEGER} , #{brand,jdbcType=VARCHAR} , #{mallId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{endTime,jdbcType=DATE} , #{photoUrl,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{startTime,jdbcType=DATE} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createName,jdbcType=VARCHAR} , #{createTime,jdbcType=TIMESTAMP} , #{showStatus,jdbcType=VARCHAR} , #{validStatus,jdbcType=INTEGER} , #{introduction,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaMallHomeShopDO entity);
    /**
     * desc:?��?�表:TA_MALL_HOME_SHOP.<br/>
     * descSql =  UPDATE TA_MALL_HOME_SHOP SET INX = #{inx,jdbcType=INTEGER} ,BRAND = #{brand,jdbcType=VARCHAR} ,MALL_ID = #{mallId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,END_TIME = #{endTime,jdbcType=DATE} ,PHOTO_URL = #{photoUrl,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,START_TIME = #{startTime,jdbcType=DATE} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_NAME = #{createName,jdbcType=VARCHAR} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,SHOW_STATUS = #{showStatus,jdbcType=VARCHAR} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,INTRODUCTION = #{introduction,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaMallHomeShopDO entity);
    /**
     * desc:?��??主�?????��?��??:TA_MALL_HOME_SHOP.<br/>
     * descSql =  DELETE FROM TA_MALL_HOME_SHOP WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:?��??主�???��???��??:TA_MALL_HOME_SHOP.<br/>
     * descSql =  SELECT * FROM TA_MALL_HOME_SHOP WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaMallHomeShopDO
     */
    TaMallHomeShopDO getByPrimary(Long id);
    /**
     * desc:获得商场首页商品管理:TA_MALL_HOME_SHOP.<br/>
     * descSql =  SELECT * FROM TA_MALL_HOME_SHOP WHERE MALL_ID = #{mallId,jdbcType=BIGINT} AND VALID_STATUS = 1 ORDER BY INX DESC
     * @param queryHomeShopByMall queryHomeShopByMall
     * @return int
     */
    int getHomeShopByMallCount(QueryHomeShopByMallPage queryHomeShopByMall);
    /**
     * desc:获得商场首页商品管理:TA_MALL_HOME_SHOP.<br/>
     * descSql =  SELECT * FROM TA_MALL_HOME_SHOP WHERE MALL_ID = #{mallId,jdbcType=BIGINT} AND VALID_STATUS = 1 ORDER BY INX DESC
     * @param queryHomeShopByMall queryHomeShopByMall
     * @return List<Map>
     */
    List<Map> getHomeShopByMallResult(QueryHomeShopByMallPage queryHomeShopByMall);
}
