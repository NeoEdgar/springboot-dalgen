package com.xl.dy.common.constant;

public class Constants {
	
	public static final String CURRENT_USER = "current_user";

	/**
	 * 存储当前登录用户id的字段名
	 */
	public static final String CURRENT_USER_ID = "CURRENT_USER_ID";

	/**
	 * token有效期（小时）
	 */
	public static final int TOKEN_EXPIRES_HOUR = 72;

	/**
	 * token有效期（秒）
	 */
	public static final int TOKEN_EXPIRES_SECOND = 1200;

	/**
	 * verification code有效期（秒）
	 */
	public static final int VERIFICATION_CODE_EXPIRES_SECOND = 300;

	/**
	 * 存放Authorization的header字段
	 */
	public static final String AUTHORIZATION = "authorization";

	/**
	 * 登录认证验证码类型
	 * Login authentication verification code type
	 */
	public static final String LOGINVECODE = "LV";

	/**
	 * 修改密码验证码类型
	 * Modifying the type of password authentication code
	 */
	public static final String MODIFYINGPASSWORDVECODE = "MP";

	/**
	 * 初始化密码
	 */
	public static final String INIT_PASSWORD = "000000";

}
