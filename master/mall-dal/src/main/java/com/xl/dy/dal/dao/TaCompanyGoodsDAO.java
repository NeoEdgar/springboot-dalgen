package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaCompanyGoodsDO;
import com.xl.dy.dal.resultmap.PriceRangeInfo;
import com.xl.dy.dal.mapper.TaCompanyGoodsDOMapper;

/**
* The Table TA_COMPANY_GOODS.
* TA_COMPANY_GOODS
*/
@Repository
public class TaCompanyGoodsDAO{

    @Autowired
    private TaCompanyGoodsDOMapper taCompanyGoodsDOMapper;

    /**
     * desc:插入表:TA_COMPANY_GOODS.<br/>
     * descSql =  INSERT INTO TA_COMPANY_GOODS( ID ,SKU_ID ,REMARK ,GOODS_ID ,ALTER_EMPL ,ALTER_TIME ,COMPANY_ID ,GOODS_CODE ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,COMPANY_NAME ,VALID_STATUS ,COM_DIRECT_PRICE )VALUES( #{id,jdbcType=BIGINT} , #{skuId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{goodsId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{companyId,jdbcType=BIGINT} , #{goodsCode,jdbcType=VARCHAR} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{companyName,jdbcType=VARCHAR} , #{validStatus,jdbcType=INTEGER} , #{comDirectPrice,jdbcType=DECIMAL} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaCompanyGoodsDO entity){
        return taCompanyGoodsDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_COMPANY_GOODS.<br/>
     * descSql =  UPDATE TA_COMPANY_GOODS SET SKU_ID = #{skuId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,COMPANY_ID = #{companyId,jdbcType=BIGINT} ,GOODS_CODE = #{goodsCode,jdbcType=VARCHAR} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,COMPANY_NAME = #{companyName,jdbcType=VARCHAR} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,COM_DIRECT_PRICE = #{comDirectPrice,jdbcType=DECIMAL} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaCompanyGoodsDO entity){
        return taCompanyGoodsDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_COMPANY_GOODS.<br/>
     * descSql =  DELETE FROM TA_COMPANY_GOODS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taCompanyGoodsDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_COMPANY_GOODS.<br/>
     * descSql =  SELECT * FROM TA_COMPANY_GOODS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaCompanyGoodsDO
     */
    public TaCompanyGoodsDO getByPrimary(Long id){
        return taCompanyGoodsDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据主键删除数据:TA_COMPANY_GOODS.<br/>
     * descSql =  DELETE FROM TA_COMPANY_GOODS WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param goodsId goodsId
     * @return Long
     */
    public Long deleteByGoodsId(Long goodsId){
        return taCompanyGoodsDOMapper.deleteByGoodsId(goodsId);
    }
    /**
     * desc:根据主键删除数据:TA_COMPANY_GOODS.<br/>
     * descSql =  DELETE FROM TA_COMPANY_GOODS WHERE SKU_ID = #{skuId,jdbcType=BIGINT}
     * @param skuId skuId
     * @return Long
     */
    public Long deleteBySkuId(Long skuId){
        return taCompanyGoodsDOMapper.deleteBySkuId(skuId);
    }
    /**
     * desc:根据主键获取数据:TA_COMPANY_GOODS.<br/>
     * descSql =  SELECT * FROM TA_COMPANY_GOODS WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaCompanyGoodsDO
     */
    public TaCompanyGoodsDO getByPrimarySelective(Long id){
        return taCompanyGoodsDOMapper.getByPrimarySelective(id);
    }
    /**
     * desc:更新表:TA_COMPANY_GOODS.<br/>
     * descSql =  UPDATE TA_COMPANY_GOODS REMARK = #{remark,jdbcType=VARCHAR}, GOODS_ID = #{goodsId,jdbcType=BIGINT}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, COMPANY_ID = #{companyId,jdbcType=BIGINT}, GOODS_CODE = #{goodsCode,jdbcType=VARCHAR}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, COMPANY_NAME = #{companyName,jdbcType=VARCHAR}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, COM_DIRECT_PRICE = #{comDirectPrice,jdbcType=DECIMAL}, VALID_STATUS = 1 
     * @param entity entity
     * @return Long
     */
    public Long updateSelective(TaCompanyGoodsDO entity){
        return taCompanyGoodsDOMapper.updateSelective(entity);
    }
    /**
     * desc:修改有效性.<br/>
     * descSql =  UPDATE TA_COMPANY_GOODS SET VALID_STATUS = 0 WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param goodsId goodsId
     * @return Long
     */
    public Long updateValidStatus(Long goodsId){
        return taCompanyGoodsDOMapper.updateValidStatus(goodsId);
    }
    /**
     * desc:修改.<br/>
     * descSql =  UPDATE TA_COMPANY_GOODS WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param entity entity
     * @return Long
     */
    public Long updateCompanyGoodsBySpu(TaCompanyGoodsDO entity){
        return taCompanyGoodsDOMapper.updateCompanyGoodsBySpu(entity);
    }
    /**
     * desc:根据产品ID获取数据:TA_COMPANY_GOODS.<br/>
     * descSql =  SELECT * FROM TA_COMPANY_GOODS WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND VALID_STATUS = 1 GROUP BY GOODS_ID
     * @param goodsId goodsId
     * @return TaCompanyGoodsDO
     */
    public TaCompanyGoodsDO getCompanyGoodsInfoByGoodsId(Long goodsId){
        return taCompanyGoodsDOMapper.getCompanyGoodsInfoByGoodsId(goodsId);
    }
    /**
     * desc:根据SKUID获取数据:TA_COMPANY_GOODS.<br/>
     * descSql =  SELECT * FROM TA_COMPANY_GOODS WHERE SKU_ID = #{skuId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param skuId skuId
     * @return TaCompanyGoodsDO
     */
    public TaCompanyGoodsDO getCompanyGoodsBySkuId(Long skuId){
        return taCompanyGoodsDOMapper.getCompanyGoodsBySkuId(skuId);
    }
    /**
     * desc:根据goodsId获取指导价范围:TA_COMPANY_GOODS.<br/>
     * descSql =  SELECT T.minPrice,T.maxPrice FROM(SELECT COMPANY_ID companyId,GOODS_ID goodsId,MIN(COM_DIRECT_PRICE) minPrice,MAX(COM_DIRECT_PRICE) maxPrice FROM TA_COMPANY_GOODS GROUP BY COMPANY_ID,GOODS_ID) T WHERE T.companyId = #{companyId,jdbcType=BIGINT} AND T.goodsId = #{goodsId,jdbcType=BIGINT}
     * @param goodsId goodsId
     * @param companyId companyId
     * @return PriceRangeInfo
     */
    public PriceRangeInfo getDirectPriceRangeByGoodsId(Long goodsId,Long companyId){
        return taCompanyGoodsDOMapper.getDirectPriceRangeByGoodsId(goodsId, companyId);
    }
}
