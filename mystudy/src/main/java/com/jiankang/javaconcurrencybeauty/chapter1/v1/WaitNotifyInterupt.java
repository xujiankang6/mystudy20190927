package com.jiankang.javaconcurrencybeauty.chapter1.v1;

/*
 *@create by jiankang
 *@date 2020/10/6 time 15:55
 * 一个等待线程当线程中断，会抛出异常
 */

public class WaitNotifyInterupt {
    static Object obj = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("---begin---");
                    synchronized (obj){
                        obj.wait();
                    }
                } catch (Exception e) {

                    e.printStackTrace();
                }
            }
        });
        threadA.start();
        Thread.sleep(1000);
        System.out.println("begin interupt threadA");
        threadA.interrupt();
        System.out.println("end interrupt threadA");
    }
}
