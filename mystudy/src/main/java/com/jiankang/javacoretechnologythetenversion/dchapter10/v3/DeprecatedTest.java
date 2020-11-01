package com.jiankang.javacoretechnologythetenversion.dchapter10.v3;

/*
 *@create by jiankang
 *@date 2020/7/27 time 19:39
 */

import java.util.Calendar;
import java.util.Date;

public class DeprecatedTest {

    @Deprecated
    private static void getString1(){
        System.out.println("Deprecated Method");
    }

    private static void getString2(){
        System.out.println("Normal Method ");
    }

    private static void testDate(){
        Date date = new Date(113,8,25);
        System.out.println(date.getYear());
    }

    private static void testCalendar(){
        final Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
    }

    public static void main(String[] args) {
        getString1();
        getString2();
        testDate();
        testCalendar();
    }

}
