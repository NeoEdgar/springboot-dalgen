package com.xl.dy.dal.paging;

import com.xl.dy.dal.dataobject.TaContractDO;
import java.util.Date;

/**
 * The table TA_CONTRACT TA_CONTRACT
 */
public class QueryContractListByMallPage extends BasePage<TaContractDO>{

    /**
     * endDate 合同结束日期.
     */
    private Date endDate;
    /**
     * mallId .
     */
    private Long mallId;
    /**
     * startDate 合同生效日期.
     */
    private Date startDate;

    /**
     * Set endDate 合同结束日期.
     */
    public void setEndDate(Date endDate){
        this.endDate = endDate;
    }

    /**
     * Get endDate 合同结束日期.
     *
     * @return the string
     */
    public Date getEndDate(){
        return endDate;
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
     * Set startDate 合同生效日期.
     */
    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }

    /**
     * Get startDate 合同生效日期.
     *
     * @return the string
     */
    public Date getStartDate(){
        return startDate;
    }
}
