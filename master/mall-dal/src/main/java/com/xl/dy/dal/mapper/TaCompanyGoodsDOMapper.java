package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaCompanyGoodsDO;
import com.xl.dy.dal.resultmap.PriceRangeInfo;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_COMPANY_GOODS.
 * TA_COMPANY_GOODS
 */
public interface TaCompanyGoodsDOMapper{

    /**
     * desc:插入表:TA_COMPANY_GOODS.<br/>
     * descSql =  INSERT INTO TA_COMPANY_GOODS( ID ,SKU_ID ,REMARK ,GOODS_ID ,ALTER_EMPL ,ALTER_TIME ,COMPANY_ID ,GOODS_CODE ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,COMPANY_NAME ,VALID_STATUS ,COM_DIRECT_PRICE )VALUES( #{id,jdbcType=BIGINT} , #{skuId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{goodsId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{companyId,jdbcType=BIGINT} , #{goodsCode,jdbcType=VARCHAR} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{companyName,jdbcType=VARCHAR} , #{validStatus,jdbcType=INTEGER} , #{comDirectPrice,jdbcType=DECIMAL} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaCompanyGoodsDO entity);
    /**
     * desc:更新表:TA_COMPANY_GOODS.<br/>
     * descSql =  UPDATE TA_COMPANY_GOODS SET SKU_ID = #{skuId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,COMPANY_ID = #{companyId,jdbcType=BIGINT} ,GOODS_CODE = #{goodsCode,jdbcType=VARCHAR} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,COMPANY_NAME = #{companyName,jdbcType=VARCHAR} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,COM_DIRECT_PRICE = #{comDirectPrice,jdbcType=DECIMAL} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaCompanyGoodsDO entity);
    /**
     * desc:根据主键删除数据:TA_COMPANY_GOODS.<br/>
     * descSql =  DELETE FROM TA_COMPANY_GOODS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_COMPANY_GOODS.<br/>
     * descSql =  SELECT * FROM TA_COMPANY_GOODS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaCompanyGoodsDO
     */
    TaCompanyGoodsDO getByPrimary(Long id);
    /**
     * desc:根据主键删除数据:TA_COMPANY_GOODS.<br/>
     * descSql =  DELETE FROM TA_COMPANY_GOODS WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param goodsId goodsId
     * @return Long
     */
    Long deleteByGoodsId(Long goodsId);
    /**
     * desc:根据主键删除数据:TA_COMPANY_GOODS.<br/>
     * descSql =  DELETE FROM TA_COMPANY_GOODS WHERE SKU_ID = #{skuId,jdbcType=BIGINT}
     * @param skuId skuId
     * @return Long
     */
    Long deleteBySkuId(Long skuId);
    /**
     * desc:根据主键获取数据:TA_COMPANY_GOODS.<br/>
     * descSql =  SELECT * FROM TA_COMPANY_GOODS WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaCompanyGoodsDO
     */
    TaCompanyGoodsDO getByPrimarySelective(Long id);
    /**
     * desc:更新表:TA_COMPANY_GOODS.<br/>
     * descSql =  UPDATE TA_COMPANY_GOODS REMARK = #{remark,jdbcType=VARCHAR}, GOODS_ID = #{goodsId,jdbcType=BIGINT}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, COMPANY_ID = #{companyId,jdbcType=BIGINT}, GOODS_CODE = #{goodsCode,jdbcType=VARCHAR}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, COMPANY_NAME = #{companyName,jdbcType=VARCHAR}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, COM_DIRECT_PRICE = #{comDirectPrice,jdbcType=DECIMAL}, VALID_STATUS = 1 
     * @param entity entity
     * @return Long
     */
    Long updateSelective(TaCompanyGoodsDO entity);
    /**
     * desc:修改有效性.<br/>
     * descSql =  UPDATE TA_COMPANY_GOODS SET VALID_STATUS = 0 WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param goodsId goodsId
     * @return Long
     */
    Long updateValidStatus(Long goodsId);
    /**
     * desc:修改.<br/>
     * descSql =  UPDATE TA_COMPANY_GOODS WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param entity entity
     * @return Long
     */
    Long updateCompanyGoodsBySpu(TaCompanyGoodsDO entity);
    /**
     * desc:根据产品ID获取数据:TA_COMPANY_GOODS.<br/>
     * descSql =  SELECT * FROM TA_COMPANY_GOODS WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND VALID_STATUS = 1 GROUP BY GOODS_ID
     * @param goodsId goodsId
     * @return TaCompanyGoodsDO
     */
    TaCompanyGoodsDO getCompanyGoodsInfoByGoodsId(Long goodsId);
    /**
     * desc:根据SKUID获取数据:TA_COMPANY_GOODS.<br/>
     * descSql =  SELECT * FROM TA_COMPANY_GOODS WHERE SKU_ID = #{skuId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param skuId skuId
     * @return TaCompanyGoodsDO
     */
    TaCompanyGoodsDO getCompanyGoodsBySkuId(Long skuId);
    /**
     * desc:根据goodsId获取指导价范围:TA_COMPANY_GOODS.<br/>
     * descSql =  SELECT T.minPrice,T.maxPrice FROM(SELECT COMPANY_ID companyId,GOODS_ID goodsId,MIN(COM_DIRECT_PRICE) minPrice,MAX(COM_DIRECT_PRICE) maxPrice FROM TA_COMPANY_GOODS GROUP BY COMPANY_ID,GOODS_ID) T WHERE T.companyId = #{companyId,jdbcType=BIGINT} AND T.goodsId = #{goodsId,jdbcType=BIGINT}
     * @param goodsId goodsId
     * @param companyId companyId
     * @return PriceRangeInfo
     */
    PriceRangeInfo getDirectPriceRangeByGoodsId(@Param("goodsId")Long goodsId,@Param("companyId")Long companyId);
}
