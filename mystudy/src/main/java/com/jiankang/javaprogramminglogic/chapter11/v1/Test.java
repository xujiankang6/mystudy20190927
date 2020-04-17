package com.jiankang.javaprogramminglogic.chapter11.v1;

/*
 *@create by jiankang
 *@date 2020/4/16 time 10:46
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Queue<Integer> pg = new PriorityQueue<>(11, Collections.reverseOrder());
        pg.offer(10);
        pg.add(22);
        pg.addAll(Arrays.asList(new Integer[]{
                12, 34, 2, 7, 4, 15, 12, 8, 6, 19, 13
        }));
        while (pg.peek() != null) {
            System.out.print(pg.poll() + "  ");
        }
    }
}
