package com.jiankang.blog.v8_20201215.v2;

/*
 *@create by jiankang
 *@date 2020/12/17 @time 16:17
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * CHANGE ACTIVITY:
 * <p>
 * Reason      Version    Date        User        Description
 * ------------ ---------- ----------- ----------- -------------------
 * crm-7506        1.0       2020/12/17   jiankang    is_active状态更新
 * <p>
 * END CHANGE ACTIVITY
 */


public class FormattingTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        String format = now.format(DateTimeFormatter.ISO_DATE);
        System.out.println(format);
        String format2 = now.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(format2);

//       2020-12-17 16:26:09
        System.out.println(now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.CHINA)));
        //2020年12月17日 下午04时26分39秒
        System.out.println(now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withLocale(Locale.CHINA)));
//        20-12-17 下午4:26
        System.out.println(now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(Locale.CHINA)));

    }
}
