package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaExtraGoodsDO;
import com.xl.dy.dal.mapper.TaExtraGoodsDOMapper;

/**
* The Table TA_EXTRA_GOODS.
* TA_EXTRA_GOODS
*/
@Repository
public class TaExtraGoodsDAO{

    @Autowired
    private TaExtraGoodsDOMapper taExtraGoodsDOMapper;

    /**
     * desc:插入表:TA_EXTRA_GOODS.<br/>
     * descSql =  INSERT INTO TA_EXTRA_GOODS( ID ,REMARK ,GOODS_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,GOODS_WEIGHT ,VALID_STATUS ,VALID_END_DATE ,IS_FOREVER_VALID ,VALID_START_DATE ,PACK_GOODS_WEIGHT )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{goodsId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{goodsWeight,jdbcType=DECIMAL} , #{validStatus,jdbcType=INTEGER} , #{validEndDate,jdbcType=TIMESTAMP} , #{isForeverValid,jdbcType=INTEGER} , #{validStartDate,jdbcType=TIMESTAMP} , #{packGoodsWeight,jdbcType=DECIMAL} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaExtraGoodsDO entity){
        return taExtraGoodsDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_EXTRA_GOODS.<br/>
     * descSql =  UPDATE TA_EXTRA_GOODS SET REMARK = #{remark,jdbcType=VARCHAR} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,GOODS_WEIGHT = #{goodsWeight,jdbcType=DECIMAL} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,VALID_END_DATE = #{validEndDate,jdbcType=TIMESTAMP} ,IS_FOREVER_VALID = #{isForeverValid,jdbcType=INTEGER} ,VALID_START_DATE = #{validStartDate,jdbcType=TIMESTAMP} ,PACK_GOODS_WEIGHT = #{packGoodsWeight,jdbcType=DECIMAL} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaExtraGoodsDO entity){
        return taExtraGoodsDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_EXTRA_GOODS.<br/>
     * descSql =  DELETE FROM TA_EXTRA_GOODS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taExtraGoodsDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_EXTRA_GOODS.<br/>
     * descSql =  SELECT * FROM TA_EXTRA_GOODS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaExtraGoodsDO
     */
    public TaExtraGoodsDO getByPrimary(Long id){
        return taExtraGoodsDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_EXTRA_GOODS.<br/>
     * descSql =  SELECT * FROM TA_EXTRA_GOODS WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaExtraGoodsDO
     */
    public TaExtraGoodsDO getByPrimarySelective(Long id){
        return taExtraGoodsDOMapper.getByPrimarySelective(id);
    }
    /**
     * desc:根据商品id获取数据:TA_EXTRA_GOODS.<br/>
     * descSql =  SELECT * FROM TA_EXTRA_GOODS WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param goodsId goodsId
     * @return TaExtraGoodsDO
     */
    public TaExtraGoodsDO getByGoodId(Long goodsId){
        return taExtraGoodsDOMapper.getByGoodId(goodsId);
    }
}
