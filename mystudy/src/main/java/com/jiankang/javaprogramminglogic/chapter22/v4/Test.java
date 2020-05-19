package com.jiankang.javaprogramminglogic.chapter22.v4;

/*
 *@create by jiankang
 *@date 2020/5/19 time 18:00
 */

public class Test {
    public static void main(String[] args) {
        ServiceA instance = SimpleContainer.getInstance(ServiceA.class);
        instance.callB();

        ServiceA instanceSingleton = SimpleContainer.getSingletonInstance(ServiceA.class);
        ServiceA instanceSingleton2 = SimpleContainer.getSingletonInstance(ServiceA.class);
        instanceSingleton.callB();
        instanceSingleton2.callB();
    }
}
