package com.xl.dy.platform.serviceImpl.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xl.dy.common.constant.BaseCode;
import com.xl.dy.common.constant.BaseException;
import com.xl.dy.common.util.ResInfo;
import com.xl.dy.common.util.ResultBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xl.dy.api.testApi.TestApi;
import com.xl.dy.common.util.dy.JedisUtil;
import com.xl.dy.platform.service.test.TestService;

import com.xl.dy.common.util.MyLog;

@Service
public class TestServiceImpl implements TestApi {

	private static final MyLog LOG = MyLog.getLog(TestServiceImpl .class);

	@Autowired
	private TestService testService;



	/**
	 * 参数统一为String版本
	 * @param payload
	 * @return
	 */
	@Override
	public String testOne(String payload) {
		LOG.info("请求参数 {}", payload);
		JSONObject obj = JSON.parseObject(payload);
		if (obj == null || !obj.containsKey("param")){
			throw new BaseException(BaseCode.PARAM_ERROR);
		}
		JedisUtil js = new JedisUtil();
		js.set("A", "1");
		System.out.println(js.getByKey("A"));
		return ResultBuilder.buildDataSuccess(BaseCode.SUCCESS);
	}

	/**
	 * 参数统一为JSON版本
	 * @param payload
	 * @return
	 */
	@Override
	public ResInfo testTwo(JSONObject payload) {
		LOG.info("请求参数 {}", payload);

		return ResultBuilder.buildNewDataSuccess(BaseCode.SUCCESS);
	}

	public static void main(String[] args) {

	}
}
