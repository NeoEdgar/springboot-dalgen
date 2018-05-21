package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaGoodsPhotoDO;
import java.util.List;
import com.xl.dy.dal.mapper.TaGoodsPhotoDOMapper;

/**
* The Table TA_GOODS_PHOTO.
* TA_GOODS_PHOTO
*/
@Repository
public class TaGoodsPhotoDAO{

    @Autowired
    private TaGoodsPhotoDOMapper taGoodsPhotoDOMapper;

    /**
     * desc:插入表:TA_GOODS_PHOTO.<br/>
     * descSql =  INSERT INTO TA_GOODS_PHOTO( ID ,INX ,SKU_ID ,REMARK ,GOODS_ID ,PHOTO_URL ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,IS_SPU_PHOTO ,IS_MAST_PHOTO ,VALID_STATUS ,DISPLAY_PLATFORM )VALUES( #{id,jdbcType=BIGINT} , #{inx,jdbcType=INTEGER} , #{skuId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{goodsId,jdbcType=BIGINT} , #{photoUrl,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{isSpuPhoto,jdbcType=INTEGER} , #{isMastPhoto,jdbcType=INTEGER} , #{validStatus,jdbcType=INTEGER} , #{displayPlatform,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaGoodsPhotoDO entity){
        return taGoodsPhotoDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_GOODS_PHOTO.<br/>
     * descSql =  UPDATE TA_GOODS_PHOTO SET INX = #{inx,jdbcType=INTEGER} ,SKU_ID = #{skuId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,PHOTO_URL = #{photoUrl,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,IS_SPU_PHOTO = #{isSpuPhoto,jdbcType=INTEGER} ,IS_MAST_PHOTO = #{isMastPhoto,jdbcType=INTEGER} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,DISPLAY_PLATFORM = #{displayPlatform,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaGoodsPhotoDO entity){
        return taGoodsPhotoDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_GOODS_PHOTO.<br/>
     * descSql =  DELETE FROM TA_GOODS_PHOTO WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taGoodsPhotoDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_GOODS_PHOTO.<br/>
     * descSql =  SELECT * FROM TA_GOODS_PHOTO WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaGoodsPhotoDO
     */
    public TaGoodsPhotoDO getByPrimary(Long id){
        return taGoodsPhotoDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据主键删除数据:TA_GOODS_PHOTO.<br/>
     * descSql =  DELETE FROM TA_GOODS_PHOTO WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param goodsId goodsId
     * @return Long
     */
    public Long deleteByGoodsId(Long goodsId){
        return taGoodsPhotoDOMapper.deleteByGoodsId(goodsId);
    }
    /**
     * desc:根据主键删除数据:TA_GOODS_PHOTO.<br/>
     * descSql =  DELETE FROM TA_GOODS_PHOTO WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND IS_SPU_PHOTO = 1
     * @param goodsId goodsId
     * @return Long
     */
    public Long deleteSpuPhotoByGoodsId(Long goodsId){
        return taGoodsPhotoDOMapper.deleteSpuPhotoByGoodsId(goodsId);
    }
    /**
     * desc:根据主键删除数据:TA_GOODS_PHOTO.<br/>
     * descSql =  DELETE FROM TA_GOODS_PHOTO WHERE SKU_ID = #{skuId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} 
     * @param skuId skuId
     * @param shopId shopId
     * @return Long
     */
    public Long deleteBySkuId(Long skuId,Long shopId){
        return taGoodsPhotoDOMapper.deleteBySkuId(skuId, shopId);
    }
    /**
     * desc:更新表:TA_GOODS_PHOTO.<br/>
     * descSql =  UPDATE TA_GOODS_PHOTO INX = #{inx,jdbcType=INTEGER}, SKU_ID = #{skuId,jdbcType=BIGINT}, REMARK = #{remark,jdbcType=VARCHAR}, GOODS_ID = #{goodsId,jdbcType=BIGINT}, PHOTO_URL = #{photoUrl,jdbcType=VARCHAR}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, IS_SPU_PHOTO = #{isSpuPhoto,jdbcType=INTEGER}, IS_MAST_PHOTO = #{isMastPhoto,jdbcType=INTEGER}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, DISPLAY_PLATFORM = #{displayPlatform,jdbcType=VARCHAR}, 
     * @param entity entity
     * @return Long
     */
    public Long updateSelective(TaGoodsPhotoDO entity){
        return taGoodsPhotoDOMapper.updateSelective(entity);
    }
    /**
     * desc:修改有效性.<br/>
     * descSql =  UPDATE TA_GOODS_PHOTO SET VALID_STATUS = 0 WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param goodsId goodsId
     * @return Long
     */
    public Long updateValidStatus(Long goodsId){
        return taGoodsPhotoDOMapper.updateValidStatus(goodsId);
    }
    /**
     * desc:根据主键获取有效数据:TA_GOODS_PHOTO.<br/>
     * descSql =  SELECT * FROM TA_GOODS_PHOTO WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaGoodsPhotoDO
     */
    public TaGoodsPhotoDO getByPrimarySelective(Long id){
        return taGoodsPhotoDOMapper.getByPrimarySelective(id);
    }
    /**
     * desc:根据商品ID获取其主图:TA_GOODS_PHOTO.<br/>
     * descSql =  SELECT * FROM TA_GOODS_PHOTO WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND IS_MAST_PHOTO = 1 AND VALID_STATUS = 1
     * @param goodsId goodsId
     * @return TaGoodsPhotoDO
     */
    public TaGoodsPhotoDO getpMainPhotoByGoodsId(Long goodsId){
        return taGoodsPhotoDOMapper.getpMainPhotoByGoodsId(goodsId);
    }
    /**
     * desc:根据商品ID获取spu图片:TA_GOODS_PHOTO.<br/>
     * descSql =  SELECT PHOTO_URL FROM TA_GOODS_PHOTO WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND IS_SPU_PHOTO = 1 AND VALID_STATUS = 1
     * @param goodsId goodsId
     * @return List<String>
     */
    public List<String> getSpuPhotoByGoodsId(Long goodsId){
        return taGoodsPhotoDOMapper.getSpuPhotoByGoodsId(goodsId);
    }
    /**
     * desc:根据商品ID获取spu图片:TA_GOODS_PHOTO.<br/>
     * descSql =  SELECT PHOTO_URL FROM TA_GOODS_PHOTO WHERE SKU_ID = #{skuId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param skuId skuId
     * @return String
     */
    public String getSkuPhotoUrlBySkuId(Long skuId){
        return taGoodsPhotoDOMapper.getSkuPhotoUrlBySkuId(skuId);
    }
    /**
     * desc:删除已存在的主图信息:TA_GOODS_PHOTO.<br/>
     * descSql =  DELETE FROM TA_GOODS_PHOTO WHERE IS_MAST_PHOTO = 1
     * @return Long
     */
    public Long deleteByMastPhoto(){
        return taGoodsPhotoDOMapper.deleteByMastPhoto();
    }
}
