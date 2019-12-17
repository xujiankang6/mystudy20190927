package com.jiankang.designismethod2.builderpattern;

/*
 *@create by jiankang
 *@date 2019/11/11 time 15:52
 */

import java.util.ArrayList;

/**
 * 建造者模式
 * 将一个复杂对象的构建与它的表示分
 * 离，使得同样的构建过程可以创建不同的表示。
 * 1、封装性
 * 2、建造者独立，容易扩展
 * 3、便于控制细节风险
 */
public class Director {
    private ArrayList<String> sequence = new ArrayList();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    /*
    A奔驰车
     */
    public BenzModel getABenzModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    /*
    B奔驰车
     */
    public BenzModel getBBenzModel() {
        this.sequence.clear();
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    /*
     *C宝马
     */
    public BMWModel getCBMWModel(){
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }

    /*
    D宝马
     */
    public BMWModel getDBMWModel(){
        this.sequence.clear();
        this.sequence.add("start");
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }

}
