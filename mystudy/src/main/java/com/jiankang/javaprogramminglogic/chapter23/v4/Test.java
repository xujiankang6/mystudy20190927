package com.jiankang.javaprogramminglogic.chapter23.v4;

/*
 *@create by jiankang
 *@date 2020/5/21 time 17:32
 */

public class Test {
    public static void main(String[] args) {
        ServiceA instance = CGLibContainer.getInstance(ServiceA.class);
        instance.callB();
    }
}
