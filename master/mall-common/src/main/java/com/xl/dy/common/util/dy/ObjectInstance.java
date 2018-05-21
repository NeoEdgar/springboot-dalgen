package com.xl.dy.common.util.dy;

import com.xl.dy.common.util.DateUtil;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: mall-master
 * @description: 对象复用信息统一
 * @author: Caeser
 * @create: 2018-04-16 14:41
 **/
@Repository
public class ObjectInstance {
    private static Map addMap = new HashMap();
    private static Map updateMap = new HashMap();
    //add
    public static Map getAddJsonMap(){
        addMap.put("id",IdGenFactory.getId());
        addMap.put("createTime",new Date());
        addMap.put("validStatus",1);
        addMap.put("timestamp", DateUtil.getTimeStamp());
        addMap.put("remark","excute add!!!");
        return addMap;
    }
    //update
    public static Map getUpdateJsonMap(Map map){
        updateMap.put("alterTime",new Date());
        updateMap.put("timestamp", DateUtil.getTimeStamp());
        updateMap.put("remark","excute update!!!");
        return updateMap;
    }
}
