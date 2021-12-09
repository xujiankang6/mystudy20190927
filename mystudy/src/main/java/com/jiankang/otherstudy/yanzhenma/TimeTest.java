package com.jiankang.otherstudy.yanzhenma;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * TimeTest
 *
 * @author jiankang.xu
 * @date 2021/12/9
 */
public class TimeTest {

    public static void main(String[] args) {


        Duration duration = Duration.between(LocalDateTime.now().minusMonths(2),LocalDateTime.now());
        int l = (int) (duration.toDays()/7);
        List<WeekDay> weekDays = getWeekDays(l);
        for (WeekDay weekDay : weekDays) {
            System.out.println(weekDay.toString());
        }

    }

    public static List<WeekDay> getWeekDays(int size){
        List list =new ArrayList();
        for (int i = 0; i <= size ; i++) {
            LocalDateTime monday = LocalDateTime.of(LocalDate.now(), LocalTime.MIN).minusWeeks(i).with(DayOfWeek.MONDAY);
            LocalDateTime sunday = LocalDateTime.of(LocalDate.now(), LocalTime.MAX).minusWeeks(i).with(DayOfWeek.SUNDAY);
            String mondayStr =monday.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            String sundayStr = sunday.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            list.add(new WeekDay(mondayStr,sundayStr));
        }
        return list;
    }


    static class WeekDay{
        private String monday;
        private String sunday;

        public WeekDay(String monday, String sunday) {
            this.monday = monday;
            this.sunday = sunday;
        }

        public String getMonday() {
            return monday;
        }

        public void setMonday(String monday) {
            this.monday = monday;
        }

        public String getSunday() {
            return sunday;
        }

        public void setSunday(String sunday) {
            this.sunday = sunday;
        }

        @Override
        public String toString() {
            return "WeekDay{" +
                    "monday='" + monday + '\'' +
                    ", sunday='" + sunday + '\'' +
                    '}';
        }
    }







}
