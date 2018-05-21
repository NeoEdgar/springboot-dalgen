package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_ERP_JINLI_DEPT
 */
public class TaErpJinliDeptDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * deptId 部门编码.
     */
    private String deptId;
    /**
     * isLeaf 是否末级部门 1末级 0非末级.
     */
    private Integer isLeaf;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * erpCode ERP编码.
     */
    private String erpCode;
    /**
     * deptName 部门名称.
     */
    private String deptName;
    /**
     * deptType 部门类型 0公司 1股份直营 2采购部门 3销售部门 4其他.
     */
    private Integer deptType;
    /**
     * parentId 上级部门编码.
     */
    private String parentId;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * deptLevel 部门级别.
     */
    private Integer deptLevel;
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
     * Set deptId 部门编码.
     */
    public void setDeptId(String deptId){
        this.deptId = deptId;
    }

    /**
     * Get deptId 部门编码.
     *
     * @return the string
     */
    public String getDeptId(){
        return deptId;
    }

    /**
     * Set isLeaf 是否末级部门 1末级 0非末级.
     */
    public void setIsLeaf(Integer isLeaf){
        this.isLeaf = isLeaf;
    }

    /**
     * Get isLeaf 是否末级部门 1末级 0非末级.
     *
     * @return the string
     */
    public Integer getIsLeaf(){
        return isLeaf;
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
     * Set erpCode ERP编码.
     */
    public void setErpCode(String erpCode){
        this.erpCode = erpCode;
    }

    /**
     * Get erpCode ERP编码.
     *
     * @return the string
     */
    public String getErpCode(){
        return erpCode;
    }

    /**
     * Set deptName 部门名称.
     */
    public void setDeptName(String deptName){
        this.deptName = deptName;
    }

    /**
     * Get deptName 部门名称.
     *
     * @return the string
     */
    public String getDeptName(){
        return deptName;
    }

    /**
     * Set deptType 部门类型 0公司 1股份直营 2采购部门 3销售部门 4其他.
     */
    public void setDeptType(Integer deptType){
        this.deptType = deptType;
    }

    /**
     * Get deptType 部门类型 0公司 1股份直营 2采购部门 3销售部门 4其他.
     *
     * @return the string
     */
    public Integer getDeptType(){
        return deptType;
    }

    /**
     * Set parentId 上级部门编码.
     */
    public void setParentId(String parentId){
        this.parentId = parentId;
    }

    /**
     * Get parentId 上级部门编码.
     *
     * @return the string
     */
    public String getParentId(){
        return parentId;
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
     * Set deptLevel 部门级别.
     */
    public void setDeptLevel(Integer deptLevel){
        this.deptLevel = deptLevel;
    }

    /**
     * Get deptLevel 部门级别.
     *
     * @return the string
     */
    public Integer getDeptLevel(){
        return deptLevel;
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
