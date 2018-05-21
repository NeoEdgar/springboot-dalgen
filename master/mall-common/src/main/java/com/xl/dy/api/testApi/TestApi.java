package com.xl.dy.api.testApi;

import com.alibaba.fastjson.JSONObject;
import com.xl.dy.common.util.ResInfo;

/**
 * @Description: TODO
 * @Param:
 * Created by JT on 2018/5/21 0021.
 */
public interface TestApi {

	/**
	 * 参数统一为String版本
	 * @param payload
	 * @return
	 */
	String testOne(String payload);

	/**
	 * 参数统一为JSON版本
	 * @param payload
	 * @return
	 */
	ResInfo testTwo(JSONObject payload);
}
