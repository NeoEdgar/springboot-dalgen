package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaShopSendAddrDO;
import com.xl.dy.dal.paging.QueryShopAddrListPage;
import com.xl.dy.dal.mapper.TaShopSendAddrDOMapper;

/**
* The Table TA_SHOP_SEND_ADDR.
* TA_SHOP_SEND_ADDR
*/
@Repository
public class TaShopSendAddrDAO{

    @Autowired
    private TaShopSendAddrDOMapper taShopSendAddrDOMapper;

    /**
     * desc:插入表:TA_SHOP_SEND_ADDR.<br/>
     * descSql =  INSERT INTO TA_SHOP_SEND_ADDR( ID ,PHONE ,CITY_ID ,REMARK ,SENDER ,SHOP_ID ,ALTER_EMPL ,ALTER_TIME ,IS_DEFAULT ,IS_MENTION ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,DISTRICT_ID ,PROVINCE_ID ,MALL_ADDRESS ,VALID_STATUS ,SUBDISTICT_ID )VALUES( #{id,jdbcType=BIGINT} , #{phone,jdbcType=VARCHAR} , #{cityId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{sender,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{isDefault,jdbcType=INTEGER} , #{isMention,jdbcType=INTEGER} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{districtId,jdbcType=BIGINT} , #{provinceId,jdbcType=BIGINT} , #{mallAddress,jdbcType=VARCHAR} , #{validStatus,jdbcType=INTEGER} , #{subdistictId,jdbcType=BIGINT} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaShopSendAddrDO entity){
        return taShopSendAddrDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_SHOP_SEND_ADDR.<br/>
     * descSql =  UPDATE TA_SHOP_SEND_ADDR SET PHONE = #{phone,jdbcType=VARCHAR} ,CITY_ID = #{cityId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,SENDER = #{sender,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,IS_DEFAULT = #{isDefault,jdbcType=INTEGER} ,IS_MENTION = #{isMention,jdbcType=INTEGER} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,DISTRICT_ID = #{districtId,jdbcType=BIGINT} ,PROVINCE_ID = #{provinceId,jdbcType=BIGINT} ,MALL_ADDRESS = #{mallAddress,jdbcType=VARCHAR} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,SUBDISTICT_ID = #{subdistictId,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaShopSendAddrDO entity){
        return taShopSendAddrDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_SHOP_SEND_ADDR.<br/>
     * descSql =  DELETE FROM TA_SHOP_SEND_ADDR WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taShopSendAddrDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_SEND_ADDR.<br/>
     * descSql =  SELECT * FROM TA_SHOP_SEND_ADDR WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopSendAddrDO
     */
    public TaShopSendAddrDO getByPrimary(Long id){
        return taShopSendAddrDOMapper.getByPrimary(id);
    }
    /**
     * desc:更新表:TA_SHOP_SEND_ADDR.<br/>
     * descSql =  UPDATE TA_SHOP_SEND_ADDR SET ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,IS_DEFAULT = #{isDefault,jdbcType=INTEGER} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long updateDefultById(TaShopSendAddrDO entity){
        return taShopSendAddrDOMapper.updateDefultById(entity);
    }
    /**
     * desc:更新表:TA_SHOP_SEND_ADDR.<br/>
     * descSql =  UPDATE TA_SHOP_SEND_ADDR SET ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,IS_DEFAULT = #{isDefault,jdbcType=INTEGER} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} WHERE VALID_STATUS = 1 AND SHOP_ID = #{shopId,jdbcType=BIGINT} AND ID &lt;&gt; #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long updateNotDefultByShopId(TaShopSendAddrDO entity){
        return taShopSendAddrDOMapper.updateNotDefultByShopId(entity);
    }
    /**
     * desc:更新表:TA_SHOP_SEND_ADDR.<br/>
     * descSql =  UPDATE TA_SHOP_SEND_ADDR SET ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,VALID_STATUS = 0 ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long updateAddrNotValid(TaShopSendAddrDO entity){
        return taShopSendAddrDOMapper.updateAddrNotValid(entity);
    }
    /**
     * desc:更新表:TA_SHOP_SEND_ADDR.<br/>
     * descSql =  UPDATE TA_SHOP_SEND_ADDR SET PHONE = #{phone,jdbcType=VARCHAR} ,CITY_ID = #{cityId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,SENDER = #{sender,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,DISTRICT_ID = #{districtId,jdbcType=BIGINT} ,PROVINCE_ID = #{provinceId,jdbcType=BIGINT} ,MALL_ADDRESS = #{mallAddress,jdbcType=VARCHAR} ,SUBDISTICT_ID = #{subdistictId,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long updateAddrByPrimary(TaShopSendAddrDO entity){
        return taShopSendAddrDOMapper.updateAddrByPrimary(entity);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_SEND_ADDR.<br/>
     * descSql =  SELECT * FROM TA_SHOP_SEND_ADDR WHERE VALID_STATUS = 1 AND SHOP_ID = #{shopId,jdbcType=BIGINT} ORDER BY CREATE_TIME desc
     * @param queryShopAddrList queryShopAddrList
     * @return QueryShopAddrListPage
     */
    public QueryShopAddrListPage getAddrList(QueryShopAddrListPage queryShopAddrList){
        int total = taShopSendAddrDOMapper.getAddrListCount(queryShopAddrList);
        if(total>0){
            queryShopAddrList.setDatas(taShopSendAddrDOMapper.getAddrListResult(queryShopAddrList));
        }
        queryShopAddrList.setTotal(total);
        return queryShopAddrList;
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_SEND_ADDR.<br/>
     * descSql =  SELECT * FROM TA_SHOP_SEND_ADDR WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND IS_DEFAULT = 1
     * @param shopId shopId
     * @return TaShopSendAddrDO
     */
    public TaShopSendAddrDO getDefaultAddr(Long shopId){
        return taShopSendAddrDOMapper.getDefaultAddr(shopId);
    }
}
