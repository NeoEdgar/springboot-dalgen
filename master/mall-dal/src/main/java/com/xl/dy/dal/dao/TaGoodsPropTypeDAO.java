package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaGoodsPropTypeDO;
import java.util.List;
import com.xl.dy.dal.mapper.TaGoodsPropTypeDOMapper;

/**
* The Table TA_GOODS_PROP_TYPE.
* TA_GOODS_PROP_TYPE
*/
@Repository
public class TaGoodsPropTypeDAO{

    @Autowired
    private TaGoodsPropTypeDOMapper taGoodsPropTypeDOMapper;

    /**
     * desc:插入表:TA_GOODS_PROP_TYPE.<br/>
     * descSql =  INSERT INTO TA_GOODS_PROP_TYPE( ID ,REMARK ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,GOODS_PROP_TYPE_NAME )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{goodsPropTypeName,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaGoodsPropTypeDO entity){
        return taGoodsPropTypeDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_GOODS_PROP_TYPE.<br/>
     * descSql =  UPDATE TA_GOODS_PROP_TYPE SET REMARK = #{remark,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,GOODS_PROP_TYPE_NAME = #{goodsPropTypeName,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaGoodsPropTypeDO entity){
        return taGoodsPropTypeDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_GOODS_PROP_TYPE.<br/>
     * descSql =  DELETE FROM TA_GOODS_PROP_TYPE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taGoodsPropTypeDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_GOODS_PROP_TYPE.<br/>
     * descSql =  SELECT * FROM TA_GOODS_PROP_TYPE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaGoodsPropTypeDO
     */
    public TaGoodsPropTypeDO getByPrimary(Long id){
        return taGoodsPropTypeDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据主键获取有效性数据:TA_GOODS_PROP_TYPE.<br/>
     * descSql =  SELECT * FROM TA_GOODS_PROP_TYPE WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaGoodsPropTypeDO
     */
    public TaGoodsPropTypeDO getByPrimarySelective(Long id){
        return taGoodsPropTypeDOMapper.getByPrimarySelective(id);
    }
    /**
     * desc:判断属性名是否已存在.<br/>
     * descSql =  SELECT COUNT(*) FROM TA_GOODS_PROP_TYPE WHERE GOODS_PROP_TYPE_NAME = #{goodsPropTypeName,jdbcType=VARCHAR} AND VALID_STATUS = 1
     * @param goodsPropTypeName goodsPropTypeName
     * @return int
     */
    public int getCountByName(String goodsPropTypeName){
        return taGoodsPropTypeDOMapper.getCountByName(goodsPropTypeName);
    }
    /**
     * desc:获取所有有效属性名:TA_GOODS_PROP_TYPE.<br/>
     * descSql =  SELECT GOODS_PROP_TYPE_NAME FROM TA_GOODS_PROP_TYPE WHERE VALID_STATUS = 1
     * @return List<TaGoodsPropTypeDO>
     */
    public List<TaGoodsPropTypeDO> getAllPropName(){
        return taGoodsPropTypeDOMapper.getAllPropName();
    }
    /**
     * desc:根据主键获取数据:TA_GOODS_PROP_TYPE.<br/>
     * descSql =  SELECT ID FROM TA_GOODS_PROP_TYPE WHERE GOODS_PROP_TYPE_NAME = #{goodsPropTypeName,jdbcType=VARCHAR}
     * @param goodsPropTypeName goodsPropTypeName
     * @return Long
     */
    public Long getByPropName(String goodsPropTypeName){
        return taGoodsPropTypeDOMapper.getByPropName(goodsPropTypeName);
    }
}
