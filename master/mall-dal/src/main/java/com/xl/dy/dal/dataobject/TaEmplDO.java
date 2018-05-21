package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_EMPL
 */
public class TaEmplDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * mail 邮箱.
     */
    private String mail;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * isAdmin 是否管理员(1是 0不是).
     */
    private Integer isAdmin;
    /**
     * paperNo 身份证.
     */
    private String paperNo;
    /**
     * userPwd 平台登录密码.
     */
    private String userPwd;
    /**
     * emplName 姓名.
     */
    private String emplName;
    /**
     * userName 平台用户名.
     */
    private String userName;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * mobileTel 手机号.
     */
    private String mobileTel;
    /**
     * timestamp 公共-时间戳.
     */
    private Long timestamp;
    /**
     * createEmpl 公共-创建人.
     */
    private Long createEmpl;
    /**
     * createTime 公共-创建时间.
     */
    private Date createTime;
    /**
     * emplStatus 管理员状态（DIC）.
     */
    private String emplStatus;
    /**
     * platformId 单位ID(总平台、专业公司、商场、店铺ID)(FK).
     */
    private Long platformId;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * platformType 平台类型（DIC）.
     */
    private String platformType;

    /**
     * Set id ID.
     */
    public void setId(Long id){
        this.id = id;
    }

    /**
     * Get id ID.
     *
     * @return the string
     */
    public Long getId(){
        return id;
    }

    /**
     * Set mail 邮箱.
     */
    public void setMail(String mail){
        this.mail = mail;
    }

    /**
     * Get mail 邮箱.
     *
     * @return the string
     */
    public String getMail(){
        return mail;
    }

    /**
     * Set remark 公共-备注.
     */
    public void setRemark(String remark){
        this.remark = remark;
    }

    /**
     * Get remark 公共-备注.
     *
     * @return the string
     */
    public String getRemark(){
        return remark;
    }

    /**
     * Set isAdmin 是否管理员(1是 0不是).
     */
    public void setIsAdmin(Integer isAdmin){
        this.isAdmin = isAdmin;
    }

    /**
     * Get isAdmin 是否管理员(1是 0不是).
     *
     * @return the string
     */
    public Integer getIsAdmin(){
        return isAdmin;
    }

    /**
     * Set paperNo 身份证.
     */
    public void setPaperNo(String paperNo){
        this.paperNo = paperNo;
    }

    /**
     * Get paperNo 身份证.
     *
     * @return the string
     */
    public String getPaperNo(){
        return paperNo;
    }

    /**
     * Set userPwd 平台登录密码.
     */
    public void setUserPwd(String userPwd){
        this.userPwd = userPwd;
    }

    /**
     * Get userPwd 平台登录密码.
     *
     * @return the string
     */
    public String getUserPwd(){
        return userPwd;
    }

    /**
     * Set emplName 姓名.
     */
    public void setEmplName(String emplName){
        this.emplName = emplName;
    }

    /**
     * Get emplName 姓名.
     *
     * @return the string
     */
    public String getEmplName(){
        return emplName;
    }

    /**
     * Set userName 平台用户名.
     */
    public void setUserName(String userName){
        this.userName = userName;
    }

    /**
     * Get userName 平台用户名.
     *
     * @return the string
     */
    public String getUserName(){
        return userName;
    }

    /**
     * Set alterEmpl 公共-修改人.
     */
    public void setAlterEmpl(Long alterEmpl){
        this.alterEmpl = alterEmpl;
    }

    /**
     * Get alterEmpl 公共-修改人.
     *
     * @return the string
     */
    public Long getAlterEmpl(){
        return alterEmpl;
    }

    /**
     * Set alterTime 公共-修改时间.
     */
    public void setAlterTime(Date alterTime){
        this.alterTime = alterTime;
    }

    /**
     * Get alterTime 公共-修改时间.
     *
     * @return the string
     */
    public Date getAlterTime(){
        return alterTime;
    }

    /**
     * Set mobileTel 手机号.
     */
    public void setMobileTel(String mobileTel){
        this.mobileTel = mobileTel;
    }

    /**
     * Get mobileTel 手机号.
     *
     * @return the string
     */
    public String getMobileTel(){
        return mobileTel;
    }

    /**
     * Set timestamp 公共-时间戳.
     */
    public void setTimestamp(Long timestamp){
        this.timestamp = timestamp;
    }

    /**
     * Get timestamp 公共-时间戳.
     *
     * @return the string
     */
    public Long getTimestamp(){
        return timestamp;
    }

    /**
     * Set createEmpl 公共-创建人.
     */
    public void setCreateEmpl(Long createEmpl){
        this.createEmpl = createEmpl;
    }

    /**
     * Get createEmpl 公共-创建人.
     *
     * @return the string
     */
    public Long getCreateEmpl(){
        return createEmpl;
    }

    /**
     * Set createTime 公共-创建时间.
     */
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }

    /**
     * Get createTime 公共-创建时间.
     *
     * @return the string
     */
    public Date getCreateTime(){
        return createTime;
    }

    /**
     * Set emplStatus 管理员状态（DIC）.
     */
    public void setEmplStatus(String emplStatus){
        this.emplStatus = emplStatus;
    }

    /**
     * Get emplStatus 管理员状态（DIC）.
     *
     * @return the string
     */
    public String getEmplStatus(){
        return emplStatus;
    }

    /**
     * Set platformId 单位ID(总平台、专业公司、商场、店铺ID)(FK).
     */
    public void setPlatformId(Long platformId){
        this.platformId = platformId;
    }

    /**
     * Get platformId 单位ID(总平台、专业公司、商场、店铺ID)(FK).
     *
     * @return the string
     */
    public Long getPlatformId(){
        return platformId;
    }

    /**
     * Set validStatus 公共-有效性状态.
     */
    public void setValidStatus(Integer validStatus){
        this.validStatus = validStatus;
    }

    /**
     * Get validStatus 公共-有效性状态.
     *
     * @return the string
     */
    public Integer getValidStatus(){
        return validStatus;
    }

    /**
     * Set platformType 平台类型（DIC）.
     */
    public void setPlatformType(String platformType){
        this.platformType = platformType;
    }

    /**
     * Get platformType 平台类型（DIC）.
     *
     * @return the string
     */
    public String getPlatformType(){
        return platformType;
    }
}
