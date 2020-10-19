package com.jiankang.javaconcurrencybeauty.chapter1.v5;

/*
 *@create by jiankang
 *@date 2020/10/11 time 16:24
 */

public class TestThreadLocal {

    public static ThreadLocal<String> threadLocal = new ThreadLocal<String>();
    //这个可以子线程传递父线程的变量
    public static ThreadLocal<String> inheritableThreadLocal = new InheritableThreadLocal<>();

    public static void main(String[] args) {
        threadLocal.set("threadLocal");
        inheritableThreadLocal.set("inheritableThreadLocal");
        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                //子线程输出线程变量的值
                System.out.println("child thread:" + threadLocal.get());
                System.out.println("child thread:" + inheritableThreadLocal.get());
            }
        });
        thread.start();
        System.out.println("main : " + threadLocal.get());
        System.out.println("main : " + inheritableThreadLocal.get());
    }
}
