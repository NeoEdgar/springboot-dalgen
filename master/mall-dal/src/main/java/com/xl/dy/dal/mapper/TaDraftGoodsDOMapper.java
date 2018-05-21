package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaDraftGoodsDO;
import com.xl.dy.dal.paging.QueryDraftGoodsListPage;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_DRAFT_GOODS.
 * TA_DRAFT_GOODS
 */
public interface TaDraftGoodsDOMapper{

    /**
     * desc:插入表:TA_DRAFT_GOODS.<br/>
     * descSql =  INSERT INTO TA_DRAFT_GOODS( ID ,REMARK ,GOODS_ID ,ALTER_EMPL ,ALTER_TIME ,GOODS_NAME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,GOODS_PHOTO ,DRAFT_UNIT_ID ,VALID_STATUS ,GOODS_CATEGORY ,DRAFT_GOODS_JSON )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{goodsId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{goodsName,jdbcType=VARCHAR} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{goodsPhoto,jdbcType=VARCHAR} , #{draftUnitId,jdbcType=BIGINT} , #{validStatus,jdbcType=INTEGER} , #{goodsCategory,jdbcType=VARCHAR} , #{draftGoodsJson,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaDraftGoodsDO entity);
    /**
     * desc:更新表:TA_DRAFT_GOODS.<br/>
     * descSql =  UPDATE TA_DRAFT_GOODS SET REMARK = #{remark,jdbcType=VARCHAR} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,GOODS_NAME = #{goodsName,jdbcType=VARCHAR} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,GOODS_PHOTO = #{goodsPhoto,jdbcType=VARCHAR} ,DRAFT_UNIT_ID = #{draftUnitId,jdbcType=BIGINT} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,GOODS_CATEGORY = #{goodsCategory,jdbcType=VARCHAR} ,DRAFT_GOODS_JSON = #{draftGoodsJson,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaDraftGoodsDO entity);
    /**
     * desc:根据主键删除数据:TA_DRAFT_GOODS.<br/>
     * descSql =  DELETE FROM TA_DRAFT_GOODS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_DRAFT_GOODS.<br/>
     * descSql =  SELECT * FROM TA_DRAFT_GOODS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaDraftGoodsDO
     */
    TaDraftGoodsDO getByPrimary(Long id);
    /**
     * desc:更新表:TA_DRAFT_GOODS.<br/>
     * descSql =  UPDATE TA_DRAFT_GOODS REMARK = #{remark,jdbcType=VARCHAR}, GOODS_ID = #{goodsId,jdbcType=BIGINT}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, GOODS_NAME = #{goodsName,jdbcType=VARCHAR}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, GOODS_PHOTO = #{goodsPhoto,jdbcType=VARCHAR}, DRAFT_UNIT_ID = #{draftUnitId,jdbcType=BIGINT}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, GOODS_CATEGORY = #{goodsCategory,jdbcType=VARCHAR}, DRAFT_GOODS_JSON = #{draftGoodsJson,jdbcType=VARCHAR}, WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long updateSelective(TaDraftGoodsDO entity);
    /**
     * desc:获取草稿箱列表.<br/>
     * descSql =  SELECT * FROM TA_DRAFT_GOODS DRAFT_UNIT_ID = #{draftUnitId,jdbcType=BIGINT} 
     * @param queryDraftGoodsList queryDraftGoodsList
     * @return int
     */
    int getDraftGoodsListCount(QueryDraftGoodsListPage queryDraftGoodsList);
    /**
     * desc:获取草稿箱列表.<br/>
     * descSql =  SELECT * FROM TA_DRAFT_GOODS DRAFT_UNIT_ID = #{draftUnitId,jdbcType=BIGINT} 
     * @param queryDraftGoodsList queryDraftGoodsList
     * @return List<TaDraftGoodsDO>
     */
    List<TaDraftGoodsDO> getDraftGoodsListResult(QueryDraftGoodsListPage queryDraftGoodsList);
}
