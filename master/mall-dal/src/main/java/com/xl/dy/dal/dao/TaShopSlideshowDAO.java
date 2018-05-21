package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaShopSlideshowDO;
import java.util.List;
import com.xl.dy.dal.mapper.TaShopSlideshowDOMapper;

/**
* The Table TA_SHOP_SLIDESHOW.
* TA_SHOP_SLIDESHOW
*/
@Repository
public class TaShopSlideshowDAO{

    @Autowired
    private TaShopSlideshowDOMapper taShopSlideshowDOMapper;

    /**
     * desc:插入表:TA_SHOP_SLIDESHOW.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_SHOP_SLIDESHOW( ID ,URL ,SORT ,REMARK ,SHOP_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,SHOP_SLIDESHOW_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{url,jdbcType=VARCHAR} , #{sort,jdbcType=INTEGER} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{shopSlideshowStatus,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaShopSlideshowDO entity){
        return taShopSlideshowDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TA_SHOP_SLIDESHOW.<br/>
     * descSql =  UPDATE TA_SHOP_SLIDESHOW SET URL = #{url,jdbcType=VARCHAR} ,SORT = #{sort,jdbcType=INTEGER} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,SHOP_SLIDESHOW_STATUS = #{shopSlideshowStatus,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaShopSlideshowDO entity){
        return taShopSlideshowDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TA_SHOP_SLIDESHOW.<br/>
     * descSql =  DELETE FROM TA_SHOP_SLIDESHOW WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taShopSlideshowDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TA_SHOP_SLIDESHOW.<br/>
     * descSql =  SELECT * FROM TA_SHOP_SLIDESHOW WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopSlideshowDO
     */
    public TaShopSlideshowDO getByPrimary(Long id){
        return taShopSlideshowDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据店铺获取数据:TA_SHOP_SLIDESHOW.<br/>
     * descSql =  SELECT * FROM TA_SHOP_SLIDESHOW WHERE SHOP_ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return List<TaShopSlideshowDO>
     */
    public List<TaShopSlideshowDO> getPhotoByShopId(Long id){
        return taShopSlideshowDOMapper.getPhotoByShopId(id);
    }
    /**
     * desc:改变轮播图状态:TA_SHOP_SLIDESHOW.<br/>
     * descSql =  UPDATE TA_SHOP_SLIDESHOW SET SHOP_SLIDESHOW_STATUS =#{status,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @param status status
     * @return Long
     */
    public Long changeStatus(Long id,String status){
        return taShopSlideshowDOMapper.changeStatus(id, status);
    }
    /**
     * desc:更新顺序:TA_SHOP_SLIDESHOW.<br/>
     * descSql =  UPDATE TA_SHOP_SLIDESHOW SET SORT = #{sort,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @param sort sort
     * @return Long
     */
    public Long updateSortById(Long id,Integer sort){
        return taShopSlideshowDOMapper.updateSortById(id, sort);
    }
}
