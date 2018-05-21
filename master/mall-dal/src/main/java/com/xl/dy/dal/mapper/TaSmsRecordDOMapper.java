package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaSmsRecordDO;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_SMS_RECORD.
 * TA_SMS_RECORD
 */
public interface TaSmsRecordDOMapper{

    /**
     * desc:插入表:TA_SMS_RECORD.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_SMS_RECORD( ID ,REMARK ,CONTENT ,ALTER_EMPL ,ALTER_TIME ,TELEPHONE ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{content,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{telephone,jdbcType=VARCHAR} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaSmsRecordDO entity);
}
