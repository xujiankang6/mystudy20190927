package com.jiankang.javaprogramminglogic.chapter3.v2;

/*
 *@create by jiankang
 *@date 2020/4/23 time 10:49
 */

public class Test {
    public static void main(String[] args) {
        Child c = new Child();
        Base b = c;
        System.out.println(b.s);
        System.out.println(b.m);
        b.staticTest();
        System.out.println(c.m);
        System.out.println(c.s);
        c.staticTest();
    }
}
