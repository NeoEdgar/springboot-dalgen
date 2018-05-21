package com.xl.dy.platform.authorization.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CrossInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
      /*
    	String[] allowDomain = {"https://wx1b468c340acd675a.webwx.xlgoo.net", "https://api.hipay.xinglongdayuan.com", "https://xlgoo.net", "https://xinglongdayuan.com", "http://www.webluobo.club", "http://webluobo.club:8080", "http://webluobo.club:8081", "http://webluobo.club:8084", "https://www.webluobo.club", "https://webluobo.club:8080", "https://webluobo.club:8081", "https://webluobo.club:8084", "https://api.weixin.qq.com", "https://api.mch.weixin.qq.com", "https://open.weixin.qq.com", "https://weixin.qq.com", "http://10.0.0.41", "http://127.0.0.1:8081", "http://localhost", "http://localhost:8080", "http://localhost:8081", "http://localhost:8084"};
        Set allowedOrigins = new HashSet<>(Arrays.asList(allowDomain));
     
        String originHeader = request.getHeader("Origin");
        if (allowedOrigins.contains(originHeader)) {
            response.addHeader("Access-Control-Allow-Origin", originHeader);
            response.addHeader("Access-Control-Max-Age", Integer.toString(60 * 60 * 24));
            response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
            response.addHeader("Access-Control-Allow-Headers", "content-type, accessToken, userId, token");
            response.addHeader("Access-Control-Allow-Credentials", "true");
            return true;
        } else {
            return false;
        }*/
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
        response.setHeader("Access-Control-Max-Age", Integer.toString(60 * 60 * 24));
        response.setHeader("Access-Control-Allow-Headers", "content-type, accessToken, userId, token, meNumber, Content_Length, content-disposition, platform");
        response.setHeader("Access-Control-Expose-Headers", "content-type, accessToken, userId, token, meNumber, Content_Length, content-disposition, platform");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        return true;
    }
}
