package com.jiankang.javacoretechnologythetenversion.chapter4.v1;

/*
 *@create by jiankang
 *@date 2020/5/28 time 14:06
 */

import java.time.DayOfWeek;
import java.time.LocalDate;

//获取当月的日历表
public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();


        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 0; i < value; i++) {
            System.out.print("   ");

        }

        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }
    }
}
