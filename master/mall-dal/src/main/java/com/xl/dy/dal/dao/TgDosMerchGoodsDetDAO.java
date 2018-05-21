package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TgDosMerchGoodsDetDO;
import java.lang.Integer;
import java.util.Map;
import java.util.List;
import com.xl.dy.dal.mapper.TgDosMerchGoodsDetDOMapper;

/**
* The Table TG_DOS_MERCH_GOODS_DET.
* TG_DOS_MERCH_GOODS_DET
*/
@Repository
public class TgDosMerchGoodsDetDAO{

    @Autowired
    private TgDosMerchGoodsDetDOMapper tgDosMerchGoodsDetDOMapper;

    /**
     * desc:插入表:TG_DOS_MERCH_GOODS_DET.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TG_DOS_MERCH_GOODS_DET( ID ,DOS_ID ,SKU_ID ,REMARK ,DOS_DATE ,GOODS_ID ,SALES_AMT ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CATEGORY_ID ,CREATE_EMPL ,CREATE_TIME ,SALES_VOLUME ,CATEGORY_NAME ,ORDER_QUANTITY ,PURCHASE_USERS_NUMBER ,REFUND_ORDER_QUANTITY )VALUES( #{id,jdbcType=BIGINT} , #{dosId,jdbcType=BIGINT} , #{skuId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{dosDate,jdbcType=TIMESTAMP} , #{goodsId,jdbcType=BIGINT} , #{salesAmt,jdbcType=DECIMAL} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{categoryId,jdbcType=VARCHAR} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{salesVolume,jdbcType=DECIMAL} , #{categoryName,jdbcType=VARCHAR} , #{orderQuantity,jdbcType=INTEGER} , #{purchaseUsersNumber,jdbcType=INTEGER} , #{refundOrderQuantity,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TgDosMerchGoodsDetDO entity){
        return tgDosMerchGoodsDetDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TG_DOS_MERCH_GOODS_DET.<br/>
     * descSql =  UPDATE TG_DOS_MERCH_GOODS_DET SET DOS_ID = #{dosId,jdbcType=BIGINT} ,SKU_ID = #{skuId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,DOS_DATE = #{dosDate,jdbcType=TIMESTAMP} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,SALES_AMT = #{salesAmt,jdbcType=DECIMAL} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CATEGORY_ID = #{categoryId,jdbcType=VARCHAR} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,SALES_VOLUME = #{salesVolume,jdbcType=DECIMAL} ,CATEGORY_NAME = #{categoryName,jdbcType=VARCHAR} ,ORDER_QUANTITY = #{orderQuantity,jdbcType=INTEGER} ,PURCHASE_USERS_NUMBER = #{purchaseUsersNumber,jdbcType=INTEGER} ,REFUND_ORDER_QUANTITY = #{refundOrderQuantity,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TgDosMerchGoodsDetDO entity){
        return tgDosMerchGoodsDetDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TG_DOS_MERCH_GOODS_DET.<br/>
     * descSql =  DELETE FROM TG_DOS_MERCH_GOODS_DET WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return tgDosMerchGoodsDetDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TG_DOS_MERCH_GOODS_DET.<br/>
     * descSql =  SELECT * FROM TG_DOS_MERCH_GOODS_DET WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TgDosMerchGoodsDetDO
     */
    public TgDosMerchGoodsDetDO getByPrimary(Long id){
        return tgDosMerchGoodsDetDOMapper.getByPrimary(id);
    }
    /**
     * desc:获取月份上有效商品数量,销量10个以上的SKU:TG_DOS_MERCH_GOODS_DET.<br/>
     * descSql =  SELECT COUNT(*) effectiveQuantity FROM ( SELECT SUM(SALES_VOLUME) salesVolume,SKU_ID FROM TG_DOS_MERCH_GOODS_DET WHERE DATE_FORMAT(DOS_DATE,'%Y%m') = DATE_FORMAT(DATE_SUB(curdate(), INTERVAL #{index,jdbcType=INTEGER} MONTH), '%Y%m') GROUP BY SKU_ID ) a WHERE a.salesVolume &gt; 10
     * @param index index
     * @return Integer
     */
    public Integer getMonthlyEffectiveGoodsQuantity(Integer index){
        return tgDosMerchGoodsDetDOMapper.getMonthlyEffectiveGoodsQuantity(index);
    }
    /**
     * desc:获取专业公司下商品数,所有和在售:TG_DOS_MERCH_GOODS_DET.<br/>
     * descSql =  SELECT COUNT(SKU_ID) FROM ta_shop s LEFT JOIN ta_shop_goods_prop p ON s.ID = p.SHOP_ID LEFT JOIN ta_shop_goods g ON p.GOODS_ID = g.GOODS_ID WHERE s.COMPANY_ID = #{companyId,jdbcType=BIGINT} AND s.SHOP_STATUS = #{shopStatus,jdbcType=VARCHAR} AND p.SHOP_GOODS_SALE_STATUS = #{shopGoodsSaleStatus,jdbcType=VARCHAR} 
     * @param companyId companyId
     * @param shopStatus shopStatus
     * @param shopGoodsSaleStatus shopGoodsSaleStatus
     * @return Integer
     */
    public Integer getCompanyShopGoodsCount(Long companyId,String shopStatus,String shopGoodsSaleStatus){
        return tgDosMerchGoodsDetDOMapper.getCompanyShopGoodsCount(companyId, shopStatus, shopGoodsSaleStatus);
    }
    /**
     * desc:获取专业公司下商品数,按类目:TG_DOS_MERCH_GOODS_DET.<br/>
     * descSql =  SELECT COUNT(sg.SKU_ID) companyShopGoodsCount, m.NAME categoryName ,m.ID categoryId FROM ta_shop s LEFT JOIN ta_shop_goods_prop sp ON s.ID = sp.SHOP_ID LEFT JOIN ta_shop_goods sg ON sp.GOODS_ID = sg.GOODS_ID LEFT JOIN ta_goods g ON sg.GOODS_ID = g.ID LEFT JOIN tg_mg_category m ON m.ID = SUBSTRING_INDEX(SUBSTRING_INDEX(g.MG_FR_ID,",",2),",",-1) WHERE s.COMPANY_ID= #{companyId,jdbcType=BIGINT} AND s.SHOP_STATUS = #{shopStatus,jdbcType=VARCHAR} AND sp.SHOP_GOODS_SALE_STATUS = #{shopGoodsSaleStatus,jdbcType=VARCHAR} GROUP BY m.ID
     * @param companyId companyId
     * @param shopStatus shopStatus
     * @param shopGoodsSaleStatus shopGoodsSaleStatus
     * @return List<Map>
     */
    public List<Map> getCompanyShopGoodsCountByCategoryList(Long companyId,String shopStatus,String shopGoodsSaleStatus){
        return tgDosMerchGoodsDetDOMapper.getCompanyShopGoodsCountByCategoryList(companyId, shopStatus, shopGoodsSaleStatus);
    }
    /**
     * desc:获取商场下商品数,所有:TG_DOS_MERCH_GOODS_DET.<br/>
     * descSql =  SELECT COUNT(SKU_ID) FROM ta_shop s LEFT JOIN ta_shop_goods_prop p ON s.ID = p.SHOP_ID LEFT JOIN ta_shop_goods g ON p.GOODS_ID = g.GOODS_ID WHERE s.MALL_ID = #{mallId,jdbcType=BIGINT}
     * @param mallId mallId
     * @return Integer
     */
    public Integer getMallShopGoodsCount(Long mallId){
        return tgDosMerchGoodsDetDOMapper.getMallShopGoodsCount(mallId);
    }
    /**
     * desc:获取天新上架的商品数量:TG_DOS_MERCH_GOODS_DET.<br/>
     * descSql =  SELECT COUNT(SKU_ID) FROM ta_shop s LEFT JOIN ta_shop_goods_prop p ON s.ID = p.SHOP_ID LEFT JOIN ta_shop_goods g ON p.GOODS_ID = g.GOODS_ID WHERE s.MALL_ID = #{mallId,jdbcType=BIGINT} AND DATE_FORMAT(p.CREATE_TIME,'%Y%m%d') BETWEEN DATE_FORMAT(DATE_SUB(curdate(), INTERVAL #{beginIndex,jdbcType=INTEGER} DAY), '%Y%m%d') AND DATE_FORMAT(DATE_SUB(curdate(), INTERVAL #{endIndex,jdbcType=INTEGER} DAY), '%Y%m%d')
     * @param mallId mallId
     * @param endIndex endIndex
     * @param beginIndex beginIndex
     * @return Integer
     */
    public Integer getNewOnSaleShopGoods(Long mallId,Integer endIndex,Integer beginIndex){
        return tgDosMerchGoodsDetDOMapper.getNewOnSaleShopGoods(mallId, endIndex, beginIndex);
    }
    /**
     * desc:获取日周的有售商品数sku:TG_DOS_MERCH_GOODS_DET.<br/>
     * descSql =  SELECT COUNT(*) FROM ( SELECT dg.SKU_ID FROM tg_dos_merch d LEFT JOIN tg_dos_merch_goods_det dg ON d.ID = dg.DOS_ID AND MALL_ID = #{mallId,jdbcType=BIGINT} AND COMPANY_ID = #{companyId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} AND DATE_FORMAT(d.DOS_DATE,'%Y%m%d') BETWEEN DATE_FORMAT(DATE_SUB(curdate(), INTERVAL #{beginIndex,jdbcType=INTEGER} DAY), '%Y%m%d') AND DATE_FORMAT(DATE_SUB(curdate(), INTERVAL #{endIndex,jdbcType=INTEGER} DAY), '%Y%m%d') GROUP BY dg.SKU_ID ) a
     * @param mallId mallId
     * @param shopId shopId
     * @param companyId companyId
     * @param endIndex endIndex
     * @param beginIndex beginIndex
     * @return Integer
     */
    public Integer getSaleGoodsCount(Long mallId,Long shopId,Long companyId,Integer endIndex,Integer beginIndex){
        return tgDosMerchGoodsDetDOMapper.getSaleGoodsCount(mallId, shopId, companyId, endIndex, beginIndex);
    }
    /**
     * desc:本月按类目获取订单数据:TG_DOS_MERCH_GOODS_DET.<br/>
     * descSql =  SELECT CATEGORY_ID categoryId,CATEGORY_NAME categoryName, SUM(dg.SALES_AMT) salesAmt,SUM(dg.ORDER_QUANTITY) orderQuantity ,SUM(dg.PURCHASE_USERS_NUMBER) purchaseUsersNumber,COUNT(dg.SKU_ID) companySaleGoodsCount FROM tg_dos_merch d LEFT JOIN tg_dos_merch_goods_det dg ON d.ID = dg.DOS_ID WHERE d.COMPANY_ID = #{companyId,jdbcType=BIGINT} AND DATE_FORMAT(d.DOS_DATE,'%Y%m') = DATE_FORMAT(DATE_SUB(curdate(), INTERVAL 0 MONTH), '%Y%m') GROUP BY dg.CATEGORY_ID
     * @param companyId companyId
     * @return List<Map>
     */
    public List<Map> getOrderDataByCategoryList(Long companyId){
        return tgDosMerchGoodsDetDOMapper.getOrderDataByCategoryList(companyId);
    }
    /**
     * desc:获取专业公司按类目下的店铺数量:TG_DOS_MERCH_GOODS_DET.<br/>
     * descSql =  SELECT b.companyShopCount, b.mgCategoryId, gc.NAME categoryName FROM ( SELECT COUNT(a.SHOP_ID) companyShopCount, a.MG_CATEGORY_ID mgCategoryId FROM ( SELECT SHOP_ID, MG_CATEGORY_ID FROM `ta_shop` s LEFT JOIN ta_shop_mc_category sc ON s.ID = sc.SHOP_ID WHERE s.COMPANY_ID = #{companyId,jdbcType=BIGINT} ) a WHERE a.MG_CATEGORY_ID IN (SELECT MG_CATEGORY_ID FROM ta_company_mc_category c WHERE c.COMPANY_ID = #{companyId,jdbcType=BIGINT}) GROUP BY a.MG_CATEGORY_ID ) b LEFT JOIN tg_mg_category gc ON gc.ID = b.mgCategoryId
     * @param companyId companyId
     * @return List<Map>
     */
    public List<Map> getCompanyShopCountByCategoryList(Long companyId){
        return tgDosMerchGoodsDetDOMapper.getCompanyShopCountByCategoryList(companyId);
    }
}
