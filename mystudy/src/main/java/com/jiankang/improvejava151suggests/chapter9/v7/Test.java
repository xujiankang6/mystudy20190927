package com.jiankang.improvejava151suggests.chapter9.v7;

/*
 *@create by jiankang
 *@date 2020/11/5 time 11:24
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {

    public static void main(String[] args) {
        final Lock lock = new ReentrantLock();
        for (int i = 0; i < 3; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        lock.lock();
                        Thread.sleep(2000);
                        System.out.println(Thread.currentThread().getName());
                    }catch (Exception e){
                        e.printStackTrace();
                    }finally {
                        lock.unlock();
                    }
                }
            }).start();
        }
    }
}
