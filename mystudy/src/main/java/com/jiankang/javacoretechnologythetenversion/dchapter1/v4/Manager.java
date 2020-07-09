package com.jiankang.javacoretechnologythetenversion.dchapter1.v4;

/*
 *@create by jiankang
 *@date 2020/6/18 time 8:48
 */


import java.io.Serializable;

public class Manager extends Employee implements Serializable {

    private Employee secretary;

    public Manager(String name, Integer bonus) {
        super(name, bonus);
    }

    public Employee getSecretary() {
        return secretary;
    }

    public void setSecretary(Employee secretary) {
        this.secretary = secretary;
    }
}
