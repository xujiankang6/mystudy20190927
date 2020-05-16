package com.jiankang.javaprogramminglogic.chapter19.v2;

/*
 *@create by jiankang
 *@date 2020/5/16 time 15:48
 */

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

    static class Tourist extends Thread {
        CyclicBarrier barrier;

        public Tourist(CyclicBarrier barrier) {
            this.barrier = barrier;
        }

        @Override
        public void run() {
            //模拟先各自独立运行
            try {
                Thread.sleep((int) (Math.random() * 1000));
                //集合点A
                barrier.await();
                System.out.println(this.getName() + "  arrived A " + System.currentTimeMillis());
                //集合后模拟再各自独立运行
                Thread.sleep((int) (Math.random() * 1000));
                //集合点B
                barrier.await();
                System.out.println(this.getName() + "  arrived B " + System.currentTimeMillis());
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
            }
        }
    }

    public static void main(String[] args) {
        int num = 5;
        Tourist[] tourists = new Tourist[num];
        CyclicBarrier barrier = new CyclicBarrier(num, new Runnable() {
            @Override
            public void run() {
                System.out.println("all arrived " + System.currentTimeMillis() + "  executed by " + Thread.currentThread().getName());
            }
        });

        for (int i = 0; i <num ; i++) {
            tourists[i] = new Tourist(barrier);
            tourists[i].start();
        }
    }
}
