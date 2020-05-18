package com.jiankang.javaprogramminglogic.chapter19.v3;

/*
 *@create by jiankang
 *@date 2020/5/16 time 17:13
 */

public class Test {
    public static void main(String[] args) {
        ThreadLocal<Object> objectThreadLocal = new ThreadLocal<>();
        objectThreadLocal.set(100);
        System.out.println(objectThreadLocal.get());
    }
}
