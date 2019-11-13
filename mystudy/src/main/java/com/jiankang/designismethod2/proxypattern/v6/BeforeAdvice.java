package com.jiankang.designismethod2.proxypattern.v6;

/*
 *@create by jiankang
 *@date 2019/11/13 time 18:26
 */

public class BeforeAdvice  implements IAdvice{

    @Override
    public void exec() {
        System.out.println("我是前置通知，我被执行了！");
    }
}
