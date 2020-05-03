package com.jiankang.javaprogramminglogic.chapter15.v1;

/*
 *@create by jiankang
 *@date 2020/5/2 time 11:18
 */

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new HelloThread();
        thread.start();
        thread.join();


        Thread thread1 = new Thread(new HelloRunnable());
        thread1.start();
        Thread.yield();
        Thread.State state = thread.getState();
        System.out.println(state);

        System.out.println(thread.isAlive());
    }
}
