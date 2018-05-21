package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaShopMcCategoryDO;
import java.util.Map;
import java.util.List;
import com.xl.dy.dal.mapper.TaShopMcCategoryDOMapper;

/**
* The Table TA_SHOP_MC_CATEGORY.
* TA_SHOP_MC_CATEGORY
*/
@Repository
public class TaShopMcCategoryDAO{

    @Autowired
    private TaShopMcCategoryDOMapper taShopMcCategoryDOMapper;

    /**
     * desc:插入表:TA_SHOP_MC_CATEGORY.<br/>
     * descSql =  INSERT INTO TA_SHOP_MC_CATEGORY( ID ,REMARK ,SHOP_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,MG_CATEGORY_ID )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{mgCategoryId,jdbcType=BIGINT} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaShopMcCategoryDO entity){
        return taShopMcCategoryDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_SHOP_MC_CATEGORY.<br/>
     * descSql =  UPDATE TA_SHOP_MC_CATEGORY SET REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,MG_CATEGORY_ID = #{mgCategoryId,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaShopMcCategoryDO entity){
        return taShopMcCategoryDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_SHOP_MC_CATEGORY.<br/>
     * descSql =  DELETE FROM TA_SHOP_MC_CATEGORY WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taShopMcCategoryDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_MC_CATEGORY.<br/>
     * descSql =  SELECT * FROM TA_SHOP_MC_CATEGORY WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopMcCategoryDO
     */
    public TaShopMcCategoryDO getByPrimary(Long id){
        return taShopMcCategoryDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_MC_CATEGORY.<br/>
     * descSql =  SELECT * FROM TA_SHOP_MC_CATEGORY WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaShopMcCategoryDO
     */
    public TaShopMcCategoryDO getByPrimarySelective(Long id){
        return taShopMcCategoryDOMapper.getByPrimarySelective(id);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_MC_CATEGORY.<br/>
     * descSql =  SELECT * FROM TA_SHOP_MC_CATEGORY WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param shopId shopId
     * @return TaShopMcCategoryDO
     */
    public TaShopMcCategoryDO getByShopId(Long shopId){
        return taShopMcCategoryDOMapper.getByShopId(shopId);
    }
    /**
     * desc:根据店铺id获取店铺营业类目id和名字.<br/>
     * descSql =  SELECT b.id,b.name FROM TG_MG_CATEGORY b LEFT JOIN TA_SHOP_MC_CATEGORY a on b.id = a.mg_category_id WHERE a.shop_id = #{shopId,jdbcType=BIGINT}
     * @param shopId shopId
     * @return List<Map>
     */
    public List<Map> getShopCategoryList(Long shopId){
        return taShopMcCategoryDOMapper.getShopCategoryList(shopId);
    }
}
