package com.jiankang.designismethod2.singleinstance.v1;

/*
 *@create by jiankang
 *@date 2019/11/2 time 18:43
 */

public class Emperor {
    private static final Emperor emperor =new Emperor(); //初始化一个皇帝
    private Emperor(){
//世俗和道德约束你，目的就是不希望产生第二个皇帝
    }
    public static Emperor getInstance(){
        return emperor;
    }
    //皇帝发话了
    public static void say(){
        System.out.println("我就是皇帝某某某....");
    }
}
