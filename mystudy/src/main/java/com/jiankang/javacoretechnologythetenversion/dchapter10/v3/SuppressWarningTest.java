package com.jiankang.javacoretechnologythetenversion.dchapter10.v3;

/*
 *@create by jiankang
 *@date 2020/7/27 time 20:14
 */

import java.util.Date;

public class SuppressWarningTest {

    @SuppressWarnings(value = {"deprecation"})
    public static void doSomething(){
        Date date = new Date(113,8,25);
        System.out.println(date.getYear());
    }

    public static void main(String[] args) {
        doSomething();
    }
}
