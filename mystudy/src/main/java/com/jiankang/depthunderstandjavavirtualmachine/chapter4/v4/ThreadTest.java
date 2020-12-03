package com.jiankang.depthunderstandjavavirtualmachine.chapter4.v4;

/*
 *@create by jiankang
 *@date 2020/12/2 @time 20:48
 * 线程死循环演示
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThreadTest {

    public static void createBusyThread() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true)
                    ;
            }
        }, "testBusyThread");
        thread.start();
    }


    public static void createLockThread(final Object lock) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "testLockThread");
        thread.start();
    }

    public static void main(String[] args) throws Exception{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         br.readLine();
         createBusyThread();
         br.readLine();
        Object obj = new Object();
        createLockThread(obj);

    }

}
