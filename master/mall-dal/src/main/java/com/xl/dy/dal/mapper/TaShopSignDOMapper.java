package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaShopSignDO;
import java.util.Date;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_SHOP_SIGN.
 * TA_SHOP_SIGN
 */
public interface TaShopSignDOMapper{

    /**
     * desc:插入表:TA_SHOP_SIGN.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_SHOP_SIGN( ID ,URL ,REMARK ,SHOP_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,SHOP_SIGN_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{url,jdbcType=VARCHAR} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{shopSignStatus,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaShopSignDO entity);
    /**
     * desc:更新表:TA_SHOP_SIGN.<br/>
     * descSql =  UPDATE TA_SHOP_SIGN SET URL = #{url,jdbcType=VARCHAR} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,SHOP_SIGN_STATUS = #{shopSignStatus,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaShopSignDO entity);
    /**
     * desc:根据主键删除数据:TA_SHOP_SIGN.<br/>
     * descSql =  DELETE FROM TA_SHOP_SIGN WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_SHOP_SIGN.<br/>
     * descSql =  SELECT * FROM TA_SHOP_SIGN WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopSignDO
     */
    TaShopSignDO getByPrimary(Long id);
    /**
     * desc:更新表:TA_SHOP_SIGN.<br/>
     * descSql =  UPDATE TA_SHOP_SIGN SET SHOP_SIGN_STATUS = #{shopSignStatus,jdbcType=VARCHAR}, ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} WHERE SHOP_ID = #{id,jdbcType=BIGINT}
     * @param alterTime alterTime
     * @param id id
     * @param alterEmpl alterEmpl
     * @param timestamp timestamp
     * @param shopSignStatus shopSignStatus
     * @return Long
     */
    Long updateSignStatus(@Param("alterTime")Date alterTime,@Param("id")Long id,@Param("alterEmpl")Long alterEmpl,@Param("timestamp")Long timestamp,@Param("shopSignStatus")String shopSignStatus);
}
