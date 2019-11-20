package com.jiankang.designismethod2.resposibilitychainmethod;

/*
 *@create by jiankang
 *@date 2019/11/20 time 9:54
 */

public class Son implements IHandler {
    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("母亲的请示是："+women.getRequest());
        System.out.println("儿子的答复是：同意");
    }
}
