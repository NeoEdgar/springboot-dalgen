package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaGoodsAuditDO;
import com.xl.dy.dal.paging.QueryCheckGoodsPage;
import com.xl.dy.dal.mapper.TaGoodsAuditDOMapper;

/**
* The Table TA_GOODS_AUDIT.
* TA_GOODS_AUDIT
*/
@Repository
public class TaGoodsAuditDAO{

    @Autowired
    private TaGoodsAuditDOMapper taGoodsAuditDOMapper;

    /**
     * desc:插入表:TA_GOODS_AUDIT.<br/>
     * descSql =  INSERT INTO TA_GOODS_AUDIT( ID ,IS_SHOW ,REMARK ,GOODS_ID ,ALTER_EMPL ,ALTER_TIME ,AUDIT_TIME ,AUDIT_TYPE ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,AUDIT_EMPL_ID ,AUDIT_SHOP_ID ,VALID_STATUS ,REJECT_REASON ,AUDIT_EMPL_NAME ,AUDIT_INFO_JSON ,AUDIT_COMPANY_ID ,AUDIT_SUBMIT_TIME ,GOODS_AUDIT_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{isShow,jdbcType=INTEGER} , #{remark,jdbcType=VARCHAR} , #{goodsId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{auditTime,jdbcType=TIMESTAMP} , #{auditType,jdbcType=VARCHAR} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{auditEmplId,jdbcType=BIGINT} , #{auditShopId,jdbcType=BIGINT} , #{validStatus,jdbcType=INTEGER} , #{rejectReason,jdbcType=VARCHAR} , #{auditEmplName,jdbcType=VARCHAR} , #{auditInfoJson,jdbcType=VARCHAR} , #{auditCompanyId,jdbcType=BIGINT} , #{auditSubmitTime,jdbcType=TIMESTAMP} , #{goodsAuditStatus,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaGoodsAuditDO entity){
        return taGoodsAuditDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_GOODS_AUDIT.<br/>
     * descSql =  UPDATE TA_GOODS_AUDIT SET IS_SHOW = #{isShow,jdbcType=INTEGER} ,REMARK = #{remark,jdbcType=VARCHAR} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,AUDIT_TIME = #{auditTime,jdbcType=TIMESTAMP} ,AUDIT_TYPE = #{auditType,jdbcType=VARCHAR} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,AUDIT_EMPL_ID = #{auditEmplId,jdbcType=BIGINT} ,AUDIT_SHOP_ID = #{auditShopId,jdbcType=BIGINT} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,REJECT_REASON = #{rejectReason,jdbcType=VARCHAR} ,AUDIT_EMPL_NAME = #{auditEmplName,jdbcType=VARCHAR} ,AUDIT_INFO_JSON = #{auditInfoJson,jdbcType=VARCHAR} ,AUDIT_COMPANY_ID = #{auditCompanyId,jdbcType=BIGINT} ,AUDIT_SUBMIT_TIME = #{auditSubmitTime,jdbcType=TIMESTAMP} ,GOODS_AUDIT_STATUS = #{goodsAuditStatus,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaGoodsAuditDO entity){
        return taGoodsAuditDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_GOODS_AUDIT.<br/>
     * descSql =  DELETE FROM TA_GOODS_AUDIT WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taGoodsAuditDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_GOODS_AUDIT.<br/>
     * descSql =  SELECT * FROM TA_GOODS_AUDIT WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaGoodsAuditDO
     */
    public TaGoodsAuditDO getByPrimary(Long id){
        return taGoodsAuditDOMapper.getByPrimary(id);
    }
    /**
     * desc:查询审核商品列表.<br/>
     * descSql =  SELECT * FROM TA_GOODS_AUDIT VALID_STATUS = 1 AND IS_SHOW = 1 AND GOODS_ID = #{goodsId,jdbcType=BIGINT} AND AUDIT_TYPE = #{auditType,jdbcType=VARCHAR} AND AUDIT_EMPL_NAME = #{auditEmplName,jdbcType=VARCHAR} AND GOODS_AUDIT_STATUS = #{goodsAuditStatus,jdbcType=VARCHAR} AND AUDIT_SHOP_ID = #{auditShopId,jdbcType=BIGINT} AND AUDIT_COMPANY_ID = #{auditCompanyId,jdbcType=BIGINT} AND AUDIT_SUBMIT_TIME = #{auditSubmitTime,jdbcType=TIMESTAMP} AND AUDIT_TIME &gt; #{auditStartTime,jdbcType=TIMESTAMP}, AND AUDIT_TIME &lt; #{auditEndTime,jdbcType=TIMESTAMP}, 
     * @param queryCheckGoods queryCheckGoods
     * @return QueryCheckGoodsPage
     */
    public QueryCheckGoodsPage findGoodCheckPage(QueryCheckGoodsPage queryCheckGoods){
        int total = taGoodsAuditDOMapper.findGoodCheckPageCount(queryCheckGoods);
        if(total>0){
            queryCheckGoods.setDatas(taGoodsAuditDOMapper.findGoodCheckPageResult(queryCheckGoods));
        }
        queryCheckGoods.setTotal(total);
        return queryCheckGoods;
    }
    /**
     * desc:更新表:TA_GOODS_AUDIT.<br/>
     * descSql =  UPDATE TA_GOODS_AUDIT IS_SHOW = #{isShow,jdbcType=INTEGER}, REMARK = #{remark,jdbcType=VARCHAR}, GOODS_ID = #{goodsId,jdbcType=BIGINT}, ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT}, ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP}, AUDIT_TIME = #{auditTime,jdbcType=TIMESTAMP}, AUDIT_TYPE = #{auditType,jdbcType=VARCHAR}, TIMESTAMP = #{timestamp,jdbcType=BIGINT}, CREATE_EMPL = #{createEmpl,jdbcType=BIGINT}, CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}, AUDIT_EMPL_ID = #{auditEmplId,jdbcType=BIGINT}, AUDIT_SHOP_ID = #{auditShopId,jdbcType=BIGINT}, VALID_STATUS = #{validStatus,jdbcType=INTEGER}, REJECT_REASON = #{rejectReason,jdbcType=VARCHAR}, AUDIT_EMPL_NAME = #{auditEmplName,jdbcType=VARCHAR}, AUDIT_INFO_JSON = #{auditInfoJson,jdbcType=VARCHAR}, AUDIT_COMPANY_ID = #{auditCompanyId,jdbcType=BIGINT}, AUDIT_SUBMIT_TIME = #{auditSubmitTime,jdbcType=TIMESTAMP}, GOODS_AUDIT_STATUS = #{goodsAuditStatus,jdbcType=VARCHAR}, VALID_STATUS = 1 AND ID = #{id,jdbcType=BIGINT} AND GOODS_ID = #{goodsId,jdbcType=BIGINT} 
     * @param entity entity
     * @return Long
     */
    public Long updateSelective(TaGoodsAuditDO entity){
        return taGoodsAuditDOMapper.updateSelective(entity);
    }
    /**
     * desc:根据主键删除数据:TA_GOODS_AUDIT.<br/>
     * descSql =  DELETE FROM TA_GOODS_AUDIT WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND AUDIT_SHOP_ID = #{auditShopId,jdbcType=BIGINT} 
     * @param goodsId goodsId
     * @param auditShopId auditShopId
     * @return Long
     */
    public Long deleteSelective(Long goodsId,Long auditShopId){
        return taGoodsAuditDOMapper.deleteSelective(goodsId, auditShopId);
    }
}
