package com.xl.dy.dal.dataobject;


/**
 * The table SHECHEM_ES_COUPON
 */
public class ShechemEsCouponDO{

    /**
     * id ID.
     */
    private Integer id;
    /**
     * mid 平台ID.
     */
    private String mid;
    /**
     * uid OA进入微信的用户ID 关联OA中MEMBER表的MEMBERID.
     */
    private Integer uid;
    /**
     * turn 排序.
     */
    private Integer turn;
    /**
     * type 类型  1线上  2线下 3储值券.
     */
    private Boolean type;
    /**
     * btime 开始时间.
     */
    private Integer btime;
    /**
     * etime 结束时间.
     */
    private Integer etime;
    /**
     * isget 是否可以点击领取.
     */
    private Boolean isget;
    /**
     * price 优惠价格.
     */
    private Integer price;
    /**
     * thumb 优惠券图片.
     */
    private String thumb;
    /**
     * title 优惠券名称.
     */
    private String title;
    /**
     * isGive 是否可以转赠 1可以 2不可以.
     */
    private Boolean isGive;
    /**
     * isSale 是否可售 1否 2是.
     */
    private Boolean isSale;
    /**
     * status 是否启用;0否1显示.
     */
    private Boolean status;
    /**
     * tagstr 标签ID，以逗号分隔.
     */
    private String tagstr;
    /**
     * display 数据删除状态 1：正常 0：回收站 -1:彻底删除.
     */
    private Boolean display;
    /**
     * groupId 会员组ID.
     */
    private String groupId;
    /**
     * storeId STORE_ID.
     */
    private Integer storeId;
    /**
     * isFamily 是否需要家庭会员 0否 1是.
     */
    private Boolean isFamily;
    /**
     * isRefund 是否自动通过退款 1是 2否	.
     */
    private Boolean isRefund;
    /**
     * limitGet 限领数量.
     */
    private Integer limitGet;
    /**
     * limitNum 发放的数量，-1：不限制数量.
     */
    private Integer limitNum;
    /**
     * showInWx 是否在WX显示 0否 1是.
     */
    private Boolean showInWx;
    /**
     * inputtime 添加时间的时间戳.
     */
    private Integer inputtime;
    /**
     * isReceive 是否可领取 1是 2否.
     */
    private Boolean isReceive;
    /**
     * limitUser 有权限的用户组.
     */
    private String limitUser;
    /**
     * recommend 1推荐 2不推荐.
     */
    private Boolean recommend;
    /**
     * showInApp 是否在APP显示 0否 1是.
     */
    private Boolean showInApp;
    /**
     * categoryId 优惠券类别ID.
     */
    private Integer categoryId;
    /**
     * isActivity 是否是活动卡券 0否 1是.
     */
    private Boolean isActivity;
    /**
     * limitBtime 有效期开始时间.
     */
    private Integer limitBtime;
    /**
     * limitEtime 有效期结束时间.
     */
    private Integer limitEtime;
    /**
     * limitPrice 最小消费金额.
     */
    private Integer limitPrice;
    /**
     * ratePraise 好评率.
     */
    private Float ratePraise;
    /**
     * updatetime 最近一次修改时间的时间戳.
     */
    private Integer updatetime;
    /**
     * dayLimitGet 每天限领数量.
     */
    private Integer dayLimitGet;
    /**
     * description 优惠券描述.
     */
    private String description;
    /**
     * isPrepaycard 是否预付卡 0不是 1是.
     */
    private Integer isPrepaycard;
    /**
     * couponCategory 优惠券类别.
     */
    private Integer couponCategory;
    /**
     * noDiscountGroup 是不不能和会员优惠同用 1 不能 0 能.
     */
    private Boolean noDiscountGroup;

    /**
     * Set id ID.
     */
    public void setId(Integer id){
        this.id = id;
    }

    /**
     * Get id ID.
     *
     * @return the string
     */
    public Integer getId(){
        return id;
    }

    /**
     * Set mid 平台ID.
     */
    public void setMid(String mid){
        this.mid = mid;
    }

