package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaAdvertisementDO;
import com.xl.dy.dal.paging.QueryAdvertisementListPage;
import com.xl.dy.dal.mapper.TaAdvertisementDOMapper;

/**
* The Table TA_ADVERTISEMENT.
* TA_ADVERTISEMENT
*/
@Repository
public class TaAdvertisementDAO{

    @Autowired
    private TaAdvertisementDOMapper taAdvertisementDOMapper;

    /**
     * desc:插入表:TA_ADVERTISEMENT.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_ADVERTISEMENT( ID ,INX ,MALL_ID ,REMARK ,LINK_URL ,HTML_DATA ,ALTER_EMPL ,ALTER_TIME ,IS_DISPLAY ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,PUTAWAY_TIME ,SOLDOUT_TIME ,VALID_STATUS ,ADVERTISE_NAME ,ADVERTISE_TYPE )VALUES( #{id,jdbcType=BIGINT} , #{inx,jdbcType=INTEGER} , #{mallId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{linkUrl,jdbcType=VARCHAR} , #{htmlData,jdbcType=LONGVARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{isDisplay,jdbcType=INTEGER} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{putawayTime,jdbcType=TIMESTAMP} , #{soldoutTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{advertiseName,jdbcType=VARCHAR} , #{advertiseType,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaAdvertisementDO entity){
        return taAdvertisementDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_ADVERTISEMENT.<br/>
     * descSql =  UPDATE TA_ADVERTISEMENT SET INX = #{inx,jdbcType=INTEGER} ,MALL_ID = #{mallId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,LINK_URL = #{linkUrl,jdbcType=VARCHAR} ,HTML_DATA = #{htmlData,jdbcType=LONGVARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,IS_DISPLAY = #{isDisplay,jdbcType=INTEGER} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,PUTAWAY_TIME = #{putawayTime,jdbcType=TIMESTAMP} ,SOLDOUT_TIME = #{soldoutTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,ADVERTISE_NAME = #{advertiseName,jdbcType=VARCHAR} ,ADVERTISE_TYPE = #{advertiseType,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaAdvertisementDO entity){
        return taAdvertisementDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_ADVERTISEMENT.<br/>
     * descSql =  DELETE FROM TA_ADVERTISEMENT WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taAdvertisementDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_ADVERTISEMENT.<br/>
     * descSql =  SELECT * FROM TA_ADVERTISEMENT WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaAdvertisementDO
     */
    public TaAdvertisementDO getByPrimary(Long id){
        return taAdvertisementDOMapper.getByPrimary(id);
    }
    /**
     * desc:获取Advertisement分页列表.<br/>
     * descSql =  SELECT * FROM TA_ADVERTISEMENT WHERE ADVERTISE_TYPE = #{advertiseType,jdbcType=VARCHAR} AND MALL_ID = #{mallId,jdbcType=BIGINT} ORDER BY INX DESC
     * @param queryAdvertisementList queryAdvertisementList
     * @return QueryAdvertisementListPage
     */
    public QueryAdvertisementListPage findAdvertisementPage(QueryAdvertisementListPage queryAdvertisementList){
        int total = taAdvertisementDOMapper.findAdvertisementPageCount(queryAdvertisementList);
        if(total>0){
            queryAdvertisementList.setDatas(taAdvertisementDOMapper.findAdvertisementPageResult(queryAdvertisementList));
        }
        queryAdvertisementList.setTotal(total);
        return queryAdvertisementList;
    }
    /**
     * desc:更新表:TA_ADVERTISEMENT.<br/>
     * descSql =  UPDATE TA_ADVERTISEMENT INX = #{inx,jdbcType=INTEGER}, MALL_ID = #{mallId,jdbcType=BIGINT}, REMARK = #{remark,jdbcType=VARCHAR}, LINK_URL = #{linkUrl,jdbcType=VARCHAR}, HTML_DATA = #{htmlData,jdbcType=LONGVARCHAR}, ADVERTISE_NAME = #{advertiseName,jdbcType=VARCHAR}, ADVERTISE_TYPE = #{advertiseType,jdbcType=VARCHAR}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, IS_DISPLAY = #{isDisplay,jdbcType=INTEGER}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, PUTAWAY_TIME = #{putawayTime,jdbcType=TIMESTAMP}, SOLDOUT_TIME = #{soldoutTime,jdbcType=TIMESTAMP}, VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long updateByPrimarySelective(TaAdvertisementDO entity){
        return taAdvertisementDOMapper.updateByPrimarySelective(entity);
    }
}
