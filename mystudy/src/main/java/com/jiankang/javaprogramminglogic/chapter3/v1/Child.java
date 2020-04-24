package com.jiankang.javaprogramminglogic.chapter3.v1;

/*
 *@create by jiankang
 *@date 2020/4/23 time 10:21
 */

public class Child extends Base {

    private int a = 123;

    public Child() {

    }

    @Override
    public void test() {
        System.out.println(a);
    }
}
