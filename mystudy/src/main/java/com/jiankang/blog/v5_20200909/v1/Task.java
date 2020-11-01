package com.jiankang.blog.v5_20200909.v1;

/*
 *@create by jiankang
 *@date 2020/9/9 time 16:04
 */

import java.util.concurrent.TimeUnit;

public class Task implements Runnable{
    private final String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(name + ": "+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
