package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaEmplShopDO;
import com.xl.dy.dal.mapper.TaEmplShopDOMapper;

/**
* The Table TA_EMPL_SHOP.
* TA_EMPL_SHOP
*/
@Repository
public class TaEmplShopDAO{

    @Autowired
    private TaEmplShopDOMapper taEmplShopDOMapper;

    /**
     * desc:插入表:TA_EMPL_SHOP.<br/>
     * descSql =  INSERT INTO TA_EMPL_SHOP( ID ,EMPL_ID ,REMARK ,SHOP_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{emplId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaEmplShopDO entity){
        return taEmplShopDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_EMPL_SHOP.<br/>
     * descSql =  UPDATE TA_EMPL_SHOP SET EMPL_ID = #{emplId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaEmplShopDO entity){
        return taEmplShopDOMapper.update(entity);
    }
    /**
     * desc:更新表:TA_EMPL_SHOP.<br/>
     * descSql =  UPDATE TA_EMPL_SHOP SET EMPL_ID = #{emplId,jdbcType=BIGINT}, REMARK = #{remark,jdbcType=VARCHAR}, SHOP_ID = #{shopId,jdbcType=BIGINT}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long updateByPrimarySelective(TaEmplShopDO entity){
        return taEmplShopDOMapper.updateByPrimarySelective(entity);
    }
    /**
     * desc:更新表:TA_EMPL_SHOP.<br/>
     * descSql =  UPDATE TA_EMPL_SHOP SET ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE SHOP_ID = #{shopId,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long updateByShopId(TaEmplShopDO entity){
        return taEmplShopDOMapper.updateByShopId(entity);
    }
    /**
     * desc:根据主键删除数据:TA_EMPL_SHOP.<br/>
     * descSql =  DELETE FROM TA_EMPL_SHOP WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taEmplShopDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键删除数据:TA_EMPL_SHOP.<br/>
     * descSql =  DELETE FROM TA_EMPL_SHOP WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND EMPL_ID = #{emplId,jdbcType=BIGINT}
     * @param emplId emplId
     * @param shopId shopId
     * @return Long
     */
    public Long deleteByShopIdAndEmplId(Long emplId,Long shopId){
        return taEmplShopDOMapper.deleteByShopIdAndEmplId(emplId, shopId);
    }
    /**
     * desc:根据主键删除数据:TA_EMPL_SHOP.<br/>
     * descSql =  DELETE FROM TA_EMPL_SHOP WHERE EMPL_ID = #{emplId,jdbcType=BIGINT}
     * @param emplId emplId
     * @return Long
     */
    public Long deleteByEmplId(Long emplId){
        return taEmplShopDOMapper.deleteByEmplId(emplId);
    }
    /**
     * desc:根据主键获取数据:TA_EMPL_SHOP.<br/>
     * descSql =  SELECT * FROM TA_EMPL_SHOP WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaEmplShopDO
     */
    public TaEmplShopDO getByPrimary(Long id){
        return taEmplShopDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_EMPL_SHOP.<br/>
     * descSql =  SELECT * FROM TA_EMPL_SHOP WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaEmplShopDO
     */
    public TaEmplShopDO getByPrimarySelective(Long id){
        return taEmplShopDOMapper.getByPrimarySelective(id);
    }
    /**
     * desc:根据主键获取数据:TA_EMPL_SHOP.<br/>
     * descSql =  SELECT * FROM TA_EMPL_SHOP WHERE EMPL_ID = #{emplId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT}
     * @param emplId emplId
     * @param shopId shopId
     * @return TaEmplShopDO
     */
    public TaEmplShopDO getByEmplIdAndShopId(Long emplId,Long shopId){
        return taEmplShopDOMapper.getByEmplIdAndShopId(emplId, shopId);
    }
}
