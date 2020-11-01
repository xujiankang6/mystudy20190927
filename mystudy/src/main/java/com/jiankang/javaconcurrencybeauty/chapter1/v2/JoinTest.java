package com.jiankang.javaconcurrencybeauty.chapter1.v2;

/*
 *@create by jiankang
 *@date 2020/10/6 time 16:30
 * join 方法等待线程终止
 */

public class JoinTest {
    public static void main(String[] args) {
        final Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("threadOne start");
                for (; ; ) {

                }
            }
        });
        final Thread mainThread = Thread.currentThread();
        final Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                mainThread.interrupt();
            }
        });
        threadOne.start();
        threadTwo.start();
        try {
            threadOne.join();
        } catch (Exception e) {
            System.out.println("main thread : " + e);
        }
    }
}
