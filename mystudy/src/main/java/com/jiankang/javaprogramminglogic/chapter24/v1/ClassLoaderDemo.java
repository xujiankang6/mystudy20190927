package com.jiankang.javaprogramminglogic.chapter24.v1;

/*
 *@create by jiankang
 *@date 2020/5/23 time 12:03
 */

public class ClassLoaderDemo {
    public static void main(String[] args) {
        ClassLoader cl = ClassLoaderDemo.class.getClassLoader();
        while (cl != null){
            System.out.println(cl.getClass().getName());
             cl = cl.getParent();
        }
        System.out.println(String.class.getClassLoader());

        //获取默认的系统类加载器
        System.out.println(ClassLoader.getSystemClassLoader());



    }
}
