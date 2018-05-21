package com.xl.dy.platform.VO;

/**
 * @Description: TODO
 * @Param: 
 * Created by JT on 2018/5/21 0021.
 */
public interface BaseVO {

    /**
     * @转换PO(PersistentObject)到VO(ValueObject),以便于只传输需要的数据到界面端
     * @param poObj
     */
    void convertPOToVO(Object poObj);
}
