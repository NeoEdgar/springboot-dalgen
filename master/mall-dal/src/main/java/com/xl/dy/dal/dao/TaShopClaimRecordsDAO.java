package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaShopClaimRecordsDO;
import java.util.List;
import java.util.Date;
import com.xl.dy.dal.mapper.TaShopClaimRecordsDOMapper;

/**
* The Table TA_SHOP_CLAIM_RECORDS.
* TA_SHOP_CLAIM_RECORDS
*/
@Repository
public class TaShopClaimRecordsDAO{

    @Autowired
    private TaShopClaimRecordsDOMapper taShopClaimRecordsDOMapper;

    /**
     * desc:插入表:TA_SHOP_CLAIM_RECORDS.<br/>
     * descSql =  INSERT INTO TA_SHOP_CLAIM_RECORDS( ID ,SKU_ID ,REMARK ,SHOP_ID ,GOODS_ID ,ALTER_EMPL ,ALTER_TIME ,CLAIM_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{skuId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{goodsId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{claimTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaShopClaimRecordsDO entity){
        return taShopClaimRecordsDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_SHOP_CLAIM_RECORDS.<br/>
     * descSql =  UPDATE TA_SHOP_CLAIM_RECORDS SET SKU_ID = #{skuId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,CLAIM_TIME = #{claimTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaShopClaimRecordsDO entity){
        return taShopClaimRecordsDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_SHOP_CLAIM_RECORDS.<br/>
     * descSql =  DELETE FROM TA_SHOP_CLAIM_RECORDS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taShopClaimRecordsDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_CLAIM_RECORDS.<br/>
     * descSql =  SELECT * FROM TA_SHOP_CLAIM_RECORDS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopClaimRecordsDO
     */
    public TaShopClaimRecordsDO getByPrimary(Long id){
        return taShopClaimRecordsDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_CLAIM_RECORDS.<br/>
     * descSql =  SELECT * FROM TA_SHOP_CLAIM_RECORDS WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param shopId shopId
     * @param goodsId goodsId
     * @return List<TaShopClaimRecordsDO>
     */
    public List<TaShopClaimRecordsDO> getClaimRecords(Long shopId,Long goodsId){
        return taShopClaimRecordsDOMapper.getClaimRecords(shopId, goodsId);
    }
    /**
     * desc:根据主键删除数据:TA_SHOP_CLAIM_RECORDS.<br/>
     * descSql =  DELETE FROM TA_SHOP_CLAIM_RECORDS WHERE SKU_ID = #{skuId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} 
     * @param skuId skuId
     * @param shopId shopId
     * @return Long
     */
    public Long deleteSelective(Long skuId,Long shopId){
        return taShopClaimRecordsDOMapper.deleteSelective(skuId, shopId);
    }
    /**
     * desc:根据主键删除数据:TA_SHOP_CLAIM_RECORDS.<br/>
     * descSql =  DELETE FROM TA_SHOP_CLAIM_RECORDS WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param goodsId goodsId
     * @return Long
     */
    public Long deleteByGoodsId(Long goodsId){
        return taShopClaimRecordsDOMapper.deleteByGoodsId(goodsId);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_CLAIM_RECORDS.<br/>
     * descSql =  SELECT MAX(CLAIM_TIME) FROM TA_SHOP_CLAIM_RECORDS WHERE SHOP_ID = #{shopId,jdbcType=BIGINT} AND GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param shopId shopId
     * @param goodsId goodsId
     * @return Date
     */
    public Date getClaimTime(Long shopId,Long goodsId){
        return taShopClaimRecordsDOMapper.getClaimTime(shopId, goodsId);
    }
}
