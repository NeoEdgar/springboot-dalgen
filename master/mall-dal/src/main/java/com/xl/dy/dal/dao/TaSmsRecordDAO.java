package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaSmsRecordDO;
import com.xl.dy.dal.mapper.TaSmsRecordDOMapper;

/**
* The Table TA_SMS_RECORD.
* TA_SMS_RECORD
*/
@Repository
public class TaSmsRecordDAO{

    @Autowired
    private TaSmsRecordDOMapper taSmsRecordDOMapper;

    /**
     * desc:插入表:TA_SMS_RECORD.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_SMS_RECORD( ID ,REMARK ,CONTENT ,ALTER_EMPL ,ALTER_TIME ,TELEPHONE ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{content,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{telephone,jdbcType=VARCHAR} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaSmsRecordDO entity){
        return taSmsRecordDOMapper.insert(entity);
    }
}
