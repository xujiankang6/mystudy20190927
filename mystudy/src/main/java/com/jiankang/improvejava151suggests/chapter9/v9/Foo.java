package com.jiankang.improvejava151suggests.chapter9.v9;

/*
 *@create by jiankang
 *@date 2020/11/5 time 13:50
 */

public class Foo implements Runnable {
    @Override
    public void run() {

        fun(10);
    }

    public synchronized void fun(int i) {
        if (--i > 0) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(i);
            fun(i);
        }
    }
}
