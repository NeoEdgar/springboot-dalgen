package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaGoodsDetailPagesDO;
import com.xl.dy.dal.mapper.TaGoodsDetailPagesDOMapper;

/**
* The Table TA_GOODS_DETAIL_PAGES.
* TA_GOODS_DETAIL_PAGES
*/
@Repository
public class TaGoodsDetailPagesDAO{

    @Autowired
    private TaGoodsDetailPagesDOMapper taGoodsDetailPagesDOMapper;

    /**
     * desc:插入表:TA_GOODS_DETAIL_PAGES.<br/>
     * descSql =  INSERT INTO TA_GOODS_DETAIL_PAGES( ID ,INX ,URL ,REMARK ,GOODS_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,DISPLAY_PLATFORM )VALUES( #{id,jdbcType=BIGINT} , #{inx,jdbcType=INTEGER} , #{url,jdbcType=VARCHAR} , #{remark,jdbcType=VARCHAR} , #{goodsId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{displayPlatform,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaGoodsDetailPagesDO entity){
        return taGoodsDetailPagesDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_GOODS_DETAIL_PAGES.<br/>
     * descSql =  UPDATE TA_GOODS_DETAIL_PAGES SET INX = #{inx,jdbcType=INTEGER} ,URL = #{url,jdbcType=VARCHAR} ,REMARK = #{remark,jdbcType=VARCHAR} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,DISPLAY_PLATFORM = #{displayPlatform,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaGoodsDetailPagesDO entity){
        return taGoodsDetailPagesDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_GOODS_DETAIL_PAGES.<br/>
     * descSql =  DELETE FROM TA_GOODS_DETAIL_PAGES WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taGoodsDetailPagesDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_GOODS_DETAIL_PAGES.<br/>
     * descSql =  SELECT * FROM TA_GOODS_DETAIL_PAGES WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaGoodsDetailPagesDO
     */
    public TaGoodsDetailPagesDO getByPrimary(Long id){
        return taGoodsDetailPagesDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据主键删除数据:TA_GOODS_DETAIL_PAGES.<br/>
     * descSql =  DELETE FROM TA_GOODS_DETAIL_PAGES WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param goodsId goodsId
     * @return Long
     */
    public Long deleteByGoodsId(Long goodsId){
        return taGoodsDetailPagesDOMapper.deleteByGoodsId(goodsId);
    }
    /**
     * desc:修改有效性.<br/>
     * descSql =  UPDATE TA_GOODS_DETAIL_PAGES SET VALID_STATUS = 0 WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param goodsId goodsId
     * @return Long
     */
    public Long updateValidStatus(Long goodsId){
        return taGoodsDetailPagesDOMapper.updateValidStatus(goodsId);
    }
    /**
     * desc:根据商品ID获取数据:TA_GOODS_DETAIL_PAGES.<br/>
     * descSql =  SELECT URL FROM TA_GOODS_DETAIL_PAGES WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param goodsId goodsId
     * @return String
     */
    public String getGoodsDetailByGoodsId(Long goodsId){
        return taGoodsDetailPagesDOMapper.getGoodsDetailByGoodsId(goodsId);
    }
}
