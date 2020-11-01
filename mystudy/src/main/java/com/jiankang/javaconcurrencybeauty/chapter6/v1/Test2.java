package com.jiankang.javaconcurrencybeauty.chapter6.v1;

/*
 *@create by jiankang
 *@date 2020/10/22 time 19:42
 */

import java.util.concurrent.locks.LockSupport;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {


            @Override
            public void run() {
                try {
                    System.out.println("child thread begin park!");
                    while (!Thread.currentThread().isInterrupted()){
                        LockSupport.park();
                    }
                    System.out.println("child thread end unpark! ");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        Thread.sleep(1000);
        System.out.println("main thread begin unpark! ");
        thread.interrupt();
    }
}

