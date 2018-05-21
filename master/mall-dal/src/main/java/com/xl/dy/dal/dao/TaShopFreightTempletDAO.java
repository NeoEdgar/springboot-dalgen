package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaShopFreightTempletDO;
import java.util.List;
import com.xl.dy.dal.resultmap.TemplateVO;
import com.xl.dy.dal.mapper.TaShopFreightTempletDOMapper;

/**
* The Table TA_SHOP_FREIGHT_TEMPLET.
* TA_SHOP_FREIGHT_TEMPLET
*/
@Repository
public class TaShopFreightTempletDAO{

    @Autowired
    private TaShopFreightTempletDOMapper taShopFreightTempletDOMapper;

    /**
     * desc:插入表:TA_SHOP_FREIGHT_TEMPLET.<br/>
     * descSql =  INSERT INTO TA_SHOP_FREIGHT_TEMPLET( ID ,REMARK ,SHOP_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,IS_DEFAULT_TEMPLET ,FREIGHT_TEMPLET_NAME ,SHOP_FREIGHT_TEMPLET_ID )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{isDefaultTemplet,jdbcType=INTEGER} , #{freightTempletName,jdbcType=VARCHAR} , #{shopFreightTempletId,jdbcType=BIGINT} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaShopFreightTempletDO entity){
        return taShopFreightTempletDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_SHOP_FREIGHT_TEMPLET.<br/>
     * descSql =  UPDATE TA_SHOP_FREIGHT_TEMPLET SET REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,IS_DEFAULT_TEMPLET = #{isDefaultTemplet,jdbcType=INTEGER} ,FREIGHT_TEMPLET_NAME = #{freightTempletName,jdbcType=VARCHAR} ,SHOP_FREIGHT_TEMPLET_ID = #{shopFreightTempletId,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaShopFreightTempletDO entity){
        return taShopFreightTempletDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_SHOP_FREIGHT_TEMPLET.<br/>
     * descSql =  DELETE FROM TA_SHOP_FREIGHT_TEMPLET WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taShopFreightTempletDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_FREIGHT_TEMPLET.<br/>
     * descSql =  SELECT * FROM TA_SHOP_FREIGHT_TEMPLET WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopFreightTempletDO
     */
    public TaShopFreightTempletDO getByPrimary(Long id){
        return taShopFreightTempletDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_FREIGHT_TEMPLET.<br/>
     * descSql =  SELECT * FROM TA_SHOP_FREIGHT_TEMPLET WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND IS_DEFAULT_TEMPLET = 1
     * @param shopId shopId
     * @return TaShopFreightTempletDO
     */
    public TaShopFreightTempletDO getDefaultTemplate(Long shopId){
        return taShopFreightTempletDOMapper.getDefaultTemplate(shopId);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_FREIGHT_TEMPLET.<br/>
     * descSql =  SELECT * FROM TA_SHOP_FREIGHT_TEMPLET WHERE SHOP_ID = #{shopId,jdbcType=BIGINT}
     * @param shopId shopId
     * @return List<TaShopFreightTempletDO>
     */
    public List<TaShopFreightTempletDO> getByShopId(Long shopId){
        return taShopFreightTempletDOMapper.getByShopId(shopId);
    }
    /**
     * desc:更新表:TA_SHOP_FREIGHT_TEMPLET.<br/>
     * descSql =  UPDATE TA_SHOP_FREIGHT_TEMPLET SET ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME =#{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP =#{timestamp,jdbcType=BIGINT} ,IS_DEFAULT_TEMPLET = #{isDefaultTemplet,jdbcType=INTEGER} WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND ID &lt;&gt;#{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long updateOtherFreightTempletNotDefault(TaShopFreightTempletDO entity){
        return taShopFreightTempletDOMapper.updateOtherFreightTempletNotDefault(entity);
    }
    /**
     * desc:更新表:TA_SHOP_FREIGHT_TEMPLET.<br/>
     * descSql =  UPDATE TA_SHOP_FREIGHT_TEMPLET SET ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME =#{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP =#{timestamp,jdbcType=BIGINT} ,IS_DEFAULT_TEMPLET = #{isDefaultTemplet,jdbcType=INTEGER} WHERE ID =#{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long updateFreightTempletDefault(TaShopFreightTempletDO entity){
        return taShopFreightTempletDOMapper.updateFreightTempletDefault(entity);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_FREIGHT_TEMPLET.<br/>
     * descSql =  SELECT a.ID id,a.SHOP_ID shopId,a.FREIGHT_TEMPLET_NAME freightTempletName ,a.create_time createTime,a.IS_DEFAULT_TEMPLET isDefault,b.ADDR_CODES freeCode ,b.ADDR_NAMES freeAddrName,c.ADDR_CODES reviceCode ,c.ADDR_NAMES reciveAddrName ,c.FREIGHT_COUNT_MODE freightCountMode,c.FIRST_UNIT firstUnit,c.FIRST_UNIT_FARE firstUnitFare,c.CONT_UNIT contUnit,c.CONT_UNIT_FARE contUnitFare FROM ta_shop_freight_templet a LEFT JOIN ta_shop_freight_freeship b ON a.ID = b.SHOP_FREIGHT_TEMPLET_ID LEFT JOIN ta_shop_freight_receive c ON a.ID = c.SHOP_FREIGHT_TEMPLET_ID WHERE a.SHOP_ID = #{shopId,jdbcType=BIGINT} ORDER BY a.create_time
     * @param shopId shopId
     * @return List<TemplateVO>
     */
    public List<TemplateVO> getFreightTemplateList(Long shopId){
        return taShopFreightTempletDOMapper.getFreightTemplateList(shopId);
    }
}
