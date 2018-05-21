package com.xl.dy.common.util;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 
 * @author YM
 * * @ClassName: HttpUtils
 * @Description: http请求工具类
 * @date 2017年11月18日 下午4:46:12
 *
 */
public class HttpUtils {

    /**
	 * Get请求
	 * @param url
	 * @return 返回响应字符串
	 */
	public static String doGet(String url) {
		HttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(url);
		InputStream is = null;
		String result = "";
		try {
			HttpResponse httpResponse = httpClient.execute(httpGet);
			HttpEntity httpEntity = httpResponse.getEntity();
			if(httpEntity != null) {
				is = httpEntity.getContent();
				result = IOUtils.inputStream2String(is);
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(httpGet != null) {
				httpGet.releaseConnection();
			}
		}
		return result;
	}
	
	/**
	 * Post 请求
	 * @param urlParam
	 * @param json 参数
	 * @return 返回响应字符串
	 */
	public static String doPost2(String urlParam, String json) throws Exception {
		BufferedReader reader = null;
		HttpURLConnection connection = null;
		StringBuffer sb = new StringBuffer("");
		try {
			// 创建连接
			URL url = new URL(urlParam);
			connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setRequestMethod("POST");
			connection.setUseCaches(false);
			connection.setInstanceFollowRedirects(true);
			connection.setRequestProperty("Content-Type", "application/json");

//			connection.connect();

			// POST请求
			DataOutputStream out = new DataOutputStream(
					connection.getOutputStream());

			out.write(json.getBytes("UTF-8"));
			out.flush();
			out.close();

			// 读取响应
			reader = new BufferedReader(new InputStreamReader(
					connection.getInputStream()));
			String lines;
			while ((lines = reader.readLine()) != null) {
				lines = new String(lines.getBytes(), "utf-8");
				sb.append(lines);
			}
		} catch (Exception e) {
			System.out.println("发送 POST 请求出现异常！" + e);
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				// 断开连接
				connection.disconnect();
			}
		}
		return sb.toString();
	}

	/**
	 * POST REQUEST
	 * @param urlParam
	 * @param json
	 * @throws Exception
	 */
	public static String doPost(String urlParam, String json) throws Exception {
		OutputStreamWriter out = null;
		BufferedReader in = null;
		StringBuffer sb = new StringBuffer("");
		try {
			URL realUrl = new URL(urlParam);
			HttpURLConnection conn  = (HttpURLConnection)realUrl.openConnection();// 打开和URL之间的连接
			conn.setDoOutput(true);// 发送POST请求必须设置如下两行
			conn.setDoInput(true);
			// 设置通用的请求属性
			conn.setRequestMethod("POST"); // 设置请求方式
			conn.setRequestProperty("Accept", "application/json"); // 设置接收数据的格式
			conn.setRequestProperty("connection", "Keep-Alive");
			// 获取URLConnection对象对应的输出流
			out = new OutputStreamWriter(conn.getOutputStream(), "UTF-8"); // utf-8编码
			out.append(json);
			out.flush();// flush输出流的缓冲
			in = new BufferedReader(new InputStreamReader(conn.getInputStream()));// 定义BufferedReader输入流来读取URL的响应
			String line;
			while ((line = in.readLine()) != null) {
				sb.append(line);
			}
		} catch (Exception e) {
			System.out.println("发送 POST 请求出现异常！" + e);
			e.printStackTrace();
		}
		finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) throws Exception {
		String result = doPost("http://61.161.160.12:9980/xlk/sys/jwt/secret",
				"subject=HiPay&password=xinglong828");
		System.out.println(result);
	}
}
