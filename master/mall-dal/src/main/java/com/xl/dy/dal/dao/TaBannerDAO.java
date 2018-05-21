package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaBannerDO;
import com.xl.dy.dal.paging.QueryBannerListPage;
import com.xl.dy.dal.mapper.TaBannerDOMapper;

/**
* The Table TA_BANNER.
* TA_BANNER
*/
@Repository
public class TaBannerDAO{

    @Autowired
    private TaBannerDOMapper taBannerDOMapper;

    /**
     * desc:插入表:TA_BANNER.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_BANNER( ID ,INX ,MALL_ID ,REMARK ,LINK_URL ,PHOTO_URL ,ALTER_EMPL ,ALTER_TIME ,IS_DISPLAY ,TIMESTAMP ,BANNER_NAME ,BANNER_TYPE ,CREATE_EMPL ,CREATE_TIME ,PUTAWAY_TIME ,SOLDOUT_TIME ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{inx,jdbcType=INTEGER} , #{mallId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{linkUrl,jdbcType=VARCHAR} , #{photoUrl,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{isDisplay,jdbcType=INTEGER} , #{timestamp,jdbcType=BIGINT} , #{bannerName,jdbcType=VARCHAR} , #{bannerType,jdbcType=VARCHAR} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{putawayTime,jdbcType=TIMESTAMP} , #{soldoutTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaBannerDO entity){
        return taBannerDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_BANNER.<br/>
     * descSql =  UPDATE TA_BANNER SET INX = #{inx,jdbcType=INTEGER} ,MALL_ID = #{mallId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,LINK_URL = #{linkUrl,jdbcType=VARCHAR} ,PHOTO_URL = #{photoUrl,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,IS_DISPLAY = #{isDisplay,jdbcType=INTEGER} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,BANNER_NAME = #{bannerName,jdbcType=VARCHAR} ,BANNER_TYPE = #{bannerType,jdbcType=VARCHAR} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,PUTAWAY_TIME = #{putawayTime,jdbcType=TIMESTAMP} ,SOLDOUT_TIME = #{soldoutTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaBannerDO entity){
        return taBannerDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_BANNER.<br/>
     * descSql =  DELETE FROM TA_BANNER WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taBannerDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_BANNER.<br/>
     * descSql =  SELECT * FROM TA_BANNER WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaBannerDO
     */
    public TaBannerDO getByPrimary(Long id){
        return taBannerDOMapper.getByPrimary(id);
    }
    /**
     * desc:获取Banner分页列表.<br/>
     * descSql =  SELECT * FROM TA_BANNER WHERE BANNER_TYPE = #{bannerType,jdbcType=VARCHAR} AND MALL_ID = #{mallId,jdbcType=BIGINT} ORDER BY INX DESC
     * @param queryBannerList queryBannerList
     * @return QueryBannerListPage
     */
    public QueryBannerListPage findBannerPage(QueryBannerListPage queryBannerList){
        int total = taBannerDOMapper.findBannerPageCount(queryBannerList);
        if(total>0){
            queryBannerList.setDatas(taBannerDOMapper.findBannerPageResult(queryBannerList));
        }
        queryBannerList.setTotal(total);
        return queryBannerList;
    }
    /**
     * desc:更新表:TA_BANNER.<br/>
     * descSql =  UPDATE TA_BANNER INX = #{inx,jdbcType=INTEGER}, MALL_ID = #{mallId,jdbcType=BIGINT}, REMARK = #{remark,jdbcType=VARCHAR}, LINK_URL = #{linkUrl,jdbcType=VARCHAR}, PHOTO_URL = #{photoUrl,jdbcType=VARCHAR}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, IS_DISPLAY = #{isDisplay,jdbcType=INTEGER}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, BANNER_NAME = #{bannerName,jdbcType=VARCHAR}, BANNER_TYPE = #{bannerType,jdbcType=VARCHAR}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, PUTAWAY_TIME = #{putawayTime,jdbcType=TIMESTAMP}, SOLDOUT_TIME = #{soldoutTime,jdbcType=TIMESTAMP}, VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long updateByPrimarySelective(TaBannerDO entity){
        return taBannerDOMapper.updateByPrimarySelective(entity);
    }
}
