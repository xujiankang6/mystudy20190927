package com.jiankang.blog.v8_20201215.v2;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;


public class Test {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020,1,8);
        LocalDate date1 = LocalDate.of(2020, Month.JANUARY,8);
        System.out.println(date1);
        System.out.println(date1.toEpochDay());
        LocalDate date2 = LocalDate.ofEpochDay(18269);
        LocalDate date3 = LocalDate.ofYearDay(2020,8);
        System.out.println(date3);

        //创建localDate by parsing a string
         LocalDate parse = LocalDate.parse("2020-01-08");
        System.out.println(parse);

        LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println(previousMonthSameDay);

        final DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        System.out.println(dayOfWeek);
        //是否是闰年
        System.out.println(LocalDate.now().isLeapYear());
        //判断两个时间的前后
        System.out.println(LocalDate.now().isBefore(LocalDate.now().plusDays(1)));


        //当天开始
        LocalDateTime beginningOfDay = LocalDate.now().atStartOfDay();
        System.out.println(beginningOfDay);

        //当天对应月份的第一天
        System.out.println(LocalDate.now().with(TemporalAdjusters.firstDayOfMonth()));



    }

}
