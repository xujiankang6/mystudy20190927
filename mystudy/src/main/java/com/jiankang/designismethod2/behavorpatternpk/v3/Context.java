package com.jiankang.designismethod2.behavorpatternpk.v3;

/*
 *@create by jiankang
 *@date 2020/1/6 time 20:05
 */

public class Context {
    private WorkAlgorithm algorithm;


    public void setAlgorithm(WorkAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public WorkAlgorithm getAlgorithm() {
        return algorithm;
    }

    public void work() {
        algorithm.work();
    }
}
