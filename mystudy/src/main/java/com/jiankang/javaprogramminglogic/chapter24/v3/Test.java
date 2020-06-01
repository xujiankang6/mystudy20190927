package com.jiankang.javaprogramminglogic.chapter24.v3;

/*
 *@create by jiankang
 *@date 2020/5/23 time 15:20
 */

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        MyClassLoader cl1 = new MyClassLoader();
        String className = "com.jiankang.javaprogramminglogic.chapter24.v3.v1.HelloService";
        Class<?> aClass1 = cl1.loadClass(className);
        MyClassLoader myClassLoader = new MyClassLoader();
        Class<?> aClass = myClassLoader.loadClass(className);
        if (aClass != aClass1) {
            System.out.println("aaa ");
        }


    }
}
