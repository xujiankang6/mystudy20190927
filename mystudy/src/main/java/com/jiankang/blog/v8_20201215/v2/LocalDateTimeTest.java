package com.jiankang.blog.v8_20201215.v2;

/*
 *@create by jiankang
 *@date 2020/12/16 @time 19:29
 */

import java.time.LocalDateTime;
import java.time.Month;

/**
 * CHANGE ACTIVITY:
 * <p>
 * Reason      Version    Date        User        Description
 * ------------ ---------- ----------- ----------- -------------------
 * crm-7506        1.0       2020/12/16   jiankang    is_active状态更新
 * <p>
 * END CHANGE ACTIVITY
 */


public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(LocalDateTime.of(2014, Month.FEBRUARY, 20, 6, 30));
        System.out.println(LocalDateTime.parse("2015-12-12T04:30:00"));
        System.out.println(now.plusDays(1));
        System.out.println(now.getMonth());
        System.out.println(now.getMonthValue());


    }
}
