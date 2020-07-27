package com.jiankang.javacoretechnologythetenversion.dchapter5.v1;

/*
 *@create by jiankang
 *@date 2020/7/12 time 16:34
 */

import java.util.Locale;
import java.util.Properties;

public class Test {
    public static void main(String[] args) {
//        final Locale[] availableLocales = DateFormat.getAvailableLocales();
//        for (Locale availableLocale : availableLocales) {
//            System.out.println(availableLocale.getDisplayName());
//        }

        final Locale locale = new Locale("de","CH");
        System.out.println(locale.getDisplayName(Locale.GERMAN));
        Properties p =System.getProperties();
        final String property = p.getProperty("user.language");
        System.out.println(property);

        final String tag = locale.toLanguageTag();
        System.out.println(tag);
        final Locale aDefault = Locale.getDefault();
        System.out.println(aDefault.getCountry());
    }
}
