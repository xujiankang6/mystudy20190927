package com.jiankang.javacoretechnologythetenversion.chapter4.v2;

/*
 *@create by jiankang
 *@date 2020/5/29 time 11:16
 */

public class Employee implements Cloneable{

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        return other.name.equals(this.name) && name == other.name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

