package com.jiankang.designismethod2.statuspattern.v2;

/*
 *@create by jiankang
 *@date 2019/12/9 time 21:30
 */

public class RunningState extends LiftState{
    @Override
    public void open() {
        // do nothing
    }

    @Override
    public void close() {
        //do nothing
    }

    @Override
    public void run() {
        System.out.println("电梯上下运行");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.getLiftState().stop();

    }
}
