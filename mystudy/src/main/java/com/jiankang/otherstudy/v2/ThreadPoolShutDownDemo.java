package com.jiankang.otherstudy.v2;

import java.util.Date;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * ThreadPoolShutDownDemo
 *
 * @author jiankang.xu
 * @date 2020/3/13
 */
public class ThreadPoolShutDownDemo {


    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 10,
                0L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(50000),
                new NamedThreadFactory("shutdown-demo"));
        int total = 20000;
        for (int i = 0; i < total; i++) {
            executor.submit(() -> {
                try {
                    TimeUnit.MILLISECONDS.sleep(5L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

//        executor.shutdownNow();
        printExecutorInfo(total,executor);

        //线程池关闭后，进入队列的任务依然会被执行
        executor.shutdown();




        //线程池没结束，每隔一秒打印任务情况
        while (!executor.isTerminated()){
            TimeUnit.SECONDS.sleep(1);
            printExecutorInfo(total,executor);

        }

    }

    //打印线程池信息
    private static void printExecutorInfo(int total, ThreadPoolExecutor executor) {
        String date = new Date().toString();
        String result = String.format("时间：%s，总任务数：%s，工作队列中有%s个任务，已完成%s个任务，正在执行：%s 个任务",
                date, String.valueOf(total), String.valueOf(executor.getQueue().size())
                , String.valueOf(executor.getCompletedTaskCount()),
                String.valueOf(executor.getActiveCount()));
        System.out.println(result);

    }
}
