package com.jiankang.javaconcurrencybeauty.chapter2.v2;

/*
 *@create by jiankang
 *@date 2020/10/19 time 14:15
 */

public class VolatileTest {
    //使用voilatile 变量，防止重排序和内存可见性问题
    private static volatile boolean ready = false;
    private static int num = 0;


    public static class ReadThread extends Thread {
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                if (ready) {
                    System.out.println(num + num);
                }
            }
            System.out.println("read thread ....");
        }
    }

    public static class Writethread extends Thread {
        @Override
        public void run() {
            num = 2;
            ready = true;
            System.out.println("writeThread set over ....");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final ReadThread rt = new ReadThread();

        final Writethread wt = new Writethread();
        wt.start();
        rt.start();
        Thread.sleep(10);
        rt.interrupt();
        System.out.println("main exit");
    }

}


