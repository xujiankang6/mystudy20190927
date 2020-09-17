package com.jiankang.blog.v5_20200909.v1;

/*
 *@create by jiankang
 *@date 2020/9/9 time 16:04
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExam {
    public static void main(String[] args) {
        final ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Task("task1"));
        executorService.execute(new Task("task2"));
        executorService.execute(new Task("task3"));
        executorService.shutdown();
    }

}
