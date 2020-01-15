package com.jiankang.designismethod2.structurepatternpk.v2;

/*
 *@create by jiankang
 *@date 2020/1/2 time 10:03
 */

import com.jiankang.designismethod2.structurepatternpk.v1.IRunner;
import com.jiankang.designismethod2.structurepatternpk.v1.Runner;
import com.jiankang.designismethod2.structurepatternpk.v1.RunnerAgent;

public class Client {
    public static void main(String[] args) {
        IRunner liu = new Runner();
        liu=new RunnerWithJet(liu);
        liu.run();
    }
}
