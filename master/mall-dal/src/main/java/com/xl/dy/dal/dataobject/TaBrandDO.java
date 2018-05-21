package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_BRAND
 */
public class TaBrandDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * brandIcon 品牌图标.
     */
    private String brandIcon;
    /**
     * timestamp 公共-时间戳.
     */
    private Long timestamp;
    /**
     * brandSpell 拼音码.
     */
    private String brandSpell;
    /**
     * createEmpl 公共-创建人.
     */
    private Long createEmpl;
    /**
     * createTime 公共-创建时间.
     */
    private Date createTime;
    /**
     * brandNameCn 品牌名称（中文）.
     */
    private String brandNameCn;
    /**
     * brandNameEn 品牌名称（英文）.
     */
    private String brandNameEn;
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
     * Set brandIcon 品牌图标.
     */
    public void setBrandIcon(String brandIcon){
        this.brandIcon = brandIcon;
    }

    /**
     * Get brandIcon 品牌图标.
     *
     * @return the string
     */
    public String getBrandIcon(){
        return brandIcon;
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
     * Set brandSpell 拼音码.
     */
    public void setBrandSpell(String brandSpell){
        this.brandSpell = brandSpell;
    }

    /**
     * Get brandSpell 拼音码.
     *
     * @return the string
     */
    public String getBrandSpell(){
        return brandSpell;
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
     * Set brandNameCn 品牌名称（中文）.
     */
    public void setBrandNameCn(String brandNameCn){
        this.brandNameCn = brandNameCn;
    }

    /**
     * Get brandNameCn 品牌名称（中文）.
     *
     * @return the string
     */
    public String getBrandNameCn(){
        return brandNameCn;
    }

    /**
     * Set brandNameEn 品牌名称（英文）.
     */
    public void setBrandNameEn(String brandNameEn){
        this.brandNameEn = brandNameEn;
    }

    /**
     * Get brandNameEn 品牌名称（英文）.
     *
     * @return the string
     */
    public String getBrandNameEn(){
        return brandNameEn;
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
