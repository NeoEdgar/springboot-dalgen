package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaEmplRoleAuthDO;
import java.util.List;
import com.xl.dy.dal.mapper.TaEmplRoleAuthDOMapper;

/**
* The Table TA_EMPL_ROLE_AUTH.
* TA_EMPL_ROLE_AUTH
*/
@Repository
public class TaEmplRoleAuthDAO{

    @Autowired
    private TaEmplRoleAuthDOMapper taEmplRoleAuthDOMapper;

    /**
     * desc:插入表:TA_EMPL_ROLE_AUTH.<br/>
     * descSql =  INSERT INTO TA_EMPL_ROLE_AUTH( ID ,NAME ,EMPL_ID ,REMARK ,ROLE_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{name,jdbcType=VARCHAR} , #{emplId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{roleId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaEmplRoleAuthDO entity){
        return taEmplRoleAuthDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_EMPL_ROLE_AUTH.<br/>
     * descSql =  UPDATE TA_EMPL_ROLE_AUTH SET NAME = #{name,jdbcType=VARCHAR} ,EMPL_ID = #{emplId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,ROLE_ID = #{roleId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaEmplRoleAuthDO entity){
        return taEmplRoleAuthDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_EMPL_ROLE_AUTH.<br/>
     * descSql =  DELETE FROM TA_EMPL_ROLE_AUTH WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taEmplRoleAuthDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键删除数据:TA_EMPL_ROLE_AUTH.<br/>
     * descSql =  DELETE FROM TA_EMPL_ROLE_AUTH WHERE ROLE_ID = #{roleId,jdbcType=BIGINT} AND EMPL_ID = #{EmplId,jdbcType=BIGINT}
     * @param EmplId EmplId
     * @param roleId roleId
     * @return Long
     */
    public Long deleteByRoleIdAndEnplId(Long EmplId,Long roleId){
        return taEmplRoleAuthDOMapper.deleteByRoleIdAndEnplId(EmplId, roleId);
    }
    /**
     * desc:根据主键获取数据:TA_EMPL_ROLE_AUTH.<br/>
     * descSql =  SELECT * FROM TA_EMPL_ROLE_AUTH WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaEmplRoleAuthDO
     */
    public TaEmplRoleAuthDO getByPrimary(Long id){
        return taEmplRoleAuthDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_EMPL_ROLE_AUTH.<br/>
     * descSql =  SELECT * FROM TA_EMPL_ROLE_AUTH WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaEmplRoleAuthDO
     */
    public TaEmplRoleAuthDO getByPrimarySelective(Long id){
        return taEmplRoleAuthDOMapper.getByPrimarySelective(id);
    }
    /**
     * desc:根据主键获取数据:TA_EMPL_ROLE_AUTH.<br/>
     * descSql =  SELECT * FROM TA_EMPL_ROLE_AUTH WHERE ROLE_ID = #{roleId,jdbcType=BIGINT} AND EMPL_ID = #{emplId,jdbcType=BIGINT}
     * @param emplId emplId
     * @param roleId roleId
     * @return TaEmplRoleAuthDO
     */
    public TaEmplRoleAuthDO getByRoleIdAndEmplId(Long emplId,Long roleId){
        return taEmplRoleAuthDOMapper.getByRoleIdAndEmplId(emplId, roleId);
    }
    /**
     * desc:根据用户ID获取角色列表.<br/>
     * descSql =  SELECT * FROM TA_EMPL_ROLE_AUTH WHERE EMPL_ID = #{emplId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param emplId emplId
     * @return List<TaEmplRoleAuthDO>
     */
    public List<TaEmplRoleAuthDO> getByUserId(Long emplId){
        return taEmplRoleAuthDOMapper.getByUserId(emplId);
    }
    /**
     * desc:删除角色授权:TA_EMPL_ROLE_AUTH.<br/>
     * descSql =  UPDATE TA_EMPL_ROLE_AUTH SET VALID_STATUS = 0 WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long deleteRoleAuthById(TaEmplRoleAuthDO entity){
        return taEmplRoleAuthDOMapper.deleteRoleAuthById(entity);
    }
    /**
     * desc:删除角色授权:TA_EMPL_ROLE_AUTH.<br/>
     * descSql =  DELETE FROM TA_EMPL_ROLE_AUTH WHERE EMPL_ID = #{EmplId,jdbcType=BIGINT}
     * @param EmplId EmplId
     * @return Long
     */
    public Long deleteByEmplId(Long EmplId){
        return taEmplRoleAuthDOMapper.deleteByEmplId(EmplId);
    }
    /**
     * desc:更新表:.<br/>
     * descSql =  UPDATE TA_EMPL_ROLE_AUTH SET EMPL_ID = #{emplId,jdbcType=BIGINT}, REMARK = #{remark,jdbcType=VARCHAR}, ROLE_ID = #{roleId,jdbcType=BIGINT}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, NAME = #{name,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long updateByPrimary(TaEmplRoleAuthDO entity){
        return taEmplRoleAuthDOMapper.updateByPrimary(entity);
    }
    /**
     * desc:更新表:TA_EMPL_ROLE_AUTH.<br/>
     * descSql =  UPDATE TA_EMPL_ROLE_AUTH SET ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ROLE_ID = #{roleId,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long updateRole(TaEmplRoleAuthDO entity){
        return taEmplRoleAuthDOMapper.updateRole(entity);
    }
    /**
     * desc:根据主键获取数据:TA_ROLE.<br/>
     * descSql =  SELECT a.ROLE_ID as ROLE_ID FROM TA_EMPL_ROLE_AUTH a LEFT JOIN TA_EMPL b ON a.EMPL_ID=b.ID WHERE b.ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long getRoleIdByEmplId(Long id){
        return taEmplRoleAuthDOMapper.getRoleIdByEmplId(id);
    }
    /**
     * desc:根据EmolID获取名字:TA_ROLE.<br/>
     * descSql =  SELECT NAME FROM TA_EMPL_ROLE_AUTH WHERE EMPL_ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return String
     */
    public String getNameByEmplId(Long id){
        return taEmplRoleAuthDOMapper.getNameByEmplId(id);
    }
}
