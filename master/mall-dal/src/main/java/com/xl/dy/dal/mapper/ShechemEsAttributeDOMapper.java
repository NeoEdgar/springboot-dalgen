package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.ShechemEsAttributeDO;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table SHECHEM_ES_ATTRIBUTE.
 * SHECHEM_ES_ATTRIBUTE
 */
public interface ShechemEsAttributeDOMapper{

    /**
     * desc:插入表:SHECHEM_ES_ATTRIBUTE.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO SHECHEM_ES_ATTRIBUTE( ID ,_UID ,MID ,UID ,TURN ,TYPE ,TITLE ,STATUS ,TYPE_ID ,VALUES ,DISPLAY ,ISTHUMB ,STORE_ID ,IS_LINKED ,ATTR_GROUP ,INPUT_TYPE ,INPUTTIME ,SEARCH_TYPE ,UPDATETIME )VALUES( #{id,jdbcType=INTEGER} , #{Uid,jdbcType=INTEGER} , #{mid,jdbcType=CHAR} , #{uid,jdbcType=INTEGER} , #{turn,jdbcType=INTEGER} , #{type,jdbcType=BIT} , #{title,jdbcType=VARCHAR} , #{status,jdbcType=BIT} , #{typeId,jdbcType=INTEGER} , #{values,jdbcType=LONGVARCHAR} , #{display,jdbcType=BIT} , #{isthumb,jdbcType=BIT} , #{storeId,jdbcType=INTEGER} , #{isLinked,jdbcType=BIT} , #{attrGroup,jdbcType=VARCHAR} , #{inputType,jdbcType=BIT} , #{inputtime,jdbcType=INTEGER} , #{searchType,jdbcType=BIT} , #{updatetime,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    Long insert(ShechemEsAttributeDO entity);
    /**
     * desc:更新表:SHECHEM_ES_ATTRIBUTE.<br/>
     * descSql =  UPDATE SHECHEM_ES_ATTRIBUTE SET _UID = #{Uid,jdbcType=INTEGER} ,MID = #{mid,jdbcType=CHAR} ,UID = #{uid,jdbcType=INTEGER} ,TURN = #{turn,jdbcType=INTEGER} ,TYPE = #{type,jdbcType=BIT} ,TITLE = #{title,jdbcType=VARCHAR} ,STATUS = #{status,jdbcType=BIT} ,TYPE_ID = #{typeId,jdbcType=INTEGER} ,VALUES = #{values,jdbcType=LONGVARCHAR} ,DISPLAY = #{display,jdbcType=BIT} ,ISTHUMB = #{isthumb,jdbcType=BIT} ,STORE_ID = #{storeId,jdbcType=INTEGER} ,IS_LINKED = #{isLinked,jdbcType=BIT} ,ATTR_GROUP = #{attrGroup,jdbcType=VARCHAR} ,INPUT_TYPE = #{inputType,jdbcType=BIT} ,INPUTTIME = #{inputtime,jdbcType=INTEGER} ,SEARCH_TYPE = #{searchType,jdbcType=BIT} ,UPDATETIME = #{updatetime,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=INTEGER}
     * @param entity entity
     * @return Long
     */
    Long update(ShechemEsAttributeDO entity);
    /**
     * desc:根据主键删除数据:SHECHEM_ES_ATTRIBUTE.<br/>
     * descSql =  DELETE FROM SHECHEM_ES_ATTRIBUTE WHERE ID = #{id,jdbcType=INTEGER}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Integer id);
    /**
     * desc:根据主键获取数据:SHECHEM_ES_ATTRIBUTE.<br/>
     * descSql =  SELECT * FROM SHECHEM_ES_ATTRIBUTE WHERE ID = #{id,jdbcType=INTEGER}
     * @param id id
     * @return ShechemEsAttributeDO
     */
    ShechemEsAttributeDO getByPrimary(Integer id);
}
