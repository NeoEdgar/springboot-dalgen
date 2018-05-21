package com.xl.dy.common.util;

import java.util.Collection;
import java.util.Map;

/**
* @author 作者 E-mail: 605363638@qq.com
* @version 创建时间：2018年1月10日 上午10:31:23
* 类说明 验证对象是否非空
*/
public class StringisNullOrEmpty {
	public static boolean isNullOrEmpty(Object obj) {
        if (obj == null){
            return true;
        }

        if (obj instanceof String) {
            if ("".equals((String) obj)) {
                return true;
            }
        }

        if (obj instanceof Integer) {
            if ("".equals((Integer) obj) || ((Integer) obj) == 0) {
                return true;
            }
        }

        if (obj instanceof CharSequence){
            return ((CharSequence) obj).length() == 0;
        }


        if (obj instanceof Collection){
            return ((Collection) obj).isEmpty();
        }


        if (obj instanceof Map){
            return ((Map) obj).isEmpty();
        }

        if (obj instanceof Object[]) {
            Object[] object = (Object[]) obj;
            if (object.length == 0) {
                return true;
            }
            boolean empty = true;
            for (int i = 0; i < object.length; i++) {
                if (!isNullOrEmpty(object[i])) {
                    empty = false;
                    break;
                }
            }
            return empty;
        }
        return false;
    }
}
