package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaShopGoodsGroupDO;
import com.xl.dy.dal.paging.QueryShopGoodsGroupListPage;
import java.util.Map;
import java.util.List;
import com.xl.dy.dal.mapper.TaShopGoodsGroupDOMapper;

/**
* The Table TA_SHOP_GOODS_GROUP.
* TA_SHOP_GOODS_GROUP
*/
@Repository
public class TaShopGoodsGroupDAO{

    @Autowired
    private TaShopGoodsGroupDOMapper taShopGoodsGroupDOMapper;

    /**
     * desc:插入表:TA_SHOP_GOODS_GROUP.<br/>
     * descSql =  INSERT INTO TA_SHOP_GOODS_GROUP( ID ,IS_HIDE ,REMARK ,SHOP_ID ,ALTER_EMPL ,ALTER_TIME ,GROUP_NAME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{isHide,jdbcType=INTEGER} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{groupName,jdbcType=VARCHAR} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaShopGoodsGroupDO entity){
        return taShopGoodsGroupDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_SHOP_GOODS_GROUP.<br/>
     * descSql =  UPDATE TA_SHOP_GOODS_GROUP SET IS_HIDE = #{isHide,jdbcType=INTEGER} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,GROUP_NAME = #{groupName,jdbcType=VARCHAR} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaShopGoodsGroupDO entity){
        return taShopGoodsGroupDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_SHOP_GOODS_GROUP.<br/>
     * descSql =  DELETE FROM TA_SHOP_GOODS_GROUP WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taShopGoodsGroupDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_GOODS_GROUP.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS_GROUP WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopGoodsGroupDO
     */
    public TaShopGoodsGroupDO getByPrimary(Long id){
        return taShopGoodsGroupDOMapper.getByPrimary(id);
    }
    /**
     * desc:查询店铺商品分组列表.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS_GROUP WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND IS_HIDE = #{isHide,jdbcType=INTEGER} 
     * @param queryShopGoodsGroupList queryShopGoodsGroupList
     * @return QueryShopGoodsGroupListPage
     */
    public QueryShopGoodsGroupListPage getShopGoodsGroupPage(QueryShopGoodsGroupListPage queryShopGoodsGroupList){
        int total = taShopGoodsGroupDOMapper.getShopGoodsGroupPageCount(queryShopGoodsGroupList);
        if(total>0){
            queryShopGoodsGroupList.setDatas(taShopGoodsGroupDOMapper.getShopGoodsGroupPageResult(queryShopGoodsGroupList));
        }
        queryShopGoodsGroupList.setTotal(total);
        return queryShopGoodsGroupList;
    }
    /**
     * desc:更新表:TA_SHOP_GOODS_GROUP.<br/>
     * descSql =  UPDATE TA_SHOP_GOODS_GROUP IS_HIDE = #{isHide,jdbcType=INTEGER}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, GROUP_NAME = #{groupName,jdbcType=VARCHAR}, WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long updateSelective(TaShopGoodsGroupDO entity){
        return taShopGoodsGroupDOMapper.updateSelective(entity);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_GOODS_GROUP.<br/>
     * descSql =  SELECT GROUP_NAME name,ID id FROM TA_SHOP_GOODS_GROUP WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param shopId shopId
     * @return List<Map>
     */
    public List<Map> getShopGoodsGroup(Long shopId){
        return taShopGoodsGroupDOMapper.getShopGoodsGroup(shopId);
    }
}
