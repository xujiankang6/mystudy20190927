package com.jiankang.improvejava151suggests.chapter9.v6;

/*
 *@create by jiankang
 *@date 2020/11/4 time 21:01
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws Exception {
        runTasks(TaskWithLock.class);
        runTasks(TaskWithSync.class);
    }

    public static void runTasks(Class<? extends Task> clz) throws Exception{
         ExecutorService es = Executors.newCachedThreadPool();
        System.out.println("开始执行： "+clz.getSimpleName()+"任务*******");
        for (int i = 0; i < 3; i++) {
            es.submit((Runnable) clz.newInstance());
        }
        TimeUnit.SECONDS.sleep(10);
        System.out.println("----------"+clz.getSimpleName()+"任务结束");
        es.shutdown();
    }







}
