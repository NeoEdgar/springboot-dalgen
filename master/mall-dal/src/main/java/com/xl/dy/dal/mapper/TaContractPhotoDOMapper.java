package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaContractPhotoDO;
import java.util.Map;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_CONTRACT_PHOTO.
 * TA_CONTRACT_PHOTO
 */
public interface TaContractPhotoDOMapper{

    /**
     * desc:插入表:TA_CONTRACT_PHOTO.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_CONTRACT_PHOTO( ID ,INX ,REMARK ,PHOTO_URL ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CONTRACT_ID ,CREATE_EMPL ,CREATE_TIME ,ORI_PHOTO_URL ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{inx,jdbcType=INTEGER} , #{remark,jdbcType=VARCHAR} , #{photoUrl,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{contractId,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{oriPhotoUrl,jdbcType=VARCHAR} , #{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaContractPhotoDO entity);
    /**
     * desc:更新表:TA_CONTRACT_PHOTO.<br/>
     * descSql =  UPDATE TA_CONTRACT_PHOTO SET INX = #{inx,jdbcType=INTEGER} ,REMARK = #{remark,jdbcType=VARCHAR} ,PHOTO_URL = #{photoUrl,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CONTRACT_ID = #{contractId,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,ORI_PHOTO_URL = #{oriPhotoUrl,jdbcType=VARCHAR} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaContractPhotoDO entity);
    /**
     * desc:根据主键删除数据:TA_CONTRACT_PHOTO.<br/>
     * descSql =  DELETE FROM TA_CONTRACT_PHOTO WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_CONTRACT_PHOTO.<br/>
     * descSql =  SELECT * FROM TA_CONTRACT_PHOTO WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaContractPhotoDO
     */
    TaContractPhotoDO getByPrimary(Long id);
    /**
     * desc:根据合同获取数据:TA_CONTRACT_PHOTO.<br/>
     * descSql =  SELECT ID id,PHOTO_URL photoUrl FROM TA_CONTRACT_PHOTO WHERE CONTRACT_ID = #{contractId,jdbcType=BIGINT}
     * @param contractId contractId
     * @return List<Map>
     */
    List<Map> getByContractId(Long contractId);
}
