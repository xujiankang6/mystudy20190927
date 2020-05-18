package com.jiankang.javaprogramminglogic.chapter15.v6;

/*
 *@create by jiankang
 *@date 2020/5/2 time 16:13
 */

public class Test {
    public static void main(String[] args) {
        MyBlockingQueue queue = new MyBlockingQueue(10);
        new Producter(queue).start();
        new Consumer(queue).start();
    }
}
