package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaCouponUserDO;
import java.lang.Integer;
import java.lang.Long;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * ?��???�?对�??页�????,请�?��?�使?��?��???DAO�?
 * The Table TA_COUPON_USER.
 * TA_COUPON_USER
 */
public interface TaCouponUserDOMapper{

    /**
     * desc:插入表:TA_COUPON_USER.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_COUPON_USER( ID ,REMARK ,USER_ID ,COUPON_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,COUPON_USE_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{userId,jdbcType=BIGINT} , #{couponId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{couponUseStatus,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaCouponUserDO entity);
    /**
     * desc:更新表:TA_COUPON_USER.<br/>
     * descSql =  UPDATE TA_COUPON_USER SET REMARK = #{remark,jdbcType=VARCHAR} ,USER_ID = #{userId,jdbcType=BIGINT} ,COUPON_ID = #{couponId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,COUPON_USE_STATUS = #{couponUseStatus,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaCouponUserDO entity);
    /**
     * desc:根据主键删除数据:TA_COUPON_USER.<br/>
     * descSql =  DELETE FROM TA_COUPON_USER WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_COUPON_USER.<br/>
     * descSql =  SELECT * FROM TA_COUPON_USER WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaCouponUserDO
     */
    TaCouponUserDO getByPrimary(Long id);
    /**
     * desc:根据主键获取领取的优惠券数量:TA_COUPON_USER.<br/>
     * descSql =  SELECT COUNT(0) FROM TA_COUPON_USER WHERE COUPON_ID = #{couponId,jdbcType=BIGINT}
     * @param couponId couponId
     * @return Integer
     */
    Integer getUsesByPrimary(Long couponId);
    /**
     * desc:根据主键获取使用的优惠券数量:TA_COUPON_USER.<br/>
     * descSql =  SELECT COUNT(0) FROM TA_COUPON_USER WHERE COUPON_ID = #{couponId,jdbcType=BIGINT} AND COUPON_USE_STATUS ="UNUSED"
     * @param couponId couponId
     * @return Integer
     */
    Integer getUsedByPrimary(Long couponId);
    /**
     * desc:获得主键:TA_COUPON_USER.<br/>
     * descSql =  SELECT ID id FROM TA_COUPON_USER WHERE COUPON_ID = #{couponId,jdbcType=BIGINT}
     * @param couponId couponId
     * @return List<Long>
     */
    List<Long> getPrimaryIdByCouponId(Long couponId);
}
