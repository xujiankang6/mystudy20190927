package com.jiankang.designismethod2.commandmethod;

/*
 *@create by jiankang
 *@date 2019/11/18 time 20:49
 */

public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Command  command = new AddRequirementCommand();
        invoker.setCommand(command);
        invoker.action();
        System.out.println("------------客户要求删除一个页面---------------");
        Command command1=new DeletePageCommand();
        invoker.setCommand(command1);
        invoker.action();
    }
}
