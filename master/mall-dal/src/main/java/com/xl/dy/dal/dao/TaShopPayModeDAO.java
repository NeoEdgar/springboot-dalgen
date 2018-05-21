package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaShopPayModeDO;
import java.util.List;
import com.xl.dy.dal.mapper.TaShopPayModeDOMapper;

/**
* The Table TA_SHOP_PAY_MODE.
* TA_SHOP_PAY_MODE
*/
@Repository
public class TaShopPayModeDAO{

    @Autowired
    private TaShopPayModeDOMapper taShopPayModeDOMapper;

    /**
     * desc:插入表:TA_SHOP_PAY_MODE.<br/>
     * descSql =  INSERT INTO TA_SHOP_PAY_MODE( ID ,REMARK ,SHOP_ID ,ALTER_EMPL ,ALTER_TIME ,PAY_MODE_ID ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,IS_DEFAULT_PAYMODE )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{payModeId,jdbcType=BIGINT} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{isDefaultPaymode,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaShopPayModeDO entity){
        return taShopPayModeDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_SHOP_PAY_MODE.<br/>
     * descSql =  UPDATE TA_SHOP_PAY_MODE SET REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,PAY_MODE_ID = #{payModeId,jdbcType=BIGINT} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,IS_DEFAULT_PAYMODE = #{isDefaultPaymode,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaShopPayModeDO entity){
        return taShopPayModeDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_SHOP_PAY_MODE.<br/>
     * descSql =  DELETE FROM TA_SHOP_PAY_MODE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taShopPayModeDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_PAY_MODE.<br/>
     * descSql =  SELECT * FROM TA_SHOP_PAY_MODE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopPayModeDO
     */
    public TaShopPayModeDO getByPrimary(Long id){
        return taShopPayModeDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据主键获取有效数据:TA_SHOP_PAY_MODE.<br/>
     * descSql =  SELECT * FROM TA_SHOP_PAY_MODE WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaShopPayModeDO
     */
    public TaShopPayModeDO getByPrimarySelective(Long id){
        return taShopPayModeDOMapper.getByPrimarySelective(id);
    }
    /**
     * desc:根据店铺ID获取数据list.<br/>
     * descSql =  SELECT * FROM TA_SHOP_PAY_MODE WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param shopId shopId
     * @return List<TaShopPayModeDO>
     */
    public List<TaShopPayModeDO> getByShopId(Long shopId){
        return taShopPayModeDOMapper.getByShopId(shopId);
    }
    /**
     * desc:根据主键获取有效数据:TA_SHOP_PAY_MODE.<br/>
     * descSql =  SELECT * FROM TA_SHOP_PAY_MODE WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND IS_DEFAULT_PAYMODE = 1 AND VALID_STATUS = 1
     * @param shopId shopId
     * @return List<TaShopPayModeDO>
     */
    public List<TaShopPayModeDO> getDefaultPayMode(Long shopId){
        return taShopPayModeDOMapper.getDefaultPayMode(shopId);
    }
}
