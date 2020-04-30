package com.jiankang.javaprogramminglogic.chapter5.v1;

/*
 *@create by jiankang
 *@date 2020/4/29 time 14:58
 */

public class Test {

    public static void main(String[] args) {
        Outer.StaticInner si = new Outer.StaticInner();
        si.innerMethod();
    }
}
