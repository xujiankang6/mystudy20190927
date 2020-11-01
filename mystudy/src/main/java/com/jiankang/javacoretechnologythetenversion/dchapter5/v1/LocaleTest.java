package com.jiankang.javacoretechnologythetenversion.dchapter5.v1;

/*
 *@create by jiankang
 *@date 2020/7/12 time 16:34
 */

import java.util.Locale;
import java.util.Properties;

public class LocaleTest {
    public static void main(String[] args) {


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
