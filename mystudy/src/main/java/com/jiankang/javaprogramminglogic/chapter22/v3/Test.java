package com.jiankang.javaprogramminglogic.chapter22.v3;

/*
 *@create by jiankang
 *@date 2020/5/19 time 14:55
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test {

    public static void main(String[] args) throws ParseException, IllegalAccessException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Student zhangsna = new Student("张三", sdf.parse("1900-12-12"), 80.9d);
        System.out.println(zhangsna);
        System.out.println(SimpleFormatter.format(zhangsna));
    }
}
