package com.jiankang.designismethod2.bridgepattern.v3;

/*
 *@create by jiankang
 *@date 2019/12/26 time 20:00
 */


public class ClothesCorp extends Corp {

    public ClothesCorp(Product product) {
        super(product);
    }


    public void makeMoney() {
        super.makeMoney();
        System.out.println("服装公司挣小钱");
    }
}
