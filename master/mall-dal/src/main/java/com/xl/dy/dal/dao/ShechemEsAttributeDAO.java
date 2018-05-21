package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.ShechemEsAttributeDO;
import com.xl.dy.dal.mapper.ShechemEsAttributeDOMapper;

/**
* The Table SHECHEM_ES_ATTRIBUTE.
* SHECHEM_ES_ATTRIBUTE
*/
@Repository
public class ShechemEsAttributeDAO{

    @Autowired
    private ShechemEsAttributeDOMapper shechemEsAttributeDOMapper;

    /**
     * desc:插入表:SHECHEM_ES_ATTRIBUTE.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO SHECHEM_ES_ATTRIBUTE( ID ,_UID ,MID ,UID ,TURN ,TYPE ,TITLE ,STATUS ,TYPE_ID ,VALUES ,DISPLAY ,ISTHUMB ,STORE_ID ,IS_LINKED ,ATTR_GROUP ,INPUT_TYPE ,INPUTTIME ,SEARCH_TYPE ,UPDATETIME )VALUES( #{id,jdbcType=INTEGER} , #{Uid,jdbcType=INTEGER} , #{mid,jdbcType=CHAR} , #{uid,jdbcType=INTEGER} , #{turn,jdbcType=INTEGER} , #{type,jdbcType=BIT} , #{title,jdbcType=VARCHAR} , #{status,jdbcType=BIT} , #{typeId,jdbcType=INTEGER} , #{values,jdbcType=LONGVARCHAR} , #{display,jdbcType=BIT} , #{isthumb,jdbcType=BIT} , #{storeId,jdbcType=INTEGER} , #{isLinked,jdbcType=BIT} , #{attrGroup,jdbcType=VARCHAR} , #{inputType,jdbcType=BIT} , #{inputtime,jdbcType=INTEGER} , #{searchType,jdbcType=BIT} , #{updatetime,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    public Long insert(ShechemEsAttributeDO entity){
        return shechemEsAttributeDOMapper.insert(entity);
    }
    /**
     * desc:更新表:SHECHEM_ES_ATTRIBUTE.<br/>
     * descSql =  UPDATE SHECHEM_ES_ATTRIBUTE SET _UID = #{Uid,jdbcType=INTEGER} ,MID = #{mid,jdbcType=CHAR} ,UID = #{uid,jdbcType=INTEGER} ,TURN = #{turn,jdbcType=INTEGER} ,TYPE = #{type,jdbcType=BIT} ,TITLE = #{title,jdbcType=VARCHAR} ,STATUS = #{status,jdbcType=BIT} ,TYPE_ID = #{typeId,jdbcType=INTEGER} ,VALUES = #{values,jdbcType=LONGVARCHAR} ,DISPLAY = #{display,jdbcType=BIT} ,ISTHUMB = #{isthumb,jdbcType=BIT} ,STORE_ID = #{storeId,jdbcType=INTEGER} ,IS_LINKED = #{isLinked,jdbcType=BIT} ,ATTR_GROUP = #{attrGroup,jdbcType=VARCHAR} ,INPUT_TYPE = #{inputType,jdbcType=BIT} ,INPUTTIME = #{inputtime,jdbcType=INTEGER} ,SEARCH_TYPE = #{searchType,jdbcType=BIT} ,UPDATETIME = #{updatetime,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=INTEGER}
     * @param entity entity
     * @return Long
     */
    public Long update(ShechemEsAttributeDO entity){
        return shechemEsAttributeDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:SHECHEM_ES_ATTRIBUTE.<br/>
     * descSql =  DELETE FROM SHECHEM_ES_ATTRIBUTE WHERE ID = #{id,jdbcType=INTEGER}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Integer id){
        return shechemEsAttributeDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:SHECHEM_ES_ATTRIBUTE.<br/>
     * descSql =  SELECT * FROM SHECHEM_ES_ATTRIBUTE WHERE ID = #{id,jdbcType=INTEGER}
     * @param id id
     * @return ShechemEsAttributeDO
     */
    public ShechemEsAttributeDO getByPrimary(Integer id){
        return shechemEsAttributeDOMapper.getByPrimary(id);
    }
}
