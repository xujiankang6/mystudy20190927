package com.jiankang.javaconcurrencybeauty.chapter6.v1;

/*
 *@create by jiankang
 *@date 2020/10/22 time 19:04
 */

import java.util.concurrent.locks.LockSupport;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("begin park!");
         Thread thread = new Thread(new Runnable() {


            @Override
            public void run() {
                try {
                    LockSupport.park();
                    System.out.println("son ");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
         thread.start();



        Thread.sleep(1000);
        LockSupport.unpark(thread);


        System.out.println("end park!");
    }
}
