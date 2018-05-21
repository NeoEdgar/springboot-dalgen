package com.xl.dy.common.util;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.ValueFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * response application/json
 *
 */
public class ResponseUtil {

    private static final Logger LOG = LoggerFactory.getLogger(ResponseUtil.class);

    /**
     * 以JSON格式输出
     *
     * @author LiuYong
     */
    public static void responseWithJson(HttpServletResponse response, Object responseObject) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        PrintWriter out = null;
        try {
            out = response.getWriter();
            String str = JSONObject.toJSONString(responseObject, new ValueFilter() {
                @Override
                public Object process(Object obj, String s, Object v) {
                    if (v == null) {
                        return "";
                    }
                    return v;
                }
            }, SerializerFeature.WriteMapNullValue);
            LOG.debug("[ResponseUtil json 输出] 返回消息为:{}", str);
            out.append(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}
