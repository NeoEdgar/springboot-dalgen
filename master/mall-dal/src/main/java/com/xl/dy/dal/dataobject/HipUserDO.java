package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table T_HIP_USER
 * 注意:此结构有系统生成,禁止手工修改,以免被覆盖,请通过dalgen生成
 */
public class HipUserDO{

    /**
     * age 用户年龄.
     */
    private Integer age;
    /**
     * mid P平台ID.
     */
    private String mid;
    /**
     * sex 性别.
     */
    private String sex;
    /**
     * isNew 是否是新用户(YES/NO).
     */
    private String isNew;
    /**
     * isVip 是否兴隆会员(YES/NO).
     */
    private String isVip;
    /**
     * vipId 关联会员ID.
     */
    private String vipId;
    /**
     * idCard 身份证号.
     */
    private String idCard;
    /**
     * isReal 是否实名（YES/NO）.
     */
    private String isReal;
    /**
     * payPwd 用户支付密码（密文）.
     */
    private String payPwd;
    /**
     * remark P备注.
     */
    private String remark;
    /**
     * userId 用户ID.
     */
    private Long userId;
    /**
     * vipCode 会员账号.
     */
    private String vipCode;
    /**
     * loginPwd 用户登录密码（密文）.
     */
    private String loginPwd;
    /**
     * memberId 商城传入HIPAY 会员唯一标识.
     */
    private Long memberId;
    /**
     * nowMchId 当前开卡商户.
     */
    private String nowMchId;
    /**
     * realName 用户真实姓名.
     */
    private String realName;
    /**
     * userNick 用户昵称.
     */
    private String userNick;
    /**
     * wxOpenId WX_OPEN_ID.
     */
    private String wxOpenId;
    /**
     * alterEmpl P修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime P修改时间.
     */
    private Date alterTime;
    /**
     * telephone 用户手机号.
     */
    private String telephone;
    /**
     * timestamp P时间戳.
     */
    private Long timestamp;
    /**
     * wxUnionId WX_UNION_ID.
     */
    private String wxUnionId;
    /**
     * createEmpl P创建人.
     */
    private Long createEmpl;
    /**
     * createTime P创建时间.
     */
    private Date createTime;
    /**
     * firstMchId 首次开卡商户.
     */
    private String firstMchId;
    /**
     * realInfoId 实名信息ID(FK).
     */
    private Long realInfoId;
    /**
     * userQrcode 用户二维码.
     */
    private String userQrcode;
    /**
     * userStatus 用户状态(NORMAL/LOCKED/BLACKLIST/LOGOUT）.
     */
    private String userStatus;
    /**
     * validStatus P有效性状态.
     */
    private String validStatus;
    /**
     * headPortrait 用户头像.
     */
    private String headPortrait;

    /**
     * Set age 用户年龄.
     */
    public void setAge(Integer age){
        this.age = age;
    }

    /**
     * Get age 用户年龄.
     *
     * @return the string
     */
    public Integer getAge(){
        return age;
    }

    /**
     * Set mid P平台ID.
     */
    public void setMid(String mid){
        this.mid = mid;
    }

    /**
     * Get mid P平台ID.
     *
     * @return the string
     */
    public String getMid(){
        return mid;
    }

    /**
     * Set sex 性别.
     */
    public void setSex(String sex){
        this.sex = sex;
    }

    /**
     * Get sex 性别.
     *
     * @return the string
     */
    public String getSex(){
        return sex;
    }

    /**
     * Set isNew 是否是新用户(YES/NO).
     */
    public void setIsNew(String isNew){
        this.isNew = isNew;
    }

    /**
     * Get isNew 是否是新用户(YES/NO).
     *
     * @return the string
     */
    public String getIsNew(){
        return isNew;
    }

    /**
     * Set isVip 是否兴隆会员(YES/NO).
     */
    public void setIsVip(String isVip){
        this.isVip = isVip;
    }

