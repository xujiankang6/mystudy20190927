package com.jiankang.improvejava151suggests.chapter10.v3;

/*
 *@create by jiankang
 *@date 2020/11/9 time 13:30
 */

import org.joda.time.DateTime;
import org.joda.time.MutableDateTime;

public class Client {
    public static void main(String[] args) {

        //可变时间类
        MutableDateTime mdt = new MutableDateTime();
        DateTime dt = new DateTime();
        DateTime destDateTime = dt.plusYears(10);
        while (mdt.isBefore(destDateTime)) {
            mdt.addDays(1);
            if (mdt.getDayOfMonth() == 13 && mdt.getDayOfWeek() == 5) {
                //打印出10年内所有的黑色星期五
                System.out.println("黑色星期五：" + mdt);
            }
        }

    }
}
