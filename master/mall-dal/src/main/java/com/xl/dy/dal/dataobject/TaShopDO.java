package com.xl.dy.dal.dataobject;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The table TA_SHOP
 */
public class TaShopDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * point 店铺评分（存储过程或定时任务实现统计）.
     */
    private BigDecimal point;
    /**
     * sales 销量.
     */
    private Long sales;
    /**
     * cityId 所在市(FK).
     */
    private Long cityId;
    /**
     * erpSup 业务系统供应商编码（金力）.
     */
    private String erpSup;
    /**
     * mallId 入驻商场ID（FK）.
     */
    private Long mallId;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * erpType 业务系统类型(DIC).
     */
    private String erpType;
    /**
     * erpAccId 业务系统账户ID（FK）.
     */
    private Long erpAccId;
    /**
     * erpStore 业务系统仓库编码（金力）.
     */
    private String erpStore;
    /**
     * latitude 纬度(精确小数后6位).
     */
    private BigDecimal latitude;
    /**
     * mallName 商场名（快照）.
     */
    private String mallName;
    /**
     * shopName 店铺名称.
     */
    private String shopName;
    /**
     * shopType 店铺类型（DIC）.
     */
    private String shopType;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * companyId 所属专业公司（FK）.
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
     * provinceId 所在省(FK).
     */
    private Long provinceId;
    /**
     * shopStatus 店铺状态（DIC）.
     */
    private String shopStatus;
    /**
     * companyName 专业公司名（快照）.
     */
    private String companyName;
    /**
     * erpSaleDept ERP_SALE_DEPT.
     */
    private String erpSaleDept;
    /**
     * shopAddress 详细地址.
     */
    private String shopAddress;
    /**
     * shopLogoUrl 店铺LOGO.
     */
    private String shopLogoUrl;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * entityMallId 归属实体商场ID.
     */
    private Long entityMallId;
    /**
     * freezeEmplId 冻结人ID（FK）.
     */
    private Long freezeEmplId;
    /**
     * subdistictId 所在街道(FK).
     */
    private Long subdistictId;
    /**
     * closestoreTime 打烊时间.
     */
    private Date closestoreTime;
    /**
     * entityMallName 归属实体商场名称.
     */
    private String entityMallName;
    /**
     * freezeEmplName 冻结人姓名.
     */
    private String freezeEmplName;
    /**
     * mgCategoryText 主营类目文本.
     */
    private String mgCategoryText;
    /**
     * erpPurchaseDept 业务系统采购部门编码（金力）.
     */
    private String erpPurchaseDept;
    /**
     * closestoreEmplId 打烊人ID(FK).
     */
    private Long closestoreEmplId;
    /**
     * closestoreEmplName 打烊人姓名.
     */
    private String closestoreEmplName;

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
     * Set point 店铺评分（存储过程或定时任务实现统计）.
     */
    public void setPoint(BigDecimal point){
        this.point = point;
    }

    /**
     * Get point 店铺评分（存储过程或定时任务实现统计）.
     *
     * @return the string
     */
    public BigDecimal getPoint(){
        return point;
    }

    /**
     * Set sales 销量.
     */
    public void setSales(Long sales){
        this.sales = sales;
    }

    /**
     * Get sales 销量.
     *
     * @return the string
     */
    public Long getSales(){
        return sales;
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
     * Set erpSup 业务系统供应商编码（金力）.
     */
    public void setErpSup(String erpSup){
        this.erpSup = erpSup;
    }

    /**
     * Get erpSup 业务系统供应商编码（金力）.
     *
     * @return the string
     */
    public String getErpSup(){
        return erpSup;
    }

    /**
     * Set mallId 入驻商场ID（FK）.
     */
    public void setMallId(Long mallId){
        this.mallId = mallId;
    }

    /**
     * Get mallId 入驻商场ID（FK）.
     *
     * @return the string
     */
    public Long getMallId(){
        return mallId;
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
     * Set erpType 业务系统类型(DIC).
     */
    public void setErpType(String erpType){
        this.erpType = erpType;
    }

    /**
     * Get erpType 业务系统类型(DIC).
     *
     * @return the string
     */
    public String getErpType(){
        return erpType;
    }

    /**
     * Set erpAccId 业务系统账户ID（FK）.
     */
    public void setErpAccId(Long erpAccId){
        this.erpAccId = erpAccId;
    }

    /**
     * Get erpAccId 业务系统账户ID（FK）.
     *
     * @return the string
     */
    public Long getErpAccId(){
        return erpAccId;
    }

    /**
     * Set erpStore 业务系统仓库编码（金力）.
     */
    public void setErpStore(String erpStore){
        this.erpStore = erpStore;
    }

    /**
     * Get erpStore 业务系统仓库编码（金力）.
     *
     * @return the string
     */
    public String getErpStore(){
        return erpStore;
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
     * Set mallName 商场名（快照）.
     */
    public void setMallName(String mallName){
        this.mallName = mallName;
    }

    /**
     * Get mallName 商场名（快照）.
     *
     * @return the string
     */
    public String getMallName(){
        return mallName;
    }

    /**
     * Set shopName 店铺名称.
     */
    public void setShopName(String shopName){
        this.shopName = shopName;
    }

    /**
     * Get shopName 店铺名称.
     *
     * @return the string
     */
    public String getShopName(){
        return shopName;
    }

    /**
     * Set shopType 店铺类型（DIC）.
     */
    public void setShopType(String shopType){
        this.shopType = shopType;
    }

    /**
     * Get shopType 店铺类型（DIC）.
     *
     * @return the string
     */
    public String getShopType(){
        return shopType;
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
     * Set companyId 所属专业公司（FK）.
     */
    public void setCompanyId(Long companyId){
        this.companyId = companyId;
    }

    /**
     * Get companyId 所属专业公司（FK）.
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
     * Set shopStatus 店铺状态（DIC）.
     */
    public void setShopStatus(String shopStatus){
        this.shopStatus = shopStatus;
    }

    /**
     * Get shopStatus 店铺状态（DIC）.
     *
     * @return the string
     */
    public String getShopStatus(){
        return shopStatus;
    }

    /**
     * Set companyName 专业公司名（快照）.
     */
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    /**
     * Get companyName 专业公司名（快照）.
     *
     * @return the string
     */
    public String getCompanyName(){
        return companyName;
    }

    /**
     * Set erpSaleDept ERP_SALE_DEPT.
     */
    public void setErpSaleDept(String erpSaleDept){
        this.erpSaleDept = erpSaleDept;
    }

    /**
     * Get erpSaleDept ERP_SALE_DEPT.
     *
     * @return the string
     */
    public String getErpSaleDept(){
        return erpSaleDept;
    }

    /**
     * Set shopAddress 详细地址.
     */
    public void setShopAddress(String shopAddress){
        this.shopAddress = shopAddress;
    }

    /**
     * Get shopAddress 详细地址.
     *
     * @return the string
     */
    public String getShopAddress(){
        return shopAddress;
    }

    /**
     * Set shopLogoUrl 店铺LOGO.
     */
    public void setShopLogoUrl(String shopLogoUrl){
        this.shopLogoUrl = shopLogoUrl;
    }

    /**
     * Get shopLogoUrl 店铺LOGO.
     *
     * @return the string
     */
    public String getShopLogoUrl(){
        return shopLogoUrl;
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
     * Set entityMallId 归属实体商场ID.
     */
    public void setEntityMallId(Long entityMallId){
        this.entityMallId = entityMallId;
    }

    /**
     * Get entityMallId 归属实体商场ID.
     *
     * @return the string
     */
    public Long getEntityMallId(){
        return entityMallId;
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
     * Set closestoreTime 打烊时间.
     */
    public void setClosestoreTime(Date closestoreTime){
        this.closestoreTime = closestoreTime;
    }

    /**
     * Get closestoreTime 打烊时间.
     *
     * @return the string
     */
    public Date getClosestoreTime(){
        return closestoreTime;
    }

    /**
     * Set entityMallName 归属实体商场名称.
     */
    public void setEntityMallName(String entityMallName){
        this.entityMallName = entityMallName;
    }

    /**
     * Get entityMallName 归属实体商场名称.
     *
     * @return the string
     */
    public String getEntityMallName(){
        return entityMallName;
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
     * Set mgCategoryText 主营类目文本.
     */
    public void setMgCategoryText(String mgCategoryText){
        this.mgCategoryText = mgCategoryText;
    }

    /**
     * Get mgCategoryText 主营类目文本.
     *
     * @return the string
     */
    public String getMgCategoryText(){
        return mgCategoryText;
    }

    /**
     * Set erpPurchaseDept 业务系统采购部门编码（金力）.
     */
    public void setErpPurchaseDept(String erpPurchaseDept){
        this.erpPurchaseDept = erpPurchaseDept;
    }

    /**
     * Get erpPurchaseDept 业务系统采购部门编码（金力）.
     *
     * @return the string
     */
    public String getErpPurchaseDept(){
        return erpPurchaseDept;
    }

    /**
     * Set closestoreEmplId 打烊人ID(FK).
     */
    public void setClosestoreEmplId(Long closestoreEmplId){
        this.closestoreEmplId = closestoreEmplId;
    }

    /**
     * Get closestoreEmplId 打烊人ID(FK).
     *
     * @return the string
     */
    public Long getClosestoreEmplId(){
        return closestoreEmplId;
    }

    /**
     * Set closestoreEmplName 打烊人姓名.
     */
    public void setClosestoreEmplName(String closestoreEmplName){
        this.closestoreEmplName = closestoreEmplName;
    }

    /**
     * Get closestoreEmplName 打烊人姓名.
     *
     * @return the string
     */
    public String getClosestoreEmplName(){
        return closestoreEmplName;
    }
}
