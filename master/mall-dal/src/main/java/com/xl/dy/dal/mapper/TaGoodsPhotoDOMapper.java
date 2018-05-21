package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaGoodsPhotoDO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_GOODS_PHOTO.
 * TA_GOODS_PHOTO
 */
public interface TaGoodsPhotoDOMapper{

    /**
     * desc:插入表:TA_GOODS_PHOTO.<br/>
     * descSql =  INSERT INTO TA_GOODS_PHOTO( ID ,INX ,SKU_ID ,REMARK ,GOODS_ID ,PHOTO_URL ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,IS_SPU_PHOTO ,IS_MAST_PHOTO ,VALID_STATUS ,DISPLAY_PLATFORM )VALUES( #{id,jdbcType=BIGINT} , #{inx,jdbcType=INTEGER} , #{skuId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{goodsId,jdbcType=BIGINT} , #{photoUrl,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{isSpuPhoto,jdbcType=INTEGER} , #{isMastPhoto,jdbcType=INTEGER} , #{validStatus,jdbcType=INTEGER} , #{displayPlatform,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaGoodsPhotoDO entity);
    /**
     * desc:更新表:TA_GOODS_PHOTO.<br/>
     * descSql =  UPDATE TA_GOODS_PHOTO SET INX = #{inx,jdbcType=INTEGER} ,SKU_ID = #{skuId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,PHOTO_URL = #{photoUrl,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,IS_SPU_PHOTO = #{isSpuPhoto,jdbcType=INTEGER} ,IS_MAST_PHOTO = #{isMastPhoto,jdbcType=INTEGER} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,DISPLAY_PLATFORM = #{displayPlatform,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaGoodsPhotoDO entity);
    /**
     * desc:根据主键删除数据:TA_GOODS_PHOTO.<br/>
     * descSql =  DELETE FROM TA_GOODS_PHOTO WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_GOODS_PHOTO.<br/>
     * descSql =  SELECT * FROM TA_GOODS_PHOTO WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaGoodsPhotoDO
     */
    TaGoodsPhotoDO getByPrimary(Long id);
    /**
     * desc:根据主键删除数据:TA_GOODS_PHOTO.<br/>
     * descSql =  DELETE FROM TA_GOODS_PHOTO WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param goodsId goodsId
     * @return Long
     */
    Long deleteByGoodsId(Long goodsId);
    /**
     * desc:根据主键删除数据:TA_GOODS_PHOTO.<br/>
     * descSql =  DELETE FROM TA_GOODS_PHOTO WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND IS_SPU_PHOTO = 1
     * @param goodsId goodsId
     * @return Long
     */
    Long deleteSpuPhotoByGoodsId(Long goodsId);
    /**
     * desc:根据主键删除数据:TA_GOODS_PHOTO.<br/>
     * descSql =  DELETE FROM TA_GOODS_PHOTO WHERE SKU_ID = #{skuId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} 
     * @param skuId skuId
     * @param shopId shopId
     * @return Long
     */
    Long deleteBySkuId(@Param("skuId")Long skuId,@Param("shopId")Long shopId);
    /**
     * desc:更新表:TA_GOODS_PHOTO.<br/>
     * descSql =  UPDATE TA_GOODS_PHOTO INX = #{inx,jdbcType=INTEGER}, SKU_ID = #{skuId,jdbcType=BIGINT}, REMARK = #{remark,jdbcType=VARCHAR}, GOODS_ID = #{goodsId,jdbcType=BIGINT}, PHOTO_URL = #{photoUrl,jdbcType=VARCHAR}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, IS_SPU_PHOTO = #{isSpuPhoto,jdbcType=INTEGER}, IS_MAST_PHOTO = #{isMastPhoto,jdbcType=INTEGER}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, DISPLAY_PLATFORM = #{displayPlatform,jdbcType=VARCHAR}, 
     * @param entity entity
     * @return Long
     */
    Long updateSelective(TaGoodsPhotoDO entity);
    /**
     * desc:修改有效性.<br/>
     * descSql =  UPDATE TA_GOODS_PHOTO SET VALID_STATUS = 0 WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param goodsId goodsId
     * @return Long
     */
    Long updateValidStatus(Long goodsId);
    /**
     * desc:根据主键获取有效数据:TA_GOODS_PHOTO.<br/>
     * descSql =  SELECT * FROM TA_GOODS_PHOTO WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaGoodsPhotoDO
     */
    TaGoodsPhotoDO getByPrimarySelective(Long id);
    /**
     * desc:根据商品ID获取其主图:TA_GOODS_PHOTO.<br/>
     * descSql =  SELECT * FROM TA_GOODS_PHOTO WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND IS_MAST_PHOTO = 1 AND VALID_STATUS = 1
     * @param goodsId goodsId
     * @return TaGoodsPhotoDO
     */
    TaGoodsPhotoDO getpMainPhotoByGoodsId(Long goodsId);
    /**
     * desc:根据商品ID获取spu图片:TA_GOODS_PHOTO.<br/>
     * descSql =  SELECT PHOTO_URL FROM TA_GOODS_PHOTO WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND IS_SPU_PHOTO = 1 AND VALID_STATUS = 1
     * @param goodsId goodsId
     * @return List<String>
     */
    List<String> getSpuPhotoByGoodsId(Long goodsId);
    /**
     * desc:根据商品ID获取spu图片:TA_GOODS_PHOTO.<br/>
     * descSql =  SELECT PHOTO_URL FROM TA_GOODS_PHOTO WHERE SKU_ID = #{skuId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param skuId skuId
     * @return String
     */
    String getSkuPhotoUrlBySkuId(Long skuId);
    /**
     * desc:删除已存在的主图信息:TA_GOODS_PHOTO.<br/>
     * descSql =  DELETE FROM TA_GOODS_PHOTO WHERE IS_MAST_PHOTO = 1
     * @return Long
     */
    Long deleteByMastPhoto();
}
