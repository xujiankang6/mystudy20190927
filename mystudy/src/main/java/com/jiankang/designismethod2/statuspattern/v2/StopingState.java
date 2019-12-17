package com.jiankang.designismethod2.statuspattern.v2;

/*
 *@create by jiankang
 *@date 2019/12/9 time 21:28
 */

public class StopingState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);
        super.context.getLiftState().open();

    }

    @Override
    public void close() {
        //do nothing
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了");
    }
}
