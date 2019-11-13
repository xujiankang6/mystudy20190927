package com.jiankang.designismethod2.prototypepattern.v3;

/*
 *@create by jiankang
 *@date 2019/11/13 time 21:12
 * 浅拷贝
 * 两个对象共享了一个私有变量
 */

public class Client {
    public static void main(String[] args) {
        Thing thing = new Thing();
        thing.setValue("zhangsan");
        Thing clonething = thing.clone();
        clonething.setValue("lisi");
        System.out.println(thing.getValue());

    }
}
