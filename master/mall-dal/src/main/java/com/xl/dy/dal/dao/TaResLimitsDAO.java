package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaResLimitsDO;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.xl.dy.dal.mapper.TaResLimitsDOMapper;

/**
* The Table TA_RES_LIMITS.
* TA_RES_LIMITS
*/
@Repository
public class TaResLimitsDAO{

    @Autowired
    private TaResLimitsDOMapper taResLimitsDOMapper;

    /**
     * desc:插入表:TA_RES_LIMITS.<br/>
     * descSql =  INSERT INTO TA_RES_LIMITS( ID ,REMARK ,ROLE_RES ,PF_MENU_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,LIMITS_NAME ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{roleRes,jdbcType=BIGINT} , #{pfMenuId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{limitsName,jdbcType=VARCHAR} , #{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaResLimitsDO entity){
        return taResLimitsDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_RES_LIMITS.<br/>
     * descSql =  UPDATE TA_RES_LIMITS SET REMARK = #{remark,jdbcType=VARCHAR} ,ROLE_RES = #{roleRes,jdbcType=BIGINT} ,PF_MENU_ID = #{pfMenuId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,LIMITS_NAME = #{limitsName,jdbcType=VARCHAR} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaResLimitsDO entity){
        return taResLimitsDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_RES_LIMITS.<br/>
     * descSql =  DELETE FROM TA_RES_LIMITS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taResLimitsDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_RES_LIMITS.<br/>
     * descSql =  SELECT * FROM TA_RES_LIMITS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaResLimitsDO
     */
    public TaResLimitsDO getByPrimary(Long id){
        return taResLimitsDOMapper.getByPrimary(id);
    }
    /**
     * desc:更新表:TA_RES_LIMITS.<br/>
     * descSql =  UPDATE TA_RES_LIMITS SET LIMITS_NAME = #{limitsName,jdbcType=VARCHAR}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param alterTime alterTime
     * @param id id
     * @param alterEmpl alterEmpl
     * @param limitsName limitsName
     * @return Long
     */
    public Long updateSelective(Date alterTime,Long id,Long alterEmpl,String limitsName){
        return taResLimitsDOMapper.updateSelective(alterTime, id, alterEmpl, limitsName);
    }
    /**
     * desc:根据系统资源ID，获取相应的权限列表.<br/>
     * descSql =  SELECT ID,LIMITS_NAME FROM TA_RES_LIMITS WHERE ROLE_RES = #{resId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param resId resId
     * @return List<Map>
     */
    public List<Map> getLimitsById(Long resId){
        return taResLimitsDOMapper.getLimitsById(resId);
    }
    /**
     * desc:根据菜单ID，获取相应的权限列表.<br/>
     * descSql =  SELECT ID,LIMITS_NAME NAME FROM TA_RES_LIMITS WHERE PF_MENU_ID = #{pfMenuId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param pfMenuId pfMenuId
     * @return List<Map>
     */
    public List<Map> getLimitsByMenuId(Long pfMenuId){
        return taResLimitsDOMapper.getLimitsByMenuId(pfMenuId);
    }
    /**
     * desc:根据菜单ID获取权限列表.<br/>
     * descSql =  SELECT * FROM TA_RES_LIMITS WHERE PF_MENU_ID = #{pfMenuId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param pfMenuId pfMenuId
     * @return List<TaResLimitsDO>
     */
    public List<TaResLimitsDO> findMenuLimitTree(Long pfMenuId){
        return taResLimitsDOMapper.findMenuLimitTree(pfMenuId);
    }
    /**
     * desc:根据资源ID，插入与之对应的菜单ID.<br/>
     * descSql =  UPDATE TA_RES_LIMITS SET PF_MENU_ID = #{pfMenuId,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @param pfMenuId pfMenuId
     * @return Long
     */
    public Long updateMenuId(Long id,Long pfMenuId){
        return taResLimitsDOMapper.updateMenuId(id, pfMenuId);
    }
    /**
     * desc:更新有效性状态.<br/>
     * descSql =  UPDATE TA_RES_LIMITS SET VALID_STATUS = 0 WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long updateValidStatus(Long id){
        return taResLimitsDOMapper.updateValidStatus(id);
    }
    /**
     * desc:根据资源ID获取数据:TA_RES_LIMITS.<br/>
     * descSql =  SELECT * FROM TA_RES_LIMITS WHERE ROLE_RES = #{roleRes,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param roleRes roleRes
     * @return List<TaResLimitsDO>
     */
    public List<TaResLimitsDO> getByRoleResId(Long roleRes){
        return taResLimitsDOMapper.getByRoleResId(roleRes);
    }
}
