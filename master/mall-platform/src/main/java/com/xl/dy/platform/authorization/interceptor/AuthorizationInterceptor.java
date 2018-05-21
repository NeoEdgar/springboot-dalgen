package com.xl.dy.platform.authorization.interceptor;

import com.xl.dy.common.constant.BaseCode;
import com.xl.dy.common.constant.BaseException;
import com.xl.dy.platform.authorization.annotation.Authorization;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * 自定义拦截器，判断 。可以实现相关注解标记的方法
 */
@Component
public class AuthorizationInterceptor extends HandlerInterceptorAdapter {


    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        //注解标记
        if (method.getAnnotation(Authorization.class) != null) {
            return false;
        }

        return true;
    }
}
