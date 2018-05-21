package com.xl.dy.dal.resultmap;

import java.io.Serializable;

/**
 * The table GroupVO
 */
public class GroupVO implements Serializable {

private static final long serialVersionUID = -1L;

    /**
     * vipid .
     */
    private Long vipid;
    /**
     * skuid .
     */
    private Long skuid;
    /**
     * groupid .
     */
    private Long groupid;
    /**
     * usergroupid .
     */
    private Long usergroupid;

    /**
     * Set vipid .
     */
    public void setVipid(Long vipid){
        this.vipid = vipid;
    }

    /**
     * Get vipid .
     *
     * @return the string
     */
    public Long getVipid(){
        return vipid;
    }

    /**
     * Set skuid .
     */
    public void setSkuid(Long skuid){
        this.skuid = skuid;
    }

    /**
     * Get skuid .
     *
     * @return the string
     */
    public Long getSkuid(){
        return skuid;
    }

    /**
     * Set groupid .
     */
    public void setGroupid(Long groupid){
        this.groupid = groupid;
    }

    /**
     * Get groupid .
     *
     * @return the string
     */
    public Long getGroupid(){
        return groupid;
    }

    /**
     * Set usergroupid .
     */
    public void setUsergroupid(Long usergroupid){
        this.usergroupid = usergroupid;
    }

    /**
     * Get usergroupid .
     *
     * @return the string
     */
    public Long getUsergroupid(){
        return usergroupid;
    }
}
