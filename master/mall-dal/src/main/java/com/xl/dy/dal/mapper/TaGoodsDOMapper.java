package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaGoodsDO;
import com.xl.dy.dal.paging.QueryGoodsForMicroPagePage;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_GOODS.
 * TA_GOODS
 */
public interface TaGoodsDOMapper{

    /**
     * desc:插入表:TA_GOODS.<br/>
     * descSql =  INSERT INTO TA_GOODS( ID ,MG_FR_ID ,MK_FR_ID ,REMARK ,BRAND_ID ,MONGO_ID ,ALTER_EMPL ,ALTER_TIME ,GOODS_CODE ,GOODS_NAME ,GOODS_TYPE ,INNER_CODE ,REG_EMPL_ID ,REG_SHOP_ID ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,GOODS_SPELL ,REG_EMPL_NAME ,REG_SHOP_NAME ,VALID_STATUS ,GOODS_BARCODE ,MG_CATEGORY_ID ,MK_CATEGORY_ID ,REG_COMPANY_ID ,GOODS_SPEC_JSON ,INNER_ANCC_CODE ,REG_GOODS_STYLE ,REG_COMPANY_NAME )VALUES( #{id,jdbcType=BIGINT} , #{mgFrId,jdbcType=VARCHAR} , #{mkFrId,jdbcType=VARCHAR} , #{remark,jdbcType=VARCHAR} , #{brandId,jdbcType=BIGINT} , #{mongoId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{goodsCode,jdbcType=VARCHAR} , #{goodsName,jdbcType=VARCHAR} , #{goodsType,jdbcType=VARCHAR} , #{innerCode,jdbcType=VARCHAR} , #{regEmplId,jdbcType=BIGINT} , #{regShopId,jdbcType=BIGINT} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{goodsSpell,jdbcType=VARCHAR} , #{regEmplName,jdbcType=VARCHAR} , #{regShopName,jdbcType=VARCHAR} , #{validStatus,jdbcType=INTEGER} , #{goodsBarcode,jdbcType=VARCHAR} , #{mgCategoryId,jdbcType=BIGINT} , #{mkCategoryId,jdbcType=BIGINT} , #{regCompanyId,jdbcType=BIGINT} , #{goodsSpecJson,jdbcType=VARCHAR} , #{innerAnccCode,jdbcType=VARCHAR} , #{regGoodsStyle,jdbcType=VARCHAR} , #{regCompanyName,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaGoodsDO entity);
    /**
     * desc:更新表:TA_GOODS.<br/>
     * descSql =  UPDATE TA_GOODS SET MG_FR_ID = #{mgFrId,jdbcType=VARCHAR} ,MK_FR_ID = #{mkFrId,jdbcType=VARCHAR} ,REMARK = #{remark,jdbcType=VARCHAR} ,BRAND_ID = #{brandId,jdbcType=BIGINT} ,MONGO_ID = #{mongoId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,GOODS_CODE = #{goodsCode,jdbcType=VARCHAR} ,GOODS_NAME = #{goodsName,jdbcType=VARCHAR} ,GOODS_TYPE = #{goodsType,jdbcType=VARCHAR} ,INNER_CODE = #{innerCode,jdbcType=VARCHAR} ,REG_EMPL_ID = #{regEmplId,jdbcType=BIGINT} ,REG_SHOP_ID = #{regShopId,jdbcType=BIGINT} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,GOODS_SPELL = #{goodsSpell,jdbcType=VARCHAR} ,REG_EMPL_NAME = #{regEmplName,jdbcType=VARCHAR} ,REG_SHOP_NAME = #{regShopName,jdbcType=VARCHAR} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,GOODS_BARCODE = #{goodsBarcode,jdbcType=VARCHAR} ,MG_CATEGORY_ID = #{mgCategoryId,jdbcType=BIGINT} ,MK_CATEGORY_ID = #{mkCategoryId,jdbcType=BIGINT} ,REG_COMPANY_ID = #{regCompanyId,jdbcType=BIGINT} ,GOODS_SPEC_JSON = #{goodsSpecJson,jdbcType=VARCHAR} ,INNER_ANCC_CODE = #{innerAnccCode,jdbcType=VARCHAR} ,REG_GOODS_STYLE = #{regGoodsStyle,jdbcType=VARCHAR} ,REG_COMPANY_NAME = #{regCompanyName,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaGoodsDO entity);
    /**
     * desc:根据主键删除数据:TA_GOODS.<br/>
     * descSql =  DELETE FROM TA_GOODS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_GOODS.<br/>
     * descSql =  SELECT * FROM TA_GOODS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaGoodsDO
     */
    TaGoodsDO getByPrimary(Long id);
    /**
     * desc:根据主键获取有效数据:TA_GOODS.<br/>
     * descSql =  SELECT * FROM TA_GOODS WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaGoodsDO
     */
    TaGoodsDO getByPrimarySelective(Long id);
    /**
     * desc:修改商品信息.<br/>
     * descSql =  UPDATE TA_GOODS VALID_STATUS = 1 
     * @param entity entity
     * @return Long
     */
    Long updateSelective(TaGoodsDO entity);
    /**
     * desc:修改有效性.<br/>
     * descSql =  UPDATE TA_GOODS SET VALID_STATUS = 0 WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long updateValidStatus(Long id);
    /**
     * desc:微页面获取商品信息:TA_GOODS.<br/>
     * descSql =  SELECT a.ID goodsId, b.PHOTO_URL photoUrl, a.GOODS_NAME goodsName, a.GOODS_CODE goodsCode, a.REG_SHOP_NAME regShopName, a.REG_COMPANY_NAME regCompanyName, ( SELECT GROUP_CONCAT(z. NAME SEPARATOR '/') FROM tg_mg_category z WHERE FIND_IN_SET(z.ID, a.MG_FR_ID) &gt; 0 ) AS frCategory FROM ta_goods a LEFT JOIN ta_goods_photo b on a.ID = b.GOODS_ID WHERE b.IS_SPU_PHOTO = 1 AND b.IS_MAST_PHOTO = 1 AND (a.ID = #{goodsId,jdbcType=BIGINT} OR a.GOODS_NAME LIKE #{goodsName,jdbcType=VARCHAR})
     * @param queryGoodsForMicroPage queryGoodsForMicroPage
     * @return int
     */
    int getGoodsForMicroPageCount(QueryGoodsForMicroPagePage queryGoodsForMicroPage);
    /**
     * desc:微页面获取商品信息:TA_GOODS.<br/>
     * descSql =  SELECT a.ID goodsId, b.PHOTO_URL photoUrl, a.GOODS_NAME goodsName, a.GOODS_CODE goodsCode, a.REG_SHOP_NAME regShopName, a.REG_COMPANY_NAME regCompanyName, ( SELECT GROUP_CONCAT(z. NAME SEPARATOR '/') FROM tg_mg_category z WHERE FIND_IN_SET(z.ID, a.MG_FR_ID) &gt; 0 ) AS frCategory FROM ta_goods a LEFT JOIN ta_goods_photo b on a.ID = b.GOODS_ID WHERE b.IS_SPU_PHOTO = 1 AND b.IS_MAST_PHOTO = 1 AND (a.ID = #{goodsId,jdbcType=BIGINT} OR a.GOODS_NAME LIKE #{goodsName,jdbcType=VARCHAR})
     * @param queryGoodsForMicroPage queryGoodsForMicroPage
     * @return List<Map>
     */
    List<Map> getGoodsForMicroPageResult(QueryGoodsForMicroPagePage queryGoodsForMicroPage);
    /**
     * desc:修改有效性.<br/>
     * descSql =  UPDATE TA_GOODS SET MONGO_ID = null WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long updateMongo(Long id);
}
