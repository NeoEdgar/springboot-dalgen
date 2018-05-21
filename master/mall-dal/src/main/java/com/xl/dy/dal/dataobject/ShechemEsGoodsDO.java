package com.xl.dy.dal.dataobject;

import java.math.BigDecimal;

/**
 * The table SHECHEM_ES_GOODS
 */
public class ShechemEsGoodsDO{

    /**
     * id ID.
     */
    private Integer id;
    /**
     * mid MID.
     */
    private String mid;
    /**
     * uid UID.
     */
    private Integer uid;
    /**
     * isDm 是否是DM单商品  0否  1是.
     */
    private Boolean isDm;
    /**
     * turn TURN.
     */
    private Integer turn;
    /**
     * brief 销售描述.
     */
    private String brief;
    /**
     * isHot 是否热销，0，否；1，是.
     */
    private Boolean isHot;
    /**
     * isNew 是否是新品.
     */
    private Boolean isNew;
    /**
     * thumb THUMB.
     */
    private String thumb;
    /**
     * title 商品名称.
     */
    private String title;
    /**
     * isBest 是否是精品；0，否；1，是.
     */
    private Boolean isBest;
    /**
     * isGift 是否支持送礼 0不支持 1支持.
     */
    private Boolean isGift;
    /**
     * isReal 是否是实物，1，是；0，否；比如虚拟卡就为0，不是实物.
     */
    private Boolean isReal;
    /**
     * isYear 正整数为年票商品，0：非年票商品.
     */
    private Integer isYear;
    /**
     * status STATUS.
     */
    private Boolean status;
    /**
     * typeId TYPE_ID.
     */
    private Integer typeId;
    /**
     * volume 销量.
     */
    private Integer volume;
    /**
     * weight WEIGHT.
     */
    private BigDecimal weight;
    /**
     * brandId 品牌ID，取值于ECS_BRAND 的BRAND_ID.
     */
    private Integer brandId;
    /**
     * content CONTENT.
     */
    private String content;
    /**
     * display DISPLAY.
     */
    private Boolean display;
    /**
     * goodsSn 商品唯一货号.
     */
    private String goodsSn;
    /**
     * isSince 1：可以自提，0：不允许自提.
     */
    private Boolean isSince;
    /**
     * storeId 店铺ID.
     */
    private Integer storeId;
    /**
     * yearNum 年票商品数量，-1为不限制.
     */
    private Integer yearNum;
    /**
     * groupstr 会员组购买权限（会员组ID，以逗号分隔）.
     */
    private String groupstr;
    /**
     * isFamily 是否需要家庭会员 0否 1是.
     */
    private Boolean isFamily;
    /**
     * keywords KEYWORDS.
     */
    private String keywords;
    /**
     * limitBuy 限制购买数量.
     */
    private Integer limitBuy;
    /**
     * showInWx 是否在微信端显示.
     */
    private Boolean showInWx;
    /**
     * agreement 商品协议.
     */
    private String agreement;
    /**
     * inputtime INPUTTIME.
     */
    private Integer inputtime;
    /**
     * inventory 品商剩余库存.
     */
    private Integer inventory;
    /**
     * isIngroup 是否是团购状态.
     */
    private Boolean isIngroup;
    /**
     * parameter 参数设置（编辑器）.
     */
    private String parameter;
    /**
     * showInApp 是否在APP端显示.
     */
    private Boolean showInApp;
    /**
     * categoryId CATEGORY_ID.
     */
    private Integer categoryId;
    /**
     * erpTableid ERP关联表ID.
     */
    private Integer erpTableid;
    /**
     * eshopPrice 本店售价.
     */
    private Integer eshopPrice;
    /**
     * isIntegral 是否使用积分 0否 1是.
     */
    private Boolean isIntegral;
    /**
     * isShipping 是否包邮.
     */
    private Boolean isShipping;
    /**
     * setPromote SET_PROMOTE.
     */
    private String setPromote;
    /**
     * shippingId 默认运费模版ID.
     */
    private Integer shippingId;
    /**
     * updatetime UPDATETIME.
     */
    private Integer updatetime;
    /**
     * volumePlus 虚拟销量.
     */
    private Integer volumePlus;
    /**
     * volumeShow 显示销量.
     */
    private Integer volumeShow;
    /**
     * description DESCRIPTION.
     */
    private String description;
    /**
     * erpDataJson 如果存在ERP则对应存储ERP的数据(JSON格式).
     */
    private String erpDataJson;
    /**
     * isAloneSale 是否能单独销售，1，是；0，否；如果不能单独销售，则只能作为某商品的配件或者赠品销售.
     */
    private Boolean isAloneSale;
    /**
     * marketPrice 场价市.
     */
    private Integer marketPrice;
    /**
     * showInvoice 1：可以开发票，0：不可以开发票.
     */
    private Boolean showInvoice;
    /**
     * suppliersId 应商供ID.
     */
    private Integer suppliersId;
    /**
     * volumeTotal 总销量.
     */
    private Integer volumeTotal;
    /**
     * erpTablename ERP关联表名.
     */
    private String erpTablename;
    /**
     * inventoryMax 库存上限.
     */
    private Integer inventoryMax;
    /**
     * inventoryMin 库存下限.
     */
    private Integer inventoryMin;
    /**
     * isPrepaycard 是否预付卡 0不是 1是.
     */
    private Integer isPrepaycard;
    /**
     * packagePrice 套餐价格.
     */
    private Integer packagePrice;
    /**
     * sendOutletId 默认发货门店.
     */
    private Integer sendOutletId;
    /**
     * setAttribute 设置基本属性.
     */
    private String setAttribute;
    /**
     * shelvesBtime 上架开始时间.
     */
    private Integer shelvesBtime;
    /**
     * shelvesEtime 上架结束时间.
     */
    private Integer shelvesEtime;
    /**
     * integralGoods 分享商品所的积分.
     */
    private String integralGoods;
    /**
     * integralPrice 使用金钱数.
     */
    private Integer integralPrice;
    /**
     * integralAmount 积分数量.
     */
    private Integer integralAmount;
    /**
     * inventoryTotal 总库存.
     */
    private Integer inventoryTotal;
    /**
     * isDistribution 1：可以配送，0：不允许配送.
     */
    private Boolean isDistribution;
    /**
     * isPreferential 是否优惠买单商品.
     */
    private Boolean isPreferential;
    /**
     * suppliersPrice 供货价格.
     */
    private Integer suppliersPrice;
    /**
     * inventoryWarning 商品预警库存 -1为不预警.
     */
    private Integer inventoryWarning;

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
     * Set mid MID.
     */
    public void setMid(String mid){
        this.mid = mid;
    }

