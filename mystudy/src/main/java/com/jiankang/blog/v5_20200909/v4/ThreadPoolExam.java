package com.jiankang.blog.v5_20200909.v4;

/*
 *@create by jiankang
 *@date 2020/9/9 time 18:21
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExam {
    public static void main(String[] args) {
//        final ExecutorService executorService = Executors.newSingleThreadExecutor();
//        final ExecutorService executorService = Executors.newFixedThreadPool(2);
        final ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new TaskInPool(i));
        }
        executorService.shutdown();
    }
}

class TaskInPool implements Runnable {
    private final int id;

    TaskInPool(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("TaskInPool-["+id+"] is running phase-"+i);
                TimeUnit.SECONDS.sleep(1);
            }
            System.out.println("TaskInPool-["+id+"] is over");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
