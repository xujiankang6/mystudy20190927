package com.jiankang.blog.v8_20201215.v2;

/*
 *@create by jiankang
 *@date 2020/12/16 @time 18:41
 */

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * CHANGE ACTIVITY:
 * <p>
 * Reason      Version    Date        User        Description
 * ------------ ---------- ----------- ----------- -------------------
 * crm-7506        1.0       2020/12/16   jiankang    is_active状态更新
 * <p>
 * END CHANGE ACTIVITY
 */


public class LocalTimeTest {
    public static void main(String[] args) {
        //获取当前时间
        System.out.println(LocalTime.now());
        System.out.println(LocalTime.parse("06:30"));
        System.out.println(LocalTime.of(6,30));
        System.out.println(LocalTime.now().plus(1, ChronoUnit.HOURS));
        System.out.println(LocalTime.MIN);


    }
}
