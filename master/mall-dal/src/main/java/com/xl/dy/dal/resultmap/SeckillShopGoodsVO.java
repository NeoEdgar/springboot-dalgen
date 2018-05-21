package com.xl.dy.dal.resultmap;
import java.util.List;
import java.util.Map;
import java.io.Serializable;
import java.util.Date;
import java.util.ArrayList;

/**
 * The table SeckillShopGoodsVO
 */
public class SeckillShopGoodsVO implements Serializable {

private static final long serialVersionUID = -1L;
    private List<Map> list = new ArrayList();

    public List<Map> getList() {
        return list;
    }

    public void setList(List<Map> list) {
        this.list = list;
    }

    /**
     * shopgoodsid .
     */
    private Long shopgoodsid;
    /**
     * shopid .
     */
    private Long shopid;
    /**
     * goodsid .
     */
    private Long goodsid;
    /**
     * goodssales .
     */
    private Integer goodssales;
    /**
     * evaluatenum .
     */
    private Integer evaluatenum;
    /**
     * createtime .
     */
    private Date createtime;

    /**
     * Set shopgoodsid .
     */
    public void setShopgoodsid(Long shopgoodsid){
        this.shopgoodsid = shopgoodsid;
    }

    /**
     * Get shopgoodsid .
     *
     * @return the string
     */
    public Long getShopgoodsid(){
        return shopgoodsid;
    }

    /**
     * Set shopid .
     */
    public void setShopid(Long shopid){
        this.shopid = shopid;
    }

    /**
     * Get shopid .
     *
     * @return the string
     */
    public Long getShopid(){
        return shopid;
    }

    /**
     * Set goodsid .
     */
    public void setGoodsid(Long goodsid){
        this.goodsid = goodsid;
    }

    /**
     * Get goodsid .
     *
     * @return the string
     */
    public Long getGoodsid(){
        return goodsid;
    }

    /**
     * Set goodssales .
     */
    public void setGoodssales(Integer goodssales){
        this.goodssales = goodssales;
    }

    /**
     * Get goodssales .
     *
     * @return the string
     */
    public Integer getGoodssales(){
        return goodssales;
    }

    /**
     * Set evaluatenum .
     */
    public void setEvaluatenum(Integer evaluatenum){
        this.evaluatenum = evaluatenum;
    }

    /**
     * Get evaluatenum .
     *
     * @return the string
     */
    public Integer getEvaluatenum(){
        return evaluatenum;
    }

    /**
     * Set createtime .
     */
    public void setCreatetime(Date createtime){
        this.createtime = createtime;
    }

    /**
     * Get createtime .
     *
     * @return the string
     */
    public Date getCreatetime(){
        return createtime;
    }
}
