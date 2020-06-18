package com.jiankang.javacoretechnologythetenversion.chapter8.v3;

/*
 *@create by jiankang
 *@date 2020/6/18 time 8:48
 */


public class Manager extends Employee {
    private String name;
    private Integer bonus;

    public Manager(String name, Integer bonus) {
        super(name, bonus);
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
        return "Manager{" +
                "name='" + name + '\'' +
                ", bonus=" + bonus +
                '}';
    }
}
