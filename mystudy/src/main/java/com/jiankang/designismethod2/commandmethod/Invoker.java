package com.jiankang.designismethod2.commandmethod;

/*
 *@create by jiankang
 *@date 2019/11/18 time 20:48
 */

public class Invoker {
    //什么命令
    private Command command;

    //客户发出命令
    public void setCommand(Command command) {
        this.command = command;
    }

    //执行客户的命令
    public void action(){
        this.command.execute();
    }
}