    /**
     * Get isVip 是否兴隆会员(YES/NO).
     *
     * @return the string
     */
    public String getIsVip(){
        return isVip;
    }

    /**
     * Set vipId 关联会员ID.
     */
    public void setVipId(String vipId){
        this.vipId = vipId;
    }

    /**
     * Get vipId 关联会员ID.
     *
     * @return the string
     */
    public String getVipId(){
        return vipId;
    }

    /**
     * Set idCard 身份证号.
     */
    public void setIdCard(String idCard){
        this.idCard = idCard;
    }

    /**
     * Get idCard 身份证号.
     *
     * @return the string
     */
    public String getIdCard(){
        return idCard;
    }

    /**
     * Set isReal 是否实名（YES/NO）.
     */
    public void setIsReal(String isReal){
        this.isReal = isReal;
    }

    /**
     * Get isReal 是否实名（YES/NO）.
     *
     * @return the string
     */
    public String getIsReal(){
        return isReal;
    }

    /**
     * Set payPwd 用户支付密码（密文）.
     */
    public void setPayPwd(String payPwd){
        this.payPwd = payPwd;
    }

    /**
     * Get payPwd 用户支付密码（密文）.
     *
     * @return the string
     */
    public String getPayPwd(){
        return payPwd;
    }

    /**
     * Set remark P备注.
     */
    public void setRemark(String remark){
        this.remark = remark;
    }

    /**
     * Get remark P备注.
     *
     * @return the string
     */
    public String getRemark(){
        return remark;
    }

    /**
     * Set userId 用户ID.
     */
    public void setUserId(Long userId){
        this.userId = userId;
    }

    /**
     * Get userId 用户ID.
     *
     * @return the string
     */
    public Long getUserId(){
        return userId;
    }

    /**
     * Set vipCode 会员账号.
     */
    public void setVipCode(String vipCode){
        this.vipCode = vipCode;
    }

    /**
     * Get vipCode 会员账号.
     *
     * @return the string
     */
    public String getVipCode(){
        return vipCode;
    }

    /**
     * Set loginPwd 用户登录密码（密文）.
     */
    public void setLoginPwd(String loginPwd){
        this.loginPwd = loginPwd;
    }

    /**
     * Get loginPwd 用户登录密码（密文）.
     *
     * @return the string
     */
    public String getLoginPwd(){
        return loginPwd;
    }

    /**
     * Set memberId 商城传入HIPAY 会员唯一标识.
     */
    public void setMemberId(Long memberId){
        this.memberId = memberId;
    }

    /**
     * Get memberId 商城传入HIPAY 会员唯一标识.
     *
     * @return the string
     */
    public Long getMemberId(){
        return memberId;
    }

    /**
     * Set nowMchId 当前开卡商户.
     */
    public void setNowMchId(String nowMchId){
        this.nowMchId = nowMchId;
    }

    /**
     * Get nowMchId 当前开卡商户.
     *
     * @return the string
     */
    public String getNowMchId(){
        return nowMchId;
    }

    /**
     * Set realName 用户真实姓名.
     */
    public void setRealName(String realName){
        this.realName = realName;
    }

    /**
     * Get realName 用户真实姓名.
     *
     * @return the string
     */
    public String getRealName(){
        return realName;
    }

    /**
     * Set userNick 用户昵称.
     */
    public void setUserNick(String userNick){
        this.userNick = userNick;
    }

    /**
     * Get userNick 用户昵称.
     *
     * @return the string
     */
    public String getUserNick(){
        return userNick;
    }

    /**
     * Set wxOpenId WX_OPEN_ID.
     */
    public void setWxOpenId(String wxOpenId){
        this.wxOpenId = wxOpenId;
    }

    /**
     * Get wxOpenId WX_OPEN_ID.
     *
     * @return the string
     */
    public String getWxOpenId(){
        return wxOpenId;
    }

