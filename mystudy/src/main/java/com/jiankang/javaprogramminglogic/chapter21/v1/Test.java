package com.jiankang.javaprogramminglogic.chapter21.v1;

/*
 *@create by jiankang
 *@date 2020/5/17 time 18:59
 */

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
        Class<Integer> integerClass = Integer.class;
        try {
            Method parseInt = integerClass.getMethod("parseInt", String.class);
            System.out.println(parseInt.invoke("aa","123"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
