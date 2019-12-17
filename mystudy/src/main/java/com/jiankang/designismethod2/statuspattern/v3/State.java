package com.jiankang.designismethod2.statuspattern.v3;

/*
 *@create by jiankang
 *@date 2019/12/11 time 13:10
 */

public abstract class State {
    //定义一个环境
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    //行为1
    public abstract  void handle1();

    //行为2
    public abstract void handle2();
    public abstract void handle3();
}
