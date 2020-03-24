package com.jiankang.designismethod2.flyweightpattern.v2;

/*
 *@create by jiankang
 *@date 2019/12/24 time 19:54
 */

public class ConcreteFlyweight1 extends Flyweight {

    //接受外部状态
    public ConcreteFlyweight1(String extrinsic) {
        super(extrinsic);
    }

    //根据外部状态进行逻辑处理
    @Override
    public void operate() {
        //业务逻辑
    }
}
