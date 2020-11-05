package com.jiankang.improvejava151suggests.chapter9.v5;

/*
 *@create by jiankang
 *@date 2020/11/4 time 20:34
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) throws InterruptedException {
         ExecutorService es = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 4; i++) {
            es.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }
        es.shutdown();
    }
}
