package com.xl.dy.common.util.dy;

import com.xl.dy.common.constant.BaseCode;
import com.xl.dy.common.constant.BaseException;
import com.xl.dy.common.util.HttpUtils;
import com.xl.dy.common.util.MD5Utils;
import java.util.Date;

public class XLSMSUtil {
	
	static String URL = "http://xlvip.xinglongstore.com:92/XLSMS/hipay/sms.do";
	static String CARD_ID = "10033";
	static String SKEY = "00014732721315613ASDF12EQCD44C423F";
	
	public static String Note_CardSend(String tel, String note, String notetag) {
		String ts = getSecondTimestampTwo(new Date());
		String sig = gewSig(ts);
		String arg = "method=Note_CardSend&ts="+ ts +"&sig=" + sig;
		String arg2 = "tel=" + tel + "&note=" + note + "&notetag=" + notetag;
		String postUrl = URL+"?"+arg;
		String result = "";
		try {
			result = HttpUtils.doPost(postUrl, arg2);
		} catch (Exception e) {
			throw new BaseException(BaseCode.SMSSENDINGFAILURE);
		}
		return result;
	}
	
	/**
	 * 获取MD5加密sig
	 * @return
	 */
	private static String gewSig(String TS) {
		//获取时间戳(精确到秒)
//		String ts = getSecondTimestampTwo(new Date());//这个ts应该用同一个，从调用处传参
		String sigStr = CARD_ID + TS + SKEY;
		String sig = MD5Utils.MD5Encode(sigStr);
		return sig; 
	}
	
    /** 
     * 获取精确到秒的时间戳 
     * @param date
     */  
    public static String getSecondTimestampTwo(Date date){  
        if (null == date) {  
            return "0";  
        }
        String timestamp = String.valueOf(date.getTime()/1000);  
        return timestamp;
    }
    
    public static void main(String[] args) {
    	String note = "试点范围MKMJ5454";
    	String re = Note_CardSend("15355475213", note, "ADMIN VERIFY");
    	System.out.println(re);
	}
}
