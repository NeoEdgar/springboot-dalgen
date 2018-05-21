package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaNavigationPageDO;
import com.xl.dy.dal.paging.QueryNavigationListPage;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_NAVIGATION_PAGE.
 * TA_NAVIGATION_PAGE
 */
public interface TaNavigationPageDOMapper{

    /**
     * desc:插入表:TA_NAVIGATION_PAGE.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_NAVIGATION_PAGE( ID ,INX ,REMARK ,LINK_URL ,PHOTO_URL ,ALTER_EMPL ,ALTER_TIME ,IS_DISPLAY ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,PUTAWAY_TIME ,SOLDOUT_TIME ,VALID_STATUS ,NAVIGATION_PAGE_NAME )VALUES( #{id,jdbcType=BIGINT} , #{inx,jdbcType=INTEGER} , #{remark,jdbcType=VARCHAR} , #{linkUrl,jdbcType=VARCHAR} , #{photoUrl,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{isDisplay,jdbcType=INTEGER} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{putawayTime,jdbcType=TIMESTAMP} , #{soldoutTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{navigationPageName,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaNavigationPageDO entity);
    /**
     * desc:更新表:TA_NAVIGATION_PAGE.<br/>
     * descSql =  UPDATE TA_NAVIGATION_PAGE SET INX = #{inx,jdbcType=INTEGER} ,REMARK = #{remark,jdbcType=VARCHAR} ,LINK_URL = #{linkUrl,jdbcType=VARCHAR} ,PHOTO_URL = #{photoUrl,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,IS_DISPLAY = #{isDisplay,jdbcType=INTEGER} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,PUTAWAY_TIME = #{putawayTime,jdbcType=TIMESTAMP} ,SOLDOUT_TIME = #{soldoutTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,NAVIGATION_PAGE_NAME = #{navigationPageName,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaNavigationPageDO entity);
    /**
     * desc:根据主键删除数据:TA_NAVIGATION_PAGE.<br/>
     * descSql =  DELETE FROM TA_NAVIGATION_PAGE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_NAVIGATION_PAGE.<br/>
     * descSql =  SELECT * FROM TA_NAVIGATION_PAGE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaNavigationPageDO
     */
    TaNavigationPageDO getByPrimary(Long id);
    /**
     * desc:获取导航页分页列表.<br/>
     * descSql =  SELECT * FROM TA_NAVIGATION_PAGE ORDER BY INX DESC
     * @param queryNavigationList queryNavigationList
     * @return int
     */
    int findNavigationListCount(QueryNavigationListPage queryNavigationList);
    /**
     * desc:获取导航页分页列表.<br/>
     * descSql =  SELECT * FROM TA_NAVIGATION_PAGE ORDER BY INX DESC
     * @param queryNavigationList queryNavigationList
     * @return List<TaNavigationPageDO>
     */
    List<TaNavigationPageDO> findNavigationListResult(QueryNavigationListPage queryNavigationList);
    /**
     * desc:更新表:TA_NAVIGATION_PAGE.<br/>
     * descSql =  UPDATE TA_NAVIGATION_PAGE INX = #{inx,jdbcType=INTEGER}, REMARK = #{remark,jdbcType=VARCHAR}, LINK_URL = #{linkUrl,jdbcType=VARCHAR}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, IS_DISPLAY = #{isDisplay,jdbcType=INTEGER}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, PUTAWAY_TIME = #{putawayTime,jdbcType=TIMESTAMP}, SOLDOUT_TIME = #{soldoutTime,jdbcType=TIMESTAMP}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, NAVIGATION_PAGE_NAME = #{navigationPageName,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long updateByPrimarySelective(TaNavigationPageDO entity);
}
