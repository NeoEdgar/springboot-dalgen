package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TgMgCategoryDO;
import java.util.List;
import com.xl.dy.dal.paging.QueryMgCategoryListPage;
import java.lang.String;
import com.xl.dy.dal.paging.QueryCategoryListPage;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TG_MG_CATEGORY.
 * TG_MG_CATEGORY
 */
public interface TgMgCategoryDOMapper{

    /**
     * desc:插入表:TG_MG_CATEGORY.<br/>
     * descSql =  INSERT INTO TG_MG_CATEGORY( DP ,FR ,ID ,INX ,LEV ,PID ,CODE ,ICON ,NAME ,PARAM ,REMARK ,ALTER_EMPL ,ALTER_TIME ,POINT_RATE ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,MG_CATEGORY_STATUS )VALUES( #{dp,jdbcType=DECIMAL} , #{fr,jdbcType=VARCHAR} , #{id,jdbcType=BIGINT} , #{inx,jdbcType=INTEGER} , #{lev,jdbcType=INTEGER} , #{pid,jdbcType=BIGINT} , #{code,jdbcType=VARCHAR} , #{icon,jdbcType=VARCHAR} , #{name,jdbcType=VARCHAR} , #{param,jdbcType=VARCHAR} , #{remark,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{pointRate,jdbcType=DECIMAL} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{mgCategoryStatus,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TgMgCategoryDO entity);
    /**
     * desc:更新表:TG_MG_CATEGORY.<br/>
     * descSql =  UPDATE TG_MG_CATEGORY SET DP = #{dp,jdbcType=DECIMAL} ,FR = #{fr,jdbcType=VARCHAR} ,INX = #{inx,jdbcType=INTEGER} ,LEV = #{lev,jdbcType=INTEGER} ,PID = #{pid,jdbcType=BIGINT} ,CODE = #{code,jdbcType=VARCHAR} ,ICON = #{icon,jdbcType=VARCHAR} ,NAME = #{name,jdbcType=VARCHAR} ,PARAM = #{param,jdbcType=VARCHAR} ,REMARK = #{remark,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,POINT_RATE = #{pointRate,jdbcType=DECIMAL} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,MG_CATEGORY_STATUS = #{mgCategoryStatus,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TgMgCategoryDO entity);
    /**
     * desc:根据主键删除数据:TG_MG_CATEGORY.<br/>
     * descSql =  DELETE FROM TG_MG_CATEGORY WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TG_MG_CATEGORY.<br/>
     * descSql =  SELECT * FROM TG_MG_CATEGORY WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TgMgCategoryDO
     */
    TgMgCategoryDO getByPrimary(Long id);
    /**
     * desc:根据层级查询类目列表.<br/>
     * descSql =  SELECT * FROM TG_MG_CATEGORY WHERE LEV = #{lev,jdbcType=INTEGER}
     * @param lev lev
     * @return List<TgMgCategoryDO>
     */
    List<TgMgCategoryDO> findMgCategoryListByLev(Integer lev);
    /**
     * desc:根据父ID查询下级类目列表.<br/>
     * descSql =  SELECT * FROM TG_MG_CATEGORY WHERE PID = #{pid,jdbcType=BIGINT}
     * @param pid pid
     * @return List<TgMgCategoryDO>
     */
    List<TgMgCategoryDO> findLowerlevelMgCategoryListByPid(Long pid);
    /**
     * desc:查询各级分页列表.<br/>
     * descSql =  SELECT * FROM TG_MG_CATEGORY WHERE LEV = #{lev,jdbcType=INTEGER}
     * @param queryMgCategoryList queryMgCategoryList
     * @return int
     */
    int fingFirstLevMgCategoryPageCount(QueryMgCategoryListPage queryMgCategoryList);
    /**
     * desc:查询各级分页列表.<br/>
     * descSql =  SELECT * FROM TG_MG_CATEGORY WHERE LEV = #{lev,jdbcType=INTEGER}
     * @param queryMgCategoryList queryMgCategoryList
     * @return List<TgMgCategoryDO>
     */
    List<TgMgCategoryDO> fingFirstLevMgCategoryPageResult(QueryMgCategoryListPage queryMgCategoryList);
    /**
     * desc:更新表:TG_MG_CATEGORY.<br/>
     * descSql =  UPDATE TG_MG_CATEGORY DP = #{dp,jdbcType=DECIMAL}, FR = #{fr,jdbcType=VARCHAR}, INX = #{inx,jdbcType=INTEGER}, LEV = #{lev,jdbcType=INTEGER}, PID = #{pid,jdbcType=BIGINT}, CODE = #{code,jdbcType=VARCHAR}, ICON = #{icon,jdbcType=VARCHAR}, NAME = #{name,jdbcType=VARCHAR}, PARAM = #{param,jdbcType=VARCHAR}, REMARK = #{remark,jdbcType=VARCHAR}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, POINT_RATE = #{pointRate,jdbcType=DECIMAL}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, MG_CATEGORY_STATUS = #{mgCategoryStatus,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long updateByPrimarySelective(TgMgCategoryDO entity);
    /**
     * desc:根据主键获取数据:TG_MG_CATEGORY.<br/>
     * descSql =  SELECT * FROM TG_MG_CATEGORY WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TgMgCategoryDO
     */
    TgMgCategoryDO getByPrimarySelective(Long id);
    /**
     * desc:根据类目ID获取全路径Id:TG_MG_CATEGORY.<br/>
     * descSql =  SELECT FR FROM TG_MG_CATEGORY WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return String
     */
    String getFrIdByCatId(Long id);
    /**
     * desc:根据全路径ID获取全路径名称.<br/>
     * descSql =  SELECT GROUP_CONCAT(A.NAME SEPARATOR '/') FROM tg_mg_category A WHERE find_in_set(A.ID, #{frId,jdbcType=VARCHAR}) &gt; 0
     * @param frId frId
     * @return String
     */
    String getFrNameByFrId(String frId);
    /**
     * desc:根据全路径ID获取全路径名称.<br/>
     * descSql =  SELECT a.ID id, a.NAME name, b.DP dp FROM tg_mg_category a LEFT JOIN TA_CONTRACT_MC_CATEGORY b ON a.ID = b.MG_CATEGORY_ID WHERE a.PID = #{pid,jdbcType=BIGINT} AND b.CONTRACT_ID = #{contractId,jdbcType=BIGINT}
     * @param pid pid
     * @param contractId contractId
     * @return List<TgMgCategoryDO>
     */
    List<TgMgCategoryDO> findLastContractCategoryListByPid(@Param("pid")Long pid,@Param("contractId")Long contractId);
    /**
     * desc:根据路径ID获取路径名称.<br/>
     * descSql =  SELECT NAME name FROM tg_mg_category a WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return String
     */
    String findNameById(Long id);
    /**
     * desc:获取类目列表.<br/>
     * descSql =  SELECT * FROM TG_MG_CATEGORY WHERE NAME LIKE #{catStr,jdbcType=VARCHAR}
     * @param queryCategoryList queryCategoryList
     * @return int
     */
    int getCategoryPageCount(QueryCategoryListPage queryCategoryList);
    /**
     * desc:获取类目列表.<br/>
     * descSql =  SELECT * FROM TG_MG_CATEGORY WHERE NAME LIKE #{catStr,jdbcType=VARCHAR}
     * @param queryCategoryList queryCategoryList
     * @return List<TgMgCategoryDO>
     */
    List<TgMgCategoryDO> getCategoryPageResult(QueryCategoryListPage queryCategoryList);
}
