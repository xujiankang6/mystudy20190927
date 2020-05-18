package com.jiankang.javaprogramminglogic.chapter19.v4;

/*
 *@create by jiankang
 *@date 2020/5/16 time 19:07
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalDateFormat {
    static ThreadLocal<DateFormat> sdf = new ThreadLocal<DateFormat>() {
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };

    public static String date2String(Date date) {
        return sdf.get().format(date);
    }


    public static Date string2Date(String str) throws ParseException {
        return sdf.get().parse(str);
    }

    public static void main(String[] args) throws ParseException {
        String string = ThreadLocalDateFormat.date2String(new Date());
        System.out.println(string);
        System.out.println(ThreadLocalDateFormat.string2Date("2020-05-16 19:11:46"));

        ThreadLocalRandom current = ThreadLocalRandom.current();
        System.out.println(current.nextInt());
    }

}
