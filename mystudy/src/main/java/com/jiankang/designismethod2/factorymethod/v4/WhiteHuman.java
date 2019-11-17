package com.jiankang.designismethod2.factorymethod.v4;

/*
 *@create by jiankang
 *@date 2019/11/2 time 19:54
 */
public class WhiteHuman implements Human {
    public void getColor(){
        System.out.println("白色人种的皮肤颜色是白色的！");
    }
    public void talk() {
        System.out.println("白色人种会说话，一般都是但是单字节。");
    }
}