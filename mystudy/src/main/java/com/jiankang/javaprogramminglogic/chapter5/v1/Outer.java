package com.jiankang.javaprogramminglogic.chapter5.v1;

/*
 *@create by jiankang
 *@date 2020/4/29 time 14:54
 */

public class Outer {
    private static int shared = 100;

    public static class StaticInner {
        public void innerMethod() {
            System.out.println("inner: " + shared);
        }
    }

    public void test() {
        StaticInner staticInner = new StaticInner();
        staticInner.innerMethod();
    }
}
