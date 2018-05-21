package com.xl.dy.common.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;

/**
 * @Description: 日期时间工具类
 */
public class DateUtil {

	public static final String FORMAT_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
	public static final String FORMAT_YYYYMMDDHHMMSSSSS = "yyyyMMddhhmmssSSS";
	public static final String FORMAT_YYYYMMDDHHMMSS = "yyyyMMddhhmmss";
	public static final String FORMAT_YY_MM_DD = "yyyy-MM-dd";
	
	public static String getCurrentDate() {
		String formatPatternShort = "yyyyMMddhhmmss";
		SimpleDateFormat format = new SimpleDateFormat(formatPatternShort);
		return format.format(new Date());
	}

	public static String getSeqString() {
		SimpleDateFormat fm = new SimpleDateFormat("yyyyMMddHHmmss"); // "yyyyMMdd G
		return fm.format(new Date());
	}

	public static Timestamp getCurrentTimestamp() {
		return new Timestamp(System.currentTimeMillis());
	}

	/**
	 * 获取当前时间，格式为 yyyyMMddHHmmss
	 *
	 * @return
	 */
	public static String getCurrentTimeStr(String format) {
		format = StringUtils.isBlank(format) ? FORMAT_YYYY_MM_DD_HH_MM_SS : format;
		Date now = new Date();
		return date2Str(now, format);
	}

	public static String date2Str(Date date) {
		return date2Str(date, FORMAT_YYYY_MM_DD_HH_MM_SS);
	}

	/**
	 * 时间转换成 Date 类型
	 *
	 * @param date
	 * @param format
	 * @return
	 */
	public static String date2Str(Date date, String format) {
		if ((format == null) || "".equals(format)) {
			format = FORMAT_YYYY_MM_DD_HH_MM_SS;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		if (date != null) {
			return sdf.format(date);
		}
		return "";
	}

	/**
	 * 获取批量付款预约时间
	 * @return
	 */
	public static String getRevTime() {
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, 1);
		String dateString = new SimpleDateFormat(DateUtil.FORMAT_YYYYMMDDHHMMSS).format(cal.getTime());
		System.out.println(dateString);
		return dateString;
	}

	/**
	 * 时间比较
	 * @param date1
	 * @param date2
	 * @return DATE1>DATE2返回1，DATE1<DATE2返回-1,等于返回0
	 */
	public static int compareDate(String date1, String date2, String format) {
		DateFormat df = new SimpleDateFormat(format);
		try {
			Date dt1 = df.parse(date1);
			Date dt2 = df.parse(date2);
			if (dt1.getTime() > dt2.getTime()) {
				return 1;
			} else if (dt1.getTime() < dt2.getTime()) {
				return -1;
			} else {
				return 0;
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return 0;
	}

	/**
	 * 把给定的时间减掉给定的分钟数
	 * @param date
	 * @param minute
	 * @return
	 */
	public static Date minusDateByMinute(Date date, int minute) {
		Date newDate = new Date(date.getTime() - (minute * 60 * 1000));
		return newDate;
	}
	/**
	 * 获取当前 前i天的信息
	 */
	public static String decreaseDay(Integer i) {
		SimpleDateFormat sj = new SimpleDateFormat(FORMAT_YY_MM_DD);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
		calendar.add(Calendar.DATE, -i);
		return sj.format(calendar.getTime());
	}
	/**
	 * 对比传入时间是否等于当前时间
	 */
	public static boolean TimeComparison(String time,String format) {
		SimpleDateFormat sdf = new  SimpleDateFormat(format);
		 Date parse = null;
			try {
				parse = sdf.parse(time);
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		return DateUtils.isSameDay(new Date(), parse);
	}
	/**
	 * 获取当前时间戳
	 *
	 * @return
	 */
	
	public static Long getTimeStamp(){
		return System.currentTimeMillis()/1000;
	}
	
	/**
     * 判断时间是否在时间段内
     * @param nowTime
     * @param beginTime
     * @param endTime
     * @return
     */
    public static boolean belongCalendar(Date nowTime, Date beginTime, Date endTime) {
        Calendar date = Calendar.getInstance();
        date.setTime(nowTime);

        Calendar begin = Calendar.getInstance();
        begin.setTime(beginTime);

        Calendar end = Calendar.getInstance();
        end.setTime(endTime);

        if (date.after(begin) && date.before(end)) {
            return true;
        } else {
            return false;
        }
    }
    
    
    /**
     * 判断当前时间是在开始时间之后
     * @param nowTime
     * @param beginTime
     * @param endTime
     * @return
     */
    public static boolean CompareCalendar(Date nowTime, Date beginTime) {
        Calendar date = Calendar.getInstance();
        date.setTime(nowTime);
        Calendar begin = Calendar.getInstance();
        begin.setTime(beginTime);
        if (date.after(begin)) {
            return true;
        } else {
            return false;
        }
    }
}
