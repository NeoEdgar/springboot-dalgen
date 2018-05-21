package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_SHOP_SEND_ADDR
 */
public class TaShopSendAddrDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * phone 手机号.
     */
    private String phone;
    /**
     * cityId 发货地-所在市(FK).
     */
    private Long cityId;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * sender 发件人.
     */
    private String sender;
    /**
     * shopId 店铺信息ID（FK）.
     */
    private Long shopId;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * isDefault 是否默认地址.
     */
    private Integer isDefault;
    /**
     * isMention 是否是自提地址.
     */
    private Integer isMention;
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
     * districtId 发货地-所在区(FK).
     */
    private Long districtId;
    /**
     * provinceId 发货地-所在省(FK).
     */
    private Long provinceId;
    /**
     * mallAddress 发货地-详细地址.
     */
    private String mallAddress;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * subdistictId 发货地-所在街道(FK).
     */
    private Long subdistictId;

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
     * Set phone 手机号.
     */
    public void setPhone(String phone){
        this.phone = phone;
    }

    /**
     * Get phone 手机号.
     *
     * @return the string
     */
    public String getPhone(){
        return phone;
    }

    /**
     * Set cityId 发货地-所在市(FK).
     */
    public void setCityId(Long cityId){
        this.cityId = cityId;
    }

    /**
     * Get cityId 发货地-所在市(FK).
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
     * Set sender 发件人.
     */
    public void setSender(String sender){
        this.sender = sender;
    }

    /**
     * Get sender 发件人.
     *
     * @return the string
     */
    public String getSender(){
        return sender;
    }

    /**
     * Set shopId 店铺信息ID（FK）.
     */
    public void setShopId(Long shopId){
        this.shopId = shopId;
    }

    /**
     * Get shopId 店铺信息ID（FK）.
     *
     * @return the string
     */
    public Long getShopId(){
        return shopId;
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
     * Set isDefault 是否默认地址.
     */
    public void setIsDefault(Integer isDefault){
        this.isDefault = isDefault;
    }

    /**
     * Get isDefault 是否默认地址.
     *
     * @return the string
     */
    public Integer getIsDefault(){
        return isDefault;
    }

    /**
     * Set isMention 是否是自提地址.
     */
    public void setIsMention(Integer isMention){
        this.isMention = isMention;
    }

    /**
     * Get isMention 是否是自提地址.
     *
     * @return the string
     */
    public Integer getIsMention(){
        return isMention;
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
     * Set districtId 发货地-所在区(FK).
     */
    public void setDistrictId(Long districtId){
        this.districtId = districtId;
    }

    /**
     * Get districtId 发货地-所在区(FK).
     *
     * @return the string
     */
    public Long getDistrictId(){
        return districtId;
    }

    /**
     * Set provinceId 发货地-所在省(FK).
     */
    public void setProvinceId(Long provinceId){
        this.provinceId = provinceId;
    }

    /**
     * Get provinceId 发货地-所在省(FK).
     *
     * @return the string
     */
    public Long getProvinceId(){
        return provinceId;
    }

    /**
     * Set mallAddress 发货地-详细地址.
     */
    public void setMallAddress(String mallAddress){
        this.mallAddress = mallAddress;
    }

    /**
     * Get mallAddress 发货地-详细地址.
     *
     * @return the string
     */
    public String getMallAddress(){
        return mallAddress;
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
     * Set subdistictId 发货地-所在街道(FK).
     */
    public void setSubdistictId(Long subdistictId){
        this.subdistictId = subdistictId;
    }

    /**
     * Get subdistictId 发货地-所在街道(FK).
     *
     * @return the string
     */
    public Long getSubdistictId(){
        return subdistictId;
    }
}
