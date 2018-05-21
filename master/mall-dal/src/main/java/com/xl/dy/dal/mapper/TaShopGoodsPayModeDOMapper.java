package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaShopGoodsPayModeDO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * ?��???�?对�??页�????,请�?��?�使?��?��???DAO�?
 * The Table TA_SHOP_GOODS_PAY_MODE.
 * TA_SHOP_GOODS_PAY_MODE
 */
public interface TaShopGoodsPayModeDOMapper{

    /**
     * desc:插入表:TA_SHOP_GOODS_PAY_MODE.<br/>
     * descSql =  INSERT INTO TA_SHOP_GOODS_PAY_MODE( ID ,IS_DISC ,REMARK ,SHOP_ID ,GOODS_ID ,ALTER_EMPL ,ALTER_TIME ,PAY_MODE_ID ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,PAY_MODE_NAME ,VALID_STATUS ,HIPAY_CURRENCY )VALUES( #{id,jdbcType=BIGINT} , #{isDisc,jdbcType=INTEGER} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{goodsId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{payModeId,jdbcType=BIGINT} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{payModeName,jdbcType=VARCHAR} , #{validStatus,jdbcType=INTEGER} , #{hipayCurrency,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaShopGoodsPayModeDO entity);
    /**
     * desc:更新表:TA_SHOP_GOODS_PAY_MODE.<br/>
     * descSql =  UPDATE TA_SHOP_GOODS_PAY_MODE SET IS_DISC = #{isDisc,jdbcType=INTEGER} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,PAY_MODE_ID = #{payModeId,jdbcType=BIGINT} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,PAY_MODE_NAME = #{payModeName,jdbcType=VARCHAR} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,HIPAY_CURRENCY = #{hipayCurrency,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaShopGoodsPayModeDO entity);
    /**
     * desc:根据主键删除数据:TA_SHOP_GOODS_PAY_MODE.<br/>
     * descSql =  DELETE FROM TA_SHOP_GOODS_PAY_MODE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_SHOP_GOODS_PAY_MODE.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS_PAY_MODE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopGoodsPayModeDO
     */
    TaShopGoodsPayModeDO getByPrimary(Long id);
    /**
     * desc:根据主键删除数据:TA_SHOP_GOODS_PAY_MODE.<br/>
     * descSql =  DELETE FROM TA_SHOP_GOODS_PAY_MODE WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} 
     * @param shopId shopId
     * @param goodsId goodsId
     * @return Long
     */
    Long deleteShopGoodsPayMode(@Param("shopId")Long shopId,@Param("goodsId")Long goodsId);
    /**
     * desc:根据主键获取数据:TA_SHOP_GOODS_PAY_MODE.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS_PAY_MODE WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param shopId shopId
     * @param goodsId goodsId
     * @return List<TaShopGoodsPayModeDO>
     */
    List<TaShopGoodsPayModeDO> getByShopIdAndGoodsId(@Param("shopId")Long shopId,@Param("goodsId")Long goodsId);
}
