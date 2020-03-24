package com.jiankang.designismethod2.bridgepattern.v3;

/*
 *@create by jiankang
 *@date 2019/12/26 time 19:58
 */


public class HouseCorp extends Corp {


    public HouseCorp(Product product) {
        super(product);
    }


    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司挣大钱了");
    }
}
