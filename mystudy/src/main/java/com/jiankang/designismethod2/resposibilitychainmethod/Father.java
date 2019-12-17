package com.jiankang.designismethod2.resposibilitychainmethod;

/*
 *@create by jiankang
 *@date 2019/11/20 time 9:51
 */

public class Father implements IHandler {
    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("女儿的请示是：" + women.getRequest());
        System.out.println("父亲的答复是:同意");
    }
}
