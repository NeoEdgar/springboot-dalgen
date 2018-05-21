package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaRoleMenuDO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_ROLE_MENU.
 * TA_ROLE_MENU
 */
public interface TaRoleMenuDOMapper{

    /**
     * desc:插入表:TA_ROLE_MENU.<br/>
     * descSql =  INSERT INTO TA_ROLE_MENU( ID ,REMARK ,ROLE_ID ,PF_MENU_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{roleId,jdbcType=BIGINT} , #{pfMenuId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaRoleMenuDO entity);
    /**
     * desc:更新表:TA_ROLE_MENU.<br/>
     * descSql =  UPDATE TA_ROLE_MENU SET REMARK = #{remark,jdbcType=VARCHAR} ,ROLE_ID = #{roleId,jdbcType=BIGINT} ,PF_MENU_ID = #{pfMenuId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaRoleMenuDO entity);
    /**
     * desc:根据主键删除数据:TA_ROLE_MENU.<br/>
     * descSql =  DELETE FROM TA_ROLE_MENU WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_ROLE_MENU.<br/>
     * descSql =  SELECT * FROM TA_ROLE_MENU WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaRoleMenuDO
     */
    TaRoleMenuDO getByPrimary(Long id);
    /**
     * desc:根据角色ID修改有效性状态.<br/>
     * descSql =  UPDATE TA_ROLE_MENU SET VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ROLE_ID = #{roleId,jdbcType=BIGINT}
     * @param roleId roleId
     * @param validStatus validStatus
     * @return Long
     */
    Long updateValidate(@Param("roleId")Long roleId,@Param("validStatus")Integer validStatus);
    /**
     * desc:根据角色ID获取菜单ID列表.<br/>
     * descSql =  SELECT PF_MENU_ID FROM TA_ROLE_MENU WHERE ROLE_ID = #{roleId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param roleId roleId
     * @return List<TaRoleMenuDO>
     */
    List<TaRoleMenuDO> getMenuIdByRole(Long roleId);
    /**
     * desc:根据角色ID删除所有有关数据:TA_ROLE_MENU.<br/>
     * descSql =  DELETE FROM TA_ROLE_MENU WHERE ROLE_ID = #{roleId,jdbcType=BIGINT}
     * @param roleId roleId
     * @return Long
     */
    Long deleteByRoleId(Long roleId);
}
