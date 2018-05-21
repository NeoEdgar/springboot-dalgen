package com.xl.dy.common.util.dy;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.Set;

/**
 * @author LHJ
 */
public class JedisUtil implements ApplicationContextAware {
    private static ApplicationContext applicationContext = null;

    private final Logger logger = LoggerFactory.getLogger(JedisUtil.class);

    private static JedisPool jedisPool = null;

    //1秒超时
    private static final long expired = 1000;

    public static JedisPool getJedisPool(){
        if (jedisPool ==null){
            synchronized (JedisPool.class){
                if (jedisPool==null){
                    jedisPool = applicationContext.getBean(JedisPool.class);
                }
            }
        }
        return jedisPool;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (JedisUtil.applicationContext == null) {
            //初始化 spring applicationContext
            JedisUtil.applicationContext = applicationContext;
        }
    }

    /**
     * 根据key获取value
     *
     * @param key
     * @return
     */
    public String getByKey(String key) {
        Jedis jedis = getJedisPool().getResource();
        String str = "";
        try {
            str = jedis.get(key);
        } finally {
            try {
                jedis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return str;
    }

    /**
     * 设置key -value 形式数据
     *
     * @param key
     * @param value
     * @return
     */
    public String set(String key, String value) {
        Jedis jedis = getJedisPool().getResource();
        String str = "";
        try {
            str = jedis.set(key, value);
        } finally {
            try {
                jedis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return str;
    }

    public String setex(String key, String value, int timeOut) {
        Jedis jedis = getJedisPool().getResource();
        String str = "";
        try {
            str = jedis.setex(key, timeOut, value);
        } finally {
            try {
                jedis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return str;
    }


    /**
     * 根据key查看是否存在
     *
     * @param key
     * @return
     */
    public boolean hasKey(String key) {
        Jedis jedis = getJedisPool().getResource();
        Boolean exists;
        try {
            exists = jedis.exists(key);
        } finally {
            try {
                jedis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return exists;
    }


    /**
     * 根据通配符获取所有匹配的key
     *
     * @param pattern
     * @return
     */
    public Set<String> getKesByPattern(String pattern) {
        Jedis jedis = getJedisPool().getResource();
        Set<String> keys;
        try {
            keys = jedis.keys(pattern);
        } finally {
            try {
                jedis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return keys;
    }

    /**
     * 根据key删除
     *
     * @param key
     */
    public void delByKey(String key) {
        Jedis jedis = getJedisPool().getResource();
        try {
            jedis.del(key);
        } finally {
            try {
                jedis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * 根据key获取过期时间
     *
     * @param key
     * @return
     */
    public long getTimeOutByKey(String key) {
        Jedis jedis = getJedisPool().getResource();
        Long ttl;
        try {
            ttl = jedis.ttl(key);
        } finally {
            try {
                jedis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return ttl;
    }

    /**
     * 清空数据 【慎用啊！】
     */
    public void flushDB() {
        Jedis jedis = getJedisPool().getResource();
        try {
            jedis.flushDB();
        } finally {
            try {
                jedis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 刷新过期时间
     *
     * @param key
     * @param timeOut
     * @return
     */
    public long refreshLiveTime(String key, int timeOut) {
        Jedis jedis = getJedisPool().getResource();
        Long expire;
        try {
            expire = jedis.expire(key, timeOut);
        } finally {
            try {
                jedis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return expire;
    }

    public long incr(String key) {
        Jedis jedis = getJedisPool().getResource();
        Long incr;
        try {
            incr = jedis.incr(key);
        } finally {
            try {
                jedis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return incr;
    }

    public long incrBy(String key, long integer) {
        Jedis jedis = getJedisPool().getResource();
        Long expire;
        try {
            jedis.incrBy(key, integer);
            expire = jedis.expire(key, 86400);
        } finally {
            try {
                jedis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return expire;
    }

    //上锁  
    public boolean acquireLock(String lock) {
        Jedis jedis = getJedisPool().getResource();
        // 1. 通过SETNX试图获取一个lock  
        boolean success = false;
        try {
            long value = System.currentTimeMillis() + expired + 1;
            long acquired = jedis.setnx(lock, String.valueOf(value));
            jedis.expire(lock, 1);//设置1秒超时
            //SETNX成功，则成功获取一个锁
            if (acquired == 1) success = true;
                //SETNX失败，说明锁被其他客户端保持，检查其是否已经超时
            else {
                long oldValue = Long.valueOf(jedis.get(lock));
                if (oldValue < System.currentTimeMillis()) {//超时
                    //获取上一个锁到期时间，并设置现在的锁到期时间，
                    //只有一个线程才能获取上一个线上的设置时间，因为jedis.getSet是同步的
                    String getValue = jedis.getSet(lock, String.valueOf(value));
                    if (getValue != null) {
                        if (Long.valueOf(getValue) == oldValue)
                            success = true;
                        else success = false;// 已被其他进程捷足先登了
                    }
                } else //未超时，则直接返回失败
                    success = false;
            }
        } finally {
            try {
                jedis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return success;
    }

    //释放锁
    public void releaseLock(String lock) {
        long current = System.currentTimeMillis();
        // 避免删除非自己获取得到的锁
        Jedis jedis = getJedisPool().getResource();
        try {
            if (StringUtils.isNotBlank(jedis.get(lock))) {
                jedis.del(lock);
            }
        } finally {
            try {
                jedis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
