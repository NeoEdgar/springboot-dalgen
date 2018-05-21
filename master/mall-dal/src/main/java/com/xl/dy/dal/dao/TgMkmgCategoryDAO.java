package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TgMkmgCategoryDO;
import java.util.List;
import com.xl.dy.dal.mapper.TgMkmgCategoryDOMapper;

/**
* The Table TG_MKMG_CATEGORY.
* TG_MKMG_CATEGORY
*/
@Repository
public class TgMkmgCategoryDAO{

    @Autowired
    private TgMkmgCategoryDOMapper tgMkmgCategoryDOMapper;

    /**
     * desc:插入表:TG_MKMG_CATEGORY.<br/>
     * descSql =  INSERT INTO TG_MKMG_CATEGORY( ID ,REMARK ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,MG_CATEGORY_ID ,MK_CATEGORY_ID )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{mgCategoryId,jdbcType=BIGINT} , #{mkCategoryId,jdbcType=BIGINT} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TgMkmgCategoryDO entity){
        return tgMkmgCategoryDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TG_MKMG_CATEGORY.<br/>
     * descSql =  UPDATE TG_MKMG_CATEGORY SET REMARK = #{remark,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,MG_CATEGORY_ID = #{mgCategoryId,jdbcType=BIGINT} ,MK_CATEGORY_ID = #{mkCategoryId,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TgMkmgCategoryDO entity){
        return tgMkmgCategoryDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TG_MKMG_CATEGORY.<br/>
     * descSql =  DELETE FROM TG_MKMG_CATEGORY WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return tgMkmgCategoryDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据经营类目删除数据:TG_MKMG_CATEGORY.<br/>
     * descSql =  DELETE FROM TG_MKMG_CATEGORY WHERE MK_CATEGORY_ID = #{mkCategoryId,jdbcType=BIGINT}
     * @param mkCategoryId mkCategoryId
     * @return Long
     */
    public Long deleteByMkCategoryId(Long mkCategoryId){
        return tgMkmgCategoryDOMapper.deleteByMkCategoryId(mkCategoryId);
    }
    /**
     * desc:根据主键获取数据:TG_MKMG_CATEGORY.<br/>
     * descSql =  SELECT * FROM TG_MKMG_CATEGORY WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TgMkmgCategoryDO
     */
    public TgMkmgCategoryDO getByPrimary(Long id){
        return tgMkmgCategoryDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据MkCategoryId获取数据:TG_MKMG_CATEGORY.<br/>
     * descSql =  SELECT * FROM TG_MKMG_CATEGORY WHERE MK_CATEGORY_ID = #{mkCategoryId,jdbcType=BIGINT}
     * @param mkCategoryId mkCategoryId
     * @return List<TgMkmgCategoryDO>
     */
    public List<TgMkmgCategoryDO> getByMkCategoryId(Long mkCategoryId){
        return tgMkmgCategoryDOMapper.getByMkCategoryId(mkCategoryId);
    }
    /**
     * desc:根据MkCategoryId获取数据:TG_MKMG_CATEGORY.<br/>
     * descSql =  SELECT * FROM TG_MKMG_CATEGORY WHERE MG_CATEGORY_ID = #{mgCategoryId,jdbcType=BIGINT}
     * @param mgCategoryId mgCategoryId
     * @return TgMkmgCategoryDO
     */
    public TgMkmgCategoryDO getByMgCategoryId(Long mgCategoryId){
        return tgMkmgCategoryDOMapper.getByMgCategoryId(mgCategoryId);
    }
    /**
     * desc:更新表:TG_MKMG_CATEGORY.<br/>
     * descSql =  UPDATE TG_MKMG_CATEGORY REMARK = #{remark,jdbcType=VARCHAR}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, MG_CATEGORY_ID = #{mgCategoryId,jdbcType=BIGINT}, MK_CATEGORY_ID = #{mkCategoryId,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long updateByPrimarySelective(TgMkmgCategoryDO entity){
        return tgMkmgCategoryDOMapper.updateByPrimarySelective(entity);
    }
    /**
     * desc:根据MgCategoryId获取数据:TG_MKMG_CATEGORY.<br/>
     * descSql =  SELECT MK_CATEGORY_ID FROM TG_MKMG_CATEGORY WHERE MG_CATEGORY_ID = #{mgCategoryId,jdbcType=BIGINT}
     * @param mgCategoryId mgCategoryId
     * @return Long
     */
    public Long getMkIdByMgCategoryId(Long mgCategoryId){
        return tgMkmgCategoryDOMapper.getMkIdByMgCategoryId(mgCategoryId);
    }
}
