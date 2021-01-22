package com.jiankang.blog.v8_20201215.v2;

/*
 *@create by jiankang
 *@date 2020/12/16 @time 20:26
 */

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * CHANGE ACTIVITY:
 * <p>
 * Reason      Version    Date        User        Description
 * ------------ ---------- ----------- ----------- -------------------
 * crm-7506        1.0       2020/12/16   jiankang    is_active状态更新
 * <p>
 * END CHANGE ACTIVITY
 */


public class ZonedDateTimeTest {
    public static void main(String[] args) {
        System.out.println(ZoneId.getAvailableZoneIds());
        ZoneId zoneId = ZoneId.of("Europe/Paris");

        LocalDateTime localDateTime = LocalDateTime.now();
        ZoneId zone = ZoneId.of("UTC+8");

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime,zone);
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println(zonedDateTime.toInstant().toEpochMilli());
        System.out.println(zonedDateTime.toString());
    }
}