    /**
     * Get mid 平台ID.
     *
     * @return the string
     */
    public String getMid(){
        return mid;
    }

    /**
     * Set uid OA进入微信的用户ID 关联OA中MEMBER表的MEMBERID.
     */
    public void setUid(Integer uid){
        this.uid = uid;
    }

    /**
     * Get uid OA进入微信的用户ID 关联OA中MEMBER表的MEMBERID.
     *
     * @return the string
     */
    public Integer getUid(){
        return uid;
    }

    /**
     * Set turn 排序.
     */
    public void setTurn(Integer turn){
        this.turn = turn;
    }

    /**
     * Get turn 排序.
     *
     * @return the string
     */
    public Integer getTurn(){
        return turn;
    }

    /**
     * Set type 类型  1线上  2线下 3储值券.
     */
    public void setType(Boolean type){
        this.type = type;
    }

    /**
     * Get type 类型  1线上  2线下 3储值券.
     *
     * @return the string
     */
    public Boolean getType(){
        return type;
    }

    /**
     * Set btime 开始时间.
     */
    public void setBtime(Integer btime){
        this.btime = btime;
    }

    /**
     * Get btime 开始时间.
     *
     * @return the string
     */
    public Integer getBtime(){
        return btime;
    }

    /**
     * Set etime 结束时间.
     */
    public void setEtime(Integer etime){
        this.etime = etime;
    }

    /**
     * Get etime 结束时间.
     *
     * @return the string
     */
    public Integer getEtime(){
        return etime;
    }

    /**
     * Set isget 是否可以点击领取.
     */
    public void setIsget(Boolean isget){
        this.isget = isget;
    }

    /**
     * Get isget 是否可以点击领取.
     *
     * @return the string
     */
    public Boolean getIsget(){
        return isget;
    }

    /**
     * Set price 优惠价格.
     */
    public void setPrice(Integer price){
        this.price = price;
    }

    /**
     * Get price 优惠价格.
     *
     * @return the string
     */
    public Integer getPrice(){
        return price;
    }

    /**
     * Set thumb 优惠券图片.
     */
    public void setThumb(String thumb){
        this.thumb = thumb;
    }

    /**
     * Get thumb 优惠券图片.
     *
     * @return the string
     */
    public String getThumb(){
        return thumb;
    }

    /**
     * Set title 优惠券名称.
     */
    public void setTitle(String title){
        this.title = title;
    }

    /**
     * Get title 优惠券名称.
     *
     * @return the string
     */
    public String getTitle(){
        return title;
    }

    /**
     * Set isGive 是否可以转赠 1可以 2不可以.
     */
    public void setIsGive(Boolean isGive){
        this.isGive = isGive;
    }

    /**
     * Get isGive 是否可以转赠 1可以 2不可以.
     *
     * @return the string
     */
    public Boolean getIsGive(){
        return isGive;
    }

    /**
     * Set isSale 是否可售 1否 2是.
     */
    public void setIsSale(Boolean isSale){
        this.isSale = isSale;
    }

    /**
     * Get isSale 是否可售 1否 2是.
     *
     * @return the string
     */
    public Boolean getIsSale(){
        return isSale;
    }

    /**
     * Set status 是否启用;0否1显示.
     */
    public void setStatus(Boolean status){
        this.status = status;
    }

    /**
     * Get status 是否启用;0否1显示.
     *
     * @return the string
     */
    public Boolean getStatus(){
        return status;
    }

    /**
     * Set tagstr 标签ID，以逗号分隔.
     */
    public void setTagstr(String tagstr){
        this.tagstr = tagstr;
    }

    /**
     * Get tagstr 标签ID，以逗号分隔.
     *
     * @return the string
     */
    public String getTagstr(){
        return tagstr;
    }

    /**
     * Set display 数据删除状态 1：正常 0：回收站 -1:彻底删除.
     */
    public void setDisplay(Boolean display){
        this.display = display;
    }

