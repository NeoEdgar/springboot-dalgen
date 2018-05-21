package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaShopGoodsDetailPagesDO;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_SHOP_GOODS_DETAIL_PAGES.
 * TA_SHOP_GOODS_DETAIL_PAGES
 */
public interface TaShopGoodsDetailPagesDOMapper{

    /**
     * desc:插入表:TA_SHOP_GOODS_DETAIL_PAGES.<br/>
     * descSql =  INSERT INTO TA_SHOP_GOODS_DETAIL_PAGES( ID ,INX ,URL ,REMARK ,SHOP_ID ,GOODS_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,DISPLAY_PLATFORM )VALUES( #{id,jdbcType=BIGINT} , #{inx,jdbcType=INTEGER} , #{url,jdbcType=VARCHAR} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{goodsId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{displayPlatform,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaShopGoodsDetailPagesDO entity);
    /**
     * desc:更新表:TA_SHOP_GOODS_DETAIL_PAGES.<br/>
     * descSql =  UPDATE TA_SHOP_GOODS_DETAIL_PAGES SET INX = #{inx,jdbcType=INTEGER} ,URL = #{url,jdbcType=VARCHAR} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,DISPLAY_PLATFORM = #{displayPlatform,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaShopGoodsDetailPagesDO entity);
    /**
     * desc:根据主键删除数据:TA_SHOP_GOODS_DETAIL_PAGES.<br/>
     * descSql =  DELETE FROM TA_SHOP_GOODS_DETAIL_PAGES WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_SHOP_GOODS_DETAIL_PAGES.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS_DETAIL_PAGES WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopGoodsDetailPagesDO
     */
    TaShopGoodsDetailPagesDO getByPrimary(Long id);
    /**
     * desc:根据店铺ID和商品ID删除数据:TA_SHOP_GOODS_DETAIL_PAGES.<br/>
     * descSql =  DELETE FROM TA_SHOP_GOODS_DETAIL_PAGES WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} 
     * @param shopId shopId
     * @param goodsId goodsId
     * @return Long
     */
    Long deleteShopGoodsDetailPage(@Param("shopId")Long shopId,@Param("goodsId")Long goodsId);
    /**
     * desc:根据主键获取数据:TA_SHOP_GOODS_DETAIL_PAGES.<br/>
     * descSql =  SELECT URL FROM TA_SHOP_GOODS_DETAIL_PAGES WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param shopId shopId
     * @param goodsId goodsId
     * @return String
     */
    String getByShopIdAndGoodsId(@Param("shopId")Long shopId,@Param("goodsId")Long goodsId);
}
