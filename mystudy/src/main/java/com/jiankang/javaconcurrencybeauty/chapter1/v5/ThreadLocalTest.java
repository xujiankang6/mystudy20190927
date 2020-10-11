package com.jiankang.javaconcurrencybeauty.chapter1.v5;

/*
 *@create by jiankang
 *@date 2020/10/11 time 15:56
 */

public class ThreadLocalTest {

    static ThreadLocal<String> localVariable = new ThreadLocal<>();


    static void print(String str){
        System.out.println(str + ":"+localVariable.get());
        //清除当前线程本地内存中的localVariable变量
        localVariable.remove();
    }


    public static void main(String[] args) {
         Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                localVariable.set("threadOne local variable");
                print("threadOne");
                System.out.println("threadOne remove after: " + localVariable.get());
            }
        });

        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                localVariable.set("threadTwo local variable");
                print("threadTwo");
                System.out.println("threadTwo remove after: " + localVariable.get());
            }
        });

        threadOne.start();
        threadTwo.start();
    }
}
