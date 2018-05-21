package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaContractChginvPhotoDO;
import com.xl.dy.dal.mapper.TaContractChginvPhotoDOMapper;

/**
* The Table TA_CONTRACT_CHGINV_PHOTO.
* TA_CONTRACT_CHGINV_PHOTO
*/
@Repository
public class TaContractChginvPhotoDAO{

    @Autowired
    private TaContractChginvPhotoDOMapper taContractChginvPhotoDOMapper;

    /**
     * desc:插入表:TA_CONTRACT_CHGINV_PHOTO.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_CONTRACT_CHGINV_PHOTO( ID ,INX ,REMARK ,PHOTO_URL ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,CONTRACT_CHG_INVOICES_ID )VALUES( #{id,jdbcType=BIGINT} , #{inx,jdbcType=INTEGER} , #{remark,jdbcType=VARCHAR} , #{photoUrl,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{contractChgInvoicesId,jdbcType=BIGINT} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaContractChginvPhotoDO entity){
        return taContractChginvPhotoDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_CONTRACT_CHGINV_PHOTO.<br/>
     * descSql =  UPDATE TA_CONTRACT_CHGINV_PHOTO SET INX = #{inx,jdbcType=INTEGER} ,REMARK = #{remark,jdbcType=VARCHAR} ,PHOTO_URL = #{photoUrl,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,CONTRACT_CHG_INVOICES_ID = #{contractChgInvoicesId,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaContractChginvPhotoDO entity){
        return taContractChginvPhotoDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_CONTRACT_CHGINV_PHOTO.<br/>
     * descSql =  DELETE FROM TA_CONTRACT_CHGINV_PHOTO WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taContractChginvPhotoDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_CONTRACT_CHGINV_PHOTO.<br/>
     * descSql =  SELECT * FROM TA_CONTRACT_CHGINV_PHOTO WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaContractChginvPhotoDO
     */
    public TaContractChginvPhotoDO getByPrimary(Long id){
        return taContractChginvPhotoDOMapper.getByPrimary(id);
    }
}
