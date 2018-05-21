package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaShopGoodsDetailPagesDO;
import com.xl.dy.dal.mapper.TaShopGoodsDetailPagesDOMapper;

/**
* The Table TA_SHOP_GOODS_DETAIL_PAGES.
* TA_SHOP_GOODS_DETAIL_PAGES
*/
@Repository
public class TaShopGoodsDetailPagesDAO{

    @Autowired
    private TaShopGoodsDetailPagesDOMapper taShopGoodsDetailPagesDOMapper;

    /**
     * desc:插入表:TA_SHOP_GOODS_DETAIL_PAGES.<br/>
     * descSql =  INSERT INTO TA_SHOP_GOODS_DETAIL_PAGES( ID ,INX ,URL ,REMARK ,SHOP_ID ,GOODS_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,DISPLAY_PLATFORM )VALUES( #{id,jdbcType=BIGINT} , #{inx,jdbcType=INTEGER} , #{url,jdbcType=VARCHAR} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{goodsId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{displayPlatform,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaShopGoodsDetailPagesDO entity){
        return taShopGoodsDetailPagesDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_SHOP_GOODS_DETAIL_PAGES.<br/>
     * descSql =  UPDATE TA_SHOP_GOODS_DETAIL_PAGES SET INX = #{inx,jdbcType=INTEGER} ,URL = #{url,jdbcType=VARCHAR} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,DISPLAY_PLATFORM = #{displayPlatform,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaShopGoodsDetailPagesDO entity){
        return taShopGoodsDetailPagesDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_SHOP_GOODS_DETAIL_PAGES.<br/>
     * descSql =  DELETE FROM TA_SHOP_GOODS_DETAIL_PAGES WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taShopGoodsDetailPagesDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_GOODS_DETAIL_PAGES.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS_DETAIL_PAGES WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopGoodsDetailPagesDO
     */
    public TaShopGoodsDetailPagesDO getByPrimary(Long id){
        return taShopGoodsDetailPagesDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据店铺ID和商品ID删除数据:TA_SHOP_GOODS_DETAIL_PAGES.<br/>
     * descSql =  DELETE FROM TA_SHOP_GOODS_DETAIL_PAGES WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} 
     * @param shopId shopId
     * @param goodsId goodsId
     * @return Long
     */
    public Long deleteShopGoodsDetailPage(Long shopId,Long goodsId){
        return taShopGoodsDetailPagesDOMapper.deleteShopGoodsDetailPage(shopId, goodsId);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_GOODS_DETAIL_PAGES.<br/>
     * descSql =  SELECT URL FROM TA_SHOP_GOODS_DETAIL_PAGES WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param shopId shopId
     * @param goodsId goodsId
     * @return String
     */
    public String getByShopIdAndGoodsId(Long shopId,Long goodsId){
        return taShopGoodsDetailPagesDOMapper.getByShopIdAndGoodsId(shopId, goodsId);
    }
}
