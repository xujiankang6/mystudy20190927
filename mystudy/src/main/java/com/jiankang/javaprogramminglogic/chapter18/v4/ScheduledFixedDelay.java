package com.jiankang.javaprogramminglogic.chapter18.v4;

/*
 *@create by jiankang
 *@date 2020/5/12 time 20:18
 */

import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledFixedDelay {

    static class LoopTask extends TimerTask {

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class ExampleTask extends TimerTask {

        @Override
        public void run() {
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        ScheduledExecutorService timer = Executors.newScheduledThreadPool(10);
        timer.schedule(new LoopTask(), 10, TimeUnit.MILLISECONDS);
        timer.scheduleWithFixedDelay(new ExampleTask(), 100, 1000, TimeUnit.MILLISECONDS);
    }
}
