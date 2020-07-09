package com.jiankang.javacoretechnologythetenversion.dchapter1.v5;

/*
 *@create by jiankang
 *@date 2020/7/9 time 12:05
 */

public class SerialCloneTest {
    public static void main(String[] args) {

        Employee aa = new Employee("aa", 100.00);
        Employee bb = (Employee) aa.clone();
        bb.raiseSalary(1);
        System.out.println(aa);
        System.out.println(bb);
    }
}
