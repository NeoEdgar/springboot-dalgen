package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_SMS_TEMPLATE
 */
public class TaSmsTemplateDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * code 模板CODE.
     */
    private String code;
    /**
     * filed 注入字段.
     */
    private String filed;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * content 内容.
     */
    private String content;
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
     * validTime 有效时间.
     */
    private Integer validTime;
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
     * Set code 模板CODE.
     */
    public void setCode(String code){
        this.code = code;
    }

    /**
     * Get code 模板CODE.
     *
     * @return the string
     */
    public String getCode(){
        return code;
    }

    /**
     * Set filed 注入字段.
     */
    public void setFiled(String filed){
        this.filed = filed;
    }

    /**
     * Get filed 注入字段.
     *
     * @return the string
     */
    public String getFiled(){
        return filed;
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
     * Set content 内容.
     */
    public void setContent(String content){
        this.content = content;
    }

    /**
     * Get content 内容.
     *
     * @return the string
     */
    public String getContent(){
        return content;
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
     * Set validTime 有效时间.
     */
    public void setValidTime(Integer validTime){
        this.validTime = validTime;
    }

    /**
     * Get validTime 有效时间.
     *
     * @return the string
     */
    public Integer getValidTime(){
        return validTime;
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
