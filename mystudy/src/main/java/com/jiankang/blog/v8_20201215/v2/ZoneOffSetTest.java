package com.jiankang.blog.v8_20201215.v2;

/*
 *@create by jiankang
 *@date 2020/12/17 @time 11:40
 */

import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 * CHANGE ACTIVITY:
 * <p>
 * Reason      Version    Date        User        Description
 * ------------ ---------- ----------- ----------- -------------------
 * crm-7506        1.0       2020/12/17   jiankang    is_active状态更新
 * <p>
 * END CHANGE ACTIVITY
 */


public class ZoneOffSetTest {
    public static void main(String[] args) {
        ZoneOffset offset = ZoneOffset.of("+02:00");
        LocalDateTime now = LocalDateTime.now();
        OffsetDateTime offSetByTwo = OffsetDateTime.of(now, offset);
        System.out.println(now);
        System.out.println(offSetByTwo);


        LocalDate initialDate = LocalDate.parse("2007-05-10");
        LocalDate finalDate = initialDate.plus(Period.ofDays(5));

        int five = Period.between(initialDate, finalDate).getDays();
        System.out.println(five);
        long five2 = ChronoUnit.DAYS.between(initialDate, finalDate);
        System.out.println(five2);


        LocalTime initialTime = LocalTime.of(3,0,0);
        final LocalTime finalTime = initialTime.plusMinutes(30);
        System.out.println(Duration.between(initialTime, finalTime).getSeconds());
        final long between = ChronoUnit.MINUTES.between(initialTime, finalTime);
        System.out.println(between);
    }
}
