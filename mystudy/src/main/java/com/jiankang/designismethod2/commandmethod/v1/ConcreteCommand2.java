package com.jiankang.designismethod2.commandmethod.v1;

/*
 *@create by jiankang
 *@date 2019/11/18 time 21:15
 */

public class ConcreteCommand2 extends Command {


    public ConcreteCommand2() {
        super(new ConcreteReciver2());
    }

    public ConcreteCommand2(Receiver receiver1) {
        super(receiver1);
    }

    //每个具体的名利都必须实现一个命令
    @Override
    public void execute() {
        //业务处理
        super.receiver.doSomething();
    }
}
