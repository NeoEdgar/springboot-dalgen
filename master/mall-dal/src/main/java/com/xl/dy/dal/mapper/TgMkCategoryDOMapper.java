package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TgMkCategoryDO;
import java.util.List;
import com.xl.dy.dal.paging.QueryMkCategoryListPage;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TG_MK_CATEGORY.
 * TG_MK_CATEGORY
 */
public interface TgMkCategoryDOMapper{

    /**
     * desc:插入表:TG_MK_CATEGORY.<br/>
     * descSql =  INSERT INTO TG_MK_CATEGORY( FR ,ID ,INX ,LEV ,PID ,CODE ,ICON ,NAME ,PARAM ,REMARK ,ALTER_EMPL ,ALTER_TIME ,IS_DISPLAY ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,MK_CATEGORY_STATUS )VALUES( #{fr,jdbcType=VARCHAR} , #{id,jdbcType=BIGINT} , #{inx,jdbcType=INTEGER} , #{lev,jdbcType=INTEGER} , #{pid,jdbcType=BIGINT} , #{code,jdbcType=VARCHAR} , #{icon,jdbcType=VARCHAR} , #{name,jdbcType=VARCHAR} , #{param,jdbcType=VARCHAR} , #{remark,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{isDisplay,jdbcType=INTEGER} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{mkCategoryStatus,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TgMkCategoryDO entity);
    /**
     * desc:更新表:TG_MK_CATEGORY.<br/>
     * descSql =  UPDATE TG_MK_CATEGORY SET FR = #{fr,jdbcType=VARCHAR} ,INX = #{inx,jdbcType=INTEGER} ,LEV = #{lev,jdbcType=INTEGER} ,PID = #{pid,jdbcType=BIGINT} ,CODE = #{code,jdbcType=VARCHAR} ,ICON = #{icon,jdbcType=VARCHAR} ,NAME = #{name,jdbcType=VARCHAR} ,PARAM = #{param,jdbcType=VARCHAR} ,REMARK = #{remark,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,IS_DISPLAY = #{isDisplay,jdbcType=INTEGER} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,MK_CATEGORY_STATUS = #{mkCategoryStatus,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TgMkCategoryDO entity);
    /**
     * desc:根据主键删除数据:TG_MK_CATEGORY.<br/>
     * descSql =  DELETE FROM TG_MK_CATEGORY WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TG_MK_CATEGORY.<br/>
     * descSql =  SELECT * FROM TG_MK_CATEGORY WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TgMkCategoryDO
     */
    TgMkCategoryDO getByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TG_MK_CATEGORY.<br/>
     * descSql =  SELECT * FROM TG_MK_CATEGORY WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TgMkCategoryDO
     */
    TgMkCategoryDO getByPrimarySelective(Long id);
    /**
     * desc:根据层级查询类目列表.<br/>
     * descSql =  SELECT * FROM TG_MK_CATEGORY WHERE LEV = #{lev,jdbcType=INTEGER}
     * @param lev lev
     * @return List<TgMkCategoryDO>
     */
    List<TgMkCategoryDO> findMkCategoryListByLev(Integer lev);
    /**
     * desc:根据父ID查询下级类目列表.<br/>
     * descSql =  SELECT * FROM TG_MK_CATEGORY WHERE PID = #{pid,jdbcType=BIGINT}
     * @param pid pid
     * @return List<TgMkCategoryDO>
     */
    List<TgMkCategoryDO> findLowerlevelMkCategoryListByPid(Long pid);
    /**
     * desc:查询各级分页列表.<br/>
     * descSql =  SELECT * FROM TG_MK_CATEGORY WHERE LEV = #{lev,jdbcType=INTEGER}
     * @param queryMkCategoryList queryMkCategoryList
     * @return int
     */
    int fingFirstLevMkCategoryPageCount(QueryMkCategoryListPage queryMkCategoryList);
    /**
     * desc:查询各级分页列表.<br/>
     * descSql =  SELECT * FROM TG_MK_CATEGORY WHERE LEV = #{lev,jdbcType=INTEGER}
     * @param queryMkCategoryList queryMkCategoryList
     * @return List<TgMkCategoryDO>
     */
    List<TgMkCategoryDO> fingFirstLevMkCategoryPageResult(QueryMkCategoryListPage queryMkCategoryList);
    /**
     * desc:更新表:TG_MK_CATEGORY.<br/>
     * descSql =  UPDATE TG_MK_CATEGORY FR = #{fr,jdbcType=VARCHAR}, INX = #{inx,jdbcType=INTEGER}, LEV = #{lev,jdbcType=INTEGER}, PID = #{pid,jdbcType=BIGINT}, CODE = #{code,jdbcType=VARCHAR}, ICON = #{icon,jdbcType=VARCHAR}, NAME = #{name,jdbcType=VARCHAR}, PARAM = #{param,jdbcType=VARCHAR}, REMARK = #{remark,jdbcType=VARCHAR}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, IS_DISPLAY = #{isDisplay,jdbcType=INTEGER}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, MK_CATEGORY_STATUS = #{mkCategoryStatus,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long updateByPrimarySelective(TgMkCategoryDO entity);
    /**
     * desc:根据全路径ID获取全路径名称.<br/>
     * descSql =  SELECT GROUP_CONCAT(A.NAME SEPARATOR '/') FROM TG_MK_CATEGORY A WHERE find_in_set(A.ID, #{frId,jdbcType=VARCHAR}) &gt; 0
     * @param frId frId
     * @return String
     */
    String getFrNameByFrId(String frId);
}
