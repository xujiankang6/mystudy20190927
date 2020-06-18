package com.jiankang.javacoretechnologythetenversion.chapter8.v3;

/*
 *@create by jiankang
 *@date 2020/6/18 time 8:50
 */

public class Employee {
    private String name;
    private Integer bonus;

    public Employee(String name, Integer bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", bonus=" + bonus +
                '}';
    }
}
