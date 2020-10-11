package com.jiankang.javaconcurrencybeauty.chapter1.v3;

/*
 *@create by jiankang
 *@date 2020/10/9 time 10:11
 */

public class YieldTest implements Runnable {

     YieldTest() {
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            if(i%5==0){
                System.out.println(Thread.currentThread()+ "yield cpu ....");
//                当前线程让出CPU执行权，放弃时间片，进行下一轮调度
//                Thread.yield();
            }
        }
        System.out.println(Thread.currentThread()+" is over");
    }

    public static void main(String[] args) {
        new YieldTest();
        new YieldTest();
        new YieldTest();
    }
}
