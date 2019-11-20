package com.jiankang.designismethod2.resposibilitychainmethod.v3;

/*
 *@create by jiankang
 *@date 2019/11/20 time 14:03
 */

public class ConcreteHandler1 extends Handler {
    @Override
    protected Level getHandlerLevel() {
        //定义自己的处理级别
        return new Level();
    }

    @Override
    protected Response echo(Request request) {
        //定义自己的处理逻辑
        return new Response();
    }
}
