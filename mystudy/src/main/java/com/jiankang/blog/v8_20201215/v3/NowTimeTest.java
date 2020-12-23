package com.jiankang.blog.v8_20201215.v3;

/*
 *@create by jiankang
 *@date 2020/12/17 @time 18:54
 */

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * CHANGE ACTIVITY:
 * <p>
 * Reason      Version    Date        User        Description
 * ------------ ---------- ----------- ----------- -------------------
 * crm-7506        1.0       2020/12/17   jiankang    is_active状态更新
 * <p>
 * END CHANGE ACTIVITY
 */


public class NowTimeTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        Instant instant = Instant.now();
        long timeStampMillis = instant.toEpochMilli();
        System.out.println(timeStampMillis);

        Instant now1 = Instant.now();
        ZoneId asiaSomgapore = ZoneId.of("Asia/Singapore");
        final ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(now1, asiaSomgapore);
        System.out.println(zonedDateTime);

    }
}
