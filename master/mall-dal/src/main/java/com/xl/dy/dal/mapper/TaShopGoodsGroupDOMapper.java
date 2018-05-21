package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaShopGoodsGroupDO;
import com.xl.dy.dal.paging.QueryShopGoodsGroupListPage;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_SHOP_GOODS_GROUP.
 * TA_SHOP_GOODS_GROUP
 */
public interface TaShopGoodsGroupDOMapper{

    /**
     * desc:插入表:TA_SHOP_GOODS_GROUP.<br/>
     * descSql =  INSERT INTO TA_SHOP_GOODS_GROUP( ID ,IS_HIDE ,REMARK ,SHOP_ID ,ALTER_EMPL ,ALTER_TIME ,GROUP_NAME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{isHide,jdbcType=INTEGER} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{groupName,jdbcType=VARCHAR} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaShopGoodsGroupDO entity);
    /**
     * desc:更新表:TA_SHOP_GOODS_GROUP.<br/>
     * descSql =  UPDATE TA_SHOP_GOODS_GROUP SET IS_HIDE = #{isHide,jdbcType=INTEGER} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,GROUP_NAME = #{groupName,jdbcType=VARCHAR} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaShopGoodsGroupDO entity);
    /**
     * desc:根据主键删除数据:TA_SHOP_GOODS_GROUP.<br/>
     * descSql =  DELETE FROM TA_SHOP_GOODS_GROUP WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_SHOP_GOODS_GROUP.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS_GROUP WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopGoodsGroupDO
     */
    TaShopGoodsGroupDO getByPrimary(Long id);
    /**
     * desc:查询店铺商品分组列表.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS_GROUP WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND IS_HIDE = #{isHide,jdbcType=INTEGER} 
     * @param queryShopGoodsGroupList queryShopGoodsGroupList
     * @return int
     */
    int getShopGoodsGroupPageCount(QueryShopGoodsGroupListPage queryShopGoodsGroupList);
    /**
     * desc:查询店铺商品分组列表.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS_GROUP WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND IS_HIDE = #{isHide,jdbcType=INTEGER} 
     * @param queryShopGoodsGroupList queryShopGoodsGroupList
     * @return List<TaShopGoodsGroupDO>
     */
    List<TaShopGoodsGroupDO> getShopGoodsGroupPageResult(QueryShopGoodsGroupListPage queryShopGoodsGroupList);
    /**
     * desc:更新表:TA_SHOP_GOODS_GROUP.<br/>
     * descSql =  UPDATE TA_SHOP_GOODS_GROUP IS_HIDE = #{isHide,jdbcType=INTEGER}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, GROUP_NAME = #{groupName,jdbcType=VARCHAR}, WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long updateSelective(TaShopGoodsGroupDO entity);
    /**
     * desc:根据主键获取数据:TA_SHOP_GOODS_GROUP.<br/>
     * descSql =  SELECT GROUP_NAME name,ID id FROM TA_SHOP_GOODS_GROUP WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param shopId shopId
     * @return List<Map>
     */
    List<Map> getShopGoodsGroup(Long shopId);
}
