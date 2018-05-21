package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaShopSlideshowDO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_SHOP_SLIDESHOW.
 * TA_SHOP_SLIDESHOW
 */
public interface TaShopSlideshowDOMapper{

    /**
     * desc:插入表:TA_SHOP_SLIDESHOW.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_SHOP_SLIDESHOW( ID ,URL ,SORT ,REMARK ,SHOP_ID ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS ,SHOP_SLIDESHOW_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{url,jdbcType=VARCHAR} , #{sort,jdbcType=INTEGER} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} , #{shopSlideshowStatus,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaShopSlideshowDO entity);
    /**
     * desc:更新表:TA_SHOP_SLIDESHOW.<br/>
     * descSql =  UPDATE TA_SHOP_SLIDESHOW SET URL = #{url,jdbcType=VARCHAR} ,SORT = #{sort,jdbcType=INTEGER} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,SHOP_SLIDESHOW_STATUS = #{shopSlideshowStatus,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaShopSlideshowDO entity);
    /**
     * desc:根据主键删除数据:TA_SHOP_SLIDESHOW.<br/>
     * descSql =  DELETE FROM TA_SHOP_SLIDESHOW WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_SHOP_SLIDESHOW.<br/>
     * descSql =  SELECT * FROM TA_SHOP_SLIDESHOW WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopSlideshowDO
     */
    TaShopSlideshowDO getByPrimary(Long id);
    /**
     * desc:根据店铺获取数据:TA_SHOP_SLIDESHOW.<br/>
     * descSql =  SELECT * FROM TA_SHOP_SLIDESHOW WHERE SHOP_ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return List<TaShopSlideshowDO>
     */
    List<TaShopSlideshowDO> getPhotoByShopId(Long id);
    /**
     * desc:改变轮播图状态:TA_SHOP_SLIDESHOW.<br/>
     * descSql =  UPDATE TA_SHOP_SLIDESHOW SET SHOP_SLIDESHOW_STATUS =#{status,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @param status status
     * @return Long
     */
    Long changeStatus(@Param("id")Long id,@Param("status")String status);
    /**
     * desc:更新顺序:TA_SHOP_SLIDESHOW.<br/>
     * descSql =  UPDATE TA_SHOP_SLIDESHOW SET SORT = #{sort,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @param sort sort
     * @return Long
     */
    Long updateSortById(@Param("id")Long id,@Param("sort")Integer sort);
}
