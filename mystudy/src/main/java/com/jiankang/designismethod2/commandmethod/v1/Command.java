package com.jiankang.designismethod2.commandmethod.v1;

/*
 *@create by jiankang
 *@date 2019/11/18 time 21:08
 */

public abstract class Command {

    //定义一个子类的全局共享变量
    protected  final Receiver receiver;

    //实现类必须定义一个接受者
    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    //每个命令类都必须有一个执行命令的方法
    public abstract void execute();
}
