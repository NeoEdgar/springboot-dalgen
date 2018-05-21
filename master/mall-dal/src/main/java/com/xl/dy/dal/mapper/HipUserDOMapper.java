package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.HipUserDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * 注意:此结构有系统生成,禁止手工修改,以免被覆盖,请通过dalgen生成
 * The Table T_HIP_USER.
 * T_HIP_USER
 */
@Repository
public interface HipUserDOMapper{

    /**
     * desc:插入表:T_HIP_USER.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO T_HIP_USER( AGE MID ,SEX ,IS_NEW ,IS_VIP ,VIP_ID ,ID_CARD ,IS_REAL ,PAY_PWD ,REMARK ,USER_ID ,VIP_CODE ,LOGIN_PWD ,MEMBER_ID ,NOW_MCH_ID ,REAL_NAME ,USER_NICK ,WX_OPEN_ID ,ALTER_EMPL ,ALTER_TIME ,TELEPHONE ,TIMESTAMP ,WX_UNION_ID ,CREATE_EMPL ,CREATE_TIME ,FIRST_MCH_ID ,REAL_INFO_ID ,USER_QRCODE ,USER_STATUS ,VALID_STATUS ,HEAD_PORTRAIT )VALUES( #{age,jdbcType=INTEGER} #{mid,jdbcType=VARCHAR} ,#{sex,jdbcType=VARCHAR} ,#{isNew,jdbcType=VARCHAR} ,#{isVip,jdbcType=VARCHAR} ,#{vipId,jdbcType=VARCHAR} ,#{idCard,jdbcType=VARCHAR} ,#{isReal,jdbcType=VARCHAR} ,#{payPwd,jdbcType=VARCHAR} ,#{remark,jdbcType=VARCHAR} ,#{userId,jdbcType=BIGINT} ,#{vipCode,jdbcType=VARCHAR} ,#{loginPwd,jdbcType=VARCHAR} ,#{memberId,jdbcType=BIGINT} ,#{nowMchId,jdbcType=VARCHAR} ,#{realName,jdbcType=VARCHAR} ,#{userNick,jdbcType=VARCHAR} ,#{wxOpenId,jdbcType=VARCHAR} ,#{alterEmpl,jdbcType=BIGINT} ,#{alterTime,jdbcType=TIMESTAMP} ,#{telephone,jdbcType=VARCHAR} ,#{timestamp,jdbcType=BIGINT} ,#{wxUnionId,jdbcType=VARCHAR} ,#{createEmpl,jdbcType=BIGINT} ,#{createTime,jdbcType=TIMESTAMP} ,#{firstMchId,jdbcType=VARCHAR} ,#{realInfoId,jdbcType=BIGINT} ,#{userQrcode,jdbcType=VARCHAR} ,#{userStatus,jdbcType=VARCHAR} ,#{validStatus,jdbcType=VARCHAR} ,#{headPortrait,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(HipUserDO entity);
    /**
     * desc:更新表:T_HIP_USER.<br/>
     * descSql =  UPDATE T_HIP_USER SET AGE = #{age,jdbcType=INTEGER} ,MID = #{mid,jdbcType=VARCHAR} ,SEX = #{sex,jdbcType=VARCHAR} ,IS_NEW = #{isNew,jdbcType=VARCHAR} ,IS_VIP = #{isVip,jdbcType=VARCHAR} ,VIP_ID = #{vipId,jdbcType=VARCHAR} ,ID_CARD = #{idCard,jdbcType=VARCHAR} ,IS_REAL = #{isReal,jdbcType=VARCHAR} ,PAY_PWD = #{payPwd,jdbcType=VARCHAR} ,REMARK = #{remark,jdbcType=VARCHAR} ,VIP_CODE = #{vipCode,jdbcType=VARCHAR} ,LOGIN_PWD = #{loginPwd,jdbcType=VARCHAR} ,MEMBER_ID = #{memberId,jdbcType=BIGINT} ,NOW_MCH_ID = #{nowMchId,jdbcType=VARCHAR} ,REAL_NAME = #{realName,jdbcType=VARCHAR} ,USER_NICK = #{userNick,jdbcType=VARCHAR} ,WX_OPEN_ID = #{wxOpenId,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TELEPHONE = #{telephone,jdbcType=VARCHAR} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,WX_UNION_ID = #{wxUnionId,jdbcType=VARCHAR} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,FIRST_MCH_ID = #{firstMchId,jdbcType=VARCHAR} ,REAL_INFO_ID = #{realInfoId,jdbcType=BIGINT} ,USER_QRCODE = #{userQrcode,jdbcType=VARCHAR} ,USER_STATUS = #{userStatus,jdbcType=VARCHAR} ,VALID_STATUS = #{validStatus,jdbcType=VARCHAR} ,HEAD_PORTRAIT = #{headPortrait,jdbcType=VARCHAR} WHERE USER_ID = #{userId,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(HipUserDO entity);
    /**
     * desc:根据主键删除数据:T_HIP_USER.<br/>
     * descSql =  DELETE FROM T_HIP_USER WHERE USER_ID = #{userId,jdbcType=BIGINT}
     * @param userId userId
     * @return Long
     */
    Long deleteByPrimary(Long userId);
    /**
     * desc:根据主键获取数据:T_HIP_USER.<br/>
     * descSql =  SELECT * FROM T_HIP_USER WHERE USER_ID = #{userId,jdbcType=BIGINT}
     * @param userId userId
     * @return HipUserDO
     */
    HipUserDO getByPrimary(Long userId);
}
