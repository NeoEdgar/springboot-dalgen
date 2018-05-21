package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaShopMcCategoryDO;
import java.util.Map;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_SHOP_MC_CATEGORY.
 * TA_SHOP_MC_CATEGORY
 */
public interface TaShopMcCategoryDOMapper{

    /**
     * desc:插入表:TA_SHOP_MC_CATEGORY.<br/>
     * descSql =  INSERT INTO TA_SHOP_MC_CATEGORY( ID ,REMARK ,SHOP_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,MG_CATEGORY_ID )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{mgCategoryId,jdbcType=BIGINT} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaShopMcCategoryDO entity);
    /**
     * desc:更新表:TA_SHOP_MC_CATEGORY.<br/>
     * descSql =  UPDATE TA_SHOP_MC_CATEGORY SET REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,MG_CATEGORY_ID = #{mgCategoryId,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaShopMcCategoryDO entity);
    /**
     * desc:根据主键删除数据:TA_SHOP_MC_CATEGORY.<br/>
     * descSql =  DELETE FROM TA_SHOP_MC_CATEGORY WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_SHOP_MC_CATEGORY.<br/>
     * descSql =  SELECT * FROM TA_SHOP_MC_CATEGORY WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopMcCategoryDO
     */
    TaShopMcCategoryDO getByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_SHOP_MC_CATEGORY.<br/>
     * descSql =  SELECT * FROM TA_SHOP_MC_CATEGORY WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaShopMcCategoryDO
     */
    TaShopMcCategoryDO getByPrimarySelective(Long id);
    /**
     * desc:根据主键获取数据:TA_SHOP_MC_CATEGORY.<br/>
     * descSql =  SELECT * FROM TA_SHOP_MC_CATEGORY WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param shopId shopId
     * @return TaShopMcCategoryDO
     */
    TaShopMcCategoryDO getByShopId(Long shopId);
    /**
     * desc:根据店铺id获取店铺营业类目id和名字.<br/>
     * descSql =  SELECT b.id,b.name FROM TG_MG_CATEGORY b LEFT JOIN TA_SHOP_MC_CATEGORY a on b.id = a.mg_category_id WHERE a.shop_id = #{shopId,jdbcType=BIGINT}
     * @param shopId shopId
     * @return List<Map>
     */
    List<Map> getShopCategoryList(Long shopId);
}
