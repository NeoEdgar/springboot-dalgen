package com.xl.dy.common.util;

import java.math.BigDecimal;

public class CountUtil {
	// 加
	public static int add(Integer v1, Integer v2) {
		BigDecimal bal = new BigDecimal(v1);
		BigDecimal payA = new BigDecimal(v2);
		return bal.add(payA).intValue();
	}
	
	// 加
		public static double adds(Integer v1, Double v2) {
			BigDecimal bal = new BigDecimal(v1);
			BigDecimal payA = new BigDecimal(v2);
			return bal.add(payA).intValue();
		}

	// 减
	public static int sub(Integer v1, Integer v2) {
		BigDecimal bal = new BigDecimal(v1);
		BigDecimal payA = new BigDecimal(v2);
		return bal.subtract(payA).intValue();
	}

	// 乘
	public static double mul(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.multiply(b2).doubleValue();
	}

	// 除
	public static double div(double d1, double d2, int len) {// 进行除法运算
		BigDecimal b1 = new BigDecimal(d1);
		BigDecimal b2 = new BigDecimal(d2);
		return b1.divide(b2, len, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	// 除
	public static double divs(BigDecimal b1, double d2, int len) {// 进行除法运算
		BigDecimal b2 = new BigDecimal(d2);
		return b1.divide(b2, len, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	// 乘
	public static double muls(BigDecimal b1, double v2) {
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.multiply(b2).doubleValue();
	}
}
