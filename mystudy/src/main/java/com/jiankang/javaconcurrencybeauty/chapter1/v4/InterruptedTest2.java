package com.jiankang.javaconcurrencybeauty.chapter1.v4;

/*
 *@create by jiankang
 *@date 2020/10/9 time 10:23
 */

public class InterruptedTest2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (;;){

                }
            }
        });
        thread.start();
        Thread.sleep(1000);
        System.out.println("main thread interrupt thread");
        thread.interrupt();
        System.out.println("isInterrupted " +thread.isInterrupted());
        System.out.println("isInterrupted " +thread.isInterrupted());
        System.out.println("isInterrupted " +Thread.interrupted());
        System.out.println("isInterrupted " +thread.isInterrupted());
        thread.join();
        System.out.println("main is over");
    }
}
