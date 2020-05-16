package com.jiankang.javaprogramminglogic.chapter19.v2;

import java.util.concurrent.CountDownLatch;

/*
 *@create by jiankang
 *@date 2020/5/16 time 14:54
 */
//实现主从协作模式
public class MasterWorkerDemo {
    static class Worker extends Thread {
        CountDownLatch latch;

        public Worker(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public void run() {
            try {
                //模拟执行任务
                Thread.sleep((int) (Math.random() * 1000));
                //模拟异常情况
                if (Math.random() < 0.02) {
                    throw new RuntimeException("bad luck");
                }
                System.out.println("从线程执行成功！");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                //对count减1
                this.latch.countDown();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int workerNum = 100;
        CountDownLatch latch = new CountDownLatch(workerNum);
        Worker[] workers = new Worker[workerNum];
        for (int i = 0; i < workerNum; i++) {
            workers[i] = new Worker(latch);
            workers[i].start();
        }
        //当count为0时，唤醒主线程
        latch.await();
        System.out.println("collect worker results " + latch.getCount());

    }
}
