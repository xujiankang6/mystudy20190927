package com.jiankang.javaprogramminglogic.chapter11.v4;

/*
 *@create by jiankang
 *@date 2020/4/17 time 13:53
 */

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 求中值
 */
public class Median<E> {
    private PriorityQueue<E> minP;  //最小堆
    private PriorityQueue<E> maxP;   // 最大堆
    private E m;

    public Median() {
        this.minP = new PriorityQueue<>();
        this.maxP = new PriorityQueue<>(11, Collections.reverseOrder());
    }

    private int compare(E e, E m) {
        Comparable<? super E> cmpr = (Comparable<? super E>) e;
        return cmpr.compareTo(m);
    }

    public void add(E e) {
        if (m == null) {
            m = e;
            return;
        }
        if (compare(e, m) <= 0) {
            //小于中值，加入最大堆
            maxP.add(e);
        } else {
            minP.add(e);
        }
        if (minP.size() - maxP.size() >= 2) {
            //最小堆元素个数多，即大于中值的数多
            //将m加入到最大堆中，然后将最小堆中的跟移除赋值给m
            maxP.add(this.m);
            this.m = minP.poll();
        } else if (maxP.size() - minP.size() >= 2) {
            minP.add(this.m);
            this.m = maxP.poll();
        }
    }


    public void addAll(Collection<? extends E> c) {
        for (E e : c) {
            add(e);
        }
    }

    public E getM(){
        return m;
    }
}
