package com.jiankang.javacoretechnologythetenversion.chapter5.v4;

/*
 *@create by jiankang
 *@date 2020/6/1 time 20:19
 */

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        Class<? extends Random> aClass = random.getClass();
        System.out.println(aClass.getName());
        try {
            Class<?> aClass1 = Class.forName("java.util.Random1");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(aClass.getName());


    }
}
