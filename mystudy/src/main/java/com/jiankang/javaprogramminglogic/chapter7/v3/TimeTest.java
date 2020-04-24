package com.jiankang.javaprogramminglogic.chapter7.v3;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Locale;
import java.util.TimeZone;

/**
 * TimeTest
 *
 * @author jiankang.xu
 * @date 2020/3/22
 */
public class TimeTest {

    public static void main(String[] args) {
        //1、默认时区
        TimeZone timeZone = TimeZone.getDefault();
        System.out.println(timeZone.toZoneId());
        System.out.println(timeZone.getID());

        //2、获取系统时区
        System.out.println(System.getProperty("user.timezone"));

        //3、获得美国东部时间
        TimeZone timeZone1 = TimeZone.getTimeZone("US/Eastern");
        System.out.println(timeZone1.toZoneId());

        //获取国家和语言
        Locale locale = Locale.getDefault();
        System.out.println(locale);


        long timeStamp = LocalDateTime.now().toInstant(ZoneOffset.of("+08:00")).toEpochMilli();
        System.out.println(timeStamp);
    }
}
