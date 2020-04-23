package com.jiankang.javaprogramminglogic.chapter3.v2;

/*
 *@create by jiankang
 *@date 2020/4/23 time 10:21
 */



public class Child extends Base {

    public static String s = "child_base";
    public String m = "child";

    public static void staticTest(){
        System.out.println("child static :"+s);
    }


}
