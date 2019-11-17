package com.jiankang.designismethod2.singleinstance.v1;

/*
 *@create by jiankang
 *@date 2019/11/2 time 18:45
 */

public class Singleton {
    private static final Singleton singleton = new Singleton();
    //限制产生多个对象
    private Singleton(){
    }
    //通过该方法获得实例对象
    public static Singleton getSingleton(){
        return singleton;
    }
    //类中其他方法，尽量是static
    public static void doSomething(){

    }
}