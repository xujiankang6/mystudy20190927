package com.jiankang.designismethod2.factorymethod.v4;

/*
 *@create by jiankang
 *@date 2019/11/2 time 19:52
 */

public class BlackHuman implements Human {
    public void getColor(){
        System.out.println("黑色人种的皮肤颜色是黑色的！");
    }
    public void talk() {
        System.out.println("黑人会说话，一般人听不懂。");
    }
}
