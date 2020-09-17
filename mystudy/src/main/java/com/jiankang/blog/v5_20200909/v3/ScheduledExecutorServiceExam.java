package com.jiankang.blog.v5_20200909.v3;

/*
 *@create by jiankang
 *@date 2020/9/9 time 17:43
 */

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExam {
    public static void main(String[] args) {
        final ScheduledThreadPoolExecutor scheduler = new ScheduledThreadPoolExecutor(2);
        final ScheduledFuture<?> beep = scheduler.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("beep");
            }
        }, 1, 1, TimeUnit.SECONDS);
        scheduler.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("cancel beep");
                beep.cancel(true);
                scheduler.shutdown();
            }
        }, 10, TimeUnit.SECONDS);
    }


}
