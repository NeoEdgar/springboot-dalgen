package com.xl.dy.dal.paging;

import com.xl.dy.dal.paging.BasePage;
import java.util.Map;

/**
 * The table TA_COMPANY_GOODS_PROP TA_COMPANY_GOODS_PROP
 */
public class QueryClaimGoodsListPage extends BasePage<Map>{

    /**
     * companyId 专业公司ID.
     */
    private Long companyId;
    /**
     * comGoodsSaleStatus 专业公司产品售卖状态（DIC）.
     */
    private String comGoodsSaleStatus;
    /**
     * category .
     */
    private Long category;

    /**
     * Set companyId 专业公司ID.
     */
    public void setCompanyId(Long companyId){
        this.companyId = companyId;
    }

    /**
     * Get companyId 专业公司ID.
     *
     * @return the string
     */
    public Long getCompanyId(){
        return companyId;
    }

    /**
     * Set comGoodsSaleStatus 专业公司产品售卖状态（DIC）.
     */
    public void setComGoodsSaleStatus(String comGoodsSaleStatus){
        this.comGoodsSaleStatus = comGoodsSaleStatus;
    }

    /**
     * Get comGoodsSaleStatus 专业公司产品售卖状态（DIC）.
     *
     * @return the string
     */
    public String getComGoodsSaleStatus(){
        return comGoodsSaleStatus;
    }

    /**
     * Set category .
     */
    public void setCategory(Long category){
        this.category = category;
    }

    /**
     * Get category .
     *
     * @return the string
     */
    public Long getCategory(){
        return category;
    }
}
