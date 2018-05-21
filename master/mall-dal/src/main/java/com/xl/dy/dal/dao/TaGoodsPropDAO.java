package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaGoodsPropDO;
import java.util.List;
import java.util.Map;
import com.xl.dy.dal.mapper.TaGoodsPropDOMapper;

/**
* The Table TA_GOODS_PROP.
* TA_GOODS_PROP
*/
@Repository
public class TaGoodsPropDAO{

    @Autowired
    private TaGoodsPropDOMapper taGoodsPropDOMapper;

    /**
     * desc:插入表:TA_GOODS_PROP.<br/>
     * descSql =  INSERT INTO TA_GOODS_PROP( ID ,SKU_ID ,REMARK ,GOODS_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,GOODS_PROP_NAME ,GOODS_PROP_TYPE_ID ,GOODS_PROP_TYPE_NAME )VALUES( #{id,jdbcType=BIGINT} , #{skuId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{goodsId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{goodsPropName,jdbcType=VARCHAR} , #{goodsPropTypeId,jdbcType=BIGINT} , #{goodsPropTypeName,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaGoodsPropDO entity){
        return taGoodsPropDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_GOODS_PROP.<br/>
     * descSql =  UPDATE TA_GOODS_PROP SET SKU_ID = #{skuId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,GOODS_PROP_NAME = #{goodsPropName,jdbcType=VARCHAR} ,GOODS_PROP_TYPE_ID = #{goodsPropTypeId,jdbcType=BIGINT} ,GOODS_PROP_TYPE_NAME = #{goodsPropTypeName,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaGoodsPropDO entity){
        return taGoodsPropDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_GOODS_PROP.<br/>
     * descSql =  DELETE FROM TA_GOODS_PROP WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taGoodsPropDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键删除数据:TA_GOODS_PROP.<br/>
     * descSql =  DELETE FROM TA_GOODS_PROP WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param goodsId goodsId
     * @return Long
     */
    public Long deleteByGoodsId(Long goodsId){
        return taGoodsPropDOMapper.deleteByGoodsId(goodsId);
    }
    /**
     * desc:根据主键删除数据:TA_GOODS_PROP.<br/>
     * descSql =  DELETE FROM TA_GOODS_PROP WHERE SKU_ID = #{skuId,jdbcType=BIGINT}
     * @param skuId skuId
     * @return Long
     */
    public Long deleteBySkuId(Long skuId){
        return taGoodsPropDOMapper.deleteBySkuId(skuId);
    }
    /**
     * desc:根据主键获取数据:TA_GOODS_PROP.<br/>
     * descSql =  SELECT * FROM TA_GOODS_PROP WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaGoodsPropDO
     */
    public TaGoodsPropDO getByPrimary(Long id){
        return taGoodsPropDOMapper.getByPrimary(id);
    }
    /**
     * desc:修改有效性.<br/>
     * descSql =  UPDATE TA_GOODS_PROP SET VALID_STATUS = 0 WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param goodsId goodsId
     * @return Long
     */
    public Long updateValidStatus(Long goodsId){
        return taGoodsPropDOMapper.updateValidStatus(goodsId);
    }
    /**
     * desc:根据商品ID或者属性类型ID获取数据.<br/>
     * descSql =  SELECT * FROM TA_GOODS_PROP VALID_STATUS = 1 
     * @param goodsId goodsId
     * @param goodsPropTypeId goodsPropTypeId
     * @return List<TaGoodsPropDO>
     */
    public List<TaGoodsPropDO> getGoodsPropByGoodsIdOrPropTypeId(Long goodsId,Long goodsPropTypeId){
        return taGoodsPropDOMapper.getGoodsPropByGoodsIdOrPropTypeId(goodsId, goodsPropTypeId);
    }
    /**
     * desc:根据skuId获取属性信息:TA_GOODS_PROP.<br/>
     * descSql =  SELECT * FROM TA_GOODS_PROP WHERE SKU_ID = #{skuId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param skuId skuId
     * @return List<TaGoodsPropDO>
     */
    public List<TaGoodsPropDO> getGoodPropInfoBySkuId(Long skuId){
        return taGoodsPropDOMapper.getGoodPropInfoBySkuId(skuId);
    }
    /**
     * desc:根据skuId获取属性信息:TA_GOODS_PROP.<br/>
     * descSql =  SELECT GOODS_PROP_TYPE_NAME goodsPropTypeName, GOODS_PROP_NAME goodsPropName FROM ta_goods_prop WHERE SKU_ID = #{skuId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param skuId skuId
     * @return List<Map>
     */
    public List<Map> getGoodsInfoBySkuId(Long skuId){
        return taGoodsPropDOMapper.getGoodsInfoBySkuId(skuId);
    }
    /**
     * desc:根据skuId获取属性信息:TA_GOODS_PROP.<br/>
     * descSql =  SELECT GOODS_PROP_TYPE_NAME goodsPropTypeName FROM ta_goods_prop WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND VALID_STATUS = 1 GROUP BY GOODS_PROP_TYPE_NAME
     * @param goodsId goodsId
     * @return List<String>
     */
    public List<String> getGoodsInfoByGoodsId(Long goodsId){
        return taGoodsPropDOMapper.getGoodsInfoByGoodsId(goodsId);
    }
    /**
     * desc:更新表:TA_GOODS_PROP.<br/>
     * descSql =  UPDATE TA_GOODS_PROP GOODS_PROP_NAME = #{goodsPropName,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long updateSelective(TaGoodsPropDO entity){
        return taGoodsPropDOMapper.updateSelective(entity);
    }
}
