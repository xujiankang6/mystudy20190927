package com.jiankang.blog.v3_20200804.v2;

/*
 *@create by jiankang
 *@date 2020/8/4 time 9:57
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 使用ThreadLocal，就是将共享变量变为独享，线程独享在并发环境中能减少不少创建对象的开销，对性能要求比较高，一般采用这种方法
 */
public class ThreadLocalDateUtil {
    private static final String date_format = "yyyy-MM-dd HH:mm:ss";
    private static ThreadLocal<DateFormat> threadLocal = new ThreadLocal<DateFormat>();

    public static DateFormat getDateFormat() {
        DateFormat df = threadLocal.get();
        if (df == null) {
            df = new SimpleDateFormat(date_format);
        }
        return df;
    }

    public static Date parse(String dateStr) throws ParseException {
        return getDateFormat().parse(dateStr);
    }

    public static String format(Date date) {
        return getDateFormat().format(date);
    }
}
