package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaNavigationPageDO;
import com.xl.dy.dal.paging.QueryNavigationListPage;
import com.xl.dy.dal.mapper.TaNavigationPageDOMapper;

/**
* The Table TA_NAVIGATION_PAGE.
* TA_NAVIGATION_PAGE
*/
@Repository
public class TaNavigationPageDAO{

    @Autowired
    private TaNavigationPageDOMapper taNavigationPageDOMapper;

    /**
     * desc:插入表:TA_NAVIGATION_PAGE.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_NAVIGATION_PAGE( ID ,INX ,REMARK ,LINK_URL ,PHOTO_URL ,ALTER_EMPL ,ALTER_TIME ,IS_DISPLAY ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,PUTAWAY_TIME ,SOLDOUT_TIME ,VALID_STATUS ,NAVIGATION_PAGE_NAME )VALUES( #{id,jdbcType=BIGINT} , #{inx,jdbcType=INTEGER} , #{remark,jdbcType=VARCHAR} , #{linkUrl,jdbcType=VARCHAR} , #{photoUrl,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{isDisplay,jdbcType=INTEGER} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{putawayTime,jdbcType=TIMESTAMP} , #{soldoutTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{navigationPageName,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaNavigationPageDO entity){
        return taNavigationPageDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_NAVIGATION_PAGE.<br/>
     * descSql =  UPDATE TA_NAVIGATION_PAGE SET INX = #{inx,jdbcType=INTEGER} ,REMARK = #{remark,jdbcType=VARCHAR} ,LINK_URL = #{linkUrl,jdbcType=VARCHAR} ,PHOTO_URL = #{photoUrl,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,IS_DISPLAY = #{isDisplay,jdbcType=INTEGER} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,PUTAWAY_TIME = #{putawayTime,jdbcType=TIMESTAMP} ,SOLDOUT_TIME = #{soldoutTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,NAVIGATION_PAGE_NAME = #{navigationPageName,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaNavigationPageDO entity){
        return taNavigationPageDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_NAVIGATION_PAGE.<br/>
     * descSql =  DELETE FROM TA_NAVIGATION_PAGE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taNavigationPageDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_NAVIGATION_PAGE.<br/>
     * descSql =  SELECT * FROM TA_NAVIGATION_PAGE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaNavigationPageDO
     */
    public TaNavigationPageDO getByPrimary(Long id){
        return taNavigationPageDOMapper.getByPrimary(id);
    }
    /**
     * desc:获取导航页分页列表.<br/>
     * descSql =  SELECT * FROM TA_NAVIGATION_PAGE ORDER BY INX DESC
     * @param queryNavigationList queryNavigationList
     * @return QueryNavigationListPage
     */
    public QueryNavigationListPage findNavigationList(QueryNavigationListPage queryNavigationList){
        int total = taNavigationPageDOMapper.findNavigationListCount(queryNavigationList);
        if(total>0){
            queryNavigationList.setDatas(taNavigationPageDOMapper.findNavigationListResult(queryNavigationList));
        }
        queryNavigationList.setTotal(total);
        return queryNavigationList;
    }
    /**
     * desc:更新表:TA_NAVIGATION_PAGE.<br/>
     * descSql =  UPDATE TA_NAVIGATION_PAGE INX = #{inx,jdbcType=INTEGER}, REMARK = #{remark,jdbcType=VARCHAR}, LINK_URL = #{linkUrl,jdbcType=VARCHAR}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, IS_DISPLAY = #{isDisplay,jdbcType=INTEGER}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, PUTAWAY_TIME = #{putawayTime,jdbcType=TIMESTAMP}, SOLDOUT_TIME = #{soldoutTime,jdbcType=TIMESTAMP}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, NAVIGATION_PAGE_NAME = #{navigationPageName,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long updateByPrimarySelective(TaNavigationPageDO entity){
        return taNavigationPageDOMapper.updateByPrimarySelective(entity);
    }
}
