package com.jiankang.designismethod2.structurepatternpk.v1;

/*
 *@create by jiankang
 *@date 2020/1/2 time 9:56
 */

public class Client {
    public static void main(String[] args) {
        IRunner lui = new Runner();
        IRunner agent = new RunnerAgent(lui);
        agent.run();
    }
}
