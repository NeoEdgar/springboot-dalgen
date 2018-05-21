package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaOrderEvaluateDO;
import com.xl.dy.dal.mapper.TaOrderEvaluateDOMapper;

/**
* The Table TA_ORDER_EVALUATE.
* TA_ORDER_EVALUATE
*/
@Repository
public class TaOrderEvaluateDAO{

    @Autowired
    private TaOrderEvaluateDOMapper taOrderEvaluateDOMapper;

    /**
     * desc:???�表:TA_ORDER_EVALUATE.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_ORDER_EVALUATE( ID ,STAR ,SKU_ID ,VIP_ID ,IMAGES ,MALL_ID ,SHOP_ID ,VIP_TXT ,GOODS_ID ,IS_IMAGE ,ORDER_ID ,SHOP_TXT ,SHOP_EMPL ,SHOP_NAME ,ALTER_EMPL ,ALTER_TIME ,COMPANY_ID ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,IS_RESPONSE ,ORDER_DEPT_ID ,EVALUATE_TIME ,RESPONSE_TIME ,SHOP_EMPL_NAME )VALUES( #{id,jdbcType=BIGINT} , #{star,jdbcType=INTEGER} , #{skuId,jdbcType=BIGINT} , #{vipId,jdbcType=BIGINT} , #{images,jdbcType=VARCHAR} , #{mallId,jdbcType=BIGINT} , #{shopId,jdbcType=BIGINT} , #{vipTxt,jdbcType=LONGVARCHAR} , #{goodsId,jdbcType=BIGINT} , #{isImage,jdbcType=INTEGER} , #{orderId,jdbcType=BIGINT} , #{shopTxt,jdbcType=LONGVARCHAR} , #{shopEmpl,jdbcType=BIGINT} , #{shopName,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{companyId,jdbcType=BIGINT} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{isResponse,jdbcType=INTEGER} , #{orderDeptId,jdbcType=BIGINT} , #{evaluateTime,jdbcType=TIMESTAMP} , #{responseTime,jdbcType=TIMESTAMP} , #{shopEmplName,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaOrderEvaluateDO entity){
        return taOrderEvaluateDOMapper.insert(entity);
    }
    /**
     * desc:?��?�表:TA_ORDER_EVALUATE.<br/>
     * descSql =  UPDATE TA_ORDER_EVALUATE SET STAR = #{star,jdbcType=INTEGER} ,SKU_ID = #{skuId,jdbcType=BIGINT} ,VIP_ID = #{vipId,jdbcType=BIGINT} ,IMAGES = #{images,jdbcType=VARCHAR} ,MALL_ID = #{mallId,jdbcType=BIGINT} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,VIP_TXT = #{vipTxt,jdbcType=LONGVARCHAR} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,IS_IMAGE = #{isImage,jdbcType=INTEGER} ,ORDER_ID = #{orderId,jdbcType=BIGINT} ,SHOP_TXT = #{shopTxt,jdbcType=LONGVARCHAR} ,SHOP_EMPL = #{shopEmpl,jdbcType=BIGINT} ,SHOP_NAME = #{shopName,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,COMPANY_ID = #{companyId,jdbcType=BIGINT} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,IS_RESPONSE = #{isResponse,jdbcType=INTEGER} ,ORDER_DEPT_ID = #{orderDeptId,jdbcType=BIGINT} ,EVALUATE_TIME = #{evaluateTime,jdbcType=TIMESTAMP} ,RESPONSE_TIME = #{responseTime,jdbcType=TIMESTAMP} ,SHOP_EMPL_NAME = #{shopEmplName,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaOrderEvaluateDO entity){
        return taOrderEvaluateDOMapper.update(entity);
    }
    /**
     * desc:?��??主�?????��?��??:TA_ORDER_EVALUATE.<br/>
     * descSql =  DELETE FROM TA_ORDER_EVALUATE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taOrderEvaluateDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:?��??主�???��???��??:TA_ORDER_EVALUATE.<br/>
     * descSql =  SELECT * FROM TA_ORDER_EVALUATE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaOrderEvaluateDO
     */
    public TaOrderEvaluateDO getByPrimary(Long id){
        return taOrderEvaluateDOMapper.getByPrimary(id);
    }
}
