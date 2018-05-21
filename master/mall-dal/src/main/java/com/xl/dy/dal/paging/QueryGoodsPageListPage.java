package com.xl.dy.dal.paging;

import com.xl.dy.dal.resultmap.GoodShowVO;

/**
 * The table TA_GOODS TA_GOODS
 */
public class QueryGoodsPageListPage extends BasePage<GoodShowVO>{

    /**
     * brandName .
     */
    private String brandName;
    /**
     * goodsId .
     */
    private Long goodsId;
    /**
     * mallId .
     */
    private Long mallId;
    /**
     * catStr .
     */
    private String catStr;
    /**
     * comGoodSaleStatus .
     */
    private String comGoodSaleStatus;
    /**
     * isDraft 是否草稿箱商品.
     */
    private Integer isDraft;
    /**
     * auditType 审核-审核类型(DIC).
     */
    private String auditType;
    /**
     * draftUnitId 草稿箱所属单位ID.
     */
    private Long draftUnitId;
    /**
     * companyId .
     */
    private Long companyId;
    /**
     * searchStr .
     */
    private String searchStr;
    /**
     * shopId .
     */
    private Long shopId;
    /**
     * auditShopId 提交审核的店铺ID.
     */
    private Long auditShopId;
    /**
     * auditCompanyId 接收审核的专业公司ID.
     */
    private Long auditCompanyId;
    private String sortColumn;

    public String getSortColumn() {
        return sortColumn;
    }

    public void setSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
    }

    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    private String sortType;

    /**
     * Set brandName .
     */
    public void setBrandName(String brandName){
        this.brandName = brandName;
    }

    /**
     * Get brandName .
     *
     * @return the string
     */
    public String getBrandName(){
        return brandName;
    }

    /**
     * Set goodsId .
     */
    public void setGoodsId(Long goodsId){
        this.goodsId = goodsId;
    }

    /**
     * Get goodsId .
     *
     * @return the string
     */
    public Long getGoodsId(){
        return goodsId;
    }

    /**
     * Set mallId .
     */
    public void setMallId(Long mallId){
        this.mallId = mallId;
    }

    /**
     * Get mallId .
     *
     * @return the string
     */
    public Long getMallId(){
        return mallId;
    }

    /**
     * Set catStr .
     */
    public void setCatStr(String catStr){
        this.catStr = catStr;
    }

    /**
     * Get catStr .
     *
     * @return the string
     */
    public String getCatStr(){
        return catStr;
    }

    /**
     * Set comGoodSaleStatus .
     */
    public void setComGoodSaleStatus(String comGoodSaleStatus){
        this.comGoodSaleStatus = comGoodSaleStatus;
    }

    /**
     * Get comGoodSaleStatus .
     *
     * @return the string
     */
    public String getComGoodSaleStatus(){
        return comGoodSaleStatus;
    }

    /**
     * Set isDraft 是否草稿箱商品.
     */
    public void setIsDraft(Integer isDraft){
        this.isDraft = isDraft;
    }

    /**
     * Get isDraft 是否草稿箱商品.
     *
     * @return the string
     */
    public Integer getIsDraft(){
        return isDraft;
    }

    /**
     * Set auditType 审核-审核类型(DIC).
     */
    public void setAuditType(String auditType){
        this.auditType = auditType;
    }

    /**
     * Get auditType 审核-审核类型(DIC).
     *
     * @return the string
     */
    public String getAuditType(){
        return auditType;
    }

    /**
     * Set draftUnitId 草稿箱所属单位ID.
     */
    public void setDraftUnitId(Long draftUnitId){
        this.draftUnitId = draftUnitId;
    }

    /**
     * Get draftUnitId 草稿箱所属单位ID.
     *
     * @return the string
     */
    public Long getDraftUnitId(){
        return draftUnitId;
    }

    /**
     * Set companyId .
     */
    public void setCompanyId(Long companyId){
        this.companyId = companyId;
    }

    /**
     * Get companyId .
     *
     * @return the string
     */
    public Long getCompanyId(){
        return companyId;
    }

    /**
     * Set searchStr .
     */
    public void setSearchStr(String searchStr){
        this.searchStr = searchStr;
    }

    /**
     * Get searchStr .
     *
     * @return the string
     */
    public String getSearchStr(){
        return searchStr;
    }

    /**
     * Set shopId .
     */
    public void setShopId(Long shopId){
        this.shopId = shopId;
    }

    /**
     * Get shopId .
     *
     * @return the string
     */
    public Long getShopId(){
        return shopId;
    }

    /**
     * Set auditShopId 提交审核的店铺ID.
     */
    public void setAuditShopId(Long auditShopId){
        this.auditShopId = auditShopId;
    }

    /**
     * Get auditShopId 提交审核的店铺ID.
     *
     * @return the string
     */
    public Long getAuditShopId(){
        return auditShopId;
    }

    /**
     * Set auditCompanyId 接收审核的专业公司ID.
     */
    public void setAuditCompanyId(Long auditCompanyId){
        this.auditCompanyId = auditCompanyId;
    }

    /**
     * Get auditCompanyId 接收审核的专业公司ID.
     *
     * @return the string
     */
    public Long getAuditCompanyId(){
        return auditCompanyId;
    }
}
