package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_ERP_JINLI_WAREHOUSE
 */
public class TaErpJinliWarehouseDO{

    /**
     * id ID.
     */
    private Long id;
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
     * parentCode 上级仓库编码.
     */
    private String parentCode;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * warehouseCode 仓库代码.
     */
    private String warehouseCode;
    /**
     * warehouseName 仓库名称.
     */
    private String warehouseName;
    /**
     * warehouseLevel 仓库级别.
     */
    private Integer warehouseLevel;

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
     * Set parentCode 上级仓库编码.
     */
    public void setParentCode(String parentCode){
        this.parentCode = parentCode;
    }

    /**
     * Get parentCode 上级仓库编码.
     *
     * @return the string
     */
    public String getParentCode(){
        return parentCode;
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
     * Set warehouseCode 仓库代码.
     */
    public void setWarehouseCode(String warehouseCode){
        this.warehouseCode = warehouseCode;
    }

    /**
     * Get warehouseCode 仓库代码.
     *
     * @return the string
     */
    public String getWarehouseCode(){
        return warehouseCode;
    }

    /**
     * Set warehouseName 仓库名称.
     */
    public void setWarehouseName(String warehouseName){
        this.warehouseName = warehouseName;
    }

    /**
     * Get warehouseName 仓库名称.
     *
     * @return the string
     */
    public String getWarehouseName(){
        return warehouseName;
    }

    /**
     * Set warehouseLevel 仓库级别.
     */
    public void setWarehouseLevel(Integer warehouseLevel){
        this.warehouseLevel = warehouseLevel;
    }

    /**
     * Get warehouseLevel 仓库级别.
     *
     * @return the string
     */
    public Integer getWarehouseLevel(){
        return warehouseLevel;
    }
}
