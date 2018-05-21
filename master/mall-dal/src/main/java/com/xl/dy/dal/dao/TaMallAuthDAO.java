package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaMallAuthDO;
import com.xl.dy.dal.mapper.TaMallAuthDOMapper;

/**
* The Table TA_MALL_AUTH.
* TA_MALL_AUTH
*/
@Repository
public class TaMallAuthDAO{

    @Autowired
    private TaMallAuthDOMapper taMallAuthDOMapper;

    /**
     * desc:插入表:TA_MALL_AUTH.<br/>
     * descSql =  INSERT INTO TA_MALL_AUTH( ID ,MALL_ID ,REMARK ,ERP_ACC_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{mallId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{erpAccId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaMallAuthDO entity){
        return taMallAuthDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_MALL_AUTH.<br/>
     * descSql =  UPDATE TA_MALL_AUTH SET MALL_ID = #{mallId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,ERP_ACC_ID = #{erpAccId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaMallAuthDO entity){
        return taMallAuthDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_MALL_AUTH.<br/>
     * descSql =  DELETE FROM TA_MALL_AUTH WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taMallAuthDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_MALL_AUTH.<br/>
     * descSql =  SELECT * FROM TA_MALL_AUTH WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaMallAuthDO
     */
    public TaMallAuthDO getByPrimary(Long id){
        return taMallAuthDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据商场ID获取数据:TA_MALL_AUTH.<br/>
     * descSql =  SELECT ERP_ACC_ID FROM TA_MALL_AUTH WHERE MALL_ID = #{mallId,jdbcType=BIGINT}
     * @param mallId mallId
     * @return Long
     */
    public Long getMallAuthByMallId(Long mallId){
        return taMallAuthDOMapper.getMallAuthByMallId(mallId);
    }
}
