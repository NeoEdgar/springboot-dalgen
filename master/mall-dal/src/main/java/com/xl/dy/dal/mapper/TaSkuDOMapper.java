package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaSkuDO;
import java.util.List;
import com.xl.dy.dal.resultmap.GoodDetailVO;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_SKU.
 * TA_SKU
 */
public interface TaSkuDOMapper{

    /**
     * desc:插入表:TA_SKU.<br/>
     * descSql =  INSERT INTO TA_SKU( ID ,REMARK ,BRAND_ID ,GOODS_ID ,SKU_TITLE ,ALTER_EMPL ,ALTER_TIME ,GOODS_CODE ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,SKU_PROP_JSON ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{brandId,jdbcType=BIGINT} , #{goodsId,jdbcType=BIGINT} , #{skuTitle,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{goodsCode,jdbcType=VARCHAR} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{skuPropJson,jdbcType=VARCHAR} , #{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaSkuDO entity);
    /**
     * desc:更新表:TA_SKU.<br/>
     * descSql =  UPDATE TA_SKU SET REMARK = #{remark,jdbcType=VARCHAR} ,BRAND_ID = #{brandId,jdbcType=BIGINT} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,SKU_TITLE = #{skuTitle,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,GOODS_CODE = #{goodsCode,jdbcType=VARCHAR} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,SKU_PROP_JSON = #{skuPropJson,jdbcType=VARCHAR} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaSkuDO entity);
    /**
     * desc:根据主键删除数据:TA_SKU.<br/>
     * descSql =  DELETE FROM TA_SKU WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键删除数据:TA_SKU.<br/>
     * descSql =  DELETE FROM TA_SKU WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param goodsId goodsId
     * @return Long
     */
    Long deleteByGoodsId(Long goodsId);
    /**
     * desc:根据主键获取数据:TA_SKU.<br/>
     * descSql =  SELECT * FROM TA_SKU WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaSkuDO
     */
    TaSkuDO getByPrimary(Long id);
    /**
     * desc:根据主键获取有效数据:TA_SKU.<br/>
     * descSql =  SELECT ID FROM TA_SKU WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaSkuDO
     */
    TaSkuDO getByPrimarySelective(Long id);
    /**
     * desc:根据商品ID获取所有skuID:TA_SKU.<br/>
     * descSql =  SELECT ID FROM TA_SKU WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param goodsId goodsId
     * @return List<TaSkuDO>
     */
    List<TaSkuDO> getSkuIdByGoodsId(Long goodsId);
    /**
     * desc:查询某一个商品下的sku信息.<br/>
     * descSql =  SELECT s.ID as skuId,s.SKU_PROP_JSON AS skuPropJson,TOTAL_STORE as totalStore,COM_DIRECT_PRICE as comDirectPrice,SALE_STATUS as saleStatus FROM ta_sku s left JOIN ta_company_goods cg on s.ID = cg.SKU_ID left join ta_shop_goods sg on sg.SKU_ID = cg.SKU_ID WHERE s.GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param goodsId goodsId
     * @return List<GoodDetailVO>
     */
    List<GoodDetailVO> findSkuDetail(Long goodsId);
    /**
     * desc:修改有效性.<br/>
     * descSql =  UPDATE TA_SKU SET VALID_STATUS = 0 WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param goodsId goodsId
     * @return Long
     */
    Long updateValidStatus(Long goodsId);
    /**
     * desc:查询某一个商品下的sku信息.<br/>
     * descSql =  SELECT sgp.GOODS_PRICE price,s.ID as skuId,s.SKU_PROP_JSON AS skuPropJson,TOTAL_STORE as totalStore,COM_DIRECT_PRICE as comDirectPrice FROM ta_sku s left JOIN ta_company_goods cg on s.ID = cg.SKU_ID left join ta_shop_goods sg on sg.SKU_ID = cg.SKU_ID left join TA_SHOP_GOODS_PRICE sgp on sg.ID = sgp.SHOP_GOODS_ID WHERE s.GOODS_ID = #{goodsId,jdbcType=BIGINT} AND sg.SHOP_ID = #{shopId,jdbcType=BIGINT} AND s.VALID_STATUS = 1
     * @param shopId shopId
     * @param goodsId goodsId
     * @return List<GoodDetailVO>
     */
    List<GoodDetailVO> findSkuDetailOfShop(@Param("shopId")Long shopId,@Param("goodsId")Long goodsId);
    /**
     * desc:更新表:TA_SKU.<br/>
     * descSql =  UPDATE TA_SKU REMARK = #{remark,jdbcType=VARCHAR}, BRAND_ID = #{brandId,jdbcType=BIGINT}, GOODS_ID = #{goodsId,jdbcType=BIGINT}, SKU_TITLE = #{skuTitle,jdbcType=VARCHAR}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, GOODS_CODE = #{goodsCode,jdbcType=VARCHAR}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, SKU_PROP_JSON = #{skuPropJson,jdbcType=VARCHAR}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long updateSelective(TaSkuDO entity);
    /**
     * desc:根据商品ID获取所有skuID:TA_SKU.<br/>
     * descSql =  SELECT * FROM TA_SKU WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param goodsId goodsId
     * @return List<TaSkuDO>
     */
    List<TaSkuDO> getSkuByGoodsId(Long goodsId);
}
