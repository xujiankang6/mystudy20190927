package com.jiankang.javaprogramminglogic.chapter19.v3;

/*
 *@create by jiankang
 *@date 2020/5/16 time 18:19
 */

public class ThreadLocalInit {

    static ThreadLocal<Integer> local = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 100;
        }
    };

    public static void main(String[] args) throws InterruptedException {
        System.out.println(local.get());
        local.set(200);
        local.remove();
        System.out.println(local.get());
    }
}
