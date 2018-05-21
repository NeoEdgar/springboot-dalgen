package com.xl.dy.platform.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @Description: TODO
 * @Param:
 * Created by JT on 2018/5/21 0021.
 */
@Configuration
@EnableRedisHttpSession(redisNamespace="platform",maxInactiveIntervalInSeconds = 86400*7)
public class SessionConfig {
	
}