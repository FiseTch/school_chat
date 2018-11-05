package com.tong.school_chat.Controller;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.format.ISODateTimeFormat;

import java.util.Date;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/11/5 10:08
 */
public class TestJoda {
    public static void main(String[] args) {
        
        
    
    
        DateTime dateTime = DateTime.now();
        System.out.println(dateTime.toString("MM/dd/yyyy hh:mm:ss.SSSa"));
        System.out.println(dateTime.toString("dd-MM-yyyy HH:mm:ss"));
        System.out.println(dateTime.toString("EEEE dd MMMM, yyyy HH:mm:ssa"));
        System.out.println(dateTime.toString("MM/dd/yyyy HH:mm ZZZZ"));
        System.out.println(dateTime.toString("MM/dd/yyyy HH:mm Z"));
        System.out.println(dateTime.toString("yyyy-MM-dd HH:mm:ss"));
    
        System.out.println(dateTime.toString(ISODateTimeFormat.basicDateTime()));
        System.out.println(dateTime.toString(ISODateTimeFormat.basicDateTimeNoMillis()));
        System.out.println(dateTime.toString(ISODateTimeFormat.basicOrdinalDateTime()));
        System.out.println(dateTime.toString(ISODateTimeFormat.basicWeekDateTime()));
    }
}
