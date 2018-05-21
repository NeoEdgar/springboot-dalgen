package com.xl.dy.platform.config;

import com.xl.dy.platform.service.quartz.TestJob;
import org.quartz.Trigger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;


/**
 * @Description: TODO
 * @Param:
 * Created by JT on 2018/5/21 0021.
 */
@Configuration
public class QuartzConfig {

	
	/**
	 * attention: Details：配置定时任务
	 */
	@Bean(name = "testDetail")
	public MethodInvokingJobDetailFactoryBean testJobDetailFactoryBean(@Qualifier("testJob") TestJob testJob) {
		MethodInvokingJobDetailFactoryBean jobDetail = new MethodInvokingJobDetailFactoryBean();
		jobDetail.setConcurrent(false);//是否并发
		jobDetail.setName("testJobDetail");
		jobDetail.setTargetObject(testJob);
		jobDetail.setTargetMethod("execute");
		return jobDetail;
	}

	/**
	 * attention: Details：配置定时任务的触发器，也就是什么时候触发执行定时任务
	 */
	@Bean(name = "testTrigger")
	public CronTriggerFactoryBean testJobTrigger(
			@Qualifier("testDetail") MethodInvokingJobDetailFactoryBean testJobDetail) {
		CronTriggerFactoryBean trigger = new CronTriggerFactoryBean();
		trigger.setJobDetail(testJobDetail.getObject());
		trigger.setCronExpression("0 0 0 * * ?");//配置时间策略
		trigger.setName("testJobTrigger");
		return trigger;
	}

	/**
	 * attention: Details：定义quartz调度工厂
	 */
	@Bean(name = "schedulers")
	public SchedulerFactoryBean testJobchedulerFactory(@Qualifier("testTrigger") Trigger testTrigger) {
		SchedulerFactoryBean bean = new SchedulerFactoryBean();
		bean.setOverwriteExistingJobs(true);
		bean.setStartupDelay(1);
		bean.setAutoStartup(true);
		bean.setTriggers(testTrigger);
		return bean;
	}

}