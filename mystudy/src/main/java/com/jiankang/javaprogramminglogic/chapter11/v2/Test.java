package com.jiankang.javaprogramminglogic.chapter11.v2;

/*
 *@create by jiankang
 *@date 2020/4/16 time 11:03
 */

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test {

    public static void main(String[] args) {
        Queue<Task> tasks = new PriorityQueue<>(11, taskComparator);
        tasks.offer(new Task(20, "写日记"));
        tasks.offer(new Task(210, "写日记3"));
        tasks.offer(new Task(220, "写日记2"));
        Task task = tasks.poll();
        while (task!=null){
            System.out.println("处理任务： "+task.getName()+" 优先级： "+task.getPriority());
            task= tasks.poll();
        }
    }


    private static Comparator<Task> taskComparator = new Comparator<Task>() {
        @Override
        public int compare(Task o1, Task o2) {
            if (o1.getPriority() > o2.getPriority()) {
                return -1;
            } else if (o1.getPriority() < o2.getPriority()) {
                return 1;
            }
            return 0;
        }
    };
}
