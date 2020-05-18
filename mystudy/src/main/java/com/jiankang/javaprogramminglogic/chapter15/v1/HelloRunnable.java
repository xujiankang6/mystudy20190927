package com.jiankang.javaprogramminglogic.chapter15.v1;

/*
 *@create by jiankang
 *@date 2020/5/2 time 11:22
 */

public class HelloRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("thread name : "+Thread.currentThread().getName());
        System.out.println("hello");
    }
}
