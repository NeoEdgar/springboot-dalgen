package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaMicroPageDO;
import com.xl.dy.dal.paging.QueryMicroListPage;
import com.xl.dy.dal.mapper.TaMicroPageDOMapper;

/**
* The Table TA_MICRO_PAGE.
* TA_MICRO_PAGE
*/
@Repository
public class TaMicroPageDAO{

    @Autowired
    private TaMicroPageDOMapper taMicroPageDOMapper;

    /**
     * desc:???�表:TA_MICRO_PAGE.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_MICRO_PAGE( ID ,INX ,MALL_ID ,REMARK ,HTML_DATA ,ALTER_EMPL ,ALTER_TIME ,IS_ENABLED ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,QUICK_VIEW_URL ,EXTENSION_NAME ,EXTENSION_TYPE ,MICRO_PAGE_LINK ,MICRO_PAGE_NAME ,MICRO_PAGE_TYPE ,EXTENSION_DESCRIPTION )VALUES( #{id,jdbcType=BIGINT} , #{inx,jdbcType=INTEGER} , #{mallId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{htmlData,jdbcType=LONGVARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{isEnabled,jdbcType=INTEGER} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{quickViewUrl,jdbcType=VARCHAR} , #{extensionName,jdbcType=VARCHAR} , #{extensionType,jdbcType=VARCHAR} , #{microPageLink,jdbcType=VARCHAR} , #{microPageName,jdbcType=VARCHAR} , #{microPageType,jdbcType=VARCHAR} , #{extensionDescription,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaMicroPageDO entity){
        return taMicroPageDOMapper.insert(entity);
    }
    /**
     * desc:?��?�表:TA_MICRO_PAGE.<br/>
     * descSql =  UPDATE TA_MICRO_PAGE SET INX = #{inx,jdbcType=INTEGER} ,MALL_ID = #{mallId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,HTML_DATA = #{htmlData,jdbcType=LONGVARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,IS_ENABLED = #{isEnabled,jdbcType=INTEGER} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,QUICK_VIEW_URL = #{quickViewUrl,jdbcType=VARCHAR} ,EXTENSION_NAME = #{extensionName,jdbcType=VARCHAR} ,EXTENSION_TYPE = #{extensionType,jdbcType=VARCHAR} ,MICRO_PAGE_LINK = #{microPageLink,jdbcType=VARCHAR} ,MICRO_PAGE_NAME = #{microPageName,jdbcType=VARCHAR} ,MICRO_PAGE_TYPE = #{microPageType,jdbcType=VARCHAR} ,EXTENSION_DESCRIPTION = #{extensionDescription,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaMicroPageDO entity){
        return taMicroPageDOMapper.update(entity);
    }
    /**
     * desc:?��??主�?????��?��??:TA_MICRO_PAGE.<br/>
     * descSql =  DELETE FROM TA_MICRO_PAGE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taMicroPageDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:?��??主�???��???��??:TA_MICRO_PAGE.<br/>
     * descSql =  SELECT * FROM TA_MICRO_PAGE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaMicroPageDO
     */
    public TaMicroPageDO getByPrimary(Long id){
        return taMicroPageDOMapper.getByPrimary(id);
    }
    /**
     * desc:获取MicroPage分页列表:TA_MICRO_PAGE.<br/>
     * descSql =  SELECT * FROM TA_MICRO_PAGE WHERE MICRO_PAGE_TYPE = #{microPageType,jdbcType=VARCHAR} AND MALL_ID = #{mallId,jdbcType=BIGINT} ORDER BY CREATE_TIME DESC
     * @param queryMicroList queryMicroList
     * @return QueryMicroListPage
     */
    public QueryMicroListPage findMicroPage(QueryMicroListPage queryMicroList){
        int total = taMicroPageDOMapper.findMicroPageCount(queryMicroList);
        if(total>0){
            queryMicroList.setDatas(taMicroPageDOMapper.findMicroPageResult(queryMicroList));
        }
        queryMicroList.setTotal(total);
        return queryMicroList;
    }
}
