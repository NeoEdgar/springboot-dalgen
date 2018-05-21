package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TG_SUBDISTICT
 */
public class TgSubdistictDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * cCode 市编码.
     */
    private String cCode;
    /**
     * dCode 市编码.
     */
    private String dCode;
    /**
     * pCode 国家编码.
     */
    private String pCode;
    /**
     * cityId 市ID（FK）.
     */
    private Long cityId;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * cityName 市名（快照）.
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
     * citySpell 市名拼音码（快照）.
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
     * districtId 区ID（FK）.
     */
    private Long districtId;
    /**
     * provinceId 省ID（FK）.
     */
    private Long provinceId;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * districtName 区名.
     */
    private String districtName;
    /**
     * provinceName 省名（快照）.
     */
    private String provinceName;
    /**
     * districtSpell 区名拼音码.
     */
    private String districtSpell;
    /**
     * provinceSpell 省名拼音码（快照）.
     */
    private String provinceSpell;
    /**
     * subdistictName 街道名.
     */
    private String subdistictName;
    /**
     * subdistictSpell 街道拼音码.
     */
    private String subdistictSpell;

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
     * Set cCode 市编码.
     */
    public void setCCode(String cCode){
        this.cCode = cCode;
    }

    /**
     * Get cCode 市编码.
     *
     * @return the string
     */
    public String getCCode(){
        return cCode;
    }

    /**
     * Set dCode 市编码.
     */
    public void setDCode(String dCode){
        this.dCode = dCode;
    }

    /**
     * Get dCode 市编码.
     *
     * @return the string
     */
    public String getDCode(){
        return dCode;
    }

    /**
     * Set pCode 国家编码.
     */
    public void setPCode(String pCode){
        this.pCode = pCode;
    }

    /**
     * Get pCode 国家编码.
     *
     * @return the string
     */
    public String getPCode(){
        return pCode;
    }

    /**
     * Set cityId 市ID（FK）.
     */
    public void setCityId(Long cityId){
        this.cityId = cityId;
    }

    /**
     * Get cityId 市ID（FK）.
     *
     * @return the string
     */
    public Long getCityId(){
        return cityId;
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
     * Set cityName 市名（快照）.
     */
    public void setCityName(String cityName){
        this.cityName = cityName;
    }

    /**
     * Get cityName 市名（快照）.
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
     * Set citySpell 市名拼音码（快照）.
     */
    public void setCitySpell(String citySpell){
        this.citySpell = citySpell;
    }

    /**
     * Get citySpell 市名拼音码（快照）.
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
     * Set districtId 区ID（FK）.
     */
    public void setDistrictId(Long districtId){
        this.districtId = districtId;
    }

    /**
     * Get districtId 区ID（FK）.
     *
     * @return the string
     */
    public Long getDistrictId(){
        return districtId;
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
     * Set districtName 区名.
     */
    public void setDistrictName(String districtName){
        this.districtName = districtName;
    }

    /**
     * Get districtName 区名.
     *
     * @return the string
     */
    public String getDistrictName(){
        return districtName;
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
     * Set districtSpell 区名拼音码.
     */
    public void setDistrictSpell(String districtSpell){
        this.districtSpell = districtSpell;
    }

    /**
     * Get districtSpell 区名拼音码.
     *
     * @return the string
     */
    public String getDistrictSpell(){
        return districtSpell;
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

    /**
     * Set subdistictName 街道名.
     */
    public void setSubdistictName(String subdistictName){
        this.subdistictName = subdistictName;
    }

    /**
     * Get subdistictName 街道名.
     *
     * @return the string
     */
    public String getSubdistictName(){
        return subdistictName;
    }

    /**
     * Set subdistictSpell 街道拼音码.
     */
    public void setSubdistictSpell(String subdistictSpell){
        this.subdistictSpell = subdistictSpell;
    }

    /**
     * Get subdistictSpell 街道拼音码.
     *
     * @return the string
     */
    public String getSubdistictSpell(){
        return subdistictSpell;
    }
}
