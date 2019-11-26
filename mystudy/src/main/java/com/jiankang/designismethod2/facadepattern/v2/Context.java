package com.jiankang.designismethod2.facadepattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/26 time 16:07
 */

public class Context {
    private ClassA a = new ClassA();
    private ClassC c = new ClassC();

    public void complexMethod(){
        this.a.doSomethingA();
        this.c.doSomethingC();
    }
}
