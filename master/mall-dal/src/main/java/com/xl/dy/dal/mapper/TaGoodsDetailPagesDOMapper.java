package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaGoodsDetailPagesDO;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_GOODS_DETAIL_PAGES.
 * TA_GOODS_DETAIL_PAGES
 */
public interface TaGoodsDetailPagesDOMapper{

    /**
     * desc:插入表:TA_GOODS_DETAIL_PAGES.<br/>
     * descSql =  INSERT INTO TA_GOODS_DETAIL_PAGES( ID ,INX ,URL ,REMARK ,GOODS_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,DISPLAY_PLATFORM )VALUES( #{id,jdbcType=BIGINT} , #{inx,jdbcType=INTEGER} , #{url,jdbcType=VARCHAR} , #{remark,jdbcType=VARCHAR} , #{goodsId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{displayPlatform,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaGoodsDetailPagesDO entity);
    /**
     * desc:更新表:TA_GOODS_DETAIL_PAGES.<br/>
     * descSql =  UPDATE TA_GOODS_DETAIL_PAGES SET INX = #{inx,jdbcType=INTEGER} ,URL = #{url,jdbcType=VARCHAR} ,REMARK = #{remark,jdbcType=VARCHAR} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,DISPLAY_PLATFORM = #{displayPlatform,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaGoodsDetailPagesDO entity);
    /**
     * desc:根据主键删除数据:TA_GOODS_DETAIL_PAGES.<br/>
     * descSql =  DELETE FROM TA_GOODS_DETAIL_PAGES WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_GOODS_DETAIL_PAGES.<br/>
     * descSql =  SELECT * FROM TA_GOODS_DETAIL_PAGES WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaGoodsDetailPagesDO
     */
    TaGoodsDetailPagesDO getByPrimary(Long id);
    /**
     * desc:根据主键删除数据:TA_GOODS_DETAIL_PAGES.<br/>
     * descSql =  DELETE FROM TA_GOODS_DETAIL_PAGES WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param goodsId goodsId
     * @return Long
     */
    Long deleteByGoodsId(Long goodsId);
    /**
     * desc:修改有效性.<br/>
     * descSql =  UPDATE TA_GOODS_DETAIL_PAGES SET VALID_STATUS = 0 WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param goodsId goodsId
     * @return Long
     */
    Long updateValidStatus(Long goodsId);
    /**
     * desc:根据商品ID获取数据:TA_GOODS_DETAIL_PAGES.<br/>
     * descSql =  SELECT URL FROM TA_GOODS_DETAIL_PAGES WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param goodsId goodsId
     * @return String
     */
    String getGoodsDetailByGoodsId(Long goodsId);
}
