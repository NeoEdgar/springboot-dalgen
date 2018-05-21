package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.ShechemEsGoodsAttributeDO;
import com.xl.dy.dal.resultmap.OldGoodsAttributeVO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table SHECHEM_ES_GOODS_ATTRIBUTE.
 * SHECHEM_ES_GOODS_ATTRIBUTE
 */
public interface ShechemEsGoodsAttributeDOMapper{

    /**
     * desc:插入表:SHECHEM_ES_GOODS_ATTRIBUTE.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO SHECHEM_ES_GOODS_ATTRIBUTE( ID ,_UID ,MID ,UID ,STATUS ,DISPLAY ,GOODS_ID ,INPUTTIME ,UPDATETIME ,ATTRIBUTE_ID ,ATTRIBUTE_TEXT ,ATTRIBUTE_TYPE ,ATTRIBUTE_PRICE ,ATTRIBUTE_THUMB ,ATTRIBUTE_PACKAGE_PRICE )VALUES( #{id,jdbcType=INTEGER} , #{Uid,jdbcType=INTEGER} , #{mid,jdbcType=VARCHAR} , #{uid,jdbcType=INTEGER} , #{status,jdbcType=BIT} , #{display,jdbcType=BIT} , #{goodsId,jdbcType=INTEGER} , #{inputtime,jdbcType=INTEGER} , #{updatetime,jdbcType=INTEGER} , #{attributeId,jdbcType=INTEGER} , #{attributeText,jdbcType=VARCHAR} , #{attributeType,jdbcType=BIT} , #{attributePrice,jdbcType=INTEGER} , #{attributeThumb,jdbcType=VARCHAR} , #{attributePackagePrice,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    Long insert(ShechemEsGoodsAttributeDO entity);
    /**
     * desc:更新表:SHECHEM_ES_GOODS_ATTRIBUTE.<br/>
     * descSql =  UPDATE SHECHEM_ES_GOODS_ATTRIBUTE SET _UID = #{Uid,jdbcType=INTEGER} ,MID = #{mid,jdbcType=VARCHAR} ,UID = #{uid,jdbcType=INTEGER} ,STATUS = #{status,jdbcType=BIT} ,DISPLAY = #{display,jdbcType=BIT} ,GOODS_ID = #{goodsId,jdbcType=INTEGER} ,INPUTTIME = #{inputtime,jdbcType=INTEGER} ,UPDATETIME = #{updatetime,jdbcType=INTEGER} ,ATTRIBUTE_ID = #{attributeId,jdbcType=INTEGER} ,ATTRIBUTE_TEXT = #{attributeText,jdbcType=VARCHAR} ,ATTRIBUTE_TYPE = #{attributeType,jdbcType=BIT} ,ATTRIBUTE_PRICE = #{attributePrice,jdbcType=INTEGER} ,ATTRIBUTE_THUMB = #{attributeThumb,jdbcType=VARCHAR} ,ATTRIBUTE_PACKAGE_PRICE = #{attributePackagePrice,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=INTEGER}
     * @param entity entity
     * @return Long
     */
    Long update(ShechemEsGoodsAttributeDO entity);
    /**
     * desc:根据主键删除数据:SHECHEM_ES_GOODS_ATTRIBUTE.<br/>
     * descSql =  DELETE FROM SHECHEM_ES_GOODS_ATTRIBUTE WHERE ID = #{id,jdbcType=INTEGER}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Integer id);
    /**
     * desc:根据主键获取数据:SHECHEM_ES_GOODS_ATTRIBUTE.<br/>
     * descSql =  SELECT * FROM SHECHEM_ES_GOODS_ATTRIBUTE WHERE ID = #{id,jdbcType=INTEGER}
     * @param id id
     * @return ShechemEsGoodsAttributeDO
     */
    ShechemEsGoodsAttributeDO getByPrimary(Integer id);
    /**
     * desc:根据主键获取数据:SHECHEM_ES_GOODS_ATTRIBUTE.<br/>
     * descSql =  SELECT a.attribute_text AS attributeText ,b.title AS title FROM SHECHEM_ES_GOODS_ATTRIBUTE a left JOIN SHECHEM_ES_ATTRIBUTE b on a.attribute_id = b.id WHERE a.goods_id = #{goodsId,jdbcType=BIGINT}
     * @param goodsId goodsId
     * @return List<OldGoodsAttributeVO>
     */
    List<OldGoodsAttributeVO> getByOldGoodsPropById(Integer goodsId);
}
