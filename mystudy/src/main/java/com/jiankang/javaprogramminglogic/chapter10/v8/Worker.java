package com.jiankang.javaprogramminglogic.chapter10.v8;

/*
 *@create by jiankang
 *@date 2020/4/12 time 18:15
 */

import java.util.Set;

public class Worker {
    String name;
    Set<Day> availableDays;

    public Worker(String name, Set<Day> availableDays) {
        this.name = name;
        this.availableDays = availableDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Day> getAvailableDays() {
        return availableDays;
    }

    public void setAvailableDays(Set<Day> availableDays) {
        this.availableDays = availableDays;
    }
}
