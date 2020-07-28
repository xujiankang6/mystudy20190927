package com.jiankang.javacoretechnologythetenversion.dchapter10.v5;

/*
 *@create by jiankang
 *@date 2020/7/27 time 20:23
 */

public class Person {

    @Deprecated
    @MyAnnotation
    public void empty() {
        System.out.println("\nempty");
    }

    @MyAnnotation(value = {"girl","boy"})
    public void somebody(String name, int age) {
        System.out.println("\nsomebody:" + name + ", " + age);
    }

}
