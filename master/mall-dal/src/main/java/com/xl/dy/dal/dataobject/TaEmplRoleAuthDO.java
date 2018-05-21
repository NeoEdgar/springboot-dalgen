package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_EMPL_ROLE_AUTH
 */
public class TaEmplRoleAuthDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * name 角色名称.
     */
    private String name;
    /**
     * emplId 人员ID(FK).
     */
    private Long emplId;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * roleId 角色ID(FK).
     */
    private Long roleId;
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
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;

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
     * Set emplId 人员ID(FK).
     */
    public void setEmplId(Long emplId){
        this.emplId = emplId;
    }

    /**
     * Get emplId 人员ID(FK).
     *
     * @return the string
     */
    public Long getEmplId(){
        return emplId;
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
     * Set roleId 角色ID(FK).
     */
    public void setRoleId(Long roleId){
        this.roleId = roleId;
    }

    /**
     * Get roleId 角色ID(FK).
     *
     * @return the string
     */
    public Long getRoleId(){
        return roleId;
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
}
