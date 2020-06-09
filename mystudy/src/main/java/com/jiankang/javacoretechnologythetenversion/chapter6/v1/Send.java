package com.jiankang.javacoretechnologythetenversion.chapter6.v1;

/*
 *@create by jiankang
 *@date 2020/6/5 time 14:23
 */
//如果为一个接口提供默认方法，这样对于之前的实现类不会有影响，否则之前实现的都需要这个方法
public interface Send {

    default void send() {
        System.out.println("send");
    }

    void  receive();
}