    /**
     * Get mid MID.
     *
     * @return the string
     */
    public String getMid(){
        return mid;
    }

    /**
     * Set uid UID.
     */
    public void setUid(Integer uid){
        this.uid = uid;
    }

    /**
     * Get uid UID.
     *
     * @return the string
     */
    public Integer getUid(){
        return uid;
    }

    /**
     * Set isDm 是否是DM单商品  0否  1是.
     */
    public void setIsDm(Boolean isDm){
        this.isDm = isDm;
    }

    /**
     * Get isDm 是否是DM单商品  0否  1是.
     *
     * @return the string
     */
    public Boolean getIsDm(){
        return isDm;
    }

    /**
     * Set turn TURN.
     */
    public void setTurn(Integer turn){
        this.turn = turn;
    }

    /**
     * Get turn TURN.
     *
     * @return the string
     */
    public Integer getTurn(){
        return turn;
    }

    /**
     * Set brief 销售描述.
     */
    public void setBrief(String brief){
        this.brief = brief;
    }

    /**
     * Get brief 销售描述.
     *
     * @return the string
     */
    public String getBrief(){
        return brief;
    }

    /**
     * Set isHot 是否热销，0，否；1，是.
     */
    public void setIsHot(Boolean isHot){
        this.isHot = isHot;
    }

