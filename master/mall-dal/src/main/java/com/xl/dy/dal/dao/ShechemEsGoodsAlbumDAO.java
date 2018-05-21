package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.ShechemEsGoodsAlbumDO;
import java.util.List;
import com.xl.dy.dal.mapper.ShechemEsGoodsAlbumDOMapper;

/**
* The Table SHECHEM_ES_GOODS_ALBUM.
* SHECHEM_ES_GOODS_ALBUM
*/
@Repository
public class ShechemEsGoodsAlbumDAO{

    @Autowired
    private ShechemEsGoodsAlbumDOMapper shechemEsGoodsAlbumDOMapper;

    /**
     * desc:插入表:SHECHEM_ES_GOODS_ALBUM.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO SHECHEM_ES_GOODS_ALBUM( ID ,_UID ,MID ,UID ,URL ,TURN ,THUMB ,TITLE ,STATUS ,DISPLAY ,GOODS_ID ,INPUTTIME ,UPDATETIME )VALUES( #{id,jdbcType=INTEGER} , #{Uid,jdbcType=INTEGER} , #{mid,jdbcType=VARCHAR} , #{uid,jdbcType=INTEGER} , #{url,jdbcType=VARCHAR} , #{turn,jdbcType=INTEGER} , #{thumb,jdbcType=VARCHAR} , #{title,jdbcType=VARCHAR} , #{status,jdbcType=BIT} , #{display,jdbcType=BIT} , #{goodsId,jdbcType=INTEGER} , #{inputtime,jdbcType=INTEGER} , #{updatetime,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    public Long insert(ShechemEsGoodsAlbumDO entity){
        return shechemEsGoodsAlbumDOMapper.insert(entity);
    }
    /**
     * desc:更新表:SHECHEM_ES_GOODS_ALBUM.<br/>
     * descSql =  UPDATE SHECHEM_ES_GOODS_ALBUM SET _UID = #{Uid,jdbcType=INTEGER} ,MID = #{mid,jdbcType=VARCHAR} ,UID = #{uid,jdbcType=INTEGER} ,URL = #{url,jdbcType=VARCHAR} ,TURN = #{turn,jdbcType=INTEGER} ,THUMB = #{thumb,jdbcType=VARCHAR} ,TITLE = #{title,jdbcType=VARCHAR} ,STATUS = #{status,jdbcType=BIT} ,DISPLAY = #{display,jdbcType=BIT} ,GOODS_ID = #{goodsId,jdbcType=INTEGER} ,INPUTTIME = #{inputtime,jdbcType=INTEGER} ,UPDATETIME = #{updatetime,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=INTEGER}
     * @param entity entity
     * @return Long
     */
    public Long update(ShechemEsGoodsAlbumDO entity){
        return shechemEsGoodsAlbumDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:SHECHEM_ES_GOODS_ALBUM.<br/>
     * descSql =  DELETE FROM SHECHEM_ES_GOODS_ALBUM WHERE ID = #{id,jdbcType=INTEGER}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Integer id){
        return shechemEsGoodsAlbumDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:SHECHEM_ES_GOODS_ALBUM.<br/>
     * descSql =  SELECT * FROM SHECHEM_ES_GOODS_ALBUM WHERE ID = #{id,jdbcType=INTEGER}
     * @param id id
     * @return ShechemEsGoodsAlbumDO
     */
    public ShechemEsGoodsAlbumDO getByPrimary(Integer id){
        return shechemEsGoodsAlbumDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:SHECHEM_ES_GOODS_ALBUM.<br/>
     * descSql =  SELECT * FROM SHECHEM_ES_GOODS_ALBUM WHERE goods_id = #{goodsId,jdbcType=INTEGER}
     * @param goodsId goodsId
     * @return List<ShechemEsGoodsAlbumDO>
     */
    public List<ShechemEsGoodsAlbumDO> getPhotoListByIds(Integer goodsId){
        return shechemEsGoodsAlbumDOMapper.getPhotoListByIds(goodsId);
    }
}
