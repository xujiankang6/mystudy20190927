package com.jiankang.javaprogramminglogic.chapter17.v1;

/*
 *@create by jiankang
 *@date 2020/5/7 time 19:51
 */

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapIteratorDemo {
    public static void main(String[] args) {
        test();
    }


    public static void test() {
        final Map<String, String> map = new ConcurrentHashMap<>();
        map.put("a", "abstract");
        map.put("b", "basic");
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(entry.getKey() + ", " + entry.getValue());
                }
            }
        };
        t1.start();
        //确保t1启动
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //会打印
        map.put("c", "call");
        //不会打印，体现了弱一致性
        map.put("a", "call");

    }

}
