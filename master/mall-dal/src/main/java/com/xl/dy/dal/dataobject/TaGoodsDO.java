package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_GOODS
 */
public class TaGoodsDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * mgFrId 类目-管理类目全路径（快照）.
     */
    private String mgFrId;
    /**
     * mkFrId 类目-经营类目全路径（快照）.
     */
    private String mkFrId;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * brandId 品牌ID（FK）.
     */
    private Long brandId;
    /**
     * mongoId MONGOID.
     */
    private Long mongoId;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * goodsCode 商品编号.
     */
    private String goodsCode;
    /**
     * goodsName 商品名称.
     */
    private String goodsName;
    /**
     * goodsType 商品类型（DIC）.
     */
    private String goodsType;
    /**
     * innerCode 商品码-店内码.
     */
    private String innerCode;
    /**
     * regEmplId 原始登记人ID（FK）.
     */
    private Long regEmplId;
    /**
     * regShopId 原始登记-店铺ID（FK）.
     */
    private Long regShopId;
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
     * goodsSpell 商品拼音码.
     */
    private String goodsSpell;
    /**
     * regEmplName 原始登记-管理员姓名（快照）.
     */
    private String regEmplName;
    /**
     * regShopName 原始登记-店铺名称.
     */
    private String regShopName;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * goodsBarcode 商品码-国际码.
     */
    private String goodsBarcode;
    /**
     * mgCategoryId 类目-管理类目（FK）.
     */
    private Long mgCategoryId;
    /**
     * mkCategoryId 类目-经营类目（FK）.
     */
    private Long mkCategoryId;
    /**
     * regCompanyId 原始登记-专业公司ID（FK）.
     */
    private Long regCompanyId;
    /**
     * goodsSpecJson 商品规格信息（JSON）.
     */
    private String goodsSpecJson;
    /**
     * innerAnccCode 商品码-编码中心ID（预留字段）.
     */
    private String innerAnccCode;
    /**
     * regGoodsStyle 商品登记形式（DIC）.
     */
    private String regGoodsStyle;
    /**
     * regCompanyName 原始登记-专业公司名称.
     */
    private String regCompanyName;

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
     * Set mgFrId 类目-管理类目全路径（快照）.
     */
    public void setMgFrId(String mgFrId){
        this.mgFrId = mgFrId;
    }

    /**
     * Get mgFrId 类目-管理类目全路径（快照）.
     *
     * @return the string
     */
    public String getMgFrId(){
        return mgFrId;
    }

    /**
     * Set mkFrId 类目-经营类目全路径（快照）.
     */
    public void setMkFrId(String mkFrId){
        this.mkFrId = mkFrId;
    }

    /**
     * Get mkFrId 类目-经营类目全路径（快照）.
     *
     * @return the string
     */
    public String getMkFrId(){
        return mkFrId;
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
     * Set brandId 品牌ID（FK）.
     */
    public void setBrandId(Long brandId){
        this.brandId = brandId;
    }

    /**
     * Get brandId 品牌ID（FK）.
     *
     * @return the string
     */
    public Long getBrandId(){
        return brandId;
    }

    /**
     * Set mongoId MONGOID.
     */
    public void setMongoId(Long mongoId){
        this.mongoId = mongoId;
    }

    /**
     * Get mongoId MONGOID.
     *
     * @return the string
     */
    public Long getMongoId(){
        return mongoId;
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
     * Set goodsCode 商品编号.
     */
    public void setGoodsCode(String goodsCode){
        this.goodsCode = goodsCode;
    }

    /**
     * Get goodsCode 商品编号.
     *
     * @return the string
     */
    public String getGoodsCode(){
        return goodsCode;
    }

    /**
     * Set goodsName 商品名称.
     */
    public void setGoodsName(String goodsName){
        this.goodsName = goodsName;
    }

    /**
     * Get goodsName 商品名称.
     *
     * @return the string
     */
    public String getGoodsName(){
        return goodsName;
    }

    /**
     * Set goodsType 商品类型（DIC）.
     */
    public void setGoodsType(String goodsType){
        this.goodsType = goodsType;
    }

    /**
     * Get goodsType 商品类型（DIC）.
     *
     * @return the string
     */
    public String getGoodsType(){
        return goodsType;
    }

    /**
     * Set innerCode 商品码-店内码.
     */
    public void setInnerCode(String innerCode){
        this.innerCode = innerCode;
    }

    /**
     * Get innerCode 商品码-店内码.
     *
     * @return the string
     */
    public String getInnerCode(){
        return innerCode;
    }

    /**
     * Set regEmplId 原始登记人ID（FK）.
     */
    public void setRegEmplId(Long regEmplId){
        this.regEmplId = regEmplId;
    }

    /**
     * Get regEmplId 原始登记人ID（FK）.
     *
     * @return the string
     */
    public Long getRegEmplId(){
        return regEmplId;
    }

    /**
     * Set regShopId 原始登记-店铺ID（FK）.
     */
    public void setRegShopId(Long regShopId){
        this.regShopId = regShopId;
    }

    /**
     * Get regShopId 原始登记-店铺ID（FK）.
     *
     * @return the string
     */
    public Long getRegShopId(){
        return regShopId;
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
     * Set goodsSpell 商品拼音码.
     */
    public void setGoodsSpell(String goodsSpell){
        this.goodsSpell = goodsSpell;
    }

    /**
     * Get goodsSpell 商品拼音码.
     *
     * @return the string
     */
    public String getGoodsSpell(){
        return goodsSpell;
    }

    /**
     * Set regEmplName 原始登记-管理员姓名（快照）.
     */
    public void setRegEmplName(String regEmplName){
        this.regEmplName = regEmplName;
    }

    /**
     * Get regEmplName 原始登记-管理员姓名（快照）.
     *
     * @return the string
     */
    public String getRegEmplName(){
        return regEmplName;
    }

    /**
     * Set regShopName 原始登记-店铺名称.
     */
    public void setRegShopName(String regShopName){
        this.regShopName = regShopName;
    }

    /**
     * Get regShopName 原始登记-店铺名称.
     *
     * @return the string
     */
    public String getRegShopName(){
        return regShopName;
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
     * Set goodsBarcode 商品码-国际码.
     */
    public void setGoodsBarcode(String goodsBarcode){
        this.goodsBarcode = goodsBarcode;
    }

    /**
     * Get goodsBarcode 商品码-国际码.
     *
     * @return the string
     */
    public String getGoodsBarcode(){
        return goodsBarcode;
    }

    /**
     * Set mgCategoryId 类目-管理类目（FK）.
     */
    public void setMgCategoryId(Long mgCategoryId){
        this.mgCategoryId = mgCategoryId;
    }

    /**
     * Get mgCategoryId 类目-管理类目（FK）.
     *
     * @return the string
     */
    public Long getMgCategoryId(){
        return mgCategoryId;
    }

    /**
     * Set mkCategoryId 类目-经营类目（FK）.
     */
    public void setMkCategoryId(Long mkCategoryId){
        this.mkCategoryId = mkCategoryId;
    }

    /**
     * Get mkCategoryId 类目-经营类目（FK）.
     *
     * @return the string
     */
    public Long getMkCategoryId(){
        return mkCategoryId;
    }

    /**
     * Set regCompanyId 原始登记-专业公司ID（FK）.
     */
    public void setRegCompanyId(Long regCompanyId){
        this.regCompanyId = regCompanyId;
    }

    /**
     * Get regCompanyId 原始登记-专业公司ID（FK）.
     *
     * @return the string
     */
    public Long getRegCompanyId(){
        return regCompanyId;
    }

    /**
     * Set goodsSpecJson 商品规格信息（JSON）.
     */
    public void setGoodsSpecJson(String goodsSpecJson){
        this.goodsSpecJson = goodsSpecJson;
    }

    /**
     * Get goodsSpecJson 商品规格信息（JSON）.
     *
     * @return the string
     */
    public String getGoodsSpecJson(){
        return goodsSpecJson;
    }

    /**
     * Set innerAnccCode 商品码-编码中心ID（预留字段）.
     */
    public void setInnerAnccCode(String innerAnccCode){
        this.innerAnccCode = innerAnccCode;
    }

    /**
     * Get innerAnccCode 商品码-编码中心ID（预留字段）.
     *
     * @return the string
     */
    public String getInnerAnccCode(){
        return innerAnccCode;
    }

    /**
     * Set regGoodsStyle 商品登记形式（DIC）.
     */
    public void setRegGoodsStyle(String regGoodsStyle){
        this.regGoodsStyle = regGoodsStyle;
    }

    /**
     * Get regGoodsStyle 商品登记形式（DIC）.
     *
     * @return the string
     */
    public String getRegGoodsStyle(){
        return regGoodsStyle;
    }

    /**
     * Set regCompanyName 原始登记-专业公司名称.
     */
    public void setRegCompanyName(String regCompanyName){
        this.regCompanyName = regCompanyName;
    }

    /**
     * Get regCompanyName 原始登记-专业公司名称.
     *
     * @return the string
     */
    public String getRegCompanyName(){
        return regCompanyName;
    }
}
