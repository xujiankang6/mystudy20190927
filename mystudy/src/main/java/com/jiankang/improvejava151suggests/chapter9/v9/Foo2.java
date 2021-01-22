package com.jiankang.improvejava151suggests.chapter9.v9;

/*
 *@create by jiankang
 *@date 2020/11/5 time 14:00
 */

public class Foo2 implements Runnable {
    @Override
    public void run() {
        method1();
    }

    public synchronized void method1(){
        System.out.println("method1");
        method2();
    }

    public synchronized void method2(){
        System.out.println("method2");
    }
}
