package com.jiankang.designismethod2.commandmethod.v1;

/*
 *@create by jiankang
 *@date 2019/11/18 time 21:09
 */

public class ConcreteCommand1 extends Command {

    //声明自己的默认接收者
    public ConcreteCommand1() {
        super(new ConcreteReciver1());

    }

    //设置新的接收者
    public ConcreteCommand1(Receiver receiver) {
        super(receiver);
    }

    //每一个具体的命令都必须实现一个命令
    @Override
    public void execute() {
        super.receiver.doSomething();
    }
}
