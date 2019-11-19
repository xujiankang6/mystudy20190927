package com.jiankang.designismethod2.commandmethod.v1;

/*
 *@create by jiankang
 *@date 2019/11/18 time 21:09
 */

public class ConcreteCommand1 extends Command {
    //对哪个Receiver 类进行命令处理
    private Receiver receiver;

    //构造函数传递接收者
    public ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    //必须实现一个命令
    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
