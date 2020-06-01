package com.jiankang.javaprogramminglogic.chapter24.v1;

/*
 *@create by jiankang
 *@date 2020/5/23 time 12:46
 */

public class CLInitDemo {
    public static class Hello{
        static {
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        try {
           String className =  CLInitDemo.class.getName()+ "$Hello";
            Class<?> aClass = cl.loadClass(className);
//            Class<?> aClass1 = Class.forName(className);
        } catch (Exception e) {

        }

    }
}
