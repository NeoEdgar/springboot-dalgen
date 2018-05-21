package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaBootPagesDO;
import com.xl.dy.dal.paging.QueryBootListPage;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_BOOT_PAGES.
 * TA_BOOT_PAGES
 */
@Repository
public interface TaBootPagesDOMapper{

    /**
     * desc:插入表:TA_BOOT_PAGES.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_BOOT_PAGES( ID ,INX ,REMARK ,LINK_URL ,PHOTO_URL ,ALTER_EMPL ,ALTER_TIME ,IS_DISPLAY ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,PUTAWAY_TIME ,SOLDOUT_TIME ,VALID_STATUS ,BOOT_PAGE_NAME )VALUES( #{id,jdbcType=BIGINT} , #{inx,jdbcType=INTEGER} , #{remark,jdbcType=VARCHAR} , #{linkUrl,jdbcType=VARCHAR} , #{photoUrl,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{isDisplay,jdbcType=INTEGER} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{putawayTime,jdbcType=TIMESTAMP} , #{soldoutTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{bootPageName,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaBootPagesDO entity);
    /**
     * desc:更新表:TA_BOOT_PAGES.<br/>
     * descSql =  UPDATE TA_BOOT_PAGES SET INX = #{inx,jdbcType=INTEGER} ,REMARK = #{remark,jdbcType=VARCHAR} ,LINK_URL = #{linkUrl,jdbcType=VARCHAR} ,PHOTO_URL = #{photoUrl,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,IS_DISPLAY = #{isDisplay,jdbcType=INTEGER} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,PUTAWAY_TIME = #{putawayTime,jdbcType=TIMESTAMP} ,SOLDOUT_TIME = #{soldoutTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,BOOT_PAGE_NAME = #{bootPageName,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaBootPagesDO entity);
    /**
     * desc:根据主键删除数据:TA_BOOT_PAGES.<br/>
     * descSql =  DELETE FROM TA_BOOT_PAGES WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_BOOT_PAGES.<br/>
     * descSql =  SELECT * FROM TA_BOOT_PAGES WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaBootPagesDO
     */
    TaBootPagesDO getByPrimary(Long id);
    /**
     * desc:获取启动页分页列表.<br/>
     * descSql =  SELECT * FROM TA_BOOT_PAGES ORDER BY INX DESC
     * @param queryBootList queryBootList
     * @return int
     */
    int findBootListCount(QueryBootListPage queryBootList);
    /**
     * desc:获取启动页分页列表.<br/>
     * descSql =  SELECT * FROM TA_BOOT_PAGES ORDER BY INX DESC
     * @param queryBootList queryBootList
     * @return List<TaBootPagesDO>
     */
    List<TaBootPagesDO> findBootListResult(QueryBootListPage queryBootList);
    /**
     * desc:更新表:TA_BOOT_PAGES.<br/>
     * descSql =  UPDATE TA_BOOT_PAGES INX = #{inx,jdbcType=INTEGER}, REMARK = #{remark,jdbcType=VARCHAR}, LINK_URL = #{linkUrl,jdbcType=VARCHAR}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, IS_DISPLAY = #{isDisplay,jdbcType=INTEGER}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, PUTAWAY_TIME = #{putawayTime,jdbcType=TIMESTAMP}, SOLDOUT_TIME = #{soldoutTime,jdbcType=TIMESTAMP}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, BOOT_PAGE_NAME = #{bootPageName,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long updateByPrimarySelective(TaBootPagesDO entity);
}
