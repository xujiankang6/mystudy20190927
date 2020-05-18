package com.jiankang.javaprogramminglogic.chapter17.v1;

/*
 *@create by jiankang
 *@date 2020/5/7 time 18:56
 */

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class UnsafeConcurrentUpdate {
    public static void main(String[] args) {
        unsafeConcurrentUpdate();

    }

    public static void unsafeConcurrentUpdate() {
//        final Map<Integer,Integer> map = new HashMap<>();
        final Map<Integer, Integer> map = new ConcurrentHashMap<>();
//        final Map<Integer, Integer> map = Collections.synchronizedMap(new HashMap<Integer, Integer>());
        for (int i = 0; i < 1000; i++) {
            Thread t = new Thread() {
                Random random = new Random();

                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        map.put(random.nextInt(), 1);
                    }
                }
            };
            t.start();
        }
    }
}
