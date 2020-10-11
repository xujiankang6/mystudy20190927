package com.jiankang.javaconcurrencybeauty.chapter1.v4;

/*
 *@create by jiankang
 *@date 2020/10/9 time 10:23
 */

public class InterruptedTest {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println(Thread.currentThread() + " hello");

//                    当线程在睡眠中被打断，会抛出异常
//                    try {
//                        Thread.sleep(100000);
//                    } catch (InterruptedException e) {
//                        System.out.println("thread is interrupted while is sleep");
//                        e.printStackTrace();
//                    }
                }
            }
        });
        thread.start();
        Thread.sleep(1000);
        System.out.println("main thread interrupt thread");
        thread.interrupt();
        thread.join();
        System.out.println("main is over");
    }
}
