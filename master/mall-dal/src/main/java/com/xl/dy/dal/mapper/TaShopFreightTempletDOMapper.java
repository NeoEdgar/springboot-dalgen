package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaShopFreightTempletDO;
import java.util.List;
import com.xl.dy.dal.resultmap.TemplateVO;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_SHOP_FREIGHT_TEMPLET.
 * TA_SHOP_FREIGHT_TEMPLET
 */
public interface TaShopFreightTempletDOMapper{

    /**
     * desc:插入表:TA_SHOP_FREIGHT_TEMPLET.<br/>
     * descSql =  INSERT INTO TA_SHOP_FREIGHT_TEMPLET( ID ,REMARK ,SHOP_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,IS_DEFAULT_TEMPLET ,FREIGHT_TEMPLET_NAME ,SHOP_FREIGHT_TEMPLET_ID )VALUES( #{id,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{isDefaultTemplet,jdbcType=INTEGER} , #{freightTempletName,jdbcType=VARCHAR} , #{shopFreightTempletId,jdbcType=BIGINT} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaShopFreightTempletDO entity);
    /**
     * desc:更新表:TA_SHOP_FREIGHT_TEMPLET.<br/>
     * descSql =  UPDATE TA_SHOP_FREIGHT_TEMPLET SET REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,IS_DEFAULT_TEMPLET = #{isDefaultTemplet,jdbcType=INTEGER} ,FREIGHT_TEMPLET_NAME = #{freightTempletName,jdbcType=VARCHAR} ,SHOP_FREIGHT_TEMPLET_ID = #{shopFreightTempletId,jdbcType=BIGINT} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaShopFreightTempletDO entity);
    /**
     * desc:根据主键删除数据:TA_SHOP_FREIGHT_TEMPLET.<br/>
     * descSql =  DELETE FROM TA_SHOP_FREIGHT_TEMPLET WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_SHOP_FREIGHT_TEMPLET.<br/>
     * descSql =  SELECT * FROM TA_SHOP_FREIGHT_TEMPLET WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopFreightTempletDO
     */
    TaShopFreightTempletDO getByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_SHOP_FREIGHT_TEMPLET.<br/>
     * descSql =  SELECT * FROM TA_SHOP_FREIGHT_TEMPLET WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND IS_DEFAULT_TEMPLET = 1
     * @param shopId shopId
     * @return TaShopFreightTempletDO
     */
    TaShopFreightTempletDO getDefaultTemplate(Long shopId);
    /**
     * desc:根据主键获取数据:TA_SHOP_FREIGHT_TEMPLET.<br/>
     * descSql =  SELECT * FROM TA_SHOP_FREIGHT_TEMPLET WHERE SHOP_ID = #{shopId,jdbcType=BIGINT}
     * @param shopId shopId
     * @return List<TaShopFreightTempletDO>
     */
    List<TaShopFreightTempletDO> getByShopId(Long shopId);
    /**
     * desc:更新表:TA_SHOP_FREIGHT_TEMPLET.<br/>
     * descSql =  UPDATE TA_SHOP_FREIGHT_TEMPLET SET ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME =#{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP =#{timestamp,jdbcType=BIGINT} ,IS_DEFAULT_TEMPLET = #{isDefaultTemplet,jdbcType=INTEGER} WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND ID &lt;&gt;#{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long updateOtherFreightTempletNotDefault(TaShopFreightTempletDO entity);
    /**
     * desc:更新表:TA_SHOP_FREIGHT_TEMPLET.<br/>
     * descSql =  UPDATE TA_SHOP_FREIGHT_TEMPLET SET ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME =#{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP =#{timestamp,jdbcType=BIGINT} ,IS_DEFAULT_TEMPLET = #{isDefaultTemplet,jdbcType=INTEGER} WHERE ID =#{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long updateFreightTempletDefault(TaShopFreightTempletDO entity);
    /**
     * desc:根据主键获取数据:TA_SHOP_FREIGHT_TEMPLET.<br/>
     * descSql =  SELECT a.ID id,a.SHOP_ID shopId,a.FREIGHT_TEMPLET_NAME freightTempletName ,a.create_time createTime,a.IS_DEFAULT_TEMPLET isDefault,b.ADDR_CODES freeCode ,b.ADDR_NAMES freeAddrName,c.ADDR_CODES reviceCode ,c.ADDR_NAMES reciveAddrName ,c.FREIGHT_COUNT_MODE freightCountMode,c.FIRST_UNIT firstUnit,c.FIRST_UNIT_FARE firstUnitFare,c.CONT_UNIT contUnit,c.CONT_UNIT_FARE contUnitFare FROM ta_shop_freight_templet a LEFT JOIN ta_shop_freight_freeship b ON a.ID = b.SHOP_FREIGHT_TEMPLET_ID LEFT JOIN ta_shop_freight_receive c ON a.ID = c.SHOP_FREIGHT_TEMPLET_ID WHERE a.SHOP_ID = #{shopId,jdbcType=BIGINT} ORDER BY a.create_time
     * @param shopId shopId
     * @return List<TemplateVO>
     */
    List<TemplateVO> getFreightTemplateList(Long shopId);
}