    /**
     * Get isHot 是否热销，0，否；1，是.
     *
     * @return the string
     */
    public Boolean getIsHot(){
        return isHot;
    }

    /**
     * Set isNew 是否是新品.
     */
    public void setIsNew(Boolean isNew){
        this.isNew = isNew;
    }

    /**
     * Get isNew 是否是新品.
     *
     * @return the string
     */
    public Boolean getIsNew(){
        return isNew;
    }

    /**
     * Set thumb THUMB.
     */
    public void setThumb(String thumb){
        this.thumb = thumb;
    }

    /**
     * Get thumb THUMB.
     *
     * @return the string
     */
    public String getThumb(){
        return thumb;
    }

    /**
     * Set title 商品名称.
     */
    public void setTitle(String title){
        this.title = title;
    }

    /**
     * Get title 商品名称.
     *
     * @return the string
     */
    public String getTitle(){
        return title;
    }

    /**
     * Set isBest 是否是精品；0，否；1，是.
     */
    public void setIsBest(Boolean isBest){
        this.isBest = isBest;
    }

    /**
     * Get isBest 是否是精品；0，否；1，是.
     *
     * @return the string
     */
    public Boolean getIsBest(){
        return isBest;
    }

    /**
     * Set isGift 是否支持送礼 0不支持 1支持.
     */
    public void setIsGift(Boolean isGift){
        this.isGift = isGift;
    }

    /**
     * Get isGift 是否支持送礼 0不支持 1支持.
     *
     * @return the string
     */
    public Boolean getIsGift(){
        return isGift;
    }

    /**
     * Set isReal 是否是实物，1，是；0，否；比如虚拟卡就为0，不是实物.
     */
    public void setIsReal(Boolean isReal){
        this.isReal = isReal;
    }

    /**
     * Get isReal 是否是实物，1，是；0，否；比如虚拟卡就为0，不是实物.
     *
     * @return the string
     */
    public Boolean getIsReal(){
        return isReal;
    }

    /**
     * Set isYear 正整数为年票商品，0：非年票商品.
     */
    public void setIsYear(Integer isYear){
        this.isYear = isYear;
    }

    /**
     * Get isYear 正整数为年票商品，0：非年票商品.
     *
     * @return the string
     */
    public Integer getIsYear(){
        return isYear;
    }

    /**
     * Set status STATUS.
     */
    public void setStatus(Boolean status){
        this.status = status;
    }

    /**
     * Get status STATUS.
     *
     * @return the string
     */
    public Boolean getStatus(){
        return status;
    }

    /**
     * Set typeId TYPE_ID.
     */
    public void setTypeId(Integer typeId){
        this.typeId = typeId;
    }

    /**
     * Get typeId TYPE_ID.
     *
     * @return the string
     */
    public Integer getTypeId(){
        return typeId;
    }

    /**
     * Set volume 销量.
     */
    public void setVolume(Integer volume){
        this.volume = volume;
    }

    /**
     * Get volume 销量.
     *
     * @return the string
     */
    public Integer getVolume(){
        return volume;
    }

    /**
     * Set weight WEIGHT.
     */
    public void setWeight(BigDecimal weight){
        this.weight = weight;
    }

    /**
     * Get weight WEIGHT.
     *
     * @return the string
     */
    public BigDecimal getWeight(){
        return weight;
    }

    /**
     * Set brandId 品牌ID，取值于ECS_BRAND 的BRAND_ID.
     */
    public void setBrandId(Integer brandId){
        this.brandId = brandId;
    }

    /**
     * Get brandId 品牌ID，取值于ECS_BRAND 的BRAND_ID.
     *
     * @return the string
     */
    public Integer getBrandId(){
        return brandId;
    }