    /**
     * Get display 数据删除状态 1：正常 0：回收站 -1:彻底删除.
     *
     * @return the string
     */
    public Boolean getDisplay(){
        return display;
    }

    /**
     * Set groupId 会员组ID.
     */
    public void setGroupId(String groupId){
        this.groupId = groupId;
    }

    /**
     * Get groupId 会员组ID.
     *
     * @return the string
     */
    public String getGroupId(){
        return groupId;
    }

    /**
     * Set storeId STORE_ID.
     */
    public void setStoreId(Integer storeId){
        this.storeId = storeId;
    }

    /**
     * Get storeId STORE_ID.
     *
     * @return the string
     */
    public Integer getStoreId(){
        return storeId;
    }

    /**
     * Set isFamily 是否需要家庭会员 0否 1是.
     */
    public void setIsFamily(Boolean isFamily){
        this.isFamily = isFamily;
    }

    /**
     * Get isFamily 是否需要家庭会员 0否 1是.
     *
     * @return the string
     */
    public Boolean getIsFamily(){
        return isFamily;
    }

    /**
     * Set isRefund 是否自动通过退款 1是 2否	.
     */
    public void setIsRefund(Boolean isRefund){
        this.isRefund = isRefund;
    }

    /**
     * Get isRefund 是否自动通过退款 1是 2否	.
     *
     * @return the string
     */
    public Boolean getIsRefund(){
        return isRefund;
    }

    /**
     * Set limitGet 限领数量.
     */
    public void setLimitGet(Integer limitGet){
        this.limitGet = limitGet;
    }

    /**
     * Get limitGet 限领数量.
     *
     * @return the string
     */
    public Integer getLimitGet(){
        return limitGet;
    }

    /**
     * Set limitNum 发放的数量，-1：不限制数量.
     */
    public void setLimitNum(Integer limitNum){
        this.limitNum = limitNum;
    }

    /**
     * Get limitNum 发放的数量，-1：不限制数量.
     *
     * @return the string
     */
    public Integer getLimitNum(){
        return limitNum;
    }

    /**
     * Set showInWx 是否在WX显示 0否 1是.
     */
    public void setShowInWx(Boolean showInWx){
        this.showInWx = showInWx;
    }

    /**
     * Get showInWx 是否在WX显示 0否 1是.
     *
     * @return the string
     */
    public Boolean getShowInWx(){
        return showInWx;
    }

    /**
     * Set inputtime 添加时间的时间戳.
     */
    public void setInputtime(Integer inputtime){
        this.inputtime = inputtime;
    }

    /**
     * Get inputtime 添加时间的时间戳.
     *
     * @return the string
     */
    public Integer getInputtime(){
        return inputtime;
    }

    /**
     * Set isReceive 是否可领取 1是 2否.
     */
    public void setIsReceive(Boolean isReceive){
        this.isReceive = isReceive;
    }

    /**
     * Get isReceive 是否可领取 1是 2否.
     *
     * @return the string
     */
    public Boolean getIsReceive(){
        return isReceive;
    }

    /**
     * Set limitUser 有权限的用户组.
     */
    public void setLimitUser(String limitUser){
        this.limitUser = limitUser;
    }

    /**
     * Get limitUser 有权限的用户组.
     *
     * @return the string
     */
    public String getLimitUser(){
        return limitUser;
    }

    /**
     * Set recommend 1推荐 2不推荐.
     */
    public void setRecommend(Boolean recommend){
        this.recommend = recommend;
    }

    /**
     * Get recommend 1推荐 2不推荐.
     *
     * @return the string
     */
    public Boolean getRecommend(){
        return recommend;
    }

    /**
     * Set showInApp 是否在APP显示 0否 1是.
     */
    public void setShowInApp(Boolean showInApp){
        this.showInApp = showInApp;
    }

    /**
     * Get showInApp 是否在APP显示 0否 1是.
     *
     * @return the string
     */
    public Boolean getShowInApp(){
        return showInApp;
    }

