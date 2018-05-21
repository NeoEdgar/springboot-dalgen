package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaShopGoodsPayModeDO;
import java.util.List;
import com.xl.dy.dal.mapper.TaShopGoodsPayModeDOMapper;

/**
* The Table TA_SHOP_GOODS_PAY_MODE.
* TA_SHOP_GOODS_PAY_MODE
*/
@Repository
public class TaShopGoodsPayModeDAO{

    @Autowired
    private TaShopGoodsPayModeDOMapper taShopGoodsPayModeDOMapper;

    /**
     * desc:插入表:TA_SHOP_GOODS_PAY_MODE.<br/>
     * descSql =  INSERT INTO TA_SHOP_GOODS_PAY_MODE( ID ,IS_DISC ,REMARK ,SHOP_ID ,GOODS_ID ,ALTER_EMPL ,ALTER_TIME ,PAY_MODE_ID ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,PAY_MODE_NAME ,VALID_STATUS ,HIPAY_CURRENCY )VALUES( #{id,jdbcType=BIGINT} , #{isDisc,jdbcType=INTEGER} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{goodsId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{payModeId,jdbcType=BIGINT} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{payModeName,jdbcType=VARCHAR} , #{validStatus,jdbcType=INTEGER} , #{hipayCurrency,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaShopGoodsPayModeDO entity){
        return taShopGoodsPayModeDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_SHOP_GOODS_PAY_MODE.<br/>
     * descSql =  UPDATE TA_SHOP_GOODS_PAY_MODE SET IS_DISC = #{isDisc,jdbcType=INTEGER} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,PAY_MODE_ID = #{payModeId,jdbcType=BIGINT} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,PAY_MODE_NAME = #{payModeName,jdbcType=VARCHAR} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,HIPAY_CURRENCY = #{hipayCurrency,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaShopGoodsPayModeDO entity){
        return taShopGoodsPayModeDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_SHOP_GOODS_PAY_MODE.<br/>
     * descSql =  DELETE FROM TA_SHOP_GOODS_PAY_MODE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taShopGoodsPayModeDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_GOODS_PAY_MODE.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS_PAY_MODE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopGoodsPayModeDO
     */
    public TaShopGoodsPayModeDO getByPrimary(Long id){
        return taShopGoodsPayModeDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据主键删除数据:TA_SHOP_GOODS_PAY_MODE.<br/>
     * descSql =  DELETE FROM TA_SHOP_GOODS_PAY_MODE WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} 
     * @param shopId shopId
     * @param goodsId goodsId
     * @return Long
     */
    public Long deleteShopGoodsPayMode(Long shopId,Long goodsId){
        return taShopGoodsPayModeDOMapper.deleteShopGoodsPayMode(shopId, goodsId);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_GOODS_PAY_MODE.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS_PAY_MODE WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param shopId shopId
     * @param goodsId goodsId
     * @return List<TaShopGoodsPayModeDO>
     */
    public List<TaShopGoodsPayModeDO> getByShopIdAndGoodsId(Long shopId,Long goodsId){
        return taShopGoodsPayModeDOMapper.getByShopIdAndGoodsId(shopId, goodsId);
    }
}
