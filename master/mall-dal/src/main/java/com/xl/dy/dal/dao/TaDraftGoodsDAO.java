package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaDraftGoodsDO;
import com.xl.dy.dal.paging.QueryDraftGoodsListPage;
import com.xl.dy.dal.mapper.TaDraftGoodsDOMapper;

/**
* The Table TA_DRAFT_GOODS.
* TA_DRAFT_GOODS
*/
@Repository
public class TaDraftGoodsDAO{

    @Autowired
    private TaDraftGoodsDOMapper taDraftGoodsDOMapper;

    /**
     * desc:插入表:TA_DRAFT_GOODS.<br/>
     * descSql =  INSERT INTO TA_DRAFT_GOODS( ID ,REMARK ,GOODS_ID ,ALTER_EMPL ,ALTER_TIME ,GOODS_NAME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,GOODS_PHOTO ,DRAFT_UNIT_ID ,VALID_STATUS ,GOODS_CATEGORY ,DRAFT_GOODS_JSON )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{goodsId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{goodsName,jdbcType=VARCHAR} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{goodsPhoto,jdbcType=VARCHAR} , #{draftUnitId,jdbcType=BIGINT} , #{validStatus,jdbcType=INTEGER} , #{goodsCategory,jdbcType=VARCHAR} , #{draftGoodsJson,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaDraftGoodsDO entity){
        return taDraftGoodsDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_DRAFT_GOODS.<br/>
     * descSql =  UPDATE TA_DRAFT_GOODS SET REMARK = #{remark,jdbcType=VARCHAR} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,GOODS_NAME = #{goodsName,jdbcType=VARCHAR} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,GOODS_PHOTO = #{goodsPhoto,jdbcType=VARCHAR} ,DRAFT_UNIT_ID = #{draftUnitId,jdbcType=BIGINT} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,GOODS_CATEGORY = #{goodsCategory,jdbcType=VARCHAR} ,DRAFT_GOODS_JSON = #{draftGoodsJson,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaDraftGoodsDO entity){
        return taDraftGoodsDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_DRAFT_GOODS.<br/>
     * descSql =  DELETE FROM TA_DRAFT_GOODS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taDraftGoodsDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_DRAFT_GOODS.<br/>
     * descSql =  SELECT * FROM TA_DRAFT_GOODS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaDraftGoodsDO
     */
    public TaDraftGoodsDO getByPrimary(Long id){
        return taDraftGoodsDOMapper.getByPrimary(id);
    }
    /**
     * desc:更新表:TA_DRAFT_GOODS.<br/>
     * descSql =  UPDATE TA_DRAFT_GOODS REMARK = #{remark,jdbcType=VARCHAR}, GOODS_ID = #{goodsId,jdbcType=BIGINT}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, GOODS_NAME = #{goodsName,jdbcType=VARCHAR}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, GOODS_PHOTO = #{goodsPhoto,jdbcType=VARCHAR}, DRAFT_UNIT_ID = #{draftUnitId,jdbcType=BIGINT}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, GOODS_CATEGORY = #{goodsCategory,jdbcType=VARCHAR}, DRAFT_GOODS_JSON = #{draftGoodsJson,jdbcType=VARCHAR}, WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long updateSelective(TaDraftGoodsDO entity){
        return taDraftGoodsDOMapper.updateSelective(entity);
    }
    /**
     * desc:获取草稿箱列表.<br/>
     * descSql =  SELECT * FROM TA_DRAFT_GOODS DRAFT_UNIT_ID = #{draftUnitId,jdbcType=BIGINT} 
     * @param queryDraftGoodsList queryDraftGoodsList
     * @return QueryDraftGoodsListPage
     */
    public QueryDraftGoodsListPage getDraftGoodsList(QueryDraftGoodsListPage queryDraftGoodsList){
        int total = taDraftGoodsDOMapper.getDraftGoodsListCount(queryDraftGoodsList);
        if(total>0){
            queryDraftGoodsList.setDatas(taDraftGoodsDOMapper.getDraftGoodsListResult(queryDraftGoodsList));
        }
        queryDraftGoodsList.setTotal(total);
        return queryDraftGoodsList;
    }
}
