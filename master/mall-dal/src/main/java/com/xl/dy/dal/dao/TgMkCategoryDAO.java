package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TgMkCategoryDO;
import java.util.List;
import com.xl.dy.dal.paging.QueryMkCategoryListPage;
import com.xl.dy.dal.mapper.TgMkCategoryDOMapper;

/**
* The Table TG_MK_CATEGORY.
* TG_MK_CATEGORY
*/
@Repository
public class TgMkCategoryDAO{

    @Autowired
    private TgMkCategoryDOMapper tgMkCategoryDOMapper;

    /**
     * desc:插入表:TG_MK_CATEGORY.<br/>
     * descSql =  INSERT INTO TG_MK_CATEGORY( FR ,ID ,INX ,LEV ,PID ,CODE ,ICON ,NAME ,PARAM ,REMARK ,ALTER_EMPL ,ALTER_TIME ,IS_DISPLAY ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,MK_CATEGORY_STATUS )VALUES( #{fr,jdbcType=VARCHAR} , #{id,jdbcType=BIGINT} , #{inx,jdbcType=INTEGER} , #{lev,jdbcType=INTEGER} , #{pid,jdbcType=BIGINT} , #{code,jdbcType=VARCHAR} , #{icon,jdbcType=VARCHAR} , #{name,jdbcType=VARCHAR} , #{param,jdbcType=VARCHAR} , #{remark,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{isDisplay,jdbcType=INTEGER} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{mkCategoryStatus,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TgMkCategoryDO entity){
        return tgMkCategoryDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TG_MK_CATEGORY.<br/>
     * descSql =  UPDATE TG_MK_CATEGORY SET FR = #{fr,jdbcType=VARCHAR} ,INX = #{inx,jdbcType=INTEGER} ,LEV = #{lev,jdbcType=INTEGER} ,PID = #{pid,jdbcType=BIGINT} ,CODE = #{code,jdbcType=VARCHAR} ,ICON = #{icon,jdbcType=VARCHAR} ,NAME = #{name,jdbcType=VARCHAR} ,PARAM = #{param,jdbcType=VARCHAR} ,REMARK = #{remark,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,IS_DISPLAY = #{isDisplay,jdbcType=INTEGER} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,MK_CATEGORY_STATUS = #{mkCategoryStatus,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TgMkCategoryDO entity){
        return tgMkCategoryDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TG_MK_CATEGORY.<br/>
     * descSql =  DELETE FROM TG_MK_CATEGORY WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return tgMkCategoryDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TG_MK_CATEGORY.<br/>
     * descSql =  SELECT * FROM TG_MK_CATEGORY WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TgMkCategoryDO
     */
    public TgMkCategoryDO getByPrimary(Long id){
        return tgMkCategoryDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TG_MK_CATEGORY.<br/>
     * descSql =  SELECT * FROM TG_MK_CATEGORY WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TgMkCategoryDO
     */
    public TgMkCategoryDO getByPrimarySelective(Long id){
        return tgMkCategoryDOMapper.getByPrimarySelective(id);
    }
    /**
     * desc:根据层级查询类目列表.<br/>
     * descSql =  SELECT * FROM TG_MK_CATEGORY WHERE LEV = #{lev,jdbcType=INTEGER}
     * @param lev lev
     * @return List<TgMkCategoryDO>
     */
    public List<TgMkCategoryDO> findMkCategoryListByLev(Integer lev){
        return tgMkCategoryDOMapper.findMkCategoryListByLev(lev);
    }
    /**
     * desc:根据父ID查询下级类目列表.<br/>
     * descSql =  SELECT * FROM TG_MK_CATEGORY WHERE PID = #{pid,jdbcType=BIGINT}
     * @param pid pid
     * @return List<TgMkCategoryDO>
     */
    public List<TgMkCategoryDO> findLowerlevelMkCategoryListByPid(Long pid){
        return tgMkCategoryDOMapper.findLowerlevelMkCategoryListByPid(pid);
    }
    /**
     * desc:查询各级分页列表.<br/>
     * descSql =  SELECT * FROM TG_MK_CATEGORY WHERE LEV = #{lev,jdbcType=INTEGER}
     * @param queryMkCategoryList queryMkCategoryList
     * @return QueryMkCategoryListPage
     */
    public QueryMkCategoryListPage fingFirstLevMkCategoryPage(QueryMkCategoryListPage queryMkCategoryList){
        int total = tgMkCategoryDOMapper.fingFirstLevMkCategoryPageCount(queryMkCategoryList);
        if(total>0){
            queryMkCategoryList.setDatas(tgMkCategoryDOMapper.fingFirstLevMkCategoryPageResult(queryMkCategoryList));
        }
        queryMkCategoryList.setTotal(total);
        return queryMkCategoryList;
    }
    /**
     * desc:更新表:TG_MK_CATEGORY.<br/>
     * descSql =  UPDATE TG_MK_CATEGORY FR = #{fr,jdbcType=VARCHAR}, INX = #{inx,jdbcType=INTEGER}, LEV = #{lev,jdbcType=INTEGER}, PID = #{pid,jdbcType=BIGINT}, CODE = #{code,jdbcType=VARCHAR}, ICON = #{icon,jdbcType=VARCHAR}, NAME = #{name,jdbcType=VARCHAR}, PARAM = #{param,jdbcType=VARCHAR}, REMARK = #{remark,jdbcType=VARCHAR}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, IS_DISPLAY = #{isDisplay,jdbcType=INTEGER}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, MK_CATEGORY_STATUS = #{mkCategoryStatus,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long updateByPrimarySelective(TgMkCategoryDO entity){
        return tgMkCategoryDOMapper.updateByPrimarySelective(entity);
    }
    /**
     * desc:根据全路径ID获取全路径名称.<br/>
     * descSql =  SELECT GROUP_CONCAT(A.NAME SEPARATOR '/') FROM TG_MK_CATEGORY A WHERE find_in_set(A.ID, #{frId,jdbcType=VARCHAR}) &gt; 0
     * @param frId frId
     * @return String
     */
    public String getFrNameByFrId(String frId){
        return tgMkCategoryDOMapper.getFrNameByFrId(frId);
    }
}
