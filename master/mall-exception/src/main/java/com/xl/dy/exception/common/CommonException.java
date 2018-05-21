package com.xl.dy.exception.common;

import com.xl.dy.exception.Exception;

public class CommonException extends Exception {
	public final int ERR_ID = 2;
	public final String ERR_EXP = "COMMON异常";

	public CommonException() {
		super("COMMON异常");
	}

	public CommonException(String msg) {
		super(msg);
	}

	public CommonException(java.lang.Exception ex) {
		super(ex);
	}

	public CommonException(String msg, java.lang.Exception ex) {
		super(msg, ex);
	}

	public CommonException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public CommonException(Throwable cause) {
		super(cause);
	}

	/**
	 * 获得子类类名
	 * 
	 * @Title: getChildClassName
	 * @Description: TODO
	 * @return
	 * @return: String
	 */
	public String getChildClassName() {
		return getClass().getName();
	}
}
