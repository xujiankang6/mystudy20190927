package com.jiankang.designismethod2.statuspattern.v1;

/*
 *@create by jiankang
 *@date 2019/12/9 time 20:53
 */

public interface ILift {
    //电梯的四个状态
    public final static int OPENING_STATE = 1;
    public final static int CLOSE_STATE = 2;
    public final static int RUNNING_STATE = 3;
    public final static int STOPPING_STATE = 4;

    //设置电梯的状态
    public void setState(int state);

    public void open();

    public void close();

    public void run();

    public void stop();
}
