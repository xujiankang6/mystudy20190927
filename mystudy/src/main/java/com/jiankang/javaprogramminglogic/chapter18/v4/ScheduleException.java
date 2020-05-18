package com.jiankang.javaprogramminglogic.chapter18.v4;

/*
 *@create by jiankang
 *@date 2020/5/12 time 21:34
 */

import java.util.concurrent.*;

public class ScheduleException {
    static class TaskA implements Runnable {


        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task A");
//            throw new RuntimeException();
        }
    }

    static class TaskB implements Runnable {

        @Override
        public void run() {
            System.out.println("taskB");
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        ScheduledFuture<?> scheduledFuture = executorService.scheduleWithFixedDelay(new TaskA(), 0, 1, TimeUnit.SECONDS);
        ScheduledFuture<?> scheduledFuture1 = executorService.scheduleWithFixedDelay(new TaskB(), 2, 1, TimeUnit.SECONDS);
        Object o = scheduledFuture.get();
        Object o1 = scheduledFuture1.get();
        System.out.println(o);
        System.out.println(o1);
    }
}
