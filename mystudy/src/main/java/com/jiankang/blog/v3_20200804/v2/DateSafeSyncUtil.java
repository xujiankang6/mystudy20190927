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
public class DateSafeSyncUtil {
    final static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String formatDate(Date date) throws Exception {
        synchronized (sdf) {
            return sdf.format(date);
        }
    }


    public static Date parse(String strDate) throws Exception {
        synchronized (sdf) {
            return sdf.parse(strDate);
        }
    }
}
