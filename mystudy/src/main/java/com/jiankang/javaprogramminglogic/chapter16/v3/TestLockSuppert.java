package com.jiankang.javaprogramminglogic.chapter16.v3;

/*
 *@create by jiankang
 *@date 2020/5/3 time 14:32
 */

import java.util.concurrent.locks.LockSupport;

public class TestLockSuppert {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("start");
                LockSupport.park();//放弃cpu
                System.out.println("exit");
            }
        };
        thread.start();
        Thread.sleep(1000);
        System.out.println("main");
        LockSupport.unpark(thread);
    }
}
