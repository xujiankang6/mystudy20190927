package com.jiankang.javacoretechnologythetenversion.chapter9.v1;

/*
 *@create by jiankang
 *@date 2020/6/20 time 15:01
 */

import java.time.LocalDate;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<LocalDate> pq = new PriorityQueue<LocalDate>(4, new Comparator<LocalDate>() {
            @Override
            public int compare(LocalDate o1, LocalDate o2) {
                return o1.getDayOfYear() - o2.getDayOfYear();
            }
        });
        pq.add(LocalDate.of(1906, 12, 9));
        pq.add(LocalDate.of(1815, 12, 10));
        pq.add(LocalDate.of(1903, 12, 3));
        pq.add(LocalDate.of(1910, 6, 22));

        System.out.println("Iterating over elements...");
        for (LocalDate date : pq) {
            System.out.println(date);
        }

        System.out.println("Removing elements... ");
        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }

    }
}
