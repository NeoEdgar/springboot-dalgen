package com.xl.dy.dal.dataobject;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The table TA_SHOP_GOODS
 */
public class TaShopGoodsDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * sales 销量.
     */
    private BigDecimal sales;
    /**
     * skuId SKU_ID（FK）.
     */
    private Long skuId;
    /**
     * mallId 商场ID（FK）.
     */
    private Long mallId;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * shopId 店铺ID（FK）.
     */
    private Long shopId;
    /**
     * goodsId 商品ID（FK）.
     */
    private Long goodsId;
    /**
     * isOnSale 是否在促销中.
     */
    private Integer isOnSale;
    /**
     * mallName 商场名称（快照）.
     */
    private String mallName;
    /**
     * shopName 店铺名称（快照）.
     */
    private String shopName;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * companyId 专业公司ID（FK）.
     */
    private Long companyId;
    /**
     * goodsCode 商品编号（快照）.
     */
    private String goodsCode;
    /**
     * goodsType 商品类型（快照）（DIC）.
     */
    private String goodsType;
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
     * erpGoodsId 业务系统商品ID.
     */
    private String erpGoodsId;
    /**
     * totalStore 总库存.
     */
    private BigDecimal totalStore;
    /**
     * companyName 专业公司名称（快照）.
     */
    private String companyName;
    /**
     * erpSaleCode 业务系统销售编码.
     */
    private String erpSaleCode;
    /**
     * evaluateNum 评价数量.
     */
    private Integer evaluateNum;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * shopPhotoUrl 店铺商品SKU图片.
     */
    private String shopPhotoUrl;
    /**
     * shopGoodsCode 店铺商品编码.
     */
    private String shopGoodsCode;

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
     * Set sales 销量.
     */
    public void setSales(BigDecimal sales){
        this.sales = sales;
    }

    /**
     * Get sales 销量.
     *
     * @return the string
     */
    public BigDecimal getSales(){
        return sales;
    }

    /**
     * Set skuId SKU_ID（FK）.
     */
    public void setSkuId(Long skuId){
        this.skuId = skuId;
    }

    /**
     * Get skuId SKU_ID（FK）.
     *
     * @return the string
     */
    public Long getSkuId(){
        return skuId;
    }

    /**
     * Set mallId 商场ID（FK）.
     */
    public void setMallId(Long mallId){
        this.mallId = mallId;
    }

    /**
     * Get mallId 商场ID（FK）.
     *
     * @return the string
     */
    public Long getMallId(){
        return mallId;
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
     * Set shopId 店铺ID（FK）.
     */
    public void setShopId(Long shopId){
        this.shopId = shopId;
    }

    /**
     * Get shopId 店铺ID（FK）.
     *
     * @return the string
     */
    public Long getShopId(){
        return shopId;
    }

    /**
     * Set goodsId 商品ID（FK）.
     */
    public void setGoodsId(Long goodsId){
        this.goodsId = goodsId;
    }

    /**
     * Get goodsId 商品ID（FK）.
     *
     * @return the string
     */
    public Long getGoodsId(){
        return goodsId;
    }

    /**
     * Set isOnSale 是否在促销中.
     */
    public void setIsOnSale(Integer isOnSale){
        this.isOnSale = isOnSale;
    }

    /**
     * Get isOnSale 是否在促销中.
     *
     * @return the string
     */
    public Integer getIsOnSale(){
        return isOnSale;
    }

    /**
     * Set mallName 商场名称（快照）.
     */
    public void setMallName(String mallName){
        this.mallName = mallName;
    }

    /**
     * Get mallName 商场名称（快照）.
     *
     * @return the string
     */
    public String getMallName(){
        return mallName;
    }

    /**
     * Set shopName 店铺名称（快照）.
     */
    public void setShopName(String shopName){
        this.shopName = shopName;
    }

    /**
     * Get shopName 店铺名称（快照）.
     *
     * @return the string
     */
    public String getShopName(){
        return shopName;
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
     * Set companyId 专业公司ID（FK）.
     */
    public void setCompanyId(Long companyId){
        this.companyId = companyId;
    }

    /**
     * Get companyId 专业公司ID（FK）.
     *
     * @return the string
     */
    public Long getCompanyId(){
        return companyId;
    }

    /**
     * Set goodsCode 商品编号（快照）.
     */
    public void setGoodsCode(String goodsCode){
        this.goodsCode = goodsCode;
    }

    /**
     * Get goodsCode 商品编号（快照）.
     *
     * @return the string
     */
    public String getGoodsCode(){
        return goodsCode;
    }

    /**
     * Set goodsType 商品类型（快照）（DIC）.
     */
    public void setGoodsType(String goodsType){
        this.goodsType = goodsType;
    }

    /**
     * Get goodsType 商品类型（快照）（DIC）.
     *
     * @return the string
     */
    public String getGoodsType(){
        return goodsType;
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
     * Set erpGoodsId 业务系统商品ID.
     */
    public void setErpGoodsId(String erpGoodsId){
        this.erpGoodsId = erpGoodsId;
    }

    /**
     * Get erpGoodsId 业务系统商品ID.
     *
     * @return the string
     */
    public String getErpGoodsId(){
        return erpGoodsId;
    }

    /**
     * Set totalStore 总库存.
     */
    public void setTotalStore(BigDecimal totalStore){
        this.totalStore = totalStore;
    }

    /**
     * Get totalStore 总库存.
     *
     * @return the string
     */
    public BigDecimal getTotalStore(){
        return totalStore;
    }

    /**
     * Set companyName 专业公司名称（快照）.
     */
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    /**
     * Get companyName 专业公司名称（快照）.
     *
     * @return the string
     */
    public String getCompanyName(){
        return companyName;
    }

    /**
     * Set erpSaleCode 业务系统销售编码.
     */
    public void setErpSaleCode(String erpSaleCode){
        this.erpSaleCode = erpSaleCode;
    }

    /**
     * Get erpSaleCode 业务系统销售编码.
     *
     * @return the string
     */
    public String getErpSaleCode(){
        return erpSaleCode;
    }

    /**
     * Set evaluateNum 评价数量.
     */
    public void setEvaluateNum(Integer evaluateNum){
        this.evaluateNum = evaluateNum;
    }

    /**
     * Get evaluateNum 评价数量.
     *
     * @return the string
     */
    public Integer getEvaluateNum(){
        return evaluateNum;
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
     * Set shopPhotoUrl 店铺商品SKU图片.
     */
    public void setShopPhotoUrl(String shopPhotoUrl){
        this.shopPhotoUrl = shopPhotoUrl;
    }

    /**
     * Get shopPhotoUrl 店铺商品SKU图片.
     *
     * @return the string
     */
    public String getShopPhotoUrl(){
        return shopPhotoUrl;
    }

    /**
     * Set shopGoodsCode 店铺商品编码.
     */
    public void setShopGoodsCode(String shopGoodsCode){
        this.shopGoodsCode = shopGoodsCode;
    }

    /**
     * Get shopGoodsCode 店铺商品编码.
     *
     * @return the string
     */
    public String getShopGoodsCode(){
        return shopGoodsCode;
    }
}
