package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaEmplDO;
import com.xl.dy.dal.paging.QueryListAccountPage;
import java.util.Map;
import com.xl.dy.dal.paging.QueryMallListAccountPage;
import java.util.List;
import com.xl.dy.dal.mapper.TaEmplDOMapper;

/**
* The Table TA_EMPL.
* TA_EMPL
*/
@Repository
public class TaEmplDAO{

    @Autowired
    private TaEmplDOMapper taEmplDOMapper;

    /**
     * desc:插入表:TA_EMPL.<br/>
     * descSql =  INSERT INTO TA_EMPL( ID ,MAIL ,REMARK ,IS_ADMIN ,PAPER_NO ,USER_PWD ,EMPL_NAME ,USER_NAME ,ALTER_EMPL ,ALTER_TIME ,MOBILE_TEL ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,EMPL_STATUS ,PLATFORM_ID ,VALID_STATUS ,PLATFORM_TYPE )VALUES( #{id,jdbcType=BIGINT} , #{mail,jdbcType=VARCHAR} , #{remark,jdbcType=VARCHAR} , #{isAdmin,jdbcType=INTEGER} , #{paperNo,jdbcType=VARCHAR} , #{userPwd,jdbcType=VARCHAR} , #{emplName,jdbcType=VARCHAR} , #{userName,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{mobileTel,jdbcType=VARCHAR} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{emplStatus,jdbcType=VARCHAR} , #{platformId,jdbcType=BIGINT} , #{validStatus,jdbcType=INTEGER} , #{platformType,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaEmplDO entity){
        return taEmplDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_EMPL.<br/>
     * descSql =  UPDATE TA_EMPL SET MAIL = #{mail,jdbcType=VARCHAR} ,REMARK = #{remark,jdbcType=VARCHAR} ,IS_ADMIN = #{isAdmin,jdbcType=INTEGER} ,PAPER_NO = #{paperNo,jdbcType=VARCHAR} ,USER_PWD = #{userPwd,jdbcType=VARCHAR} ,EMPL_NAME = #{emplName,jdbcType=VARCHAR} ,USER_NAME = #{userName,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,MOBILE_TEL = #{mobileTel,jdbcType=VARCHAR} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,EMPL_STATUS = #{emplStatus,jdbcType=VARCHAR} ,PLATFORM_ID = #{platformId,jdbcType=BIGINT} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,PLATFORM_TYPE = #{platformType,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaEmplDO entity){
        return taEmplDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_EMPL.<br/>
     * descSql =  DELETE FROM TA_EMPL WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taEmplDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_EMPL.<br/>
     * descSql =  SELECT * FROM TA_EMPL WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaEmplDO
     */
    public TaEmplDO getByPrimary(Long id){
        return taEmplDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据该平台和平台ID,用户名和手机号查询该平台员工.<br/>
     * descSql =  SELECT * FROM TA_EMPL WHERE PLATFORM_ID = #{platformId,jdbcType=BIGINT} AND PLATFORM_TYPE = #{platformType,jdbcType=VARCHAR} AND (USER_NAME LIKE CONCAT('%',(#{searchKey,jdbcType=VARCHAR}),'%') OR MOBILE_TEL LIKE CONCAT('%',(#{searchKey,jdbcType=VARCHAR}),'%'))
     * @param platformId platformId
     * @param searchKey searchKey
     * @param platformType platformType
     * @return TaEmplDO
     */
    public TaEmplDO getByMobileAndUsernameForPlatform(Long platformId,String searchKey,String platformType){
        return taEmplDOMapper.getByMobileAndUsernameForPlatform(platformId, searchKey, platformType);
    }
    /**
     * desc:查询个平台主负责人账号.<br/>
     * descSql =  SELECT * FROM TA_EMPL WHERE PLATFORM_ID = #{platformId,jdbcType=BIGINT} AND PLATFORM_TYPE = #{platformType,jdbcType=VARCHAR} AND IS_ADMIN = 1 AND EMPL_STATUS = 'NORMAL'
     * @param platformId platformId
     * @param platformType platformType
     * @return TaEmplDO
     */
    public TaEmplDO getAdminForPlatform(Long platformId,String platformType){
        return taEmplDOMapper.getAdminForPlatform(platformId, platformType);
    }
    /**
     * desc:根据用户名获取账号登录:TA_EMPL.<br/>
     * descSql =  SELECT * FROM TA_EMPL WHERE USER_NAME = #{userName,jdbcType=VARCHAR}
     * @param userName userName
     * @return TaEmplDO
     */
    public TaEmplDO getByUsername(String userName){
        return taEmplDOMapper.getByUsername(userName);
    }
    /**
     * desc:根据手机号获取账号登录:TA_EMPL.<br/>
     * descSql =  SELECT * FROM TA_EMPL WHERE MOBILE_TEL = #{mobileTel,jdbcType=VARCHAR}
     * @param mobileTel mobileTel
     * @return TaEmplDO
     */
    public TaEmplDO getByMobileTel(String mobileTel){
        return taEmplDOMapper.getByMobileTel(mobileTel);
    }
    /**
     * desc:根据邮箱获取账号登录:TA_EMPL.<br/>
     * descSql =  SELECT * FROM TA_EMPL WHERE MAIL = #{mail,jdbcType=VARCHAR}
     * @param mail mail
     * @return TaEmplDO
     */
    public TaEmplDO getByMail(String mail){
        return taEmplDOMapper.getByMail(mail);
    }
    /**
     * desc:选择性更新表:TA_EMPL.<br/>
     * descSql =  UPDATE TA_EMPL MAIL = #{mail,jdbcType=VARCHAR}, REMARK = #{remark,jdbcType=VARCHAR}, IS_ADMIN = #{isAdmin,jdbcType=INTEGER}, PAPER_NO = #{paperNo,jdbcType=VARCHAR}, USER_PWD = #{userPwd,jdbcType=VARCHAR}, EMPL_NAME = #{emplName,jdbcType=VARCHAR}, USER_NAME = #{userName,jdbcType=VARCHAR}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, MOBILE_TEL = #{mobileTel,jdbcType=VARCHAR}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, EMPL_STATUS = #{emplStatus,jdbcType=VARCHAR}, PLATFORM_ID = #{platformId,jdbcType=BIGINT}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, PLATFORM_TYPE = #{platformType,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long updateByPrimarySelective(TaEmplDO entity){
        return taEmplDOMapper.updateByPrimarySelective(entity);
    }
    /**
     * desc:查询平台账号.<br/>
     * descSql =  select e.id ,e.PLATFORM_TYPE,e.PLATFORM_ID,e.IS_ADMIN ,e.USER_NAME ,e.EMPL_NAME ,e.MAIL,e.MOBILE_TEL ,e.PAPER_NO ,e.EMPL_STATUS ,e.CREATE_EMPL ,e.CREATE_TIME,e.ALTER_EMPL ,e.ALTER_TIME, e.ROLE_IDS,e.ROLE_NAMES from (select a.id id,a.PLATFORM_TYPE PLATFORM_TYPE,a.PLATFORM_ID PLATFORM_ID,a.IS_ADMIN IS_ADMIN,a.USER_NAME USER_NAME,a.EMPL_NAME EMPL_NAME,a.MAIL MAIL,a.MOBILE_TEL MOBILE_TEL,a.PAPER_NO PAPER_NO,a.EMPL_STATUS EMPL_STATUS,a.CREATE_EMPL CREATE_EMPL,a.CREATE_TIME CREATE_TIME,a.ALTER_EMPL ALTER_EMPL,a.ALTER_TIME ALTER_TIME, GROUP_CONCAT(b.role_id SEPARATOR ',') ROLE_IDS,GROUP_CONCAT(b.name SEPARATOR ',') ROLE_NAMES from TA_EMPL a JOIN TA_EMPL_ROLE_AUTH b ON a.ID=b.EMPL_ID LEFT JOIN `ta_role` c on b.role_id= c.id WHERE b.VALID_STATUS=1 AND a.PLATFORM_TYPE=#{platformType,jdbcType=VARCHAR} and (a.USER_NAME like #{value,jdbcType=VARCHAR} OR a.EMPL_NAME like #{value,jdbcType=VARCHAR} OR a.MOBILE_TEL like #{value,jdbcType=VARCHAR}) AND a.EMPL_STATUS=#{emplStatus,jdbcType=VARCHAR} GROUP BY a.id ) e ORDER BY e.CREATE_TIME DESC
     * @param queryListAccount queryListAccount
     * @return QueryListAccountPage
     */
    public QueryListAccountPage listAccount(QueryListAccountPage queryListAccount){
        int total = taEmplDOMapper.listAccountCount(queryListAccount);
        if(total>0){
            queryListAccount.setDatas(taEmplDOMapper.listAccountResult(queryListAccount));
        }
        queryListAccount.setTotal(total);
        return queryListAccount;
    }
    /**
     * desc:根据平台类型和平台ID,获取用户名.<br/>
     * descSql =  SELECT USER_NAME FROM TA_EMPL WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return String
     */
    public String getUserNameByTypeAndId(Long id){
        return taEmplDOMapper.getUserNameByTypeAndId(id);
    }
    /**
     * desc:更新表:TA_EMPL.<br/>
     * descSql =  UPDATE TA_EMPL SET ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,EMPL_STATUS = #{emplStatus,jdbcType=VARCHAR} WHERE PLATFORM_ID = #{platformId,jdbcType=BIGINT} AND PLATFORM_TYPE = #{platformType,jdbcType=VARCHAR}
     * @param entity entity
     * @return Long
     */
    public Long updateAccountStatus(TaEmplDO entity){
        return taEmplDOMapper.updateAccountStatus(entity);
    }
    /**
     * desc:根据id获取账户所有信息:TA_EMPL.<br/>
     * descSql =  select a.id,a.PLATFORM_TYPE ,a.PLATFORM_ID ,a.IS_ADMIN ,a.USER_NAME ,a.EMPL_NAME ,a.MAIL ,a.MOBILE_TEL ,a.PAPER_NO ,a.EMPL_STATUS ,a.CREATE_EMPL ,a.CREATE_TIME ,a.ALTER_EMPL ,a.ALTER_TIME,d.user_name CREATE_NAME, GROUP_CONCAT(b.role_id SEPARATOR ',') ROLE_ID,GROUP_CONCAT(c.name SEPARATOR ',') ROLE_NAME from TA_EMPL a JOIN TA_EMPL_ROLE_AUTH b ON a.ID=b.EMPL_ID LEFT JOIN ta_role c on c.`ID` =b.role_id LEFT JOIN ta_empl d on a.create_empl=d.id WHERE b.VALID_STATUS=1 AND a.ID=#{id,jdbcType=BIGINT}
     * @param id id
     * @return Map
     */
    public Map getAccountInfoById(Long id){
        return taEmplDOMapper.getAccountInfoById(id);
    }
    /**
     * desc:根据用户ID获取其所属平台ID.<br/>
     * descSql =  SELECT PLATFORM_ID FROM TA_EMPL WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaEmplDO
     */
    public TaEmplDO getIdByUserId(Long id){
        return taEmplDOMapper.getIdByUserId(id);
    }
    /**
     * desc:根据主键获取数据:TA_EMPL.<br/>
     * descSql =  SELECT ID ,MAIL ,REMARK ,IS_ADMIN ,PAPER_NO ,USER_PWD ,EMPL_NAME ,USER_NAME ,ALTER_EMPL ,ALTER_TIME ,MOBILE_TEL ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,EMPL_STATUS ,PLATFORM_ID ,VALID_STATUS ,PLATFORM_TYPE FROM TA_EMPL WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaEmplDO
     */
    public TaEmplDO getByPrimarySelective(Long id){
        return taEmplDOMapper.getByPrimarySelective(id);
    }
    /**
     * desc:查询平台账号.<br/>
     * descSql =  SELECT f.id,f.PLATFORM_TYPE PLATFORM_TYPE,f.PLATFORM_ID PLATFORM_ID,f.IS_ADMIN IS_ADMIN,f.USER_NAME USER_NAME,f.EMPL_NAME EMPL_NAME,f.MAIL MAIL,f.MOBILE_TEL MOBILE_TEL,f.PAPER_NO PAPER_NO,f.EMPL_STATUS EMPL_STATUS,f.CREATE_EMPL CREATE_EMPL,f.CREATE_TIME CREATE_TIME,f.ALTER_EMPL ALTER_EMPL,f.ALTER_TIME ALTER_TIME, f.ROLE_NAMES ,f.ROLE_IDS, g.SHOP_NAMES FROM (SELECT a.id,a.PLATFORM_TYPE PLATFORM_TYPE,a.PLATFORM_ID PLATFORM_ID,a.IS_ADMIN IS_ADMIN,a.USER_NAME USER_NAME,a.EMPL_NAME EMPL_NAME,a.MAIL MAIL,a.MOBILE_TEL MOBILE_TEL,a.PAPER_NO PAPER_NO,a.EMPL_STATUS EMPL_STATUS,a.CREATE_EMPL CREATE_EMPL,a.CREATE_TIME CREATE_TIME,a.ALTER_EMPL ALTER_EMPL,a.ALTER_TIME ALTER_TIME, GROUP_CONCAT(e.id SEPARATOR ',')ROLE_IDS,GROUP_CONCAT(e.NAME SEPARATOR ',') ROLE_NAMES FROM ta_empl a LEFT JOIN TA_EMPL_ROLE_AUTH b ON a.ID=b.EMPL_ID JOIN TA_ROLE e ON b.ROLE_ID = e.ID WHERE b.VALID_STATUS=1 AND a.PLATFORM_TYPE="MALLPLATFORM" and (a.USER_NAME=#{value,jdbcType=VARCHAR} OR a.EMPL_NAME=#{value,jdbcType=VARCHAR} OR a.EMPL_STATUS=#{value,jdbcType=VARCHAR} OR a.MOBILE_TEL=#{value,jdbcType=VARCHAR}) GROUP BY a.id) f LEFT JOIN (SELECT c.id ,GROUP_CONCAT( d.SHOP_NAME SEPARATOR ',') SHOP_NAMES FROM ta_empl c left JOIN TA_EMPL_SHOP h ON h.EMPL_ID=c.ID LEFT JOIN TA_shop d ON h.shop_ID=d.id GROUP BY c.id) g ON f.ID= g.id ORDER BY CREATE_TIME DESC
     * @param queryMallListAccount queryMallListAccount
     * @return QueryMallListAccountPage
     */
    public QueryMallListAccountPage mallListAccount(QueryMallListAccountPage queryMallListAccount){
        int total = taEmplDOMapper.mallListAccountCount(queryMallListAccount);
        if(total>0){
            queryMallListAccount.setDatas(taEmplDOMapper.mallListAccountResult(queryMallListAccount));
        }
        queryMallListAccount.setTotal(total);
        return queryMallListAccount;
    }
    /**
     * desc:根据主键获取数据:TA_EMPL.<br/>
     * descSql =  SELECT * FROM TA_EMPL WHERE PLATFORM_ID = #{platformId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param platformId platformId
     * @return TaEmplDO
     */
    public TaEmplDO getByPlatformId(Long platformId){
        return taEmplDOMapper.getByPlatformId(platformId);
    }
    /**
     * desc:根据主键获取数据:TA_EMPL.<br/>
     * descSql =  SELECT * FROM TA_EMPL WHERE PLATFORM_ID = #{platformId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param platformId platformId
     * @return List<TaEmplDO>
     */
    public List<TaEmplDO> getByPlatformIdAndEmplName(Long platformId){
        return taEmplDOMapper.getByPlatformIdAndEmplName(platformId);
    }
}
