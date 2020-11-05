package com.jiankang.improvejava151suggests.chapter9.v14;

/*
 *@create by jiankang
 *@date 2020/11/5 time 17:48
 */

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class Worker implements Runnable {
    //关卡
    private CyclicBarrier cb;

    public Worker(CyclicBarrier cb) {
        this.cb = cb;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println(Thread.currentThread().getName() + "-到达汇合点");
            cb.await();
            getCount(Thread.currentThread().getName() + "   :");
        } catch (Exception e) {
            //异常处理
        }
    }

    public void getCount(String name) {
        Random random = new Random();
        int sum = 0;
        for (int j = 0; j < 100; j++) {
            int i = random.nextInt(100000000);
            sum += i;
        }
        System.out.println(name + sum);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        CyclicBarrier cb = new CyclicBarrier(2000, new Runnable() {
            @Override
            public void run() {
                System.out.println("计算开始！");
            }
        });
        for (int i = 0; i < 2000; i++) {
            new Thread(new Worker(cb), "工人" + i).start();
        }
        long end = System.currentTimeMillis();
        System.out.println("执行花费时间： " + (end - start));

    }
}
