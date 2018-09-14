package com.tong.school_chat.util;

import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/9/14 13:57
 */
@Slf4j
public class CommonUtil {
    /**
     * @param str
     * @param len
     * @return
     * @user: tongchaohua
     * @Title: valueOfString
     * @Description: 给字符串加0
     * @return: String
     */
    private static String valueOfString(String str, int len) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < len - str.length(); i++) {
            sb.append("0");
        }
        return (sb.length() == 0) ? (str) : (sb.toString() + str);
    }
    
    /**
     * @param date
     * @param format 时间格式
     * @return
     * @user: tongchaohua
     * @Title: formatDate
     * @Description: 对日期进行格式化
     * @return: String
     */
    public static String formatDate(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return (sdf.format(date) == null) ? null : sdf.format(date);
    }
    
    /**
     * @param calendar
     * @return
     * @user: tongchaohua
     * @Title: getTimeString
     * @Description: 将时间化为字母
     * @return: String
     */
    private static String getTimeString(Calendar calendar) {
        log.info("当前调用方法" + Thread.currentThread().getStackTrace()[1].getMethodName());
        StringBuffer sb = new StringBuffer();
        sb.append(String.valueOf(calendar.get(Calendar.YEAR)))
                .append(valueOfString(String.valueOf(calendar.get(Calendar.MONTH) + 1), 2))
                .append(valueOfString(String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)), 2))
                .append(valueOfString(String.valueOf(calendar.get(Calendar.HOUR_OF_DAY)), 2))
                .append(valueOfString(String.valueOf(calendar.get(Calendar.MINUTE)), 2))
                .append(valueOfString(String.valueOf(calendar.get(Calendar.SECOND)), 2))
                .append(valueOfString(String.valueOf(calendar.get(Calendar.MILLISECOND)), 3));
        return sb.toString();
    }
    
    /**
     * @return
     * @user: tongchaohua
     * @Title: getTimeString
     * @Description: 通过时间生成唯一Id
     * 如果不传参，则获取当前默认格式的时间，并将其转换成一串字符串输出
     * @return: String
     */
    public static String getTimeString() {
        log.info("当前调用方法" + Thread.currentThread().getStackTrace()[1].getMethodName());
        Calendar calendar = new GregorianCalendar();
        return getTimeString(calendar);
    }
    
}