    /**
     * Set content CONTENT.
     */
    public void setContent(String content){
        this.content = content;
    }

    /**
     * Get content CONTENT.
     *
     * @return the string
     */
    public String getContent(){
        return content;
    }

    /**
     * Set display DISPLAY.
     */
    public void setDisplay(Boolean display){
        this.display = display;
    }

    /**
     * Get display DISPLAY.
     *
     * @return the string
     */
    public Boolean getDisplay(){
        return display;
    }

    /**
     * Set goodsSn 商品唯一货号.
     */
    public void setGoodsSn(String goodsSn){
        this.goodsSn = goodsSn;
    }

    /**
     * Get goodsSn 商品唯一货号.
     *
     * @return the string
     */
    public String getGoodsSn(){
        return goodsSn;
    }

    /**
     * Set isSince 1：可以自提，0：不允许自提.
     */
    public void setIsSince(Boolean isSince){
        this.isSince = isSince;
    }

    /**
     * Get isSince 1：可以自提，0：不允许自提.
     *
     * @return the string
     */
    public Boolean getIsSince(){
        return isSince;
    }

    /**
     * Set storeId 店铺ID.
     */
    public void setStoreId(Integer storeId){
        this.storeId = storeId;
    }

    /**
     * Get storeId 店铺ID.
     *
     * @return the string
     */
    public Integer getStoreId(){
        return storeId;
    }

    /**
     * Set yearNum 年票商品数量，-1为不限制.
     */
    public void setYearNum(Integer yearNum){
        this.yearNum = yearNum;
    }

    /**
     * Get yearNum 年票商品数量，-1为不限制.
     *
     * @return the string
     */
    public Integer getYearNum(){
        return yearNum;
    }

    /**
     * Set groupstr 会员组购买权限（会员组ID，以逗号分隔）.
     */
    public void setGroupstr(String groupstr){
        this.groupstr = groupstr;
    }

