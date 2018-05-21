package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaEmplShopDO;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_EMPL_SHOP.
 * TA_EMPL_SHOP
 */
public interface TaEmplShopDOMapper{

    /**
     * desc:插入表:TA_EMPL_SHOP.<br/>
     * descSql =  INSERT INTO TA_EMPL_SHOP( ID ,EMPL_ID ,REMARK ,SHOP_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{emplId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaEmplShopDO entity);
    /**
     * desc:更新表:TA_EMPL_SHOP.<br/>
     * descSql =  UPDATE TA_EMPL_SHOP SET EMPL_ID = #{emplId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaEmplShopDO entity);
    /**
     * desc:更新表:TA_EMPL_SHOP.<br/>
     * descSql =  UPDATE TA_EMPL_SHOP SET EMPL_ID = #{emplId,jdbcType=BIGINT}, REMARK = #{remark,jdbcType=VARCHAR}, SHOP_ID = #{shopId,jdbcType=BIGINT}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long updateByPrimarySelective(TaEmplShopDO entity);
    /**
     * desc:更新表:TA_EMPL_SHOP.<br/>
     * descSql =  UPDATE TA_EMPL_SHOP SET ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE SHOP_ID = #{shopId,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long updateByShopId(TaEmplShopDO entity);
    /**
     * desc:根据主键删除数据:TA_EMPL_SHOP.<br/>
     * descSql =  DELETE FROM TA_EMPL_SHOP WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键删除数据:TA_EMPL_SHOP.<br/>
     * descSql =  DELETE FROM TA_EMPL_SHOP WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND EMPL_ID = #{emplId,jdbcType=BIGINT}
     * @param emplId emplId
     * @param shopId shopId
     * @return Long
     */
    Long deleteByShopIdAndEmplId(@Param("emplId")Long emplId,@Param("shopId")Long shopId);
    /**
     * desc:根据主键删除数据:TA_EMPL_SHOP.<br/>
     * descSql =  DELETE FROM TA_EMPL_SHOP WHERE EMPL_ID = #{emplId,jdbcType=BIGINT}
     * @param emplId emplId
     * @return Long
     */
    Long deleteByEmplId(Long emplId);
    /**
     * desc:根据主键获取数据:TA_EMPL_SHOP.<br/>
     * descSql =  SELECT * FROM TA_EMPL_SHOP WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaEmplShopDO
     */
    TaEmplShopDO getByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_EMPL_SHOP.<br/>
     * descSql =  SELECT * FROM TA_EMPL_SHOP WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaEmplShopDO
     */
    TaEmplShopDO getByPrimarySelective(Long id);
    /**
     * desc:根据主键获取数据:TA_EMPL_SHOP.<br/>
     * descSql =  SELECT * FROM TA_EMPL_SHOP WHERE EMPL_ID = #{emplId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT}
     * @param emplId emplId
     * @param shopId shopId
     * @return TaEmplShopDO
     */
    TaEmplShopDO getByEmplIdAndShopId(@Param("emplId")Long emplId,@Param("shopId")Long shopId);
}
