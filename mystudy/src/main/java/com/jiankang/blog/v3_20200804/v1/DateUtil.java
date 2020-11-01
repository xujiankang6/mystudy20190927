package com.jiankang.blog.v3_20200804.v1;

/*
 *@create by jiankang
 *@date 2020/8/4 time 9:31
 */

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 线程不安全
 */
public class DateUtil {

    final static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static String formatDate(Date date) throws Exception {

        return sdf.format(date);
    }


    public static Date parse(String strDate) throws Exception {
        return sdf.parse(strDate);
    }
}
