package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TG_DS_ERROR_ID
 */
public class TgDsErrorIdDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * pid PID.
     */
    private Long pid;
    /**
     * errId 异常ID.
     */
    private Integer errId;
    /**
     * errExp 异常说明.
     */
    private String errExp;
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
     * className 异常类名.
     */
    private String className;
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
     * Set pid PID.
     */
    public void setPid(Long pid){
        this.pid = pid;
    }

    /**
     * Get pid PID.
     *
     * @return the string
     */
    public Long getPid(){
        return pid;
    }

    /**
     * Set errId 异常ID.
     */
    public void setErrId(Integer errId){
        this.errId = errId;
    }

    /**
     * Get errId 异常ID.
     *
     * @return the string
     */
    public Integer getErrId(){
        return errId;
    }

    /**
     * Set errExp 异常说明.
     */
    public void setErrExp(String errExp){
        this.errExp = errExp;
    }

    /**
     * Get errExp 异常说明.
     *
     * @return the string
     */
    public String getErrExp(){
        return errExp;
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
     * Set className 异常类名.
     */
    public void setClassName(String className){
        this.className = className;
    }

    /**
     * Get className 异常类名.
     *
     * @return the string
     */
    public String getClassName(){
        return className;
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
