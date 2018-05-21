package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaShopSignDO;
import java.util.Date;
import com.xl.dy.dal.mapper.TaShopSignDOMapper;

/**
* The Table TA_SHOP_SIGN.
* TA_SHOP_SIGN
*/
@Repository
public class TaShopSignDAO{

    @Autowired
    private TaShopSignDOMapper taShopSignDOMapper;

    /**
     * desc:插入表:TA_SHOP_SIGN.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_SHOP_SIGN( ID ,URL ,REMARK ,SHOP_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,SHOP_SIGN_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{url,jdbcType=VARCHAR} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{shopSignStatus,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaShopSignDO entity){
        return taShopSignDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_SHOP_SIGN.<br/>
     * descSql =  UPDATE TA_SHOP_SIGN SET URL = #{url,jdbcType=VARCHAR} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,SHOP_SIGN_STATUS = #{shopSignStatus,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaShopSignDO entity){
        return taShopSignDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_SHOP_SIGN.<br/>
     * descSql =  DELETE FROM TA_SHOP_SIGN WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taShopSignDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_SIGN.<br/>
     * descSql =  SELECT * FROM TA_SHOP_SIGN WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopSignDO
     */
    public TaShopSignDO getByPrimary(Long id){
        return taShopSignDOMapper.getByPrimary(id);
    }
    /**
     * desc:更新表:TA_SHOP_SIGN.<br/>
     * descSql =  UPDATE TA_SHOP_SIGN SET SHOP_SIGN_STATUS = #{shopSignStatus,jdbcType=VARCHAR}, ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} WHERE SHOP_ID = #{id,jdbcType=BIGINT}
     * @param alterTime alterTime
     * @param id id
     * @param alterEmpl alterEmpl
     * @param timestamp timestamp
     * @param shopSignStatus shopSignStatus
     * @return Long
     */
    public Long updateSignStatus(Date alterTime,Long id,Long alterEmpl,Long timestamp,String shopSignStatus){
        return taShopSignDOMapper.updateSignStatus(alterTime, id, alterEmpl, timestamp, shopSignStatus);
    }
}
