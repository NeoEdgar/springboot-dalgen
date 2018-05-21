package com.xl.dy.common.util;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.xl.dy.common.constant.BaseCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YM
 */
public class ResultBuilder {

	public static ResInfo buildNewMessageSuccess(String message) {
		ResInfo resultMap = new ResInfo();
		resultMap.setCode(BaseCode.SUCESS.getCode()+"");
		resultMap.setMessage(message);
		resultMap.setData("");
		resultMap.setTimestamp(DateUtils.parseDateLongToString(System.currentTimeMillis()));
		return resultMap;
	}

	public static ResInfo buildNewDataSuccess(Object data) {
		JSONObject.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
		ResInfo resultMap = new ResInfo();
		resultMap.setCode(BaseCode.SUCESS.getCode()+"");
		resultMap.setMessage(BaseCode.SUCESS.getMessage());
		if (data == null) {
			resultMap.setData("data is null");
		} else {
			resultMap.setData(data);
			resultMap.setTimestamp(DateUtils.parseDateLongToString(System.currentTimeMillis()));
		}
		return resultMap;
	}

	public static ResInfo buildNewDataFail(String message, String baseCode, Object data) {
		ResInfo resultMap = new ResInfo();
		resultMap.setCode(baseCode);
		resultMap.setMessage(message);
		resultMap.setData(data);
		resultMap.setTimestamp(DateUtils.parseDateLongToString(System.currentTimeMillis()));
		return resultMap;
	}

	public static ResInfo buildNewMessageFail(String message, String baseCode) {
		ResInfo resultMap = new ResInfo();
		resultMap.setCode(baseCode);
		resultMap.setMessage(message);
		resultMap.setData("");
		resultMap.setTimestamp(DateUtils.parseDateLongToString(System.currentTimeMillis()));
		return resultMap;
	}

	public static String buildMessageSuccess(String message) {
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("code", BaseCode.SUCESS.getCode() + "");
		resultMap.put("message", message);
		resultMap.put("data", "");
		resultMap.put("timestamp", DateUtils.parseDateLongToString(System.currentTimeMillis()));
		return JSONObject.toJSONString(resultMap);
	}

	public static String buildDataSuccess(Object data) {
		JSONObject.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("code", BaseCode.SUCESS.getCode() + "");
		resultMap.put("message", BaseCode.SUCESS.getMessage());
		if (data == null) {
			resultMap.put("data", "data is null");
		} else {
			resultMap.put("data", data);
		}
		resultMap.put("timestamp", DateUtils.parseDateLongToString(System.currentTimeMillis()));
		return JSONObject.toJSONString(resultMap, SerializerFeature.WriteDateUseDateFormat);
	}

	public static String buildDataFail(String message, int baseCode, Object data) {
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("code", baseCode + "");
		resultMap.put("message", message);
		resultMap.put("data", data);
		resultMap.put("timestamp", DateUtils.parseDateLongToString(System.currentTimeMillis()));
		return JSONObject.toJSONString(resultMap);
	}

	public static String buildMessageFail(String message, int baseCode) {
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("code", baseCode + "");
		resultMap.put("message", message);
		resultMap.put("data", "");
		resultMap.put("timestamp", DateUtils.parseDateLongToString(System.currentTimeMillis()));
		return JSONObject.toJSONString(resultMap);
	}

	public static String buildMessageFail(String message, String baseCode) {
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("code", baseCode);
		resultMap.put("message", message);
		resultMap.put("data", "");
		resultMap.put("timestamp", DateUtils.parseDateLongToString(System.currentTimeMillis()));
		return JSONObject.toJSONString(resultMap);
	}
}
