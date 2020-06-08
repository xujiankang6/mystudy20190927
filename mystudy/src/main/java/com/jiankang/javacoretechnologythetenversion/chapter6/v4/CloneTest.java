package com.jiankang.javacoretechnologythetenversion.chapter6.v4;

/*
 *@create by jiankang
 *@date 2020/6/6 time 12:30
 */


import com.jiankang.javacoretechnologythetenversion.chapter4.v2.Employee;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee original = new Employee("aaa");
        Employee copy = (Employee) original.clone();
        System.out.println(original);
        System.out.println(copy);

    }
}
