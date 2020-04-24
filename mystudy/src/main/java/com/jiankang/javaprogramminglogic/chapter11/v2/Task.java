package com.jiankang.javaprogramminglogic.chapter11.v2;

/*
 *@create by jiankang
 *@date 2020/4/16 time 10:56
 */

public class Task {
    int priority;
    String name;

    public Task(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
