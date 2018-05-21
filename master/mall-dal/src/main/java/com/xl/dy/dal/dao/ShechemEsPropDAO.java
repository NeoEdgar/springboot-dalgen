package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.ShechemEsPropDO;
import java.util.List;
import com.xl.dy.dal.mapper.ShechemEsPropDOMapper;

/**
* The Table SHECHEM_ES_PROP.
* SHECHEM_ES_PROP
*/
@Repository
public class ShechemEsPropDAO{

    @Autowired
    private ShechemEsPropDOMapper shechemEsPropDOMapper;

    /**
     * desc:插入表:SHECHEM_ES_PROP.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO SHECHEM_ES_PROP( ID ,JSON )VALUES( #{id,jdbcType=INTEGER} , #{json,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(ShechemEsPropDO entity){
        return shechemEsPropDOMapper.insert(entity);
    }
    /**
     * desc:更新表:SHECHEM_ES_PROP.<br/>
     * descSql =  UPDATE SHECHEM_ES_PROP SET JSON = #{json,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=INTEGER}
     * @param entity entity
     * @return Long
     */
    public Long update(ShechemEsPropDO entity){
        return shechemEsPropDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:SHECHEM_ES_PROP.<br/>
     * descSql =  DELETE FROM SHECHEM_ES_PROP WHERE ID = #{id,jdbcType=INTEGER}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Integer id){
        return shechemEsPropDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:SHECHEM_ES_PROP.<br/>
     * descSql =  SELECT * FROM SHECHEM_ES_PROP WHERE ID = #{id,jdbcType=INTEGER}
     * @param id id
     * @return ShechemEsPropDO
     */
    public ShechemEsPropDO getByPrimary(Integer id){
        return shechemEsPropDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:SHECHEM_ES_PROP.<br/>
     * descSql =  SELECT * FROM SHECHEM_ES_PROP
     * @return List<ShechemEsPropDO>
     */
    public List<ShechemEsPropDO> getSkuList(){
        return shechemEsPropDOMapper.getSkuList();
    }
}
