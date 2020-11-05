package com.jiankang.improvejava151suggests.chapter9.v8;

/*
 *@create by jiankang
 *@date 2020/11/5 time 11:31
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Foo {

    //可重入读写锁
    private final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
    //读锁
    private final Lock r = rwl.readLock();
    //写锁
    private final Lock w = rwl.writeLock();


    public void read() {
        try {
            r.lock();
            Thread.sleep(1000);
            System.out.println("read ....");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            r.unlock();
        }
    }

    public void write(Object _obj) {
        try {
            w.lock();
            Thread.sleep(1000);
            System.out.println("Writing ......");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            w.unlock();
        }
    }
}
