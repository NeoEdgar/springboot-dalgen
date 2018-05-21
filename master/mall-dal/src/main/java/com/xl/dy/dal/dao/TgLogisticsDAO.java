package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TgLogisticsDO;
import com.xl.dy.dal.mapper.TgLogisticsDOMapper;

/**
* The Table TG_LOGISTICS.
* TG_LOGISTICS
*/
@Repository
public class TgLogisticsDAO{

    @Autowired
    private TgLogisticsDOMapper tgLogisticsDOMapper;

    /**
     * desc:插入表:TG_LOGISTICS.<br/>
     * descSql =  INSERT INTO TG_LOGISTICS( ID ,CODE ,NAME ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME )VALUES( #{id,jdbcType=BIGINT} , #{code,jdbcType=VARCHAR} , #{name,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TgLogisticsDO entity){
        return tgLogisticsDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TG_LOGISTICS.<br/>
     * descSql =  UPDATE TG_LOGISTICS SET CODE = #{code,jdbcType=VARCHAR} ,NAME = #{name,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TgLogisticsDO entity){
        return tgLogisticsDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TG_LOGISTICS.<br/>
     * descSql =  DELETE FROM TG_LOGISTICS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return tgLogisticsDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TG_LOGISTICS.<br/>
     * descSql =  SELECT * FROM TG_LOGISTICS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TgLogisticsDO
     */
    public TgLogisticsDO getByPrimary(Long id){
        return tgLogisticsDOMapper.getByPrimary(id);
    }
    /**
     * desc:插入表:TG_LOGISTICS.<br/>
     * descSql =  INSERT INTO TG_LOGISTICS( ID ,CODE ,NAME ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME )VALUES( #{id,jdbcType=BIGINT} , #{code,jdbcType=VARCHAR} , #{name,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} )
     * @param entity entity
     * @return TgLogisticsDO
     */
    public TgLogisticsDO add(TgLogisticsDO entity){
        return tgLogisticsDOMapper.add(entity);
    }
}
