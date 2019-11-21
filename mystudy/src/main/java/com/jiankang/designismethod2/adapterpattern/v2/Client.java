package com.jiankang.designismethod2.adapterpattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/21 time 18:04
 */

public class Client {
    public static void main(String[] args) {
        //原有的业务逻辑
        Target target = new ConcreteTarget();
        target.request();
        //现在增加了适配器角色后的业务逻辑
        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
