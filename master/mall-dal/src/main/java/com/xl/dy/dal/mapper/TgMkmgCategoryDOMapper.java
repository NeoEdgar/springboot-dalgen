package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TgMkmgCategoryDO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TG_MKMG_CATEGORY.
 * TG_MKMG_CATEGORY
 */
public interface TgMkmgCategoryDOMapper{

    /**
     * desc:插入表:TG_MKMG_CATEGORY.<br/>
     * descSql =  INSERT INTO TG_MKMG_CATEGORY( ID ,REMARK ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,MG_CATEGORY_ID ,MK_CATEGORY_ID )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{mgCategoryId,jdbcType=BIGINT} , #{mkCategoryId,jdbcType=BIGINT} )
     * @param entity entity
     * @return Long
     */
    Long insert(TgMkmgCategoryDO entity);
    /**
     * desc:更新表:TG_MKMG_CATEGORY.<br/>
     * descSql =  UPDATE TG_MKMG_CATEGORY SET REMARK = #{remark,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,MG_CATEGORY_ID = #{mgCategoryId,jdbcType=BIGINT} ,MK_CATEGORY_ID = #{mkCategoryId,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TgMkmgCategoryDO entity);
    /**
     * desc:根据主键删除数据:TG_MKMG_CATEGORY.<br/>
     * descSql =  DELETE FROM TG_MKMG_CATEGORY WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据经营类目删除数据:TG_MKMG_CATEGORY.<br/>
     * descSql =  DELETE FROM TG_MKMG_CATEGORY WHERE MK_CATEGORY_ID = #{mkCategoryId,jdbcType=BIGINT}
     * @param mkCategoryId mkCategoryId
     * @return Long
     */
    Long deleteByMkCategoryId(Long mkCategoryId);
    /**
     * desc:根据主键获取数据:TG_MKMG_CATEGORY.<br/>
     * descSql =  SELECT * FROM TG_MKMG_CATEGORY WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TgMkmgCategoryDO
     */
    TgMkmgCategoryDO getByPrimary(Long id);
    /**
     * desc:根据MkCategoryId获取数据:TG_MKMG_CATEGORY.<br/>
     * descSql =  SELECT * FROM TG_MKMG_CATEGORY WHERE MK_CATEGORY_ID = #{mkCategoryId,jdbcType=BIGINT}
     * @param mkCategoryId mkCategoryId
     * @return List<TgMkmgCategoryDO>
     */
    List<TgMkmgCategoryDO> getByMkCategoryId(Long mkCategoryId);
    /**
     * desc:根据MkCategoryId获取数据:TG_MKMG_CATEGORY.<br/>
     * descSql =  SELECT * FROM TG_MKMG_CATEGORY WHERE MG_CATEGORY_ID = #{mgCategoryId,jdbcType=BIGINT}
     * @param mgCategoryId mgCategoryId
     * @return TgMkmgCategoryDO
     */
    TgMkmgCategoryDO getByMgCategoryId(Long mgCategoryId);
    /**
     * desc:更新表:TG_MKMG_CATEGORY.<br/>
     * descSql =  UPDATE TG_MKMG_CATEGORY REMARK = #{remark,jdbcType=VARCHAR}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, MG_CATEGORY_ID = #{mgCategoryId,jdbcType=BIGINT}, MK_CATEGORY_ID = #{mkCategoryId,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long updateByPrimarySelective(TgMkmgCategoryDO entity);
    /**
     * desc:根据MgCategoryId获取数据:TG_MKMG_CATEGORY.<br/>
     * descSql =  SELECT MK_CATEGORY_ID FROM TG_MKMG_CATEGORY WHERE MG_CATEGORY_ID = #{mgCategoryId,jdbcType=BIGINT}
     * @param mgCategoryId mgCategoryId
     * @return Long
     */
    Long getMkIdByMgCategoryId(Long mgCategoryId);
}
