package com.jiankang.javaprogramminglogic.chapter22.v4;

/*
 *@create by jiankang
 *@date 2020/5/19 time 17:57
 */

public class ServiceA {
    @SimpleInject
    ServiceB b;

    public void callB(){
        b.action();
    }


}
