package com.xl.dy.common.util.dy;

import com.xl.dy.common.constant.BaseCode;
import com.xl.dy.common.constant.BaseException;

/**
 * @program: mall-master
 * @description:
 * @author: Caeser
 * @create: 2018-05-04 15:11
 **/
public class GoodsUtil {
    //获取商品编码
    public static String getGoodsCode(){
        //jedis获取商品码
        JedisUtil jedisUtil = new JedisUtil();
        String goodsCodeRedisKey = GoodsConstant.GOODS_CODE_REDIE_KEY;
        jedisUtil.incrBy(goodsCodeRedisKey, 1);
        if (!jedisUtil.hasKey(goodsCodeRedisKey)) {
            throw new BaseException(BaseCode.PARAMERROR);
        }
        String goodsCode = new StringBuilder().append((Long.valueOf(jedisUtil.getByKey(goodsCodeRedisKey)) + Long.valueOf(GoodsConstant.TEN_BILLION))).toString();
        return goodsCode;
    }
}
