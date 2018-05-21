package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_ROLE
 */
public class TaRoleDO{

    /**
     * fr 全路径.
     */
    private String fr;
    /**
     * id ID.
     */
    private Long id;
    /**
     * lev 角色层级.
     */
    private Integer lev;
    /**
     * pid 父角色.
     */
    private Long pid;
    /**
     * code 角色编码.
     */
    private String code;
    /**
     * name 角色名称.
     */
    private String name;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * unitId 单位ID.
     */
    private Long unitId;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
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
     * roleStatus 角色状态（DIC）.
     */
    private Integer roleStatus;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * platformType PLATFORM_TYPE.
     */
    private String platformType;

    /**
     * Set fr 全路径.
     */
    public void setFr(String fr){
        this.fr = fr;
    }

    /**
     * Get fr 全路径.
     *
     * @return the string
     */
    public String getFr(){
        return fr;
    }

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
     * Set lev 角色层级.
     */
    public void setLev(Integer lev){
        this.lev = lev;
    }

    /**
     * Get lev 角色层级.
     *
     * @return the string
     */
    public Integer getLev(){
        return lev;
    }

    /**
     * Set pid 父角色.
     */
    public void setPid(Long pid){
        this.pid = pid;
    }

    /**
     * Get pid 父角色.
     *
     * @return the string
     */
    public Long getPid(){
        return pid;
    }

    /**
     * Set code 角色编码.
     */
    public void setCode(String code){
        this.code = code;
    }

    /**
     * Get code 角色编码.
     *
     * @return the string
     */
    public String getCode(){
        return code;
    }

    /**
     * Set name 角色名称.
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Get name 角色名称.
     *
     * @return the string
     */
    public String getName(){
        return name;
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
     * Set unitId 单位ID.
     */
    public void setUnitId(Long unitId){
        this.unitId = unitId;
    }

    /**
     * Get unitId 单位ID.
     *
     * @return the string
     */
    public Long getUnitId(){
        return unitId;
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
     * Set roleStatus 角色状态（DIC）.
     */
    public void setRoleStatus(Integer roleStatus){
        this.roleStatus = roleStatus;
    }

    /**
     * Get roleStatus 角色状态（DIC）.
     *
     * @return the string
     */
    public Integer getRoleStatus(){
        return roleStatus;
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
     * Set platformType PLATFORM_TYPE.
     */
    public void setPlatformType(String platformType){
        this.platformType = platformType;
    }

    /**
     * Get platformType PLATFORM_TYPE.
     *
     * @return the string
     */
    public String getPlatformType(){
        return platformType;
    }
}
