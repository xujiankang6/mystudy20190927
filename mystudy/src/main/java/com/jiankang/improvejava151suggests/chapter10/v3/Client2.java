package com.jiankang.improvejava151suggests.chapter10.v3;

/*
 *@create by jiankang
 *@date 2020/11/9 time 14:57
 */

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import java.util.Date;

public class Client2 {
    public static void main(String[] args) {
        DateTime dt = new DateTime();
        dt.withZone(DateTimeZone.forID("Europe/London"));
        dt.withZone(DateTimeZone.UTC);
        System.out.println(dt.getDayOfMonth());
        //joda的date转为jdk的DateTime
         Date jdkDate = dt.toDate();
         //jdk的date转换为joda的date
          dt = new DateTime(jdkDate);
    }
}
