package com.xl.dy.common.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by admin on 2016/4/27.
 */
public class MyLog extends MyLogFace {

    private static final Map<String,MyLog> POOL = new HashMap<String,MyLog>();
    //----------
    public static synchronized Set<String> getLoggers() 	{
        return POOL.keySet();
    }
    public static synchronized void clearLoggers() 	{
        POOL.clear();
    }
    //----------
    public static synchronized MyLog getLog(String clz) 	{
        MyLog log = POOL.get(clz);
        if (log==null) {
            log = new MyLog();
            log.setName(clz);
            POOL.put(clz, log);
        }
        return log;
    }
    //----------
    public static MyLog getLog(Class<?> clz){
        return getLog(clz.getName());
    }

}
