package com.jiankang.javacoretechnologythetenversion.chapter6.v4;

/*
 *@create by jiankang
 *@date 2020/6/6 time 15:47
 */

import java.util.Date;

public class Emplayee implements Cloneable {

    private String name;
    private double salary;
    private Date hireDay;


    public Emplayee(String name, double salary, Date hireDay) {
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;
    }

    public Emplayee clone() throws CloneNotSupportedException {
        Emplayee cloned = (Emplayee) super.clone();
        return cloned;
    }
}
