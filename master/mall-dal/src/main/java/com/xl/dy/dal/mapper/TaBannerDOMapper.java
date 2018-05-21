package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaBannerDO;
import com.xl.dy.dal.paging.QueryBannerListPage;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_BANNER.
 * TA_BANNER
 */
public interface TaBannerDOMapper{

    /**
     * desc:插入表:TA_BANNER.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_BANNER( ID ,INX ,MALL_ID ,REMARK ,LINK_URL ,PHOTO_URL ,ALTER_EMPL ,ALTER_TIME ,IS_DISPLAY ,TIMESTAMP ,BANNER_NAME ,BANNER_TYPE ,CREATE_EMPL ,CREATE_TIME ,PUTAWAY_TIME ,SOLDOUT_TIME ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{inx,jdbcType=INTEGER} , #{mallId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{linkUrl,jdbcType=VARCHAR} , #{photoUrl,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{isDisplay,jdbcType=INTEGER} , #{timestamp,jdbcType=BIGINT} , #{bannerName,jdbcType=VARCHAR} , #{bannerType,jdbcType=VARCHAR} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{putawayTime,jdbcType=TIMESTAMP} , #{soldoutTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaBannerDO entity);
    /**
     * desc:更新表:TA_BANNER.<br/>
     * descSql =  UPDATE TA_BANNER SET INX = #{inx,jdbcType=INTEGER} ,MALL_ID = #{mallId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,LINK_URL = #{linkUrl,jdbcType=VARCHAR} ,PHOTO_URL = #{photoUrl,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,IS_DISPLAY = #{isDisplay,jdbcType=INTEGER} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,BANNER_NAME = #{bannerName,jdbcType=VARCHAR} ,BANNER_TYPE = #{bannerType,jdbcType=VARCHAR} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,PUTAWAY_TIME = #{putawayTime,jdbcType=TIMESTAMP} ,SOLDOUT_TIME = #{soldoutTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaBannerDO entity);
    /**
     * desc:根据主键删除数据:TA_BANNER.<br/>
     * descSql =  DELETE FROM TA_BANNER WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_BANNER.<br/>
     * descSql =  SELECT * FROM TA_BANNER WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaBannerDO
     */
    TaBannerDO getByPrimary(Long id);
    /**
     * desc:获取Banner分页列表.<br/>
     * descSql =  SELECT * FROM TA_BANNER WHERE BANNER_TYPE = #{bannerType,jdbcType=VARCHAR} AND MALL_ID = #{mallId,jdbcType=BIGINT} ORDER BY INX DESC
     * @param queryBannerList queryBannerList
     * @return int
     */
    int findBannerPageCount(QueryBannerListPage queryBannerList);
    /**
     * desc:获取Banner分页列表.<br/>
     * descSql =  SELECT * FROM TA_BANNER WHERE BANNER_TYPE = #{bannerType,jdbcType=VARCHAR} AND MALL_ID = #{mallId,jdbcType=BIGINT} ORDER BY INX DESC
     * @param queryBannerList queryBannerList
     * @return List<TaBannerDO>
     */
    List<TaBannerDO> findBannerPageResult(QueryBannerListPage queryBannerList);
    /**
     * desc:更新表:TA_BANNER.<br/>
     * descSql =  UPDATE TA_BANNER INX = #{inx,jdbcType=INTEGER}, MALL_ID = #{mallId,jdbcType=BIGINT}, REMARK = #{remark,jdbcType=VARCHAR}, LINK_URL = #{linkUrl,jdbcType=VARCHAR}, PHOTO_URL = #{photoUrl,jdbcType=VARCHAR}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, IS_DISPLAY = #{isDisplay,jdbcType=INTEGER}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, BANNER_NAME = #{bannerName,jdbcType=VARCHAR}, BANNER_TYPE = #{bannerType,jdbcType=VARCHAR}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, PUTAWAY_TIME = #{putawayTime,jdbcType=TIMESTAMP}, SOLDOUT_TIME = #{soldoutTime,jdbcType=TIMESTAMP}, VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long updateByPrimarySelective(TaBannerDO entity);
}
