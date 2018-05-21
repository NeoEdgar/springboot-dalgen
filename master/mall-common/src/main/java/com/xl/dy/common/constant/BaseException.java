package com.xl.dy.common.constant;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 全局异常封装
 * @Param:
 * Created by JT on 2018/5/21 0021.
 */
public class BaseException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private final BaseCode error;

	public BaseException(BaseCode ec, String message, Throwable cause) {
		super(message, cause);
		error = ec;
	}

	public BaseException(BaseCode ec) {
		this(ec, ec.getMessage(), null);
	}
	
	public BaseException(BaseCode ec, String message) {
		this(ec, message, null);
	}

	public BaseException(BaseCode ec, Throwable cause) {
		this(ec, null, cause);
	}

	public BaseCode getError() {
		return error;
	}

	@Override
    public String toString() {
		Map<String, String> jsonObj = new HashMap<String, String>();
		jsonObj.put("code", String.valueOf(error.getCode()));
		jsonObj.put("message", this.getMessage());
		return JSONObject.toJSONString(jsonObj);

	}
}
