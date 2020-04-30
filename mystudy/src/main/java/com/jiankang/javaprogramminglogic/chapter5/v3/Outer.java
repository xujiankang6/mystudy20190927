package com.jiankang.javaprogramminglogic.chapter5.v3;

/*
 *@create by jiankang
 *@date 2020/4/29 time 15:25
 */

public class Outer {
    private int a = 100;

    public void test(final int param){
        final String str = "hello";
        class Inner{
            public void innerMethod(){
                System.out.println("outer a "+ a);
                System.out.println("param : "+param);
                System.out.println("local var "+str);
            }
        }
        Inner inner = new Inner();
        inner.innerMethod();
    }
}
