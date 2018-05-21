package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaShopGroupGoodsDO;
import java.util.List;
import com.xl.dy.dal.mapper.TaShopGroupGoodsDOMapper;

/**
* The Table TA_SHOP_GROUP_GOODS.
* TA_SHOP_GROUP_GOODS
*/
@Repository
public class TaShopGroupGoodsDAO{

    @Autowired
    private TaShopGroupGoodsDOMapper taShopGroupGoodsDOMapper;

    /**
     * desc:插入表:TA_SHOP_GROUP_GOODS.<br/>
     * descSql =  INSERT INTO TA_SHOP_GROUP_GOODS( ID ,REMARK ,SHOP_ID ,GOODS_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,SHOP_GOODS_GROUP_ID )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{goodsId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{shopGoodsGroupId,jdbcType=BIGINT} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaShopGroupGoodsDO entity){
        return taShopGroupGoodsDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_SHOP_GROUP_GOODS.<br/>
     * descSql =  UPDATE TA_SHOP_GROUP_GOODS SET REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,SHOP_GOODS_GROUP_ID = #{shopGoodsGroupId,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaShopGroupGoodsDO entity){
        return taShopGroupGoodsDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_SHOP_GROUP_GOODS.<br/>
     * descSql =  DELETE FROM TA_SHOP_GROUP_GOODS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taShopGroupGoodsDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_GROUP_GOODS.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GROUP_GOODS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopGroupGoodsDO
     */
    public TaShopGroupGoodsDO getByPrimary(Long id){
        return taShopGroupGoodsDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据主键删除数据:TA_SHOP_GROUP_GOODS.<br/>
     * descSql =  DELETE FROM TA_SHOP_GROUP_GOODS WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND SHOP_GOODS_GROUP_ID = #{shopGoodsGroupId,jdbcType=BIGINT} 
     * @param goodsId goodsId
     * @param shopGoodsGroupId shopGoodsGroupId
     * @return Long
     */
    public Long deleteShopGroupGoodsByGroupIdAndGoodsId(Long goodsId,Long shopGoodsGroupId){
        return taShopGroupGoodsDOMapper.deleteShopGroupGoodsByGroupIdAndGoodsId(goodsId, shopGoodsGroupId);
    }
    /**
     * desc:根据主键删除数据:TA_SHOP_GROUP_GOODS.<br/>
     * descSql =  DELETE FROM TA_SHOP_GROUP_GOODS WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} 
     * @param shopId shopId
     * @param goodsId goodsId
     * @return Long
     */
    public Long deleteShopGroupGoods(Long shopId,Long goodsId){
        return taShopGroupGoodsDOMapper.deleteShopGroupGoods(shopId, goodsId);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_GROUP_GOODS.<br/>
     * descSql =  SELECT SHOP_GOODS_GROUP_ID FROM TA_SHOP_GROUP_GOODS WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param shopId shopId
     * @param goodsId goodsId
     * @return List<Long>
     */
    public List<Long> getByShopIdAndGoodsId(Long shopId,Long goodsId){
        return taShopGroupGoodsDOMapper.getByShopIdAndGoodsId(shopId, goodsId);
    }
}
