package com.xl.dy.platform.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.xl.dy.platform.authorization.interceptor.PlatformLoginInterceptor;

/**
 * @Description: WEB请求拦截配置
 * @Param:
 * Created by JT on 2018/5/21 0021.
 */
@Configuration
@ComponentScan("com.xl.dy")
public class PlatformConfig extends WebMvcConfigurerAdapter {

    private static final String[] excludePathPattens = new String[]{
            "/static/js/**",
            "/static/css/**",
            "/static/index.html",
            "/business/**",
            "/config/sms/**",
            "/**/error"
    };

    private static final String[] loginPathPattens = new String[]{"/**"};

    @Autowired
    private PlatformLoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor).addPathPatterns(loginPathPattens).excludePathPatterns(excludePathPattens);
    }
}


