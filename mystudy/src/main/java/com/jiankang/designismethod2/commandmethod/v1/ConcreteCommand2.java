package com.jiankang.designismethod2.commandmethod.v1;

/*
 *@create by jiankang
 *@date 2019/11/18 time 21:15
 */

public class ConcreteCommand2 extends Command {
    //哪个Receiver类进行命令处理
    private Receiver receiver;

    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
