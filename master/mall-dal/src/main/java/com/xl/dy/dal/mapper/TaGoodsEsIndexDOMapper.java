package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaGoodsEsIndexDO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_GOODS_ES_INDEX.
 * TA_GOODS_ES_INDEX
 */
public interface TaGoodsEsIndexDOMapper{

    /**
     * desc:插入表:TA_GOODS_ES_INDEX.<br/>
     * descSql =  INSERT INTO TA_GOODS_ES_INDEX( ID ,ES_ID ,PRICE ,REMARK ,SHOP_ID ,GOODS_ID ,SHOP_NAME ,ALTER_EMPL ,ALTER_TIME ,SHOP_SCORE ,TIMESTAMP ,CATEGORY_ID ,CREATE_EMPL ,CREATE_TIME ,IS_HAVE_STORE ,VALID_STATUS ,CATEGORY_NAME ,IS_FAMILY_ONLY ,PAY_MAN_COUNTS ,SHOP_PHOTO_URL ,SHOP_GOODS_NAME ,IS_MARKETING_ACTIVITIES ,MARKETING_ACTIVITIES_LIST )VALUES( #{id,jdbcType=BIGINT} , #{esId,jdbcType=VARCHAR} , #{price,jdbcType=DECIMAL} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=VARCHAR} , #{goodsId,jdbcType=VARCHAR} , #{shopName,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=VARCHAR} , #{alterTime,jdbcType=TIMESTAMP} , #{shopScore,jdbcType=DECIMAL} , #{timestamp,jdbcType=VARCHAR} , #{categoryId,jdbcType=VARCHAR} , #{createEmpl,jdbcType=VARCHAR} , #{createTime,jdbcType=TIMESTAMP} , #{isHaveStore,jdbcType=INTEGER} , #{validStatus,jdbcType=INTEGER} , #{categoryName,jdbcType=VARCHAR} , #{isFamilyOnly,jdbcType=INTEGER} , #{payManCounts,jdbcType=VARCHAR} , #{shopPhotoUrl,jdbcType=VARCHAR} , #{shopGoodsName,jdbcType=VARCHAR} , #{isMarketingActivities,jdbcType=INTEGER} , #{marketingActivitiesList,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaGoodsEsIndexDO entity);
    /**
     * desc:更新表:TA_GOODS_ES_INDEX.<br/>
     * descSql =  UPDATE TA_GOODS_ES_INDEX SET ES_ID = #{esId,jdbcType=VARCHAR} ,PRICE = #{price,jdbcType=DECIMAL} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=VARCHAR} ,GOODS_ID = #{goodsId,jdbcType=VARCHAR} ,SHOP_NAME = #{shopName,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=VARCHAR} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,SHOP_SCORE = #{shopScore,jdbcType=DECIMAL} ,TIMESTAMP = #{timestamp,jdbcType=VARCHAR} ,CATEGORY_ID = #{categoryId,jdbcType=VARCHAR} ,CREATE_EMPL = #{createEmpl,jdbcType=VARCHAR} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,IS_HAVE_STORE = #{isHaveStore,jdbcType=INTEGER} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,CATEGORY_NAME = #{categoryName,jdbcType=VARCHAR} ,IS_FAMILY_ONLY = #{isFamilyOnly,jdbcType=INTEGER} ,PAY_MAN_COUNTS = #{payManCounts,jdbcType=VARCHAR} ,SHOP_PHOTO_URL = #{shopPhotoUrl,jdbcType=VARCHAR} ,SHOP_GOODS_NAME = #{shopGoodsName,jdbcType=VARCHAR} ,IS_MARKETING_ACTIVITIES = #{isMarketingActivities,jdbcType=INTEGER} ,MARKETING_ACTIVITIES_LIST = #{marketingActivitiesList,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaGoodsEsIndexDO entity);
    /**
     * desc:根据主键删除数据:TA_GOODS_ES_INDEX.<br/>
     * descSql =  DELETE FROM TA_GOODS_ES_INDEX WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_GOODS_ES_INDEX.<br/>
     * descSql =  SELECT * FROM TA_GOODS_ES_INDEX WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaGoodsEsIndexDO
     */
    TaGoodsEsIndexDO getByPrimary(Long id);
    /**
     * desc:更新表:TA_GOODS_ES_INDEX.<br/>
     * descSql =  UPDATE TA_GOODS_ES_INDEX 
     * @param entity entity
     * @return Long
     */
    Long updateSelective(TaGoodsEsIndexDO entity);
    /**
     * desc:根据条件获取数据:TA_GOODS_ES_INDEX.<br/>
     * descSql =  SELECT * FROM TA_GOODS_ES_INDEX 
     * @param id id
     * @param esId esId
     * @param shopId shopId
     * @param goodsId goodsId
     * @return TaGoodsEsIndexDO
     */
    TaGoodsEsIndexDO getBySelective(@Param("id")Long id,@Param("esId")String esId,@Param("shopId")String shopId,@Param("goodsId")String goodsId);
    /**
     * desc:根据条件删除数据:TA_GOODS_ES_INDEX.<br/>
     * descSql =  DELETE FROM TA_GOODS_ES_INDEX 
     * @param id id
     * @param esId esId
     * @param shopId shopId
     * @param goodsId goodsId
     * @return Long
     */
    Long deleteBySelective(@Param("id")Long id,@Param("esId")String esId,@Param("shopId")String shopId,@Param("goodsId")String goodsId);
    /**
     * desc:根据条件获取数据:TA_GOODS_ES_INDEX.<br/>
     * descSql =  SELECT * FROM TA_GOODS_ES_INDEX WHERE GOODS_ID = #{goodsId,jdbcType=VARCHAR}
     * @param goodsId goodsId
     * @return List<TaGoodsEsIndexDO>
     */
    List<TaGoodsEsIndexDO> getBatchBySelective(String goodsId);
}