    /**
     * Set categoryId 优惠券类别ID.
     */
    public void setCategoryId(Integer categoryId){
        this.categoryId = categoryId;
    }

    /**
     * Get categoryId 优惠券类别ID.
     *
     * @return the string
     */
    public Integer getCategoryId(){
        return categoryId;
    }

    /**
     * Set isActivity 是否是活动卡券 0否 1是.
     */
    public void setIsActivity(Boolean isActivity){
        this.isActivity = isActivity;
    }

    /**
     * Get isActivity 是否是活动卡券 0否 1是.
     *
     * @return the string
     */
    public Boolean getIsActivity(){
        return isActivity;
    }

    /**
     * Set limitBtime 有效期开始时间.
     */
    public void setLimitBtime(Integer limitBtime){
        this.limitBtime = limitBtime;
    }

    /**
     * Get limitBtime 有效期开始时间.
     *
     * @return the string
     */
    public Integer getLimitBtime(){
        return limitBtime;
    }

    /**
     * Set limitEtime 有效期结束时间.
     */
    public void setLimitEtime(Integer limitEtime){
        this.limitEtime = limitEtime;
    }

    /**
     * Get limitEtime 有效期结束时间.
     *
     * @return the string
     */
    public Integer getLimitEtime(){
        return limitEtime;
    }

    /**
     * Set limitPrice 最小消费金额.
     */
    public void setLimitPrice(Integer limitPrice){
        this.limitPrice = limitPrice;
    }

    /**
     * Get limitPrice 最小消费金额.
     *
     * @return the string
     */
    public Integer getLimitPrice(){
        return limitPrice;
    }

    /**
     * Set ratePraise 好评率.
     */
    public void setRatePraise(Float ratePraise){
        this.ratePraise = ratePraise;
    }

    /**
     * Get ratePraise 好评率.
     *
     * @return the string
     */
    public Float getRatePraise(){
        return ratePraise;
    }

    /**
     * Set updatetime 最近一次修改时间的时间戳.
     */
    public void setUpdatetime(Integer updatetime){
        this.updatetime = updatetime;
    }

    /**
     * Get updatetime 最近一次修改时间的时间戳.
     *
     * @return the string
     */
    public Integer getUpdatetime(){
        return updatetime;
    }

    /**
     * Set dayLimitGet 每天限领数量.
     */
    public void setDayLimitGet(Integer dayLimitGet){
        this.dayLimitGet = dayLimitGet;
    }

    /**
     * Get dayLimitGet 每天限领数量.
     *
     * @return the string
     */
    public Integer getDayLimitGet(){
        return dayLimitGet;
    }

    /**
     * Set description 优惠券描述.
     */
    public void setDescription(String description){
        this.description = description;
    }

    /**
     * Get description 优惠券描述.
     *
     * @return the string
     */
    public String getDescription(){
        return description;
    }

    /**
     * Set isPrepaycard 是否预付卡 0不是 1是.
     */
    public void setIsPrepaycard(Integer isPrepaycard){
        this.isPrepaycard = isPrepaycard;
    }

    /**
     * Get isPrepaycard 是否预付卡 0不是 1是.
     *
     * @return the string
     */
    public Integer getIsPrepaycard(){
        return isPrepaycard;
    }

    /**
     * Set couponCategory 优惠券类别.
     */
    public void setCouponCategory(Integer couponCategory){
        this.couponCategory = couponCategory;
    }

    /**
     * Get couponCategory 优惠券类别.
     *
     * @return the string
     */
    public Integer getCouponCategory(){
        return couponCategory;
    }

    /**
     * Set noDiscountGroup 是不不能和会员优惠同用 1 不能 0 能.
     */
    public void setNoDiscountGroup(Boolean noDiscountGroup){
        this.noDiscountGroup = noDiscountGroup;
    }

    /**
     * Get noDiscountGroup 是不不能和会员优惠同用 1 不能 0 能.
     *
     * @return the string
     */
    public Boolean getNoDiscountGroup(){
        return noDiscountGroup;
    }
}
