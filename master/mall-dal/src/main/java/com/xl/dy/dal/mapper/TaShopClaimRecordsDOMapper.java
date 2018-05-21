package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaShopClaimRecordsDO;
import java.util.List;
import java.util.Date;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_SHOP_CLAIM_RECORDS.
 * TA_SHOP_CLAIM_RECORDS
 */
public interface TaShopClaimRecordsDOMapper{

    /**
     * desc:插入表:TA_SHOP_CLAIM_RECORDS.<br/>
     * descSql =  INSERT INTO TA_SHOP_CLAIM_RECORDS( ID ,SKU_ID ,REMARK ,SHOP_ID ,GOODS_ID ,ALTER_EMPL ,ALTER_TIME ,CLAIM_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{skuId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{goodsId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{claimTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaShopClaimRecordsDO entity);
    /**
     * desc:更新表:TA_SHOP_CLAIM_RECORDS.<br/>
     * descSql =  UPDATE TA_SHOP_CLAIM_RECORDS SET SKU_ID = #{skuId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,CLAIM_TIME = #{claimTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaShopClaimRecordsDO entity);
    /**
     * desc:根据主键删除数据:TA_SHOP_CLAIM_RECORDS.<br/>
     * descSql =  DELETE FROM TA_SHOP_CLAIM_RECORDS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_SHOP_CLAIM_RECORDS.<br/>
     * descSql =  SELECT * FROM TA_SHOP_CLAIM_RECORDS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopClaimRecordsDO
     */
    TaShopClaimRecordsDO getByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_SHOP_CLAIM_RECORDS.<br/>
     * descSql =  SELECT * FROM TA_SHOP_CLAIM_RECORDS WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param shopId shopId
     * @param goodsId goodsId
     * @return List<TaShopClaimRecordsDO>
     */
    List<TaShopClaimRecordsDO> getClaimRecords(@Param("shopId")Long shopId,@Param("goodsId")Long goodsId);
    /**
     * desc:根据主键删除数据:TA_SHOP_CLAIM_RECORDS.<br/>
     * descSql =  DELETE FROM TA_SHOP_CLAIM_RECORDS WHERE SKU_ID = #{skuId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} 
     * @param skuId skuId
     * @param shopId shopId
     * @return Long
     */
    Long deleteSelective(@Param("skuId")Long skuId,@Param("shopId")Long shopId);
    /**
     * desc:根据主键删除数据:TA_SHOP_CLAIM_RECORDS.<br/>
     * descSql =  DELETE FROM TA_SHOP_CLAIM_RECORDS WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param goodsId goodsId
     * @return Long
     */
    Long deleteByGoodsId(Long goodsId);
    /**
     * desc:根据主键获取数据:TA_SHOP_CLAIM_RECORDS.<br/>
     * descSql =  SELECT MAX(CLAIM_TIME) FROM TA_SHOP_CLAIM_RECORDS WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param shopId shopId
     * @param goodsId goodsId
     * @return Date
     */
    Date getClaimTime(@Param("shopId")Long shopId,@Param("goodsId")Long goodsId);
}
