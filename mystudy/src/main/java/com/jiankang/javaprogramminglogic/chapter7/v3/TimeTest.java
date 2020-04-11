package com.jiankang.javaprogramminglogic.chapter7.v3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;
import java.util.TimeZone;

import static java.time.ZoneOffset.systemDefault;

/**
 * TimeTest
 *
 * @author jiankang.xu
 * @date 2020/3/22
 */
public class TimeTest {

    public static void main(String[] args) {
        //1、默认时区
        TimeZone timeZone = TimeZone.getDefault();
        System.out.println(timeZone.toZoneId());
        System.out.println(timeZone.getID());

        //2、获取系统时区
        System.out.println(System.getProperty("user.timezone"));

        //3、获得美国东部时间
        TimeZone timeZone1 = TimeZone.getTimeZone("US/Eastern");
        System.out.println(timeZone1.toZoneId());

        //4.获取国家和语言
        Locale locale = Locale.getDefault();
        System.out.println(locale);
        //5、获取当前时刻
        Instant now1 = Instant.now();
        System.out.println(now1);
        Instant now2 = Instant.ofEpochMilli(System.currentTimeMillis());
        System.out.println(now2);

        //6、获取与时间无关的日期时间
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZoneId zoneId = systemDefault();
        System.out.println(zoneId);
        Instant instant = now.toInstant(ZoneOffset.of("+08:00"));
        System.out.println(instant);
        long l = instant.toEpochMilli();
        System.out.println(l);
        long localDateTime1 = LocalDateTime.now().toEpochSecond(ZoneOffset.of("+08:00"));
        System.out.println(localDateTime1);

        //7、获取与时区有关的日期时间：法1：
        ZonedDateTime now5 = LocalDateTime.now().atZone(ZoneId.of("+08:00"));
        System.out.println(now5);
        System.out.println(now5.toInstant().toEpochMilli());

        // 法2、
        ZonedDateTime localDateTime = ZonedDateTime.of(LocalDate.now(), LocalTime.now(),
                ZoneOffset.of("+08:00"));
        System.out.println(localDateTime.toInstant().toEpochMilli());
        //法3：
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(LocalDateTime.now()
                .toInstant(ZoneOffset.of("+08:00")),zoneId);
        System.out.println(zonedDateTime.toInstant().toEpochMilli());


        // 8、 格式化日期,字符串转日期
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(
                "yyyy/MM/dd HH:mm:ss", new Locale("zh"));
        String format = now.format(dateTimeFormatter);
        System.out.println(format);

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern(
                "yyyy/MM/dd HH:mm:ss");
        String format1 = now.format(dateTimeFormatter1);
        System.out.println(format1);
        LocalDateTime parse = LocalDateTime.parse(format,dateTimeFormatter);
        System.out.println(parse);


        //9、修改日期

        LocalDateTime localDateTime2 = LocalDateTime.now()
                .withDayOfMonth(1).withHour(0).withMinute(0)
                .withSecond(0).withNano(0);
        System.out.println(localDateTime2);

        //10 、获取当天0点
        LocalDateTime localDateTime3 = LocalDate.now().atTime(0, 0);
        System.out.println(localDateTime3);
        LocalDateTime of = LocalDateTime.of(LocalDate.now(), LocalTime.MIN);
        System.out.println(of);
        LocalDateTime with = LocalDateTime.now().with(ChronoField.MILLI_OF_DAY, 0);
        System.out.println(with);

        //11、下周二上午十点整
        LocalDateTime localDateTime4 = LocalDateTime.now().plusWeeks(1).with(ChronoField.DAY_OF_WEEK, 2)
                .with(ChronoField.MILLI_OF_DAY, 0).withHour(10);
        System.out.println(localDateTime4);

        //12 下一个周二上午10点整
        LocalDate now3 = LocalDate.now();
        if(!now3.getDayOfWeek().equals(DayOfWeek.MONDAY)){
            now3  = now3.plusWeeks(1);
        }
        LocalDateTime localDateTime5 = now3.with(ChronoField.DAY_OF_WEEK, 2).atTime(10, 0);
        System.out.println(localDateTime5);

    }
}
