package com.jiankang.javaprogramminglogic.chapter9.v2;

/*
 *@create by jiankang
 *@date 2020/3/26 time 16:32
 */

import java.util.*;

public class TestLinkedList {
    public static void main(String[] args) {
        //新建list
        LinkedList list1 = new LinkedList();
        LinkedList<String> list2 = new LinkedList<>(Arrays.asList(new String[]{"a", "b", "c"}));

        //linkedList当做队列
        Queue<String> queue = new LinkedList<>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        while (queue.peek() != null) {
            System.out.println(queue.poll());
        }
        System.out.println();


        //linkedList当做栈
        Deque<String> stack = new LinkedList<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        Iterator<String> stringIterator = stack.descendingIterator();
        while (stringIterator.hasNext()){
            System.out.print(stringIterator.next()+"   ");
        }
    }
}
