package com.jiankang.designismethod2.statuspattern.v2;

/*
 *@create by jiankang
 *@date 2019/12/9 time 21:16
 */


public abstract class LiftState {
    //定义一个环境角色
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }


    public abstract void open();

    public abstract void close();

    public abstract void run();

    public abstract void stop();

}
