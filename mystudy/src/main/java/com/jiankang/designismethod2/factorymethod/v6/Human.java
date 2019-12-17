package com.jiankang.designismethod2.factorymethod.v6;

/*
 *@create by jiankang
 *@date 2019/11/8 time 14:50
 */

public interface Human {
    //每个人种都有相应的颜色
    public void getColor();
    //人类会说话
    public void talk();
    //每个人都有性别
    public void getSex();
}