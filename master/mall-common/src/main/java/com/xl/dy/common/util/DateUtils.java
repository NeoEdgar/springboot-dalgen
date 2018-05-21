package com.xl.dy.common.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间格式化工具
 * Created by admin on 2016/5/4.
 */
public class DateUtils {

    private static final String DEFAULT_CONVERT_PATTERN = "yyyyMMddHHmmssSSS";

    /**
     * 获取当前时间字符串(默认格式:yyyyMMddHHmmssSSS)
     *
     * @return
     */
    public static String getCurrentTimeStrDefault() {
        return getCurrentTimeStr(DEFAULT_CONVERT_PATTERN);
    }

    /**
     * 获取指定时间字符串(默认格式:yyyyMMddHHmmssSSS)
     * @param date
     * @return
     */
    public static String getTimeStrDefault(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DEFAULT_CONVERT_PATTERN);
        return dateFormat.format(date);
    }

    /**
     * 获取当前时间字符串
     *
     * @param pattern 转换格式
     * @return
     */
    public static String getCurrentTimeStr(String pattern) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.format(new Date());
    }

    /**
     * 获取指定时间字符串
     * @param date
     * @return
     */
    public static String getTimeStr(Date date, String pattern) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.format(date);
    }

    /**
     * 判断时间字符串是否为默认格式
     * @param dateTimeStr
     * @return
     */
    public static boolean isValidDefaultFormat(String dateTimeStr) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DEFAULT_CONVERT_PATTERN);
        try {
            dateFormat.parse(dateTimeStr);
            return true;
        } catch (Exception e) {
            // 如果抛出异常，说明格式不正确
            return false;
        }
    }
    public static String parseDateLongToString(long timestamp){
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        return sdf.format(new Date(timestamp));
    }

    /**
     * 将java.util.Date 格式转换为字符串格式'yyyy-MM-dd HH:mm:ss'(24小时制)<br>
     * 如Sat May 11 17:24:21 CST 2002 to '2002-05-11 17:24:21'<br>
     * @param time Date 日期<br>
     * @return String   字符串<br>
     */

    public static String dateToString(Date time){
        SimpleDateFormat formatter;
        formatter = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
        String ctime = formatter.format(time);

        return ctime;
    }

    public static String dateToFormatString(Date time,String format){
        SimpleDateFormat formatter;
        formatter = new SimpleDateFormat (format);
        String ctime = formatter.format(time);

        return ctime;
    }

    public static String dateToStringDayLastSecond(Date time){
        SimpleDateFormat formatter;
        formatter = new SimpleDateFormat ("yyyy-MM-dd 23:59:59");
        String ctime = formatter.format(time);

        return ctime;
    }

    public static String dateToString2(Date time){
        SimpleDateFormat formatter;
        formatter = new SimpleDateFormat ("yyyyMMdd");
        String ctime = formatter.format(time);

        return ctime;
    }

    /**
     * 日期计算增加秒数
     *
     * @param beginDate
     * @param seconds
     * @return
     */
    public static Date addSecond(Date beginDate, int seconds) {
        Date date = beginDate;
        if (seconds != 0) {
            try {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                calendar.add(Calendar.SECOND, seconds);
                date = calendar.getTime();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return date;
    }
}
