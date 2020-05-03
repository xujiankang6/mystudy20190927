package com.jiankang.javaprogramminglogic.chapter15.v6;

/*
 *@create by jiankang
 *@date 2020/5/2 time 16:07
 */

public class Consumer extends Thread {
    MyBlockingQueue<String> queue;

    public Consumer(MyBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int num = 0;
        try {
            while (true) {
                String task = queue.take();
                System.out.println("handle: " + task);
                Thread.sleep((long) (Math.random() * 100));
            }
        } catch (Exception e) {
        }
    }
}
