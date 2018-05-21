package com.xl.dy.exception;

public class Exception extends java.lang.Exception {
	public final int ERR_ID = 1;
	public final String ERR_EXP = "大院系统异常";

	public Exception() {
		super("大院系统异常");
	}

	public Exception(String msg) {
		super(msg);
	}

	public Exception(java.lang.Exception ex) {
		super(ex);
	}

	public Exception(String msg, java.lang.Exception ex) {
		super(msg, ex);
	}

	public Exception(String msg, Throwable cause) {
		super(msg, cause);
	}

	public Exception(Throwable cause) {
		super(cause);
	}

	/**
	 * 获得子类类名
	 * 
	 * @Title: getChildClassName
	 * @Description: TODO
	 * @author: lenovo
	 * @return
	 * @return: String
	 */
	public String getChildClassName() {
		return getClass().getName();
	}

}