    /**
     * Set alterEmpl P修改人.
     */
    public void setAlterEmpl(Long alterEmpl){
        this.alterEmpl = alterEmpl;
    }

    /**
     * Get alterEmpl P修改人.
     *
     * @return the string
     */
    public Long getAlterEmpl(){
        return alterEmpl;
    }

    /**
     * Set alterTime P修改时间.
     */
    public void setAlterTime(Date alterTime){
        this.alterTime = alterTime;
    }

    /**
     * Get alterTime P修改时间.
     *
     * @return the string
     */
    public Date getAlterTime(){
        return alterTime;
    }

    /**
     * Set telephone 用户手机号.
     */
    public void setTelephone(String telephone){
        this.telephone = telephone;
    }

    /**
     * Get telephone 用户手机号.
     *
     * @return the string
     */
    public String getTelephone(){
        return telephone;
    }

    /**
     * Set timestamp P时间戳.
     */
    public void setTimestamp(Long timestamp){
        this.timestamp = timestamp;
    }

    /**
     * Get timestamp P时间戳.
     *
     * @return the string
     */
    public Long getTimestamp(){
        return timestamp;
    }

    /**
     * Set wxUnionId WX_UNION_ID.
     */
    public void setWxUnionId(String wxUnionId){
        this.wxUnionId = wxUnionId;
    }

    /**
     * Get wxUnionId WX_UNION_ID.
     *
     * @return the string
     */
    public String getWxUnionId(){
        return wxUnionId;
    }

    /**
     * Set createEmpl P创建人.
     */
    public void setCreateEmpl(Long createEmpl){
        this.createEmpl = createEmpl;
    }

    /**
     * Get createEmpl P创建人.
     *
     * @return the string
     */
    public Long getCreateEmpl(){
        return createEmpl;
    }

    /**
     * Set createTime P创建时间.
     */
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }

    /**
     * Get createTime P创建时间.
     *
     * @return the string
     */
    public Date getCreateTime(){
        return createTime;
    }

    /**
     * Set firstMchId 首次开卡商户.
     */
    public void setFirstMchId(String firstMchId){
        this.firstMchId = firstMchId;
    }

    /**
     * Get firstMchId 首次开卡商户.
     *
     * @return the string
     */
    public String getFirstMchId(){
        return firstMchId;
    }

    /**
     * Set realInfoId 实名信息ID(FK).
     */
    public void setRealInfoId(Long realInfoId){
        this.realInfoId = realInfoId;
    }

    /**
     * Get realInfoId 实名信息ID(FK).
     *
     * @return the string
     */
    public Long getRealInfoId(){
        return realInfoId;
    }

    /**
     * Set userQrcode 用户二维码.
     */
    public void setUserQrcode(String userQrcode){
        this.userQrcode = userQrcode;
    }

    /**
     * Get userQrcode 用户二维码.
     *
     * @return the string
     */
    public String getUserQrcode(){
        return userQrcode;
    }

    /**
     * Set userStatus 用户状态(NORMAL/LOCKED/BLACKLIST/LOGOUT）.
     */
    public void setUserStatus(String userStatus){
        this.userStatus = userStatus;
    }

    /**
     * Get userStatus 用户状态(NORMAL/LOCKED/BLACKLIST/LOGOUT）.
     *
     * @return the string
     */
    public String getUserStatus(){
        return userStatus;
    }

    /**
     * Set validStatus P有效性状态.
     */
    public void setValidStatus(String validStatus){
        this.validStatus = validStatus;
    }

    /**
     * Get validStatus P有效性状态.
     *
     * @return the string
     */
    public String getValidStatus(){
        return validStatus;
    }

    /**
     * Set headPortrait 用户头像.
     */
    public void setHeadPortrait(String headPortrait){
        this.headPortrait = headPortrait;
    }

    /**
     * Get headPortrait 用户头像.
     *
     * @return the string
     */
    public String getHeadPortrait(){
        return headPortrait;
    }
}
