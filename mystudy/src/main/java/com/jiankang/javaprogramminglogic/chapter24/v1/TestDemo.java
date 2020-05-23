package com.jiankang.javaprogramminglogic.chapter24.v1;

/*
 *@create by jiankang
 *@date 2020/5/23 time 12:09
 */

public class TestDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        Class<?> actualLoader = cl.loadClass("java.util.ArrayList");
        Class<?> actualLoader1 = cl.loadClass("java.util.ArrayList");
        Class<?> actualLoader2 = cl.loadClass("java.util.ArrayList");
        Class<?> actualLoader3 = cl.loadClass("java.util.ArrayList");
        System.out.println(actualLoader);
        System.out.println(actualLoader1);
        System.out.println(actualLoader2);
        System.out.println(actualLoader3);

    }
}
