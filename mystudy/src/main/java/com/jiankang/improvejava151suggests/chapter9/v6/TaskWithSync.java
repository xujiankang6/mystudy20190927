package com.jiankang.improvejava151suggests.chapter9.v6;

/*
 *@create by jiankang
 *@date 2020/11/4 time 21:00
 */

public class TaskWithSync extends Task implements Runnable {
    @Override
    public void run() {
        synchronized ("A"){
            doSomething();
        }
    }
}
