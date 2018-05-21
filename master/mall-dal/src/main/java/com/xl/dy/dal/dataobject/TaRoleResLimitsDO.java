package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_ROLE_RES_LIMITS
 */
public class TaRoleResLimitsDO{

    /**
     * id F_ID.
     */
    private Long id;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * roleId 角色ID(FK).
     */
    private Long roleId;
    /**
     * pfMenuId 菜单ID（FK）.
     */
    private Long pfMenuId;
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
     * resLimitsId 资源权限列表ID（FK）.
     */
    private Long resLimitsId;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;

    /**
     * Set id F_ID.
     */
    public void setId(Long id){
        this.id = id;
    }

    /**
     * Get id F_ID.
     *
     * @return the string
     */
    public Long getId(){
        return id;
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
     * Set pfMenuId 菜单ID（FK）.
     */
    public void setPfMenuId(Long pfMenuId){
        this.pfMenuId = pfMenuId;
    }

    /**
     * Get pfMenuId 菜单ID（FK）.
     *
     * @return the string
     */
    public Long getPfMenuId(){
        return pfMenuId;
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
     * Set resLimitsId 资源权限列表ID（FK）.
     */
    public void setResLimitsId(Long resLimitsId){
        this.resLimitsId = resLimitsId;
    }

    /**
     * Get resLimitsId 资源权限列表ID（FK）.
     *
     * @return the string
     */
    public Long getResLimitsId(){
        return resLimitsId;
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
