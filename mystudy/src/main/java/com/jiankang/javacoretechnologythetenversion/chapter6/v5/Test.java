package com.jiankang.javacoretechnologythetenversion.chapter6.v5;

/*
 *@create by jiankang
 *@date 2020/6/9 time 21:00
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        new ArrayList<String>() {{add("Herry"); add("Tony");}}.forEach(e->{
            System.out.println(e);
        });


        ArrayList<String> strings = new ArrayList<String>() {{

        }};
        String a = Arrays.toString(strings.toArray());
        System.out.println(a);


        //获取外部类
        Class<?> enclosingClass = new Object() {
        }.getClass().getEnclosingClass();
        System.out.println(enclosingClass.getName());
    }
}
