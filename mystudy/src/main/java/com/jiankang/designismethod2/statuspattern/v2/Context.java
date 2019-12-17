package com.jiankang.designismethod2.statuspattern.v2;

/*
 *@create by jiankang
 *@date 2019/12/9 time 21:22
 */

public class Context {
    //定义所有电梯状态
    public final static OpenningState openningState = new OpenningState();
    public final static CloseingState closeingState = new CloseingState();
    public final static RunningState runningState = new RunningState();
    public final static StopingState stoppingState = new StopingState();

    //定义一个当前的电梯状态
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        //把当前的环境通知到各个实现类中
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }
}
