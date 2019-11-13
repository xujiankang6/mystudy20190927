package com.jiankang.designismethod2.prototypepattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/13 time 21:10
 */

public class Thing implements Cloneable {
    public Thing(){
        System.out.println("构造函数被执行了。。。");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
