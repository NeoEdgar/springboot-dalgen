package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaRetainageChginvDO;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * ?��???�?对�??页�????,请�?��?�使?��?��???DAO�?
 * The Table TA_RETAINAGE_CHGINV.
 * TA_RETAINAGE_CHGINV
 */
public interface TaRetainageChginvDOMapper{

    /**
     * desc:???�表:TA_RETAINAGE_CHGINV.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_RETAINAGE_CHGINV( ID ,REMARK ,DISCOUNT ,ALTER_EMPL ,ALTER_TIME ,RETAINAGE ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,START_SALES ,TARGET_SALES ,VALID_STATUS ,ADVANCE_REVIEW_ID )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{discount,jdbcType=DECIMAL} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{retainage,jdbcType=DECIMAL} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{startSales,jdbcType=BIGINT} , #{targetSales,jdbcType=BIGINT} , #{validStatus,jdbcType=INTEGER} , #{advanceReviewId,jdbcType=BIGINT} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaRetainageChginvDO entity);
    /**
     * desc:?��?�表:TA_RETAINAGE_CHGINV.<br/>
     * descSql =  UPDATE TA_RETAINAGE_CHGINV SET REMARK = #{remark,jdbcType=VARCHAR} ,DISCOUNT = #{discount,jdbcType=DECIMAL} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,RETAINAGE = #{retainage,jdbcType=DECIMAL} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,START_SALES = #{startSales,jdbcType=BIGINT} ,TARGET_SALES = #{targetSales,jdbcType=BIGINT} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,ADVANCE_REVIEW_ID = #{advanceReviewId,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaRetainageChginvDO entity);
    /**
     * desc:?��??主�?????��?��??:TA_RETAINAGE_CHGINV.<br/>
     * descSql =  DELETE FROM TA_RETAINAGE_CHGINV WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:?��??主�???��???��??:TA_RETAINAGE_CHGINV.<br/>
     * descSql =  SELECT * FROM TA_RETAINAGE_CHGINV WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaRetainageChginvDO
     */
    TaRetainageChginvDO getByPrimary(Long id);
    /**
     * desc:获取可变尾款最低价:TA_RETAINAGE_CHGINV.<br/>
     * descSql =  SELECT RETAINAGE FROM ta_retainage_chginv WHERE ADVANCE_REVIEW_ID = #{advenceReviewid,jdbcType=BIGINT} ORDER BY RETAINAGE ASC LIMIT 1
     * @param advenceReviewid advenceReviewid
     * @return BigDecimal
     */
    BigDecimal getRetainageInYes(Long advenceReviewid);
    /**
     * desc:删除商品变价:TA_RETAINAGE_CHGINV.<br/>
     * descSql =  DELETE FROM TA_RETAINAGE_CHGINV WHERE ADVANCE_REVIEW_ID = #{advanceReviewId,jdbcType=BIGINT}
     * @param advanceReviewId advanceReviewId
     * @return Long
     */
    Long deleteByAdvanceReview(Long advanceReviewId);
    /**
     * desc:获得商品变价:TA_RETAINAGE_CHGINV.<br/>
     * descSql =  SELECT * FROM TA_RETAINAGE_CHGINV WHERE ADVANCE_REVIEW_ID = #{advanceReviewId,jdbcType=BIGINT}
     * @param advanceReviewId advanceReviewId
     * @return List<TaRetainageChginvDO>
     */
    List<TaRetainageChginvDO> getByAdvanceReview(Long advanceReviewId);
}
