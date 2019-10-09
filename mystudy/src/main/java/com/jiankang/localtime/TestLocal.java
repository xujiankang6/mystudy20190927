package com.jiankang.localtime;

/*
 *@create by jiankang
 *@date 2019/10/8 time 11:22
 */

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestLocal {

    public static Long convertTimeToLong(Date time) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(time);
        DateTimeFormatter ftf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse(dateString, ftf);
        return LocalDateTime.from(parse).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public static void main(String[] args) {


//拿到中国的本周一
        ZoneId zone = ZoneId.of("UTC+8");
        LocalDateTime defaultTime = LocalDateTime.of(LocalDate.now(), LocalTime.of(0, 0, 0, 0));
        Instant instant = defaultTime.toInstant(ZoneOffset.of("+8"));
        LocalDateTime dateTime = LocalDateTime.ofInstant(instant, zone);
        LocalDateTime monday = dateTime.with(DayOfWeek.SUNDAY);
        long mondayTimestamp = monday.atZone(zone).toInstant().toEpochMilli();
        System.out.println(mondayTimestamp);


        //获取当前日期所在月的第一个周一
//        LocalDate now = LocalDate.of(2019,10,6);
//        System.out.println("the first monday of this month:"+now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));

       /* LocalDate now = LocalDate.now();
        LocalDate currentSunday=now.with(DayOfWeek.SUNDAY);
        LocalDate currentMoney = now.with(DayOfWeek.MONDAY);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime currentMoneyTime = LocalDateTime.parse(currentMoney.toString()+ " 00:00:00",df);
        LocalDateTime currentSundayTime = LocalDateTime.parse(currentSunday.toString()+ " 23:59:59",df);
        Long currentMoneyTimestamp = currentMoneyTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        Long currentSundayTimestamp = currentSundayTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();*/


        //获取当天的起始时间戳
      /* LocalDate today = LocalDate.now();
        ZoneId zone = ZoneId.of("UTC+8");
        LocalDateTime mixTime1 = LocalDateTime.parse("2019-10-07"+ " 00:00:00",df);
        Instant instant = Instant.ofEpochMilli(mixTime1.toInstant(ZoneOffset.of("+8")).toEpochMilli());
        Long today_start = LocalDateTime.ofInstant(instant, zone).toLocalDate().atTime(0, 0).toInstant(ZoneOffset.of("+8")).toEpochMilli();
        Long today_end =  LocalDateTime.ofInstant(instant, zone).toLocalDate().atTime(0, 0).plusDays(7).toInstant(ZoneOffset.of("+8")).toEpochMilli();
        System.out.println(today_start);
        System.out.println(today_end);*/






      /*  System.out.println(money);
        TemporalField fieldISO = WeekFields.of(Locale.CHINESE).dayOfWeek();
        System.out.println(fieldISO.range());
        System.out.println(fieldISO.toString());
        System.out.println(now1.with(fieldISO,1));

        LocalDate localDate1 = LocalDate.now();
        WeekFields weekFields = WeekFields.of(DayOfWeek.MONDAY,4);
        System.out.println(localDate1.get(weekFields.weekOfWeekBasedYear()));*/


        //格式化
       /* LocalDate date = LocalDate.now();
        System.out.println("Default format of LocalDate="+date);
        System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu ")));
        System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Default format of LocalDateTime = "+dateTime);
        System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));

        Instant timestamp = Instant.now();
        System.out.println("Default format of Instant = "+timestamp);
        LocalDateTime dt = LocalDateTime.parse("27::五月::2014 21::39::48",DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss"));
        System.out.println("default format after parsing ="+dt);
        */


        //系统时间
        /*Instant timestamp = Instant.now();
        System.out.println("Default format of Instant = "+timestamp);*/


        //DateTool
        /*LocalDate today = LocalDate.now();
        System.out.println("Year:"+today.getYear() + " is Leap Year:"+today.isLeapYear());
        System.out.println("Today is before 01/01/2015?"+today.isBefore(LocalDate.of(2015,1,1)));
        System.out.println("Current Time:"+today.atTime(LocalTime.now()));
        System.out.println("10 days after today will be "+today.plusDays(10));
        System.out.println("3 weeks after today will be "+today.plusWeeks(3));
        System.out.println("20 months before today will be "+today.minusMonths(20));
        System.out.println("First days of this month="+today.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println("Last days of this month="+today.with(TemporalAdjusters.lastDayOfMonth()));
        LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
        System.out.println("last day of this year="+lastDayOfYear);
        Period period = today.until(lastDayOfYear);
        System.out.println("Period Format = "+period);
        System.out.println("Months remaining in the year="+period.getMonths());*/

        //Instant
        /*Instant timestamp = Instant.now();
        System.out.println("Current Timestamp = "+timestamp);
        Instant specificTime = Instant.ofEpochMilli(timestamp.toEpochMilli());
        System.out.println("Specific Time ="+specificTime);
        Duration thirtyDay = Duration.ofDays(30);
        System.out.println(thirtyDay);*/


        //LocalDateTime
        /*LocalDateTime today = LocalDateTime.now();
        System.out.println(today);
        System.out.println(LocalDateTime.of(LocalDate.now(),LocalTime.now()));
        LocalDateTime specificDate = LocalDateTime.of(2014, Month.JANUARY, 1, 10, 10, 30,30);
        System.out.println(specificDate);
        LocalDateTime todayKolkata = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Date in IST="+todayKolkata);
        LocalDateTime dateFromBase = LocalDateTime.ofEpochSecond(0, 0, ZoneOffset.UTC);
        System.out.println("10000th second time from 01/01/1970= " + dateFromBase);*/

        //LocalDate
      /*  LocalDate today = LocalDate.now();
        System.out.println("LocalDate.now():"+today);
        LocalDate firstDay_2014 =LocalDate.of(2014, Month.JANUARY,1);
        System.out.println("Specific Date="+firstDay_2014);
        LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Date in IST="+todayKolkata);
        LocalDate dateFromBase = LocalDate.ofEpochDay(365);
        System.out.println("365th day from base date="+dateFromBase);
        LocalDate hundredDay2014 = LocalDate.ofYearDay(2014,100);
        System.out.println("100th day of 2014="+hundredDay2014);*/

        //LocalTime
        /*LocalTime time = LocalTime.now();
        System.out.println("LocalTime.now():"+time);
        LocalTime specificTime = LocalTime.of(12,20,25,40);
        System.out.println("Specific Time of Day="+specificTime);
        ZoneId zoneId=ZoneId.systemDefault();
        System.out.println(zoneId);*/
    }

}
