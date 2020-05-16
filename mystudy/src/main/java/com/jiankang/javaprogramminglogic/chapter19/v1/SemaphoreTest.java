package com.jiankang.javaprogramminglogic.chapter19.v1;

/*
 *@create by jiankang
 *@date 2020/5/16 time 14:27
 */

import java.util.concurrent.Semaphore;

public class SemaphoreTest {
    public static void main(String[] args) throws InterruptedException {
        Semaphore permits = new Semaphore(1);
        permits.acquire();
        permits.acquire();
        System.out.println("acquired");
    }
}
