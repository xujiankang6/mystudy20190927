package com.jiankang.blog.v3_20200804.v2;

/*
 *@create by jiankang
 *@date 2020/8/4 time 9:47
 */

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将线程不安全的对象由共享变为局部私有，避免多线程问题
 */
public class DateSafeUtil {


    public static String formatDate(Date date) throws Exception {
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }


    public static Date parse(String strDate) throws Exception {
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.parse(strDate);
    }
}
