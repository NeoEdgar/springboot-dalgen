package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaRoleMenuDO;
import java.util.List;
import com.xl.dy.dal.mapper.TaRoleMenuDOMapper;

/**
* The Table TA_ROLE_MENU.
* TA_ROLE_MENU
*/
@Repository
public class TaRoleMenuDAO{

    @Autowired
    private TaRoleMenuDOMapper taRoleMenuDOMapper;

    /**
     * desc:插入表:TA_ROLE_MENU.<br/>
     * descSql =  INSERT INTO TA_ROLE_MENU( ID ,REMARK ,ROLE_ID ,PF_MENU_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{roleId,jdbcType=BIGINT} , #{pfMenuId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaRoleMenuDO entity){
        return taRoleMenuDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_ROLE_MENU.<br/>
     * descSql =  UPDATE TA_ROLE_MENU SET REMARK = #{remark,jdbcType=VARCHAR} ,ROLE_ID = #{roleId,jdbcType=BIGINT} ,PF_MENU_ID = #{pfMenuId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaRoleMenuDO entity){
        return taRoleMenuDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_ROLE_MENU.<br/>
     * descSql =  DELETE FROM TA_ROLE_MENU WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taRoleMenuDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_ROLE_MENU.<br/>
     * descSql =  SELECT * FROM TA_ROLE_MENU WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaRoleMenuDO
     */
    public TaRoleMenuDO getByPrimary(Long id){
        return taRoleMenuDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据角色ID修改有效性状态.<br/>
     * descSql =  UPDATE TA_ROLE_MENU SET VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ROLE_ID = #{roleId,jdbcType=BIGINT}
     * @param roleId roleId
     * @param validStatus validStatus
     * @return Long
     */
    public Long updateValidate(Long roleId,Integer validStatus){
        return taRoleMenuDOMapper.updateValidate(roleId, validStatus);
    }
    /**
     * desc:根据角色ID获取菜单ID列表.<br/>
     * descSql =  SELECT PF_MENU_ID FROM TA_ROLE_MENU WHERE ROLE_ID = #{roleId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param roleId roleId
     * @return List<TaRoleMenuDO>
     */
    public List<TaRoleMenuDO> getMenuIdByRole(Long roleId){
        return taRoleMenuDOMapper.getMenuIdByRole(roleId);
    }
    /**
     * desc:根据角色ID删除所有有关数据:TA_ROLE_MENU.<br/>
     * descSql =  DELETE FROM TA_ROLE_MENU WHERE ROLE_ID = #{roleId,jdbcType=BIGINT}
     * @param roleId roleId
     * @return Long
     */
    public Long deleteByRoleId(Long roleId){
        return taRoleMenuDOMapper.deleteByRoleId(roleId);
    }
}
