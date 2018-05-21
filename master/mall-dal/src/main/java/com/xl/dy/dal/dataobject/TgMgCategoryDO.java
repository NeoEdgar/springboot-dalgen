package com.xl.dy.dal.dataobject;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The table TG_MG_CATEGORY
 */
public class TgMgCategoryDO{

    /**
     * dp 扣点.
     */
    private BigDecimal dp;
    /**
     * fr 全路径.
     */
    private String fr;
    /**
     * id ID.
     */
    private Long id;
    /**
     * inx 顺序.
     */
    private Integer inx;
    /**
     * lev 类目层级.
     */
    private Integer lev;
    /**
     * pid 上级菜单ID.
     */
    private Long pid;
    /**
     * code 类目编码.
     */
    private String code;
    /**
     * icon 图标.
     */
    private String icon;
    /**
     * name 类目名称.
     */
    private String name;
    /**
     * param 类目参数.
     */
    private String param;
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
     * pointRate 积分比率.
     */
    private BigDecimal pointRate;
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
     * mgCategoryStatus 管理类目状态.
     */
    private String mgCategoryStatus;

    /**
     * Set dp 扣点.
     */
    public void setDp(BigDecimal dp){
        this.dp = dp;
    }

    /**
     * Get dp 扣点.
     *
     * @return the string
     */
    public BigDecimal getDp(){
        return dp;
    }

    /**
     * Set fr 全路径.
     */
    public void setFr(String fr){
        this.fr = fr;
    }

    /**
     * Get fr 全路径.
     *
     * @return the string
     */
    public String getFr(){
        return fr;
    }

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
     * Set inx 顺序.
     */
    public void setInx(Integer inx){
        this.inx = inx;
    }

    /**
     * Get inx 顺序.
     *
     * @return the string
     */
    public Integer getInx(){
        return inx;
    }

    /**
     * Set lev 类目层级.
     */
    public void setLev(Integer lev){
        this.lev = lev;
    }

    /**
     * Get lev 类目层级.
     *
     * @return the string
     */
    public Integer getLev(){
        return lev;
    }

    /**
     * Set pid 上级菜单ID.
     */
    public void setPid(Long pid){
        this.pid = pid;
    }

    /**
     * Get pid 上级菜单ID.
     *
     * @return the string
     */
    public Long getPid(){
        return pid;
    }

    /**
     * Set code 类目编码.
     */
    public void setCode(String code){
        this.code = code;
    }

    /**
     * Get code 类目编码.
     *
     * @return the string
     */
    public String getCode(){
        return code;
    }

    /**
     * Set icon 图标.
     */
    public void setIcon(String icon){
        this.icon = icon;
    }

    /**
     * Get icon 图标.
     *
     * @return the string
     */
    public String getIcon(){
        return icon;
    }

    /**
     * Set name 类目名称.
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Get name 类目名称.
     *
     * @return the string
     */
    public String getName(){
        return name;
    }

    /**
     * Set param 类目参数.
     */
    public void setParam(String param){
        this.param = param;
    }

    /**
     * Get param 类目参数.
     *
     * @return the string
     */
    public String getParam(){
        return param;
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
     * Set pointRate 积分比率.
     */
    public void setPointRate(BigDecimal pointRate){
        this.pointRate = pointRate;
    }

    /**
     * Get pointRate 积分比率.
     *
     * @return the string
     */
    public BigDecimal getPointRate(){
        return pointRate;
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

    /**
     * Set mgCategoryStatus 管理类目状态.
     */
    public void setMgCategoryStatus(String mgCategoryStatus){
        this.mgCategoryStatus = mgCategoryStatus;
    }

    /**
     * Get mgCategoryStatus 管理类目状态.
     *
     * @return the string
     */
    public String getMgCategoryStatus(){
        return mgCategoryStatus;
    }
}
