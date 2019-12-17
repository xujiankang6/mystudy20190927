package com.jiankang.designismethod2.commandmethod.v1;

/*
 *@create by jiankang
 *@date 2019/11/18 time 21:16
 */

public class Invoker {
    private Command command;

    //受气包，接受命令
    public void setCommand(Command command) {
        this.command = command;
    }

    //执行命令
    public void action() {
        this.command.execute();
    }
}
