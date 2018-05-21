package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TgMgCategoryDO;
import java.util.List;
import com.xl.dy.dal.paging.QueryMgCategoryListPage;
import java.lang.String;
import com.xl.dy.dal.paging.QueryCategoryListPage;
import com.xl.dy.dal.mapper.TgMgCategoryDOMapper;

/**
* The Table TG_MG_CATEGORY.
* TG_MG_CATEGORY
*/
@Repository
public class TgMgCategoryDAO{

    @Autowired
    private TgMgCategoryDOMapper tgMgCategoryDOMapper;

    /**
     * desc:插入表:TG_MG_CATEGORY.<br/>
     * descSql =  INSERT INTO TG_MG_CATEGORY( DP ,FR ,ID ,INX ,LEV ,PID ,CODE ,ICON ,NAME ,PARAM ,REMARK ,ALTER_EMPL ,ALTER_TIME ,POINT_RATE ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,MG_CATEGORY_STATUS )VALUES( #{dp,jdbcType=DECIMAL} , #{fr,jdbcType=VARCHAR} , #{id,jdbcType=BIGINT} , #{inx,jdbcType=INTEGER} , #{lev,jdbcType=INTEGER} , #{pid,jdbcType=BIGINT} , #{code,jdbcType=VARCHAR} , #{icon,jdbcType=VARCHAR} , #{name,jdbcType=VARCHAR} , #{param,jdbcType=VARCHAR} , #{remark,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{pointRate,jdbcType=DECIMAL} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{mgCategoryStatus,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TgMgCategoryDO entity){
        return tgMgCategoryDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TG_MG_CATEGORY.<br/>
     * descSql =  UPDATE TG_MG_CATEGORY SET DP = #{dp,jdbcType=DECIMAL} ,FR = #{fr,jdbcType=VARCHAR} ,INX = #{inx,jdbcType=INTEGER} ,LEV = #{lev,jdbcType=INTEGER} ,PID = #{pid,jdbcType=BIGINT} ,CODE = #{code,jdbcType=VARCHAR} ,ICON = #{icon,jdbcType=VARCHAR} ,NAME = #{name,jdbcType=VARCHAR} ,PARAM = #{param,jdbcType=VARCHAR} ,REMARK = #{remark,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,POINT_RATE = #{pointRate,jdbcType=DECIMAL} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,MG_CATEGORY_STATUS = #{mgCategoryStatus,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TgMgCategoryDO entity){
        return tgMgCategoryDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TG_MG_CATEGORY.<br/>
     * descSql =  DELETE FROM TG_MG_CATEGORY WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return tgMgCategoryDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TG_MG_CATEGORY.<br/>
     * descSql =  SELECT * FROM TG_MG_CATEGORY WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TgMgCategoryDO
     */
    public TgMgCategoryDO getByPrimary(Long id){
        return tgMgCategoryDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据层级查询类目列表.<br/>
     * descSql =  SELECT * FROM TG_MG_CATEGORY WHERE LEV = #{lev,jdbcType=INTEGER}
     * @param lev lev
     * @return List<TgMgCategoryDO>
     */
    public List<TgMgCategoryDO> findMgCategoryListByLev(Integer lev){
        return tgMgCategoryDOMapper.findMgCategoryListByLev(lev);
    }
    /**
     * desc:根据父ID查询下级类目列表.<br/>
     * descSql =  SELECT * FROM TG_MG_CATEGORY WHERE PID = #{pid,jdbcType=BIGINT}
     * @param pid pid
     * @return List<TgMgCategoryDO>
     */
    public List<TgMgCategoryDO> findLowerlevelMgCategoryListByPid(Long pid){
        return tgMgCategoryDOMapper.findLowerlevelMgCategoryListByPid(pid);
    }
    /**
     * desc:查询各级分页列表.<br/>
     * descSql =  SELECT * FROM TG_MG_CATEGORY WHERE LEV = #{lev,jdbcType=INTEGER}
     * @param queryMgCategoryList queryMgCategoryList
     * @return QueryMgCategoryListPage
     */
    public QueryMgCategoryListPage fingFirstLevMgCategoryPage(QueryMgCategoryListPage queryMgCategoryList){
        int total = tgMgCategoryDOMapper.fingFirstLevMgCategoryPageCount(queryMgCategoryList);
        if(total>0){
            queryMgCategoryList.setDatas(tgMgCategoryDOMapper.fingFirstLevMgCategoryPageResult(queryMgCategoryList));
        }
        queryMgCategoryList.setTotal(total);
        return queryMgCategoryList;
    }
    /**
     * desc:更新表:TG_MG_CATEGORY.<br/>
     * descSql =  UPDATE TG_MG_CATEGORY DP = #{dp,jdbcType=DECIMAL}, FR = #{fr,jdbcType=VARCHAR}, INX = #{inx,jdbcType=INTEGER}, LEV = #{lev,jdbcType=INTEGER}, PID = #{pid,jdbcType=BIGINT}, CODE = #{code,jdbcType=VARCHAR}, ICON = #{icon,jdbcType=VARCHAR}, NAME = #{name,jdbcType=VARCHAR}, PARAM = #{param,jdbcType=VARCHAR}, REMARK = #{remark,jdbcType=VARCHAR}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, POINT_RATE = #{pointRate,jdbcType=DECIMAL}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, MG_CATEGORY_STATUS = #{mgCategoryStatus,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long updateByPrimarySelective(TgMgCategoryDO entity){
        return tgMgCategoryDOMapper.updateByPrimarySelective(entity);
    }
    /**
     * desc:根据主键获取数据:TG_MG_CATEGORY.<br/>
     * descSql =  SELECT * FROM TG_MG_CATEGORY WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TgMgCategoryDO
     */
    public TgMgCategoryDO getByPrimarySelective(Long id){
        return tgMgCategoryDOMapper.getByPrimarySelective(id);
    }
    /**
     * desc:根据类目ID获取全路径Id:TG_MG_CATEGORY.<br/>
     * descSql =  SELECT FR FROM TG_MG_CATEGORY WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return String
     */
    public String getFrIdByCatId(Long id){
        return tgMgCategoryDOMapper.getFrIdByCatId(id);
    }
    /**
     * desc:根据全路径ID获取全路径名称.<br/>
     * descSql =  SELECT GROUP_CONCAT(A.NAME SEPARATOR '/') FROM tg_mg_category A WHERE find_in_set(A.ID, #{frId,jdbcType=VARCHAR}) &gt; 0
     * @param frId frId
     * @return String
     */
    public String getFrNameByFrId(String frId){
        return tgMgCategoryDOMapper.getFrNameByFrId(frId);
    }
    /**
     * desc:根据全路径ID获取全路径名称.<br/>
     * descSql =  SELECT a.ID id, a.NAME name, b.DP dp FROM tg_mg_category a LEFT JOIN TA_CONTRACT_MC_CATEGORY b ON a.ID = b.MG_CATEGORY_ID WHERE a.PID = #{pid,jdbcType=BIGINT} AND b.CONTRACT_ID = #{contractId,jdbcType=BIGINT}
     * @param pid pid
     * @param contractId contractId
     * @return List<TgMgCategoryDO>
     */
    public List<TgMgCategoryDO> findLastContractCategoryListByPid(Long pid,Long contractId){
        return tgMgCategoryDOMapper.findLastContractCategoryListByPid(pid, contractId);
    }
    /**
     * desc:根据路径ID获取路径名称.<br/>
     * descSql =  SELECT NAME name FROM tg_mg_category a WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return String
     */
    public String findNameById(Long id){
        return tgMgCategoryDOMapper.findNameById(id);
    }
    /**
     * desc:获取类目列表.<br/>
     * descSql =  SELECT * FROM TG_MG_CATEGORY WHERE NAME LIKE #{catStr,jdbcType=VARCHAR}
     * @param queryCategoryList queryCategoryList
     * @return QueryCategoryListPage
     */
    public QueryCategoryListPage getCategoryPage(QueryCategoryListPage queryCategoryList){
        int total = tgMgCategoryDOMapper.getCategoryPageCount(queryCategoryList);
        if(total>0){
            queryCategoryList.setDatas(tgMgCategoryDOMapper.getCategoryPageResult(queryCategoryList));
        }
        queryCategoryList.setTotal(total);
        return queryCategoryList;
    }
}
