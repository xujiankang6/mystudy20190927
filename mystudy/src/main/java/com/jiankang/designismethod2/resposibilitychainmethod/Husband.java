package com.jiankang.designismethod2.resposibilitychainmethod;

/*
 *@create by jiankang
 *@date 2019/11/20 time 9:53
 */

public class Husband implements IHandler {
    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("妻子的请示是："+women.getRequest());
        System.out.println("丈夫的答复是：同意");
    }
}
