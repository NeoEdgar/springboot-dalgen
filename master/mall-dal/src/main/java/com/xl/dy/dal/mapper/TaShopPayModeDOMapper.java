package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaShopPayModeDO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_SHOP_PAY_MODE.
 * TA_SHOP_PAY_MODE
 */
public interface TaShopPayModeDOMapper{

    /**
     * desc:插入表:TA_SHOP_PAY_MODE.<br/>
     * descSql =  INSERT INTO TA_SHOP_PAY_MODE( ID ,REMARK ,SHOP_ID ,ALTER_EMPL ,ALTER_TIME ,PAY_MODE_ID ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,IS_DEFAULT_PAYMODE )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{payModeId,jdbcType=BIGINT} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{isDefaultPaymode,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaShopPayModeDO entity);
    /**
     * desc:更新表:TA_SHOP_PAY_MODE.<br/>
     * descSql =  UPDATE TA_SHOP_PAY_MODE SET REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,PAY_MODE_ID = #{payModeId,jdbcType=BIGINT} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,IS_DEFAULT_PAYMODE = #{isDefaultPaymode,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaShopPayModeDO entity);
    /**
     * desc:根据主键删除数据:TA_SHOP_PAY_MODE.<br/>
     * descSql =  DELETE FROM TA_SHOP_PAY_MODE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_SHOP_PAY_MODE.<br/>
     * descSql =  SELECT * FROM TA_SHOP_PAY_MODE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopPayModeDO
     */
    TaShopPayModeDO getByPrimary(Long id);
    /**
     * desc:根据主键获取有效数据:TA_SHOP_PAY_MODE.<br/>
     * descSql =  SELECT * FROM TA_SHOP_PAY_MODE WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaShopPayModeDO
     */
    TaShopPayModeDO getByPrimarySelective(Long id);
    /**
     * desc:根据店铺ID获取数据list.<br/>
     * descSql =  SELECT * FROM TA_SHOP_PAY_MODE WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param shopId shopId
     * @return List<TaShopPayModeDO>
     */
    List<TaShopPayModeDO> getByShopId(Long shopId);
    /**
     * desc:根据主键获取有效数据:TA_SHOP_PAY_MODE.<br/>
     * descSql =  SELECT * FROM TA_SHOP_PAY_MODE WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND IS_DEFAULT_PAYMODE = 1 AND VALID_STATUS = 1
     * @param shopId shopId
     * @return List<TaShopPayModeDO>
     */
    List<TaShopPayModeDO> getDefaultPayMode(Long shopId);
}
