package com.jiankang.javaprogramminglogic.chapter10.v8;

/*
 *@create by jiankang
 *@date 2020/4/12 time 18:09
 */

import java.util.EnumSet;

public class Test {
    public static void main(String[] args) {
        //不可以之间new EnumSet
//        EnumSet<Size> sizes = new EnumSet<Size>();

        EnumSet<Day> days = EnumSet.noneOf(Day.class);
        days.add(Day.MONDAY);
        days.add(Day.THURSDAY);
        System.out.println(days);


    }
}
