package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaMessageDO;
import java.util.List;
import java.util.Date;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_MESSAGE.
 * TA_MESSAGE
 */
public interface TaMessageDOMapper{

    /**
     * desc:插入表:TA_MESSAGE.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_MESSAGE( ID ,LINK ,TAGS ,ALIAS ,IS_PUSH ,IS_READ ,CONTENT ,FIND_TIME ,RECIVE_ID ,ALTER_EMPL ,ALTER_TIME ,IS_SUCCESS ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,PLATFORM_TYPE )VALUES( #{id,jdbcType=BIGINT} , #{link,jdbcType=VARCHAR} , #{tags,jdbcType=VARCHAR} , #{alias,jdbcType=VARCHAR} , #{isPush,jdbcType=INTEGER} , #{isRead,jdbcType=INTEGER} , #{content,jdbcType=VARCHAR} , #{findTime,jdbcType=TIMESTAMP} , #{reciveId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{isSuccess,jdbcType=INTEGER} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{platformType,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaMessageDO entity);
    /**
     * desc:更新表:TA_MESSAGE.<br/>
     * descSql =  UPDATE TA_MESSAGE SET LINK = #{link,jdbcType=VARCHAR} ,TAGS = #{tags,jdbcType=VARCHAR} ,ALIAS = #{alias,jdbcType=VARCHAR} ,IS_PUSH = #{isPush,jdbcType=INTEGER} ,IS_READ = #{isRead,jdbcType=INTEGER} ,CONTENT = #{content,jdbcType=VARCHAR} ,FIND_TIME = #{findTime,jdbcType=TIMESTAMP} ,RECIVE_ID = #{reciveId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,IS_SUCCESS = #{isSuccess,jdbcType=INTEGER} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,PLATFORM_TYPE = #{platformType,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaMessageDO entity);
    /**
     * desc:根据主键删除数据:TA_MESSAGE.<br/>
     * descSql =  DELETE FROM TA_MESSAGE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_MESSAGE.<br/>
     * descSql =  SELECT * FROM TA_MESSAGE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaMessageDO
     */
    TaMessageDO getByPrimary(Long id);
    /**
     * desc:根据推送目标获取未读数据:TA_MESSAGE.<br/>
     * descSql =  SELECT * FROM TA_MESSAGE WHERE PLATFORM_TYPE = #{platformType,jdbcType=VARCHAR} AND RECIVE_ID = #{reciveId,jdbcType=BIGINT} AND IS_READ = 0 ORDER BY CREATE_TIME DESC
     * @param reciveId reciveId
     * @param platformType platformType
     * @return List<TaMessageDO>
     */
    List<TaMessageDO> getByTargetUnread(@Param("reciveId")Long reciveId,@Param("platformType")String platformType);
    /**
     * desc:根据推送目标获取已读数据:TA_MESSAGE.<br/>
     * descSql =  SELECT * FROM TA_MESSAGE WHERE PLATFORM_TYPE = #{platformType,jdbcType=VARCHAR} AND RECIVE_ID = #{reciveId,jdbcType=BIGINT} AND IS_READ = 1 ORDER BY CREATE_TIME DESC
     * @param reciveId reciveId
     * @param platformType platformType
     * @return List<TaMessageDO>
     */
    List<TaMessageDO> getByTargetRead(@Param("reciveId")Long reciveId,@Param("platformType")String platformType);
    /**
     * desc:根据推送目标获取所有数据:TA_MESSAGE.<br/>
     * descSql =  SELECT * FROM TA_MESSAGE WHERE PLATFORM_TYPE = #{platformType,jdbcType=VARCHAR} AND RECIVE_ID = #{reciveId,jdbcType=BIGINT} ORDER BY CREATE_TIME DESC
     * @param reciveId reciveId
     * @param platformType platformType
     * @return List<TaMessageDO>
     */
    List<TaMessageDO> getByTarget(@Param("reciveId")Long reciveId,@Param("platformType")String platformType);
    /**
     * desc:讲消息标记为已读:TA_MESSAGE.<br/>
     * descSql =  UPDATE TA_MESSAGE SET IS_READ = #{isRead,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @param isRead isRead
     * @return TaMessageDO
     */
    TaMessageDO markedAsRead(@Param("id")Long id,@Param("isRead")Integer isRead);
    /**
     * desc:增加查询时间:TA_MESSAGE.<br/>
     * descSql =  UPDATE TA_MESSAGE SET FIND_TIME = #{findTime,jdbcType=TIMESTAMP} WHERE ID = #{id,jdbcType=BIGINT}
     * @param findTime findTime
     * @param id id
     * @return TaMessageDO
     */
    TaMessageDO addFindTime(@Param("findTime")Date findTime,@Param("id")Long id);
    /**
     * desc:根据推送目标获取已读数据:TA_MESSAGE.<br/>
     * descSql =  SELECT * FROM TA_MESSAGE WHERE AND TAGS = #{tags,jdbcType=VARCHAR}, ADN IS_PUSH = 1
     * @param tags tags
     * @return List<TaMessageDO>
     */
    List<TaMessageDO> getByTags(String tags);
}
