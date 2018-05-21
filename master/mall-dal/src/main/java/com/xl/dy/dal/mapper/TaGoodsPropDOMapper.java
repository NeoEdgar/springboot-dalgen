package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaGoodsPropDO;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_GOODS_PROP.
 * TA_GOODS_PROP
 */
public interface TaGoodsPropDOMapper{

    /**
     * desc:插入表:TA_GOODS_PROP.<br/>
     * descSql =  INSERT INTO TA_GOODS_PROP( ID ,SKU_ID ,REMARK ,GOODS_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,GOODS_PROP_NAME ,GOODS_PROP_TYPE_ID ,GOODS_PROP_TYPE_NAME )VALUES( #{id,jdbcType=BIGINT} , #{skuId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{goodsId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{goodsPropName,jdbcType=VARCHAR} , #{goodsPropTypeId,jdbcType=BIGINT} , #{goodsPropTypeName,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaGoodsPropDO entity);
    /**
     * desc:更新表:TA_GOODS_PROP.<br/>
     * descSql =  UPDATE TA_GOODS_PROP SET SKU_ID = #{skuId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,GOODS_PROP_NAME = #{goodsPropName,jdbcType=VARCHAR} ,GOODS_PROP_TYPE_ID = #{goodsPropTypeId,jdbcType=BIGINT} ,GOODS_PROP_TYPE_NAME = #{goodsPropTypeName,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaGoodsPropDO entity);
    /**
     * desc:根据主键删除数据:TA_GOODS_PROP.<br/>
     * descSql =  DELETE FROM TA_GOODS_PROP WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键删除数据:TA_GOODS_PROP.<br/>
     * descSql =  DELETE FROM TA_GOODS_PROP WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param goodsId goodsId
     * @return Long
     */
    Long deleteByGoodsId(Long goodsId);
    /**
     * desc:根据主键删除数据:TA_GOODS_PROP.<br/>
     * descSql =  DELETE FROM TA_GOODS_PROP WHERE SKU_ID = #{skuId,jdbcType=BIGINT}
     * @param skuId skuId
     * @return Long
     */
    Long deleteBySkuId(Long skuId);
    /**
     * desc:根据主键获取数据:TA_GOODS_PROP.<br/>
     * descSql =  SELECT * FROM TA_GOODS_PROP WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaGoodsPropDO
     */
    TaGoodsPropDO getByPrimary(Long id);
    /**
     * desc:修改有效性.<br/>
     * descSql =  UPDATE TA_GOODS_PROP SET VALID_STATUS = 0 WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param goodsId goodsId
     * @return Long
     */
    Long updateValidStatus(Long goodsId);
    /**
     * desc:根据商品ID或者属性类型ID获取数据.<br/>
     * descSql =  SELECT * FROM TA_GOODS_PROP VALID_STATUS = 1 
     * @param goodsId goodsId
     * @param goodsPropTypeId goodsPropTypeId
     * @return List<TaGoodsPropDO>
     */
    List<TaGoodsPropDO> getGoodsPropByGoodsIdOrPropTypeId(@Param("goodsId")Long goodsId,@Param("goodsPropTypeId")Long goodsPropTypeId);
    /**
     * desc:根据skuId获取属性信息:TA_GOODS_PROP.<br/>
     * descSql =  SELECT * FROM TA_GOODS_PROP WHERE SKU_ID = #{skuId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param skuId skuId
     * @return List<TaGoodsPropDO>
     */
    List<TaGoodsPropDO> getGoodPropInfoBySkuId(Long skuId);
    /**
     * desc:根据skuId获取属性信息:TA_GOODS_PROP.<br/>
     * descSql =  SELECT GOODS_PROP_TYPE_NAME goodsPropTypeName, GOODS_PROP_NAME goodsPropName FROM ta_goods_prop WHERE SKU_ID = #{skuId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param skuId skuId
     * @return List<Map>
     */
    List<Map> getGoodsInfoBySkuId(Long skuId);
    /**
     * desc:根据skuId获取属性信息:TA_GOODS_PROP.<br/>
     * descSql =  SELECT GOODS_PROP_TYPE_NAME goodsPropTypeName FROM ta_goods_prop WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND VALID_STATUS = 1 GROUP BY GOODS_PROP_TYPE_NAME
     * @param goodsId goodsId
     * @return List<String>
     */
    List<String> getGoodsInfoByGoodsId(Long goodsId);
    /**
     * desc:更新表:TA_GOODS_PROP.<br/>
     * descSql =  UPDATE TA_GOODS_PROP GOODS_PROP_NAME = #{goodsPropName,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long updateSelective(TaGoodsPropDO entity);
}
