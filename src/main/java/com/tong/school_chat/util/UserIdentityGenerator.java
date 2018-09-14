package com.tong.school_chat.util;

import lombok.extern.slf4j.Slf4j;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/9/14 13:54
 */
@Slf4j
public class UserIdentityGenerator {
    
    /**
     * 返回一个20位的用户唯一标识
     *
     * @return
     */
    public static String getUserIdentity() {
        log.info("当前调用方法" + Thread.currentThread().getStackTrace()[1].getMethodName());
        Calendar calendar = new GregorianCalendar();
        StringBuilder sb = new StringBuilder();
        int i = (int) (((Math.random() * 9) + 1) * 100000);
        System.out.println(i);
        sb.append("Tong").append(String.valueOf(calendar.get(Calendar.YEAR)))
                .append(valueOfString(String.valueOf(calendar.get(Calendar.MONTH) + 1), 2))
                .append(valueOfString(String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)), 2))
                .append(i);
        return sb.toString();
    }
    
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
        log.info("当前调用方法" + Thread.currentThread().getStackTrace()[1].getMethodName());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < len - str.length(); i++) {
            sb.append("0");
        }
        return (sb.length() == 0) ? (str) : (sb.toString() + str);
    }
    
    public static void main(String[] args) {
        System.out.println(UserIdentityGenerator.getUserIdentity());
    }
}
