package com.xl.dy.common.util.dy;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.ObjectMetadata;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 * @program: mall-master
 * @description:
 * @author: Caeser
 * @create: 2018-05-05 17:07
 **/
public class PhotoUtils {
    public static String downloadAndUploadPictures(String url , Long urlId) {
        String path = "/home/caeser/pictures/"+urlId+".jpg";
        downloadPic(url, path);
        String photoUrl = uploadPictures(path,urlId);
        deleteFile(path);
        return photoUrl;
    }
    //链接url上传图片
    private static String uploadPictures(String path,Long id) {
        String urlId = id.toString();
        File filePic = new File(path);
        String photoUrl = null;
        if(filePic.exists()){
            FileInputStream is = null;
            try {
                is = new FileInputStream(filePic);
                photoUrl = idCardUpload(is,urlId+".jpg");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return photoUrl;
    }





    //链接url下载图片
    private static void downloadPic(String urlList, String path) {
        URL url = null;
        try {
            url = new URL(urlList);
            DataInputStream dataInputStream = new DataInputStream(url.openStream());

            FileOutputStream fileOutputStream = new FileOutputStream(new File(path));
            ByteArrayOutputStream output = new ByteArrayOutputStream();

            byte[] buffer = new byte[1024];
            int length;

            while ((length = dataInputStream.read(buffer)) > 0) {
                output.write(buffer, 0, length);
            }
            fileOutputStream.write(output.toByteArray());
            System.out.println(dataInputStream.read(buffer));
            dataInputStream.close();
            fileOutputStream.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String downloadPictures(String url) {
        return downloadPicture(url);
    }

    //链接url下载图片
    private static String downloadPicture(String urlList) {
        URL url = null;
        String photoUrl = null;
        try {
            // 构造URL
            url = new URL(urlList);
            // 打开连接
            URLConnection con = url.openConnection();
            //设置请求超时为5s
            con.setConnectTimeout(5 * 1000);
            // 输入流
            DataInputStream dataInputStream = new DataInputStream(url.openStream());
            photoUrl = idCardUpload(dataInputStream, "test");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return photoUrl;
    }

    private static String idCardUpload(InputStream in, String filename) {
        String endpoint = "oss-cn-qingdao.aliyuncs.com";
        // accessKey
        String accessKeyId = "LTAIXXvAAT7QP6m7";
        String accessKeySecret = "t4haBAMUFd6nTwXVkdKfjVT1CRgNYf";
        // 空间
        String bucketName = "shophotos";
        // 文件存储目录
        String filedir = "mall/";
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
            OSSClientBuilder ossClientBuilder = new OSSClientBuilder();
            OSS ossClient = ossClientBuilder.build(endpoint, accessKeyId, accessKeySecret);
            ossClient.putObject(bucketName, filedir + filename, in, meta);
            Date expiration = new Date(System.currentTimeMillis() + 3600L * 1000 * 24 * 365 * 10);
            url = ossClient.generatePresignedUrl(bucketName, filedir + filename, expiration);
            // 关闭client
            ossClient.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return url.toString();
    }

    //删除图片
    public static boolean deleteFile(String fileName) {
        File file = new File(fileName);
        // 如果文件路径所对应的文件存在，并且是一个文件，则直接删除
        if (file.exists() && file.isFile()) {
            if (file.delete()) {
                System.out.println("删除单个文件" + fileName + "成功！");
                return true;
            } else {
                System.out.println("删除单个文件" + fileName + "失败！");
                return false;
            }
        } else {
            System.out.println("删除单个文件失败：" + fileName + "不存在！");
            return false;
        }
    }
}

