package com.xl.dy.common.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 流处理工具类
 * @author Guo.Jing
 */
public class IOUtils {

	/**
	 * 转换成字符串
	 * @param is
	 * @return
	 */
	public static String inputStream2String(InputStream is) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));      
        StringBuilder sb = new StringBuilder();
        String line = null;
        try {
			while((line = reader.readLine()) != null) {
				sb.append(line + "\r\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
}
