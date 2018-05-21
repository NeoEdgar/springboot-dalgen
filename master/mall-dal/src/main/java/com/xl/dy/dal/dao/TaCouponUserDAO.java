package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaCouponUserDO;
import java.lang.Integer;
import java.lang.Long;
import java.util.List;
import com.xl.dy.dal.mapper.TaCouponUserDOMapper;

/**
* The Table TA_COUPON_USER.
* TA_COUPON_USER
*/
@Repository
public class TaCouponUserDAO{

    @Autowired
    private TaCouponUserDOMapper taCouponUserDOMapper;

    /**
     * desc:插入表:TA_COUPON_USER.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_COUPON_USER( ID ,REMARK ,USER_ID ,COUPON_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,COUPON_USE_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{userId,jdbcType=BIGINT} , #{couponId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{couponUseStatus,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaCouponUserDO entity){
        return taCouponUserDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_COUPON_USER.<br/>
     * descSql =  UPDATE TA_COUPON_USER SET REMARK = #{remark,jdbcType=VARCHAR} ,USER_ID = #{userId,jdbcType=BIGINT} ,COUPON_ID = #{couponId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,COUPON_USE_STATUS = #{couponUseStatus,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaCouponUserDO entity){
        return taCouponUserDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_COUPON_USER.<br/>
     * descSql =  DELETE FROM TA_COUPON_USER WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taCouponUserDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_COUPON_USER.<br/>
     * descSql =  SELECT * FROM TA_COUPON_USER WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaCouponUserDO
     */
    public TaCouponUserDO getByPrimary(Long id){
        return taCouponUserDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据主键获取领取的优惠券数量:TA_COUPON_USER.<br/>
     * descSql =  SELECT COUNT(0) FROM TA_COUPON_USER WHERE COUPON_ID = #{couponId,jdbcType=BIGINT}
     * @param couponId couponId
     * @return Integer
     */
    public Integer getUsesByPrimary(Long couponId){
        return taCouponUserDOMapper.getUsesByPrimary(couponId);
    }
    /**
     * desc:根据主键获取使用的优惠券数量:TA_COUPON_USER.<br/>
     * descSql =  SELECT COUNT(0) FROM TA_COUPON_USER WHERE COUPON_ID = #{couponId,jdbcType=BIGINT} AND COUPON_USE_STATUS ="UNUSED"
     * @param couponId couponId
     * @return Integer
     */
    public Integer getUsedByPrimary(Long couponId){
        return taCouponUserDOMapper.getUsedByPrimary(couponId);
    }
    /**
     * desc:获得主键:TA_COUPON_USER.<br/>
     * descSql =  SELECT ID id FROM TA_COUPON_USER WHERE COUPON_ID = #{couponId,jdbcType=BIGINT}
     * @param couponId couponId
     * @return List<Long>
     */
    public List<Long> getPrimaryIdByCouponId(Long couponId){
        return taCouponUserDOMapper.getPrimaryIdByCouponId(couponId);
    }
}
