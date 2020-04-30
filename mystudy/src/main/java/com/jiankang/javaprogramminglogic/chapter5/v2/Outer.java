package com.jiankang.javaprogramminglogic.chapter5.v2;

/*
 *@create by jiankang
 *@date 2020/4/29 time 15:01
 */

public class Outer {
    private int a = 100;

    public class Inner{
        public void innerMethod(){
            System.out.println("outer a "+a);
            action();

        }
    }

    private void action(){
        System.out.println("action");
    }

    public void test(){
        Inner inner = new Inner();
        inner.innerMethod();
    }
}
