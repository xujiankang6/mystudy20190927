package com.jiankang.javaprogramminglogic.chapter3.v3;

/*
 *@create by jiankang
 *@date 2020/4/23 time 11:37
 */

public class Child extends  Base {

    public int sum(int a,int b){
        System.out.println("child_long_long");
        return a+b;
    }

    public static void main(String[] args) {
        Child c = new Child();
        int a = 2;
        int b= 3;
        c.sum(a,b);
    }
}
