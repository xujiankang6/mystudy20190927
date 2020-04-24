package com.jiankang.javaprogramminglogic.chapter4.v3;

/*
 *@create by jiankang
 *@date 2020/4/24 time 11:17
 */

public class Test {
    public static void main(String[] args) {
        Child c = new Child();
        c.addAll(new int[]{1,2,3});
        c.clear();
        c.addAll(new int[]{1,2,3});
        System.out.println(c.getSum());
    }
}
