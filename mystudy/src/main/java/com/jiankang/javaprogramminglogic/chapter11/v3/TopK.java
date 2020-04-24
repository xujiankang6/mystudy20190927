package com.jiankang.javaprogramminglogic.chapter11.v3;

/*
 *@create by jiankang
 *@date 2020/4/17 time 12:10
 */

import java.util.Collection;
import java.util.PriorityQueue;


/**
 * 保留五个最大的元素
 *
 * @param <E>
 */
public class TopK<E> {
    private PriorityQueue<E> queue;
    private int k;

    public TopK(int k) {
        this.k = k;
        this.queue = new PriorityQueue<>(k);
    }

    public void addAll(Collection<? extends E> c) {
        for (E e : c) {
            add(e);
        }
    }


    public void add(E e) {
        if (queue.size() < k) {
            queue.add(e);
            return;
        }
        Comparable<? super E> head = (Comparable<? super E>) queue.peek();
        if (head.compareTo(e) > 0) {
            return;
        }
        queue.poll();
        queue.add(e);
    }


    public E getKth() {
        return queue.peek();
    }

    public <T> T[] toArray(T[] a) {
        return queue.toArray(a);
    }


}
