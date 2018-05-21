package com.xl.dy.common.util;

import org.apache.commons.codec.digest.DigestUtils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

public class MD5Utils {
    private static final String INPUT_CHARSET = "utf8";

    public MD5Utils() {
    }

    public static String toMD5(String text, String inputCharset) {
        return DigestUtils.md5Hex(getContentBytes(text, inputCharset));
    }

    public static String sign(String text, String key) {
        text = text + key;
        return DigestUtils.md5Hex(getContentBytes(text, "utf8"));
    }

    public static boolean verify(String text, String sign, String key) {
        text = text + key;
        String mysign = DigestUtils.md5Hex(getContentBytes(text, "utf8"));
        return mysign.equals(sign);
    }

    private static byte[] getContentBytes(String content, String charset) {
        if (charset != null && !"".equals(charset)) {
            try {
                return content.getBytes(charset);
            } catch (UnsupportedEncodingException var3) {
                throw new RuntimeException("MD5签名过程中出现错误,指定的编码集不对,您目前指定的编码集是:" + charset);
            }
        } else {
            return content.getBytes();
        }
    }

    public static String MD5Encode(String origin) {
        String resultString = null;
        try {
            resultString = new String(origin);
            MessageDigest md = MessageDigest.getInstance("MD5"); // MD5 SHA
            resultString = toHex(md.digest(resultString.getBytes()));
        } catch (Exception ex) {
        }
        return resultString;
    }

    private static String toHex(byte buffer[]) {
        StringBuilder sb = new StringBuilder(buffer.length * 2);
        for (int i = 0; i < buffer.length; i++) {
            sb.append(Character.forDigit((buffer[i] & 240) >> 4, 16));
            sb.append(Character.forDigit(buffer[i] & 15, 16));
        }
        return sb.toString();
    }

    public static void main(String[] args){
    	System.out.println(MD5Utils.sign("", "SvK9YJ"));
        System.out.println(MD5Utils.toMD5("123456","utf8"));
    }
}
