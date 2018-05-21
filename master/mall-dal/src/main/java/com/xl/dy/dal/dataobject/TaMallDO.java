package com.xl.dy.dal.dataobject;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The table TA_MALL
 */
public class TaMallDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * cityId 所在市(FK).
     */
    private Long cityId;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * mongoId MONGOID.
     */
    private String mongoId;
    /**
     * latitude 纬度(精确小数后6位).
     */
    private BigDecimal latitude;
    /**
     * mallName 商场名称.
     */
    private String mallName;
    /**
     * mallType 商场类型（DIC）.
     */
    private String mallType;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * companyId 特殊指定专业公司（FK）.
     */
    private Long companyId;
    /**
     * longitude 经度(精确小数后6位).
     */
    private BigDecimal longitude;
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
     * districtId 所在区(FK).
     */
    private Long districtId;
    /**
     * freezeTime 冻结时间.
     */
    private Date freezeTime;
    /**
     * mallStatus 商场状态（DIC）.
     */
    private String mallStatus;
    /**
     * provinceId 所在省(FK).
     */
    private Long provinceId;
    /**
     * mallAddress 详细地址.
     */
    private String mallAddress;
    /**
     * saleUnitAff 销售单位归属（DIC）.
     */
    private String saleUnitAff;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * freezeEmplId 冻结人ID（FK）.
     */
    private Long freezeEmplId;
    /**
     * subdistictId 所在街道(FK).
     */
    private Long subdistictId;
    /**
     * freezeEmplName 冻结人姓名.
     */
    private String freezeEmplName;
    /**
     * mallContractId 商场正在履行合同ID（FK）.
     */
    private Long mallContractId;
    /**
     * isTargetCompany 是否特殊指定专业公司.
     */
    private Integer isTargetCompany;

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
     * Set cityId 所在市(FK).
     */
    public void setCityId(Long cityId){
        this.cityId = cityId;
    }

    /**
     * Get cityId 所在市(FK).
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
     * Set mongoId MONGOID.
     */
    public void setMongoId(String mongoId){
        this.mongoId = mongoId;
    }

    /**
     * Get mongoId MONGOID.
     *
     * @return the string
     */
    public String getMongoId(){
        return mongoId;
    }

    /**
     * Set latitude 纬度(精确小数后6位).
     */
    public void setLatitude(BigDecimal latitude){
        this.latitude = latitude;
    }

    /**
     * Get latitude 纬度(精确小数后6位).
     *
     * @return the string
     */
    public BigDecimal getLatitude(){
        return latitude;
    }

    /**
     * Set mallName 商场名称.
     */
    public void setMallName(String mallName){
        this.mallName = mallName;
    }

    /**
     * Get mallName 商场名称.
     *
     * @return the string
     */
    public String getMallName(){
        return mallName;
    }

    /**
     * Set mallType 商场类型（DIC）.
     */
    public void setMallType(String mallType){
        this.mallType = mallType;
    }

    /**
     * Get mallType 商场类型（DIC）.
     *
     * @return the string
     */
    public String getMallType(){
        return mallType;
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
     * Set companyId 特殊指定专业公司（FK）.
     */
    public void setCompanyId(Long companyId){
        this.companyId = companyId;
    }

    /**
     * Get companyId 特殊指定专业公司（FK）.
     *
     * @return the string
     */
    public Long getCompanyId(){
        return companyId;
    }

    /**
     * Set longitude 经度(精确小数后6位).
     */
    public void setLongitude(BigDecimal longitude){
        this.longitude = longitude;
    }

    /**
     * Get longitude 经度(精确小数后6位).
     *
     * @return the string
     */
    public BigDecimal getLongitude(){
        return longitude;
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
     * Set districtId 所在区(FK).
     */
    public void setDistrictId(Long districtId){
        this.districtId = districtId;
    }

    /**
     * Get districtId 所在区(FK).
     *
     * @return the string
     */
    public Long getDistrictId(){
        return districtId;
    }

    /**
     * Set freezeTime 冻结时间.
     */
    public void setFreezeTime(Date freezeTime){
        this.freezeTime = freezeTime;
    }

    /**
     * Get freezeTime 冻结时间.
     *
     * @return the string
     */
    public Date getFreezeTime(){
        return freezeTime;
    }

    /**
     * Set mallStatus 商场状态（DIC）.
     */
    public void setMallStatus(String mallStatus){
        this.mallStatus = mallStatus;
    }

    /**
     * Get mallStatus 商场状态（DIC）.
     *
     * @return the string
     */
    public String getMallStatus(){
        return mallStatus;
    }

    /**
     * Set provinceId 所在省(FK).
     */
    public void setProvinceId(Long provinceId){
        this.provinceId = provinceId;
    }

    /**
     * Get provinceId 所在省(FK).
     *
     * @return the string
     */
    public Long getProvinceId(){
        return provinceId;
    }

    /**
     * Set mallAddress 详细地址.
     */
    public void setMallAddress(String mallAddress){
        this.mallAddress = mallAddress;
    }

    /**
     * Get mallAddress 详细地址.
     *
     * @return the string
     */
    public String getMallAddress(){
        return mallAddress;
    }

    /**
     * Set saleUnitAff 销售单位归属（DIC）.
     */
    public void setSaleUnitAff(String saleUnitAff){
        this.saleUnitAff = saleUnitAff;
    }

    /**
     * Get saleUnitAff 销售单位归属（DIC）.
     *
     * @return the string
     */
    public String getSaleUnitAff(){
        return saleUnitAff;
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
     * Set freezeEmplId 冻结人ID（FK）.
     */
    public void setFreezeEmplId(Long freezeEmplId){
        this.freezeEmplId = freezeEmplId;
    }

    /**
     * Get freezeEmplId 冻结人ID（FK）.
     *
     * @return the string
     */
    public Long getFreezeEmplId(){
        return freezeEmplId;
    }

    /**
     * Set subdistictId 所在街道(FK).
     */
    public void setSubdistictId(Long subdistictId){
        this.subdistictId = subdistictId;
    }

    /**
     * Get subdistictId 所在街道(FK).
     *
     * @return the string
     */
    public Long getSubdistictId(){
        return subdistictId;
    }

    /**
     * Set freezeEmplName 冻结人姓名.
     */
    public void setFreezeEmplName(String freezeEmplName){
        this.freezeEmplName = freezeEmplName;
    }

    /**
     * Get freezeEmplName 冻结人姓名.
     *
     * @return the string
     */
    public String getFreezeEmplName(){
        return freezeEmplName;
    }

    /**
     * Set mallContractId 商场正在履行合同ID（FK）.
     */
    public void setMallContractId(Long mallContractId){
        this.mallContractId = mallContractId;
    }

    /**
     * Get mallContractId 商场正在履行合同ID（FK）.
     *
     * @return the string
     */
    public Long getMallContractId(){
        return mallContractId;
    }

    /**
     * Set isTargetCompany 是否特殊指定专业公司.
     */
    public void setIsTargetCompany(Integer isTargetCompany){
        this.isTargetCompany = isTargetCompany;
    }

    /**
     * Get isTargetCompany 是否特殊指定专业公司.
     *
     * @return the string
     */
    public Integer getIsTargetCompany(){
        return isTargetCompany;
    }
}
