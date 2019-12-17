package com.jiankang.designismethod2.facadepattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/26 time 16:04
 */

public class Facade2 {
    //引用原有的门面
    private Facade facade = new Facade();

    public void methodB(){
        this.facade.methodB();
    }
}
