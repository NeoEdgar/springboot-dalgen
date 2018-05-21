package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaRoleResLimitsDO;
import java.util.List;
import com.xl.dy.dal.mapper.TaRoleResLimitsDOMapper;

/**
* The Table TA_ROLE_RES_LIMITS.
* TA_ROLE_RES_LIMITS
*/
@Repository
public class TaRoleResLimitsDAO{

    @Autowired
    private TaRoleResLimitsDOMapper taRoleResLimitsDOMapper;

    /**
     * desc:插入表:TA_ROLE_RES_LIMITS.<br/>
     * descSql =  INSERT INTO TA_ROLE_RES_LIMITS( ID ,REMARK ,ROLE_ID ,PF_MENU_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,RES_LIMITS_ID ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{roleId,jdbcType=BIGINT} , #{pfMenuId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{resLimitsId,jdbcType=BIGINT} , #{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaRoleResLimitsDO entity){
        return taRoleResLimitsDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_ROLE_RES_LIMITS.<br/>
     * descSql =  UPDATE TA_ROLE_RES_LIMITS SET REMARK = #{remark,jdbcType=VARCHAR} ,ROLE_ID = #{roleId,jdbcType=BIGINT} ,PF_MENU_ID = #{pfMenuId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,RES_LIMITS_ID = #{resLimitsId,jdbcType=BIGINT} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaRoleResLimitsDO entity){
        return taRoleResLimitsDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_ROLE_RES_LIMITS.<br/>
     * descSql =  DELETE FROM TA_ROLE_RES_LIMITS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taRoleResLimitsDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_ROLE_RES_LIMITS.<br/>
     * descSql =  SELECT * FROM TA_ROLE_RES_LIMITS WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaRoleResLimitsDO
     */
    public TaRoleResLimitsDO getByPrimary(Long id){
        return taRoleResLimitsDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据角色ID修改有效性状态.<br/>
     * descSql =  UPDATE TA_ROLE_RES_LIMITS SET VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ROLE_ID = #{roleId,jdbcType=BIGINT}
     * @param roleId roleId
     * @param validStatus validStatus
     * @return Long
     */
    public Long updateValidate(Long roleId,Integer validStatus){
        return taRoleResLimitsDOMapper.updateValidate(roleId, validStatus);
    }
    /**
     * desc:根据角色ID获取其菜单ID以及权限ID.<br/>
     * descSql =  SELECT * FROM TA_ROLE_RES_LIMITS WHERE ROLE_ID = #{roleId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param roleId roleId
     * @return List<TaRoleResLimitsDO>
     */
    public List<TaRoleResLimitsDO> getMenuIdAndLimitIdByRoleId(Long roleId){
        return taRoleResLimitsDOMapper.getMenuIdAndLimitIdByRoleId(roleId);
    }
    /**
     * desc:根据角色ID获取菜单ID列表.<br/>
     * descSql =  SELECT PF_MENU_ID FROM TA_ROLE_RES_LIMITS WHERE ROLE_ID = #{roleId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param roleId roleId
     * @return List<TaRoleResLimitsDO>
     */
    public List<TaRoleResLimitsDO> getMenuIdByRole(Long roleId){
        return taRoleResLimitsDOMapper.getMenuIdByRole(roleId);
    }
    /**
     * desc:根据菜单ID获取权限ID列表.<br/>
     * descSql =  SELECT RES_LIMITS_ID FROM TA_ROLE_RES_LIMITS WHERE PF_MENU_ID = #{pfMenuId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param pfMenuId pfMenuId
     * @return List<TaRoleResLimitsDO>
     */
    public List<TaRoleResLimitsDO> getLimitIdByMenuId(Long pfMenuId){
        return taRoleResLimitsDOMapper.getLimitIdByMenuId(pfMenuId);
    }
    /**
     * desc:根据角色ID删除所有有关数据:RES_LIMITS_ID.<br/>
     * descSql =  DELETE FROM TA_ROLE_RES_LIMITS WHERE ROLE_ID = #{roleId,jdbcType=BIGINT}
     * @param roleId roleId
     * @return Long
     */
    public Long deleteByRoleId(Long roleId){
        return taRoleResLimitsDOMapper.deleteByRoleId(roleId);
    }
}
