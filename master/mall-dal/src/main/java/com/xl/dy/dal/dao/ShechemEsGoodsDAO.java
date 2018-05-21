package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.ShechemEsGoodsDO;
import com.xl.dy.dal.paging.QueryOldGoodsListPage;
import com.xl.dy.dal.resultmap.OldGoodShowVO;
import java.util.List;
import com.xl.dy.dal.mapper.ShechemEsGoodsDOMapper;

/**
* The Table SHECHEM_ES_GOODS.
* SHECHEM_ES_GOODS
*/
@Repository
public class ShechemEsGoodsDAO{

    @Autowired
    private ShechemEsGoodsDOMapper shechemEsGoodsDOMapper;

    /**
     * desc:插入表:SHECHEM_ES_GOODS.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO SHECHEM_ES_GOODS( ID ,_UID ,MID ,UID ,IS_DM ,TURN ,BRIEF ,IS_HOT ,IS_NEW ,THUMB ,TITLE ,IS_BEST ,IS_GIFT ,IS_REAL ,IS_YEAR ,STATUS ,TYPE_ID ,VOLUME ,WEIGHT ,BRAND_ID ,CONTENT ,DISPLAY ,GOODS_SN ,IS_SINCE ,STORE_ID ,YEAR_NUM ,GROUPSTR ,IS_FAMILY ,KEYWORDS ,LIMIT_BUY ,SHOW_IN_WX ,AGREEMENT ,INPUTTIME ,INVENTORY ,IS_INGROUP ,PARAMETER ,SHOW_IN_APP ,CATEGORY_ID ,ERP_TABLEID ,ESHOP_PRICE ,IS_INTEGRAL ,IS_SHIPPING ,SET_PROMOTE ,SHIPPING_ID ,UPDATETIME ,VOLUME_PLUS ,VOLUME_SHOW ,DESCRIPTION ,ERP_DATA_JSON ,IS_ALONE_SALE ,MARKET_PRICE ,SHOW_INVOICE ,SUPPLIERS_ID ,VOLUME_TOTAL ,ERP_TABLENAME ,INVENTORY_MAX ,INVENTORY_MIN ,IS_PREPAYCARD ,PACKAGE_PRICE ,SEND_OUTLET_ID ,SET_ATTRIBUTE ,SHELVES_BTIME ,SHELVES_ETIME ,INTEGRAL_GOODS ,INTEGRAL_PRICE ,INTEGRAL_AMOUNT ,INVENTORY_TOTAL ,IS_DISTRIBUTION ,IS_PREFERENTIAL ,SUPPLIERS_PRICE ,INVENTORY_WARNING )VALUES( #{id,jdbcType=INTEGER} , #{Uid,jdbcType=INTEGER} , #{mid,jdbcType=VARCHAR} , #{uid,jdbcType=INTEGER} , #{isDm,jdbcType=BIT} , #{turn,jdbcType=INTEGER} , #{brief,jdbcType=VARCHAR} , #{isHot,jdbcType=BIT} , #{isNew,jdbcType=BIT} , #{thumb,jdbcType=VARCHAR} , #{title,jdbcType=VARCHAR} , #{isBest,jdbcType=BIT} , #{isGift,jdbcType=BIT} , #{isReal,jdbcType=BIT} , #{isYear,jdbcType=INTEGER} , #{status,jdbcType=BIT} , #{typeId,jdbcType=INTEGER} , #{volume,jdbcType=INTEGER} , #{weight,jdbcType=DECIMAL} , #{brandId,jdbcType=INTEGER} , #{content,jdbcType=LONGVARCHAR} , #{display,jdbcType=BIT} , #{goodsSn,jdbcType=VARCHAR} , #{isSince,jdbcType=BIT} , #{storeId,jdbcType=INTEGER} , #{yearNum,jdbcType=INTEGER} , #{groupstr,jdbcType=LONGVARCHAR} , #{isFamily,jdbcType=BIT} , #{keywords,jdbcType=VARCHAR} , #{limitBuy,jdbcType=INTEGER} , #{showInWx,jdbcType=BIT} , #{agreement,jdbcType=LONGVARCHAR} , #{inputtime,jdbcType=INTEGER} , #{inventory,jdbcType=INTEGER} , #{isIngroup,jdbcType=BIT} , #{parameter,jdbcType=LONGVARCHAR} , #{showInApp,jdbcType=BIT} , #{categoryId,jdbcType=INTEGER} , #{erpTableid,jdbcType=INTEGER} , #{eshopPrice,jdbcType=INTEGER} , #{isIntegral,jdbcType=BIT} , #{isShipping,jdbcType=BIT} , #{setPromote,jdbcType=VARCHAR} , #{shippingId,jdbcType=INTEGER} , #{updatetime,jdbcType=INTEGER} , #{volumePlus,jdbcType=INTEGER} , #{volumeShow,jdbcType=INTEGER} , #{description,jdbcType=VARCHAR} , #{erpDataJson,jdbcType=LONGVARCHAR} , #{isAloneSale,jdbcType=BIT} , #{marketPrice,jdbcType=INTEGER} , #{showInvoice,jdbcType=BIT} , #{suppliersId,jdbcType=INTEGER} , #{volumeTotal,jdbcType=INTEGER} , #{erpTablename,jdbcType=VARCHAR} , #{inventoryMax,jdbcType=INTEGER} , #{inventoryMin,jdbcType=INTEGER} , #{isPrepaycard,jdbcType=TINYINT} , #{packagePrice,jdbcType=INTEGER} , #{sendOutletId,jdbcType=INTEGER} , #{setAttribute,jdbcType=LONGVARCHAR} , #{shelvesBtime,jdbcType=INTEGER} , #{shelvesEtime,jdbcType=INTEGER} , #{integralGoods,jdbcType=VARCHAR} , #{integralPrice,jdbcType=INTEGER} , #{integralAmount,jdbcType=INTEGER} , #{inventoryTotal,jdbcType=INTEGER} , #{isDistribution,jdbcType=BIT} , #{isPreferential,jdbcType=BIT} , #{suppliersPrice,jdbcType=INTEGER} , #{inventoryWarning,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    public Long insert(ShechemEsGoodsDO entity){
        return shechemEsGoodsDOMapper.insert(entity);
    }
    /**
     * desc:更新表:SHECHEM_ES_GOODS.<br/>
     * descSql =  UPDATE SHECHEM_ES_GOODS SET _UID = #{Uid,jdbcType=INTEGER} ,MID = #{mid,jdbcType=VARCHAR} ,UID = #{uid,jdbcType=INTEGER} ,IS_DM = #{isDm,jdbcType=BIT} ,TURN = #{turn,jdbcType=INTEGER} ,BRIEF = #{brief,jdbcType=VARCHAR} ,IS_HOT = #{isHot,jdbcType=BIT} ,IS_NEW = #{isNew,jdbcType=BIT} ,THUMB = #{thumb,jdbcType=VARCHAR} ,TITLE = #{title,jdbcType=VARCHAR} ,IS_BEST = #{isBest,jdbcType=BIT} ,IS_GIFT = #{isGift,jdbcType=BIT} ,IS_REAL = #{isReal,jdbcType=BIT} ,IS_YEAR = #{isYear,jdbcType=INTEGER} ,STATUS = #{status,jdbcType=BIT} ,TYPE_ID = #{typeId,jdbcType=INTEGER} ,VOLUME = #{volume,jdbcType=INTEGER} ,WEIGHT = #{weight,jdbcType=DECIMAL} ,BRAND_ID = #{brandId,jdbcType=INTEGER} ,CONTENT = #{content,jdbcType=LONGVARCHAR} ,DISPLAY = #{display,jdbcType=BIT} ,GOODS_SN = #{goodsSn,jdbcType=VARCHAR} ,IS_SINCE = #{isSince,jdbcType=BIT} ,STORE_ID = #{storeId,jdbcType=INTEGER} ,YEAR_NUM = #{yearNum,jdbcType=INTEGER} ,GROUPSTR = #{groupstr,jdbcType=LONGVARCHAR} ,IS_FAMILY = #{isFamily,jdbcType=BIT} ,KEYWORDS = #{keywords,jdbcType=VARCHAR} ,LIMIT_BUY = #{limitBuy,jdbcType=INTEGER} ,SHOW_IN_WX = #{showInWx,jdbcType=BIT} ,AGREEMENT = #{agreement,jdbcType=LONGVARCHAR} ,INPUTTIME = #{inputtime,jdbcType=INTEGER} ,INVENTORY = #{inventory,jdbcType=INTEGER} ,IS_INGROUP = #{isIngroup,jdbcType=BIT} ,PARAMETER = #{parameter,jdbcType=LONGVARCHAR} ,SHOW_IN_APP = #{showInApp,jdbcType=BIT} ,CATEGORY_ID = #{categoryId,jdbcType=INTEGER} ,ERP_TABLEID = #{erpTableid,jdbcType=INTEGER} ,ESHOP_PRICE = #{eshopPrice,jdbcType=INTEGER} ,IS_INTEGRAL = #{isIntegral,jdbcType=BIT} ,IS_SHIPPING = #{isShipping,jdbcType=BIT} ,SET_PROMOTE = #{setPromote,jdbcType=VARCHAR} ,SHIPPING_ID = #{shippingId,jdbcType=INTEGER} ,UPDATETIME = #{updatetime,jdbcType=INTEGER} ,VOLUME_PLUS = #{volumePlus,jdbcType=INTEGER} ,VOLUME_SHOW = #{volumeShow,jdbcType=INTEGER} ,DESCRIPTION = #{description,jdbcType=VARCHAR} ,ERP_DATA_JSON = #{erpDataJson,jdbcType=LONGVARCHAR} ,IS_ALONE_SALE = #{isAloneSale,jdbcType=BIT} ,MARKET_PRICE = #{marketPrice,jdbcType=INTEGER} ,SHOW_INVOICE = #{showInvoice,jdbcType=BIT} ,SUPPLIERS_ID = #{suppliersId,jdbcType=INTEGER} ,VOLUME_TOTAL = #{volumeTotal,jdbcType=INTEGER} ,ERP_TABLENAME = #{erpTablename,jdbcType=VARCHAR} ,INVENTORY_MAX = #{inventoryMax,jdbcType=INTEGER} ,INVENTORY_MIN = #{inventoryMin,jdbcType=INTEGER} ,IS_PREPAYCARD = #{isPrepaycard,jdbcType=TINYINT} ,PACKAGE_PRICE = #{packagePrice,jdbcType=INTEGER} ,SEND_OUTLET_ID = #{sendOutletId,jdbcType=INTEGER} ,SET_ATTRIBUTE = #{setAttribute,jdbcType=LONGVARCHAR} ,SHELVES_BTIME = #{shelvesBtime,jdbcType=INTEGER} ,SHELVES_ETIME = #{shelvesEtime,jdbcType=INTEGER} ,INTEGRAL_GOODS = #{integralGoods,jdbcType=VARCHAR} ,INTEGRAL_PRICE = #{integralPrice,jdbcType=INTEGER} ,INTEGRAL_AMOUNT = #{integralAmount,jdbcType=INTEGER} ,INVENTORY_TOTAL = #{inventoryTotal,jdbcType=INTEGER} ,IS_DISTRIBUTION = #{isDistribution,jdbcType=BIT} ,IS_PREFERENTIAL = #{isPreferential,jdbcType=BIT} ,SUPPLIERS_PRICE = #{suppliersPrice,jdbcType=INTEGER} ,INVENTORY_WARNING = #{inventoryWarning,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=INTEGER}
     * @param entity entity
     * @return Long
     */
    public Long update(ShechemEsGoodsDO entity){
        return shechemEsGoodsDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:SHECHEM_ES_GOODS.<br/>
     * descSql =  DELETE FROM SHECHEM_ES_GOODS WHERE ID = #{id,jdbcType=INTEGER}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Integer id){
        return shechemEsGoodsDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:SHECHEM_ES_GOODS.<br/>
     * descSql =  SELECT * FROM SHECHEM_ES_GOODS WHERE ID = #{id,jdbcType=INTEGER}
     * @param id id
     * @return ShechemEsGoodsDO
     */
    public ShechemEsGoodsDO getByPrimary(Integer id){
        return shechemEsGoodsDOMapper.getByPrimary(id);
    }
    /**
     * desc:商品分页.<br/>
     * descSql =  SELECT id ,store_id ,title ,thumb ,content ,is_real FROM SHECHEM_ES_GOODS WHERE mid = 'DJEHBSUAAY' ORDER BY id DESC
     * @param queryOldGoodsList queryOldGoodsList
     * @return QueryOldGoodsListPage
     */
    public QueryOldGoodsListPage getOldGoodsPage(QueryOldGoodsListPage queryOldGoodsList){
        int total = shechemEsGoodsDOMapper.getOldGoodsPageCount(queryOldGoodsList);
        if(total>0){
            queryOldGoodsList.setDatas(shechemEsGoodsDOMapper.getOldGoodsPageResult(queryOldGoodsList));
        }
        queryOldGoodsList.setTotal(total);
        return queryOldGoodsList;
    }
    /**
     * desc:商品分页.<br/>
     * descSql =  SELECT id ,store_id ,title ,thumb ,content ,is_real ,eshop_price FROM SHECHEM_ES_GOODS WHERE mid = 'DJEHBSUAAY' ORDER BY id DESC LIMIT #{pageSize,jdbcType=INTEGER}
     * @param pageSize pageSize
     * @return List<OldGoodShowVO>
     */
    public List<OldGoodShowVO> getGoodsListByNum(Integer pageSize){
        return shechemEsGoodsDOMapper.getGoodsListByNum(pageSize);
    }
}
