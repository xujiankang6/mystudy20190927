package com.jiankang.improvejava151suggests.chapter9.v3;

/*
 *@create by jiankang
 *@date 2020/11/4 time 17:46
 */

public class UnsafeThread implements Runnable {

    //共享资源
    private volatile int count = 0;


    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Math.hypot(Math.pow(92456789, 1), Math.cos(i));
        }
        count++;
    }

    public int getCount() {
        return count;
    }
}
