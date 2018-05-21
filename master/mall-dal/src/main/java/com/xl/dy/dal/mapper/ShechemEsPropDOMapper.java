package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.ShechemEsPropDO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table SHECHEM_ES_PROP.
 * SHECHEM_ES_PROP
 */
public interface ShechemEsPropDOMapper{

    /**
     * desc:插入表:SHECHEM_ES_PROP.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO SHECHEM_ES_PROP( ID ,JSON )VALUES( #{id,jdbcType=INTEGER} , #{json,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(ShechemEsPropDO entity);
    /**
     * desc:更新表:SHECHEM_ES_PROP.<br/>
     * descSql =  UPDATE SHECHEM_ES_PROP SET JSON = #{json,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=INTEGER}
     * @param entity entity
     * @return Long
     */
    Long update(ShechemEsPropDO entity);
    /**
     * desc:根据主键删除数据:SHECHEM_ES_PROP.<br/>
     * descSql =  DELETE FROM SHECHEM_ES_PROP WHERE ID = #{id,jdbcType=INTEGER}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Integer id);
    /**
     * desc:根据主键获取数据:SHECHEM_ES_PROP.<br/>
     * descSql =  SELECT * FROM SHECHEM_ES_PROP WHERE ID = #{id,jdbcType=INTEGER}
     * @param id id
     * @return ShechemEsPropDO
     */
    ShechemEsPropDO getByPrimary(Integer id);
    /**
     * desc:根据主键获取数据:SHECHEM_ES_PROP.<br/>
     * descSql =  SELECT * FROM SHECHEM_ES_PROP
     * @return List<ShechemEsPropDO>
     */
    List<ShechemEsPropDO> getSkuList();
}
