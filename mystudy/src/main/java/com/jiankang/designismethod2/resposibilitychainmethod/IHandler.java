package com.jiankang.designismethod2.resposibilitychainmethod;

/*
 *@create by jiankang
 *@date 2019/11/20 time 9:50
 */

public interface IHandler {
    //一个女性要求逛街，你要处理这个请求
    public void HandleMessage(IWomen women);
}
