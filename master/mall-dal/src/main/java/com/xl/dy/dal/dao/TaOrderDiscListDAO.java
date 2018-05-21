package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaOrderDiscListDO;
import com.xl.dy.dal.mapper.TaOrderDiscListDOMapper;

/**
* The Table TA_ORDER_DISC_LIST.
* TA_ORDER_DISC_LIST
*/
@Repository
public class TaOrderDiscListDAO{

    @Autowired
    private TaOrderDiscListDOMapper taOrderDiscListDOMapper;

    /**
     * desc:???�表:TA_ORDER_DISC_LIST.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_ORDER_DISC_LIST( ID ,AMT ,FACE_AMT ,ORDER_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,COUPON_USER_ID )VALUES( #{id,jdbcType=BIGINT} , #{amt,jdbcType=DECIMAL} , #{faceAmt,jdbcType=DECIMAL} , #{orderId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{couponUserId,jdbcType=BIGINT} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaOrderDiscListDO entity){
        return taOrderDiscListDOMapper.insert(entity);
    }
    /**
     * desc:?��?�表:TA_ORDER_DISC_LIST.<br/>
     * descSql =  UPDATE TA_ORDER_DISC_LIST SET AMT = #{amt,jdbcType=DECIMAL} ,FACE_AMT = #{faceAmt,jdbcType=DECIMAL} ,ORDER_ID = #{orderId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,COUPON_USER_ID = #{couponUserId,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaOrderDiscListDO entity){
        return taOrderDiscListDOMapper.update(entity);
    }
    /**
     * desc:?��??主�?????��?��??:TA_ORDER_DISC_LIST.<br/>
     * descSql =  DELETE FROM TA_ORDER_DISC_LIST WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taOrderDiscListDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:?��??主�???��???��??:TA_ORDER_DISC_LIST.<br/>
     * descSql =  SELECT * FROM TA_ORDER_DISC_LIST WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaOrderDiscListDO
     */
    public TaOrderDiscListDO getByPrimary(Long id){
        return taOrderDiscListDOMapper.getByPrimary(id);
    }
}
