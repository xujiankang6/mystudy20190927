package com.jiankang.javacoretechnologythetenversion.chapter9.v6;

/*
 *@create by jiankang
 *@date 2020/6/21 time 19:35
 */

import java.util.EnumMap;
import java.util.EnumSet;

public class Test {
    public static void main(String[] args) {
        EnumSet<Weekday> always = EnumSet.allOf(Weekday.class);
        EnumSet<Weekday> never = EnumSet.noneOf(Weekday.class);
        EnumSet<Weekday> range = EnumSet.range(Weekday.WENDSDAY, Weekday.SUNDAY);
        EnumMap<Weekday, Object> personInCharge = new EnumMap<>(Weekday.class);
        o

    }
}
