package com.jiankang.designismethod2.commandmethod.v1;

/*
 *@create by jiankang
 *@date 2019/11/18 time 21:17
 */

public class Client {

    public static void main(String[] args) {
        //首先声明调用者Invoker
        Invoker invoker = new Invoker();
        //定义接收者
        Receiver receiver = new ConcreteReciver1();
        //定义一个发送给接收者的命令
        Command command =new ConcreteCommand1(receiver);
        //把命令交给调用者去执行

        invoker.setCommand(command);
        invoker.action();
    }
}
