package com.jiankang.javaprogramminglogic.chapter5.v2;

/*
 *@create by jiankang
 *@date 2020/4/29 time 15:06
 */

public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
    }
}
