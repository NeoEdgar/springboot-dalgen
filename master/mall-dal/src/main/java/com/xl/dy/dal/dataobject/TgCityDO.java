package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TG_CITY
 */
public class TgCityDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * cityName 市名.
     */
    private String cityName;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * citySpell 拼音码.
     */
    private String citySpell;
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
     * provinceId 省ID（FK）.
     */
    private Long provinceId;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * provinceName 省名（快照）.
     */
    private String provinceName;
    /**
     * provinceSpell 省名拼音码（快照）.
     */
    private String provinceSpell;

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
     * Set cityName 市名.
     */
    public void setCityName(String cityName){
        this.cityName = cityName;
    }

    /**
     * Get cityName 市名.
     *
     * @return the string
     */
    public String getCityName(){
        return cityName;
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
     * Set citySpell 拼音码.
     */
    public void setCitySpell(String citySpell){
        this.citySpell = citySpell;
    }

    /**
     * Get citySpell 拼音码.
     *
     * @return the string
     */
    public String getCitySpell(){
        return citySpell;
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
     * Set provinceId 省ID（FK）.
     */
    public void setProvinceId(Long provinceId){
        this.provinceId = provinceId;
    }

    /**
     * Get provinceId 省ID（FK）.
     *
     * @return the string
     */
    public Long getProvinceId(){
        return provinceId;
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
     * Set provinceName 省名（快照）.
     */
    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }

    /**
     * Get provinceName 省名（快照）.
     *
     * @return the string
     */
    public String getProvinceName(){
        return provinceName;
    }

    /**
     * Set provinceSpell 省名拼音码（快照）.
     */
    public void setProvinceSpell(String provinceSpell){
        this.provinceSpell = provinceSpell;
    }

    /**
     * Get provinceSpell 省名拼音码（快照）.
     *
     * @return the string
     */
    public String getProvinceSpell(){
        return provinceSpell;
    }
}
