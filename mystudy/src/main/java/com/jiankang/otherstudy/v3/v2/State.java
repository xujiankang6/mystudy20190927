package com.jiankang.otherstudy.v3.v2;

/**
 * State
 *
 * @author jiankang.xu
 * @date 2020/3/14
 */
public abstract class State {
    protected Context context;
    protected State nextState;

    public void setContext(Context context) {
        this.context = context;
    }

    abstract void action();

}
