package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_CONTRACT_PHOTO
 */
public class TaContractPhotoDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * inx 显示顺序.
     */
    private Integer inx;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * photoUrl 图片地址.
     */
    private String photoUrl;
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
     * contractId 合同ID（FK）.
     */
    private Long contractId;
    /**
     * createEmpl 公共-创建人.
     */
    private Long createEmpl;
    /**
     * createTime 公共-创建时间.
     */
    private Date createTime;
    /**
     * oriPhotoUrl 原始图片地址.
     */
    private String oriPhotoUrl;
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
     * Set inx 显示顺序.
     */
    public void setInx(Integer inx){
        this.inx = inx;
    }

    /**
     * Get inx 显示顺序.
     *
     * @return the string
     */
    public Integer getInx(){
        return inx;
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
     * Set photoUrl 图片地址.
     */
    public void setPhotoUrl(String photoUrl){
        this.photoUrl = photoUrl;
    }

    /**
     * Get photoUrl 图片地址.
     *
     * @return the string
     */
    public String getPhotoUrl(){
        return photoUrl;
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
     * Set contractId 合同ID（FK）.
     */
    public void setContractId(Long contractId){
        this.contractId = contractId;
    }

    /**
     * Get contractId 合同ID（FK）.
     *
     * @return the string
     */
    public Long getContractId(){
        return contractId;
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
     * Set oriPhotoUrl 原始图片地址.
     */
    public void setOriPhotoUrl(String oriPhotoUrl){
        this.oriPhotoUrl = oriPhotoUrl;
    }

    /**
     * Get oriPhotoUrl 原始图片地址.
     *
     * @return the string
     */
    public String getOriPhotoUrl(){
        return oriPhotoUrl;
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
