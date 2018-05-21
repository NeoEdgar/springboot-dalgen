package com.xl.dy.common.util.dy;

import java.io.InputStream;
import java.net.URL;
import java.util.Date;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.ObjectMetadata;

public class OssUtil {

	private static String ENDPOINT = "oss-cn-beijing.aliyuncs.com";
	// accessKey
	private static String ACCESSKEYID = "uTQyAim7XLJg5KEF";
	private static String ACCESSKEYSECRET = "M8Aety9j3XCZcq2jfl1geEpGx7S5qT";
	// 空间
	private static String BUCKETNAME = "hipaytest";
	// 文件存储目录
	private static String FILEDIR = "hipaytest/";

	/**
	 * oss 图片上传
	 * 
	 * @param in
	 *            InputStream
	 * @param file
	 *            File
	 * @return
	 */
	public static String OSSUp(InputStream in, String filename) {
	

		// 生成URL
		URL url = null;
		try {
			ObjectMetadata meta = new ObjectMetadata();
			meta.setContentLength(in.available());
			meta.setCacheControl("no-cache");
			meta.setHeader("Pragma", "no-cache");
			meta.setContentType("image/jpeg");
			meta.setContentDisposition("inline;filename=" + filename);
			// 创建OSSClient实例
			OSSClient ossClient = new OSSClient(ENDPOINT, ACCESSKEYID, ACCESSKEYSECRET);
			ossClient.putObject(BUCKETNAME, FILEDIR + filename, in, meta);
			Date expiration = new Date(System.currentTimeMillis() + 3600L * 1000 * 24 * 365 * 10);
			url = ossClient.generatePresignedUrl(BUCKETNAME, FILEDIR + filename, expiration);
			// 关闭client
			ossClient.shutdown();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return url.toString();
	}

}
