package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TG_LOGISTICS
 */
public class TgLogisticsDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * code CODE.
     */
    private String code;
    /**
     * name NAME.
     */
    private String name;
    /**
     * alterEmpl ALTER_EMPL.
     */
    private Long alterEmpl;
    /**
     * alterTime ALTER_TIME.
     */
    private Date alterTime;
    /**
     * timestamp TIMESTAMP.
     */
    private Long timestamp;
    /**
     * createEmpl CREATE_EMPL.
     */
    private Long createEmpl;
    /**
     * createTime CREATE_TIME.
     */
    private Date createTime;

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
     * Set code CODE.
     */
    public void setCode(String code){
        this.code = code;
    }

    /**
     * Get code CODE.
     *
     * @return the string
     */
    public String getCode(){
        return code;
    }

    /**
     * Set name NAME.
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Get name NAME.
     *
     * @return the string
     */
    public String getName(){
        return name;
    }

    /**
     * Set alterEmpl ALTER_EMPL.
     */
    public void setAlterEmpl(Long alterEmpl){
        this.alterEmpl = alterEmpl;
    }

    /**
     * Get alterEmpl ALTER_EMPL.
     *
     * @return the string
     */
    public Long getAlterEmpl(){
        return alterEmpl;
    }

    /**
     * Set alterTime ALTER_TIME.
     */
    public void setAlterTime(Date alterTime){
        this.alterTime = alterTime;
    }

    /**
     * Get alterTime ALTER_TIME.
     *
     * @return the string
     */
    public Date getAlterTime(){
        return alterTime;
    }

    /**
     * Set timestamp TIMESTAMP.
     */
    public void setTimestamp(Long timestamp){
        this.timestamp = timestamp;
    }

    /**
     * Get timestamp TIMESTAMP.
     *
     * @return the string
     */
    public Long getTimestamp(){
        return timestamp;
    }

    /**
     * Set createEmpl CREATE_EMPL.
     */
    public void setCreateEmpl(Long createEmpl){
        this.createEmpl = createEmpl;
    }

    /**
     * Get createEmpl CREATE_EMPL.
     *
     * @return the string
     */
    public Long getCreateEmpl(){
        return createEmpl;
    }

    /**
     * Set createTime CREATE_TIME.
     */
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }

    /**
     * Get createTime CREATE_TIME.
     *
     * @return the string
     */
    public Date getCreateTime(){
        return createTime;
    }
}
