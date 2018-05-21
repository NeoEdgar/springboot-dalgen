package com.xl.dy.platform.config;

import com.xl.dy.platform.authorization.interceptor.AuthorizationInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * @Description: TODO
 * @Param:
 * Created by JT on 2018/5/21 0021.
 */
@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter {

	@Autowired
	private AuthorizationInterceptor authorizationInterceptor;


	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(authorizationInterceptor);
	}

	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {

	}
}