    /**
     * Get groupstr 会员组购买权限（会员组ID，以逗号分隔）.
     *
     * @return the string
     */
    public String getGroupstr(){
        return groupstr;
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
     * Set keywords KEYWORDS.
     */
    public void setKeywords(String keywords){
        this.keywords = keywords;
    }

    /**
     * Get keywords KEYWORDS.
     *
     * @return the string
     */
    public String getKeywords(){
        return keywords;
    }

    /**
     * Set limitBuy 限制购买数量.
     */
    public void setLimitBuy(Integer limitBuy){
        this.limitBuy = limitBuy;
    }

    /**
     * Get limitBuy 限制购买数量.
     *
     * @return the string
     */
    public Integer getLimitBuy(){
        return limitBuy;
    }

    /**
     * Set showInWx 是否在微信端显示.
     */
    public void setShowInWx(Boolean showInWx){
        this.showInWx = showInWx;
    }

    /**
     * Get showInWx 是否在微信端显示.
     *
     * @return the string
     */
    public Boolean getShowInWx(){
        return showInWx;
    }

    /**
     * Set agreement 商品协议.
     */
    public void setAgreement(String agreement){
        this.agreement = agreement;
    }

    /**
     * Get agreement 商品协议.
     *
     * @return the string
     */
    public String getAgreement(){
        return agreement;
    }

    /**
     * Set inputtime INPUTTIME.
     */
    public void setInputtime(Integer inputtime){
        this.inputtime = inputtime;
    }

    /**
     * Get inputtime INPUTTIME.
     *
     * @return the string
     */
    public Integer getInputtime(){
        return inputtime;
    }

    /**
     * Set inventory 品商剩余库存.
     */
    public void setInventory(Integer inventory){
        this.inventory = inventory;
    }

    /**
     * Get inventory 品商剩余库存.
     *
     * @return the string
     */
    public Integer getInventory(){
        return inventory;
    }

    /**
     * Set isIngroup 是否是团购状态.
     */
    public void setIsIngroup(Boolean isIngroup){
        this.isIngroup = isIngroup;
    }

    /**
     * Get isIngroup 是否是团购状态.
     *
     * @return the string
     */
    public Boolean getIsIngroup(){
        return isIngroup;
    }

    /**
     * Set parameter 参数设置（编辑器）.
     */
    public void setParameter(String parameter){
        this.parameter = parameter;
    }

    /**
     * Get parameter 参数设置（编辑器）.
     *
     * @return the string
     */
    public String getParameter(){
        return parameter;
    }

    /**
     * Set showInApp 是否在APP端显示.
     */
    public void setShowInApp(Boolean showInApp){
        this.showInApp = showInApp;
    }

    /**
     * Get showInApp 是否在APP端显示.
     *
     * @return the string
     */
    public Boolean getShowInApp(){
        return showInApp;
    }

    /**
     * Set categoryId CATEGORY_ID.
     */
    public void setCategoryId(Integer categoryId){
        this.categoryId = categoryId;
    }

    /**
     * Get categoryId CATEGORY_ID.
     *
     * @return the string
     */
    public Integer getCategoryId(){
        return categoryId;
    }

    /**
     * Set erpTableid ERP关联表ID.
     */
    public void setErpTableid(Integer erpTableid){
        this.erpTableid = erpTableid;
    }

    /**
     * Get erpTableid ERP关联表ID.
     *
     * @return the string
     */
    public Integer getErpTableid(){
        return erpTableid;
    }

    /**
     * Set eshopPrice 本店售价.
     */
    public void setEshopPrice(Integer eshopPrice){
        this.eshopPrice = eshopPrice;
    }

    /**
     * Get eshopPrice 本店售价.
     *
     * @return the string
     */
    public Integer getEshopPrice(){
        return eshopPrice;
    }

    /**
     * Set isIntegral 是否使用积分 0否 1是.
     */
    public void setIsIntegral(Boolean isIntegral){
        this.isIntegral = isIntegral;
    }

    /**
     * Get isIntegral 是否使用积分 0否 1是.
     *
     * @return the string
     */
    public Boolean getIsIntegral(){
        return isIntegral;
    }

    /**
     * Set isShipping 是否包邮.
     */
    public void setIsShipping(Boolean isShipping){
        this.isShipping = isShipping;
    }

    /**
     * Get isShipping 是否包邮.
     *
     * @return the string
     */
    public Boolean getIsShipping(){
        return isShipping;
    }

    /**
     * Set setPromote SET_PROMOTE.
     */
    public void setSetPromote(String setPromote){
        this.setPromote = setPromote;
    }

    /**
     * Get setPromote SET_PROMOTE.
     *
     * @return the string
     */
    public String getSetPromote(){
        return setPromote;
    }

    /**
     * Set shippingId 默认运费模版ID.
     */
    public void setShippingId(Integer shippingId){
        this.shippingId = shippingId;
    }

    /**
     * Get shippingId 默认运费模版ID.
     *
     * @return the string
     */
    public Integer getShippingId(){
        return shippingId;
    }

    /**
     * Set updatetime UPDATETIME.
     */
    public void setUpdatetime(Integer updatetime){
        this.updatetime = updatetime;
    }

    /**
     * Get updatetime UPDATETIME.
     *
     * @return the string
     */
    public Integer getUpdatetime(){
        return updatetime;
    }

    /**
     * Set volumePlus 虚拟销量.
     */
    public void setVolumePlus(Integer volumePlus){
        this.volumePlus = volumePlus;
    }

    /**
     * Get volumePlus 虚拟销量.
     *
     * @return the string
     */
    public Integer getVolumePlus(){
        return volumePlus;
    }

    /**
     * Set volumeShow 显示销量.
     */
    public void setVolumeShow(Integer volumeShow){
        this.volumeShow = volumeShow;
    }

    /**
     * Get volumeShow 显示销量.
     *
     * @return the string
     */
    public Integer getVolumeShow(){
        return volumeShow;
    }

    /**
     * Set description DESCRIPTION.
     */
    public void setDescription(String description){
        this.description = description;
    }

    /**
     * Get description DESCRIPTION.
     *
     * @return the string
     */
    public String getDescription(){
        return description;
    }

    /**
     * Set erpDataJson 如果存在ERP则对应存储ERP的数据(JSON格式).
     */
    public void setErpDataJson(String erpDataJson){
        this.erpDataJson = erpDataJson;
    }

    /**
     * Get erpDataJson 如果存在ERP则对应存储ERP的数据(JSON格式).
     *
     * @return the string
     */
    public String getErpDataJson(){
        return erpDataJson;
    }

    /**
     * Set isAloneSale 是否能单独销售，1，是；0，否；如果不能单独销售，则只能作为某商品的配件或者赠品销售.
     */
    public void setIsAloneSale(Boolean isAloneSale){
        this.isAloneSale = isAloneSale;
    }

    /**
     * Get isAloneSale 是否能单独销售，1，是；0，否；如果不能单独销售，则只能作为某商品的配件或者赠品销售.
     *
     * @return the string
     */
    public Boolean getIsAloneSale(){
        return isAloneSale;
    }

    /**
     * Set marketPrice 场价市.
     */
    public void setMarketPrice(Integer marketPrice){
        this.marketPrice = marketPrice;
    }

    /**
     * Get marketPrice 场价市.
     *
     * @return the string
     */
    public Integer getMarketPrice(){
        return marketPrice;
    }

    /**
     * Set showInvoice 1：可以开发票，0：不可以开发票.
     */
    public void setShowInvoice(Boolean showInvoice){
        this.showInvoice = showInvoice;
    }

    /**
     * Get showInvoice 1：可以开发票，0：不可以开发票.
     *
     * @return the string
     */
    public Boolean getShowInvoice(){
        return showInvoice;
    }

    /**
     * Set suppliersId 应商供ID.
     */
    public void setSuppliersId(Integer suppliersId){
        this.suppliersId = suppliersId;
    }

    /**
     * Get suppliersId 应商供ID.
     *
     * @return the string
     */
    public Integer getSuppliersId(){
        return suppliersId;
    }

    /**
     * Set volumeTotal 总销量.
     */
    public void setVolumeTotal(Integer volumeTotal){
        this.volumeTotal = volumeTotal;
    }

    /**
     * Get volumeTotal 总销量.
     *
     * @return the string
     */
    public Integer getVolumeTotal(){
        return volumeTotal;
    }

    /**
     * Set erpTablename ERP关联表名.
     */
    public void setErpTablename(String erpTablename){
        this.erpTablename = erpTablename;
    }

    /**
     * Get erpTablename ERP关联表名.
     *
     * @return the string
     */
    public String getErpTablename(){
        return erpTablename;
    }

    /**
     * Set inventoryMax 库存上限.
     */
    public void setInventoryMax(Integer inventoryMax){
        this.inventoryMax = inventoryMax;
    }

    /**
     * Get inventoryMax 库存上限.
     *
     * @return the string
     */
    public Integer getInventoryMax(){
        return inventoryMax;
    }

    /**
     * Set inventoryMin 库存下限.
     */
    public void setInventoryMin(Integer inventoryMin){
        this.inventoryMin = inventoryMin;
    }

    /**
     * Get inventoryMin 库存下限.
     *
     * @return the string
     */
    public Integer getInventoryMin(){
        return inventoryMin;
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
     * Set packagePrice 套餐价格.
     */
    public void setPackagePrice(Integer packagePrice){
        this.packagePrice = packagePrice;
    }

    /**
     * Get packagePrice 套餐价格.
     *
     * @return the string
     */
    public Integer getPackagePrice(){
        return packagePrice;
    }

    /**
     * Set sendOutletId 默认发货门店.
     */
    public void setSendOutletId(Integer sendOutletId){
        this.sendOutletId = sendOutletId;
    }

    /**
     * Get sendOutletId 默认发货门店.
     *
     * @return the string
     */
    public Integer getSendOutletId(){
        return sendOutletId;
    }

    /**
     * Set setAttribute 设置基本属性.
     */
    public void setSetAttribute(String setAttribute){
        this.setAttribute = setAttribute;
    }

    /**
     * Get setAttribute 设置基本属性.
     *
     * @return the string
     */
    public String getSetAttribute(){
        return setAttribute;
    }

    /**
     * Set shelvesBtime 上架开始时间.
     */
    public void setShelvesBtime(Integer shelvesBtime){
        this.shelvesBtime = shelvesBtime;
    }

    /**
     * Get shelvesBtime 上架开始时间.
     *
     * @return the string
     */
    public Integer getShelvesBtime(){
        return shelvesBtime;
    }

    /**
     * Set shelvesEtime 上架结束时间.
     */
    public void setShelvesEtime(Integer shelvesEtime){
        this.shelvesEtime = shelvesEtime;
    }

    /**
     * Get shelvesEtime 上架结束时间.
     *
     * @return the string
     */
    public Integer getShelvesEtime(){
        return shelvesEtime;
    }

    /**
     * Set integralGoods 分享商品所的积分.
     */
    public void setIntegralGoods(String integralGoods){
        this.integralGoods = integralGoods;
    }

    /**
     * Get integralGoods 分享商品所的积分.
     *
     * @return the string
     */
    public String getIntegralGoods(){
        return integralGoods;
    }

    /**
     * Set integralPrice 使用金钱数.
     */
    public void setIntegralPrice(Integer integralPrice){
        this.integralPrice = integralPrice;
    }

    /**
     * Get integralPrice 使用金钱数.
     *
     * @return the string
     */
    public Integer getIntegralPrice(){
        return integralPrice;
    }

    /**
     * Set integralAmount 积分数量.
     */
    public void setIntegralAmount(Integer integralAmount){
        this.integralAmount = integralAmount;
    }

    /**
     * Get integralAmount 积分数量.
     *
     * @return the string
     */
    public Integer getIntegralAmount(){
        return integralAmount;
    }

    /**
     * Set inventoryTotal 总库存.
     */
    public void setInventoryTotal(Integer inventoryTotal){
        this.inventoryTotal = inventoryTotal;
    }

    /**
     * Get inventoryTotal 总库存.
     *
     * @return the string
     */
    public Integer getInventoryTotal(){
        return inventoryTotal;
    }

    /**
     * Set isDistribution 1：可以配送，0：不允许配送.
     */
    public void setIsDistribution(Boolean isDistribution){
        this.isDistribution = isDistribution;
    }

    /**
     * Get isDistribution 1：可以配送，0：不允许配送.
     *
     * @return the string
     */
    public Boolean getIsDistribution(){
        return isDistribution;
    }

    /**
     * Set isPreferential 是否优惠买单商品.
     */
    public void setIsPreferential(Boolean isPreferential){
        this.isPreferential = isPreferential;
    }

    /**
     * Get isPreferential 是否优惠买单商品.
     *
     * @return the string
     */
    public Boolean getIsPreferential(){
        return isPreferential;
    }

    /**
     * Set suppliersPrice 供货价格.
     */
    public void setSuppliersPrice(Integer suppliersPrice){
        this.suppliersPrice = suppliersPrice;
    }

    /**
     * Get suppliersPrice 供货价格.
     *
     * @return the string
     */
    public Integer getSuppliersPrice(){
        return suppliersPrice;
    }

    /**
     * Set inventoryWarning 商品预警库存 -1为不预警.
     */
    public void setInventoryWarning(Integer inventoryWarning){
        this.inventoryWarning = inventoryWarning;
    }

    /**
     * Get inventoryWarning 商品预警库存 -1为不预警.
     *
     * @return the string
     */
    public Integer getInventoryWarning(){
        return inventoryWarning;
    }
}
