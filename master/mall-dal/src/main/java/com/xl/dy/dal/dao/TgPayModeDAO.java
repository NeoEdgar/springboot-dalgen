package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TgPayModeDO;
import java.util.Map;
import java.util.List;
import com.xl.dy.dal.mapper.TgPayModeDOMapper;

/**
* The Table TG_PAY_MODE.
* TG_PAY_MODE
*/
@Repository
public class TgPayModeDAO{

    @Autowired
    private TgPayModeDOMapper tgPayModeDOMapper;

    /**
     * desc:插入表:TG_PAY_MODE.<br/>
     * descSql =  INSERT INTO TG_PAY_MODE( ID ,IS_DISC ,REMARK ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,PAY_MODE_NAME ,VALID_STATUS ,HIPAY_CURRENCY )VALUES( #{id,jdbcType=BIGINT} , #{isDisc,jdbcType=INTEGER} , #{remark,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{payModeName,jdbcType=VARCHAR} , #{validStatus,jdbcType=INTEGER} , #{hipayCurrency,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TgPayModeDO entity){
        return tgPayModeDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TG_PAY_MODE.<br/>
     * descSql =  UPDATE TG_PAY_MODE SET IS_DISC = #{isDisc,jdbcType=INTEGER} ,REMARK = #{remark,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,PAY_MODE_NAME = #{payModeName,jdbcType=VARCHAR} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,HIPAY_CURRENCY = #{hipayCurrency,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TgPayModeDO entity){
        return tgPayModeDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TG_PAY_MODE.<br/>
     * descSql =  DELETE FROM TG_PAY_MODE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return tgPayModeDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TG_PAY_MODE.<br/>
     * descSql =  SELECT * FROM TG_PAY_MODE WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TgPayModeDO
     */
    public TgPayModeDO getByPrimary(Long id){
        return tgPayModeDOMapper.getByPrimary(id);
    }
    /**
     * desc:根据主键获取有效数据:TG_PAY_MODE.<br/>
     * descSql =  SELECT * FROM TG_PAY_MODE WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TgPayModeDO
     */
    public TgPayModeDO getByPrimarySelective(Long id){
        return tgPayModeDOMapper.getByPrimarySelective(id);
    }
    /**
     * desc:获取所有支付信息:TG_PAY_MODE.<br/>
     * descSql =  SELECT ID id,PAY_MODE_NAME payModeName,HIPAY_CURRENCY hipayCurrency FROM TG_PAY_MODE WHERE VALID_STATUS = 1
     * @return List<Map>
     */
    public List<Map> getAllPayModes(){
        return tgPayModeDOMapper.getAllPayModes();
    }
}
