package com.jiankang.javaconcurrencybeauty.chapter3.v1;

/*
 *@create by jiankang
 *@date 2020/10/19 time 19:23
 */

import java.util.concurrent.ThreadLocalRandom;

public class RandomTest {
    public static void main(String[] args) {
         ThreadLocalRandom current = ThreadLocalRandom.current();
        for (int i = 0; i < 10; i++) {
            System.out.println(current.nextInt(10));
        }
    }
}
