package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.ShechemEsGoodsAlbumDO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table SHECHEM_ES_GOODS_ALBUM.
 * SHECHEM_ES_GOODS_ALBUM
 */
public interface ShechemEsGoodsAlbumDOMapper{

    /**
     * desc:插入表:SHECHEM_ES_GOODS_ALBUM.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO SHECHEM_ES_GOODS_ALBUM( ID ,_UID ,MID ,UID ,URL ,TURN ,THUMB ,TITLE ,STATUS ,DISPLAY ,GOODS_ID ,INPUTTIME ,UPDATETIME )VALUES( #{id,jdbcType=INTEGER} , #{Uid,jdbcType=INTEGER} , #{mid,jdbcType=VARCHAR} , #{uid,jdbcType=INTEGER} , #{url,jdbcType=VARCHAR} , #{turn,jdbcType=INTEGER} , #{thumb,jdbcType=VARCHAR} , #{title,jdbcType=VARCHAR} , #{status,jdbcType=BIT} , #{display,jdbcType=BIT} , #{goodsId,jdbcType=INTEGER} , #{inputtime,jdbcType=INTEGER} , #{updatetime,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    Long insert(ShechemEsGoodsAlbumDO entity);
    /**
     * desc:更新表:SHECHEM_ES_GOODS_ALBUM.<br/>
     * descSql =  UPDATE SHECHEM_ES_GOODS_ALBUM SET _UID = #{Uid,jdbcType=INTEGER} ,MID = #{mid,jdbcType=VARCHAR} ,UID = #{uid,jdbcType=INTEGER} ,URL = #{url,jdbcType=VARCHAR} ,TURN = #{turn,jdbcType=INTEGER} ,THUMB = #{thumb,jdbcType=VARCHAR} ,TITLE = #{title,jdbcType=VARCHAR} ,STATUS = #{status,jdbcType=BIT} ,DISPLAY = #{display,jdbcType=BIT} ,GOODS_ID = #{goodsId,jdbcType=INTEGER} ,INPUTTIME = #{inputtime,jdbcType=INTEGER} ,UPDATETIME = #{updatetime,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=INTEGER}
     * @param entity entity
     * @return Long
     */
    Long update(ShechemEsGoodsAlbumDO entity);
    /**
     * desc:根据主键删除数据:SHECHEM_ES_GOODS_ALBUM.<br/>
     * descSql =  DELETE FROM SHECHEM_ES_GOODS_ALBUM WHERE ID = #{id,jdbcType=INTEGER}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Integer id);
    /**
     * desc:根据主键获取数据:SHECHEM_ES_GOODS_ALBUM.<br/>
     * descSql =  SELECT * FROM SHECHEM_ES_GOODS_ALBUM WHERE ID = #{id,jdbcType=INTEGER}
     * @param id id
     * @return ShechemEsGoodsAlbumDO
     */
    ShechemEsGoodsAlbumDO getByPrimary(Integer id);
    /**
     * desc:根据主键获取数据:SHECHEM_ES_GOODS_ALBUM.<br/>
     * descSql =  SELECT * FROM SHECHEM_ES_GOODS_ALBUM WHERE goods_id = #{goodsId,jdbcType=INTEGER}
     * @param goodsId goodsId
     * @return List<ShechemEsGoodsAlbumDO>
     */
    List<ShechemEsGoodsAlbumDO> getPhotoListByIds(Integer goodsId);
}
