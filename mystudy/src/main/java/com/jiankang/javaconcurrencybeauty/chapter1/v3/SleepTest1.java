package com.jiankang.javaconcurrencybeauty.chapter1.v3;

/*
 *@create by jiankang
 *@date 2020/10/6 time 16:56
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SleepTest1 {
    private static final Lock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    System.out.println("child threadA is in sleep");
                    Thread.sleep(10000);
                    System.out.println("child threadA is in awaked");
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }

            }
        });


        threadA.start();
        Thread.sleep(2000);
        threadA.interrupt();
    }


}
