package com.xl.dy.platform;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import com.xl.dy.common.util.dy.JedisUtil;

/**
 * @Description: spring boot 启动类
 * @ComponentScan(basePackages = {"com..xxx.xxx"}) //扫描包根据项目域名配置相关报名
 * @Param:
 * Created by JT on 2018/5/21 0021.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.xl.dy"})
@EnableTransactionManagement
@Import({JedisUtil.class})
public class PlatformApplication extends WebMvcConfigurerAdapter{
	
    public static void main(String[] args) {
        SpringApplication.run(PlatformApplication.class, args);
    }
}
