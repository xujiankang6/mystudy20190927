package com.jiankang.javacoretechnologythetenversion.chapter4.v2;

/*
 *@create by jiankang
 *@date 2020/5/29 time 10:59
 */

//该案例说明： Java程序设计语言对对象采用的不是引用调用，实际上，对象引用是按值传递的。

public class ClassTest {
    public static void main(String[] args) {
        Employee aa = new Employee("aa");
        Employee bb = new Employee("bb");
        swap(aa,bb);
        System.out.println(aa.getName());
        System.out.println(bb.getName());


    }


    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("aa: "+x.getName());
        System.out.println("bb: "+y.getName());
        x.setName("zzzzx");
        y.setName("zzzzY");
    }
}
