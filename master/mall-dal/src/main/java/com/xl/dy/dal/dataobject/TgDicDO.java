package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TG_DIC
 */
public class TgDicDO{

    /**
     * id F_ID.
     */
    private Long id;
    /**
     * dicInx 顺序.
     */
    private Integer dicInx;
    /**
     * dicKey 字典KEY.
     */
    private String dicKey;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * dicType 类别.
     */
    private String dicType;
    /**
     * dicValue 字典VALUE.
     */
    private String dicValue;
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
     * dicTypeName 类别名.
     */
    private String dicTypeName;
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
     * Set dicInx 顺序.
     */
    public void setDicInx(Integer dicInx){
        this.dicInx = dicInx;
    }

    /**
     * Get dicInx 顺序.
     *
     * @return the string
     */
    public Integer getDicInx(){
        return dicInx;
    }

    /**
     * Set dicKey 字典KEY.
     */
    public void setDicKey(String dicKey){
        this.dicKey = dicKey;
    }

    /**
     * Get dicKey 字典KEY.
     *
     * @return the string
     */
    public String getDicKey(){
        return dicKey;
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
     * Set dicType 类别.
     */
    public void setDicType(String dicType){
        this.dicType = dicType;
    }

    /**
     * Get dicType 类别.
     *
     * @return the string
     */
    public String getDicType(){
        return dicType;
    }

    /**
     * Set dicValue 字典VALUE.
     */
    public void setDicValue(String dicValue){
        this.dicValue = dicValue;
    }

    /**
     * Get dicValue 字典VALUE.
     *
     * @return the string
     */
    public String getDicValue(){
        return dicValue;
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
     * Set dicTypeName 类别名.
     */
    public void setDicTypeName(String dicTypeName){
        this.dicTypeName = dicTypeName;
    }

    /**
     * Get dicTypeName 类别名.
     *
     * @return the string
     */
    public String getDicTypeName(){
        return dicTypeName;
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
