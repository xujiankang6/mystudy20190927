package com.jiankang.designismethod2.bridgepattern.v3;

/*
 *@create by jiankang
 *@date 2019/12/26 time 20:23
 */

public class ShanZhaiCorp extends Corp {
    public ShanZhaiCorp(Product product) {
        super(product);
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("我挣钱了");
    }
}
