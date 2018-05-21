package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaOrderDiscListDO;
import org.apache.ibatis.annotations.Param;

/**
 * ?��???�?对�??页�????,请�?��?�使?��?��???DAO�?
 * The Table TA_ORDER_DISC_LIST.
 * TA_ORDER_DISC_LIST
 */
public interface TaOrderDiscListDOMapper{

    /**
     * desc:???�表:TA_ORDER_DISC_LIST.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_ORDER_DISC_LIST( ID ,AMT ,FACE_AMT ,ORDER_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,COUPON_USER_ID )VALUES( #{id,jdbcType=BIGINT} , #{amt,jdbcType=DECIMAL} , #{faceAmt,jdbcType=DECIMAL} , #{orderId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{couponUserId,jdbcType=BIGINT} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaOrderDiscListDO entity);
    /**
     * desc:?��?�表:TA_ORDER_DISC_LIST.<br/>
     * descSql =  UPDATE TA_ORDER_DISC_LIST SET AMT = #{amt,jdbcType=DECIMAL} ,FACE_AMT = #{faceAmt,jdbcType=DECIMAL} ,ORDER_ID = #{orderId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,COUPON_USER_ID = #{couponUserId,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaOrderDiscListDO entity);
    /**
     * desc:?��??主�?????��?��??:TA_ORDER_DISC_LIST.<br/>
     * descSql =  DELETE FROM TA_ORDER_DISC_LIST WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:?��??主�???��???��??:TA_ORDER_DISC_LIST.<br/>
     * descSql =  SELECT * FROM TA_ORDER_DISC_LIST WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaOrderDiscListDO
     */
    TaOrderDiscListDO getByPrimary(Long id);
}
