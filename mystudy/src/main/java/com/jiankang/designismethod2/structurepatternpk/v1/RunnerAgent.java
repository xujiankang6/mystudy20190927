package com.jiankang.designismethod2.structurepatternpk.v1;

/*
 *@create by jiankang
 *@date 2020/1/2 time 9:53
 */

import java.util.Random;

public class RunnerAgent implements IRunner {
    private IRunner runner;

    public RunnerAgent(IRunner runner) {
        this.runner = runner;
    }

    @Override
    public void run() {
        Random rand = new Random();
        if(rand.nextBoolean()){
            System.out.println("agent agree run");
            runner.run();
        }else{
            System.out.println("agent don't agree run");
        }

    }
}
