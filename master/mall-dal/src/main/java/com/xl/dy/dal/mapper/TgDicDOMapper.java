package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TgDicDO;
import com.xl.dy.dal.resultmap.ErpTypeVO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 由于�?要对分页支持,请直接使用对应的DAO�?
 * The Table TG_DIC.
 * TG_DIC
 */
public interface TgDicDOMapper{

    /**
     * desc:插入表:TG_DIC.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TG_DIC( ID ,DIC_INX ,DIC_KEY ,REMARK ,DIC_TYPE ,DIC_VALUE ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,DIC_TYPE_NAME ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{dicInx,jdbcType=INTEGER} , #{dicKey,jdbcType=VARCHAR} , #{remark,jdbcType=VARCHAR} , #{dicType,jdbcType=VARCHAR} , #{dicValue,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{dicTypeName,jdbcType=VARCHAR} , #{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    Long insert(TgDicDO entity);
    /**
     * desc:更新表:TG_DIC.<br/>
     * descSql =  UPDATE TG_DIC SET DIC_INX = #{dicInx,jdbcType=INTEGER} ,DIC_KEY = #{dicKey,jdbcType=VARCHAR} ,REMARK = #{remark,jdbcType=VARCHAR} ,DIC_TYPE = #{dicType,jdbcType=VARCHAR} ,DIC_VALUE = #{dicValue,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,DIC_TYPE_NAME = #{dicTypeName,jdbcType=VARCHAR} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TgDicDO entity);
    /**
     * desc:根据主键删除数据:TG_DIC.<br/>
     * descSql =  DELETE FROM TG_DIC WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TG_DIC.<br/>
     * descSql =  SELECT * FROM TG_DIC WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TgDicDO
     */
    TgDicDO getByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TG_DIC.<br/>
     * descSql =  SELECT DIC_KEY AS dicKey ,DIC_VALUE AS dicValue ,REMARK AS remark FROM TG_DIC WHERE VALID_STATUS=1 AND DIC_TYPE='ERP_TYPE'
     * @return List<ErpTypeVO>
     */
    List<ErpTypeVO> findErpType();
}
