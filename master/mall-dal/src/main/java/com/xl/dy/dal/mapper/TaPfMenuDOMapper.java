package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaPfMenuDO;
import java.lang.String;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_PF_MENU.
 * TA_PF_MENU
 */
public interface TaPfMenuDOMapper{

    /**
     * desc:插入表:TA_PF_MENU.<br/>
     * descSql =  INSERT INTO TA_PF_MENU( ID ,FR ,INX ,LEV ,PID ,CODE ,ICON ,NAME ,PARAM ,REMARK ,ALTER_EMPL ,ALTER_TIME ,ROLE_RES_ID ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} ,#{fr,jdbcType=VARCHAR} ,#{inx,jdbcType=INTEGER} ,#{lev,jdbcType=INTEGER} ,#{pid,jdbcType=BIGINT} ,#{code,jdbcType=VARCHAR} ,#{icon,jdbcType=VARCHAR} ,#{name,jdbcType=VARCHAR} ,#{param,jdbcType=VARCHAR} ,#{remark,jdbcType=VARCHAR} ,#{alterEmpl,jdbcType=BIGINT} ,#{alterTime,jdbcType=TIMESTAMP} ,#{roleResId,jdbcType=BIGINT} ,#{timestamp,jdbcType=BIGINT} ,#{createEmpl,jdbcType=BIGINT} ,#{createTime,jdbcType=TIMESTAMP} ,#{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaPfMenuDO entity);
    /**
     * desc:更新表:TA_PF_MENU.<br/>
     * descSql =  UPDATE TA_PF_MENU SET FR = #{fr,jdbcType=VARCHAR} ,INX = #{inx,jdbcType=INTEGER} ,LEV = #{lev,jdbcType=INTEGER} ,PID = #{pid,jdbcType=BIGINT} ,CODE = #{code,jdbcType=VARCHAR} ,ICON = #{icon,jdbcType=VARCHAR} ,NAME = #{name,jdbcType=VARCHAR} ,PARAM = #{param,jdbcType=VARCHAR} ,REMARK = #{remark,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,ROLE_RES_ID = #{roleResId,jdbcType=BIGINT} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaPfMenuDO entity);
    /**
     * desc:根据主键删除数据:TA_PF_MENU.<br/>
     * descSql =  DELETE FROM TA_PF_MENU WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:选择性更新表:TA_PF_MENU.<br/>
     * descSql =  UPDATE TA_PF_MENU FR = #{fr,jdbcType=VARCHAR}, INX = #{inx,jdbcType=INTEGER}, LEV = #{lev,jdbcType=INTEGER}, PID = #{pid,jdbcType=BIGINT}, CODE = #{code,jdbcType=VARCHAR}, ICON = #{icon,jdbcType=VARCHAR}, NAME = #{name,jdbcType=VARCHAR}, PARAM = #{param,jdbcType=VARCHAR}, REMARK = #{remark,jdbcType=VARCHAR}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, ROLE_RES_ID = #{roleResId,jdbcType=BIGINT}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long updateByPrimarySelective(TaPfMenuDO entity);
    /**
     * desc:根据主键获取数据:TA_PF_MENU.<br/>
     * descSql =  SELECT * FROM TA_PF_MENU WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaPfMenuDO
     */
    TaPfMenuDO getByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_PF_MENU.<br/>
     * descSql =  SELECT * FROM TA_PF_MENU WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaPfMenuDO
     */
    TaPfMenuDO getByPrimarySelective(Long id);
    /**
     * desc:获取全路径:FR.<br/>
     * descSql =  call P_GET_TREE_PARENT_IDS(#{argChildId,jdbcType=BIGINT},#{argTableName,jdbcType=VARCHAR},#{argIdColName,jdbcType=VARCHAR},#{argPidColName,jdbcType=VARCHAR})
     * @param argChildId argChildId
     * @param argIdColName argIdColName
     * @param argTableName argTableName
     * @param argPidColName argPidColName
     * @return String
     */
    String getFr(@Param("argChildId")Long argChildId,@Param("argIdColName")String argIdColName,@Param("argTableName")String argTableName,@Param("argPidColName")String argPidColName);
    /**
     * desc:获取子列表.<br/>
     * descSql =  SELECT ID ,NAME FROM TA_PF_MENU WHERE PID = #{id,jdbcType=BIGINT} ORDER BY INX
     * @param id id
     * @return List<TaPfMenuDO>
     */
    List<TaPfMenuDO> findMenuChildList(Long id);
    /**
     * desc:获取一级列表.<br/>
     * descSql =  SELECT * FROM TA_PF_MENU WHERE LEV = 1 AND pid=-1 ORDER BY INX
     * @return List<TaPfMenuDO>
     */
    List<TaPfMenuDO> findMenuTopList();
    /**
     * desc:根据菜单ID获取对应的资源ID.<br/>
     * descSql =  SELECT ROLE_RES_ID FROM TA_PF_MENU WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return Long
     */
    Long findResIdByMenuId(Long id);
    /**
     * desc:获取所有菜单信息.<br/>
     * descSql =  SELECT * FROM TA_PF_MENU
     * @return List<TaPfMenuDO>
     */
    List<TaPfMenuDO> findAllMenu();
    /**
     * desc:根据资源ID获取菜单信息.<br/>
     * descSql =  SELECT * FROM TA_PF_MENU WHERE ROLE_RES_ID = #{roleResId,jdbcType=BIGINT}
     * @param roleResId roleResId
     * @return TaPfMenuDO
     */
    TaPfMenuDO getMenuInfoByResId(Long roleResId);
    /**
     * desc:获取所有有效数据:TA_PF_MENU.<br/>
     * descSql =  SELECT ID ,NAME ,ROLE_RES_ID FROM TA_PF_MENU WHERE VALID_STATUS = 1
     * @return List<Map>
     */
    List<Map> getAllValidInfo();
    /**
     * desc:根据父ID获取子菜单信息列表.<br/>
     * descSql =  SELECT ID,NAME, INX FROM TA_PF_MENU WHERE PID = #{pid,jdbcType=BIGINT}
     * @param pid pid
     * @return List<TaPfMenuDO>
     */
    List<TaPfMenuDO> findMenuInfoByFrId(Long pid);
}
