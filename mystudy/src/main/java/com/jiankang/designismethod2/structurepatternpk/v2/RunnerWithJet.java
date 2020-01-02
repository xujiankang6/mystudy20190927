package com.jiankang.designismethod2.structurepatternpk.v2;

/*
 *@create by jiankang
 *@date 2020/1/2 time 10:01
 */

import com.jiankang.designismethod2.structurepatternpk.v1.IRunner;

public class RunnerWithJet implements IRunner {
    private IRunner runner;

    public RunnerWithJet(IRunner runner) {
        this.runner = runner;
    }

    @Override
    public void run() {
        getGirl();
        runner.run();
        getGood();


    }
    private  void getGirl(){
        System.out.println("找个女孩陪一下");
    }

    private void getGood(){
        System.out.println("那个女孩拥抱一下");
    }
}
